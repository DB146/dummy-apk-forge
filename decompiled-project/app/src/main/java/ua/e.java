package ua;

import A0.C0016f0;
import A9.O0;
import A9.Q1;
import Db.o;
import Db.q;
import E.u;
import Q7.h;
import W1.G;
import W3.g;
import Y5.B;
import Y5.C0662z;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.bumptech.glide.k;
import com.bumptech.glide.n;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.l;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import d2.C1043c;
import d2.C1044d;
import i2.AbstractC1297E;
import i2.AbstractC1300H;
import i2.AbstractC1301I;
import i2.AbstractC1304L;
import i2.AbstractC1309Q;
import i2.C1294B;
import i2.C1303K;
import i2.C1317e;
import i2.C1318f;
import i2.C1320h;
import i2.C1321i;
import i2.C1322j;
import i2.C1323k;
import i2.C1325m;
import i2.C1326n;
import i2.C1332t;
import i2.C1337y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.w;
import l1.AbstractC1449a;
import r7.C1948d;
import u.T;
import vc.i;
import y9.D;
import y9.E;
import y9.I;

/* loaded from: classes2.dex */
public final class e extends AbstractC2118a {

    /* renamed from: h1, reason: collision with root package name */
    public static final o f24912h1 = android.support.v4.media.session.b.z(new l(19));

    /* renamed from: c1, reason: collision with root package name */
    public final O0 f24913c1 = i.o(this, w.a(ta.c.class), new d(this, 0), new d(this, 1), new d(this, 2));

    /* renamed from: d1, reason: collision with root package name */
    public TVChannel f24914d1;

    /* renamed from: e1, reason: collision with root package name */
    public u f24915e1;

    /* renamed from: f1, reason: collision with root package name */
    public C1318f f24916f1;

    /* renamed from: g1, reason: collision with root package name */
    public h f24917g1;

