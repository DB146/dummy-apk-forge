package D8;

/* loaded from: classes.dex */
public final class c implements b, C8.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3288a;

    public c(Object obj) {
        this.f3288a = obj;
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // Cb.a
    public final Object get() {
        return this.f3288a;
    }
}
