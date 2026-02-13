package N6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: N6.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC0421a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f7269a;

    /* renamed from: b, reason: collision with root package name */
    public static final Z f7270b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC0421a0[] f7271c;

    static {
        Y y10 = new Y();
        f7269a = y10;
        Z z8 = new Z();
        f7270b = z8;
        f7271c = new EnumC0421a0[]{y10, z8};
    }

    public static EnumC0421a0 valueOf(String str) {
        return (EnumC0421a0) Enum.valueOf(EnumC0421a0.class, str);
    }

    public static EnumC0421a0[] values() {
        return (EnumC0421a0[]) f7271c.clone();
    }

    public abstract M6.h a();
}
