package sb;

import hb.InterfaceC1269b;
import kb.EnumC1437b;
import nb.AbstractC1719a;
import y7.u0;
import yb.C2477g;
import yb.InterfaceC2471a;
import yb.InterfaceC2475e;

/* loaded from: classes2.dex */
public final class v extends AbstractC1719a implements gb.l, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24333a;

    /* renamed from: b, reason: collision with root package name */
    public final gb.n f24334b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24335c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2475e f24336d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1269b f24337e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f24338f;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f24339u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f24340v;

    /* renamed from: w, reason: collision with root package name */
    public int f24341w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24342x;

    public v(gb.l lVar, gb.n nVar, int i7) {
        this.f24333a = lVar;
        this.f24334b = nVar;
        this.f24335c = i7;
    }

    @Override // gb.l
    public final void a() {
        if (this.f24339u) {
            return;
        }
        this.f24339u = true;
        if (getAndIncrement() == 0) {
            this.f24334b.a(this);
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (this.f24340v) {
            return;
        }
        this.f24340v = true;
        this.f24337e.b();
        this.f24334b.b();
        if (this.f24342x || getAndIncrement() != 0) {
            return;
        }
        this.f24336d.clear();
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o(this.f24337e, interfaceC1269b)) {
            this.f24337e = interfaceC1269b;
            if (interfaceC1269b instanceof InterfaceC2471a) {
                InterfaceC2471a interfaceC2471a = (InterfaceC2471a) interfaceC1269b;
                int i7 = interfaceC2471a.i(7);
                if (i7 == 1) {
                    this.f24341w = i7;
                    this.f24336d = interfaceC2471a;
                    this.f24339u = true;
                    this.f24333a.c(this);
                    if (getAndIncrement() == 0) {
                        this.f24334b.a(this);
                        return;
                    }
                    return;
                }
                if (i7 == 2) {
                    this.f24341w = i7;
                    this.f24336d = interfaceC2471a;
                    this.f24333a.c(this);
                    return;
                }
            }
            this.f24336d = new C2477g(this.f24335c);
            this.f24333a.c(this);
        }
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        this.f24336d.clear();
    }

    public final boolean d(boolean z8, boolean z10, gb.l lVar) {
        if (this.f24340v) {
            this.f24336d.clear();
            return true;
        }
        if (!z8) {
            return false;
        }
        Throwable th = this.f24338f;
        if (th != null) {
            this.f24340v = true;
            this.f24336d.clear();
            lVar.onError(th);
            this.f24334b.b();
            return true;
        }
        if (!z10) {
            return false;
        }
        this.f24340v = true;
        lVar.a();
        this.f24334b.b();
        return true;
    }

    @Override // gb.l
    public final void e(Object obj) {
        if (this.f24339u) {
            return;
        }
        if (this.f24341w != 2) {
            this.f24336d.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.f24334b.a(this);
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f24340v;
    }

    @Override // yb.InterfaceC2472b
    public final int i(int i7) {
        this.f24342x = true;
        return 2;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return this.f24336d.isEmpty();
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (this.f24339u) {
            com.bumptech.glide.d.t(th);
            return;
        }
        this.f24338f = th;
        this.f24339u = true;
        if (getAndIncrement() == 0) {
            this.f24334b.a(this);
        }
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        return this.f24336d.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0076, code lost:
    
        if (r3 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        if (!this.f24342x) {
            InterfaceC2475e interfaceC2475e = this.f24336d;
            gb.l lVar = this.f24333a;
            int i7 = 1;
            while (!d(this.f24339u, interfaceC2475e.isEmpty(), lVar)) {
                while (true) {
                    boolean z8 = this.f24339u;
                    try {
                        Object poll = interfaceC2475e.poll();
                        boolean z10 = poll == null;
                        if (d(z8, z10, lVar)) {
                            return;
                        }
                        if (z10) {
                            break;
                        } else {
                            lVar.e(poll);
                        }
                    } catch (Throwable th) {
                        u0.L(th);
                        this.f24340v = true;
                        this.f24337e.b();
                        interfaceC2475e.clear();
                        lVar.onError(th);
                        this.f24334b.b();
                        return;
                    }
                }
            }
            return;
        }
        int i10 = 1;
        while (!this.f24340v) {
            boolean z11 = this.f24339u;
            Throwable th2 = this.f24338f;
            if (z11 && th2 != null) {
                this.f24340v = true;
                this.f24333a.onError(this.f24338f);
                this.f24334b.b();
                return;
            }
            this.f24333a.e(null);
            if (z11) {
                this.f24340v = true;
                Throwable th3 = this.f24338f;
                if (th3 != null) {
                    this.f24333a.onError(th3);
                } else {
                    this.f24333a.a();
                }
                this.f24334b.b();
                return;
            }
            i10 = addAndGet(-i10);
            if (i10 == 0) {
                return;
            }
        }
    }
}
