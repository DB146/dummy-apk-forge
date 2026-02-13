package com.kt.apps.media.xemtv.ui.search;

import A9.O0;
import Aa.g;
import Ba.c;
import Ba.d;
import Ba.h;
import Ba.i;
import Ba.j;
import Ba.k;
import Ba.s;
import Eb.B;
import Eb.o;
import R7.a;
import W1.C;
import W1.C0558a;
import W1.U;
import ab.C0792b;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import cb.b;
import com.kt.apps.core.base.leanback.SearchView;
import com.kt.apps.core.utils.blurry.Blur;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import hb.InterfaceC1269b;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l2.a0;
import qb.r;
import y9.AbstractActivityC2461d;
import y9.E;

/* loaded from: classes2.dex */
public final class TVSearchActivity extends AbstractActivityC2461d implements b {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f16217a0 = 0;

    /* renamed from: V, reason: collision with root package name */
    public a f16218V;

    /* renamed from: W, reason: collision with root package name */
    public volatile C0792b f16219W;

    /* renamed from: X, reason: collision with root package name */
    public final Object f16220X = new Object();

    /* renamed from: Y, reason: collision with root package name */
    public boolean f16221Y = false;

    /* renamed from: Z, reason: collision with root package name */
    public final O0 f16222Z;

    public TVSearchActivity() {
        g(new g(this, 1));
        this.f16222Z = new O0(w.a(h.class), new k(this, 1), new k(this, 0), new k(this, 2));
    }

    @Override // cb.b
    public final Object e() {
        return x().e();
    }

    @Override // y9.AbstractActivityC2461d
    public final int l() {
        return R.layout.activity_tv_search;
    }

    @Override // c.AbstractActivityC0867k, l2.InterfaceC1470n
    public final a0 n() {
        return E6.b.m(this, super.n());
    }

    @Override // y9.AbstractActivityC2461d, c.AbstractActivityC0867k, android.app.Activity
    public final void onBackPressed() {
        SearchView.SearchAutoComplete searchEdtAutoComplete;
        if (j().D(android.R.id.content) != null) {
            super.onBackPressed();
            return;
        }
        C D10 = j().D(R.id.main_browse_fragment);
        if (D10 != null) {
            if (!(D10 instanceof s)) {
                D10 = null;
            }
            if (D10 != null) {
                s sVar = (s) D10;
                View view = sVar.f10277U;
                String message = "onBackPressed view focused " + (view != null ? view.findFocus() : null);
                l.e(message, "message");
                SearchView searchView = sVar.f2284Y0;
                if (searchView == null || (searchEdtAutoComplete = searchView.getSearchEdtAutoComplete()) == null) {
                    sVar.G0();
                    return;
                }
                ImageView imageView = sVar.f2287b1;
                if (imageView != null && imageView.isFocused() && (sVar.A() instanceof TVSearchActivity)) {
                    sVar.G0();
                    return;
                }
                SearchView searchView2 = sVar.f2284Y0;
                if (searchView2 == null || !searchView2.isFocused()) {
                    searchEdtAutoComplete.requestFocus(33);
                    return;
                } else {
                    sVar.G0();
                    return;
                }
            }
        }
        super.onBackPressed();
    }

