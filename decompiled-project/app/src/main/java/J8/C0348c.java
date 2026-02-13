package J8;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: J8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348c extends G8.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5663a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5664b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5665c;

    public C0348c(T t5, Class cls) {
        this.f5665c = t5;
        this.f5664b = cls;
    }

    public C0348c(C0369y c0369y, I8.o oVar) {
        this.f5664b = c0369y;
        this.f5665c = oVar;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        switch (this.f5663a) {
            case 0:
                if (aVar.j0() == 9) {
                    aVar.f0();
                    return null;
                }
                Collection collection = (Collection) ((I8.o) this.f5665c).h();
                aVar.l();
                while (aVar.W()) {
                    collection.add(((C0369y) this.f5664b).f5738b.b(aVar));
                }
                aVar.P();
                return collection;
            default:
                Object b2 = ((T) this.f5665c).f5656c.b(aVar);
                if (b2 != null) {
                    Class cls = (Class) this.f5664b;
                    if (!cls.isInstance(b2)) {
                        throw new Db.d("Expected a " + cls.getName() + " but was " + b2.getClass().getName() + "; at path " + aVar.V(true), 4);
                    }
                }
                return b2;
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        switch (this.f5663a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    bVar.W();
                    return;
                }
                bVar.n();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((C0369y) this.f5664b).c(bVar, it.next());
                }
                bVar.P();
                return;
            default:
                ((T) this.f5665c).f5656c.c(bVar, obj);
                return;
        }
    }
}
