package c0;

import A0.AbstractC0017g;
import A0.InterfaceC0024m;
import A0.K;
import A0.n0;
import A0.q0;
import B0.D;
import cc.B;
import cc.C0943l0;
import cc.E;
import cc.F;
import cc.InterfaceC0937i0;
import hc.C1277e;
import x0.AbstractC2256a;
import y.C2281C;

/* loaded from: classes.dex */
public abstract class l implements InterfaceC0024m {

    /* renamed from: A, reason: collision with root package name */
    public K f14111A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f14112B;

    /* renamed from: b, reason: collision with root package name */
    public C1277e f14114b;

    /* renamed from: c, reason: collision with root package name */
    public int f14115c;

    /* renamed from: e, reason: collision with root package name */
    public l f14117e;

    /* renamed from: f, reason: collision with root package name */
    public l f14118f;

    /* renamed from: u, reason: collision with root package name */
    public q0 f14119u;

    /* renamed from: v, reason: collision with root package name */
    public n0 f14120v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14121w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14122x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14123y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14124z;

    /* renamed from: a, reason: collision with root package name */
    public l f14113a = this;

    /* renamed from: d, reason: collision with root package name */
    public int f14116d = -1;

    public final E d0() {
        C1277e c1277e = this.f14114b;
        if (c1277e != null) {
            return c1277e;
        }
        C1277e b2 = F.b(((D) AbstractC0017g.u(this)).getCoroutineContext().plus(new C0943l0((InterfaceC0937i0) ((D) AbstractC0017g.u(this)).getCoroutineContext().get(B.f14467b))));
        this.f14114b = b2;
        return b2;
    }

    public boolean e0() {
        return !(this instanceof C2281C);
    }

    public void f0() {
        if (this.f14112B) {
            AbstractC2256a.b("node attached multiple times");
        }
        if (this.f14120v == null) {
            AbstractC2256a.b("attach invoked on a node without a coordinator");
        }
        this.f14112B = true;
        this.f14123y = true;
    }

    public void g0() {
        if (!this.f14112B) {
            AbstractC2256a.b("Cannot detach a node that is not attached");
        }
        if (this.f14123y) {
            AbstractC2256a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f14124z) {
            AbstractC2256a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f14112B = false;
        C1277e c1277e = this.f14114b;
        if (c1277e != null) {
            F.i(c1277e, new n("The Modifier.Node was detached", 0));
            this.f14114b = null;
        }
    }

    public void h0() {
    }

    public void i0() {
    }

    public void j0() {
    }

    public void k0() {
        if (!this.f14112B) {
            AbstractC2256a.b("reset() called on an unattached node");
        }
        j0();
    }

    public void l0() {
        if (!this.f14112B) {
            AbstractC2256a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f14123y) {
            AbstractC2256a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f14123y = false;
        h0();
        this.f14124z = true;
    }

    public void m0() {
        if (!this.f14112B) {
            AbstractC2256a.b("node detached multiple times");
        }
        if (this.f14120v == null) {
            AbstractC2256a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f14124z) {
            AbstractC2256a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f14124z = false;
        K k = this.f14111A;
        if (k != null) {
            k.invoke();
        }
        i0();
    }

    public void n0(l lVar) {
        this.f14113a = lVar;
    }

    public void o0(n0 n0Var) {
        this.f14120v = n0Var;
    }
}
