package Ga;

import A0.C;
import A0.C0020i;
import A0.C0021j;
import A0.InterfaceC0022k;
import C.AbstractC0224i;
import C.AbstractC0233s;
import C.C0219d;
import C.C0221f;
import C.F;
import C.u;
import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import Q.InterfaceC0493h0;
import Q.W;
import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import c0.o;
import c2.q;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class n implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TVChannelLinkStream f4445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f4446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rb.c f4447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f4448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E9.h f4449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f4450f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Rb.a f4451u;

    public n(TVChannelLinkStream tVChannelLinkStream, List list, Rb.c cVar, Context context, E9.h hVar, W w10, Rb.a aVar) {
        this.f4445a = tVChannelLinkStream;
        this.f4446b = list;
        this.f4447c = cVar;
        this.f4448d = context;
        this.f4449e = hVar;
        this.f4450f = w10;
        this.f4451u = aVar;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        C0506o c0506o;
        boolean z8;
        boolean z10;
        F innerPadding = (F) obj;
        C0506o c0506o2 = (C0506o) obj2;
        int intValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.l.e(innerPadding, "innerPadding");
        if ((intValue & 6) == 0) {
            intValue |= c0506o2.g(innerPadding) ? 4 : 2;
        }
        int i7 = intValue;
        if ((i7 & 19) == 18 && c0506o2.x()) {
            c0506o2.N();
        } else {
            c0.j jVar = c0.j.f14110a;
            C0219d c0219d = AbstractC0224i.f2402a;
            u a9 = AbstractC0233s.a(c0506o2);
            int i10 = c0506o2.f8449P;
            InterfaceC0493h0 m10 = c0506o2.m();
            c0.m c10 = o.c(c0506o2, jVar);
            InterfaceC0022k.g.getClass();
            C c11 = C0021j.f241b;
            c0506o2.W();
            if (c0506o2.f8448O) {
                c0506o2.l(c11);
            } else {
                c0506o2.g0();
            }
            C0480b.s(c0506o2, C0021j.f244e, a9);
            C0480b.s(c0506o2, C0021j.f243d, m10);
            C0020i c0020i = C0021j.f245f;
            if (c0506o2.f8448O || !kotlin.jvm.internal.l.a(c0506o2.H(), Integer.valueOf(i10))) {
                c0506o2.d0(Integer.valueOf(i10));
                c0506o2.c(Integer.valueOf(i10), c0020i);
            }
            C0480b.s(c0506o2, C0021j.f242c, c10);
            TVChannelLinkStream tVChannelLinkStream = this.f4445a;
            boolean z11 = tVChannelLinkStream != null;
            E9.h hVar = this.f4449e;
            Context context = this.f4448d;
            androidx.compose.animation.b.b(z11, null, null, null, null, Y.f.d(1673291867, new f(innerPadding, context, hVar, this.f4450f, this.f4451u, tVChannelLinkStream), c0506o2), c0506o2, 1572870);
            if (1.0f <= 0.0d) {
                D.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f);
            C0221f c0221f = new C0221f(25);
            c0506o2.S(-1224400529);
            boolean i11 = c0506o2.i(tVChannelLinkStream);
            boolean z12 = (i7 & 14) == 4;
            List list = this.f4446b;
            boolean i12 = i11 | z12 | c0506o2.i(list);
            Rb.c cVar = this.f4447c;
            boolean g = i12 | c0506o2.g(cVar) | c0506o2.i(context);
            Object H10 = c0506o2.H();
            if (g || H10 == C0498k.f8409a) {
                c0506o = c0506o2;
                z8 = false;
                z10 = true;
                b bVar = new b(list, tVChannelLinkStream, innerPadding, cVar, context, 0);
                c0506o.d0(bVar);
                H10 = bVar;
            } else {
                c0506o = c0506o2;
                z8 = false;
                z10 = true;
            }
            c0506o.p(z8);
            C0506o c0506o3 = c0506o;
            q.b(layoutWeightElement, null, null, c0221f, null, null, false, null, (Rb.c) H10, c0506o3, 24576);
            c0506o3.p(z10);
        }
        return Db.q.f3365a;
    }
}
