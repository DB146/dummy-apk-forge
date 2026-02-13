package J3;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f5480b = new o(2);

    /* renamed from: c, reason: collision with root package name */
    public static final o f5481c = new o(0);

    /* renamed from: d, reason: collision with root package name */
    public static final o f5482d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f5483e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f5484f;
    public static final A3.k g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f5485h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5486a;

    static {
        o oVar = new o(1);
        f5482d = oVar;
        f5483e = new o(3);
        f5484f = oVar;
        g = A3.k.a(oVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f5485h = true;
    }

    public /* synthetic */ o(int i7) {
        this.f5486a = i7;
    }

    public final int a(int i7, int i10, int i11, int i12) {
        switch (this.f5486a) {
            case 0:
                if (b(i7, i10, i11, i12) == 1.0f) {
                    return 2;
                }
                return f5480b.a(i7, i10, i11, i12);
            case 1:
                return 2;
            case 2:
                return f5485h ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float b(int i7, int i10, int i11, int i12) {
        switch (this.f5486a) {
            case 0:
                return Math.min(1.0f, f5480b.b(i7, i10, i11, i12));
            case 1:
                return Math.max(i11 / i7, i12 / i10);
            case 2:
                if (f5485h) {
                    return Math.min(i11 / i7, i12 / i10);
                }
                return Math.max(i10 / i12, i7 / i11) != 0 ? 1.0f / Integer.highestOneBit(r2) : 1.0f;
            default:
                return 1.0f;
        }
    }
}
