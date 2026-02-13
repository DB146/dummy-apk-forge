package Q;

import hc.C1277e;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class P implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final Rb.e f8349a;

    /* renamed from: b, reason: collision with root package name */
    public final C1277e f8350b;

    /* renamed from: c, reason: collision with root package name */
    public cc.D0 f8351c;

    public P(Hb.i iVar, Rb.e eVar) {
        this.f8349a = eVar;
        this.f8350b = cc.F.b(iVar);
    }

    @Override // Q.v0
    public final void b() {
        cc.D0 d02 = this.f8351c;
        if (d02 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            d02.cancel(cancellationException);
        }
        this.f8351c = cc.F.B(this.f8350b, null, 0, this.f8349a, 3);
    }

    @Override // Q.v0
    public final void c() {
        cc.D0 d02 = this.f8351c;
        if (d02 != null) {
            d02.q(new H(1));
        }
        this.f8351c = null;
    }

    @Override // Q.v0
    public final void d() {
        cc.D0 d02 = this.f8351c;
        if (d02 != null) {
            d02.q(new H(1));
        }
        this.f8351c = null;
    }
}
