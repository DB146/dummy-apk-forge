package S0;

import A9.C0096i1;
import E.g;
import K0.x;
import M0.b;
import N0.e;
import N0.i;
import N0.j;
import N0.k;
import N0.q;
import N0.s;
import Q.C0498k;
import Q.C0506o;
import Q7.h;
import R0.c;
import Rb.f;
import android.graphics.Typeface;
import android.text.Spannable;
import cc.F;
import ec.d;
import i0.C1289b;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import u0.C2080j;
import y.C2289K;
import y.InterfaceC2286H;
import y.InterfaceC2287I;
import z.C2531C;
import z.p0;
import z.r;

/* loaded from: classes.dex */
public final class a extends m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8975c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        super(3);
        this.f8973a = i7;
        this.f8974b = obj;
        this.f8975c = obj2;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f8973a) {
            case 0:
                x xVar = (x) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                q qVar = xVar.f5991f;
                k kVar = xVar.f5988c;
                if (kVar == null) {
                    kVar = k.f7140c;
                }
                i iVar = xVar.f5989d;
                int i7 = iVar != null ? iVar.f7137a : 0;
                j jVar = xVar.f5990e;
                int i10 = jVar != null ? jVar.f7138a : 65535;
                c cVar = (c) ((g) this.f8975c).f3410b;
                s b2 = ((e) cVar.f8787e).b(qVar, kVar, i7, i10);
                if (b2 instanceof s) {
                    typeface = b2.f7153a;
                    l.c(typeface, "null cannot be cast to non-null type android.graphics.Typeface");
                } else {
                    h hVar = new h(b2, cVar.f8792x);
                    cVar.f8792x = hVar;
                    Object obj4 = hVar.f8697d;
                    l.c(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                }
                ((Spannable) this.f8974b).setSpan(new b(typeface, 1), intValue, intValue2, 33);
                return Db.q.f3365a;
            case 1:
                C0506o c0506o = (C0506o) obj2;
                ((Number) obj3).intValue();
                c0506o.S(-353972293);
                InterfaceC2287I a9 = ((InterfaceC2286H) this.f8974b).a((A.i) this.f8975c, c0506o);
                boolean g = c0506o.g(a9);
                Object H10 = c0506o.H();
                if (g || H10 == C0498k.f8409a) {
                    H10 = new C2289K(a9);
                    c0506o.d0(H10);
                }
                C2289K c2289k = (C2289K) H10;
                c0506o.p(false);
                return c2289k;
            default:
                C2080j c2080j = (C2080j) obj;
                C2080j c2080j2 = (C2080j) obj2;
                C1289b c1289b = (C1289b) obj3;
                p0 p0Var = (p0) this.f8974b;
                if (((Boolean) p0Var.f28050F.invoke(c2080j)).booleanValue()) {
                    if (!p0Var.f28055K) {
                        if (p0Var.f28053I == null) {
                            p0Var.f28053I = Q5.e.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, 6);
                        }
                        p0Var.f28055K = true;
                        F.B(p0Var.d0(), null, 0, new C2531C(p0Var, null), 3);
                    }
                    q3.f.e((C0096i1) this.f8975c, c2080j);
                    long d10 = C1289b.d(c2080j2.f24765c, c1289b.f18172a);
                    d dVar = p0Var.f28053I;
                    if (dVar != null) {
                        dVar.h(new r(d10));
                    }
                }
                return Db.q.f3365a;
        }
    }
}
