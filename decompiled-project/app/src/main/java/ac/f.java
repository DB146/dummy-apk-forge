package ac;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f[] f12834a;

    static {
        f[] fVarArr = {new f("IGNORE_CASE", 0, 2), new f("MULTILINE", 1, 8), new f("LITERAL", 2, 16), new f("UNIX_LINES", 3, 1), new f("COMMENTS", 4, 4), new f("DOT_MATCHES_ALL", 5, 32), new f("CANON_EQ", 6, 128)};
        f12834a = fVarArr;
        x.k(fVarArr);
    }

    public f(String str, int i7, int i10) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f12834a.clone();
    }
}
