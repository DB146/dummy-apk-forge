package Ba;

import A0.K;
import A9.C0098j;
import A9.C0160y2;
import A9.C0163z1;
import A9.O0;
import A9.O2;
import A9.Q;
import A9.R2;
import A9.T2;
import W1.G;
import a2.AbstractC0708a;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.kt.apps.core.base.leanback.BrowseFrameLayout;
import com.kt.apps.core.base.leanback.SearchView;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.media.xemtv.App;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.search.TVSearchActivity;
import fb.AbstractC1148b;
import hb.C1268a;
import kotlin.jvm.internal.w;
import t8.C2034c;
import y7.u0;
import y9.J;

/* loaded from: classes2.dex */
public final class s extends a implements J {

    /* renamed from: Q0, reason: collision with root package name */
    public La.g f2276Q0;

    /* renamed from: R0, reason: collision with root package name */
    public Kc.d f2277R0;

    /* renamed from: S0, reason: collision with root package name */
    public final Mc.a f2278S0 = Mc.a.f6935d.a();

    /* renamed from: T0, reason: collision with root package name */
    public final C1268a f2279T0 = new Object();

    /* renamed from: U0, reason: collision with root package name */
    public final O0 f2280U0;

    /* renamed from: V0, reason: collision with root package name */
    public final Db.o f2281V0;

    /* renamed from: W0, reason: collision with root package name */
    public String f2282W0;

    /* renamed from: X0, reason: collision with root package name */
    public String f2283X0;

    /* renamed from: Y0, reason: collision with root package name */
    public SearchView f2284Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public BrowseFrameLayout f2285Z0;

    /* renamed from: a1, reason: collision with root package name */
    public ImageView f2286a1;

    /* renamed from: b1, reason: collision with root package name */
    public ImageView f2287b1;

    /* renamed from: c1, reason: collision with root package name */
    public ProgressBar f2288c1;

    /* renamed from: d1, reason: collision with root package name */
    public ImageView f2289d1;

    /* renamed from: e1, reason: collision with root package name */
    public SearchView.SearchAutoComplete f2290e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f2291f1;

