package db;

/* renamed from: db.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1068a implements InterfaceC1070c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16618c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1070c f16619a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f16620b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, db.c, db.a] */
    public static InterfaceC1070c a(InterfaceC1070c interfaceC1070c) {
        if (interfaceC1070c instanceof C1068a) {
            return interfaceC1070c;
        }
        ?? obj = new Object();
        obj.f16620b = f16618c;
        obj.f16619a = interfaceC1070c;
        return obj;
    }

    @Override // Cb.a
    public final Object get() {
        Object obj = this.f16620b;
        Object obj2 = f16618c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f16620b;
                if (obj == obj2) {
                    obj = this.f16619a.get();
                    Object obj3 = this.f16620b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f16620b = obj;
                    this.f16619a = null;
                }
            }
        }
        return obj;
    }
}
