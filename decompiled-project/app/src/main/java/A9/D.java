package A9;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes2.dex */
public class D extends E {

    /* renamed from: F0, reason: collision with root package name */
    public Object f786F0;

    /* renamed from: r0, reason: collision with root package name */
    public final D9.b f788r0 = new D9.b("START", true, false);

    /* renamed from: s0, reason: collision with root package name */
    public final D9.b f789s0 = new D9.b("ENTRANCE_INIT");

    /* renamed from: t0, reason: collision with root package name */
    public final A f790t0 = new A(this, 0);

    /* renamed from: u0, reason: collision with root package name */
    public final A f791u0 = new A(this, 1);

    /* renamed from: v0, reason: collision with root package name */
    public final A f792v0 = new A(this, 2);

    /* renamed from: w0, reason: collision with root package name */
    public final A f793w0 = new A(this, 3);

    /* renamed from: x0, reason: collision with root package name */
    public final D9.b f794x0 = new D9.b("ENTRANCE_COMPLETE", true, false);

    /* renamed from: y0, reason: collision with root package name */
    public final D9.a f795y0 = new D9.a("onCreate", false);

    /* renamed from: z0, reason: collision with root package name */
    public final D9.a f796z0 = new D9.a("onCreateView", false);

    /* renamed from: A0, reason: collision with root package name */
    public final D9.a f782A0 = new D9.a("prepareEntranceTransition", false);

    /* renamed from: B0, reason: collision with root package name */
    public final D9.a f783B0 = new D9.a("startEntranceTransition", false);
    public final D9.a C0 = new D9.a("onEntranceTransitionEnd", false);

    /* renamed from: D0, reason: collision with root package name */
    public final d3 f784D0 = new Object();

    /* renamed from: E0, reason: collision with root package name */
    public final D9.d f785E0 = new D9.d(0);

    /* renamed from: G0, reason: collision with root package name */
    public final c2.u f787G0 = new c2.u();

    @Override // W1.C
    public void S(Bundle bundle) {
        t0();
        u0();
        D9.d dVar = this.f785E0;
        dVar.f3304d.addAll(dVar.f3302b);
        dVar.i();
        super.S(bundle);
        dVar.g(this.f795y0);
    }

    @Override // A9.E, W1.C
    public void d0(View view, Bundle bundle) {
        super.d0(view, bundle);
        this.f785E0.g(this.f796z0);
    }

    public Object s0() {
        return null;
    }

    public void t0() {
        D9.b bVar = this.f788r0;
        D9.d dVar = this.f785E0;
        dVar.a(bVar);
        dVar.a(this.f789s0);
        dVar.a(this.f790t0);
        dVar.a(this.f791u0);
        dVar.a(this.f792v0);
        dVar.a(this.f793w0);
        dVar.a(this.f794x0);
    }

    public void u0() {
        D9.b bVar = this.f788r0;
        D9.b bVar2 = this.f789s0;
        this.f785E0.getClass();
        D9.d.d(bVar, bVar2, this.f795y0);
        D9.b bVar3 = this.f794x0;
        D9.c cVar = new D9.c(bVar2, bVar3, this.f784D0);
        bVar3.a(cVar);
        bVar2.b(cVar);
        D9.a aVar = this.f796z0;
        D9.d.d(bVar2, bVar3, aVar);
        D9.a aVar2 = this.f782A0;
        A a9 = this.f790t0;
        D9.d.d(bVar2, a9, aVar2);
        A a10 = this.f791u0;
        D9.d.d(a9, a10, aVar);
        D9.a aVar3 = this.f783B0;
        A a11 = this.f792v0;
        D9.d.d(a9, a11, aVar3);
        D9.d.c(a10, a11);
        D9.a aVar4 = this.C0;
        A a12 = this.f793w0;
        D9.d.d(a11, a12, aVar4);
        D9.d.c(a12, bVar3);
    }

    public void v0() {
    }

    public void w0() {
    }

    public void x0() {
    }

    public void y0(Object obj) {
    }
}
