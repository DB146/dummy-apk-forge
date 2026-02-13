package V0;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f9982a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f9983b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f9984c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, V0.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, V0.l] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f9982a = r02;
        ?? r12 = new Enum("Rtl", 1);
        f9983b = r12;
        l[] lVarArr = {r02, r12};
        f9984c = lVarArr;
        x.k(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f9984c.clone();
    }
}
