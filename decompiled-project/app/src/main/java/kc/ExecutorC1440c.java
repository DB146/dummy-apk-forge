package kc;

import cc.A;
import cc.AbstractC0923b0;
import hc.AbstractC1273a;
import hc.w;
import java.util.concurrent.Executor;

/* renamed from: kc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC1440c extends AbstractC0923b0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final ExecutorC1440c f19096c = new A();

    /* renamed from: d, reason: collision with root package name */
    public static final A f19097d;

    /* JADX WARN: Type inference failed for: r0v0, types: [cc.A, kc.c] */
    static {
        k kVar = k.f19111c;
        int i7 = w.f17973a;
        if (64 >= i7) {
            i7 = 64;
        }
        f19097d = kVar.W(AbstractC1273a.k(i7, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // cc.A
    public final void T(Hb.i iVar, Runnable runnable) {
        f19097d.T(iVar, runnable);
    }

    @Override // cc.A
    public final void U(Hb.i iVar, Runnable runnable) {
        f19097d.U(iVar, runnable);
    }

    @Override // cc.A
    public final A W(int i7) {
        return k.f19111c.W(1);
    }

    @Override // cc.AbstractC0923b0
    public final Executor X() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        T(Hb.j.f4919a, runnable);
    }

    @Override // cc.A
    public final String toString() {
        return "Dispatchers.IO";
    }
}
