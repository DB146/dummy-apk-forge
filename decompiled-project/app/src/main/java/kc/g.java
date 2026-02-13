package kc;

import cc.AbstractC0923b0;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class g extends AbstractC0923b0 {

    /* renamed from: c, reason: collision with root package name */
    public ExecutorC1439b f19100c;

    @Override // cc.A
    public final void T(Hb.i iVar, Runnable runnable) {
        ExecutorC1439b.F(this.f19100c, runnable, 6);
    }

    @Override // cc.A
    public final void U(Hb.i iVar, Runnable runnable) {
        ExecutorC1439b.F(this.f19100c, runnable, 2);
    }

    @Override // cc.AbstractC0923b0
    public final Executor X() {
        return this.f19100c;
    }
}
