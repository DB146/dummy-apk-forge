package D8;

/* loaded from: classes.dex */
public final class a implements Cb.a, C8.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3285c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Cb.a f3286a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3287b = f3285c;

    public a(Cb.a aVar) {
        this.f3286a = aVar;
    }

    public static Cb.a a(b bVar) {
        return bVar instanceof a ? bVar : new a(bVar);
    }

    @Override // Cb.a
    public final Object get() {
        Object obj = this.f3287b;
        Object obj2 = f3285c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f3287b;
                    if (obj == obj2) {
                        obj = this.f3286a.get();
                        Object obj3 = this.f3287b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f3287b = obj;
                        this.f3286a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
