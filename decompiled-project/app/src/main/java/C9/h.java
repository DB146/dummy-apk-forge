package C9;

import G3.C;
import G3.C0281c;
import G3.s;
import G3.t;
import G3.y;
import Q.C0480b;
import W1.o0;
import W3.o;
import Y5.A;
import Y5.B;
import Y5.C0640o0;
import Y5.C0646q0;
import Y5.InterfaceC0661y0;
import Y5.W;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import g3.C1191j;
import i2.C1332t;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.l;
import m4.C1549C;
import m4.C1558a0;
import m4.K0;
import m4.L0;
import m4.x0;
import n5.D;
import qb.q;
import qb.r;
import vb.n;
import x.i0;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class h implements t, InterfaceC0661y0, x0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f3094a;

    public h(int i7) {
        switch (i7) {
            case 3:
                return;
            case 9:
                this.f3094a = new K0();
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                this.f3094a = C0480b.o(Boolean.FALSE);
                return;
            default:
                char[] cArr = o.f10619a;
                this.f3094a = new ArrayDeque(20);
                return;
        }
    }

    public h(o0 operation) {
        l.e(operation, "operation");
        this.f3094a = operation;
    }

    public h(C0646q0 c0646q0) {
        G.g(c0646q0);
        this.f3094a = c0646q0;
    }

    public /* synthetic */ h(Object obj) {
        this.f3094a = obj;
    }

    public void A() {
        int e2;
        int e10;
        C1549C c1549c = (C1549C) this;
        if (c1549c.Y().p() || c1549c.g0()) {
            return;
        }
        L0 Y2 = c1549c.Y();
        if (Y2.p()) {
            e2 = -1;
        } else {
            int U8 = c1549c.U();
            c1549c.E0();
            int i7 = c1549c.f19833R;
            if (i7 == 1) {
                i7 = 0;
            }
            c1549c.E0();
            e2 = Y2.e(c1549c.f19834S, U8, i7);
        }
        if (!(e2 != -1)) {
            if (q() && p()) {
                y(c1549c.U(), -9223372036854775807L, false);
                return;
            }
            return;
        }
        L0 Y10 = c1549c.Y();
        if (Y10.p()) {
            e10 = -1;
        } else {
            int U10 = c1549c.U();
            c1549c.E0();
            int i10 = c1549c.f19833R;
            if (i10 == 1) {
                i10 = 0;
            }
            c1549c.E0();
            e10 = Y10.e(c1549c.f19834S, U10, i10);
        }
        if (e10 == -1) {
            return;
        }
        if (e10 == c1549c.U()) {
            y(c1549c.U(), -9223372036854775807L, true);
        } else {
            y(e10, -9223372036854775807L, false);
        }
    }

    public void B(int i7, long j) {
        C1549C c1549c = (C1549C) this;
        long W10 = c1549c.W() + j;
        long b02 = c1549c.b0();
        if (b02 != -9223372036854775807L) {
            W10 = Math.min(W10, b02);
        }
        z(i7, Math.max(W10, 0L));
    }

    public void C() {
        int k;
        int k7;
        int k10;
        C1549C c1549c = (C1549C) this;
        if (c1549c.Y().p() || c1549c.g0()) {
            return;
        }
        L0 Y2 = c1549c.Y();
        if (Y2.p()) {
            k = -1;
        } else {
            int U8 = c1549c.U();
            c1549c.E0();
            int i7 = c1549c.f19833R;
            if (i7 == 1) {
                i7 = 0;
            }
            c1549c.E0();
            k = Y2.k(c1549c.f19834S, U8, i7);
        }
        boolean z8 = k != -1;
        if (q() && !r()) {
            if (z8) {
                L0 Y10 = c1549c.Y();
                if (Y10.p()) {
                    k10 = -1;
                } else {
                    int U10 = c1549c.U();
                    c1549c.E0();
                    int i10 = c1549c.f19833R;
                    if (i10 == 1) {
                        i10 = 0;
                    }
                    c1549c.E0();
                    k10 = Y10.k(c1549c.f19834S, U10, i10);
                }
                if (k10 == -1) {
                    return;
                }
                if (k10 == c1549c.U()) {
                    y(c1549c.U(), -9223372036854775807L, true);
                    return;
                } else {
                    y(k10, -9223372036854775807L, false);
                    return;
                }
            }
            return;
        }
        if (z8) {
            long W10 = c1549c.W();
            c1549c.E0();
            if (W10 <= 3000) {
                L0 Y11 = c1549c.Y();
                if (Y11.p()) {
                    k7 = -1;
                } else {
                    int U11 = c1549c.U();
                    c1549c.E0();
                    int i11 = c1549c.f19833R;
                    if (i11 == 1) {
                        i11 = 0;
                    }
                    c1549c.E0();
                    k7 = Y11.k(c1549c.f19834S, U11, i11);
                }
                if (k7 == -1) {
                    return;
                }
                if (k7 == c1549c.U()) {
                    y(c1549c.U(), -9223372036854775807L, true);
                    return;
                } else {
                    y(k7, -9223372036854775807L, false);
                    return;
                }
            }
        }
        z(7, 0L);
    }

    public abstract void D(Object obj);

    public void E(Uri uri) {
        ((ContentValues) this.f3094a).put("poster_art_uri", uri == null ? null : uri.toString());
    }

    public void F(boolean z8) {
        ((ContentValues) this.f3094a).put("searchable", Integer.valueOf(z8 ? 1 : 0));
    }

    public void G(Uri uri) {
        ((ContentValues) this.f3094a).put("thumbnail_uri", uri == null ? null : uri.toString());
    }

    public abstract void H(i0 i0Var);

    public abstract void I();

    public void J() {
        C0640o0 c0640o0 = ((C0646q0) this.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
    }

    @Override // Y5.InterfaceC0661y0
    public W b() {
        throw null;
    }

    @Override // Y5.InterfaceC0661y0
    public C0640o0 c() {
        throw null;
    }

    @Override // Y5.InterfaceC0661y0
    public Context d() {
        throw null;
    }

    @Override // Y5.InterfaceC0661y0
    public M5.a e() {
        throw null;
    }

    @Override // Y5.InterfaceC0661y0
    public C1332t f() {
        throw null;
    }

    public abstract void g(r8.o oVar);

    public r h(Map map) {
        gb.f v10 = v(map);
        v10.getClass();
        n nVar = Ab.e.f1561c;
        q d10 = v10.d(nVar);
        Objects.requireNonNull(nVar, "scheduler is null");
        q qVar = new q(d10, nVar, 0);
        C1191j c1191j = new C1191j(this, 16);
        B b2 = lb.b.f19615d;
        A a9 = lb.b.f19614c;
        return new r(qVar, c1191j, b2, a9, a9);
    }

    public abstract String i();

    public long j() {
        C1549C c1549c = (C1549C) this;
        L0 Y2 = c1549c.Y();
        if (Y2.p()) {
            return -9223372036854775807L;
        }
        return D.Z(Y2.m(c1549c.U(), (K0) this.f3094a, 0L).f20015B);
    }

    public C1558a0 k() {
        C1549C c1549c = (C1549C) this;
        L0 Y2 = c1549c.Y();
        if (Y2.p()) {
            return null;
        }
        return Y2.m(c1549c.U(), (K0) this.f3094a, 0L).f20021c;
    }

    public abstract Object l();

    @Override // G3.t
    public s m(y yVar) {
        return new C0281c((C) this.f3094a, 2);
    }

    public abstract Object n();

    public boolean o(int i7) {
        C1549C c1549c = (C1549C) this;
        c1549c.E0();
        return c1549c.f19841Z.f20505a.f21175a.get(i7);
    }

    public boolean p() {
        C1549C c1549c = (C1549C) this;
        L0 Y2 = c1549c.Y();
        return !Y2.p() && Y2.m(c1549c.U(), (K0) this.f3094a, 0L).f20027w;
    }

    public boolean q() {
        C1549C c1549c = (C1549C) this;
        L0 Y2 = c1549c.Y();
        return !Y2.p() && Y2.m(c1549c.U(), (K0) this.f3094a, 0L).a();
    }

    public boolean r() {
        C1549C c1549c = (C1549C) this;
        L0 Y2 = c1549c.Y();
        return !Y2.p() && Y2.m(c1549c.U(), (K0) this.f3094a, 0L).f20026v;
    }

    public boolean s() {
        C1549C c1549c = (C1549C) this;
        if (c1549c.d0() == 3 && c1549c.c0()) {
            c1549c.E0();
            if (c1549c.f19872w0.f20491m == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        o0 o0Var = (o0) this.f3094a;
        View view = o0Var.f10533c.f10277U;
        int g = view != null ? u0.g(view) : 0;
        int i7 = o0Var.f10531a;
        return g == i7 || !(g == 2 || i7 == 2);
    }

    public void u(D3.h hVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3094a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(hVar);
        }
    }

    public abstract gb.f v(Map map);

    public void w() {
        C1549C c1549c = (C1549C) this;
        c1549c.E0();
        B(11, -c1549c.f19824H);
    }

    public void x() {
        C1549C c1549c = (C1549C) this;
        c1549c.E0();
        B(12, c1549c.f19825I);
    }

    public abstract void y(int i7, long j, boolean z8);

    public void z(int i7, long j) {
        y(((C1549C) this).U(), j, false);
    }
}
