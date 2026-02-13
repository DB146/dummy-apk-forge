package B0;

import Q.AbstractC0508p;
import Q.C0506o;
import Q.C0518u0;
import Q.EnumC0507o0;
import a0.AbstractC0696w;
import a0.C0694u;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import cc.C0944m;
import cc.InterfaceC0937i0;
import cc.InterfaceC0942l;
import gc.C1205A;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import u.C2047J;

/* renamed from: B0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165a extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0165a(Object obj, int i7) {
        super(2);
        this.f1842a = i7;
        this.f1843b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Type inference failed for: r2v51, types: [Rb.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v56, types: [kotlin.jvm.internal.m, java.lang.Object, Rb.f] */
    /* JADX WARN: Type inference failed for: r2v65, types: [cc.i0] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Set[], java.lang.Object[]] */
    @Override // Rb.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        boolean z8;
        int i10;
        boolean z10;
        int i11;
        int i12;
        Collection i02;
        long j = 255;
        long j10 = -9187201950435737472L;
        char c10 = 7;
        InterfaceC0942l interfaceC0942l = null;
        boolean z11 = false;
        switch (this.f1842a) {
            case 0:
                C0506o c0506o = (C0506o) obj;
                int intValue = ((Number) obj2).intValue();
                if ((3 & intValue) != 2) {
                    i7 = 1;
                    z8 = true;
                } else {
                    i7 = 1;
                    z8 = false;
                }
                if (c0506o.K(intValue & i7, z8)) {
                    ((AbstractC0167b) this.f1843b).a(c0506o);
                } else {
                    c0506o.N();
                }
                return Db.q.f3365a;
            case 1:
                C0506o c0506o2 = (C0506o) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((3 & intValue2) != 2) {
                    i10 = 1;
                    z10 = true;
                } else {
                    i10 = 1;
                    z10 = false;
                }
                if (c0506o2.K(intValue2 & i10, z10)) {
                    throw null;
                }
                c0506o2.N();
                return Db.q.f3365a;
            case 2:
                Set set = (Set) obj;
                C0518u0 c0518u0 = (C0518u0) this.f1843b;
                synchronized (c0518u0.f8543b) {
                    try {
                        if (((EnumC0507o0) c0518u0.f8558t.getValue()).compareTo(EnumC0507o0.f8478e) >= 0) {
                            C2047J c2047j = c0518u0.g;
                            if (set instanceof S.h) {
                                C2047J c2047j2 = ((S.h) set).f8972a;
                                Object[] objArr = c2047j2.f24610b;
                                long[] jArr = c2047j2.f24609a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j11 = jArr[i13];
                                        if ((((~j11) << c10) & j11 & j10) != j10) {
                                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                if ((j11 & 255) < 128) {
                                                    Object obj3 = objArr[(i13 << 3) + i15];
                                                    if (!(obj3 instanceof AbstractC0696w) || ((AbstractC0696w) obj3).c(1)) {
                                                        c2047j.a(obj3);
                                                    }
                                                }
                                                j11 >>= 8;
                                            }
                                            i11 = 1;
                                            if (i14 == 8) {
                                            }
                                        } else {
                                            i11 = 1;
                                        }
                                        if (i13 != length) {
                                            i13 += i11;
                                            j10 = -9187201950435737472L;
                                            c10 = 7;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof AbstractC0696w) || ((AbstractC0696w) obj4).c(1)) {
                                        c2047j.a(obj4);
                                    }
                                }
                            }
                            interfaceC0942l = c0518u0.u();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC0942l != null) {
                    ((C0944m) interfaceC0942l).resumeWith(Db.q.f3365a);
                }
                return Db.q.f3365a;
            case 3:
                Set set2 = (Set) obj;
                if (!(set2 instanceof S.h)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj5 : set3) {
                            if ((obj5 instanceof AbstractC0696w) && !((AbstractC0696w) obj5).c(4)) {
                            }
                            ((ec.d) this.f1843b).h(set2);
                        }
                    }
                    return Db.q.f3365a;
                }
                C2047J c2047j3 = ((S.h) set2).f8972a;
                Object[] objArr2 = c2047j3.f24610b;
                long[] jArr2 = c2047j3.f24609a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j12 = jArr2[i16];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8 - ((~(i16 - length2)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j12 & j) < 128) {
                                    Object obj6 = objArr2[(i16 << 3) + i18];
                                    if ((obj6 instanceof AbstractC0696w) && !((AbstractC0696w) obj6).c(4)) {
                                    }
                                }
                                j12 >>= 8;
                                i18++;
                                j = 255;
                            }
                            i12 = 1;
                            if (i17 != 8) {
                            }
                        } else {
                            i12 = 1;
                        }
                        if (i16 != length2) {
                            i16 += i12;
                            j = 255;
                        }
                    }
                }
                return Db.q.f3365a;
            case 4:
                C0506o c0506o3 = (C0506o) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c0506o3.K(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Z0.b bVar = Z0.b.f12105a;
                    AtomicInteger atomicInteger = H0.j.f4498a;
                    tc.b.i(new AppendedSemanticsElement(bVar, false), (Rb.e) ((Q.W) this.f1843b).getValue(), c0506o3, 0);
                } else {
                    c0506o3.N();
                }
                return Db.q.f3365a;
            case 5:
                Collection collection = (Set) obj;
                while (true) {
                    C0694u c0694u = (C0694u) this.f1843b;
                    AtomicReference atomicReference = c0694u.f12427b;
                    Object obj7 = atomicReference.get();
                    if (obj7 == null) {
                        i02 = collection;
                    } else if (obj7 instanceof Set) {
                        i02 = y7.u0.y(new Set[]{obj7, collection});
                    } else {
                        if (!(obj7 instanceof List)) {
                            AbstractC0508p.d("Unexpected notification");
                            throw new Db.d(0);
                        }
                        i02 = Eb.o.i0((Collection) obj7, y7.u0.x(collection));
                    }
                    while (!atomicReference.compareAndSet(obj7, i02)) {
                        if (atomicReference.get() != obj7) {
                            break;
                        }
                    }
                    if (C0694u.a(c0694u)) {
                        c0694u.f12426a.invoke(new A0.J(c0694u, 16));
                    }
                    return Db.q.f3365a;
                    break;
                }
            case 6:
                c0.m mVar = (c0.m) obj;
                c0.m mVar2 = (c0.k) obj2;
                if (mVar2 instanceof c0.h) {
                    ?? r22 = ((c0.h) mVar2).f14108a;
                    kotlin.jvm.internal.y.b(3, r22);
                    c0.j jVar = c0.j.f14110a;
                    C0506o c0506o4 = (C0506o) this.f1843b;
                    mVar2 = c0.o.b(c0506o4, (c0.m) r22.a(jVar, c0506o4, 0));
                }
                return mVar.c(mVar2);
            case 7:
                ((e0.c) this.f1843b).h(((Number) obj).intValue(), (H0.n) obj2);
                return Db.q.f3365a;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                int intValue4 = ((Number) obj).intValue();
                Hb.g gVar = (Hb.g) obj2;
                Hb.h key = gVar.getKey();
                Hb.g gVar2 = ((C1205A) this.f1843b).f17488b.get(key);
                if (key != cc.B.f14467b) {
                    return Integer.valueOf(gVar != gVar2 ? Integer.MIN_VALUE : intValue4 + 1);
                }
                InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) gVar2;
                for (?? r23 = (InterfaceC0937i0) gVar; r23 != 0; r23 = r23.getParent()) {
                    if (r23 == interfaceC0937i0 || !(r23 instanceof hc.t)) {
                        interfaceC0942l = r23;
                        if (interfaceC0942l != interfaceC0937i0) {
                            if (interfaceC0937i0 != null) {
                                intValue4++;
                            }
                            return Integer.valueOf(intValue4);
                        }
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0942l + ", expected child of " + interfaceC0937i0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                if (interfaceC0942l != interfaceC0937i0) {
                }
                break;
            case 9:
                w.x xVar = (w.x) obj;
                w.x xVar2 = (w.x) obj2;
                w.x xVar3 = w.x.f25627c;
                if (xVar == xVar3 && xVar2 == xVar3 && !((w.I) this.f1843b).f25513a.f25543d) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            default:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                z.p0 p0Var = (z.p0) this.f1843b;
                cc.F.B(p0Var.d0(), null, 0, new z.n0(p0Var, floatValue, floatValue2, null), 3);
                return Boolean.TRUE;
        }
    }
}
