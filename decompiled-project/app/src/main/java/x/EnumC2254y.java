package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2254y {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2254y f26162a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2254y[] f26163b;

    /* JADX WARN: Type inference failed for: r0v0, types: [x.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [x.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [x.y, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Default", 0);
        f26162a = r02;
        EnumC2254y[] enumC2254yArr = {r02, new Enum("UserInput", 1), new Enum("PreventUserInput", 2)};
        f26163b = enumC2254yArr;
        Z9.x.k(enumC2254yArr);
    }

    public static EnumC2254y valueOf(String str) {
        return (EnumC2254y) Enum.valueOf(EnumC2254y.class, str);
    }

    public static EnumC2254y[] values() {
        return (EnumC2254y[]) f26163b.clone();
    }
}
