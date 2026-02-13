package xa;

import A0.B;
import A9.C0096i1;
import A9.C0098j;
import A9.C0139t1;
import A9.O;
import A9.O0;
import Db.q;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.ui.playback.PlaybackActivity;
import fb.AbstractC1148b;
import hb.C1268a;
import i1.C1290a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.w;
import ma.C1651b;
import ma.C1652c;
import r7.C1947c;
import y7.u0;
import y9.D;
import y9.E;
import y9.G;
import y9.I;

/* loaded from: classes2.dex */
public final class d extends o {

    /* renamed from: R0, reason: collision with root package name */
    public Kc.d f26288R0;

    /* renamed from: S0, reason: collision with root package name */
    public Mc.a f26289S0;

    /* renamed from: Q0, reason: collision with root package name */
    public final O0 f26287Q0 = vc.i.o(this, w.a(n.class), new c(this, 0), new c(this, 1), new c(this, 2));

    /* renamed from: T0, reason: collision with root package name */
    public final C1268a f26290T0 = new Object();

    /* renamed from: U0, reason: collision with root package name */
    public final Db.o f26291U0 = android.support.v4.media.session.b.z(new wa.f(4));

    @Override // y9.AbstractC2457B
    public final void C0(View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
        if (!(G0().d().d() instanceof G)) {
            G0().a();
        }
        final int i7 = 0;
        G0().d().e(H(), new Aa.b(new Rb.c(this) { // from class: xa.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f26281b;

            {
                this.f26281b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj) {
                I i10 = (I) obj;
                switch (i7) {
                    case 0:
                        boolean z8 = i10 instanceof G;
                        d dVar = this.f26281b;
                        if (z8) {
                            dVar.H0().i();
                            dVar.B0().a();
                            dVar.A0(-1, true);
                            long timeInMillis = Calendar.getInstance(Locale.TAIWAN).getTimeInMillis() / 1000;
                            G g = (G) i10;
                            for (C1651b c1651b : (Iterable) g.f27483a) {
                                c1651b.a();
                                String message = String.valueOf(timeInMillis - c1651b.f20817d);
                                kotlin.jvm.internal.l.e(message, "message");
                            }
                            Iterable iterable = (Iterable) g.f27483a;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : iterable) {
                                long j = timeInMillis - ((C1651b) obj2).f20817d;
                                if (j > -1200 && j < 9000) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                C0098j c0098j = new C0098j(new sa.f(false));
                                c0098j.h(0, arrayList);
                                dVar.H0().g(new C0139t1(new C0096i1("Đang diễn ra"), c0098j));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj3 : iterable) {
                                String str = ((C1651b) obj3).f20821v;
                                Object obj4 = linkedHashMap.get(str);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(str, obj4);
                                }
                                ((List) obj4).add(obj3);
                            }
                            TreeMap treeMap = new TreeMap(new B(26));
                            treeMap.putAll(linkedHashMap);
                            sa.f fVar = new sa.f(false);
                            for (Map.Entry entry : treeMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                List list = (List) entry.getValue();
                                C0096i1 c0096i1 = new C0096i1(str2);
                                C0098j c0098j2 = new C0098j(fVar);
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    c0098j2.g((C1651b) it.next());
                                }
                                dVar.H0().g(new C0139t1(c0096i1, c0098j2));
                            }
                            Kc.d dVar2 = dVar.f26288R0;
                            if (dVar2 == null) {
                                kotlin.jvm.internal.l.j("adsRepository");
                                throw null;
                            }
                            ob.m f4 = dVar2.b(10).f(Ab.e.f1561c);
                            gb.o a9 = AbstractC1148b.a();
                            nb.e eVar = new nb.e(1, new C1290a(dVar, 29), b.f26282b);
                            try {
                                f4.d(new qb.p(eVar, a9, 1));
                                dVar.f26290T0.d(eVar);
                                O o10 = dVar.h().f937c;
                                dVar.h();
                                o10.g();
                            } catch (NullPointerException e2) {
                                throw e2;
                            } catch (Throwable th) {
                                u0.L(th);
                                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                                nullPointerException.initCause(th);
                                throw nullPointerException;
                            }
                        } else if (i10 instanceof E) {
                            android.support.v4.media.session.b.d(dVar.H0());
                        } else {
                            dVar.B0().a();
                        }
                        return q.f3365a;
                    default:
                        boolean z10 = i10 instanceof G;
                        d t5 = this.f26281b;
                        if (z10) {
                            C1652c c1652c = (C1652c) ((G) i10).f27483a;
                            String.valueOf(c1652c);
                            kotlin.jvm.internal.l.e(t5, "t");
                            Intent intent = new Intent(t5.g0(), (Class<?>) PlaybackActivity.class);
                            intent.setData(null);
                            intent.putExtra("extra:playback_type", (Parcelable) Aa.l.f1524b);
                            kotlin.jvm.internal.l.c(c1652c, "null cannot be cast to non-null type android.os.Parcelable");
                            intent.putExtra("extra:football_match", c1652c);
                            t5.n0(intent);
                        } else if (!(i10 instanceof E) && (i10 instanceof D)) {
                            D d10 = (D) i10;
                            Throwable exception = d10.f27482a;
                            kotlin.jvm.internal.l.e(t5, "t");
                            kotlin.jvm.internal.l.e(exception, "exception");
                            ActivityUtilsKt.showErrorDialog$default(t5, null, d10.f27482a.getMessage(), null, null, null, false, false, null, null, 509, null);
                        }
                        if (i10 instanceof E) {
                            t5.B0().b();
                        } else {
                            t5.B0().a();
                        }
                        return q.f3365a;
                }
            }
        }, 10));
        final int i10 = 1;
        G0().c().e(H(), new Aa.b(new Rb.c(this) { // from class: xa.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f26281b;

            {
                this.f26281b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj) {
                I i102 = (I) obj;
                switch (i10) {
                    case 0:
                        boolean z8 = i102 instanceof G;
                        d dVar = this.f26281b;
                        if (z8) {
                            dVar.H0().i();
                            dVar.B0().a();
                            dVar.A0(-1, true);
                            long timeInMillis = Calendar.getInstance(Locale.TAIWAN).getTimeInMillis() / 1000;
                            G g = (G) i102;
                            for (C1651b c1651b : (Iterable) g.f27483a) {
                                c1651b.a();
                                String message = String.valueOf(timeInMillis - c1651b.f20817d);
                                kotlin.jvm.internal.l.e(message, "message");
                            }
                            Iterable iterable = (Iterable) g.f27483a;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : iterable) {
                                long j = timeInMillis - ((C1651b) obj2).f20817d;
                                if (j > -1200 && j < 9000) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                C0098j c0098j = new C0098j(new sa.f(false));
                                c0098j.h(0, arrayList);
                                dVar.H0().g(new C0139t1(new C0096i1("Đang diễn ra"), c0098j));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj3 : iterable) {
                                String str = ((C1651b) obj3).f20821v;
                                Object obj4 = linkedHashMap.get(str);
                                if (obj4 == null) {
                                    obj4 = new ArrayList();
                                    linkedHashMap.put(str, obj4);
                                }
                                ((List) obj4).add(obj3);
                            }
                            TreeMap treeMap = new TreeMap(new B(26));
                            treeMap.putAll(linkedHashMap);
                            sa.f fVar = new sa.f(false);
                            for (Map.Entry entry : treeMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                List list = (List) entry.getValue();
                                C0096i1 c0096i1 = new C0096i1(str2);
                                C0098j c0098j2 = new C0098j(fVar);
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    c0098j2.g((C1651b) it.next());
                                }
                                dVar.H0().g(new C0139t1(c0096i1, c0098j2));
                            }
                            Kc.d dVar2 = dVar.f26288R0;
                            if (dVar2 == null) {
                                kotlin.jvm.internal.l.j("adsRepository");
                                throw null;
                            }
                            ob.m f4 = dVar2.b(10).f(Ab.e.f1561c);
                            gb.o a9 = AbstractC1148b.a();
                            nb.e eVar = new nb.e(1, new C1290a(dVar, 29), b.f26282b);
                            try {
                                f4.d(new qb.p(eVar, a9, 1));
                                dVar.f26290T0.d(eVar);
                                O o10 = dVar.h().f937c;
                                dVar.h();
                                o10.g();
                            } catch (NullPointerException e2) {
                                throw e2;
                            } catch (Throwable th) {
                                u0.L(th);
                                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                                nullPointerException.initCause(th);
                                throw nullPointerException;
                            }
                        } else if (i102 instanceof E) {
                            android.support.v4.media.session.b.d(dVar.H0());
                        } else {
                            dVar.B0().a();
                        }
                        return q.f3365a;
                    default:
                        boolean z10 = i102 instanceof G;
                        d t5 = this.f26281b;
                        if (z10) {
                            C1652c c1652c = (C1652c) ((G) i102).f27483a;
                            String.valueOf(c1652c);
                            kotlin.jvm.internal.l.e(t5, "t");
                            Intent intent = new Intent(t5.g0(), (Class<?>) PlaybackActivity.class);
                            intent.setData(null);
                            intent.putExtra("extra:playback_type", (Parcelable) Aa.l.f1524b);
                            kotlin.jvm.internal.l.c(c1652c, "null cannot be cast to non-null type android.os.Parcelable");
                            intent.putExtra("extra:football_match", c1652c);
                            t5.n0(intent);
                        } else if (!(i102 instanceof E) && (i102 instanceof D)) {
                            D d10 = (D) i102;
                            Throwable exception = d10.f27482a;
                            kotlin.jvm.internal.l.e(t5, "t");
                            kotlin.jvm.internal.l.e(exception, "exception");
                            ActivityUtilsKt.showErrorDialog$default(t5, null, d10.f27482a.getMessage(), null, null, null, false, false, null, null, 509, null);
                        }
                        if (i102 instanceof E) {
                            t5.B0().b();
                        } else {
                            t5.B0().a();
                        }
                        return q.f3365a;
                }
            }
        }, 10));
    }

    @Override // y9.AbstractC2457B
    public final void D0(View view) {
        t0(H0());
        y0(new Ca.p(1));
        x0(new C1947c(this, 17));
    }

    public final n G0() {
        return (n) this.f26287Q0.getValue();
    }

    public final C0098j H0() {
        return (C0098j) this.f26291U0.getValue();
    }

    @Override // y9.AbstractC2457B, A9.A2, W1.C
    public final void V() {
        H0().i();
        this.f26290T0.e();
        super.V();
    }

    @Override // W1.C
    public final void c0() {
        G0().c().l(new Object());
        this.f10275S = true;
    }
}
