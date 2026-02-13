package W9;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f10890a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f10891b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f10892c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i[] f10893d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, W9.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, W9.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, W9.i] */
    static {
        ?? r02 = new Enum("TV", 0);
        f10890a = r02;
        ?? r12 = new Enum("RADIO", 1);
        f10891b = r12;
        ?? r22 = new Enum("IPTV", 2);
        f10892c = r22;
        i[] iVarArr = {r02, r12, r22};
        f10893d = iVarArr;
        x.k(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f10893d.clone();
    }
}
