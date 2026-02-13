package rb;

import Y5.C0658x;
import gb.AbstractC1204a;
import gb.k;
import gb.l;
import hb.InterfaceC1269b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1394e;
import jb.InterfaceC1396g;
import kb.EnumC1437b;
import sb.C2008b;
import xb.C2273a;
import y7.u0;
import yb.C2477g;
import yb.InterfaceC2471a;
import yb.InterfaceC2475e;

/* renamed from: rb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1956c extends AtomicInteger implements l, InterfaceC1269b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23912a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23913b;

    /* renamed from: c, reason: collision with root package name */
    public final C2273a f23914c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2475e f23915d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1269b f23916e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f23917f;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f23918u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f23919v;

    /* renamed from: w, reason: collision with root package name */
    public int f23920w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f23921x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC1394e f23922y;

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f23923z;

    /* JADX WARN: Type inference failed for: r0v2, types: [xb.a, java.util.concurrent.atomic.AtomicReference] */
    public C1956c(gb.b bVar, InterfaceC1394e interfaceC1394e) {
        this.f23912a = 0;
        this.f23920w = 1;
        this.f23914c = new AtomicReference();
        this.f23913b = 2;
        this.f23921x = bVar;
        this.f23922y = interfaceC1394e;
        this.f23923z = new C1955b(this);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [xb.a, java.util.concurrent.atomic.AtomicReference] */
    public C1956c(l lVar, int i7) {
        this.f23912a = 1;
        C0658x c0658x = lb.b.f19612a;
        this.f23921x = lVar;
        this.f23922y = c0658x;
        this.f23913b = i7;
        this.f23914c = new AtomicReference();
        this.f23923z = new C2008b(lVar, this);
    }

    @Override // gb.l
    public final void a() {
        switch (this.f23912a) {
            case 0:
                this.f23917f = true;
                d();
                return;
            default:
                this.f23918u = true;
                d();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f23912a) {
            case 0:
                this.f23918u = true;
                this.f23916e.b();
                C1955b c1955b = (C1955b) this.f23923z;
                c1955b.getClass();
                EnumC1437b.a(c1955b);
                this.f23914c.c();
                if (getAndIncrement() == 0) {
                    this.f23915d.clear();
                    return;
                }
                return;
            default:
                this.f23919v = true;
                this.f23916e.b();
                C2008b c2008b = (C2008b) this.f23923z;
                c2008b.getClass();
                EnumC1437b.a(c2008b);
                this.f23914c.c();
                return;
        }
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f23912a) {
            case 0:
                if (EnumC1437b.o(this.f23916e, interfaceC1269b)) {
                    this.f23916e = interfaceC1269b;
                    if (interfaceC1269b instanceof InterfaceC2471a) {
                        InterfaceC2471a interfaceC2471a = (InterfaceC2471a) interfaceC1269b;
                        int i7 = interfaceC2471a.i(7);
                        if (i7 == 1) {
                            this.f23915d = interfaceC2471a;
                            this.f23917f = true;
                            ((gb.b) this.f23921x).c(this);
                            d();
                            return;
                        }
                        if (i7 == 2) {
                            this.f23915d = interfaceC2471a;
                            ((gb.b) this.f23921x).c(this);
                            return;
                        }
                    }
                    this.f23915d = new C2477g(this.f23913b);
                    ((gb.b) this.f23921x).c(this);
                    return;
                }
                return;
            default:
                if (EnumC1437b.o(this.f23916e, interfaceC1269b)) {
                    this.f23916e = interfaceC1269b;
                    if (interfaceC1269b instanceof InterfaceC2471a) {
                        InterfaceC2471a interfaceC2471a2 = (InterfaceC2471a) interfaceC1269b;
                        int i10 = interfaceC2471a2.i(3);
                        if (i10 == 1) {
                            this.f23920w = i10;
                            this.f23915d = interfaceC2471a2;
                            this.f23918u = true;
                            ((l) this.f23921x).c(this);
                            d();
                            return;
                        }
                        if (i10 == 2) {
                            this.f23920w = i10;
                            this.f23915d = interfaceC2471a2;
                            ((l) this.f23921x).c(this);
                            return;
                        }
                    }
                    this.f23915d = new C2477g(this.f23913b);
                    ((l) this.f23921x).c(this);
                    return;
                }
                return;
        }
    }

    public final void d() {
        AbstractC1204a abstractC1204a;
        boolean z8;
        switch (this.f23912a) {
            case 0:
                if (getAndIncrement() != 0) {
                    return;
                }
                C2273a c2273a = this.f23914c;
                int i7 = this.f23920w;
                InterfaceC2475e interfaceC2475e = this.f23915d;
                while (!this.f23918u) {
                    if (c2273a.get() != null && (i7 == 1 || (i7 == 2 && !this.f23919v))) {
                        this.f23918u = true;
                        interfaceC2475e.clear();
                        c2273a.d((gb.b) this.f23921x);
                        return;
                    }
                    if (!this.f23919v) {
                        boolean z10 = this.f23917f;
                        try {
                            Object poll = interfaceC2475e.poll();
                            if (poll != null) {
                                Object apply = this.f23922y.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                                abstractC1204a = (AbstractC1204a) apply;
                                z8 = false;
                            } else {
                                abstractC1204a = null;
                                z8 = true;
                            }
                            if (z10 && z8) {
                                this.f23918u = true;
                                c2273a.d((gb.b) this.f23921x);
                                return;
                            } else if (!z8) {
                                this.f23919v = true;
                                abstractC1204a.c((C1955b) this.f23923z);
                            }
                        } catch (Throwable th) {
                            u0.L(th);
                            this.f23918u = true;
                            interfaceC2475e.clear();
                            this.f23916e.b();
                            c2273a.b(th);
                            c2273a.d((gb.b) this.f23921x);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                interfaceC2475e.clear();
                return;
            default:
                if (getAndIncrement() != 0) {
                    return;
                }
                l lVar = (l) this.f23921x;
                InterfaceC2475e interfaceC2475e2 = this.f23915d;
                C2273a c2273a2 = this.f23914c;
                while (true) {
                    if (!this.f23917f) {
                        if (this.f23919v) {
                            interfaceC2475e2.clear();
                            return;
                        }
                        if (((Throwable) c2273a2.get()) != null) {
                            interfaceC2475e2.clear();
                            this.f23919v = true;
                            c2273a2.f(lVar);
                            return;
                        }
                        boolean z11 = this.f23918u;
                        try {
                            Object poll2 = interfaceC2475e2.poll();
                            boolean z12 = poll2 == null;
                            if (z11 && z12) {
                                this.f23919v = true;
                                c2273a2.f(lVar);
                                return;
                            }
                            if (!z12) {
                                try {
                                    ((C0658x) this.f23922y).getClass();
                                    Objects.requireNonNull(poll2, "The mapper returned a null ObservableSource");
                                    k kVar = (k) poll2;
                                    if (kVar instanceof InterfaceC1396g) {
                                        try {
                                            Object obj = ((InterfaceC1396g) kVar).get();
                                            if (obj != null && !this.f23919v) {
                                                lVar.e(obj);
                                            }
                                        } catch (Throwable th2) {
                                            u0.L(th2);
                                            c2273a2.b(th2);
                                        }
                                    } else {
                                        this.f23917f = true;
                                        kVar.b((C2008b) this.f23923z);
                                    }
                                } catch (Throwable th3) {
                                    u0.L(th3);
                                    this.f23919v = true;
                                    this.f23916e.b();
                                    interfaceC2475e2.clear();
                                    c2273a2.b(th3);
                                    c2273a2.f(lVar);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            u0.L(th4);
                            this.f23919v = true;
                            this.f23916e.b();
                            c2273a2.b(th4);
                            c2273a2.f(lVar);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        switch (this.f23912a) {
            case 0:
                if (obj != null) {
                    this.f23915d.offer(obj);
                }
                d();
                return;
            default:
                if (this.f23920w == 0) {
                    this.f23915d.offer(obj);
                }
                d();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f23912a) {
            case 0:
                return this.f23918u;
            default:
                return this.f23919v;
        }
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        switch (this.f23912a) {
            case 0:
                if (this.f23914c.b(th)) {
                    if (this.f23920w == 1) {
                        C1955b c1955b = (C1955b) this.f23923z;
                        c1955b.getClass();
                        EnumC1437b.a(c1955b);
                    }
                    this.f23917f = true;
                    d();
                    return;
                }
                return;
            default:
                if (this.f23914c.b(th)) {
                    this.f23918u = true;
                    d();
                    return;
                }
                return;
        }
    }
}
