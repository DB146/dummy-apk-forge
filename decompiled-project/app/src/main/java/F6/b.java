package F6;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4148c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile c f4149a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f4150b;

    /* JADX WARN: Type inference failed for: r0v1, types: [F6.b, F6.c, java.lang.Object] */
    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        ?? obj = new Object();
        obj.f4150b = f4148c;
        obj.f4149a = cVar;
        return obj;
    }

    @Override // F6.c
    public final Object zza() {
        Object obj = this.f4150b;
        Object obj2 = f4148c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f4150b;
                    if (obj == obj2) {
                        obj = this.f4149a.zza();
                        Object obj3 = this.f4150b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f4150b = obj;
                        this.f4149a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
