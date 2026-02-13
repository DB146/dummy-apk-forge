package Ka;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6213a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f6214b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f6215c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f6216d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f6217e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Ka.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Ka.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Ka.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, Ka.a] */
    static {
        ?? r02 = new Enum("RIGHT", 0);
        f6213a = r02;
        ?? r12 = new Enum("LEFT", 1);
        f6214b = r12;
        ?? r22 = new Enum("ALL", 2);
        f6215c = r22;
        ?? r32 = new Enum("NONE", 3);
        f6216d = r32;
        a[] aVarArr = {r02, r12, r22, r32};
        f6217e = aVarArr;
        x.k(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6217e.clone();
    }
}
