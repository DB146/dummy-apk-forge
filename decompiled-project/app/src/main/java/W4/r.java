package W4;

import P4.c0;
import m5.J;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f10753a;

    /* renamed from: b, reason: collision with root package name */
    public final J f10754b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f10755c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10756d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f10758f;

    public r(s sVar, v vVar, int i7, InterfaceC0586d interfaceC0586d) {
        this.f10758f = sVar;
        this.f10753a = new q(sVar, vVar, i7, interfaceC0586d);
        this.f10754b = new J(h3.o.l(i7, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        c0 c0Var = new c0(sVar.f10769a, null, null);
        this.f10755c = c0Var;
        c0Var.f8002f = sVar.f10771c;
    }

    public final void a() {
        if (this.f10756d) {
            return;
        }
        this.f10753a.f10750b.f10689x = true;
        this.f10756d = true;
        s.u(this.f10758f);
    }

    public final void b() {
        this.f10754b.f(this.f10753a.f10750b, this.f10758f.f10771c, 0);
    }
}
