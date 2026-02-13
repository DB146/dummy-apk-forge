package r3;

import h3.z;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final s f23691a;

    /* renamed from: b, reason: collision with root package name */
    public final q3.j f23692b;

    public r(s sVar, q3.j jVar) {
        this.f23691a = sVar;
        this.f23692b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f23691a.f23697d) {
            try {
                if (((r) this.f23691a.f23695b.remove(this.f23692b)) != null) {
                    q qVar = (q) this.f23691a.f23696c.remove(this.f23692b);
                    if (qVar != null) {
                        q3.j jVar = this.f23692b;
                        k3.f fVar = (k3.f) qVar;
                        z.e().a(k3.f.f18823C, "Exceeded time limits on execution for " + jVar);
                        fVar.f18833v.execute(new k3.e(fVar, 0));
                    }
                } else {
                    z.e().a("WrkTimerRunnable", "Timer with " + this.f23692b + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
