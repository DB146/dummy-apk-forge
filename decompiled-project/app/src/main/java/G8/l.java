package G8;

import J8.AbstractC0368x;

/* loaded from: classes.dex */
public class l extends AbstractC0368x {

    /* renamed from: a, reason: collision with root package name */
    public z f4378a = null;

    @Override // G8.z
    public final Object b(O8.a aVar) {
        z zVar = this.f4378a;
        if (zVar != null) {
            return zVar.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        z zVar = this.f4378a;
        if (zVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        zVar.c(bVar, obj);
    }

    @Override // J8.AbstractC0368x
    public final z d() {
        z zVar = this.f4378a;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
