package Y3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f11149a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f11150b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f11151c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f11152d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Y3.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Y3.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Y3.d] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f11149a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f11150b = r12;
        ?? r22 = new Enum("HIGHEST", 2);
        f11151c = r22;
        f11152d = new d[]{r02, r12, r22};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f11152d.clone();
    }
}
