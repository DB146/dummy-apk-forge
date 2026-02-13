package v0;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2125b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2125b f24927a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2125b f24928b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2125b[] f24929c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v0.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v0.b] */
    static {
        ?? r02 = new Enum("Lsq2", 0);
        f24927a = r02;
        ?? r12 = new Enum("Impulse", 1);
        f24928b = r12;
        EnumC2125b[] enumC2125bArr = {r02, r12};
        f24929c = enumC2125bArr;
        x.k(enumC2125bArr);
    }

    public static EnumC2125b valueOf(String str) {
        return (EnumC2125b) Enum.valueOf(EnumC2125b.class, str);
    }

    public static EnumC2125b[] values() {
        return (EnumC2125b[]) f24929c.clone();
    }
}
