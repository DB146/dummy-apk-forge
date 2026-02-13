package l2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1474s {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1474s f19227a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1474s f19228b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1474s f19229c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1474s f19230d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1474s f19231e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1474s[] f19232f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l2.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l2.s] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l2.s] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l2.s] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, l2.s] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f19227a = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f19228b = r12;
        ?? r22 = new Enum("CREATED", 2);
        f19229c = r22;
        ?? r32 = new Enum("STARTED", 3);
        f19230d = r32;
        ?? r42 = new Enum("RESUMED", 4);
        f19231e = r42;
        EnumC1474s[] enumC1474sArr = {r02, r12, r22, r32, r42};
        f19232f = enumC1474sArr;
        Z9.x.k(enumC1474sArr);
    }

    public static EnumC1474s valueOf(String str) {
        return (EnumC1474s) Enum.valueOf(EnumC1474s.class, str);
    }

    public static EnumC1474s[] values() {
        return (EnumC1474s[]) f19232f.clone();
    }
}
