package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f25625a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f25626b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f25627c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x[] f25628d;

    /* JADX WARN: Type inference failed for: r0v0, types: [w.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [w.x, java.lang.Enum] */
    static {
        ?? r02 = new Enum("PreEnter", 0);
        f25625a = r02;
        ?? r12 = new Enum("Visible", 1);
        f25626b = r12;
        ?? r22 = new Enum("PostExit", 2);
        f25627c = r22;
        x[] xVarArr = {r02, r12, r22};
        f25628d = xVarArr;
        Z9.x.k(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f25628d.clone();
    }
}
