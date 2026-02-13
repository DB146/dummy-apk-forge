package M1;

import cc.E0;
import fc.C1154a;
import fc.C1173u;
import fc.InterfaceC1161h;
import fc.InterfaceC1162i;
import gc.C1205A;

/* renamed from: M1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405u implements InterfaceC1161h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6719a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6720b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0405u(Rb.e eVar) {
        this.f6719a = 2;
        this.f6720b = (Jb.i) eVar;
    }

    public /* synthetic */ C0405u(Object obj, int i7) {
        this.f6719a = i7;
        this.f6720b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Type inference failed for: r9v12, types: [Jb.i, Rb.e] */
    @Override // fc.InterfaceC1161h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        C1154a c1154a;
        int i7;
        Throwable th;
        C1205A c1205a;
        switch (this.f6719a) {
            case 0:
                Object a9 = ((C1173u) this.f6720b).a(new C0404t(interfaceC1162i, 0), dVar);
                return a9 == Ib.a.f5345a ? a9 : Db.q.f3365a;
            case 1:
                Object a10 = ((K2.l) this.f6720b).a(new C0404t(interfaceC1162i, 1), dVar);
                return a10 == Ib.a.f5345a ? a10 : Db.q.f3365a;
            case 2:
                if (dVar instanceof C1154a) {
                    c1154a = (C1154a) dVar;
                    int i10 = c1154a.f17118d;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c1154a.f17118d = i10 - Integer.MIN_VALUE;
                        Object obj = c1154a.f17116b;
                        Ib.a aVar = Ib.a.f5345a;
                        i7 = c1154a.f17118d;
                        Db.q qVar = Db.q.f3365a;
                        if (i7 != 0) {
                            com.bumptech.glide.c.c0(obj);
                            C1205A c1205a2 = new C1205A(interfaceC1162i, c1154a.getContext());
                            try {
                                c1154a.f17115a = c1205a2;
                                c1154a.f17118d = 1;
                                Object invoke = ((Jb.i) this.f6720b).invoke(c1205a2, c1154a);
                                if (invoke != aVar) {
                                    invoke = qVar;
                                }
                                if (invoke == aVar) {
                                    return aVar;
                                }
                                c1205a = c1205a2;
                            } catch (Throwable th2) {
                                th = th2;
                                c1205a = c1205a2;
                                c1205a.releaseIntercepted();
                                throw th;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1205a = c1154a.f17115a;
                            try {
                                com.bumptech.glide.c.c0(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                c1205a.releaseIntercepted();
                                throw th;
                            }
                        }
                        c1205a.releaseIntercepted();
                        return qVar;
                    }
                }
                c1154a = new C1154a(this, dVar);
                Object obj2 = c1154a.f17116b;
                Ib.a aVar2 = Ib.a.f5345a;
                i7 = c1154a.f17118d;
                Db.q qVar2 = Db.q.f3365a;
                if (i7 != 0) {
                }
                c1205a.releaseIntercepted();
                return qVar2;
            case 3:
                InterfaceC1161h[] interfaceC1161hArr = (InterfaceC1161h[]) this.f6720b;
                gc.u uVar = new gc.u(interfaceC1161hArr, new A0.J(interfaceC1161hArr, 18), new A8.H(3, null, 1), interfaceC1162i, null);
                E0 e02 = new E0(dVar.getContext(), dVar, 1);
                Object I6 = O5.b.I(e02, e02, uVar);
                Ib.a aVar3 = Ib.a.f5345a;
                Db.q qVar3 = Db.q.f3365a;
                if (I6 != aVar3) {
                    I6 = qVar3;
                }
                return I6 == aVar3 ? I6 : qVar3;
            case 4:
                Object a11 = ((C1173u) this.f6720b).a(new C0404t(interfaceC1162i, 2), dVar);
                return a11 == Ib.a.f5345a ? a11 : Db.q.f3365a;
            default:
                Object a12 = ((InterfaceC1161h) this.f6720b).a(new C0404t(interfaceC1162i, 3), dVar);
                return a12 == Ib.a.f5345a ? a12 : Db.q.f3365a;
        }
    }
}
