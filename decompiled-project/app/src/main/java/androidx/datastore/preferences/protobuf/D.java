package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class D implements K {

    /* renamed from: a, reason: collision with root package name */
    public K[] f13323a;

    @Override // androidx.datastore.preferences.protobuf.K
    public final V a(Class cls) {
        for (K k : this.f13323a) {
            if (k.b(cls)) {
                return k.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean b(Class cls) {
        for (K k : this.f13323a) {
            if (k.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
