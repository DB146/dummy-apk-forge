package gc;

import fc.InterfaceC1161h;
import fc.InterfaceC1162i;
import java.util.ArrayList;

/* renamed from: gc.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1212g implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Hb.i f17515a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17516b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17517c;

    public AbstractC1212g(Hb.i iVar, int i7, int i10) {
        this.f17515a = iVar;
        this.f17516b = i7;
        this.f17517c = i10;
    }

    @Override // fc.InterfaceC1161h
    public Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        Object k = cc.F.k(new C1210e(interfaceC1162i, this, null), dVar);
        return k == Ib.a.f5345a ? k : Db.q.f3365a;
    }

    @Override // gc.w
    public final InterfaceC1161h b(Hb.i iVar, int i7, int i10) {
        Hb.i iVar2 = this.f17515a;
        Hb.i plus = iVar.plus(iVar2);
        int i11 = this.f17517c;
        int i12 = this.f17516b;
        if (i10 == 1) {
            if (i12 != -3) {
                if (i7 != -3) {
                    if (i12 != -2) {
                        if (i7 != -2) {
                            i7 += i12;
                            if (i7 < 0) {
                                i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i7 = i12;
            }
            i10 = i11;
        }
        return (kotlin.jvm.internal.l.a(plus, iVar2) && i7 == i12 && i10 == i11) ? this : e(plus, i7, i10);
    }

    public String c() {
        return null;
    }

    public abstract Object d(ec.r rVar, Hb.d dVar);

    public abstract AbstractC1212g e(Hb.i iVar, int i7, int i10);

    public InterfaceC1161h f() {
        return null;
    }

    public ec.t g(cc.E e2) {
        int i7 = this.f17516b;
        if (i7 == -3) {
            i7 = -2;
        }
        Rb.e c1211f = new C1211f(this, null);
        ec.q qVar = new ec.q(cc.F.C(e2, this.f17515a), Q5.e.a(i7, this.f17517c, 4));
        qVar.Y(3, qVar, c1211f);
        return qVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c10 = c();
        if (c10 != null) {
            arrayList.add(c10);
        }
        Hb.j jVar = Hb.j.f4919a;
        Hb.i iVar = this.f17515a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i7 = this.f17516b;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        int i10 = this.f17517c;
        if (i10 != 1) {
            arrayList.add("onBufferOverflow=".concat(X.c.A(i10)));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return A3.c.l(sb2, Eb.o.d0(arrayList, ", ", null, null, null, 62), ']');
    }
}
