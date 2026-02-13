package Q;

/* renamed from: Q.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501l0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0499k0 f8412a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8413b;

    /* renamed from: c, reason: collision with root package name */
    public final H0 f8414c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8415d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8416e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8417f = true;

    public C0501l0(AbstractC0499k0 abstractC0499k0, Object obj, boolean z8, H0 h02, boolean z10) {
        this.f8412a = abstractC0499k0;
        this.f8413b = z8;
        this.f8414c = h02;
        this.f8415d = z10;
        this.f8416e = obj;
    }

    public final Object a() {
        if (this.f8413b) {
            return null;
        }
        Object obj = this.f8416e;
        if (obj != null) {
            return obj;
        }
        AbstractC0508p.d("Unexpected form of a provided value");
        throw new Db.d(0);
    }
}
