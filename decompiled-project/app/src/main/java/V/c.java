package V;

import Eb.AbstractC0256g;

/* loaded from: classes.dex */
public class c extends AbstractC0256g {

    /* renamed from: c, reason: collision with root package name */
    public static final c f9939c = new c(l.f9957e, 0);

    /* renamed from: a, reason: collision with root package name */
    public final l f9940a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9941b;

    public c(l lVar, int i7) {
        this.f9940a = lVar;
        this.f9941b = i7;
    }

    public final c a(Object obj, W.a aVar) {
        A7.a u3 = this.f9940a.u(obj, obj != null ? obj.hashCode() : 0, 0, aVar);
        return u3 == null ? this : new c((l) u3.f532b, this.f9941b + u3.f531a);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f9940a.d(obj, obj != null ? obj.hashCode() : 0, 0);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f9940a.g(obj, obj != null ? obj.hashCode() : 0, 0);
    }
}
