package A0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f30a;

    /* renamed from: b, reason: collision with root package name */
    public static final H f31b;

    /* renamed from: c, reason: collision with root package name */
    public static final H f32c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ H[] f33d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, A0.H] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, A0.H] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, A0.H] */
    static {
        ?? r02 = new Enum("InMeasureBlock", 0);
        f30a = r02;
        ?? r12 = new Enum("InLayoutBlock", 1);
        f31b = r12;
        ?? r22 = new Enum("NotUsed", 2);
        f32c = r22;
        H[] hArr = {r02, r12, r22};
        f33d = hArr;
        Z9.x.k(hArr);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f33d.clone();
    }
}
