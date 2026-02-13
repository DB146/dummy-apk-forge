package Yb;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j[] f12066a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Yb.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Yb.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Yb.j] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, Yb.j] */
    static {
        j[] jVarArr = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};
        f12066a = jVarArr;
        x.k(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f12066a.clone();
    }
}
