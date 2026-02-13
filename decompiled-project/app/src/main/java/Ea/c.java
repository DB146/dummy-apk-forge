package Ea;

import ab.C0792b;
import android.app.Activity;
import android.os.Bundle;
import c.AbstractActivityC0867k;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import l2.a0;

/* loaded from: classes2.dex */
public abstract class c extends AbstractActivityC0867k implements cb.b {

    /* renamed from: I, reason: collision with root package name */
    public R7.a f3827I;

    /* renamed from: J, reason: collision with root package name */
    public volatile C0792b f3828J;

    /* renamed from: K, reason: collision with root package name */
    public final Object f3829K = new Object();
    public boolean L = false;

    public c() {
        g(new Aa.g((MobileMainActivity) this, 3));
    }

    @Override // cb.b
    public final Object e() {
        return j().e();
    }

    public final C0792b j() {
        if (this.f3828J == null) {
            synchronized (this.f3829K) {
                try {
                    if (this.f3828J == null) {
                        this.f3828J = new C0792b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f3828J;
    }

    @Override // c.AbstractActivityC0867k, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.m(this, super.n());
    }

    @Override // c.AbstractActivityC0867k, k1.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof cb.b) {
            R7.a b2 = j().b();
            this.f3827I = b2;
            if (b2.A()) {
                this.f3827I.f8927b = o();
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        R7.a aVar = this.f3827I;
        if (aVar != null) {
            aVar.f8927b = null;
        }
    }
}
