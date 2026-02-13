package A0;

import java.util.LinkedHashMap;
import u.C2041D;
import y0.InterfaceC2317B;
import y0.InterfaceC2345m;

/* loaded from: classes.dex */
public abstract class U extends T implements y0.z {

    /* renamed from: B, reason: collision with root package name */
    public LinkedHashMap f120B;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC2317B f122D;

    /* renamed from: E, reason: collision with root package name */
    public final C2041D f123E;

    /* renamed from: z, reason: collision with root package name */
    public final n0 f124z;

    /* renamed from: A, reason: collision with root package name */
    public long f119A = 0;

    /* renamed from: C, reason: collision with root package name */
    public final y0.y f121C = new y0.y(this);

    public U(n0 n0Var) {
        this.f124z = n0Var;
        C2041D c2041d = u.N.f24629a;
        this.f123E = new C2041D();
    }

    public static final void h0(U u3, InterfaceC2317B interfaceC2317B) {
        Db.q qVar;
        LinkedHashMap linkedHashMap;
        if (interfaceC2317B != null) {
            u3.N((interfaceC2317B.getHeight() & 4294967295L) | (interfaceC2317B.getWidth() << 32));
            qVar = Db.q.f3365a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            u3.N(0L);
        }
        if (!kotlin.jvm.internal.l.a(u3.f122D, interfaceC2317B) && interfaceC2317B != null && ((((linkedHashMap = u3.f120B) != null && !linkedHashMap.isEmpty()) || !interfaceC2317B.a().isEmpty()) && !kotlin.jvm.internal.l.a(interfaceC2317B.a(), u3.f120B))) {
            Y y10 = u3.f124z.f293z.f61T.f106q;
            kotlin.jvm.internal.l.b(y10);
            y10.f138E.f();
            LinkedHashMap linkedHashMap2 = u3.f120B;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                u3.f120B = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC2317B.a());
        }
        u3.f122D = interfaceC2317B;
    }

    @Override // y0.AbstractC2323H
    public final void M(long j, float f4, Rb.c cVar) {
        j0(j);
        if (this.f114u) {
            return;
        }
        i0();
    }

    @Override // A0.T
    public final T U() {
        n0 n0Var = this.f124z.f274A;
        if (n0Var != null) {
            return n0Var.r0();
        }
        return null;
    }

    @Override // A0.T
    public final InterfaceC2345m V() {
        return this.f121C;
    }

    @Override // A0.T
    public final boolean Z() {
        return this.f122D != null;
    }

    @Override // A0.T
    public final L b0() {
        return this.f124z.f293z;
    }

    @Override // A0.T
    public final InterfaceC2317B c0() {
        InterfaceC2317B interfaceC2317B = this.f122D;
        if (interfaceC2317B != null) {
            return interfaceC2317B;
        }
        throw X.c.c("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // y0.AbstractC2323H, y0.z
    public final Object d() {
        return this.f124z.d();
    }

    @Override // A0.T
    public final T d0() {
        n0 n0Var = this.f124z.f275B;
        if (n0Var != null) {
            return n0Var.r0();
        }
        return null;
    }

    @Override // A0.T
    public final long e0() {
        return this.f119A;
    }

    @Override // V0.c
    public final float f() {
        return this.f124z.f();
    }

    @Override // A0.T
    public final void g0() {
        M(this.f119A, 0.0f, null);
    }

    @Override // y0.InterfaceC2318C
    public final V0.l getLayoutDirection() {
        return this.f124z.f293z.f54M;
    }

    public void i0() {
        c0().b();
    }

    public final void j0(long j) {
        if (!V0.i.a(this.f119A, j)) {
            this.f119A = j;
            n0 n0Var = this.f124z;
            Y y10 = n0Var.f293z.f61T.f106q;
            if (y10 != null) {
                y10.T();
            }
            T.f0(n0Var);
        }
        if (this.f115v) {
            return;
        }
        S(new x0(c0(), this));
    }

    @Override // V0.c
    public final float k() {
        return this.f124z.k();
    }

    public final long k0(U u3, boolean z8) {
        long j = 0;
        U u10 = this;
        while (!u10.equals(u3)) {
            if (!u10.f113f || !z8) {
                j = V0.i.c(j, u10.f119A);
            }
            n0 n0Var = u10.f124z.f275B;
            kotlin.jvm.internal.l.b(n0Var);
            u10 = n0Var.r0();
            kotlin.jvm.internal.l.b(u10);
        }
        return j;
    }

    @Override // A0.T, y0.InterfaceC2318C
    public final boolean m() {
        return true;
    }
}
