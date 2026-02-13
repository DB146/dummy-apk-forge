package xb;

import gb.l;
import ib.C1360b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2273a extends AtomicReference {
    public final Throwable a() {
        C2274b c2274b = AbstractC2275c.f26321a;
        Throwable th = (Throwable) get();
        C2274b c2274b2 = AbstractC2275c.f26321a;
        return th != c2274b2 ? (Throwable) getAndSet(c2274b2) : th;
    }

    public final boolean b(Throwable th) {
        C2274b c2274b = AbstractC2275c.f26321a;
        while (true) {
            Throwable th2 = (Throwable) get();
            if (th2 == AbstractC2275c.f26321a) {
                com.bumptech.glide.d.t(th);
                return false;
            }
            Throwable c1360b = th2 == null ? th : new C1360b(th2, th);
            while (!compareAndSet(th2, c1360b)) {
                if (get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public final void c() {
        Throwable a9 = a();
        if (a9 == null || a9 == AbstractC2275c.f26321a) {
            return;
        }
        com.bumptech.glide.d.t(a9);
    }

    public final void d(gb.b bVar) {
        Throwable a9 = a();
        if (a9 == null) {
            bVar.a();
        } else if (a9 != AbstractC2275c.f26321a) {
            bVar.onError(a9);
        }
    }

    public final void e(gb.e eVar) {
        Throwable a9 = a();
        if (a9 == null) {
            eVar.a();
        } else if (a9 != AbstractC2275c.f26321a) {
            eVar.onError(a9);
        }
    }

    public final void f(l lVar) {
        Throwable a9 = a();
        if (a9 == null) {
            lVar.a();
        } else if (a9 != AbstractC2275c.f26321a) {
            lVar.onError(a9);
        }
    }
}
