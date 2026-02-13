package Ia;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d[] f5341a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Ia.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Ia.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Ia.d] */
    static {
        d[] dVarArr = {new Enum("ALL", 0), new Enum("WATCH_NEXT", 1), new Enum("FAVOURITE", 2)};
        f5341a = dVarArr;
        x.k(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5341a.clone();
    }
}
