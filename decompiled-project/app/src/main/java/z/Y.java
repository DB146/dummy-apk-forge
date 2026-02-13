package z;

import mc.C1659d;
import u0.InterfaceC2083m;

/* loaded from: classes.dex */
public final class Y implements V0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2083m f27954a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27955b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27956c;

    /* renamed from: d, reason: collision with root package name */
    public final C1659d f27957d = new C1659d(false);

    public Y(InterfaceC2083m interfaceC2083m) {
        this.f27954a = interfaceC2083m;
    }

    @Override // V0.c
    public final int B(float f4) {
        return this.f27954a.B(f4);
    }

    @Override // V0.c
    public final long G(long j) {
        return this.f27954a.G(j);
    }

    @Override // V0.c
    public final float J(long j) {
        return this.f27954a.J(j);
    }

    @Override // V0.c
    public final long P(float f4) {
        return this.f27954a.P(f4);
    }

    @Override // V0.c
    public final float W(int i7) {
        return this.f27954a.W(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Jb.c cVar) {
        W w10;
        int i7;
        Y y10;
        if (cVar instanceof W) {
            w10 = (W) cVar;
            int i10 = w10.f27949d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w10.f27949d = i10 - Integer.MIN_VALUE;
                Object obj = w10.f27947b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = w10.f27949d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    w10.f27946a = this;
                    w10.f27949d = 1;
                    if (this.f27957d.n(w10) == aVar) {
                        return aVar;
                    }
                    y10 = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y10 = w10.f27946a;
                    com.bumptech.glide.c.c0(obj);
                }
                y10.f27955b = false;
                y10.f27956c = false;
                return Db.q.f3365a;
            }
        }
        w10 = new W(this, cVar);
        Object obj2 = w10.f27947b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = w10.f27949d;
        if (i7 != 0) {
        }
        y10.f27955b = false;
        y10.f27956c = false;
        return Db.q.f3365a;
    }

    @Override // V0.c
    public final float a0(float f4) {
        return f4 / ((u0.y) this.f27954a).k();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Jb.c cVar) {
        X x2;
        int i7;
        Y y10;
        if (cVar instanceof X) {
            x2 = (X) cVar;
            int i10 = x2.f27953d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                x2.f27953d = i10 - Integer.MIN_VALUE;
                Object obj = x2.f27951b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = x2.f27953d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    if (this.f27955b || this.f27956c) {
                        y10 = this;
                        return Boolean.valueOf(y10.f27955b);
                    }
                    x2.f27950a = this;
                    x2.f27953d = 1;
                    if (this.f27957d.n(x2) == aVar) {
                        return aVar;
                    }
                    y10 = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y10 = x2.f27950a;
                    com.bumptech.glide.c.c0(obj);
                }
                y10.f27957d.l(null);
                return Boolean.valueOf(y10.f27955b);
            }
        }
        x2 = new X(this, cVar);
        Object obj2 = x2.f27951b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = x2.f27953d;
        if (i7 != 0) {
        }
        y10.f27957d.l(null);
        return Boolean.valueOf(y10.f27955b);
    }

    @Override // V0.c
    public final float f() {
        return ((u0.y) this.f27954a).f();
    }

    @Override // V0.c
    public final float k() {
        return ((u0.y) this.f27954a).k();
    }

    @Override // V0.c
    public final long n(float f4) {
        return this.f27954a.n(f4);
    }

    @Override // V0.c
    public final float p(float f4) {
        return ((u0.y) this.f27954a).k() * f4;
    }

    @Override // V0.c
    public final float y(long j) {
        return this.f27954a.y(j);
    }
}
