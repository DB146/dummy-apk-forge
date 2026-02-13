package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Q.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0507o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0507o0 f8474a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0507o0 f8475b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0507o0 f8476c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0507o0 f8477d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0507o0 f8478e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0507o0 f8479f;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC0507o0[] f8480u;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Q.o0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Q.o0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Q.o0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, Q.o0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, Q.o0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, Q.o0] */
    static {
        ?? r02 = new Enum("ShutDown", 0);
        f8474a = r02;
        ?? r12 = new Enum("ShuttingDown", 1);
        f8475b = r12;
        ?? r22 = new Enum("Inactive", 2);
        f8476c = r22;
        ?? r32 = new Enum("InactivePendingWork", 3);
        f8477d = r32;
        ?? r42 = new Enum("Idle", 4);
        f8478e = r42;
        ?? r52 = new Enum("PendingWork", 5);
        f8479f = r52;
        EnumC0507o0[] enumC0507o0Arr = {r02, r12, r22, r32, r42, r52};
        f8480u = enumC0507o0Arr;
        Z9.x.k(enumC0507o0Arr);
    }

    public static EnumC0507o0 valueOf(String str) {
        return (EnumC0507o0) Enum.valueOf(EnumC0507o0.class, str);
    }

    public static EnumC0507o0[] values() {
        return (EnumC0507o0[]) f8480u.clone();
    }
}
