package Db;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f3352a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f3353b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Db.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Db.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Db.h] */
    static {
        ?? r02 = new Enum("SYNCHRONIZED", 0);
        ?? r12 = new Enum("PUBLICATION", 1);
        ?? r22 = new Enum("NONE", 2);
        f3352a = r22;
        h[] hVarArr = {r02, r12, r22};
        f3353b = hVarArr;
        x.k(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3353b.clone();
    }
}
