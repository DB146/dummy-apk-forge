package y9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f27534a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f27535b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f27536c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f27537d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t[] f27538e;

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.t, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [y9.t, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [y9.t, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [y9.t, java.lang.Enum] */
    static {
        ?? r02 = new Enum("STATE_INIT", 0);
        f27534a = r02;
        ?? r12 = new Enum("STATE_INIT_WITHOUT_BTN_PLAY", 1);
        f27535b = r12;
        ?? r22 = new Enum("STATE_ONLY_GRID_CONTENT", 2);
        f27536c = r22;
        ?? r32 = new Enum("STATE_HIDDEN", 3);
        f27537d = r32;
        t[] tVarArr = {r02, r12, r22, r32};
        f27538e = tVarArr;
        Z9.x.k(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f27538e.clone();
    }
}