    /* renamed from: g1, reason: collision with root package name */
    public final C1268a f2292g1;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, hb.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hb.a] */
    public s() {
        Db.g y10 = android.support.v4.media.session.b.y(Db.h.f3352a, new A0.J(new A0.J(this, 2), 3));
        this.f2280U0 = vc.i.o(this, w.a(h.class), new r(y10, 0), new r(y10, 1), new K(7, this, y10));
        this.f2281V0 = android.support.v4.media.session.b.z(new C0163z1(10));
        this.f2291f1 = UtilsKt.dpToPx(35);
        this.f2292g1 = new Object();
    }

    @Override // y9.AbstractC2457B
    public final void C0(View rootView) {
        SearchView.SearchAutoComplete searchEdtAutoComplete;
        SearchView.SearchAutoComplete searchEdtAutoComplete2;
        kotlin.jvm.internal.l.e(rootView, "rootView");
        SearchView searchView = this.f2284Y0;
        if (searchView != null && (searchEdtAutoComplete2 = searchView.getSearchEdtAutoComplete()) != null) {
            searchEdtAutoComplete2.setOnFocusChangeListener(new R2(this, 2));
        }
        SearchView searchView2 = this.f2284Y0;
        if (searchView2 != null && (searchEdtAutoComplete = searchView2.getSearchEdtAutoComplete()) != null) {
            searchEdtAutoComplete.setOnEditorActionListener(new T2(this, 1));
        }
        SearchView searchView3 = this.f2284Y0;
        if (searchView3 != null) {
            searchView3.setDescendantFocusability(262144);
        }
        BrowseFrameLayout browseFrameLayout = this.f2285Z0;
        if (browseFrameLayout != null) {
            browseFrameLayout.setOnDispatchKeyListener(new O2(this, 1));
            browseFrameLayout.setOnFocusSearchListener(new m(this));
            browseFrameLayout.setOnChildFocusListener(new q3.e(3, this, browseFrameLayout));
        }
        H0().c().e(H(), new Aa.b(new o(this, 0), 3));
        H0().b().e(this, new Aa.b(new Aa.t(1, this.f2290e1, this), 3));
        ImageView imageView = this.f2287b1;
        if (imageView != null) {
            imageView.setLongClickable(true);
        }
        ImageView imageView2 = this.f2287b1;
        if (imageView2 != null) {
            imageView2.setOnLongClickListener(new n(0, this));
        }
        ImageView imageView3 = this.f2287b1;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new Aa.q(this, 1));
        }
    }

    @Override // y9.AbstractC2457B
    public final void D0(View view) {
        String string;
        ImageView imageView;
        SearchView.SearchAutoComplete searchAutoComplete;
        this.f2285Z0 = (BrowseFrameLayout) view;
        this.f2284Y0 = (SearchView) view.findViewById(R.id.search_view);
        this.f2287b1 = (ImageView) view.findViewById(R.id.search_voice_btn);
        this.f2286a1 = (ImageView) view.findViewById(R.id.search_close_btn);
        this.f2289d1 = (ImageView) view.findViewById(R.id.ic_empty_search);
        this.f2288c1 = (ProgressBar) view.findViewById(R.id.ic_loading);
        SearchView searchView = this.f2284Y0;
        this.f2290e1 = searchView != null ? searchView.getSearchEdtAutoComplete() : null;
        Bundle bundle = this.f10300u;
        this.f2282W0 = bundle != null ? bundle.getString("extra:query_filter") : null;
        Bundle bundle2 = this.f10300u;
        String string2 = bundle2 != null ? bundle2.getString("extra:query_hint") : null;
        if (string2 == null || ac.g.h0(string2)) {
            string2 = null;
        }
        this.f2283X0 = string2;
        String str = H0().g;
        if (str != null && (searchAutoComplete = this.f2290e1) != null) {
            searchAutoComplete.setText(str);
        }
        t0((C0098j) this.f2281V0.getValue());
        Kc.d dVar = this.f2277R0;
        if (dVar == null) {
            kotlin.jvm.internal.l.j("adsRepository");
            throw null;
        }
        ob.m f4 = dVar.b(8).f(Ab.e.f1561c);
        gb.o a9 = AbstractC1148b.a();
        nb.e eVar = new nb.e(1, new C2034c(this, 2), p.f2268b);
        try {
            f4.d(new qb.p(eVar, a9, 1));
            this.f2279T0.d(eVar);
            x0(new m(this));
            SearchView searchView2 = this.f2284Y0;
            if (searchView2 != null) {
                Object systemService = g0().getSystemService("search");
                kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.app.SearchManager");
                try {
                    SearchableInfo searchableInfo = ((SearchManager) systemService).getSearchableInfo(g0().getComponentName());
                    kotlin.jvm.internal.l.d(searchableInfo, "getSearchableInfo(...)");
                    searchView2.setSearchableInfo(searchableInfo);
                } catch (Throwable th) {
                    com.bumptech.glide.c.n(th);
                }
                searchView2.setIconifiedByDefault(true);
                searchView2.setOnQueryTextListener(new D5.i(this, 4));
                Bundle bundle3 = this.f10300u;
                if (bundle3 != null && (string = bundle3.getString("extra:query_key")) != null) {
                    SearchView searchView3 = this.f2284Y0;
                    if (searchView3 != null) {
                        searchView3.setShowKeyBoardOnDefaultFocus(false);
                    }
                    if (string.length() > 0 && (imageView = this.f2286a1) != null) {
                        imageView.requestFocus();
                    }
                    searchView2.e(string);
                }
                I0(searchView2, this.f2283X0);
            }
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th2) {
            u0.L(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final void G0() {
        if (!(A() instanceof TVSearchActivity)) {
            G A10 = A();
            if (A10 != null) {
                A10.finish();
                return;
            }
            return;
        }
        if (App.f16182x > 1) {
            G A11 = A();
            if (A11 != null) {
                A11.finish();
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(ActivityUtilsKt.getDefScheme(i0()) + "://tv/dashboard/"));
        intent.setFlags(268435456);
        n0(intent);
        G A12 = A();
        if (A12 != null) {
            A12.finish();
        }
    }

    public final h H0() {
        return (h) this.f2280U0.getValue();
    }

    public final void I0(SearchView searchView, String str) {
        if (str != null) {
            if (searchView != null) {
                searchView.setQueryHint("Tìm kiếm trong ".concat(str));
                return;
            }
            return;
        }
        String str2 = this.f2282W0;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != 3714) {
                if (hashCode != 394668909) {
                    if (hashCode == 1797949895 && str2.equals("all_iptv")) {
                        if (searchView != null) {
                            searchView.setQueryHint("Tìm kiếm nội dung trong IPTV");
                            return;
                        }
                        return;
                    }
                } else if (str2.equals("football")) {
                    if (searchView != null) {
                        searchView.setQueryHint("Tìm kiếm trận đấu bóng đá");
                        return;
                    }
                    return;
                }
            } else if (str2.equals("tv")) {
                if (searchView != null) {
                    searchView.setQueryHint("Tìm kiếm kênh truyền hình");
                    return;
                }
                return;
            }
        }
        if (searchView != null) {
            searchView.setQueryHint("Tìm kiếm nội dung trên Xem TV");
        }
    }

    @Override // A9.A2, W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        if (C() == null) {
            return;
        }
        TypedArray obtainStyledAttributes = i0().obtainStyledAttributes(R.style.Theme_BaseLeanBack_SearchScreen, AbstractC0708a.f12484b);
        this.f2291f1 = (int) obtainStyledAttributes.getDimension(7, i0().getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_top));
        obtainStyledAttributes.recycle();
    }

    @Override // y9.AbstractC2457B, A9.A2, W1.C
    public final void V() {
        this.f2284Y0 = null;
        this.f2285Z0 = null;
        this.f2286a1 = null;
        this.f2287b1 = null;
        this.f2289d1 = null;
        this.f2290e1 = null;
        this.f2279T0.e();
        super.V();
    }

    @Override // A9.A2, W1.C
    public final void a0(Bundle bundle) {
        bundle.putInt("currentSelectedPosition", this.f753p0);
    }

    @Override // y9.J
    public final void c() {
        View view;
        SearchView searchView;
        if (this.f752o0.a() <= 0 || (view = this.f10277U) == null || (searchView = (SearchView) view.findViewById(R.id.search_view)) == null || !searchView.isFocused()) {
            return;
        }
        this.f751n0.requestFocus();
    }

    @Override // W1.C
    public final void e0(Bundle bundle) {
        this.f10275S = true;
    }

    @Override // y9.J
    public final void f() {
    }

    @Override // y9.J
    public final void g() {
    }

    @Override // A9.A2, A9.S
    public final Q h() {
        if (this.f757t0 == null) {
            this.f757t0 = new q(this, 0);
        }
        C0160y2 mMainFragmentAdapter = this.f757t0;
        kotlin.jvm.internal.l.d(mMainFragmentAdapter, "mMainFragmentAdapter");
        return mMainFragmentAdapter;
    }

    @Override // y9.J
    public final void i() {
    }

    @Override // y9.J
    public final void j() {
    }

    @Override // y9.J
    public final void k() {
    }

    @Override // y9.J
    public final void l() {
    }

    @Override // y9.J
    public final void m(int i7) {
    }

    @Override // y9.J
    public final void p() {
    }

    @Override // A9.A2
    public final int p0() {
        return R.layout.base_lb_search_fragment;
    }

    @Override // y9.J
    public final void q() {
    }

    @Override // y9.J
    public final void u() {
    }

    @Override // y9.J
    public final void v() {
    }
}
