package M;

import A0.AbstractC0017g;
import A0.InterfaceC0023l;
import A0.InterfaceC0026o;
import A0.InterfaceC0034x;
import A0.J;
import A0.N;
import E.u;
import N.C0418h;
import a.AbstractC0672a;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cc.F;
import j0.AbstractC1365c;
import java.util.LinkedHashMap;
import t8.C2034c;
import u.C2042E;

/* loaded from: classes.dex */
public final class b extends c0.l implements i, InterfaceC0023l, InterfaceC0026o, InterfaceC0034x {

    /* renamed from: C, reason: collision with root package name */
    public final A.i f6472C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f6473D;

    /* renamed from: E, reason: collision with root package name */
    public final float f6474E;

    /* renamed from: F, reason: collision with root package name */
    public final C2034c f6475F;

    /* renamed from: G, reason: collision with root package name */
    public final C0418h f6476G;

    /* renamed from: H, reason: collision with root package name */
    public u f6477H;

    /* renamed from: I, reason: collision with root package name */
    public float f6478I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f6480K;

    /* renamed from: M, reason: collision with root package name */
    public h f6481M;

    /* renamed from: N, reason: collision with root package name */
    public j f6482N;

    /* renamed from: J, reason: collision with root package name */
    public long f6479J = 0;
    public final C2042E L = new C2042E();

    public b(A.i iVar, boolean z8, float f4, C2034c c2034c, C0418h c0418h) {
        this.f6472C = iVar;
        this.f6473D = z8;
        this.f6474E = f4;
        this.f6475F = c2034c;
        this.f6476G = c0418h;
    }

    @Override // M.i
    public final void N() {
        this.f6482N = null;
        AbstractC0017g.k(this);
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    @Override // c0.l
    public final void h0() {
        F.B(d0(), null, 0, new l(this, null), 3);
    }

    @Override // c0.l
    public final void i0() {
        h hVar = this.f6481M;
        if (hVar != null) {
            N();
            q3.c cVar = hVar.f6497d;
            j jVar = (j) ((LinkedHashMap) cVar.f23371b).get(this);
            if (jVar != null) {
                jVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f23371b;
                j jVar2 = (j) linkedHashMap.get(this);
                if (jVar2 != null) {
                }
                linkedHashMap.remove(this);
                hVar.f6496c.add(jVar);
            }
        }
    }

    @Override // A0.InterfaceC0034x
    public final void l(long j) {
        this.f6480K = true;
        V0.c cVar = AbstractC0017g.t(this).L;
        this.f6479J = AbstractC0672a.u(j);
        float f4 = this.f6474E;
        this.f6478I = Float.isNaN(f4) ? g.a(cVar, this.f6473D, this.f6479J) : cVar.p(f4);
        C2042E c2042e = this.L;
        Object[] objArr = c2042e.f24584a;
        int i7 = c2042e.f24585b;
        for (int i10 = 0; i10 < i7; i10++) {
            p0((A.m) objArr[i10]);
        }
        c2042e.c();
    }

    public final void p0(A.m mVar) {
        if (!(mVar instanceof A.k)) {
            if (mVar instanceof A.l) {
                A.k kVar = ((A.l) mVar).f7a;
                j jVar = this.f6482N;
                if (jVar != null) {
                    jVar.d();
                    return;
                }
                return;
            }
            if (mVar instanceof A.j) {
                A.k kVar2 = ((A.j) mVar).f5a;
                j jVar2 = this.f6482N;
                if (jVar2 != null) {
                    jVar2.d();
                    return;
                }
                return;
            }
            return;
        }
        A.k kVar3 = (A.k) mVar;
        long j = this.f6479J;
        float f4 = this.f6478I;
        h hVar = this.f6481M;
        if (hVar == null) {
            hVar = q3.f.c(q3.f.d((View) AbstractC0017g.h(this, AndroidCompositionLocals_androidKt.f13211f)));
            this.f6481M = hVar;
            kotlin.jvm.internal.l.b(hVar);
        }
        j a9 = hVar.a(this);
        int F10 = Tb.a.F(f4);
        long b2 = this.f6475F.b();
        this.f6476G.invoke();
        a9.b(kVar3, this.f6473D, j, F10, b2, 0.1f, new J(this, 7));
        this.f6482N = a9;
        AbstractC0017g.k(this);
    }

    @Override // A0.InterfaceC0026o
    public final void t(N n6) {
        n6.a();
        u uVar = this.f6477H;
        if (uVar != null) {
            uVar.a(this.f6478I, this.f6475F.b(), n6);
        }
        j0.l x2 = n6.f90a.f19142b.x();
        j jVar = this.f6482N;
        if (jVar != null) {
            long j = this.f6479J;
            int F10 = Tb.a.F(this.f6478I);
            long b2 = this.f6475F.b();
            this.f6476G.invoke();
            jVar.e(j, F10, b2, 0.1f);
            jVar.draw(AbstractC1365c.a(x2));
        }
    }
}
