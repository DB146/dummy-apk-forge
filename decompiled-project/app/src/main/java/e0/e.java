package e0;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f16660a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f16661b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f16662c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e0.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e0.e] */
    static {
        ?? r02 = new Enum("VIEW_APPEAR", 0);
        f16660a = r02;
        ?? r12 = new Enum("VIEW_DISAPPEAR", 1);
        f16661b = r12;
        e[] eVarArr = {r02, r12};
        f16662c = eVarArr;
        x.k(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f16662c.clone();
    }
}
