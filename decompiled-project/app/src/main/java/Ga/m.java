package Ga;

import A0.C0021j;
import A0.InterfaceC0022k;
import C.AbstractC0224i;
import C.AbstractC0233s;
import C.C0219d;
import C.C0221f;
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
import androidx.compose.foundation.layout.FillElement;
import c0.o;
import java.util.List;

/* loaded from: classes2.dex */
public final class m implements Rb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.c f4443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f4444c;

    public m(List list, Rb.c cVar, Context context) {
        this.f4442a = list;
        this.f4443b = cVar;
        this.f4444c = context;
    }

    @Override // Rb.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        C0248c items = (C0248c) obj;
        final int intValue = ((Number) obj2).intValue();
        C0506o c0506o = (C0506o) obj3;
        int intValue2 = ((Number) obj4).intValue();
        kotlin.jvm.internal.l.e(items, "$this$items");
        if ((intValue2 & 48) == 0) {
            intValue2 |= c0506o.e(intValue) ? 32 : 16;
        }
        int i7 = intValue2;
        if ((i7 & 145) == 144 && c0506o.x()) {
            c0506o.N();
        } else {
            c0.j jVar = c0.j.f14110a;
            C0219d c0219d = AbstractC0224i.f2402a;
            u a9 = AbstractC0233s.a(c0506o);
            int i10 = c0506o.f8449P;
            InterfaceC0493h0 m10 = c0506o.m();
            c0.m c10 = o.c(c0506o, jVar);
            InterfaceC0022k.g.getClass();
            Rb.a aVar = C0021j.f241b;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(aVar);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, C0021j.f244e, a9);
            C0480b.s(c0506o, C0021j.f243d, m10);
            Rb.e eVar = C0021j.f245f;
            if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i10))) {
                c0506o.d0(Integer.valueOf(i10));
                c0506o.c(Integer.valueOf(i10), eVar);
            }
            C0480b.s(c0506o, C0021j.f242c, c10);
            final List list = this.f4442a;
            G.b((String) ((Db.j) list.get(intValue)).f3354a, androidx.compose.foundation.layout.a.c(14, 10, 0.0f), 0L, 0L, 0L, 0L, 0, false, 0, 0, new F(j0.n.f18549c, android.support.v4.media.session.b.v(16), N0.k.f7139b, 0L, 0L, 16777208), c0506o, 48, 0, 65532);
            c2.i.d(c0506o, androidx.compose.foundation.layout.b.a(16));
            FillElement fillElement = androidx.compose.foundation.layout.b.f13154a;
            C0221f c0221f = new C0221f(8);
            c0506o.S(-1224400529);
            boolean i11 = ((i7 & 112) == 32) | c0506o.i(list);
            final Rb.c cVar = this.f4443b;
            boolean g = i11 | c0506o.g(cVar);
            final Context context = this.f4444c;
            boolean i12 = g | c0506o.i(context);
            Object H10 = c0506o.H();
            if (i12 || H10 == C0498k.f8409a) {
                H10 = new Rb.c() { // from class: Ga.i
                    @Override // Rb.c
                    public final Object invoke(Object obj5) {
                        E.h LazyRow = (E.h) obj5;
                        kotlin.jvm.internal.l.e(LazyRow, "$this$LazyRow");
                        List list2 = list;
                        int i13 = intValue;
                        E.h.a(LazyRow, ((List) ((Db.j) list2.get(i13)).f3355b).size(), new j(i13, list2), new Y.e(990674539, new l(i13, cVar, context, list2), true));
                        return q.f3365a;
                    }
                };
                c0506o.d0(H10);
            }
            c0506o.p(false);
            c2.q.c(fillElement, null, null, c0221f, null, null, false, null, (Rb.c) H10, c0506o, 24582);
            c0506o.p(true);
        }
        return q.f3365a;
    }
}
