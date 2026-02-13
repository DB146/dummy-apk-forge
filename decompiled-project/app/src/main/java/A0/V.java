package A0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f125a;

    /* renamed from: b, reason: collision with root package name */
    public static final V f126b;

    /* renamed from: c, reason: collision with root package name */
    public static final V f127c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ V[] f128d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, A0.V] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, A0.V] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, A0.V] */
    static {
        ?? r02 = new Enum("IsPlacedInLookahead", 0);
        f125a = r02;
        ?? r12 = new Enum("IsPlacedInApproach", 1);
        f126b = r12;
        ?? r22 = new Enum("IsNotPlaced", 2);
        f127c = r22;
        V[] vArr = {r02, r12, r22};
        f128d = vArr;
        Z9.x.k(vArr);
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f128d.clone();
    }
}
