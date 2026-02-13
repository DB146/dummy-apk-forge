package I8;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f5305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5306c;

    public p(Method method, Object obj) {
        this.f5305b = method;
        this.f5306c = obj;
    }

    @Override // I8.t
    public final Object a(Class cls) {
        String a9 = q3.e.a(cls);
        if (a9 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a9));
        }
        return this.f5305b.invoke(this.f5306c, cls);
    }
}
