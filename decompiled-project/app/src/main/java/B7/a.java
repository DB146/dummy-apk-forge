package B7;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2200a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f2200a) {
            case 0:
                return str.startsWith("event");
            case 1:
                return str.startsWith("event") && !str.endsWith("_");
            case 2:
                return str.startsWith("aqs.");
            default:
                return str.startsWith(".ae");
        }
    }
}
