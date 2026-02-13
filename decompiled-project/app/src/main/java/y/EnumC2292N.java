package y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2292N {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2292N f26416a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2292N f26417b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2292N[] f26418c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y.N] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y.N] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y.N] */
    static {
        ?? r02 = new Enum("Default", 0);
        f26416a = r02;
        ?? r12 = new Enum("UserInput", 1);
        f26417b = r12;
        EnumC2292N[] enumC2292NArr = {r02, r12, new Enum("PreventUserInput", 2)};
        f26418c = enumC2292NArr;
        Z9.x.k(enumC2292NArr);
    }

    public static EnumC2292N valueOf(String str) {
        return (EnumC2292N) Enum.valueOf(EnumC2292N.class, str);
    }

    public static EnumC2292N[] values() {
        return (EnumC2292N[]) f26418c.clone();
    }
}
