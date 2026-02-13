package I2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: I2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0329s {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0329s f5195a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0329s f5196b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0329s f5197c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0329s[] f5198d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, I2.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, I2.s] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, I2.s] */
    static {
        ?? r02 = new Enum("NO_OP", 0);
        f5195a = r02;
        ?? r12 = new Enum("ADD", 1);
        f5196b = r12;
        ?? r22 = new Enum("REMOVE", 2);
        f5197c = r22;
        EnumC0329s[] enumC0329sArr = {r02, r12, r22};
        f5198d = enumC0329sArr;
        Z9.x.k(enumC0329sArr);
    }

    public static EnumC0329s valueOf(String str) {
        return (EnumC0329s) Enum.valueOf(EnumC0329s.class, str);
    }

    public static EnumC0329s[] values() {
        return (EnumC0329s[]) f5198d.clone();
    }
}
