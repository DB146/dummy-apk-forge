package A8;

import A0.AbstractC0017g;
import I2.C0324m;
import M1.C0401p;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import fc.C1152A;
import fc.C1171s;
import fc.C1176x;
import fc.InterfaceC1162i;
import gc.C1206a;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class J implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f558c;

    public /* synthetic */ J(int i7, Object obj, Object obj2) {
        this.f556a = i7;
        this.f557b = obj;
        this.f558c = obj2;
    }

    public J(C0401p c0401p, InterfaceC1162i interfaceC1162i) {
        this.f556a = 5;
        this.f558c = c0401p;
        this.f557b = interfaceC1162i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public J(Rb.e eVar, kotlin.jvm.internal.v vVar) {
        this.f556a = 6;
        this.f557b = (Jb.i) eVar;
        this.f558c = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public J(InterfaceC1162i interfaceC1162i, Rb.e eVar) {
        this.f556a = 7;
        this.f557b = interfaceC1162i;
        this.f558c = (Jb.i) eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0170  */
    /* JADX WARN: Type inference failed for: r14v51, types: [Jb.i, Rb.e] */
    /* JADX WARN: Type inference failed for: r2v26, types: [Jb.i, Rb.e] */
    @Override // fc.InterfaceC1162i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Hb.d dVar) {
        I i7;
        int i10;
        C0324m c0324m;
        int i11;
        C1171s c1171s;
        int i12;
        Throwable th;
        J j;
        C1176x c1176x;
        int i13;
        boolean z8;
        Object obj2;
        Object obj3;
        J j10;
        C1152A c1152a;
        Object obj4;
        int i14;
        J j11;
        fc.H h10;
        Ib.a aVar;
        int i15;
        Object obj5;
        InterfaceC1162i interfaceC1162i;
        ta.b bVar;
        int i16;
        switch (this.f556a) {
            case 0:
                if (dVar instanceof I) {
                    i7 = (I) dVar;
                    int i17 = i7.f554b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        i7.f554b = i17 - Integer.MIN_VALUE;
                        Object obj6 = i7.f553a;
                        Ib.a aVar2 = Ib.a.f5345a;
                        i10 = i7.f554b;
                        if (i10 != 0) {
                            com.bumptech.glide.c.c0(obj6);
                            ((N) this.f558c).getClass();
                            C0057v c0057v = new C0057v((String) ((Q1.b) obj).c(AbstractC0055t.f718c));
                            i7.f554b = 1;
                            if (((InterfaceC1162i) this.f557b).emit(c0057v, i7) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.c.c0(obj6);
                        }
                        return Db.q.f3365a;
                    }
                }
                i7 = new I(this, dVar);
                Object obj62 = i7.f553a;
                Ib.a aVar22 = Ib.a.f5345a;
                i10 = i7.f554b;
                if (i10 != 0) {
                }
                return Db.q.f3365a;
            case 1:
                if (dVar instanceof C0324m) {
                    c0324m = (C0324m) dVar;
                    int i18 = c0324m.f5177b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c0324m.f5177b = i18 - Integer.MIN_VALUE;
                        Object obj7 = c0324m.f5176a;
                        Ib.a aVar3 = Ib.a.f5345a;
                        i11 = c0324m.f5177b;
                        if (i11 != 0) {
                            com.bumptech.glide.c.c0(obj7);
                            Set set = (Set) obj;
                            Fb.i iVar = new Fb.i();
                            for (String str : (String[]) this.f558c) {
                                Iterator it = set.iterator();
                                while (it.hasNext()) {
                                    if (ac.n.T(str, (String) it.next(), true)) {
                                        iVar.add(str);
                                    }
                                }
                            }
                            Fb.i i19 = O5.b.i(iVar);
                            if (i19.f4216a.isEmpty()) {
                                i19 = null;
                            }
                            if (i19 != null) {
                                c0324m.f5177b = 1;
                                if (((InterfaceC1162i) this.f557b).emit(i19, c0324m) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.c.c0(obj7);
                        }
                        return Db.q.f3365a;
                    }
                }
                c0324m = new C0324m(this, dVar);
                Object obj72 = c0324m.f5176a;
                Ib.a aVar32 = Ib.a.f5345a;
                i11 = c0324m.f5177b;
                if (i11 != 0) {
                }
                return Db.q.f3365a;
            case 2:
                A.h hVar = (A.h) obj;
                boolean z10 = hVar instanceof A.k;
                M.a aVar4 = (M.a) this.f557b;
                if (z10) {
                    A.k kVar = (A.k) hVar;
                    M.h hVar2 = aVar4.f6466u;
                    if (hVar2 == null) {
                        hVar2 = q3.f.c(aVar4.f6465f);
                        aVar4.f6466u = hVar2;
                        kotlin.jvm.internal.l.b(hVar2);
                    }
                    M.j a9 = hVar2.a(aVar4);
                    a9.b(kVar, aVar4.f6461b, aVar4.f6469x, aVar4.f6470y, ((j0.n) aVar4.f6463d.getValue()).f18554a, ((M.f) aVar4.f6464e.getValue()).f6492d, aVar4.f6471z);
                    aVar4.f6467v.setValue(a9);
                } else if (hVar instanceof A.l) {
                    A.k kVar2 = ((A.l) hVar).f7a;
                    M.j jVar = (M.j) aVar4.f6467v.getValue();
                    if (jVar != null) {
                        jVar.d();
                    }
                } else if (hVar instanceof A.j) {
                    A.k kVar3 = ((A.j) hVar).f5a;
                    M.j jVar2 = (M.j) aVar4.f6467v.getValue();
                    if (jVar2 != null) {
                        jVar2.d();
                    }
                } else {
                    aVar4.f6460a.d(hVar, (cc.E) this.f558c);
                }
                return Db.q.f3365a;
            case 3:
                A.h hVar3 = (A.h) obj;
                boolean z11 = hVar3 instanceof A.m;
                M.b bVar2 = (M.b) this.f557b;
                if (!z11) {
                    E.u uVar = bVar2.f6477H;
                    if (uVar == null) {
                        uVar = new E.u(bVar2.f6473D, bVar2.f6476G);
                        AbstractC0017g.k(bVar2);
                        bVar2.f6477H = uVar;
                    }
                    uVar.d(hVar3, (cc.E) this.f558c);
                } else if (bVar2.f6480K) {
                    bVar2.p0((A.m) hVar3);
                } else {
                    bVar2.L.a(hVar3);
                }
                return Db.q.f3365a;
            case 4:
                if (dVar instanceof C1171s) {
                    c1171s = (C1171s) dVar;
                    int i20 = c1171s.f17184d;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        c1171s.f17184d = i20 - Integer.MIN_VALUE;
                        Object obj8 = c1171s.f17182b;
                        Ib.a aVar5 = Ib.a.f5345a;
                        i12 = c1171s.f17184d;
                        if (i12 != 0) {
                            com.bumptech.glide.c.c0(obj8);
                            try {
                                InterfaceC1162i interfaceC1162i2 = (InterfaceC1162i) this.f557b;
                                try {
                                    c1171s.f17181a = this;
                                    c1171s.f17184d = 1;
                                    if (interfaceC1162i2.emit(obj, c1171s) == aVar5) {
                                        return aVar5;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    j = this;
                                    ((kotlin.jvm.internal.v) j.f558c).f19134a = th;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = c1171s.f17181a;
                            try {
                                com.bumptech.glide.c.c0(obj8);
                            } catch (Throwable th4) {
                                th = th4;
                                ((kotlin.jvm.internal.v) j.f558c).f19134a = th;
                                throw th;
                            }
                        }
                        return Db.q.f3365a;
                    }
                }
                c1171s = new C1171s(this, dVar);
                Object obj82 = c1171s.f17182b;
                Ib.a aVar52 = Ib.a.f5345a;
                i12 = c1171s.f17184d;
                if (i12 != 0) {
                }
                return Db.q.f3365a;
            case 5:
                if (dVar instanceof C1176x) {
                    c1176x = (C1176x) dVar;
                    int i21 = c1176x.f17206c;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        c1176x.f17206c = i21 - Integer.MIN_VALUE;
                        Object obj9 = c1176x.f17205b;
                        Ib.a aVar6 = Ib.a.f5345a;
                        i13 = c1176x.f17206c;
                        z8 = true;
                        if (i13 != 0) {
                            com.bumptech.glide.c.c0(obj9);
                            c1176x.f17204a = this;
                            c1176x.f17208e = obj;
                            c1176x.f17206c = 1;
                            Object invoke = ((C0401p) this.f558c).invoke(obj, c1176x);
                            if (invoke == aVar6) {
                                return aVar6;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            j10 = this;
                        } else {
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                j10 = c1176x.f17204a;
                                com.bumptech.glide.c.c0(obj9);
                                if (z8) {
                                    return Db.q.f3365a;
                                }
                                throw new C1206a(j10);
                            }
                            Object obj10 = c1176x.f17208e;
                            J j12 = c1176x.f17204a;
                            com.bumptech.glide.c.c0(obj9);
                            obj3 = obj10;
                            j10 = j12;
                            obj2 = obj9;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z8 = false;
                        } else {
                            InterfaceC1162i interfaceC1162i3 = (InterfaceC1162i) j10.f557b;
                            c1176x.f17204a = j10;
                            c1176x.f17208e = null;
                            c1176x.f17206c = 2;
                            if (interfaceC1162i3.emit(obj3, c1176x) == aVar6) {
                                return aVar6;
                            }
                        }
                        if (z8) {
                        }
                    }
                }
                c1176x = new C1176x(this, dVar);
                Object obj92 = c1176x.f17205b;
                Ib.a aVar62 = Ib.a.f5345a;
                i13 = c1176x.f17206c;
                z8 = true;
                if (i13 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z8) {
                }
            case 6:
                if (dVar instanceof C1152A) {
                    c1152a = (C1152A) dVar;
                    int i22 = c1152a.f17046c;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        c1152a.f17046c = i22 - Integer.MIN_VALUE;
                        obj4 = c1152a.f17045b;
                        Ib.a aVar7 = Ib.a.f5345a;
                        i14 = c1152a.f17046c;
                        if (i14 != 0) {
                            com.bumptech.glide.c.c0(obj4);
                            c1152a.f17044a = this;
                            c1152a.f17048e = obj;
                            c1152a.f17046c = 1;
                            obj4 = ((Jb.i) this.f557b).invoke(obj, c1152a);
                            if (obj4 == aVar7) {
                                return aVar7;
                            }
                            j11 = this;
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c1152a.f17048e;
                            j11 = c1152a.f17044a;
                            com.bumptech.glide.c.c0(obj4);
                        }
                        if (((Boolean) obj4).booleanValue()) {
                            return Db.q.f3365a;
                        }
                        ((kotlin.jvm.internal.v) j11.f558c).f19134a = obj;
                        throw new C1206a(j11);
                    }
                }
                c1152a = new C1152A(this, dVar);
                obj4 = c1152a.f17045b;
                Ib.a aVar72 = Ib.a.f5345a;
                i14 = c1152a.f17046c;
                if (i14 != 0) {
                }
                if (((Boolean) obj4).booleanValue()) {
                }
            case 7:
                if (dVar instanceof fc.H) {
                    h10 = (fc.H) dVar;
                    int i23 = h10.f17073b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        h10.f17073b = i23 - Integer.MIN_VALUE;
                        Object obj11 = h10.f17072a;
                        aVar = Ib.a.f5345a;
                        i15 = h10.f17073b;
                        if (i15 != 0) {
                            com.bumptech.glide.c.c0(obj11);
                            h10.f17075d = obj;
                            InterfaceC1162i interfaceC1162i4 = (InterfaceC1162i) this.f557b;
                            h10.f17076e = interfaceC1162i4;
                            h10.f17073b = 1;
                            if (((Jb.i) this.f558c).invoke(obj, h10) == aVar) {
                                return aVar;
                            }
                            obj5 = obj;
                            interfaceC1162i = interfaceC1162i4;
                        } else {
                            if (i15 != 1) {
                                if (i15 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.c.c0(obj11);
                                return Db.q.f3365a;
                            }
                            interfaceC1162i = h10.f17076e;
                            obj5 = h10.f17075d;
                            com.bumptech.glide.c.c0(obj11);
                        }
                        h10.f17075d = null;
                        h10.f17076e = null;
                        h10.f17073b = 2;
                        if (interfaceC1162i.emit(obj5, h10) == aVar) {
                            return aVar;
                        }
                        return Db.q.f3365a;
                    }
                }
                h10 = new fc.H(this, dVar);
                Object obj112 = h10.f17072a;
                aVar = Ib.a.f5345a;
                i15 = h10.f17073b;
                if (i15 != 0) {
                }
                h10.f17075d = null;
                h10.f17076e = null;
                h10.f17073b = 2;
                if (interfaceC1162i.emit(obj5, h10) == aVar) {
                }
                return Db.q.f3365a;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((m3.h) this.f557b).e((q3.p) this.f558c, (m3.c) obj);
                return Db.q.f3365a;
            default:
                if (dVar instanceof ta.b) {
                    bVar = (ta.b) dVar;
                    int i24 = bVar.f24520b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        bVar.f24520b = i24 - Integer.MIN_VALUE;
                        Object obj12 = bVar.f24519a;
                        Ib.a aVar8 = Ib.a.f5345a;
                        i16 = bVar.f24520b;
                        if (i16 != 0) {
                            com.bumptech.glide.c.c0(obj12);
                            y9.I i25 = (y9.I) obj;
                            TVChannelLinkStream lastWatchedChannel = i25 instanceof y9.G ? (TVChannelLinkStream) ((y9.G) i25).f27483a : ((ta.c) this.f558c).getLastWatchedChannel();
                            bVar.f24520b = 1;
                            if (((InterfaceC1162i) this.f557b).emit(lastWatchedChannel, bVar) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.c.c0(obj12);
                        }
                        return Db.q.f3365a;
                    }
                }
                bVar = new ta.b(this, dVar);
                Object obj122 = bVar.f24519a;
                Ib.a aVar82 = Ib.a.f5345a;
                i16 = bVar.f24520b;
                if (i16 != 0) {
                }
                return Db.q.f3365a;
        }
    }
}
