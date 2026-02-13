package w2;

import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import a0.C0691r;
import v2.C2133e;

/* loaded from: classes.dex */
public final class o implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2133e f25695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f25696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z.g f25697c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0691r f25698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f25699e;

    public o(C2133e c2133e, r rVar, Z.g gVar, C0691r c0691r, q qVar) {
        this.f25695a = c2133e;
        this.f25696b = rVar;
        this.f25697c = gVar;
        this.f25698d = c0691r;
        this.f25699e = qVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C0506o c0506o = (C0506o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0506o.x()) {
            c0506o.N();
        } else {
            C2133e c2133e = this.f25695a;
            boolean i7 = c0506o.i(c2133e);
            r rVar = this.f25696b;
            boolean i10 = i7 | c0506o.i(rVar);
            Object H10 = c0506o.H();
            if (i10 || H10 == C0498k.f8409a) {
                H10 = new U9.k(this.f25698d, c2133e, rVar, 4);
                c0506o.d0(H10);
            }
            C0480b.c(c2133e, (Rb.c) H10, c0506o);
            c2.q.d(c2133e, this.f25697c, Y.f.d(-497631156, new n(0, this.f25699e, c2133e), c0506o), c0506o, 384);
        }
        return Db.q.f3365a;
    }
}
