package V2;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10004a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f10005b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f10006c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f10007d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f10008e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f10009f;

    /* JADX WARN: Type inference failed for: r0v0, types: [V2.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [V2.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [V2.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [V2.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [V2.f, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ON_CONFIGURE", 0);
        f10004a = r02;
        ?? r12 = new Enum("ON_CREATE", 1);
        f10005b = r12;
        ?? r22 = new Enum("ON_UPGRADE", 2);
        f10006c = r22;
        ?? r32 = new Enum("ON_DOWNGRADE", 3);
        f10007d = r32;
        ?? r42 = new Enum("ON_OPEN", 4);
        f10008e = r42;
        f[] fVarArr = {r02, r12, r22, r32, r42};
        f10009f = fVarArr;
        x.k(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f10009f.clone();
    }
}
