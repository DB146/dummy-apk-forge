package Ga;

import A0.C0020i;
import A0.C0021j;
import A0.InterfaceC0022k;
import A9.C0163z1;
import C.AbstractC0224i;
import C.AbstractC0230o;
import C.AbstractC0233s;
import C.C0219d;
import C.I;
import C.K;
import C.u;
import Eb.v;
import N.G;
import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import Q.InterfaceC0493h0;
import a.AbstractC0672a;
import c0.o;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import j0.F;
import java.util.ArrayList;
import p0.p;
import p0.q;
import p0.t;
import w.C2182i;
import y0.InterfaceC2316A;

/* loaded from: classes2.dex */
public final class e implements Rb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rb.a f4416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TVChannelLinkStream f4417b;

    public e(Rb.a aVar, TVChannelLinkStream tVChannelLinkStream) {
        this.f4416a = aVar;
        this.f4417b = tVChannelLinkStream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14, types: [p0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [c0.m, java.lang.Object] */
    @Override // Rb.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        K k;
        boolean z8;
        String str;
        TVChannel channel;
        C2182i AnimatedContent = (C2182i) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C0506o c0506o = (C0506o) obj3;
        ((Number) obj4).intValue();
        kotlin.jvm.internal.l.e(AnimatedContent, "$this$AnimatedContent");
        if (booleanValue) {
            c0.j jVar = c0.j.f14110a;
            c0.m c10 = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.b.f13154a, 1.6f).c(new Object());
            c0506o.S(1849434622);
            Object H10 = c0506o.H();
            Object obj5 = C0498k.f8409a;
            if (H10 == obj5) {
                H10 = new A.i();
                c0506o.d0(H10);
            }
            A.i iVar = (A.i) H10;
            c0506o.p(false);
            c0506o.S(1849434622);
            Object H11 = c0506o.H();
            if (H11 == obj5) {
                H11 = new C0163z1(24);
                c0506o.d0(H11);
            }
            c0506o.p(false);
            c0.m b2 = androidx.compose.foundation.a.b(c10, iVar, null, (Rb.a) H11);
            InterfaceC2316A d10 = AbstractC0230o.d(false);
            int i7 = c0506o.f8449P;
            InterfaceC0493h0 m10 = c0506o.m();
            c0.m c11 = o.c(c0506o, b2);
            InterfaceC0022k.g.getClass();
            Rb.a aVar = C0021j.f241b;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(aVar);
            } else {
                c0506o.g0();
            }
            C0020i c0020i = C0021j.f244e;
            C0480b.s(c0506o, c0020i, d10);
            C0020i c0020i2 = C0021j.f243d;
            C0480b.s(c0506o, c0020i2, m10);
            Rb.e eVar = C0021j.f245f;
            if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i7))) {
                c0506o.d0(Integer.valueOf(i7));
                c0506o.c(Integer.valueOf(i7), eVar);
            }
            C0020i c0020i3 = C0021j.f242c;
            C0480b.s(c0506o, c0020i3, c11);
            Object obj6 = AbstractC0224i.f2402a;
            c0.d dVar = c0.b.f14098x;
            K k7 = I.f2354a;
            if (obj6.equals(obj6) && dVar.equals(dVar)) {
                c0506o.S(-848964613);
                c0506o.p(false);
                k = I.f2354a;
            } else {
                c0506o.S(-848913742);
                boolean g = c0506o.g(obj6) | c0506o.g(dVar);
                Object H12 = c0506o.H();
                if (g || H12 == obj5) {
                    H12 = new K();
                    c0506o.d0(H12);
                }
                k = (K) H12;
                c0506o.p(false);
            }
            int i10 = c0506o.f8449P;
            InterfaceC0493h0 m11 = c0506o.m();
            c0.m c12 = o.c(c0506o, jVar);
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(aVar);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, c0020i, k);
            C0480b.s(c0506o, c0020i2, m11);
            if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i10))) {
                c0506o.d0(Integer.valueOf(i10));
                c0506o.c(Integer.valueOf(i10), eVar);
            }
            C0480b.s(c0506o, c0020i3, c12);
            p0.d dVar2 = AbstractC0672a.f12358a;
            if (dVar2 == null) {
                long j = j0.n.g;
                ArrayList arrayList = new ArrayList();
                int i11 = q.f23027a;
                v vVar = v.f3891a;
                ArrayList arrayList2 = new ArrayList();
                ?? obj7 = new Object();
                obj7.f22983a = vVar;
                obj7.f22984b = arrayList2;
                arrayList.add(obj7);
                int i12 = q.f23027a;
                F f4 = new F(j0.n.f18548b);
                R3.e eVar2 = new R3.e(1);
                ArrayList arrayList3 = eVar2.f8845a;
                arrayList3.add(new Object());
                eVar2.a(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                eVar2.c(12.0f, 10.59f);
                eVar2.c(7.11f, 5.7f);
                eVar2.a(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                eVar2.a(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                eVar2.c(10.59f, 12.0f);
                eVar2.c(5.7f, 16.89f);
                eVar2.a(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                eVar2.a(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                eVar2.c(12.0f, 13.41f);
                arrayList3.add(new p0.k(4.89f));
                eVar2.a(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                eVar2.a(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                eVar2.c(13.41f, 12.0f);
                arrayList3.add(new p0.k(-4.89f));
                eVar2.a(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
                arrayList3.add(p0.g.f23003a);
                ((p0.c) arrayList.get(arrayList.size() - 1)).f22984b.add(new t(arrayList3, f4));
                while (arrayList.size() > 1) {
                    p0.c cVar = (p0.c) arrayList.remove(arrayList.size() - 1);
                    ArrayList arrayList4 = ((p0.c) h3.o.k(1, arrayList)).f22984b;
                    cVar.getClass();
                    arrayList4.add(new p(cVar.f22983a, cVar.f22984b));
                }
                dVar2 = new p0.d("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, new p(obj7.f22983a, obj7.f22984b), j, 5);
                AbstractC0672a.f12358a = dVar2;
            }
            p0.d dVar3 = dVar2;
            c0.m a9 = androidx.compose.foundation.layout.b.a(24);
            c0506o.S(5004770);
            Rb.a aVar2 = this.f4416a;
            boolean g2 = c0506o.g(aVar2);
            Object H13 = c0506o.H();
            if (g2 || H13 == obj5) {
                z8 = false;
                H13 = new d(0, aVar2);
                c0506o.d0(H13);
            } else {
                z8 = false;
            }
            c0506o.p(z8);
            c0.m c13 = androidx.compose.foundation.a.c(a9, (Rb.a) H13);
            long j10 = j0.n.f18549c;
            N.l.a(dVar3, c13, j10, c0506o, 3120);
            c2.i.d(c0506o, androidx.compose.foundation.layout.b.a(16));
            C0219d c0219d = AbstractC0224i.f2402a;
            u a10 = AbstractC0233s.a(c0506o);
            int i13 = c0506o.f8449P;
            InterfaceC0493h0 m12 = c0506o.m();
            c0.m c14 = o.c(c0506o, jVar);
            InterfaceC0022k.g.getClass();
            Rb.a aVar3 = C0021j.f241b;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(aVar3);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, C0021j.f244e, a10);
            C0480b.s(c0506o, C0021j.f243d, m12);
            Rb.e eVar3 = C0021j.f245f;
            if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i13))) {
                c0506o.d0(Integer.valueOf(i13));
                c0506o.c(Integer.valueOf(i13), eVar3);
            }
            C0480b.s(c0506o, C0021j.f242c, c14);
            TVChannelLinkStream tVChannelLinkStream = this.f4417b;
            if (tVChannelLinkStream == null || (channel = tVChannelLinkStream.getChannel()) == null || (str = channel.getTvChannelName()) == null) {
                str = "";
            }
            G.b(str, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, new K0.F(j10, 0L, null, 0L, 0L, 16777214), c0506o, 0, 1572864, 65534);
            c0506o.p(true);
            c0506o.p(true);
            c0506o.p(true);
        }
        return Db.q.f3365a;
    }
}
