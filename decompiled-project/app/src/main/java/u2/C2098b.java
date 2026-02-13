package u2;

import java.io.File;
import java.io.FileFilter;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2098b implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
