package B0;

import E.C0248c;
import F.C0265i;
import F.C0267k;
import Q.C0506o;
import R.C0524a;
import R.C0525b;
import W1.C0571n;
import android.net.ConnectivityManager;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import u.C2041D;
import u.C2070x;
import z.C2555g;
import z.C2561j;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1868c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1869d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(C0506o c0506o, C0524a c0524a, Q.y0 y0Var, Q.V v10) {
        super(0);
        this.f1866a = 3;
        this.f1867b = c0506o;
        this.f1868c = c0524a;
        this.f1869d = y0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, int i7) {
        super(0);
        this.f1866a = i7;
        this.f1867b = obj;
        this.f1868c = obj2;
        this.f1869d = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.f28009H == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r1 = r0.q0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r0.r0(r1, r0.f28011J) != true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r5 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        r0.f28009H = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        ((z.J0) r12.f1868c).f27892e = z.C2561j.p0(r0, (z.InterfaceC2547c) r12.f1869d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        return r4;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [A4.s, java.lang.Object] */
    @Override // Rb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        switch (this.f1866a) {
            case 0:
                AbstractC0167b abstractC0167b = (AbstractC0167b) this.f1867b;
                abstractC0167b.removeOnAttachStateChangeListener((G) this.f1868c);
                b1 listener = (b1) this.f1869d;
                kotlin.jvm.internal.l.e(listener, "listener");
                android.support.v4.media.session.b.r(abstractC0167b).f4280a.remove(listener);
                return Db.q.f3365a;
            case 1:
                E.h hVar = (E.h) ((Q.C) this.f1867b).getValue();
                E.A a9 = (E.A) this.f1868c;
                Xb.g gVar = (Xb.g) ((F.y) a9.f3372d.f3502e).getValue();
                ?? obj = new Object();
                A4.s sVar = hVar.f3411a;
                int i7 = gVar.f11025a;
                if (i7 < 0) {
                    B.a.c("negative nearestRange.first");
                }
                int min = Math.min(gVar.f11026b, sVar.f470a - 1);
                if (min < i7) {
                    C2041D c2041d = u.N.f24629a;
                    kotlin.jvm.internal.l.c(c2041d, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                    obj.f471b = c2041d;
                    obj.f472c = new Object[0];
                    obj.f470a = 0;
                } else {
                    int i10 = (min - i7) + 1;
                    obj.f472c = new Object[i10];
                    obj.f470a = i7;
                    C2041D c2041d2 = new C2041D(i10);
                    F.P p10 = new F.P(i7, min, c2041d2, (A4.s) obj);
                    if (i7 < 0 || i7 >= sVar.f470a) {
                        StringBuilder r10 = h3.o.r(i7, "Index ", ", size ");
                        r10.append(sVar.f470a);
                        B.a.d(r10.toString());
                    }
                    if (min < 0 || min >= sVar.f470a) {
                        StringBuilder r11 = h3.o.r(min, "Index ", ", size ");
                        r11.append(sVar.f470a);
                        B.a.d(r11.toString());
                    }
                    if (min < i7) {
                        B.a.a("toIndex (" + min + ") should be not smaller than fromIndex (" + i7 + ')');
                    }
                    S.e eVar = (S.e) sVar.f471b;
                    int e2 = F.x.e(i7, eVar);
                    int i11 = ((C0265i) eVar.f8959a[e2]).f3975a;
                    while (i11 <= min) {
                        C0265i c0265i = (C0265i) eVar.f8959a[e2];
                        p10.invoke(c0265i);
                        i11 += c0265i.f3976b;
                        e2++;
                    }
                    obj.f471b = c2041d2;
                }
                return new E.j(a9, hVar, (C0248c) this.f1869d, obj);
            case 2:
                A0.n0 n0Var = (A0.n0) this.f1868c;
                A0.K k = (A0.K) this.f1869d;
                G.e eVar2 = (G.e) this.f1867b;
                i0.c p02 = G.e.p0(eVar2, n0Var, k);
                if (p02 == null) {
                    return null;
                }
                C2561j c2561j = eVar2.f4236C;
                if (V0.k.a(c2561j.f28011J, 0L)) {
                    B.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return p02.e(c2561j.t0(p02, c2561j.f28011J) ^ (-9223372034707292160L));
            case 3:
                C0506o c0506o = (C0506o) this.f1867b;
                C0525b c0525b = c0506o.L;
                C0524a c0524a = (C0524a) this.f1868c;
                Q.y0 y0Var = (Q.y0) this.f1869d;
                C0524a c0524a2 = c0525b.f8747b;
                try {
                    c0525b.f8747b = c0524a;
                    Q.y0 y0Var2 = c0506o.f8440F;
                    int[] iArr = c0506o.f8461n;
                    C2070x c2070x = c0506o.f8468u;
                    c0506o.f8461n = null;
                    c0506o.f8468u = null;
                    try {
                        c0506o.f8440F = y0Var;
                        boolean z8 = c0525b.f8750e;
                        try {
                            c0525b.f8750e = false;
                            throw null;
                        } catch (Throwable th) {
                            c0525b.f8750e = z8;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c0506o.f8440F = y0Var2;
                        c0506o.f8461n = iArr;
                        c0506o.f8468u = c2070x;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c0525b.f8747b = c0524a2;
                    throw th3;
                }
            case 4:
                ((C0571n) this.f1867b).f10518f.e((ViewGroup) this.f1868c, this.f1869d);
                return Db.q.f3365a;
            case 5:
                if (((kotlin.jvm.internal.r) this.f1867b).f19130a) {
                    h3.z.e().a(m3.l.f19799a, "NetworkRequestConstraintController unregister callback");
                    ((ConnectivityManager) this.f1868c).unregisterNetworkCallback((P3.o) this.f1869d);
                }
                return Db.q.f3365a;
            case 6:
                Object obj2 = m3.i.f19792b;
                C0170c0 c0170c0 = (C0170c0) this.f1867b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f1868c;
                m3.i iVar = (m3.i) this.f1869d;
                synchronized (obj2) {
                    LinkedHashMap linkedHashMap = m3.i.f19793c;
                    linkedHashMap.remove(c0170c0);
                    if (linkedHashMap.isEmpty()) {
                        h3.z.e().a(m3.l.f19799a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(iVar);
                    }
                }
                return Db.q.f3365a;
            default:
                C2561j c2561j2 = (C2561j) this.f1867b;
                C0267k c0267k = c2561j2.f28007F;
                while (true) {
                    S.e eVar3 = c0267k.f3980a;
                    int i12 = eVar3.f8961c;
                    Db.q qVar = Db.q.f3365a;
                    boolean z10 = true;
                    if (i12 == 0) {
                        break;
                    } else {
                        if (i12 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        i0.c cVar = (i0.c) ((C2555g) eVar3.f8959a[i12 - 1]).f27979a.invoke();
                        if (!(cVar == null ? true : c2561j2.r0(cVar, c2561j2.f28011J))) {
                            break;
                        } else {
                            S.e eVar4 = c0267k.f3980a;
                            ((C2555g) eVar4.l(eVar4.f8961c - 1)).f27980b.resumeWith(qVar);
                        }
                    }
                }
        }
    }
}
