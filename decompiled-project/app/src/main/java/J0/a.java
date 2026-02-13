package J0;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5412a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f5413b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f5414c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, J0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, J0.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, J0.a] */
    static {
        ?? r02 = new Enum("On", 0);
        f5412a = r02;
        ?? r12 = new Enum("Off", 1);
        f5413b = r12;
        a[] aVarArr = {r02, r12, new Enum("Indeterminate", 2)};
        f5414c = aVarArr;
        x.k(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5414c.clone();
    }
}
