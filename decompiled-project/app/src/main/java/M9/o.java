package M9;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f6888a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f6889b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f6890c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f6891d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o[] f6892e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, M9.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, M9.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, M9.o] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, M9.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, M9.o] */
    static {
        ?? r02 = new Enum("PENDING", 0);
        ?? r12 = new Enum("RUNNING", 1);
        f6888a = r12;
        ?? r22 = new Enum("ERROR", 2);
        f6889b = r22;
        ?? r32 = new Enum("SUCCESS", 3);
        f6890c = r32;
        ?? r42 = new Enum("DISPOSED", 4);
        f6891d = r42;
        o[] oVarArr = {r02, r12, r22, r32, r42};
        f6892e = oVarArr;
        x.k(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f6892e.clone();
    }
}
