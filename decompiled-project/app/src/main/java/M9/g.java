package M9;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f6859a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f6860b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f6861c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, M9.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, M9.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, M9.g] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, M9.g] */
    static {
        ?? r02 = new Enum("PENDING", 0);
        f6859a = r02;
        ?? r12 = new Enum("RUNNING", 1);
        f6860b = r12;
        g[] gVarArr = {r02, r12, new Enum("DONE", 2), new Enum("ERROR", 3)};
        f6861c = gVarArr;
        x.k(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f6861c.clone();
    }
}
