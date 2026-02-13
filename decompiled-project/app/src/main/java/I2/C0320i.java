package I2;

/* renamed from: I2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0320i implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323l f5163b;

    public /* synthetic */ C0320i(C0323l c0323l, int i7) {
        this.f5162a = i7;
        this.f5163b = c0323l;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f5162a) {
            case 0:
                this.f5163b.getClass();
                return Db.q.f3365a;
            case 1:
                this.f5163b.getClass();
                return Db.q.f3365a;
            default:
                C0323l c0323l = this.f5163b;
                return Boolean.valueOf(!c0323l.f5168a.p() || c0323l.f5168a.t());
        }
    }
}
