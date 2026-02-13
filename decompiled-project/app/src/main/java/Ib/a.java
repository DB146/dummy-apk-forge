package Ib;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5345a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f5346b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f5347c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f5348d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Ib.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Ib.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Ib.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f5345a = r02;
        ?? r12 = new Enum("UNDECIDED", 1);
        f5346b = r12;
        ?? r22 = new Enum("RESUMED", 2);
        f5347c = r22;
        a[] aVarArr = {r02, r12, r22};
        f5348d = aVarArr;
        x.k(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5348d.clone();
    }
}
