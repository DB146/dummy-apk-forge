package i2;

/* renamed from: i2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294B {

    /* renamed from: a, reason: collision with root package name */
    public final C1303K f18206a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18207b;

    /* renamed from: c, reason: collision with root package name */
    public final float f18208c;

    public C1294B(C1303K c1303k, int i7, float f4) {
        this.f18206a = c1303k;
        this.f18207b = i7;
        this.f18208c = f4;
    }

    public final int a(C1322j c1322j) {
        float f4 = this.f18208c;
        int i7 = this.f18207b;
        return f4 == 0.0f ? i7 : i7 + Math.round(0.0f * f4);
    }
}
