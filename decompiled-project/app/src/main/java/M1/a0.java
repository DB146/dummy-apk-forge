package M1;

import mc.AbstractC1660e;
import mc.C1659d;
import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1659d f6655a = AbstractC1660e.a();

    /* renamed from: b, reason: collision with root package name */
    public final C0386a f6656b = new C0386a();

    /* renamed from: c, reason: collision with root package name */
    public final C0405u f6657c = new C0405u(new Jb.i(2, null));

    /* JADX WARN: Type inference failed for: r3v3, types: [Jb.i, Rb.e] */
    public a0(String str) {
    }

    public final Integer a() {
        return new Integer(this.f6656b.f6654a.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Rb.c cVar, Jb.c cVar2) {
        X x2;
        Ib.a aVar;
        int i7;
        C1659d c1659d;
        Throwable th;
        InterfaceC1656a interfaceC1656a;
        Object invoke;
        try {
            if (cVar2 instanceof X) {
                x2 = (X) cVar2;
                int i10 = x2.f6648e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    x2.f6648e = i10 - Integer.MIN_VALUE;
                    Object obj = x2.f6646c;
                    aVar = Ib.a.f5345a;
                    i7 = x2.f6648e;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        x2.f6644a = cVar;
                        c1659d = this.f6655a;
                        x2.f6645b = c1659d;
                        x2.f6648e = 1;
                        if (c1659d.n(x2) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC1656a = (InterfaceC1656a) x2.f6644a;
                            try {
                                com.bumptech.glide.c.c0(obj);
                                interfaceC1656a.l(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC1656a.l(null);
                                throw th;
                            }
                        }
                        C1659d c1659d2 = x2.f6645b;
                        Rb.c cVar3 = (Rb.c) x2.f6644a;
                        com.bumptech.glide.c.c0(obj);
                        c1659d = c1659d2;
                        cVar = cVar3;
                    }
                    x2.f6644a = c1659d;
                    x2.f6645b = null;
                    x2.f6648e = 2;
                    invoke = cVar.invoke(x2);
                    if (invoke != aVar) {
                        return aVar;
                    }
                    C1659d c1659d3 = c1659d;
                    obj = invoke;
                    interfaceC1656a = c1659d3;
                    interfaceC1656a.l(null);
                    return obj;
                }
            }
            x2.f6644a = c1659d;
            x2.f6645b = null;
            x2.f6648e = 2;
            invoke = cVar.invoke(x2);
            if (invoke != aVar) {
            }
        } catch (Throwable th3) {
            C1659d c1659d4 = c1659d;
            th = th3;
            interfaceC1656a = c1659d4;
            interfaceC1656a.l(null);
            throw th;
        }
        x2 = new X(this, cVar2);
        Object obj2 = x2.f6646c;
        aVar = Ib.a.f5345a;
        i7 = x2.f6648e;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Rb.e eVar, Jb.c cVar) {
        Y y10;
        int i7;
        C1659d c1659d;
        Throwable th;
        boolean z8;
        if (cVar instanceof Y) {
            y10 = (Y) cVar;
            int i10 = y10.f6653e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                y10.f6653e = i10 - Integer.MIN_VALUE;
                Object obj = y10.f6651c;
                Object obj2 = Ib.a.f5345a;
                i7 = y10.f6653e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    C1659d c1659d2 = this.f6655a;
                    boolean d10 = c1659d2.d();
                    try {
                        Object valueOf = Boolean.valueOf(d10);
                        y10.f6649a = c1659d2;
                        y10.f6650b = d10;
                        y10.f6653e = 1;
                        Object invoke = eVar.invoke(valueOf, y10);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        c1659d = c1659d2;
                        obj = invoke;
                        z8 = d10;
                    } catch (Throwable th2) {
                        c1659d = c1659d2;
                        th = th2;
                        z8 = d10;
                        if (z8) {
                            c1659d.l(null);
                        }
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z8 = y10.f6650b;
                    c1659d = y10.f6649a;
                    try {
                        com.bumptech.glide.c.c0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z8) {
                        }
                        throw th;
                    }
                }
                if (z8) {
                    c1659d.l(null);
                }
                return obj;
            }
        }
        y10 = new Y(this, cVar);
        Object obj3 = y10.f6651c;
        Object obj22 = Ib.a.f5345a;
        i7 = y10.f6653e;
        if (i7 != 0) {
        }
        if (z8) {
        }
        return obj3;
    }
}
