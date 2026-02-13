package J8;

import java.util.Iterator;
import java.util.Map;

/* renamed from: J8.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0363s extends G8.z {

    /* renamed from: a, reason: collision with root package name */
    public final C0365u f5723a;

    public AbstractC0363s(C0365u c0365u) {
        this.f5723a = c0365u;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        Object d10 = d();
        Map map = this.f5723a.f5726a;
        try {
            aVar.n();
            while (aVar.W()) {
                r rVar = (r) map.get(aVar.d0());
                if (rVar == null) {
                    aVar.p0();
                } else {
                    f(d10, aVar, rVar);
                }
            }
            aVar.T();
            return e(d10);
        } catch (IllegalAccessException e2) {
            com.bumptech.glide.d dVar = L8.c.f6421a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalStateException e10) {
            throw new Db.d(4, e10);
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        if (obj == null) {
            bVar.W();
            return;
        }
        bVar.F();
        try {
            Iterator it = this.f5723a.f5727b.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a(bVar, obj);
            }
            bVar.T();
        } catch (IllegalAccessException e2) {
            com.bumptech.glide.d dVar = L8.c.f6421a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, O8.a aVar, r rVar);
}
