package e0;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1074a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1074a f16633a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1074a f16634b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1074a[] f16635c;

    /* JADX WARN: Type inference failed for: r0v0, types: [e0.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [e0.a, java.lang.Enum] */
    static {
        ?? r02 = new Enum("SHOW_ORIGINAL", 0);
        f16633a = r02;
        ?? r12 = new Enum("SHOW_TRANSLATED", 1);
        f16634b = r12;
        EnumC1074a[] enumC1074aArr = {r02, r12};
        f16635c = enumC1074aArr;
        x.k(enumC1074aArr);
    }

    public static EnumC1074a valueOf(String str) {
        return (EnumC1074a) Enum.valueOf(EnumC1074a.class, str);
    }

    public static EnumC1074a[] values() {
        return (EnumC1074a[]) f16635c.clone();
    }
}
