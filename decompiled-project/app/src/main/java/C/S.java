package C;

import B0.C0170c0;
import Q.C0498k;
import Q.C0506o;
import x.i0;
import y.InterfaceC2286H;
import y.InterfaceC2291M;
import y0.AbstractC2323H;
import y0.InterfaceC2318C;

/* loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.m implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(Object obj, int i7) {
        super(3);
        this.f2388a = i7;
        this.f2389b = obj;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j;
        A.i iVar;
        switch (this.f2388a) {
            case 0:
                C0506o c0506o = (C0506o) obj2;
                ((Number) obj3).intValue();
                c0506o.S(-1608161351);
                Rb.c cVar = (Rb.c) this.f2389b;
                boolean g = c0506o.g(cVar);
                Object H10 = c0506o.H();
                if (g || H10 == C0498k.f8409a) {
                    H10 = new v(cVar);
                    c0506o.d0(H10);
                }
                v vVar = (v) H10;
                c0506o.p(false);
                return vVar;
            case 1:
                AbstractC2323H b2 = ((y0.z) obj2).b(((V0.a) obj3).f9967a);
                return ((InterfaceC2318C) obj).Q(b2.f26554a, b2.f26555b, Eb.w.f3892a, new C0170c0(26, b2, (w.w) this.f2389b));
            case 2:
                InterfaceC2318C interfaceC2318C = (InterfaceC2318C) obj;
                AbstractC2323H b10 = ((y0.z) obj2).b(((V0.a) obj3).f9967a);
                if (interfaceC2318C.m()) {
                    Boolean bool = (Boolean) ((i0) this.f2389b).f26102d.getValue();
                    bool.booleanValue();
                    if (!bool.booleanValue()) {
                        j = 0;
                        return interfaceC2318C.Q((int) (j >> 32), (int) (4294967295L & j), Eb.w.f3892a, new C0225j(b10, 6));
                    }
                }
                j = (b10.f26554a << 32) | (b10.f26555b & 4294967295L);
                return interfaceC2318C.Q((int) (j >> 32), (int) (4294967295L & j), Eb.w.f3892a, new C0225j(b10, 6));
            default:
                C0506o c0506o2 = (C0506o) obj2;
                ((Number) obj3).intValue();
                c0506o2.S(-756081143);
                InterfaceC2286H interfaceC2286H = (InterfaceC2286H) c0506o2.k(androidx.compose.foundation.c.f13141a);
                if (interfaceC2286H instanceof InterfaceC2291M) {
                    c0506o2.S(617653824);
                    c0506o2.p(false);
                    iVar = null;
                } else {
                    c0506o2.S(617786442);
                    Object H11 = c0506o2.H();
                    if (H11 == C0498k.f8409a) {
                        H11 = new A.i();
                        c0506o2.d0(H11);
                    }
                    iVar = (A.i) H11;
                    c0506o2.p(false);
                }
                c0.m b11 = androidx.compose.foundation.a.b(c0.j.f14110a, iVar, interfaceC2286H, (Rb.a) this.f2389b);
                c0506o2.p(false);
                return b11;
        }
    }
}
