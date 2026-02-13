package I8;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class q extends t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f5307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5308c;

    public q(Method method, int i7) {
        this.f5307b = method;
        this.f5308c = i7;
    }

    @Override // I8.t
    public final Object a(Class cls) {
        String a9 = q3.e.a(cls);
        if (a9 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a9));
        }
        return this.f5307b.invoke(null, cls, Integer.valueOf(this.f5308c));
    }
}
