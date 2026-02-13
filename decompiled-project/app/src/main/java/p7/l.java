package p7;

import j8.InterfaceC1387b;

/* loaded from: classes.dex */
public final class l implements InterfaceC1387b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f23143c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f23144a = f23143c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC1387b f23145b;

    public l(InterfaceC1387b interfaceC1387b) {
        this.f23145b = interfaceC1387b;
    }

    @Override // j8.InterfaceC1387b
    public final Object get() {
        Object obj = this.f23144a;
        Object obj2 = f23143c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f23144a;
                    if (obj == obj2) {
                        obj = this.f23145b.get();
                        this.f23144a = obj;
                        this.f23145b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
