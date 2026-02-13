package cc;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class O implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final A f14495a;

    public O(A a9) {
        this.f14495a = a9;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Hb.j jVar = Hb.j.f4919a;
        A a9 = this.f14495a;
        if (a9.V(jVar)) {
            a9.T(jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f14495a.toString();
    }
}
