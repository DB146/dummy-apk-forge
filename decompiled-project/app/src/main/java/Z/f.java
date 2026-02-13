package Z;

import Q.E;
import a0.C0691r;
import java.util.Map;
import u.C2046I;
import v2.C2133e;
import w.C2187n;
import w2.r;

/* loaded from: classes.dex */
public final class f implements E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12089d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i7) {
        this.f12086a = i7;
        this.f12088c = obj;
        this.f12087b = obj2;
        this.f12089d = obj3;
    }

    @Override // Q.E
    public final void b() {
        switch (this.f12086a) {
            case 0:
                g gVar = (g) this.f12088c;
                C2046I c2046i = gVar.f12092b;
                Object obj = this.f12087b;
                Object j = c2046i.j(obj);
                j jVar = (j) this.f12089d;
                if (j == jVar) {
                    Map c10 = jVar.c();
                    boolean isEmpty = c10.isEmpty();
                    Map map = gVar.f12091a;
                    if (isEmpty) {
                        map.remove(obj);
                        return;
                    } else {
                        map.put(obj, c10);
                        return;
                    }
                }
                return;
            case 1:
                C0691r c0691r = (C0691r) this.f12088c;
                Object obj2 = this.f12087b;
                c0691r.remove(obj2);
                ((C2187n) this.f12089d).f25593d.j(obj2);
                return;
            default:
                r rVar = (r) this.f12088c;
                C2133e c2133e = (C2133e) this.f12087b;
                rVar.b().c(c2133e);
                ((C0691r) this.f12089d).remove(c2133e);
                return;
        }
    }
}
