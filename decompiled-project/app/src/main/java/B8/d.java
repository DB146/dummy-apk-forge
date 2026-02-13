package B8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2229a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f2230b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f2231c;

    /* JADX WARN: Type inference failed for: r0v0, types: [B8.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [B8.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [B8.d, java.lang.Enum] */
    static {
        ?? r02 = new Enum("CRASHLYTICS", 0);
        f2229a = r02;
        ?? r12 = new Enum("PERFORMANCE", 1);
        f2230b = r12;
        f2231c = new d[]{r02, r12, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2231c.clone();
    }
}
