package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2076f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2076f f24757a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2076f f24758b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2076f f24759c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2076f[] f24760d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u0.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u0.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u0.f] */
    static {
        ?? r02 = new Enum("Initial", 0);
        f24757a = r02;
        ?? r12 = new Enum("Main", 1);
        f24758b = r12;
        ?? r22 = new Enum("Final", 2);
        f24759c = r22;
        EnumC2076f[] enumC2076fArr = {r02, r12, r22};
        f24760d = enumC2076fArr;
        Z9.x.k(enumC2076fArr);
    }

    public static EnumC2076f valueOf(String str) {
        return (EnumC2076f) Enum.valueOf(EnumC2076f.class, str);
    }

    public static EnumC2076f[] values() {
        return (EnumC2076f[]) f24760d.clone();
    }
}
