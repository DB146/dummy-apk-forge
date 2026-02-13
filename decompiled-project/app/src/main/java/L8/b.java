package L8;

import com.bumptech.glide.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b extends d {
    public final Method g = Class.class.getMethod("isRecord", null);

    /* renamed from: h, reason: collision with root package name */
    public final Method f6419h = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: i, reason: collision with root package name */
    public final Method f6420i;
    public final Method j;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f6420i = cls.getMethod("getName", null);
        this.j = cls.getMethod("getType", null);
    }

    @Override // com.bumptech.glide.d
    public final Method m(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // com.bumptech.glide.d
    public final Constructor n(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f6419h.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                clsArr[i7] = (Class) this.j.invoke(objArr[i7], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // com.bumptech.glide.d
    public final String[] p(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f6419h.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i7 = 0; i7 < objArr.length; i7++) {
                strArr[i7] = (String) this.f6420i.invoke(objArr[i7], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // com.bumptech.glide.d
    public final boolean s(Class cls) {
        try {
            return ((Boolean) this.g.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }
}
