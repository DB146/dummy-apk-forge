package A0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f20a;

    /* renamed from: b, reason: collision with root package name */
    public static final F f21b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f22c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f23d;

    /* renamed from: e, reason: collision with root package name */
    public static final F f24e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ F[] f25f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, A0.F] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, A0.F] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, A0.F] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, A0.F] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, A0.F] */
    static {
        ?? r02 = new Enum("Measuring", 0);
        f20a = r02;
        ?? r12 = new Enum("LookaheadMeasuring", 1);
        f21b = r12;
        ?? r22 = new Enum("LayingOut", 2);
        f22c = r22;
        ?? r32 = new Enum("LookaheadLayingOut", 3);
        f23d = r32;
        ?? r42 = new Enum("Idle", 4);
        f24e = r42;
        F[] fArr = {r02, r12, r22, r32, r42};
        f25f = fArr;
        Z9.x.k(fArr);
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f25f.clone();
    }
}
