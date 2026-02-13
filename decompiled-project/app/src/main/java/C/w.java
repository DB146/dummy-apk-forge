package C;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f2442a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f2443b;

    /* renamed from: c, reason: collision with root package name */
    public static final w f2444c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w[] f2445d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, C.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, C.w] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, C.w] */
    static {
        ?? r02 = new Enum("Vertical", 0);
        f2442a = r02;
        ?? r12 = new Enum("Horizontal", 1);
        f2443b = r12;
        ?? r22 = new Enum("Both", 2);
        f2444c = r22;
        w[] wVarArr = {r02, r12, r22};
        f2445d = wVarArr;
        Z9.x.k(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f2445d.clone();
    }
}