    @Override // ua.AbstractC2118a, W1.C
    public final void R(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        super.R(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r12v4, types: [i2.F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, E.u] */
    /* JADX WARN: Type inference failed for: r5v11, types: [i2.i, i2.L, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [i2.F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [i2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Object, i2.b] */
    @Override // c2.p, W1.C
    public final void S(Bundle bundle) {
        Log.d("VideoDetailsFragment", "onCreate DetailsFragment");
        super.S(bundle);
        ?? obj = new Object();
        obj.f3498a = false;
        if (this.f14191W0 != null) {
            throw new IllegalStateException("Each DetailsSupportFragment is allowed to initialize DetailsSupportFragmentBackgroundController once");
        }
        this.f14191W0 = obj;
        obj.f3499b = this;
        this.f24915e1 = obj;
        Parcelable parcelableExtra = g0().getIntent().getParcelableExtra("TV_Channel");
        kotlin.jvm.internal.l.b(parcelableExtra);
        this.f24914d1 = (TVChannel) parcelableExtra;
        C1318f c1318f = new C1318f();
        this.f24916f1 = c1318f;
        this.f24917g1 = new h(c1318f);
        TVChannel tVChannel = this.f24914d1;
        Log.d("VideoDetailsFragment", "doInBackground: " + (tVChannel != null ? tVChannel.toString() : null));
        TVChannel tVChannel2 = this.f24914d1;
        Executor executor = g.f10605a;
        if (tVChannel2 != null) {
            ?? abstractC1304L = new AbstractC1304L(null);
            C1317e c1317e = new C1317e();
            abstractC1304L.f18266d = new h(c1317e);
            abstractC1304L.f18264b = tVChannel2;
            G g02 = g0();
            o oVar = f24912h1;
            abstractC1304L.a(AbstractC1449a.getDrawable(g02, ((Number) oVar.getValue()).intValue()));
            float f4 = 274;
            int round = Math.round(g0().getApplicationContext().getResources().getDisplayMetrics().density * f4);
            int round2 = Math.round(f4 * g0().getApplicationContext().getResources().getDisplayMetrics().density);
            G g03 = g0();
            n d10 = com.bumptech.glide.b.b(g03).d(g03);
            TVChannel tVChannel3 = this.f24914d1;
            k kVar = (k) ((k) d10.p(tVChannel3 != null ? tVChannel3.getLogoChannel() : null).b()).f(((Number) oVar.getValue()).intValue());
            kVar.C(new C2120c(round, round2, abstractC1304L, this), null, kVar, executor);
            h hVar = new h(27, (byte) 0);
            String string = F().getString(R.string.watch_trailer_1);
            String string2 = F().getString(R.string.watch_trailer_2);
            ?? obj2 = new Object();
            new ArrayList();
            obj2.f18252a = string;
            obj2.f18253b = string2;
            hVar.k(obj2);
            if (hVar != abstractC1304L.f18266d) {
                abstractC1304L.f18266d = hVar;
                if (((AbstractC1301I) hVar.f8696c) == null) {
                    hVar.T(c1317e);
                }
            }
            h hVar2 = this.f24917g1;
            if (hVar2 == 0) {
                kotlin.jvm.internal.l.j("mAdapter");
                throw null;
            }
            hVar2.k(abstractC1304L);
        }
        C1325m c1325m = new C1325m(new C1320h(1));
        AbstractC1449a.getColor(g0(), R.color.selected_background);
        ?? obj3 = new Object();
        obj3.f18286a = new WeakReference(null);
        G A10 = A();
        if ((A10 == null && !TextUtils.isEmpty("hero")) || (A10 != null && TextUtils.isEmpty("hero"))) {
            throw new IllegalArgumentException();
        }
        if (A10 != obj3.f18287b || !TextUtils.equals("hero", obj3.f18289d)) {
            obj3.f18287b = A10;
            obj3.f18289d = "hero";
            A10.getWindow().getSharedElementEnterTransition();
            obj3.f18287b.postponeEnterTransition();
            new Handler().postDelayed(new c2.o((C1326n) obj3), 5000L);
        }
        c1325m.g = true;
        new C1948d(this);
        C1318f c1318f2 = this.f24916f1;
        if (c1318f2 == null) {
            kotlin.jvm.internal.l.j("mPresenterSelector");
            throw null;
        }
        c1318f2.f18261b.put(C1321i.class, c1325m);
        ArrayList arrayList = c1318f2.f18260a;
        if (!arrayList.contains(c1325m)) {
            arrayList.add(c1325m);
        }
        ((ta.c) this.f24913c1.getValue()).getListTVChannel(false);
        h hVar3 = this.f24917g1;
        if (hVar3 == null) {
            kotlin.jvm.internal.l.j("mAdapter");
            throw null;
        }
        AbstractC1300H[] b2 = ((AbstractC1301I) hVar3.f8696c).b();
        if (b2 != null) {
            for (AbstractC1300H abstractC1300H : b2) {
                if (abstractC1300H instanceof C1325m) {
                    C1325m c1325m2 = (C1325m) abstractC1300H;
                    C1332t c1332t = new C1332t(0);
                    new B(10);
                    new B(10);
                    F().getDimensionPixelSize(R.dimen.lb_details_v2_align_pos_for_actions);
                    new B(10);
                    F().getDimensionPixelSize(R.dimen.lb_details_v2_align_pos_for_description);
                    if (c1325m2.f18215a == null) {
                        c1325m2.f18215a = new T(0);
                    }
                    c1325m2.f18215a.put(C1332t.class, c1332t);
                }
            }
        } else {
            Log.e("DetailsSupportFragment", "PresenterSelector.getPresenters() not implemented");
        }
        TVChannel tVChannel4 = this.f24914d1;
        u uVar = this.f24915e1;
        if (uVar == null) {
            kotlin.jvm.internal.l.j("mDetailsBackground");
            throw null;
        }
        e eVar = (e) uVar.f3499b;
        int dimensionPixelSize = eVar.C().getResources().getDimensionPixelSize(R.dimen.lb_details_cover_drawable_parallax_movement);
        d2.g gVar = new d2.g();
        ColorDrawable colorDrawable = new ColorDrawable();
        c2.l lVar = new c2.l(gVar, PropertyValuesHolder.ofInt(d2.g.f16503d, 0, -dimensionPixelSize));
        if (((C1323k) uVar.f3500c) == null) {
            Bitmap bitmap = (Bitmap) uVar.f3502e;
            if (bitmap != null) {
                gVar.a(bitmap);
            }
            Context C2 = eVar.C();
            C1322j o02 = eVar.o0();
            C1044d c1044d = new C1044d(0);
            if (colorDrawable.getColor() == 0) {
                TypedValue typedValue = new TypedValue();
                colorDrawable.setColor(C2.getTheme().resolveAttribute(R.attr.defaultBrandColorDark, typedValue, true) ? C2.getResources().getColor(typedValue.resourceId) : C2.getResources().getColor(R.color.lb_default_brand_color_dark));
            }
            c1044d.a(gVar);
            c1044d.a(colorDrawable);
            C1303K c1303k = o02.f18272f;
            int dimensionPixelSize2 = C2.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_align_pos_for_actions);
            int dimensionPixelSize3 = C2.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_align_pos_for_description);
            c1303k.getClass();
            o02.a(new C1294B(c1303k, dimensionPixelSize2, 0.0f), new C1294B(c1303k, dimensionPixelSize3, 0.0f)).f18212d.add(lVar);
            C1303K c1303k2 = o02.g;
            c1303k2.getClass();
            AbstractC1297E a9 = o02.a(new C1294B(c1303k2, 0, 1.0f), new C1294B(c1303k2, 0, 0.0f));
            C1043c c10 = c1044d.c(1);
            Q1 q12 = C1043c.f16489e;
            ArrayList arrayList2 = a9.f18212d;
            ?? obj4 = new Object();
            obj4.f18213a = c10;
            obj4.f18214b = q12;
            arrayList2.add(obj4);
            AbstractC1297E a10 = o02.a(new C1294B(c1303k, 0, 1.0f), new C1294B(c1303k, 0, 0.0f));
            C1043c c11 = c1044d.c(0);
            Q1 q13 = C1043c.f16490f;
            ArrayList arrayList3 = a10.f18212d;
            ?? obj5 = new Object();
            obj5.f18213a = c11;
            obj5.f18214b = q13;
            arrayList3.add(obj5);
            uVar.f3500c = c1044d;
            uVar.f3501d = new C0016f0(eVar.o0(), ((C1323k) uVar.f3500c).c(0).f16492b);
        }
        G g04 = g0();
        k E10 = ((k) ((k) com.bumptech.glide.b.b(g04).d(g04).m().b()).f(R.drawable.default_background)).E(tVChannel4 != null ? tVChannel4.getLogoChannel() : null);
        E10.C(new sa.b(this, 1), null, E10, executor);
        B b10 = new B(this);
        if (this.f14190V0 != b10) {
            this.f14190V0 = b10;
        }
    }

