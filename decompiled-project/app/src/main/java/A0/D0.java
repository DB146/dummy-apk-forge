package A0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final D0 f16a;

    /* renamed from: b, reason: collision with root package name */
    public static final D0 f17b;

    /* renamed from: c, reason: collision with root package name */
    public static final D0 f18c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ D0[] f19d;

    /* JADX WARN: Type inference failed for: r0v0, types: [A0.D0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [A0.D0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [A0.D0, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ContinueTraversal", 0);
        f16a = r02;
        ?? r12 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        f17b = r12;
        ?? r22 = new Enum("CancelTraversal", 2);
        f18c = r22;
        D0[] d0Arr = {r02, r12, r22};
        f19d = d0Arr;
        Z9.x.k(d0Arr);
    }

    public static D0 valueOf(String str) {
        return (D0) Enum.valueOf(D0.class, str);
    }

    public static D0[] values() {
        return (D0[]) f19d.clone();
    }
}
