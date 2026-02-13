package tss.r.core.ads.ui.leanback;

import Aa.g;
import Mc.f;
import R7.a;
import W1.C0558a;
import W1.G;
import W1.U;
import ab.C0792b;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import cb.b;
import com.kt.apps.media.xemtv.beta.R;
import l2.a0;

/* loaded from: classes2.dex */
public final class ShopeeProductDetailsActivity extends G implements b {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f24555R = 0;

    /* renamed from: N, reason: collision with root package name */
    public a f24556N;

    /* renamed from: O, reason: collision with root package name */
    public volatile C0792b f24557O;

    /* renamed from: P, reason: collision with root package name */
    public final Object f24558P = new Object();

    /* renamed from: Q, reason: collision with root package name */
    public boolean f24559Q = false;

    public ShopeeProductDetailsActivity() {
        g(new g(this, 4));
    }

    @Override // cb.b
    public final Object e() {
        return l().e();
    }

    public final C0792b l() {
        if (this.f24557O == null) {
            synchronized (this.f24558P) {
                try {
                    if (this.f24557O == null) {
                        this.f24557O = new C0792b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f24557O;
    }

    public final void m(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            a b2 = l().b();
            this.f24556N = b2;
            if (b2.A()) {
                this.f24556N.f8927b = o();
            }
        }
    }

    @Override // c.AbstractActivityC0867k, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.m(this, super.n());
    }

    @Override // W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        m(bundle);
        setContentView(R.layout.activity_shopee_product_details_tv);
        Jc.a aVar = (Jc.a) getIntent().getParcelableExtra("extra_banner_ad");
        if (aVar == null) {
            finish();
            return;
        }
        if (bundle == null) {
            f fVar = new f();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("banner_ad", aVar);
            fVar.l0(bundle2);
            U j = j();
            j.getClass();
            C0558a c0558a = new C0558a(j);
            c0558a.j(R.id.details_fragment_container, fVar, null);
            c0558a.e(true);
            Log.d("TuanDV", "ShopeeProductDetailsFragment: ");
        }
    }

    @Override // W1.G, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f24556N;
        if (aVar != null) {
            aVar.f8927b = null;
        }
    }
}
