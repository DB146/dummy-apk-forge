package Q;

/* renamed from: Q.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523z extends AbstractC0499k0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8584b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0523z(Rb.a aVar) {
        super(aVar);
        S s3 = S.f8368f;
        this.f8585c = s3;
    }

    public C0523z(Rb.c cVar) {
        super(C0522y.f8572a);
        this.f8585c = new A(cVar);
    }

    @Override // Q.AbstractC0499k0
    public final C0501l0 a(Object obj) {
        switch (this.f8584b) {
            case 0:
                return new C0501l0(this, obj, obj == null, null, true);
            default:
                return new C0501l0(this, obj, obj == null, (H0) this.f8585c, true);
        }
    }

    @Override // Q.AbstractC0499k0
    public U0 b() {
        switch (this.f8584b) {
            case 0:
                return (A) this.f8585c;
            default:
                return super.b();
        }
    }
}
