package Z0;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f12130a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l[] f12131b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Z0.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Z0.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Z0.l] */
    static {
        ?? r02 = new Enum("Inherit", 0);
        f12130a = r02;
        l[] lVarArr = {r02, new Enum("SecureOn", 1), new Enum("SecureOff", 2)};
        f12131b = lVarArr;
        x.k(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f12131b.clone();
    }
}
