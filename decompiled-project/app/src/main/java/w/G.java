package w;

import C.C0225j;
import x.a0;
import x.b0;
import x.i0;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class G extends M {

    /* renamed from: C, reason: collision with root package name */
    public i0 f25500C;

    /* renamed from: D, reason: collision with root package name */
    public b0 f25501D;

    /* renamed from: E, reason: collision with root package name */
    public b0 f25502E;

    /* renamed from: F, reason: collision with root package name */
    public H f25503F;

    /* renamed from: G, reason: collision with root package name */
    public I f25504G;

    /* renamed from: H, reason: collision with root package name */
    public Rb.a f25505H;

    /* renamed from: I, reason: collision with root package name */
    public y f25506I;

    /* renamed from: J, reason: collision with root package name */
    public long f25507J = androidx.compose.animation.c.f13124a;

    /* renamed from: K, reason: collision with root package name */
    public c0.e f25508K;
    public final F L;

    public G(i0 i0Var, b0 b0Var, b0 b0Var2, H h10, I i7, Rb.a aVar, y yVar) {
        this.f25500C = i0Var;
        this.f25501D = b0Var;
        this.f25502E = b0Var2;
        this.f25503F = h10;
        this.f25504G = i7;
        this.f25505H = aVar;
        this.f25506I = yVar;
        V0.b.b(0, 0, 15);
        this.L = new F(this, 0);
        new F(this, 1);
    }

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(A0.T t5, y0.z zVar, long j) {
        j0.G g;
        if (this.f25500C.f26099a.l() == this.f25500C.f26102d.getValue()) {
            this.f25508K = null;
        } else if (this.f25508K == null) {
            c0.e p02 = p0();
            if (p02 == null) {
                p02 = c0.b.f14089a;
            }
            this.f25508K = p02;
        }
        boolean m10 = t5.m();
        Eb.w wVar = Eb.w.f3892a;
        if (m10) {
            AbstractC2323H b2 = zVar.b(j);
            long j10 = (b2.f26554a << 32) | (b2.f26555b & 4294967295L);
            this.f25507J = j10;
            return t5.Q((int) (j10 >> 32), (int) (4294967295L & j10), wVar, new C0225j(b2, 7));
        }
        if (!((Boolean) this.f25505H.invoke()).booleanValue()) {
            AbstractC2323H b10 = zVar.b(j);
            return t5.Q(b10.f26554a, b10.f26555b, wVar, new C0225j(b10, 8));
        }
        y yVar = this.f25506I;
        b0 b0Var = yVar.f25629a;
        H h10 = yVar.f25632d;
        I i7 = yVar.f25633e;
        a0 a9 = b0Var != null ? b0Var.a(new z(h10, i7, 0), new z(h10, i7, 1)) : null;
        b0 b0Var2 = yVar.f25630b;
        a0 a10 = b0Var2 != null ? b0Var2.a(new z(h10, i7, 2), new z(h10, i7, 3)) : null;
        Object l10 = yVar.f25631c.f26099a.l();
        x xVar = x.f25625a;
        V v10 = h10.f25510a;
        if (l10 == xVar) {
            N n6 = v10.f25542c;
            if (n6 != null) {
                g = new j0.G(n6.f25519a);
            } else {
                N n8 = i7.f25513a.f25542c;
                if (n8 != null) {
                    g = new j0.G(n8.f25519a);
                }
                g = null;
            }
        } else {
            N n10 = i7.f25513a.f25542c;
            if (n10 != null) {
                g = new j0.G(n10.f25519a);
            } else {
                N n11 = v10.f25542c;
                if (n11 != null) {
                    g = new j0.G(n11.f25519a);
                }
                g = null;
            }
        }
        b0 b0Var3 = yVar.f25634f;
        C.D d10 = new C.D(a9, a10, b0Var3 != null ? b0Var3.a(C2176c.f25553u, new C.D(g, h10, i7, 8)) : null, 7);
        AbstractC2323H b11 = zVar.b(j);
        long j11 = (b11.f26554a << 32) | (b11.f26555b & 4294967295L);
        long j12 = !V0.k.a(this.f25507J, androidx.compose.animation.c.f13124a) ? this.f25507J : j11;
        b0 b0Var4 = this.f25501D;
        a0 a11 = b0Var4 != null ? b0Var4.a(this.L, new E(this, j12, 0)) : null;
        if (a11 != null) {
            j11 = ((V0.k) a11.getValue()).f9981a;
        }
        long d11 = V0.b.d(j, j11);
        b0 b0Var5 = this.f25502E;
        long j13 = b0Var5 != null ? ((V0.i) b0Var5.a(C2176c.f25556x, new E(this, j12, 1)).getValue()).f9975a : 0L;
        c0.e eVar = this.f25508K;
        return t5.Q((int) (d11 >> 32), (int) (4294967295L & d11), wVar, new D(b11, V0.i.c(eVar != null ? eVar.a(j12, d11, V0.l.f9982a) : 0L, 0L), j13, d10));
    }

    @Override // c0.l
    public final void h0() {
        this.f25507J = androidx.compose.animation.c.f13124a;
    }

    public final c0.e p0() {
        if (this.f25500C.f().b(x.f25625a, x.f25626b)) {
            C2194v c2194v = this.f25503F.f25510a.f25541b;
            if (c2194v == null && (c2194v = this.f25504G.f25513a.f25541b) == null) {
                return null;
            }
            return c2194v.f25618a;
        }
        C2194v c2194v2 = this.f25504G.f25513a.f25541b;
        if (c2194v2 == null && (c2194v2 = this.f25503F.f25510a.f25541b) == null) {
            return null;
        }
        return c2194v2.f25618a;
    }
}
