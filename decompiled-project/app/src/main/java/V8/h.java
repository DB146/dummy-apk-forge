package V8;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f10222a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10223b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10224c;

    /* renamed from: d, reason: collision with root package name */
    public final float f10225d;

    /* renamed from: e, reason: collision with root package name */
    public final float f10226e;

    /* renamed from: f, reason: collision with root package name */
    public final float f10227f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f10228h;

    /* renamed from: i, reason: collision with root package name */
    public final float f10229i;

    public h(float f4, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f10222a = f4;
        this.f10223b = f12;
        this.f10224c = f15;
        this.f10225d = f10;
        this.f10226e = f13;
        this.f10227f = f16;
        this.g = f11;
        this.f10228h = f14;
        this.f10229i = f17;
    }

    public static h a(float f4, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24) {
        h b2 = b(f4, f10, f11, f12, f13, f14, f15, f16);
        float f25 = b2.f10226e;
        float f26 = b2.f10229i;
        float f27 = b2.f10227f;
        float f28 = b2.f10228h;
        float f29 = (f25 * f26) - (f27 * f28);
        float f30 = b2.g;
        float f31 = b2.f10225d;
        float f32 = (f27 * f30) - (f31 * f26);
        float f33 = (f31 * f28) - (f25 * f30);
        float f34 = b2.f10224c;
        float f35 = b2.f10223b;
        float f36 = (f34 * f28) - (f35 * f26);
        float f37 = b2.f10222a;
        float f38 = (f26 * f37) - (f34 * f30);
        float f39 = (f30 * f35) - (f28 * f37);
        float f40 = (f35 * f27) - (f34 * f25);
        float f41 = (f34 * f31) - (f27 * f37);
        float f42 = (f37 * f25) - (f35 * f31);
        h b10 = b(f17, f18, f19, f20, f21, f22, f23, f24);
        float f43 = b10.f10222a;
        float f44 = b10.f10225d;
        float f45 = b10.g;
        float f46 = (f44 * f36) + (f43 * f29) + (f45 * f40);
        float f47 = (f45 * f41) + (f44 * f38) + (f43 * f32);
        float f48 = f45 * f42;
        float f49 = f48 + (f44 * f39) + (f43 * f33);
        float f50 = b10.f10223b;
        float f51 = b10.f10226e;
        float f52 = b10.f10228h;
        float f53 = (f52 * f40) + (f51 * f36) + (f50 * f29);
        float f54 = (f52 * f41) + (f51 * f38) + (f50 * f32);
        float f55 = (f51 * f39) + (f50 * f33) + (f52 * f42);
        float f56 = b10.f10224c;
        float f57 = b10.f10227f;
        float f58 = f36 * f57;
        float f59 = b10.f10229i;
        return new h(f46, f47, f49, f53, f54, f55, (f40 * f59) + f58 + (f29 * f56), (f38 * f57) + (f32 * f56) + (f41 * f59), (f59 * f42) + (f57 * f39) + (f56 * f33));
    }

    public static h b(float f4, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = ((f4 - f11) + f13) - f15;
        float f18 = ((f10 - f12) + f14) - f16;
        if (f17 == 0.0f && f18 == 0.0f) {
            return new h(f11 - f4, f13 - f11, f4, f12 - f10, f14 - f12, f10, 0.0f, 0.0f, 1.0f);
        }
        float f19 = f11 - f13;
        float f20 = f15 - f13;
        float f21 = f12 - f14;
        float f22 = f16 - f14;
        float f23 = (f19 * f22) - (f20 * f21);
        float f24 = ((f22 * f17) - (f20 * f18)) / f23;
        float f25 = ((f19 * f18) - (f17 * f21)) / f23;
        return new h((f24 * f11) + (f11 - f4), (f25 * f15) + (f15 - f4), f4, (f24 * f12) + (f12 - f10), (f25 * f16) + (f16 - f10), f10, f24, f25, 1.0f);
    }
}
