package M;

import A0.J;
import A0.N;
import E.u;
import Q.C0480b;
import Q.C0487e0;
import Q.W;
import Q.v0;
import android.view.ViewGroup;
import j0.AbstractC1365c;
import java.util.LinkedHashMap;
import l0.C1443b;
import y.InterfaceC2287I;

/* loaded from: classes.dex */
public final class a implements v0, i, InterfaceC2287I {

    /* renamed from: a, reason: collision with root package name */
    public final u f6460a;

    /* renamed from: d, reason: collision with root package name */
    public final W f6463d;

    /* renamed from: e, reason: collision with root package name */
    public final W f6464e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f6465f;

    /* renamed from: u, reason: collision with root package name */
    public h f6466u;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6461b = true;

    /* renamed from: c, reason: collision with root package name */
    public final float f6462c = Float.NaN;

    /* renamed from: v, reason: collision with root package name */
    public final C0487e0 f6467v = C0480b.o(null);

    /* renamed from: w, reason: collision with root package name */
    public final C0487e0 f6468w = C0480b.o(Boolean.TRUE);

    /* renamed from: x, reason: collision with root package name */
    public long f6469x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f6470y = -1;

    /* renamed from: z, reason: collision with root package name */
    public final J f6471z = new J(this, 6);

    public a(W w10, W w11, ViewGroup viewGroup) {
        this.f6460a = new u(true, new E.l(w11, 2));
        this.f6463d = w10;
        this.f6464e = w11;
        this.f6465f = viewGroup;
    }

    @Override // M.i
    public final void N() {
        this.f6467v.setValue(null);
    }

    @Override // y.InterfaceC2287I
    public final void a(N n6) {
        C1443b c1443b = n6.f90a;
        this.f6469x = c1443b.v();
        float f4 = this.f6462c;
        this.f6470y = Float.isNaN(f4) ? Tb.a.F(g.a(n6, this.f6461b, c1443b.v())) : c1443b.B(f4);
        long j = ((j0.n) this.f6463d.getValue()).f18554a;
        float f10 = ((f) this.f6464e.getValue()).f6492d;
        n6.a();
        this.f6460a.a(Float.isNaN(f4) ? g.a(n6, true, c1443b.v()) : n6.p(f4), j, n6);
        j0.l x2 = c1443b.f19142b.x();
        ((Boolean) this.f6468w.getValue()).booleanValue();
        j jVar = (j) this.f6467v.getValue();
        if (jVar != null) {
            jVar.e(c1443b.v(), this.f6470y, j, f10);
            jVar.draw(AbstractC1365c.a(x2));
        }
    }

    @Override // Q.v0
    public final void b() {
    }

    @Override // Q.v0
    public final void c() {
        h hVar = this.f6466u;
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

    @Override // Q.v0
    public final void d() {
        h hVar = this.f6466u;
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
}
