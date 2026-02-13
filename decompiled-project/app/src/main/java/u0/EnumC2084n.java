package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2084n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2084n f24786a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2084n f24787b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2084n f24788c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2084n[] f24789d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u0.n] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u0.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u0.n] */
    static {
        ?? r02 = new Enum("Unknown", 0);
        f24786a = r02;
        ?? r12 = new Enum("Dispatching", 1);
        f24787b = r12;
        ?? r22 = new Enum("NotDispatching", 2);
        f24788c = r22;
        EnumC2084n[] enumC2084nArr = {r02, r12, r22};
        f24789d = enumC2084nArr;
        Z9.x.k(enumC2084nArr);
    }

    public static EnumC2084n valueOf(String str) {
        return (EnumC2084n) Enum.valueOf(EnumC2084n.class, str);
    }

    public static EnumC2084n[] values() {
        return (EnumC2084n[]) f24789d.clone();
    }
}
