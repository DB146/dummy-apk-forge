package Y5;

import i2.C1332t;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f11244f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f11245a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0650t f11246b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11247c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11248d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f11249e = null;

    public /* synthetic */ E(String str, Object obj, InterfaceC0650t interfaceC0650t) {
        this.f11245a = str;
        this.f11247c = obj;
        this.f11246b = interfaceC0650t;
    }

    public final Object a(Object obj) {
        synchronized (this.f11248d) {
        }
        if (obj != null) {
            return obj;
        }
        if (D0.k == null) {
            return this.f11247c;
        }
        synchronized (f11244f) {
            try {
                if (C1332t.e()) {
                    return this.f11249e == null ? this.f11247c : this.f11249e;
                }
                try {
                    for (E e2 : F.f11304a) {
                        if (C1332t.e()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            InterfaceC0650t interfaceC0650t = e2.f11246b;
                            if (interfaceC0650t != null) {
                                obj2 = interfaceC0650t.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f11244f) {
                            e2.f11249e = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC0650t interfaceC0650t2 = this.f11246b;
                if (interfaceC0650t2 != null) {
                    try {
                        return interfaceC0650t2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f11247c;
            } finally {
            }
        }
    }
}
