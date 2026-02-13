package o;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public int f21383a;

    /* renamed from: b, reason: collision with root package name */
    public int f21384b;

    /* renamed from: c, reason: collision with root package name */
    public int f21385c;

    /* renamed from: d, reason: collision with root package name */
    public int f21386d;

    /* renamed from: e, reason: collision with root package name */
    public int f21387e;

    /* renamed from: f, reason: collision with root package name */
    public int f21388f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21389h;

    public final void a(int i7, int i10) {
        this.f21385c = i7;
        this.f21386d = i10;
        this.f21389h = true;
        if (this.g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f21383a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f21384b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f21383a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f21384b = i10;
        }
    }
}
