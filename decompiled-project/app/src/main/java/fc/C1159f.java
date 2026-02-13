package fc;

import A0.AbstractC0017g;
import Q.C0479a0;
import Q.C0497j0;
import android.graphics.drawable.Drawable;
import c.C0857a;
import gc.AbstractC1208c;
import hc.AbstractC1273a;
import java.util.List;
import o0.AbstractC1775c;
import x.i0;
import y3.C2378a;

/* renamed from: fc.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1159f implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17143a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17144b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17145c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17146d;

    public C1159f(InterfaceC1162i interfaceC1162i, Hb.i iVar) {
        this.f17143a = 2;
        this.f17145c = iVar;
        this.f17146d = AbstractC1273a.l(iVar);
        this.f17144b = new gc.G(interfaceC1162i, null);
    }

    public /* synthetic */ C1159f(Object obj, Object obj2, Object obj3, int i7) {
        this.f17143a = i7;
        this.f17145c = obj;
        this.f17146d = obj2;
        this.f17144b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1159f(kotlin.jvm.internal.r rVar, InterfaceC1162i interfaceC1162i, Rb.e eVar) {
        this.f17143a = 1;
        this.f17145c = rVar;
        this.f17144b = interfaceC1162i;
        this.f17146d = (Jb.i) eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019a  */
    /* JADX WARN: Type inference failed for: r9v14, types: [Jb.i, Rb.e] */
    @Override // fc.InterfaceC1162i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Hb.d dVar) {
        C1158e c1158e;
        int i7;
        C1174v c1174v;
        int i10;
        C1159f c1159f;
        boolean z8;
        Object obj2;
        AbstractC1775c abstractC1775c;
        Db.j jVar;
        switch (this.f17143a) {
            case 0:
                if (dVar instanceof C1158e) {
                    c1158e = (C1158e) dVar;
                    int i11 = c1158e.f17142c;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1158e.f17142c = i11 - Integer.MIN_VALUE;
                        Object obj3 = c1158e.f17140a;
                        Ib.a aVar = Ib.a.f5345a;
                        i7 = c1158e.f17142c;
                        Db.q qVar = Db.q.f3365a;
                        if (i7 != 0) {
                            com.bumptech.glide.c.c0(obj3);
                            ((C1160g) this.f17145c).getClass();
                            kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f17146d;
                            Object obj4 = vVar.f19134a;
                            if (obj4 == AbstractC1208c.f17506b || !((Boolean) C1165l.f17156a.invoke(obj4, obj)).booleanValue()) {
                                vVar.f19134a = obj;
                                c1158e.f17142c = 1;
                                if (((InterfaceC1162i) this.f17144b).emit(obj, c1158e) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.c.c0(obj3);
                        }
                        return qVar;
                    }
                }
                c1158e = new C1158e(this, dVar);
                Object obj32 = c1158e.f17140a;
                Ib.a aVar2 = Ib.a.f5345a;
                i7 = c1158e.f17142c;
                Db.q qVar2 = Db.q.f3365a;
                if (i7 != 0) {
                }
                return qVar2;
            case 1:
                if (dVar instanceof C1174v) {
                    c1174v = (C1174v) dVar;
                    int i12 = c1174v.f17199e;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c1174v.f17199e = i12 - Integer.MIN_VALUE;
                        Object obj5 = c1174v.f17197c;
                        Ib.a aVar3 = Ib.a.f5345a;
                        i10 = c1174v.f17199e;
                        Db.q qVar3 = Db.q.f3365a;
                        if (i10 != 0) {
                            com.bumptech.glide.c.c0(obj5);
                            if (((kotlin.jvm.internal.r) this.f17145c).f19130a) {
                                c1174v.f17199e = 1;
                                if (((InterfaceC1162i) this.f17144b).emit(obj, c1174v) == aVar3) {
                                    return aVar3;
                                }
                                return qVar3;
                            }
                            c1174v.f17195a = this;
                            c1174v.f17196b = obj;
                            c1174v.f17199e = 2;
                            obj5 = ((Jb.i) this.f17146d).invoke(obj, c1174v);
                            if (obj5 == aVar3) {
                                return aVar3;
                            }
                            c1159f = this;
                            if (!((Boolean) obj5).booleanValue()) {
                            }
                            return qVar3;
                        }
                        if (i10 != 1) {
                            if (i10 == 2) {
                                obj = c1174v.f17196b;
                                c1159f = c1174v.f17195a;
                                com.bumptech.glide.c.c0(obj5);
                                if (!((Boolean) obj5).booleanValue()) {
                                    ((kotlin.jvm.internal.r) c1159f.f17145c).f19130a = true;
                                    c1174v.f17195a = null;
                                    c1174v.f17196b = null;
                                    c1174v.f17199e = 3;
                                    if (((InterfaceC1162i) c1159f.f17144b).emit(obj, c1174v) == aVar3) {
                                        return aVar3;
                                    }
                                }
                                return qVar3;
                            }
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        com.bumptech.glide.c.c0(obj5);
                        return qVar3;
                    }
                }
                c1174v = new C1174v(this, dVar);
                Object obj52 = c1174v.f17197c;
                Ib.a aVar32 = Ib.a.f5345a;
                i10 = c1174v.f17199e;
                Db.q qVar32 = Db.q.f3365a;
                if (i10 != 0) {
                }
            case 2:
                Object a9 = AbstractC1208c.a((Hb.i) this.f17145c, obj, this.f17146d, (gc.G) this.f17144b, dVar);
                return a9 == Ib.a.f5345a ? a9 : Db.q.f3365a;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    Rb.e eVar = (Rb.e) ((Q.W) this.f17144b).getValue();
                    i0 i0Var = (i0) this.f17146d;
                    z8 = ((Boolean) eVar.invoke(i0Var.f26099a.l(), i0Var.f26102d.getValue())).booleanValue();
                } else {
                    z8 = false;
                }
                ((C0497j0) this.f17145c).setValue(Boolean.valueOf(z8));
                return Db.q.f3365a;
            case 4:
                C0857a c0857a = (C0857a) obj;
                if (((List) ((Q.W) this.f17145c).getValue()).size() > 1) {
                    ((Q.W) this.f17146d).setValue(Boolean.TRUE);
                    ((C0479a0) this.f17144b).f(c0857a.f14018c);
                }
                return Db.q.f3365a;
            default:
                z3.e eVar2 = (z3.e) obj;
                boolean z10 = eVar2 instanceof z3.h;
                y3.p pVar = (y3.p) this.f17145c;
                if (z10) {
                    z3.h hVar = (z3.h) eVar2;
                    pVar.getClass();
                    A3.a aVar4 = hVar.f28237d;
                    A3.a aVar5 = A3.a.f346e;
                    C2378a c2378a = C2378a.f26794b;
                    if (aVar4 == aVar5 || !pVar.f26836P || pVar.f26830I.equals(C2378a.f26793a)) {
                        pVar.f26836P = false;
                        pVar.f26841U = c2378a;
                    } else {
                        pVar.f26836P = false;
                        pVar.f26841U = c2378a;
                        cc.F.B((cc.E) this.f17146d, null, 0, new y3.n(pVar, null), 3);
                    }
                    jVar = new Db.j(new y3.s(hVar.f28237d), new y3.h((Drawable) hVar.f28235b));
                } else {
                    if (!(eVar2 instanceof z3.g)) {
                        throw new Db.d(1);
                    }
                    int b2 = P.c.b(((z3.g) eVar2).f28232a);
                    if (b2 == 0 || b2 == 1) {
                        obj2 = y3.r.f26844a;
                    } else {
                        if (b2 == 2) {
                            throw new IllegalStateException();
                        }
                        if (b2 != 3) {
                            throw new Db.d(1);
                        }
                        obj2 = y3.q.f26843a;
                    }
                    if (obj2 instanceof y3.r) {
                        abstractC1775c = pVar.f26833M;
                    } else {
                        if (!(obj2 instanceof y3.q)) {
                            if (obj2 instanceof y3.s) {
                                throw new IllegalStateException();
                            }
                            throw new Db.d(1);
                        }
                        abstractC1775c = pVar.f26834N;
                    }
                    y3.j iVar = abstractC1775c != null ? new y3.i(abstractC1775c) : new y3.h(((z3.g) eVar2).f28233b);
                    pVar.f26835O = iVar.b();
                    pVar.f26837Q = null;
                    jVar = new Db.j(obj2, iVar);
                }
                pVar.t0((y3.j) jVar.f3355b);
                if (pVar.f26839S) {
                    AbstractC0017g.k(pVar);
                } else {
                    AbstractC0017g.l(pVar);
                }
                return Db.q.f3365a;
        }
    }
}
