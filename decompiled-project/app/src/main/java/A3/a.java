package A3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f342a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f343b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f344c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f345d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f346e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f347f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, A3.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, A3.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, A3.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, A3.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, A3.a] */
    static {
        ?? r02 = new Enum("LOCAL", 0);
        f342a = r02;
        ?? r12 = new Enum("REMOTE", 1);
        f343b = r12;
        ?? r22 = new Enum("DATA_DISK_CACHE", 2);
        f344c = r22;
        ?? r32 = new Enum("RESOURCE_DISK_CACHE", 3);
        f345d = r32;
        ?? r42 = new Enum("MEMORY_CACHE", 4);
        f346e = r42;
        f347f = new a[]{r02, r12, r22, r32, r42};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f347f.clone();
    }
}
