package w2;

import Q.C0506o;
import Q.R0;
import Q.W;
import java.util.List;
import java.util.ListIterator;
import v2.C2133e;
import w.C2182i;
import x.O;

/* loaded from: classes.dex */
public final class B implements Rb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f25663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2133e f25664b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z.g f25665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f25666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R0 f25667e;

    public B(O o10, C2133e c2133e, Z.g gVar, W w10, R0 r02) {
        this.f25663a = o10;
        this.f25664b = c2133e;
        this.f25665c = gVar;
        this.f25666d = w10;
        this.f25667e = r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // Rb.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        C2133e c2133e;
        C2182i c2182i = (C2182i) obj;
        C2133e c2133e2 = (C2133e) obj2;
        C0506o c0506o = (C0506o) obj3;
        ((Number) obj4).intValue();
        boolean a9 = kotlin.jvm.internal.l.a(this.f25663a.f25965c.getValue(), this.f25664b);
        if (!((Boolean) this.f25666d.getValue()).booleanValue() && !a9) {
            List list = (List) this.f25667e.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c2133e = 0;
                    break;
                }
                c2133e = listIterator.previous();
                if (kotlin.jvm.internal.l.a(c2133e2, (C2133e) c2133e)) {
                    break;
                }
            }
            c2133e2 = c2133e;
        }
        if (c2133e2 == null) {
            c0506o.S(105930796);
        } else {
            c0506o.S(-1520603531);
            c2.q.d(c2133e2, this.f25665c, Y.f.d(-1263531443, new n(c2133e2, c2182i), c0506o), c0506o, 384);
        }
        c0506o.p(false);
        return Db.q.f3365a;
    }
}
