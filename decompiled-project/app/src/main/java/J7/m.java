package J7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f5590a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f5591b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f5592c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f5593d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f5594e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m[] f5595f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, J7.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, J7.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, J7.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, J7.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, J7.m] */
    static {
        ?? r02 = new Enum("Disconnected", 0);
        f5590a = r02;
        ?? r12 = new Enum("GettingToken", 1);
        f5591b = r12;
        ?? r22 = new Enum("Connecting", 2);
        f5592c = r22;
        ?? r32 = new Enum("Authenticating", 3);
        f5593d = r32;
        ?? r42 = new Enum("Connected", 4);
        f5594e = r42;
        f5595f = new m[]{r02, r12, r22, r32, r42};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f5595f.clone();
    }
}
