package m4;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f20526a;

    /* renamed from: b, reason: collision with root package name */
    public final C1555I f20527b;

    /* renamed from: c, reason: collision with root package name */
    public final n5.x f20528c;

    /* renamed from: d, reason: collision with root package name */
    public int f20529d;

    /* renamed from: e, reason: collision with root package name */
    public Object f20530e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f20531f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20532h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20533i;

    public z0(C1555I c1555i, y0 y0Var, L0 l02, int i7, n5.x xVar, Looper looper) {
        this.f20527b = c1555i;
        this.f20526a = y0Var;
        this.f20531f = looper;
        this.f20528c = xVar;
    }

    public final synchronized void a(long j) {
        boolean z8;
        AbstractC1705a.m(this.g);
        AbstractC1705a.m(this.f20531f.getThread() != Thread.currentThread());
        this.f20528c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z8 = this.f20533i;
            if (z8 || j <= 0) {
                break;
            }
            this.f20528c.getClass();
            wait(j);
            this.f20528c.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z8) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z8) {
        this.f20532h = z8 | this.f20532h;
        this.f20533i = true;
        notifyAll();
    }

    public final void c() {
        AbstractC1705a.m(!this.g);
        this.g = true;
        C1555I c1555i = this.f20527b;
        synchronized (c1555i) {
            if (!c1555i.f19927M && c1555i.f19953x.getThread().isAlive()) {
                c1555i.f19951v.a(14, this).b();
                return;
            }
            AbstractC1705a.S("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
