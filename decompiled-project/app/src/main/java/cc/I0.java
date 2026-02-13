package cc;

/* loaded from: classes2.dex */
public final class I0 extends hc.t implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f14484e;

    public I0(long j, Jb.c cVar) {
        super(cVar, cVar.getContext());
        this.f14484e = j;
    }

    @Override // cc.w0
    public final String L() {
        return super.L() + "(timeMillis=" + this.f14484e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        F.p(this.f14514c);
        p(new H0(X.c.f(this.f14484e, " ms", new StringBuilder("Timed out waiting for ")), this));
    }
}
