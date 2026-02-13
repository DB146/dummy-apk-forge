package z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f27943a;

    /* renamed from: b, reason: collision with root package name */
    public static final V f27944b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ V[] f27945c;

    /* JADX WARN: Type inference failed for: r0v0, types: [z.V, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [z.V, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Vertical", 0);
        f27943a = r02;
        ?? r12 = new Enum("Horizontal", 1);
        f27944b = r12;
        V[] vArr = {r02, r12};
        f27945c = vArr;
        Z9.x.k(vArr);
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f27945c.clone();
    }
}
