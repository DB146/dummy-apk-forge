package N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f7113a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f7114b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f7115c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f7116d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f7117e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x[] f7118f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N.x] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, N.x] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, N.x] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, N.x] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, N.x] */
    static {
        ?? r02 = new Enum("TopBar", 0);
        f7113a = r02;
        ?? r12 = new Enum("MainContent", 1);
        f7114b = r12;
        ?? r22 = new Enum("Snackbar", 2);
        f7115c = r22;
        ?? r32 = new Enum("Fab", 3);
        f7116d = r32;
        ?? r42 = new Enum("BottomBar", 4);
        f7117e = r42;
        f7118f = new x[]{r02, r12, r22, r32, r42};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f7118f.clone();
    }
}
