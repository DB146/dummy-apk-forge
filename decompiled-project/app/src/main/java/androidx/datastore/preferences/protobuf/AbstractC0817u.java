package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0817u extends AbstractC0798a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0817u> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected d0 unknownFields;

    public AbstractC0817u() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = d0.f13387f;
    }

    public static AbstractC0817u f(Class cls) {
        AbstractC0817u abstractC0817u = defaultInstanceMap.get(cls);
        if (abstractC0817u == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0817u = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0817u == null) {
            abstractC0817u = (AbstractC0817u) ((AbstractC0817u) j0.d(cls)).e(6);
            if (abstractC0817u == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0817u);
        }
        return abstractC0817u;
    }

    public static Object g(Method method, AbstractC0798a abstractC0798a, Object... objArr) {
        try {
            return method.invoke(abstractC0798a, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean h(AbstractC0817u abstractC0817u, boolean z8) {
        byte byteValue = ((Byte) abstractC0817u.e(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        T t5 = T.f13352c;
        t5.getClass();
        boolean b2 = t5.a(abstractC0817u.getClass()).b(abstractC0817u);
        if (z8) {
            abstractC0817u.e(2);
        }
        return b2;
    }

    public static void l(Class cls, AbstractC0817u abstractC0817u) {
        abstractC0817u.j();
        defaultInstanceMap.put(cls, abstractC0817u);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0798a
    public final int a(W w10) {
        int i7;
        int i10;
        if (i()) {
            if (w10 == null) {
                T t5 = T.f13352c;
                t5.getClass();
                i10 = t5.a(getClass()).i(this);
            } else {
                i10 = w10.i(this);
            }
            if (i10 >= 0) {
                return i10;
            }
            throw new IllegalStateException(h3.o.l(i10, "serialized size must be non-negative, was "));
        }
        int i11 = this.memoizedSerializedSize;
        if ((i11 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i11 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (w10 == null) {
            T t10 = T.f13352c;
            t10.getClass();
            i7 = t10.a(getClass()).i(this);
        } else {
            i7 = w10.i(this);
        }
        m(i7);
        return i7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0798a
    public final void b(C0808k c0808k) {
        T t5 = T.f13352c;
        t5.getClass();
        W a9 = t5.a(getClass());
        E e2 = c0808k.f13426b;
        if (e2 == null) {
            e2 = new E(c0808k);
        }
        a9.e(this, e2);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public abstract Object e(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        T t5 = T.f13352c;
        t5.getClass();
        return t5.a(getClass()).g(this, (AbstractC0817u) obj);
    }

    public final int hashCode() {
        if (i()) {
            T t5 = T.f13352c;
            t5.getClass();
            return t5.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            T t10 = T.f13352c;
            t10.getClass();
            this.memoizedHashCode = t10.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final AbstractC0817u k() {
        return (AbstractC0817u) e(4);
    }

    public final void m(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException(h3.o.l(i7, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = L.f13334a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        L.c(this, sb2, 0);
        return sb2.toString();
    }
}
