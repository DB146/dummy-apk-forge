package Bb;

import A4.s;
import gb.l;
import hb.InterfaceC1269b;
import jb.InterfaceC1395f;
import xb.C2276d;
import xb.C2277e;
import xb.EnumC2278f;

/* loaded from: classes2.dex */
public final class c extends d implements InterfaceC1395f {

    /* renamed from: a, reason: collision with root package name */
    public final b f2299a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2300b;

    /* renamed from: c, reason: collision with root package name */
    public s f2301c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f2302d;

    public c(b bVar) {
        this.f2299a = bVar;
    }

    @Override // gb.l
    public final void a() {
        if (this.f2302d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f2302d) {
                    return;
                }
                this.f2302d = true;
                if (!this.f2300b) {
                    this.f2300b = true;
                    this.f2299a.a();
                    return;
                }
                s sVar = this.f2301c;
                if (sVar == null) {
                    sVar = new s(21, false);
                    this.f2301c = sVar;
                }
                sVar.a(EnumC2278f.f26324a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        boolean z8 = true;
        if (!this.f2302d) {
            synchronized (this) {
                try {
                    if (!this.f2302d) {
                        if (this.f2300b) {
                            s sVar = this.f2301c;
                            if (sVar == null) {
                                sVar = new s(21, false);
                                this.f2301c = sVar;
                            }
                            sVar.a(new C2276d(interfaceC1269b));
                            return;
                        }
                        this.f2300b = true;
                        z8 = false;
                    }
                } finally {
                }
            }
        }
        if (z8) {
            interfaceC1269b.b();
        } else {
            this.f2299a.c(interfaceC1269b);
            r();
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        if (this.f2302d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f2302d) {
                    return;
                }
                if (!this.f2300b) {
                    this.f2300b = true;
                    this.f2299a.e(obj);
                    r();
                } else {
                    s sVar = this.f2301c;
                    if (sVar == null) {
                        sVar = new s(21, false);
                        this.f2301c = sVar;
                    }
                    sVar.a(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (this.f2302d) {
            com.bumptech.glide.d.t(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z8 = true;
                if (!this.f2302d) {
                    this.f2302d = true;
                    if (this.f2300b) {
                        s sVar = this.f2301c;
                        if (sVar == null) {
                            sVar = new s(21, false);
                            this.f2301c = sVar;
                        }
                        ((Object[]) sVar.f471b)[0] = new C2277e(th);
                        return;
                    }
                    this.f2300b = true;
                    z8 = false;
                }
                if (z8) {
                    com.bumptech.glide.d.t(th);
                } else {
                    this.f2299a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gb.i
    public final void p(l lVar) {
        this.f2299a.b(lVar);
    }

    public final void r() {
        s sVar;
        Object[] objArr;
        while (true) {
            synchronized (this) {
                try {
                    sVar = this.f2301c;
                    if (sVar == null) {
                        this.f2300b = false;
                        return;
                    }
                    this.f2301c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (Object[] objArr2 = (Object[]) sVar.f471b; objArr2 != null; objArr2 = objArr2[4]) {
                for (int i7 = 0; i7 < 4 && (objArr = objArr2[i7]) != null; i7++) {
                    if (EnumC2278f.a(objArr, this.f2299a)) {
                        break;
                    }
                }
            }
        }
    }

    @Override // jb.InterfaceC1395f
    public final boolean test(Object obj) {
        return EnumC2278f.a(obj, this.f2299a);
    }
}
