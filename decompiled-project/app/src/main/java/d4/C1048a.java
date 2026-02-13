package d4;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1048a implements Cb.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16515c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1049b f16516a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f16517b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, d4.a, Cb.a] */
    public static Cb.a a(InterfaceC1049b interfaceC1049b) {
        if (interfaceC1049b instanceof C1048a) {
            return interfaceC1049b;
        }
        ?? obj = new Object();
        obj.f16517b = f16515c;
        obj.f16516a = interfaceC1049b;
        return obj;
    }

    @Override // Cb.a
    public final Object get() {
        Object obj = this.f16517b;
        Object obj2 = f16515c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f16517b;
                    if (obj == obj2) {
                        obj = this.f16516a.get();
                        Object obj3 = this.f16517b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16517b = obj;
                        this.f16516a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
