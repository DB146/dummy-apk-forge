package gc;

import cc.AbstractC0921a0;
import cc.G0;
import cc.O0;
import fc.InterfaceC1162i;

/* loaded from: classes2.dex */
public final class s implements InterfaceC1162i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec.d f17543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17544b;

    public s(ec.d dVar, int i7) {
        this.f17543a = dVar;
        this.f17544b = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v2, types: [Hb.i, Hb.a, cc.O0] */
    @Override // fc.InterfaceC1162i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Hb.d dVar) {
        r rVar;
        Object obj2;
        int i7;
        Object obj3;
        hc.h hVar;
        Object obj4;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i10 = rVar.f17542c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f17542c = i10 - Integer.MIN_VALUE;
                Object obj5 = rVar.f17540a;
                obj2 = Ib.a.f5345a;
                i7 = rVar.f17542c;
                obj3 = Db.q.f3365a;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj5);
                    Eb.y yVar = new Eb.y(this.f17544b, obj);
                    rVar.f17542c = 1;
                    if (this.f17543a.a(rVar, yVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            com.bumptech.glide.c.c0(obj5);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj5);
                }
                rVar.f17542c = 2;
                Hb.i context = rVar.getContext();
                cc.F.m(context);
                Hb.d F10 = com.bumptech.glide.c.F(rVar);
                hVar = !(F10 instanceof hc.h) ? (hc.h) F10 : null;
                if (hVar != null) {
                    cc.A a9 = hVar.f17943d;
                    if (a9.V(context)) {
                        hVar.f17945f = obj3;
                        hVar.f14494c = 1;
                        a9.U(context, hVar);
                    } else {
                        ?? aVar = new Hb.a(O0.f14496c);
                        Hb.i plus = context.plus(aVar);
                        hVar.f17945f = obj3;
                        hVar.f14494c = 1;
                        a9.U(plus, hVar);
                        if (aVar.f14497b) {
                            AbstractC0921a0 a10 = G0.a();
                            Eb.l lVar = a10.f14518e;
                            if (!(lVar != null ? lVar.isEmpty() : true)) {
                                if (a10.b0()) {
                                    hVar.f17945f = obj3;
                                    hVar.f14494c = 1;
                                    a10.Y(hVar);
                                } else {
                                    a10.a0(true);
                                    try {
                                        hVar.run();
                                        do {
                                        } while (a10.d0());
                                    } finally {
                                        try {
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj4 = obj2;
                    if (obj4 != Ib.a.f5345a) {
                        obj4 = obj3;
                    }
                    return obj4 == obj2 ? obj2 : obj3;
                }
                obj4 = obj3;
                if (obj4 != Ib.a.f5345a) {
                }
                if (obj4 == obj2) {
                }
            }
        }
        rVar = new r(this, dVar);
        Object obj52 = rVar.f17540a;
        obj2 = Ib.a.f5345a;
        i7 = rVar.f17542c;
        obj3 = Db.q.f3365a;
        if (i7 != 0) {
        }
        rVar.f17542c = 2;
        Hb.i context2 = rVar.getContext();
        cc.F.m(context2);
        Hb.d F102 = com.bumptech.glide.c.F(rVar);
        if (!(F102 instanceof hc.h)) {
        }
        if (hVar != null) {
        }
        obj4 = obj3;
        if (obj4 != Ib.a.f5345a) {
        }
        if (obj4 == obj2) {
        }
    }
}
