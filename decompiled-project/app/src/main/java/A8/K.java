package A8;

import M1.C0400o;
import M1.C0401p;
import fc.C1169p;
import fc.C1170q;
import fc.C1172t;
import fc.C1175w;
import fc.InterfaceC1161h;
import fc.InterfaceC1162i;
import gc.C1205A;
import gc.C1206a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class K implements InterfaceC1161h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f561c;

    public /* synthetic */ K(int i7, Object obj, Object obj2) {
        this.f559a = i7;
        this.f560b = obj;
        this.f561c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00f9 -> B:46:0x00fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x010b -> B:49:0x0108). Please report as a decompilation issue!!! */
    @Override // fc.InterfaceC1161h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        C1169p c1169p;
        int i7;
        Throwable th;
        C1205A c1205a;
        K k;
        InterfaceC1162i interfaceC1162i2;
        C1170q c1170q;
        int i10;
        K k7;
        Throwable th2;
        C1172t c1172t;
        int i11;
        long j;
        K k10;
        K k11;
        InterfaceC1162i interfaceC1162i3;
        Throwable th3;
        Serializable g;
        C1175w c1175w;
        int i12;
        J j10;
        switch (this.f559a) {
            case 0:
                Object a9 = ((K) this.f560b).a(new J(0, interfaceC1162i, (N) this.f561c), dVar);
                return a9 == Ib.a.f5345a ? a9 : Db.q.f3365a;
            case 1:
                ((fc.P) this.f560b).a(new J(1, interfaceC1162i, (String[]) this.f561c), dVar);
                return Ib.a.f5345a;
            case 2:
                if (dVar instanceof C1169p) {
                    c1169p = (C1169p) dVar;
                    int i13 = c1169p.f17168b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1169p.f17168b = i13 - Integer.MIN_VALUE;
                        Object obj = c1169p.f17167a;
                        Ib.a aVar = Ib.a.f5345a;
                        i7 = c1169p.f17168b;
                        if (i7 != 0) {
                            com.bumptech.glide.c.c0(obj);
                            C1205A c1205a2 = new C1205A(interfaceC1162i, c1169p.getContext());
                            try {
                                C0400o c0400o = (C0400o) this.f560b;
                                c1169p.f17170d = this;
                                c1169p.f17171e = interfaceC1162i;
                                c1169p.f17172f = c1205a2;
                                c1169p.f17168b = 1;
                                if (c0400o.invoke(c1205a2, c1169p) == aVar) {
                                    return aVar;
                                }
                                k = this;
                                interfaceC1162i2 = interfaceC1162i;
                                c1205a = c1205a2;
                            } catch (Throwable th4) {
                                th = th4;
                                c1205a = c1205a2;
                                c1205a.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.c.c0(obj);
                                return Db.q.f3365a;
                            }
                            c1205a = c1169p.f17172f;
                            interfaceC1162i2 = c1169p.f17171e;
                            k = c1169p.f17170d;
                            try {
                                com.bumptech.glide.c.c0(obj);
                            } catch (Throwable th5) {
                                th = th5;
                                c1205a.releaseIntercepted();
                                throw th;
                            }
                        }
                        c1205a.releaseIntercepted();
                        fc.b0 b0Var = (fc.b0) k.f561c;
                        c1169p.f17170d = null;
                        c1169p.f17171e = null;
                        c1169p.f17172f = null;
                        c1169p.f17168b = 2;
                        b0Var.a(interfaceC1162i2, c1169p);
                        return aVar;
                    }
                }
                c1169p = new C1169p(this, dVar);
                Object obj2 = c1169p.f17167a;
                Ib.a aVar2 = Ib.a.f5345a;
                i7 = c1169p.f17168b;
                if (i7 != 0) {
                }
                c1205a.releaseIntercepted();
                fc.b0 b0Var2 = (fc.b0) k.f561c;
                c1169p.f17170d = null;
                c1169p.f17171e = null;
                c1169p.f17172f = null;
                c1169p.f17168b = 2;
                b0Var2.a(interfaceC1162i2, c1169p);
                return aVar2;
            case 3:
                if (dVar instanceof C1170q) {
                    c1170q = (C1170q) dVar;
                    int i14 = c1170q.f17174b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1170q.f17174b = i14 - Integer.MIN_VALUE;
                        Object obj3 = c1170q.f17173a;
                        Object obj4 = Ib.a.f5345a;
                        i10 = c1170q.f17174b;
                        if (i10 != 0) {
                            com.bumptech.glide.c.c0(obj3);
                            c1170q.f17176d = this;
                            c1170q.f17177e = interfaceC1162i;
                            c1170q.f17174b = 1;
                            obj3 = fc.Q.g((InterfaceC1161h) this.f560b, interfaceC1162i, c1170q);
                            if (obj3 == obj4) {
                                return obj4;
                            }
                            k7 = this;
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.c.c0(obj3);
                                return Db.q.f3365a;
                            }
                            interfaceC1162i = c1170q.f17177e;
                            k7 = c1170q.f17176d;
                            com.bumptech.glide.c.c0(obj3);
                        }
                        th2 = (Throwable) obj3;
                        if (th2 != null) {
                            H h10 = (H) k7.f561c;
                            c1170q.f17176d = null;
                            c1170q.f17177e = null;
                            c1170q.f17174b = 2;
                            if (h10.a(interfaceC1162i, th2, c1170q) == obj4) {
                                return obj4;
                            }
                        }
                        return Db.q.f3365a;
                    }
                }
                c1170q = new C1170q(this, dVar);
                Object obj32 = c1170q.f17173a;
                Object obj42 = Ib.a.f5345a;
                i10 = c1170q.f17174b;
                if (i10 != 0) {
                }
                th2 = (Throwable) obj32;
                if (th2 != null) {
                }
                return Db.q.f3365a;
            case 4:
                if (dVar instanceof C1172t) {
                    c1172t = (C1172t) dVar;
                    int i15 = c1172t.f17186b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c1172t.f17186b = i15 - Integer.MIN_VALUE;
                        Object obj5 = c1172t.f17185a;
                        Ib.a aVar3 = Ib.a.f5345a;
                        i11 = c1172t.f17186b;
                        if (i11 != 0) {
                            com.bumptech.glide.c.c0(obj5);
                            j = 0;
                            k10 = this;
                            K2.l lVar = (K2.l) k10.f560b;
                            c1172t.f17188d = k10;
                            c1172t.f17189e = interfaceC1162i;
                            c1172t.f17190f = null;
                            c1172t.f17191u = j;
                            c1172t.f17186b = 1;
                            g = fc.Q.g(lVar, interfaceC1162i, c1172t);
                            if (g != aVar3) {
                            }
                        } else if (i11 == 1) {
                            j = c1172t.f17191u;
                            interfaceC1162i = c1172t.f17189e;
                            K k12 = c1172t.f17188d;
                            com.bumptech.glide.c.c0(obj5);
                            k11 = k12;
                            interfaceC1162i3 = interfaceC1162i;
                            th3 = (Throwable) obj5;
                            if (th3 == null) {
                            }
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = c1172t.f17191u;
                            th3 = c1172t.f17190f;
                            interfaceC1162i3 = c1172t.f17189e;
                            k11 = c1172t.f17188d;
                            com.bumptech.glide.c.c0(obj5);
                            if (!((Boolean) obj5).booleanValue()) {
                                j++;
                                boolean z8 = true;
                                k10 = k11;
                                if (z8) {
                                    return Db.q.f3365a;
                                }
                                interfaceC1162i = interfaceC1162i3;
                                K2.l lVar2 = (K2.l) k10.f560b;
                                c1172t.f17188d = k10;
                                c1172t.f17189e = interfaceC1162i;
                                c1172t.f17190f = null;
                                c1172t.f17191u = j;
                                c1172t.f17186b = 1;
                                g = fc.Q.g(lVar2, interfaceC1162i, c1172t);
                                if (g != aVar3) {
                                    return aVar3;
                                }
                                k11 = k10;
                                obj5 = g;
                                interfaceC1162i3 = interfaceC1162i;
                                th3 = (Throwable) obj5;
                                if (th3 == null) {
                                    i3.j jVar = (i3.j) k11.f561c;
                                    Long l10 = new Long(j);
                                    c1172t.f17188d = k11;
                                    c1172t.f17189e = interfaceC1162i3;
                                    c1172t.f17190f = th3;
                                    c1172t.f17191u = j;
                                    c1172t.f17186b = 2;
                                    obj5 = jVar.f(interfaceC1162i3, th3, l10, c1172t);
                                    if (obj5 == aVar3) {
                                        return aVar3;
                                    }
                                    if (!((Boolean) obj5).booleanValue()) {
                                        throw th3;
                                    }
                                } else {
                                    z8 = false;
                                    k10 = k11;
                                    if (z8) {
                                    }
                                }
                            }
                        }
                    }
                }
                c1172t = new C1172t(this, dVar);
                Object obj52 = c1172t.f17185a;
                Ib.a aVar32 = Ib.a.f5345a;
                i11 = c1172t.f17186b;
                if (i11 != 0) {
                }
            case 5:
                if (dVar instanceof C1175w) {
                    c1175w = (C1175w) dVar;
                    int i16 = c1175w.f17201b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c1175w.f17201b = i16 - Integer.MIN_VALUE;
                        Object obj6 = c1175w.f17200a;
                        Ib.a aVar4 = Ib.a.f5345a;
                        i12 = c1175w.f17201b;
                        if (i12 != 0) {
                            com.bumptech.glide.c.c0(obj6);
                            K k13 = (K) this.f560b;
                            J j11 = new J((C0401p) this.f561c, interfaceC1162i);
                            try {
                                c1175w.f17203d = j11;
                                c1175w.f17201b = 1;
                                if (k13.a(j11, c1175w) == aVar4) {
                                    return aVar4;
                                }
                            } catch (C1206a e2) {
                                e = e2;
                                j10 = j11;
                                if (e.f17500a != j10) {
                                }
                                return Db.q.f3365a;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j10 = c1175w.f17203d;
                            try {
                                com.bumptech.glide.c.c0(obj6);
                            } catch (C1206a e10) {
                                e = e10;
                                if (e.f17500a != j10) {
                                    throw e;
                                }
                                return Db.q.f3365a;
                            }
                        }
                        return Db.q.f3365a;
                    }
                }
                c1175w = new C1175w(this, dVar);
                Object obj62 = c1175w.f17200a;
                Ib.a aVar42 = Ib.a.f5345a;
                i12 = c1175w.f17201b;
                if (i12 != 0) {
                }
                return Db.q.f3365a;
            default:
                Object a10 = ((InterfaceC1161h) this.f560b).a(new J(9, interfaceC1162i, (ta.c) this.f561c), dVar);
                return a10 == Ib.a.f5345a ? a10 : Db.q.f3365a;
        }
    }
}
