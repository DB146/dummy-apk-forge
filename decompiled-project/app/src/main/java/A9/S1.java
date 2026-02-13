package A9;

/* loaded from: classes2.dex */
public final class S1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0125p2 f958a;

    /* renamed from: b, reason: collision with root package name */
    public final int f959b;

    /* renamed from: c, reason: collision with root package name */
    public final float f960c;

    public S1(C0125p2 c0125p2, int i7, float f4) {
        this.f958a = c0125p2;
        this.f959b = i7;
        this.f960c = f4;
    }

    public final int a(C0115n0 c0115n0) {
        float f4 = this.f960c;
        int i7 = this.f959b;
        return f4 == 0.0f ? i7 : i7 + Math.round(c0115n0.c() * f4);
    }
}
