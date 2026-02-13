package C;

import A0.AbstractC0017g;
import A0.D0;
import A0.E0;
import A9.C0096i1;
import B0.Z;
import P4.C0463k;
import a0.C0691r;
import android.graphics.Canvas;
import c.C0853A;
import cc.InterfaceC0937i0;
import f0.ViewOnDragListenerC1126a;
import h0.C1221h;
import h0.C1229p;
import j0.AbstractC1365c;
import java.util.concurrent.CancellationException;
import l0.InterfaceC1445d;
import l2.InterfaceC1479x;
import u0.C2080j;
import u0.InterfaceC2083m;
import v0.C2124a;
import w.C2187n;
import x.a0;
import x0.AbstractC2256a;
import y0.AbstractC2322G;
import y0.AbstractC2323H;
import z.AbstractC2533E;
import z.C2561j;
import z.C2571s;
import z.p0;
import z.t0;
import z.w0;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(C1229p c1229p, C1221h c1221h, Rb.c cVar) {
        super(1);
        this.f2339a = 5;
        this.f2340b = c1229p;
        this.f2341c = c1221h;
        this.f2342d = (kotlin.jvm.internal.m) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(Object obj, Object obj2, Object obj3, int i7) {
        super(1);
        this.f2339a = i7;
        this.f2340b = obj;
        this.f2341c = obj2;
        this.f2342d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [Rb.c, kotlin.jvm.internal.m] */
    @Override // Rb.c
    public final Object invoke(Object obj) {
        boolean z8 = false;
        Object[] objArr = 0;
        r2 = null;
        j0.G g = null;
        int i7 = 1;
        Db.q qVar = Db.q.f3365a;
        Object obj2 = this.f2342d;
        Object obj3 = this.f2341c;
        Object obj4 = this.f2340b;
        switch (this.f2339a) {
            case 0:
                AbstractC2322G abstractC2322G = (AbstractC2322G) obj;
                E e2 = (E) obj4;
                A0.T t5 = (A0.T) obj2;
                AbstractC2323H abstractC2323H = (AbstractC2323H) obj3;
                if (e2.f2347G) {
                    AbstractC2322G.g(abstractC2322G, abstractC2323H, t5.B(e2.f2343C), t5.B(e2.f2344D));
                } else {
                    abstractC2322G.d(abstractC2323H, t5.B(e2.f2343C), t5.B(e2.f2344D), 0.0f);
                }
                return qVar;
            case 1:
                j0.l x2 = ((InterfaceC1445d) obj).u().x();
                Y0.q qVar2 = (Y0.q) obj4;
                if (qVar2.getView().getVisibility() != 8) {
                    qVar2.L = true;
                    B0.D d10 = ((A0.L) obj3).f44B;
                    B0.D d11 = d10 != null ? d10 : null;
                    if (d11 != null) {
                        Canvas a9 = AbstractC1365c.a(x2);
                        d11.getAndroidViewsHandler$ui_release().getClass();
                        ((Y0.q) obj2).draw(a9);
                    }
                    qVar2.L = false;
                }
                return qVar;
            case 2:
                Z.g gVar = (Z.g) obj4;
                if (gVar.f12092b.b(obj3)) {
                    throw new IllegalArgumentException(("Key " + obj3 + " was used multiple times ").toString());
                }
                gVar.f12091a.remove(obj3);
                Z.j jVar = (Z.j) obj2;
                gVar.f12092b.l(obj3, jVar);
                return new Z.f(gVar, obj3, jVar, objArr == true ? 1 : 0);
            case 3:
                d.f fVar = (d.f) obj2;
                ((C0853A) obj4).a((InterfaceC1479x) obj3, fVar);
                return new Z(fVar, 5);
            case 4:
                E0 e02 = (E0) obj;
                f0.f fVar2 = (f0.f) e02;
                f0.f fVar3 = (f0.f) obj3;
                fVar3.getClass();
                if (!((ViewOnDragListenerC1126a) ((B0.D) AbstractC0017g.u(fVar3)).m4getDragAndDropManager()).f16923b.contains(fVar2) || !Y6.b.b(fVar2, Z9.x.v((C0463k) obj2))) {
                    return D0.f16a;
                }
                ((kotlin.jvm.internal.v) obj4).f19134a = e02;
                return D0.f18c;
            case 5:
                C1229p c1229p = (C1229p) obj;
                if (!kotlin.jvm.internal.l.a(c1229p, (C1229p) obj4)) {
                    if (kotlin.jvm.internal.l.a(c1229p, ((C1221h) obj3).f17607d)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    z8 = ((Boolean) ((kotlin.jvm.internal.m) obj2).invoke(c1229p)).booleanValue();
                }
                return Boolean.valueOf(z8);
            case 6:
                return new Z.f((C0691r) obj4, obj3, (C2187n) obj2, i7);
            case 7:
                j0.B b2 = (j0.B) obj;
                a0 a0Var = (a0) obj4;
                b2.a(a0Var != null ? ((Number) a0Var.getValue()).floatValue() : 1.0f);
                a0 a0Var2 = (a0) obj3;
                b2.b(a0Var2 != null ? ((Number) a0Var2.getValue()).floatValue() : 1.0f);
                b2.c(a0Var2 != null ? ((Number) a0Var2.getValue()).floatValue() : 1.0f);
                a0 a0Var3 = (a0) obj2;
                b2.d(a0Var3 != null ? ((j0.G) a0Var3.getValue()).f18528a : j0.G.f18526b);
                return qVar;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                int ordinal = ((w.x) obj).ordinal();
                w.H h10 = (w.H) obj3;
                w.I i10 = (w.I) obj2;
                if (ordinal == 0) {
                    w.N n6 = h10.f25510a.f25542c;
                    if (n6 != null) {
                        g = new j0.G(n6.f25519a);
                    } else {
                        w.N n8 = i10.f25513a.f25542c;
                        if (n8 != null) {
                            g = new j0.G(n8.f25519a);
                        }
                    }
                } else if (ordinal == 1) {
                    g = (j0.G) obj4;
                } else {
                    if (ordinal != 2) {
                        throw new Db.d(1);
                    }
                    w.N n10 = i10.f25513a.f25542c;
                    if (n10 != null) {
                        g = new j0.G(n10.f25519a);
                    } else {
                        w.N n11 = h10.f25510a.f25542c;
                        if (n11 != null) {
                            g = new j0.G(n11.f25519a);
                        }
                    }
                }
                return new j0.G(g != null ? g.f18528a : j0.G.f18526b);
            case 9:
                float floatValue = ((Number) obj).floatValue();
                C2561j c2561j = (C2561j) obj4;
                float f4 = c2561j.f28006E ? 1.0f : -1.0f;
                w0 w0Var = c2561j.f28005D;
                long d12 = w0Var.d(w0Var.g(f4 * floatValue));
                w0 w0Var2 = ((t0) obj2).f28085a;
                float f10 = w0Var.f(w0Var.d(w0.a(w0Var2, w0Var2.j, d12, 1))) * f4;
                if (Math.abs(f10) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + f10 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    ((InterfaceC0937i0) obj3).cancel(cancellationException);
                }
                return qVar;
            default:
                C0096i1 c0096i1 = (C0096i1) obj4;
                q3.f.e(c0096i1, (C2080j) obj);
                u0.y yVar = (u0.y) ((InterfaceC2083m) obj3);
                yVar.getClass();
                float a10 = AbstractC0017g.t(yVar).f55N.a();
                long b10 = com.bumptech.glide.c.b(a10, a10);
                if (V0.p.b(b10) <= 0.0f || V0.p.c(b10) <= 0.0f) {
                    AbstractC2256a.b("maximumVelocity should be a positive value. You specified=" + ((Object) V0.p.f(b10)));
                }
                float b11 = V0.p.b(b10);
                T7.h hVar = (T7.h) c0096i1.f1227a;
                float b12 = hVar.b(b11);
                float c10 = V0.p.c(b10);
                T7.h hVar2 = (T7.h) c0096i1.f1229c;
                long b13 = com.bumptech.glide.c.b(b12, hVar2.b(c10));
                Eb.n.U(r12, null, 0, ((C2124a[]) hVar.f9343e).length);
                hVar.f9341c = 0;
                Eb.n.U(r12, null, 0, ((C2124a[]) hVar2.f9343e).length);
                hVar2.f9341c = 0;
                c0096i1.f1228b = 0L;
                ec.d dVar = ((p0) obj2).f28053I;
                if (dVar != null) {
                    int i11 = AbstractC2533E.f27852a;
                    dVar.h(new C2571s(com.bumptech.glide.c.b(Float.isNaN(V0.p.b(b13)) ? 0.0f : V0.p.b(b13), Float.isNaN(V0.p.c(b13)) ? 0.0f : V0.p.c(b13))));
                }
                return qVar;
        }
    }
}
