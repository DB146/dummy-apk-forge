package Fa;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f4179a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Fa.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Fa.a] */
    static {
        a[] aVarArr = {new Enum("Home", 0), new Enum("Player", 1)};
        f4179a = aVarArr;
        x.k(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4179a.clone();
    }
}