    @Override // c2.p, c2.k, W1.C
    public final void d0(View view, Bundle bundle) {
        kotlin.jvm.internal.l.e(view, "view");
        super.d0(view, bundle);
        O0 o02 = this.f24913c1;
        final int i7 = 1;
        ((ta.c) o02.getValue()).getTvChannelLiveData().e(H(), new Aa.b(new Rb.c(this) { // from class: ua.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f24907b;

            {
                this.f24907b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj) {
                q qVar = q.f3365a;
                I i10 = (I) obj;
                switch (i7) {
                    case 0:
                        o oVar = e.f24912h1;
                        boolean z8 = i10 instanceof E;
                        e eVar = this.f24907b;
                        if (z8) {
                            eVar.f14172D0.b();
                        } else if (i10 instanceof y9.G) {
                            eVar.f14172D0.a();
                            Intent intent = new Intent(eVar.g0(), (Class<?>) PlaybackActivity.class);
                            intent.putExtra("TV_Channel", (Parcelable) ((y9.G) i10).f27483a);
                            eVar.n0(intent);
                        } else if (i10 instanceof D) {
                            eVar.f14172D0.a();
                            ActivityUtilsKt.showErrorDialog$default(eVar, null, ((D) i10).f27482a.getMessage(), null, null, null, false, false, null, null, 509, null);
                        }
                        return qVar;
                    default:
                        o oVar2 = e.f24912h1;
                        if (i10 instanceof y9.G) {
                            List list = (List) ((y9.G) i10).f27483a;
                            h hVar = new h(27, (byte) 0);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                hVar.k((TVChannel) it.next());
                            }
                            C0662z c0662z = new C0662z(10);
                            e eVar2 = this.f24907b;
                            h hVar2 = eVar2.f24917g1;
                            if (hVar2 == null) {
                                kotlin.jvm.internal.l.j("mAdapter");
                                throw null;
                            }
                            hVar2.k(new AbstractC1304L(c0662z));
                            C1318f c1318f = eVar2.f24916f1;
                            if (c1318f == null) {
                                kotlin.jvm.internal.l.j("mPresenterSelector");
                                throw null;
                            }
                            AbstractC1309Q abstractC1309Q = new AbstractC1309Q();
                            new HashMap();
                            c1318f.f18261b.put(C1337y.class, abstractC1309Q);
                            ArrayList arrayList = c1318f.f18260a;
                            if (!arrayList.contains(abstractC1309Q)) {
                                arrayList.add(abstractC1309Q);
                            }
                        }
                        return qVar;
                }
            }
        }, 6));
        final int i10 = 0;
        ((ta.c) o02.getValue()).getTvWithLinkStreamLiveData().e(H(), new Aa.b(new Rb.c(this) { // from class: ua.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f24907b;

            {
                this.f24907b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj) {
                q qVar = q.f3365a;
                I i102 = (I) obj;
                switch (i10) {
                    case 0:
                        o oVar = e.f24912h1;
                        boolean z8 = i102 instanceof E;
                        e eVar = this.f24907b;
                        if (z8) {
                            eVar.f14172D0.b();
                        } else if (i102 instanceof y9.G) {
                            eVar.f14172D0.a();
                            Intent intent = new Intent(eVar.g0(), (Class<?>) PlaybackActivity.class);
                            intent.putExtra("TV_Channel", (Parcelable) ((y9.G) i102).f27483a);
                            eVar.n0(intent);
                        } else if (i102 instanceof D) {
                            eVar.f14172D0.a();
                            ActivityUtilsKt.showErrorDialog$default(eVar, null, ((D) i102).f27482a.getMessage(), null, null, null, false, false, null, null, 509, null);
                        }
                        return qVar;
                    default:
                        o oVar2 = e.f24912h1;
                        if (i102 instanceof y9.G) {
                            List list = (List) ((y9.G) i102).f27483a;
                            h hVar = new h(27, (byte) 0);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                hVar.k((TVChannel) it.next());
                            }
                            C0662z c0662z = new C0662z(10);
                            e eVar2 = this.f24907b;
                            h hVar2 = eVar2.f24917g1;
                            if (hVar2 == null) {
                                kotlin.jvm.internal.l.j("mAdapter");
                                throw null;
                            }
                            hVar2.k(new AbstractC1304L(c0662z));
                            C1318f c1318f = eVar2.f24916f1;
                            if (c1318f == null) {
                                kotlin.jvm.internal.l.j("mPresenterSelector");
                                throw null;
                            }
                            AbstractC1309Q abstractC1309Q = new AbstractC1309Q();
                            new HashMap();
                            c1318f.f18261b.put(C1337y.class, abstractC1309Q);
                            ArrayList arrayList = c1318f.f18260a;
                            if (!arrayList.contains(abstractC1309Q)) {
                                arrayList.add(abstractC1309Q);
                            }
                        }
                        return qVar;
                }
            }
        }, 6));
    }
}
