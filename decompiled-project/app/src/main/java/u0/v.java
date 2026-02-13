package u0;

import cc.C0944m;

/* loaded from: classes.dex */
public final class v implements V0.c, Hb.d {

    /* renamed from: a, reason: collision with root package name */
    public final C0944m f24801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f24802b;

    /* renamed from: c, reason: collision with root package name */
    public C0944m f24803c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC2076f f24804d = EnumC2076f.f24758b;

    /* renamed from: e, reason: collision with root package name */
    public final Hb.j f24805e = Hb.j.f4919a;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f24806f;

    public v(y yVar, C0944m c0944m) {
        this.f24806f = yVar;
        this.f24801a = c0944m;
        this.f24802b = yVar;
    }

    @Override // V0.c
    public final int B(float f4) {
        return this.f24802b.B(f4);
    }

    @Override // V0.c
    public final long G(long j) {
        return this.f24802b.G(j);
    }

    @Override // V0.c
    public final float J(long j) {
        return this.f24802b.J(j);
    }

    @Override // V0.c
    public final long P(float f4) {
        return this.f24802b.P(f4);
    }

    @Override // V0.c
    public final float W(int i7) {
        return this.f24802b.W(i7);
    }

    public final Object a(EnumC2076f enumC2076f, Jb.a aVar) {
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(aVar));
        c0944m.s();
        this.f24804d = enumC2076f;
        this.f24803c = c0944m;
        Object r10 = c0944m.r();
        Ib.a aVar2 = Ib.a.f5345a;
        return r10;
    }

    @Override // V0.c
    public final float a0(float f4) {
        return f4 / this.f24802b.k();
    }

    @Override // V0.c
    public final float f() {
        return this.f24802b.f();
    }

    @Override // Hb.d
    public final Hb.i getContext() {
        return this.f24805e;
    }

    @Override // V0.c
    public final float k() {
        return this.f24802b.k();
    }

    @Override // V0.c
    public final long n(float f4) {
        return this.f24802b.n(f4);
    }

    @Override // V0.c
    public final float p(float f4) {
        return this.f24802b.k() * f4;
    }

    @Override // Hb.d
    public final void resumeWith(Object obj) {
        y yVar = this.f24806f;
        synchronized (yVar.f24817I) {
            yVar.f24816H.k(this);
        }
        this.f24801a.resumeWith(obj);
    }

    @Override // V0.c
    public final float y(long j) {
        return this.f24802b.y(j);
    }
}
