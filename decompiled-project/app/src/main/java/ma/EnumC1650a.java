package ma;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ma.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1650a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1650a f20812a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1650a[] f20813b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ma.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ma.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ma.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ma.a] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ma.a] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ma.a] */
    static {
        ?? r02 = new Enum("VeBo", 0);
        ?? r12 = new Enum("Phut91", 1);
        f20812a = r12;
        EnumC1650a[] enumC1650aArr = {r02, r12, new Enum("XoiLac10", 2), new Enum("BinhLuan91", 3), new Enum("MiTom", 4), new Enum("VTV", 5)};
        f20813b = enumC1650aArr;
        x.k(enumC1650aArr);
    }

    public static EnumC1650a valueOf(String str) {
        return (EnumC1650a) Enum.valueOf(EnumC1650a.class, str);
    }

    public static EnumC1650a[] values() {
        return (EnumC1650a[]) f20813b.clone();
    }
}
