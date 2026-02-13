package z;

/* loaded from: classes.dex */
public final class r0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f28074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f28075b;

    public r0(w0 w0Var, t0 t0Var) {
        this.f28074a = w0Var;
        this.f28075b = t0Var;
    }

    @Override // z.Z
    public final float a(float f4) {
        float abs = Math.abs(f4);
        w0 w0Var = this.f28074a;
        if (abs != 0.0f && ((f4 > 0.0f && !w0Var.f28121a.c()) || ((f4 < 0.0f && !w0Var.f28121a.b()) || !((Boolean) w0Var.g.invoke()).booleanValue()))) {
            throw new c0.n("The fling animation was cancelled", 4);
        }
        return w0Var.c(w0Var.f(this.f28075b.a(2, w0Var.d(w0Var.g(f4)))));
    }
}
