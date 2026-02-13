package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final T f13352c = new T();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f13354b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final E f13353a = new E();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.N] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.N] */
    public final W a(Class cls) {
        C0811n c0811n;
        M x2;
        M m10;
        Class cls2;
        AbstractC0819w.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f13354b;
        W w10 = (W) concurrentHashMap.get(cls);
        if (w10 != null) {
            return w10;
        }
        E e2 = this.f13353a;
        e2.getClass();
        Class cls3 = X.f13362a;
        if (!AbstractC0817u.class.isAssignableFrom(cls) && (cls2 = X.f13362a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V a9 = ((D) e2.f13325a).a(cls);
        if ((a9.f13361d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0817u.class.isAssignableFrom(cls);
            AbstractC0817u abstractC0817u = a9.f13358a;
            if (isAssignableFrom) {
                m10 = new N(X.f13364c, AbstractC0812o.f13437a, abstractC0817u);
            } else {
                e0 e0Var = X.f13363b;
                C0811n c0811n2 = AbstractC0812o.f13438b;
                if (c0811n2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                m10 = new N(e0Var, c0811n2, abstractC0817u);
            }
            x2 = m10;
        } else if (AbstractC0817u.class.isAssignableFrom(cls)) {
            O o10 = P.f13351b;
            B b2 = C.f13322b;
            e0 e0Var2 = X.f13364c;
            C0811n c0811n3 = P.c.b(a9.d()) != 1 ? AbstractC0812o.f13437a : null;
            I i7 = J.f13333b;
            int[] iArr = M.f13335n;
            if (!(a9 instanceof V)) {
                a9.getClass();
                throw new ClassCastException();
            }
            x2 = M.x(a9, o10, b2, e0Var2, c0811n3, i7);
        } else {
            O o11 = P.f13350a;
            B b10 = C.f13321a;
            e0 e0Var3 = X.f13363b;
            if (P.c.b(a9.d()) != 1) {
                c0811n = AbstractC0812o.f13438b;
                if (c0811n == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0811n = null;
            }
            I i10 = J.f13332a;
            int[] iArr2 = M.f13335n;
            if (!(a9 instanceof V)) {
                a9.getClass();
                throw new ClassCastException();
            }
            x2 = M.x(a9, o11, b10, e0Var3, c0811n, i10);
        }
        W w11 = (W) concurrentHashMap.putIfAbsent(cls, x2);
        return w11 != null ? w11 : x2;
    }
}
