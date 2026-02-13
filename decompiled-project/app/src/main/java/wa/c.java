package wa;

import A9.C0098j;
import A9.C0160y2;
import A9.O0;
import A9.Q;
import Aa.t;
import Db.o;
import Db.q;
import Eb.p;
import W9.j;
import a2.AbstractC0708a;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.core.utils.l;
import com.kt.apps.media.xemtv.beta.R;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.w;
import r7.C1947c;
import y9.E;
import y9.G;
import y9.I;

/* loaded from: classes2.dex */
public final class c extends i {

    /* renamed from: Q0, reason: collision with root package name */
    public final O0 f25831Q0 = vc.i.o(this, w.a(h.class), new b(this, 0), new b(this, 1), new b(this, 2));

    /* renamed from: R0, reason: collision with root package name */
    public final O0 f25832R0 = vc.i.o(this, w.a(ta.c.class), new b(this, 3), new b(this, 4), new b(this, 5));

    /* renamed from: S0, reason: collision with root package name */
    public final o f25833S0 = android.support.v4.media.session.b.z(new l(29));

    /* renamed from: T0, reason: collision with root package name */
    public int f25834T0 = UtilsKt.dpToPx(40);

    public static String F0(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(p.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            StringBuilder m10 = X.c.m(jVar.f10894a);
            m10.append(jVar.f10895b);
            arrayList.add(m10.toString());
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = X.c.h((String) next, (String) it2.next());
        }
        return (String) next;
    }

    @Override // y9.AbstractC2457B
    public final void C0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
        x0(new C1947c(this, 16));
        final int i7 = 0;
        ((ta.c) this.f25832R0.getValue()).getTvWithLinkStreamLiveData().e(H(), new Aa.b(new Rb.c(this) { // from class: wa.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f25828b;

            {
                this.f25828b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj) {
                I i10 = (I) obj;
                switch (i7) {
                    case 0:
                        boolean z8 = i10 instanceof E;
                        c cVar = this.f25828b;
                        if (z8) {
                            cVar.B0().b();
                        } else {
                            cVar.B0().a();
                        }
                        if (i10 instanceof G) {
                            Intent intent = new Intent(cVar.g0(), (Class<?>) PlaybackActivity.class);
                            G g = (G) i10;
                            intent.putExtra("extra:tv_channel", (Parcelable) g.f27483a);
                            intent.putExtra("extra:playback_type", (Parcelable) (((TVChannelLinkStream) g.f27483a).getChannel().isRadio() ? Aa.l.f1525c : Aa.l.f1523a));
                            cVar.n0(intent);
                        }
                        return q.f3365a;
                    default:
                        if (i10 instanceof G) {
                            Object obj2 = ((G) i10).f27483a;
                            M9.b bVar = (M9.b) obj2;
                            Log.e("TAG", String.valueOf(obj2));
                            c cVar2 = this.f25828b;
                            Intent intent2 = new Intent(cVar2.i0(), (Class<?>) PlaybackActivity.class);
                            intent2.putExtra("extra:playback_type", (Parcelable) Aa.l.f1526d);
                            intent2.putExtra("extra:item_to_play", bVar.f6844a);
                            intent2.putExtra("extra:extensions_id", bVar.f6845b);
                            cVar2.n0(intent2);
                        }
                        return q.f3365a;
                }
            }
        }, 9));
        Object obj = new Object();
        O0 o02 = this.f25831Q0;
        ((h) o02.getValue()).b().e(H(), new Aa.b(new t(27, this, obj), 9));
        final int i10 = 1;
        ((h) o02.getValue()).d().e(H(), new Aa.b(new Rb.c(this) { // from class: wa.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f25828b;

            {
                this.f25828b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj2) {
                I i102 = (I) obj2;
                switch (i10) {
                    case 0:
                        boolean z8 = i102 instanceof E;
                        c cVar = this.f25828b;
                        if (z8) {
                            cVar.B0().b();
                        } else {
                            cVar.B0().a();
                        }
                        if (i102 instanceof G) {
                            Intent intent = new Intent(cVar.g0(), (Class<?>) PlaybackActivity.class);
                            G g = (G) i102;
                            intent.putExtra("extra:tv_channel", (Parcelable) g.f27483a);
                            intent.putExtra("extra:playback_type", (Parcelable) (((TVChannelLinkStream) g.f27483a).getChannel().isRadio() ? Aa.l.f1525c : Aa.l.f1523a));
                            cVar.n0(intent);
                        }
                        return q.f3365a;
                    default:
                        if (i102 instanceof G) {
                            Object obj22 = ((G) i102).f27483a;
                            M9.b bVar = (M9.b) obj22;
                            Log.e("TAG", String.valueOf(obj22));
                            c cVar2 = this.f25828b;
                            Intent intent2 = new Intent(cVar2.i0(), (Class<?>) PlaybackActivity.class);
                            intent2.putExtra("extra:playback_type", (Parcelable) Aa.l.f1526d);
                            intent2.putExtra("extra:item_to_play", bVar.f6844a);
                            intent2.putExtra("extra:extensions_id", bVar.f6845b);
                            cVar2.n0(intent2);
                        }
                        return q.f3365a;
                }
            }
        }, 9));
    }

    @Override // y9.AbstractC2457B
    public final void D0(View view) {
        ((h) this.f25831Q0.getValue()).a();
        t0((C0098j) this.f25833S0.getValue());
        h().f937c.g();
    }

    @Override // A9.A2, W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        if (C() == null) {
            return;
        }
        TypedArray obtainStyledAttributes = i0().obtainStyledAttributes(R.style.Theme_BaseLeanBack_SearchScreen, AbstractC0708a.f12484b);
        this.f25834T0 = (int) obtainStyledAttributes.getDimension(7, i0().getResources().getDimensionPixelSize(R.dimen.lb_browse_rows_margin_top));
        obtainStyledAttributes.recycle();
    }

    @Override // W1.C
    public final void Z() {
        this.f10275S = true;
        ((h) this.f25831Q0.getValue()).a();
    }

    @Override // A9.A2, A9.S
    public final Q h() {
        if (this.f757t0 == null) {
            this.f757t0 = new Ba.q(this, 1);
        }
        C0160y2 mMainFragmentAdapter = this.f757t0;
        kotlin.jvm.internal.l.d(mMainFragmentAdapter, "mMainFragmentAdapter");
        return mMainFragmentAdapter;
    }

    @Override // A9.A2
    public final int p0() {
        return R.layout.base_favorite_fragment;
    }

    @Override // A9.A2
    public final int q0() {
        return this.f753p0;
    }
}
