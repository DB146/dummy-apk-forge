package I8;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f5309b;

    public r(Method method) {
        this.f5309b = method;
    }

    @Override // I8.t
    public final Object a(Class cls) {
        String a9 = q3.e.a(cls);
        if (a9 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(a9));
        }
        return this.f5309b.invoke(null, cls, Object.class);
    }
}
