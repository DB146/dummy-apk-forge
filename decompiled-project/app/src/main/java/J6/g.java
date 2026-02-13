package J6;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5556c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile h f5557a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f5558b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [J6.g, java.lang.Object] */
    public static g b(h hVar) {
        if (hVar instanceof g) {
            return (g) hVar;
        }
        ?? obj = new Object();
        obj.f5558b = f5556c;
        obj.f5557a = hVar;
        return obj;
    }

    @Override // J6.i
    public final Object a() {
        Object obj = this.f5558b;
        Object obj2 = f5556c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f5558b;
                    if (obj == obj2) {
                        obj = this.f5557a.a();
                        Object obj3 = this.f5558b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f5558b = obj;
                        this.f5557a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
