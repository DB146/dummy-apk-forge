package Y5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f11968a;

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f11969b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v1[] f11970c;

    /* JADX WARN: Type inference failed for: r0v0, types: [Y5.v1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Y5.v1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Y5.v1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [Y5.v1, java.lang.Enum] */
    static {
        ?? r02 = new Enum("CONSENT", 0);
        f11968a = r02;
        ?? r12 = new Enum("LEGITIMATE_INTEREST", 1);
        ?? r22 = new Enum("FLEXIBLE_CONSENT", 2);
        ?? r32 = new Enum("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f11969b = r32;
        f11970c = new v1[]{r02, r12, r22, r32};
    }

    public static v1[] values() {
        return (v1[]) f11970c.clone();
    }
}
