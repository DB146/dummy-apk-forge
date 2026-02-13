package Mc;

import A0.C0016f0;
import A9.A2;
import A9.AbstractC0113m2;
import A9.C0091h0;
import A9.C0096i1;
import A9.C0098j;
import A9.C0107l0;
import A9.C0111m0;
import A9.C0115n0;
import A9.C0116n1;
import A9.C0119o0;
import A9.C0120o1;
import A9.C0125p2;
import A9.C0139t1;
import A9.C0151w1;
import A9.F0;
import A9.Q1;
import A9.S1;
import A9.V1;
import A9.X;
import android.R;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.bumptech.glide.k;
import d2.C1043c;
import d2.C1044d;
import fb.AbstractC1148b;
import g3.C1191j;
import gb.o;
import hb.C1268a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import ob.m;
import qb.p;
import u.T;
import y7.u0;

/* loaded from: classes2.dex */
public final class f extends b {

    /* renamed from: o1, reason: collision with root package name */
    public Kc.d f6947o1;
    public Jc.a p1;

    /* renamed from: q1, reason: collision with root package name */
    public final C1268a f6948q1 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, A9.v0] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, A9.W1] */
    /* JADX WARN: Type inference failed for: r12v8, types: [u.T, u.e] */
    /* JADX WARN: Type inference failed for: r2v32, types: [A9.o0, d2.d, java.lang.Object, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, A9.W1] */
    @Override // A9.C0142u0, A9.D, W1.C
    public final void S(Bundle bundle) {
        Jc.a aVar;
        super.S(bundle);
        Bundle bundle2 = this.f10300u;
        if (bundle2 == null || (aVar = (Jc.a) bundle2.getParcelable("banner_ad")) == null) {
            throw new IllegalArgumentException("BannerAd is required");
        }
        this.p1 = aVar;
        X x2 = new X();
        F0 f02 = new F0(new C0107l0(3));
        f02.f820h = i0().getColor(R.color.black);
        f02.j = true;
        f02.g = i0().getColor(R.color.black);
        f02.f821i = true;
        x2.c(C0111m0.class, f02);
        C0151w1 c0151w1 = new C0151w1();
        c0151w1.g = false;
        x2.c(C0139t1.class, c0151w1);
        C0098j c0098j = new C0098j(x2);
        this.f1399c1 = c0098j;
        AbstractC0113m2[] b2 = c0098j.f852b.b();
        if (b2 != null) {
            for (AbstractC0113m2 abstractC0113m2 : b2) {
                if (abstractC0113m2 instanceof F0) {
                    F0 f03 = (F0) abstractC0113m2;
                    C0120o1 c0120o1 = new C0120o1();
                    C0116n1 c0116n1 = new C0116n1();
                    c0116n1.f1299a = com.kt.apps.media.xemtv.beta.R.id.details_frame;
                    c0116n1.f1301c = -F().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.lb_details_v2_align_pos_for_actions);
                    c0116n1.a(0.0f);
                    C0116n1 c0116n12 = new C0116n1();
                    c0116n12.f1299a = com.kt.apps.media.xemtv.beta.R.id.details_frame;
                    c0116n12.f1300b = com.kt.apps.media.xemtv.beta.R.id.details_overview_description;
                    c0116n12.f1301c = -F().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.lb_details_v2_align_pos_for_description);
                    c0116n12.a(0.0f);
                    c0120o1.f1326a = new C0116n1[]{c0116n1, c0116n12};
                    if (f03.f1282a == null) {
                        f03.f1282a = new T(0);
                    }
                    f03.f1282a.put(C0120o1.class, c0120o1);
                }
            }
        } else {
            Log.e("DetailsSupportFragment", "PresenterSelector.getPresenters() not implemented");
        }
        A2 a22 = this.f1398b1;
        if (a22 != null) {
            a22.t0(c0098j);
        }
        Jc.a aVar2 = this.p1;
        if (aVar2 == null) {
            l.j("bannerAd");
            throw null;
        }
        C0111m0 c0111m0 = new C0111m0(aVar2);
        if (this.p1 == null) {
            l.j("bannerAd");
            throw null;
        }
        C0098j c0098j2 = this.f1399c1;
        l.c(c0098j2, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
        c0098j2.g(c0111m0);
        A1.d dVar = new A1.d(this, 27);
        if (this.f1401e1 != dVar) {
            this.f1401e1 = dVar;
            A2 a23 = this.f1398b1;
            if (a23 != null) {
                a23.x0(dVar);
            }
        }
        Jc.a aVar3 = this.p1;
        if (aVar3 == null) {
            l.j("bannerAd");
            throw null;
        }
        List<String> list = aVar3.f5773C;
        if (list != null && !list.isEmpty()) {
            C0098j c0098j3 = new C0098j(new C0107l0(2));
            for (String str : list) {
                Jc.a aVar4 = this.p1;
                if (aVar4 == null) {
                    l.j("bannerAd");
                    throw null;
                }
                String id = aVar4.f5779a + "_image_" + list.indexOf(str);
                l.e(id, "id");
                String productId = aVar4.f5780b;
                l.e(productId, "productId");
                String title = aVar4.f5781c;
                l.e(title, "title");
                String description = aVar4.f5782d;
                l.e(description, "description");
                String productLink = aVar4.f5784f;
                l.e(productLink, "productLink");
                String qrCodeLink = aVar4.f5785u;
                l.e(qrCodeLink, "qrCodeLink");
                String ctaAction = aVar4.f5786v;
                l.e(ctaAction, "ctaAction");
                String ctaUrl = aVar4.f5787w;
                l.e(ctaUrl, "ctaUrl");
                String adsType = aVar4.f5772B;
                l.e(adsType, "adsType");
                c0098j3.g(new Jc.a(id, productId, title, description, aVar4.f5783e, productLink, qrCodeLink, ctaAction, ctaUrl, aVar4.f5788x, aVar4.f5789y, aVar4.f5790z, aVar4.f5771A, adsType, aVar4.f5773C, aVar4.f5774D, aVar4.f5775E, aVar4.f5776F, aVar4.f5777G, str));
            }
            C0139t1 c0139t1 = new C0139t1(new C0096i1("Hình Ảnh Sản Phẩm", 1L), c0098j3);
            C0098j c0098j4 = this.f1399c1;
            l.c(c0098j4, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
            c0098j4.g(c0139t1);
        }
        Kc.d dVar2 = this.f6947o1;
        if (dVar2 == null) {
            l.j("adsRepository");
            throw null;
        }
        m f4 = dVar2.b(10).f(Ab.e.f1561c);
        o a9 = AbstractC1148b.a();
        nb.e eVar = new nb.e(1, new C1191j(this, 27), e.f6946a);
        try {
            f4.d(new p(eVar, a9, 1));
            this.f6948q1.d(eVar);
            ?? obj = new Object();
            obj.f1428a = false;
            if (this.f1402f1 != null) {
                throw new IllegalStateException("Each DetailsSupportFragment is allowed to initialize DetailsSupportFragmentBackgroundController once");
            }
            this.f1402f1 = obj;
            Jc.a aVar5 = this.p1;
            if (aVar5 == null) {
                l.j("bannerAd");
                throw null;
            }
            String str2 = aVar5.f5790z;
            if (str2 != null) {
                k E10 = com.bumptech.glide.b.b(C()).c(this).m().E(str2);
                E10.C(new d(obj), null, E10, W3.g.f10605a);
            }
            int color = i0().getColor(R.color.black);
            obj.f1429b = color;
            C0119o0 c0119o0 = (C0119o0) obj.f1430c;
            ColorDrawable colorDrawable = c0119o0 != null ? c0119o0.f1325d : null;
            if (colorDrawable != null) {
                colorDrawable.setColor(color);
            }
            int dimensionPixelSize = C().getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.lb_details_cover_drawable_parallax_movement);
            d2.g gVar = new d2.g();
            ColorDrawable colorDrawable2 = new ColorDrawable();
            C0091h0 c0091h0 = new C0091h0(gVar, PropertyValuesHolder.ofInt(d2.g.f16503d, 0, -dimensionPixelSize));
            if (((C0119o0) obj.f1430c) != null) {
                return;
            }
            Bitmap bitmap = (Bitmap) obj.f1432e;
            if (bitmap != null) {
                gVar.a(bitmap);
            }
            int i7 = obj.f1429b;
            if (i7 != 0) {
                colorDrawable2.setColor(i7);
            }
            Context C2 = C();
            if (this.f1397a1 == null) {
                C0115n0 c0115n0 = new C0115n0();
                this.f1397a1 = c0115n0;
                A2 a24 = this.f1398b1;
                if (a24 != null && a24.f10277U != null) {
                    c0115n0.e(a24.f751n0);
                }
            }
            C0115n0 c0115n02 = this.f1397a1;
            ?? c1044d = new C1044d(0);
            if (colorDrawable2.getColor() == 0) {
                TypedValue typedValue = new TypedValue();
                colorDrawable2.setColor(C2.getTheme().resolveAttribute(com.kt.apps.media.xemtv.beta.R.attr.defaultBrandColorDark, typedValue, true) ? C2.getResources().getColor(typedValue.resourceId) : C2.getResources().getColor(com.kt.apps.media.xemtv.beta.R.color.lb_default_brand_color_dark));
            }
            c1044d.a(gVar);
            c1044d.f1325d = colorDrawable2;
            c1044d.a(colorDrawable2);
            C0125p2 c0125p2 = c0115n02.j;
            int dimensionPixelSize2 = C2.getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.lb_details_v2_align_pos_for_actions);
            int dimensionPixelSize3 = C2.getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.lb_details_v2_align_pos_for_description);
            c0125p2.getClass();
            c0115n02.a(new S1(c0125p2, dimensionPixelSize2, 0.0f), new S1(c0125p2, dimensionPixelSize3, 0.0f)).f989d.add(c0091h0);
            C0125p2 c0125p22 = c0115n02.k;
            c0125p22.getClass();
            V1 a10 = c0115n02.a(new S1(c0125p22, 0, 1.0f), new S1(c0125p22, 0, 0.0f));
            C1043c c10 = c1044d.c(1);
            Q1 q12 = C1043c.f16489e;
            ArrayList arrayList = a10.f989d;
            ?? obj2 = new Object();
            obj2.f1031a = c10;
            obj2.f1032b = q12;
            arrayList.add(obj2);
            V1 a11 = c0115n02.a(new S1(c0125p2, 0, 1.0f), new S1(c0125p2, 0, 0.0f));
            C1043c c11 = c1044d.c(0);
            Q1 q13 = C1043c.f16490f;
            ArrayList arrayList2 = a11.f989d;
            ?? obj3 = new Object();
            obj3.f1031a = c11;
            obj3.f1032b = q13;
            arrayList2.add(obj3);
            obj.f1430c = c1044d;
            View view = this.f1394X0;
            if (view != 0) {
                view.setBackground(c1044d);
            }
            this.f1395Y0 = c1044d;
            if (this.f1397a1 == null) {
                C0115n0 c0115n03 = new C0115n0();
                this.f1397a1 = c0115n03;
                A2 a25 = this.f1398b1;
                if (a25 != null && a25.f10277U != null) {
                    c0115n03.e(a25.f751n0);
                }
            }
            obj.f1431d = new C0016f0(this.f1397a1, ((C0119o0) obj.f1430c).c(0).f16492b);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @Override // A9.C0142u0, A9.E, W1.C
    public final void V() {
        this.f6948q1.e();
        super.V();
    }
}
