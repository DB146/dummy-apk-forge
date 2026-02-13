package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2234d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2234d f26056a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2234d f26057b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2234d[] f26058c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x.d] */
    static {
        ?? r02 = new Enum("BoundReached", 0);
        f26056a = r02;
        ?? r12 = new Enum("Finished", 1);
        f26057b = r12;
        EnumC2234d[] enumC2234dArr = {r02, r12};
        f26058c = enumC2234dArr;
        Z9.x.k(enumC2234dArr);
    }

    public static EnumC2234d valueOf(String str) {
        return (EnumC2234d) Enum.valueOf(EnumC2234d.class, str);
    }

    public static EnumC2234d[] values() {
        return (EnumC2234d[]) f26058c.clone();
    }
}
