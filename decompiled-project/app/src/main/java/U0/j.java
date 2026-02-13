package U0;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f9428a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f9429b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f9430c;

    /* JADX WARN: Type inference failed for: r0v0, types: [U0.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [U0.j, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f9428a = r02;
        ?? r12 = new Enum("Rtl", 1);
        f9429b = r12;
        j[] jVarArr = {r02, r12};
        f9430c = jVarArr;
        x.k(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f9430c.clone();
    }
}
