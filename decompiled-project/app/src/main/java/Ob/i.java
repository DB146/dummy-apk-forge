package Ob;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f7555a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f7556b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Ob.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Ob.i] */
    static {
        ?? r02 = new Enum("TOP_DOWN", 0);
        f7555a = r02;
        i[] iVarArr = {r02, new Enum("BOTTOM_UP", 1)};
        f7556b = iVarArr;
        x.k(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f7556b.clone();
    }
}
