package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a1[] f1848a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, B0.a1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, B0.a1] */
    static {
        a1[] a1VarArr = {new Enum("Shown", 0), new Enum("Hidden", 1)};
        f1848a = a1VarArr;
        Z9.x.k(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) f1848a.clone();
    }
}
