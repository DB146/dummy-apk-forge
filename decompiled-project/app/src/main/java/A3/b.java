package A3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f348a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f349b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f350c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f351d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, A3.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, A3.b] */
    static {
        ?? r02 = new Enum("PREFER_ARGB_8888", 0);
        f348a = r02;
        ?? r12 = new Enum("PREFER_RGB_565", 1);
        f349b = r12;
        f351d = new b[]{r02, r12};
        f350c = r02;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f351d.clone();
    }
}
