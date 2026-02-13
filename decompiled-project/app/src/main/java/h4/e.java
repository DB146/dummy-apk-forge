package h4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f17734a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f17735b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f17736c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f17737d;

    /* JADX WARN: Type inference failed for: r0v0, types: [h4.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h4.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h4.e, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f17734a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f17735b = r12;
        ?? r22 = new Enum("DEVICE_CHARGING", 2);
        f17736c = r22;
        f17737d = new e[]{r02, r12, r22};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f17737d.clone();
    }
}
