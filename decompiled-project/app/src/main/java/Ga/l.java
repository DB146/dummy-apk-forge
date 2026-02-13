package Ga;

import A0.C;
import A0.C0020i;
import A0.C0021j;
import A0.InterfaceC0022k;
import C.AbstractC0224i;
import C.AbstractC0233s;
import C.C0219d;
import C.u;
import Db.q;
import E.C0248c;
import K0.F;
import N.G;
import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import Q.InterfaceC0493h0;
import android.content.Context;
import c0.o;
import com.kt.apps.core.tv.model.TVChannel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class l implements Rb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rb.c f4438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f4439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4440c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f4441d;

    public l(int i7, Rb.c cVar, Context context, List list) {
        this.f4438a = cVar;
        this.f4439b = list;
        this.f4440c = i7;
        this.f4441d = context;
    }

    @Override // Rb.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        Serializable n6;
        C0248c items = (C0248c) obj;
        final int intValue = ((Number) obj2).intValue();
        C0506o c0506o = (C0506o) obj3;
        int intValue2 = ((Number) obj4).intValue();
        kotlin.jvm.internal.l.e(items, "$this$items");
        if ((intValue2 & 48) == 0) {
            intValue2 |= c0506o.e(intValue) ? 32 : 16;
        }
        if ((intValue2 & 145) == 144 && c0506o.x()) {
            c0506o.N();
        } else {
            c0506o.S(-1444506533);
            if (intValue == 0) {
                c2.i.d(c0506o, androidx.compose.foundation.layout.b.a(8));
            }
            c0506o.p(false);
            float f4 = 4;
            c0.m c10 = com.bumptech.glide.d.c(androidx.compose.foundation.layout.b.b(120), H.c.a(f4));
            c0506o.S(-1224400529);
            final Rb.c cVar = this.f4438a;
            boolean g = c0506o.g(cVar);
            final List list = this.f4439b;
            boolean i7 = g | c0506o.i(list);
            final int i10 = this.f4440c;
            boolean e2 = ((intValue2 & 112) == 32) | i7 | c0506o.e(i10);
            Object H10 = c0506o.H();
            if (e2 || H10 == C0498k.f8409a) {
                H10 = new Rb.a() { // from class: Ga.k
                    @Override // Rb.a
                    public final Object invoke() {
                        Rb.c.this.invoke(((List) ((Db.j) list.get(i10)).f3355b).get(intValue));
                        return q.f3365a;
                    }
                };
                c0506o.d0(H10);
            }
            c0506o.p(false);
            c0.m c11 = androidx.compose.foundation.a.c(c10, (Rb.a) H10);
            Context context = this.f4441d;
            C0219d c0219d = AbstractC0224i.f2402a;
            u a9 = AbstractC0233s.a(c0506o);
            int i11 = c0506o.f8449P;
            InterfaceC0493h0 m10 = c0506o.m();
            c0.m c12 = o.c(c0506o, c11);
            InterfaceC0022k.g.getClass();
            C c13 = C0021j.f241b;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(c13);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, C0021j.f244e, a9);
            C0480b.s(c0506o, C0021j.f243d, m10);
            C0020i c0020i = C0021j.f245f;
            if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i11))) {
                c0506o.d0(Integer.valueOf(i11));
                c0506o.c(Integer.valueOf(i11), c0020i);
            }
            C0480b.s(c0506o, C0021j.f242c, c12);
            try {
                n6 = Integer.valueOf(context.getResources().getIdentifier(ac.g.o0(ac.g.o0(ac.g.o0(ac.g.o0(ac.g.v0(((TVChannel) ((List) ((Db.j) list.get(i10)).f3355b).get(intValue)).getLogoChannel()).toString(), ".png"), ".jpg"), ".webp"), ".jpeg"), "drawable", context.getPackageName()));
            } catch (Throwable th) {
                n6 = com.bumptech.glide.c.n(th);
            }
            String logoChannel = ((TVChannel) ((List) ((Db.j) list.get(i10)).f3355b).get(intValue)).getLogoChannel();
            if (n6 instanceof Db.l) {
                n6 = logoChannel;
            }
            tc.b.e(n6, com.bumptech.glide.d.c(androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.b.f13154a, 1.8f), H.c.a(f4)), c0506o, 48);
            c2.i.d(c0506o, androidx.compose.foundation.layout.b.a(8));
            G.b(((TVChannel) ((List) ((Db.j) list.get(i10)).f3355b).get(intValue)).getTvChannelName(), null, 0L, 0L, 0L, 0L, 0, false, 0, 2, new F(j0.n.f18549c, android.support.v4.media.session.b.v(12), null, 0L, 0L, 16777212), c0506o, 0, 24576, 49150);
            c0506o.p(true);
        }
        return q.f3365a;
    }
}
