package a1;

/* renamed from: a1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705f extends Q5.e {
    @Override // Q5.e
    public final void J(C0706g c0706g, C0706g c0706g2) {
        c0706g.f12463b = c0706g2;
    }

    @Override // Q5.e
    public final void K(C0706g c0706g, Thread thread) {
        c0706g.f12462a = thread;
    }

    @Override // Q5.e
    public final boolean f(AbstractC0707h abstractC0707h, C0703d c0703d, C0703d c0703d2) {
        synchronized (abstractC0707h) {
            try {
                if (abstractC0707h.f12469b != c0703d) {
                    return false;
                }
                abstractC0707h.f12469b = c0703d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q5.e
    public final boolean g(AbstractC0707h abstractC0707h, Object obj, Object obj2) {
        synchronized (abstractC0707h) {
            try {
                if (abstractC0707h.f12468a != obj) {
                    return false;
                }
                abstractC0707h.f12468a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q5.e
    public final boolean h(AbstractC0707h abstractC0707h, C0706g c0706g, C0706g c0706g2) {
        synchronized (abstractC0707h) {
            try {
                if (abstractC0707h.f12470c != c0706g) {
                    return false;
                }
                abstractC0707h.f12470c = c0706g2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
