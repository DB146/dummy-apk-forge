package V;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final g f9937d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9938e;

    public b(g gVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f9937d = gVar;
        this.f9938e = obj2;
    }

    @Override // V.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f9938e;
    }

    @Override // V.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f9938e;
        this.f9938e = obj;
        e eVar = (e) this.f9937d.f9952b;
        Y.i iVar = eVar.f9945d;
        Object obj3 = this.f9935b;
        if (iVar.containsKey(obj3)) {
            boolean z8 = eVar.f9944c;
            if (!z8) {
                iVar.put(obj3, obj);
            } else {
                if (!z8) {
                    throw new NoSuchElementException();
                }
                m mVar = eVar.f9942a[eVar.f9943b];
                Object obj4 = mVar.f9962a[mVar.f9964c];
                iVar.put(obj3, obj);
                eVar.c(obj4 != null ? obj4.hashCode() : 0, iVar.f11048b, obj4, 0);
            }
            eVar.f9948u = iVar.f11050d;
        }
        return obj2;
    }
}
