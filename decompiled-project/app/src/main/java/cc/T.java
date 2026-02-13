package cc;

/* loaded from: classes2.dex */
public final class T extends AbstractC0945m0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14502e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14503f;

    public T(w0 w0Var) {
        this.f14502e = 2;
        this.f14503f = w0Var;
    }

    public /* synthetic */ T(Object obj, int i7) {
        this.f14502e = i7;
        this.f14503f = obj;
    }

    @Override // Rb.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f14502e) {
            case 0:
                l((Throwable) obj);
                return Db.q.f3365a;
            case 1:
                l((Throwable) obj);
                return Db.q.f3365a;
            case 2:
                l((Throwable) obj);
                throw null;
            case 3:
                l((Throwable) obj);
                return Db.q.f3365a;
            default:
                l((Throwable) obj);
                return Db.q.f3365a;
        }
    }

    @Override // cc.AbstractC0945m0
    public final void l(Throwable th) {
        switch (this.f14502e) {
            case 0:
                ((S) this.f14503f).b();
                return;
            case 1:
                ((Rb.c) this.f14503f).invoke(th);
                return;
            case 2:
                Object C2 = ((w0) this.f14503f).C();
                if (!(C2 instanceof C0955v)) {
                    F.I(C2);
                }
                throw null;
            case 3:
                Object C10 = k().C();
                boolean z8 = C10 instanceof C0955v;
                C0947n0 c0947n0 = (C0947n0) this.f14503f;
                if (z8) {
                    c0947n0.resumeWith(com.bumptech.glide.c.n(((C0955v) C10).f14583a));
                    return;
                } else {
                    c0947n0.resumeWith(F.I(C10));
                    return;
                }
            default:
                ((C0944m) this.f14503f).resumeWith(Db.q.f3365a);
                return;
        }
    }
}
