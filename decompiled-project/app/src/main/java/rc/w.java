package rc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public class w extends o {
    @Override // rc.o
    public final v F(z zVar) {
        return new v(false, new RandomAccessFile(zVar.i(), "r"));
    }

    @Override // rc.o
    public final H K(z file) {
        kotlin.jvm.internal.l.e(file, "file");
        return new C1960d(1, new FileInputStream(file.i()), J.f23942d);
    }

    public void P(z zVar, z target) {
        kotlin.jvm.internal.l.e(target, "target");
        if (zVar.i().renameTo(target.i())) {
            return;
        }
        throw new IOException("failed to move " + zVar + " to " + target);
    }

    public final void T(z path) {
        kotlin.jvm.internal.l.e(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File i7 = path.i();
        if (i7.delete() || !i7.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // rc.o
    public I2.A n(z path) {
        kotlin.jvm.internal.l.e(path, "path");
        File i7 = path.i();
        boolean isFile = i7.isFile();
        boolean isDirectory = i7.isDirectory();
        long lastModified = i7.lastModified();
        long length = i7.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || i7.exists()) {
            return new I2.A(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
