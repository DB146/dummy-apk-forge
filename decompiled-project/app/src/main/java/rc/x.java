package rc;

import Y5.C0660y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: classes2.dex */
public final class x extends w {
    public static Long U(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // rc.w
    public final void P(z zVar, z target) {
        kotlin.jvm.internal.l.e(target, "target");
        try {
            Files.move(zVar.j(), target.j(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        }
    }

    @Override // rc.w, rc.o
    public final I2.A n(z path) {
        z zVar;
        kotlin.jvm.internal.l.e(path, "path");
        Path j = path.j();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(j, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(j) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = z.f24006b;
                zVar = C0660y.a(readSymbolicLink.toString(), false);
            } else {
                zVar = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long U8 = creationTime != null ? U(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long U10 = lastModifiedTime != null ? U(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new I2.A(isRegularFile, isDirectory, zVar, valueOf, U8, U10, lastAccessTime != null ? U(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // rc.w
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
