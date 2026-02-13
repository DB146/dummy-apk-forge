package X1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10903a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f10904b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f10905c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f10906d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f10907e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f10908f;

    /* JADX INFO: Fake field, exist only in values array */
    b EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, X1.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, X1.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, X1.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, X1.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, X1.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, X1.b] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, X1.b] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, X1.b] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, X1.b] */
    static {
        ?? r02 = new Enum("PENALTY_LOG", 0);
        ?? r12 = new Enum("PENALTY_DEATH", 1);
        ?? r22 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        f10903a = r22;
        ?? r32 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        f10904b = r32;
        ?? r42 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f10905c = r42;
        ?? r52 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        ?? r62 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        f10906d = r62;
        ?? r72 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        ?? r82 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f10907e = r82;
        f10908f = new b[]{r02, r12, r22, r32, r42, r52, r62, r72, r82};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10908f.clone();
    }
}
