package C4;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f2680a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2682c;

    /* renamed from: d, reason: collision with root package name */
    public int f2683d;

    /* renamed from: e, reason: collision with root package name */
    public String f2684e;

    public F(int i7, int i10) {
        this(Integer.MIN_VALUE, i7, i10);
    }

    public F(int i7, int i10, int i11) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            str = i7 + "/";
        } else {
            str = "";
        }
        this.f2680a = str;
        this.f2681b = i10;
        this.f2682c = i11;
        this.f2683d = Integer.MIN_VALUE;
        this.f2684e = "";
    }

    public final void a() {
        int i7 = this.f2683d;
        this.f2683d = i7 == Integer.MIN_VALUE ? this.f2681b : i7 + this.f2682c;
        this.f2684e = this.f2680a + this.f2683d;
    }

    public final void b() {
        if (this.f2683d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
