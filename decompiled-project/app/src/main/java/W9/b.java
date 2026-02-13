package W9;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10855a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f10856b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f10857c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, W9.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, W9.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, W9.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, W9.b] */
    static {
        ?? r02 = new Enum("IPTV", 0);
        f10855a = r02;
        ?? r12 = new Enum("TV", 1);
        f10856b = r12;
        b[] bVarArr = {r02, r12, new Enum("RADIO", 2), new Enum("FOOTBALL", 3)};
        f10857c = bVarArr;
        x.k(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10857c.clone();
    }
}
