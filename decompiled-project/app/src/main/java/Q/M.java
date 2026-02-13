package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f8329a;

    /* renamed from: b, reason: collision with root package name */
    public static final M f8330b;

    /* renamed from: c, reason: collision with root package name */
    public static final M f8331c;

    /* renamed from: d, reason: collision with root package name */
    public static final M f8332d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ M[] f8333e;

    /* JADX WARN: Type inference failed for: r0v0, types: [Q.M, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Q.M, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Q.M, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Q.M, java.lang.Enum] */
    static {
        ?? r02 = new Enum("IGNORED", 0);
        f8329a = r02;
        ?? r12 = new Enum("SCHEDULED", 1);
        f8330b = r12;
        ?? r22 = new Enum("DEFERRED", 2);
        f8331c = r22;
        ?? r32 = new Enum("IMMINENT", 3);
        f8332d = r32;
        M[] mArr = {r02, r12, r22, r32};
        f8333e = mArr;
        Z9.x.k(mArr);
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f8333e.clone();
    }
}