    @Override // y9.AbstractActivityC2461d, W1.G, c.AbstractActivityC0867k, k1.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            a b2 = x().b();
            this.f16218V = b2;
            if (b2.A()) {
                this.f16218V.f8927b = o();
            }
        }
    }

    @Override // y9.AbstractActivityC2461d, W1.G, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f16218V;
        if (aVar != null) {
            aVar.f8927b = null;
        }
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public final void onNewIntent(Intent intent) {
        l.e(intent, "intent");
        super.onNewIntent(intent);
        v(intent);
    }

    @Override // y9.AbstractActivityC2461d
    public final void p(Bundle bundle) {
        ((h) this.f16222Z.getValue()).b().e(this, new j(new i(0), 0));
    }

    @Override // y9.AbstractActivityC2461d
    public final void q() {
        h hVar = (h) this.f16222Z.getValue();
        if (hVar.f2255f == null || !(hVar.b().d() instanceof E)) {
            hVar.b().l(new Object());
            InterfaceC1269b interfaceC1269b = hVar.f2255f;
            if (interfaceC1269b != null) {
                interfaceC1269b.b();
                hVar.getCompositeDisposable().c(interfaceC1269b);
            }
            ha.i iVar = hVar.f2251b;
            iVar.getClass();
            r h10 = iVar.h(B.G(new Db.j("extra:default_history", Boolean.TRUE)));
            qb.b bVar = new qb.b(new c(hVar, 0), new d(hVar, 0));
            h10.b(bVar);
            hVar.f2255f = bVar;
            hVar.add(bVar);
        }
        c2.h c10 = c2.h.c(this);
        c10.a(getWindow());
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.bg_tv);
        l.d(decodeResource, "decodeResource(...)");
        BlurFactor blurFactor = new BlurFactor();
        blurFactor.radius = 10;
        blurFactor.sampling = 1;
        c10.g(new BitmapDrawable((Resources) null, Blur.of(this, decodeResource, blurFactor)));
        v(getIntent());
    }

    public final void v(Intent intent) {
        Uri data;
        String queryParameter;
        String string;
        Uri data2;
        Uri data3;
        Bundle extras;
        Set<String> keySet;
        Log.d("TuanDV", "commitSearchFragment: " + ((intent == null || (extras = intent.getExtras()) == null || (keySet = extras.keySet()) == null) ? null : o.d0(keySet, ", ", null, null, null, 62)));
        Log.d("TuanDV", "commitSearchFragment: " + (intent != null ? intent.getData() : null));
        String queryParameter2 = (intent == null || (data3 = intent.getData()) == null) ? null : data3.getQueryParameter("filter");
        String stringExtra = "android.intent.action.SEARCH".equals(intent != null ? intent.getAction() : null) ? intent.getStringExtra("query") : (intent == null || (data = intent.getData()) == null) ? null : data.getQueryParameter("query");
        String queryParameter3 = (intent == null || (data2 = intent.getData()) == null) ? null : data2.getQueryParameter("query_hint");
        C D10 = j().D(R.id.main_browse_fragment);
        if (!(D10 instanceof s)) {
            D10 = null;
        }
        if (D10 == null || D10.f10272P || D10.f10258A || D10.L()) {
            U j = j();
            j.getClass();
            C0558a c0558a = new C0558a(j);
            s sVar = new s();
            sVar.l0(com.bumptech.glide.c.f(new Db.j("extra:query_key", stringExtra), new Db.j("extra:query_filter", queryParameter2), new Db.j("extra:query_hint", queryParameter3)));
            c0558a.j(R.id.main_browse_fragment, sVar, null);
            c0558a.f();
        } else {
            s sVar2 = (s) D10;
            Bundle bundle = sVar2.f10300u;
            if (bundle == null) {
                bundle = com.bumptech.glide.c.e();
            }
            sVar2.l0(bundle);
            Bundle bundle2 = sVar2.f10300u;
            if (bundle2 != null) {
                bundle2.putString("extra:query_filter", queryParameter2);
            }
            Bundle bundle3 = sVar2.f10300u;
            if (bundle3 != null) {
                bundle3.putString("extra:query_hint", queryParameter3);
            }
            Bundle bundle4 = sVar2.f10300u;
            if (bundle4 != null) {
                bundle4.putString("extra:query_key", stringExtra);
            }
            sVar2.f2282W0 = queryParameter2;
            sVar2.f2283X0 = queryParameter3;
            sVar2.I0(sVar2.f2284Y0, queryParameter3);
            SearchView searchView = sVar2.f2284Y0;
            if (searchView != null) {
                searchView.e(stringExtra);
            }
            if (stringExtra != null) {
                if (stringExtra.length() <= 0 || ac.g.h0(stringExtra)) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    ImageView imageView = sVar2.f2286a1;
                    if (imageView != null) {
                        imageView.requestFocus();
                    }
                    SearchView searchView2 = sVar2.f2284Y0;
                    if (searchView2 != null) {
                        searchView2.setShowKeyBoardOnDefaultFocus(false);
                    }
                }
            }
        }
        if (intent != null) {
            boolean equals = "android.intent.action.SEARCH".equals(intent.getAction());
            O0 o02 = this.f16222Z;
            if (!equals) {
                Uri data4 = intent.getData();
                if (l.a(data4 != null ? data4.getLastPathSegment() : null, "search")) {
                    Uri data5 = intent.getData();
                    String queryParameter4 = data5 != null ? data5.getQueryParameter("filter") : null;
                    Uri data6 = intent.getData();
                    if (data6 != null && (queryParameter = data6.getQueryParameter("query")) != null) {
                        if (ac.g.h0(ac.g.v0(queryParameter).toString())) {
                            queryParameter = null;
                        }
                        if (queryParameter != null) {
                            h.e((h) o02.getValue(), queryParameter, queryParameter4, 4);
                            return;
                        }
                    }
                    if (l.a(queryParameter4, "tv")) {
                        h.e((h) o02.getValue(), "", queryParameter4, 4);
                        return;
                    }
                    return;
                }
                return;
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 == null || (string = extras2.getString("extra:calling_class_name")) == null || !ac.g.b0(string, "MainActivity")) {
                String stringExtra2 = intent.getStringExtra("query");
                if (stringExtra2 != null) {
                    h.e((h) o02.getValue(), stringExtra2, null, 6);
                    return;
                }
                return;
            }
            Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
            intent2.addFlags(603979776);
            intent2.setAction("android.intent.action.SEARCH");
            Bundle extras3 = intent.getExtras();
            if (extras3 == null) {
                extras3 = com.bumptech.glide.c.e();
            }
            intent2.putExtras(extras3);
            startActivity(intent2);
            finish();
            Log.d("TuanDV", "executeSearchFromIntent: " + intent.getExtras());
        }
    }

    public final C0792b x() {
        if (this.f16219W == null) {
            synchronized (this.f16220X) {
                try {
                    if (this.f16219W == null) {
                        this.f16219W = new C0792b((Activity) this);
                    }
                } finally {
                }
            }
        }
        return this.f16219W;
    }
}
