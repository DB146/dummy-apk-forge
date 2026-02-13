package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class r implements K {

    /* renamed from: b, reason: collision with root package name */
    public static final r f13447b = new r(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13448a;

    public /* synthetic */ r(int i7) {
        this.f13448a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final V a(Class cls) {
        switch (this.f13448a) {
            case 0:
                if (!AbstractC0817u.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC0817u.f(cls.asSubclass(AbstractC0817u.class)).e(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean b(Class cls) {
        switch (this.f13448a) {
            case 0:
                return AbstractC0817u.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
