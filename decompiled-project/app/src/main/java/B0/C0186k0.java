package B0;

import I2.C0330t;
import Q.C0489f0;
import android.view.Choreographer;
import cc.C0944m;
import java.util.ArrayList;

/* renamed from: B0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186k0 implements Q.T {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1925a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1926b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1927c;

    public C0186k0(Q.T t5) {
        this.f1925a = 1;
        this.f1926b = t5;
        this.f1927c = new C0330t(2, false);
    }

    public C0186k0(Choreographer choreographer, C0182i0 c0182i0) {
        this.f1925a = 0;
        this.f1926b = choreographer;
        this.f1927c = c0182i0;
    }

    @Override // Hb.i
    public final Object fold(Object obj, Rb.e eVar) {
        switch (this.f1925a) {
            case 0:
                return eVar.invoke(obj, this);
            default:
                return eVar.invoke(obj, this);
        }
    }

    @Override // Hb.i
    public final Hb.g get(Hb.h hVar) {
        switch (this.f1925a) {
            case 0:
                return E6.b.l(this, hVar);
            default:
                return E6.b.l(this, hVar);
        }
    }

    @Override // Hb.i
    public final Hb.i minusKey(Hb.h hVar) {
        switch (this.f1925a) {
            case 0:
                return E6.b.v(this, hVar);
            default:
                return E6.b.v(this, hVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    @Override // Q.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Rb.c cVar, Jb.c cVar2) {
        C0489f0 c0489f0;
        Object obj;
        Ib.a aVar;
        int i7;
        boolean z8;
        Object r10;
        C0186k0 c0186k0;
        C0182i0 c0182i0 = null;
        int i10 = 2;
        switch (this.f1925a) {
            case 0:
                C0182i0 c0182i02 = (C0182i0) this.f1927c;
                if (c0182i02 == null) {
                    Hb.g gVar = cVar2.getContext().get(Hb.e.f4918a);
                    if (gVar instanceof C0182i0) {
                        c0182i0 = (C0182i0) gVar;
                    }
                } else {
                    c0182i0 = c0182i02;
                }
                C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(cVar2));
                c0944m.s();
                ChoreographerFrameCallbackC0184j0 choreographerFrameCallbackC0184j0 = new ChoreographerFrameCallbackC0184j0(c0944m, this, cVar);
                if (c0182i0 == null || !kotlin.jvm.internal.l.a(c0182i0.f1911c, (Choreographer) this.f1926b)) {
                    ((Choreographer) this.f1926b).postFrameCallback(choreographerFrameCallbackC0184j0);
                    c0944m.u(new C0170c0(3, this, choreographerFrameCallbackC0184j0));
                } else {
                    synchronized (c0182i0.f1913e) {
                        c0182i0.f1915u.add(choreographerFrameCallbackC0184j0);
                        if (!c0182i0.f1918x) {
                            c0182i0.f1918x = true;
                            c0182i0.f1911c.postFrameCallback(c0182i0.f1919y);
                        }
                    }
                    c0944m.u(new C0170c0(i10, c0182i0, choreographerFrameCallbackC0184j0));
                }
                Object r11 = c0944m.r();
                Ib.a aVar2 = Ib.a.f5345a;
                return r11;
            default:
                if (cVar2 instanceof C0489f0) {
                    c0489f0 = (C0489f0) cVar2;
                    int i11 = c0489f0.f8394e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0489f0.f8394e = i11 - Integer.MIN_VALUE;
                        obj = c0489f0.f8392c;
                        aVar = Ib.a.f5345a;
                        i7 = c0489f0.f8394e;
                        if (i7 != 0) {
                            com.bumptech.glide.c.c0(obj);
                            C0330t c0330t = (C0330t) this.f1927c;
                            c0489f0.f8390a = this;
                            c0489f0.f8391b = cVar;
                            c0489f0.f8394e = 1;
                            synchronized (c0330t.f5200b) {
                                z8 = c0330t.f5199a;
                            }
                            if (z8) {
                                r10 = Db.q.f3365a;
                            } else {
                                C0944m c0944m2 = new C0944m(1, com.bumptech.glide.c.F(c0489f0));
                                c0944m2.s();
                                synchronized (c0330t.f5200b) {
                                    ((ArrayList) c0330t.f5201c).add(c0944m2);
                                }
                                c0944m2.u(new C0170c0(15, c0330t, c0944m2));
                                r10 = c0944m2.r();
                                if (r10 != aVar) {
                                    r10 = Db.q.f3365a;
                                }
                            }
                            if (r10 == aVar) {
                                return aVar;
                            }
                            c0186k0 = this;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.c.c0(obj);
                                return obj;
                            }
                            cVar = c0489f0.f8391b;
                            c0186k0 = c0489f0.f8390a;
                            com.bumptech.glide.c.c0(obj);
                        }
                        Q.T t5 = (Q.T) c0186k0.f1926b;
                        c0489f0.f8390a = null;
                        c0489f0.f8391b = null;
                        c0489f0.f8394e = 2;
                        obj = t5.n(cVar, c0489f0);
                        if (obj == aVar) {
                            return aVar;
                        }
                        return obj;
                    }
                }
                c0489f0 = new C0489f0(this, cVar2);
                obj = c0489f0.f8392c;
                aVar = Ib.a.f5345a;
                i7 = c0489f0.f8394e;
                if (i7 != 0) {
                }
                Q.T t52 = (Q.T) c0186k0.f1926b;
                c0489f0.f8390a = null;
                c0489f0.f8391b = null;
                c0489f0.f8394e = 2;
                obj = t52.n(cVar, c0489f0);
                if (obj == aVar) {
                }
                return obj;
        }
    }

    @Override // Hb.i
    public final Hb.i plus(Hb.i iVar) {
        switch (this.f1925a) {
            case 0:
                return E6.b.w(this, iVar);
            default:
                return E6.b.w(this, iVar);
        }
    }
}
