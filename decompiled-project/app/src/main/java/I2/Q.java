package I2;

import A0.AbstractC0017g;
import cc.InterfaceC0937i0;
import fc.InterfaceC1162i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import y.C2313v;

/* loaded from: classes.dex */
public final class Q implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f5072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5075e;

    public /* synthetic */ Q(Serializable serializable, Object obj, Serializable serializable2, Object obj2, int i7) {
        this.f5071a = i7;
        this.f5072b = serializable;
        this.f5073c = obj;
        this.f5074d = serializable2;
        this.f5075e = obj2;
    }

    public Q(kotlin.jvm.internal.v vVar, cc.E e2, gc.n nVar, InterfaceC1162i interfaceC1162i) {
        this.f5071a = 1;
        this.f5072b = vVar;
        this.f5074d = e2;
        this.f5075e = nVar;
        this.f5073c = interfaceC1162i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int[] iArr, Hb.d dVar) {
        P p10;
        int i7;
        Q q10;
        if (dVar instanceof P) {
            p10 = (P) dVar;
            int i10 = p10.f5070e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p10.f5070e = i10 - Integer.MIN_VALUE;
                Object obj = p10.f5068c;
                Ib.a aVar = Ib.a.f5345a;
                i7 = p10.f5070e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f5072b;
                    Object obj2 = vVar.f19134a;
                    String[] strArr = (String[]) this.f5074d;
                    InterfaceC1162i interfaceC1162i = (InterfaceC1162i) this.f5073c;
                    if (obj2 == null) {
                        Set f02 = Eb.n.f0(strArr);
                        p10.f5066a = this;
                        p10.f5067b = iArr;
                        p10.f5070e = 1;
                        if (interfaceC1162i.emit(f02, p10) == aVar) {
                            return aVar;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            String str = strArr[i11];
                            int i13 = i12 + 1;
                            Object obj3 = vVar.f19134a;
                            if (obj3 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            int i14 = ((int[]) this.f5075e)[i12];
                            if (((int[]) obj3)[i14] != iArr[i14]) {
                                arrayList.add(str);
                            }
                            i11++;
                            i12 = i13;
                        }
                        if (!arrayList.isEmpty()) {
                            Set w02 = Eb.o.w0(arrayList);
                            p10.f5066a = this;
                            p10.f5067b = iArr;
                            p10.f5070e = 2;
                            if (interfaceC1162i.emit(w02, p10) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    q10 = this;
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iArr = p10.f5067b;
                    q10 = p10.f5066a;
                    com.bumptech.glide.c.c0(obj);
                }
                ((kotlin.jvm.internal.v) q10.f5072b).f19134a = iArr;
                return Db.q.f3365a;
            }
        }
        p10 = new P(this, dVar);
        Object obj4 = p10.f5068c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = p10.f5070e;
        if (i7 != 0) {
        }
        ((kotlin.jvm.internal.v) q10.f5072b).f19134a = iArr;
        return Db.q.f3365a;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    @Override // fc.InterfaceC1162i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Hb.d dVar) {
        gc.l lVar;
        int i7;
        Q q10;
        switch (this.f5071a) {
            case 0:
                return a((int[]) obj, dVar);
            case 1:
                if (dVar instanceof gc.l) {
                    lVar = (gc.l) dVar;
                    int i10 = lVar.f17530e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        lVar.f17530e = i10 - Integer.MIN_VALUE;
                        Object obj2 = lVar.f17528c;
                        Ib.a aVar = Ib.a.f5345a;
                        i7 = lVar.f17530e;
                        if (i7 != 0) {
                            com.bumptech.glide.c.c0(obj2);
                            InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) ((kotlin.jvm.internal.v) this.f5072b).f19134a;
                            if (interfaceC0937i0 != null) {
                                interfaceC0937i0.cancel(new CancellationException("Child of the scoped flow was cancelled"));
                                lVar.f17526a = this;
                                lVar.f17527b = obj;
                                lVar.f17530e = 1;
                                if (interfaceC0937i0.join(lVar) == aVar) {
                                    return aVar;
                                }
                            }
                            q10 = this;
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = lVar.f17527b;
                            q10 = lVar.f17526a;
                            com.bumptech.glide.c.c0(obj2);
                        }
                        ((kotlin.jvm.internal.v) q10.f5072b).f19134a = cc.F.B((cc.E) q10.f5074d, null, 4, new gc.k((gc.n) q10.f5075e, (InterfaceC1162i) q10.f5073c, obj, null), 1);
                        return Db.q.f3365a;
                    }
                }
                lVar = new gc.l(this, dVar);
                Object obj22 = lVar.f17528c;
                Ib.a aVar2 = Ib.a.f5345a;
                i7 = lVar.f17530e;
                if (i7 != 0) {
                }
                ((kotlin.jvm.internal.v) q10.f5072b).f19134a = cc.F.B((cc.E) q10.f5074d, null, 4, new gc.k((gc.n) q10.f5075e, (InterfaceC1162i) q10.f5073c, obj, null), 1);
                return Db.q.f3365a;
            default:
                A.h hVar = (A.h) obj;
                boolean z8 = hVar instanceof A.k;
                kotlin.jvm.internal.t tVar = (kotlin.jvm.internal.t) this.f5074d;
                kotlin.jvm.internal.t tVar2 = (kotlin.jvm.internal.t) this.f5073c;
                kotlin.jvm.internal.t tVar3 = (kotlin.jvm.internal.t) this.f5072b;
                boolean z10 = true;
                if (z8) {
                    tVar3.f19132a++;
                } else if (hVar instanceof A.l) {
                    tVar3.f19132a--;
                } else if (hVar instanceof A.j) {
                    tVar3.f19132a--;
                } else if (hVar instanceof A.f) {
                    tVar2.f19132a++;
                } else if (hVar instanceof A.g) {
                    tVar2.f19132a--;
                } else if (hVar instanceof A.d) {
                    tVar.f19132a++;
                } else if (hVar instanceof A.e) {
                    tVar.f19132a--;
                }
                boolean z11 = false;
                boolean z12 = tVar3.f19132a > 0;
                boolean z13 = tVar2.f19132a > 0;
                boolean z14 = tVar.f19132a > 0;
                C2313v c2313v = (C2313v) this.f5075e;
                if (c2313v.f26530D != z12) {
                    c2313v.f26530D = z12;
                    z11 = true;
                }
                if (c2313v.f26531E != z13) {
                    c2313v.f26531E = z13;
                    z11 = true;
                }
                if (c2313v.f26532F != z14) {
                    c2313v.f26532F = z14;
                } else {
                    z10 = z11;
                }
                if (z10) {
                    AbstractC0017g.k(c2313v);
                }
                return Db.q.f3365a;
        }
    }
}
