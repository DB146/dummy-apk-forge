package Z;

import A0.C0005a;
import C.D;
import Db.q;
import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import Q.S;
import Q.S0;
import java.util.Map;
import q3.s;
import u.C2046I;
import u.Q;

/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final s f12090e;

    /* renamed from: a, reason: collision with root package name */
    public final Map f12091a;

    /* renamed from: b, reason: collision with root package name */
    public final C2046I f12092b;

    /* renamed from: c, reason: collision with root package name */
    public j f12093c;

    /* renamed from: d, reason: collision with root package name */
    public final C0005a f12094d;

    static {
        d dVar = d.f12080b;
        e eVar = e.f12083b;
        s sVar = n.f12102a;
        f12090e = new s(24, dVar, eVar, false);
    }

    public g(Map map) {
        this.f12091a = map;
        long[] jArr = Q.f24633a;
        this.f12092b = new C2046I();
        this.f12094d = new C0005a(this, 19);
    }

    @Override // Z.c
    public final void d(Object obj, Y.e eVar, C0506o c0506o, int i7) {
        c0506o.S(-1198538093);
        c0506o.V(obj);
        Object H10 = c0506o.H();
        S s3 = C0498k.f8409a;
        if (H10 == s3) {
            C0005a c0005a = this.f12094d;
            if (!((Boolean) c0005a.invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Map map = (Map) this.f12091a.get(obj);
            S0 s02 = l.f12101a;
            k kVar = new k(map, c0005a);
            c0506o.d0(kVar);
            H10 = kVar;
        }
        j jVar = (j) H10;
        C0480b.a(l.f12101a.a(jVar), eVar, c0506o, (i7 & 112) | 8);
        q qVar = q.f3365a;
        boolean i10 = c0506o.i(this) | c0506o.i(obj) | c0506o.i(jVar);
        Object H11 = c0506o.H();
        if (i10 || H11 == s3) {
            H11 = new D(this, obj, jVar, 2);
            c0506o.d0(H11);
        }
        C0480b.c(qVar, (Rb.c) H11, c0506o);
        if (c0506o.f8471x && c0506o.f8440F.f8580i == c0506o.f8472y) {
            c0506o.f8472y = -1;
            c0506o.f8471x = false;
        }
        c0506o.p(false);
        c0506o.p(false);
    }

    @Override // Z.c
    public final void f(Object obj) {
        if (this.f12092b.j(obj) == null) {
            this.f12091a.remove(obj);
        }
    }
}
