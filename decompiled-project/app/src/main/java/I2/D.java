package I2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public static final D f5022a;

    /* renamed from: b, reason: collision with root package name */
    public static final D f5023b;

    /* renamed from: c, reason: collision with root package name */
    public static final D f5024c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ D[] f5025d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, I2.D] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, I2.D] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, I2.D] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        f5022a = r02;
        ?? r12 = new Enum("TRUNCATE", 1);
        f5023b = r12;
        ?? r22 = new Enum("WRITE_AHEAD_LOGGING", 2);
        f5024c = r22;
        D[] dArr = {r02, r12, r22};
        f5025d = dArr;
        Z9.x.k(dArr);
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) f5025d.clone();
    }
}
