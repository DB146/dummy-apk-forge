package h0;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1228o implements InterfaceC1227n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1228o f17627a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1228o f17628b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1228o f17629c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1228o f17630d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1228o[] f17631e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h0.o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h0.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h0.o] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, h0.o] */
    static {
        ?? r02 = new Enum("Active", 0);
        f17627a = r02;
        ?? r12 = new Enum("ActiveParent", 1);
        f17628b = r12;
        ?? r22 = new Enum("Captured", 2);
        f17629c = r22;
        ?? r32 = new Enum("Inactive", 3);
        f17630d = r32;
        EnumC1228o[] enumC1228oArr = {r02, r12, r22, r32};
        f17631e = enumC1228oArr;
        x.k(enumC1228oArr);
    }

    public static EnumC1228o valueOf(String str) {
        return (EnumC1228o) Enum.valueOf(EnumC1228o.class, str);
    }

    public static EnumC1228o[] values() {
        return (EnumC1228o[]) f17631e.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                throw new Db.d(1);
            }
        }
        return false;
    }
}
