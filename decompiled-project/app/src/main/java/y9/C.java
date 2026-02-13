package y9;

import hb.C1268a;
import hb.InterfaceC1269b;
import l2.Y;

/* loaded from: classes2.dex */
public abstract class C extends Y {
    private final Db.g compositeDisposable$delegate = android.support.v4.media.session.b.z(new wa.f(20));

    public final void add(InterfaceC1269b disposable) {
        kotlin.jvm.internal.l.e(disposable, "disposable");
        getCompositeDisposable().d(disposable);
    }

    public final C1268a getCompositeDisposable() {
        return (C1268a) this.compositeDisposable$delegate.getValue();
    }

    @Override // l2.Y
    public void onCleared() {
        getCompositeDisposable().e();
    }
}
