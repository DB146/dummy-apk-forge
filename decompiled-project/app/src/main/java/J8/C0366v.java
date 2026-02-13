package J8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: J8.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366v extends AbstractC0363s {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f5728e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f5729b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5730c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5731d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f5728e = hashMap;
    }

    public C0366v(Class cls, C0365u c0365u) {
        super(c0365u);
        this.f5731d = new HashMap();
        com.bumptech.glide.d dVar = L8.c.f6421a;
        Constructor n6 = dVar.n(cls);
        this.f5729b = n6;
        L8.c.f(n6);
        String[] p10 = dVar.p(cls);
        for (int i7 = 0; i7 < p10.length; i7++) {
            this.f5731d.put(p10[i7], Integer.valueOf(i7));
        }
        Class<?>[] parameterTypes = this.f5729b.getParameterTypes();
        this.f5730c = new Object[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            this.f5730c[i10] = f5728e.get(parameterTypes[i10]);
        }
    }

    @Override // J8.AbstractC0363s
    public final Object d() {
        return (Object[]) this.f5730c.clone();
    }

    @Override // J8.AbstractC0363s
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f5729b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            com.bumptech.glide.d dVar = L8.c.f6421a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + L8.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + L8.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + L8.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override // J8.AbstractC0363s
    public final void f(Object obj, O8.a aVar, r rVar) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f5731d;
        String str = rVar.f5718c;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + L8.c.b(this.f5729b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int intValue = num.intValue();
        Object b2 = rVar.f5721f.b(aVar);
        if (b2 != null || !rVar.g) {
            objArr[intValue] = b2;
        } else {
            StringBuilder n6 = X.c.n("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            n6.append(aVar.V(false));
            throw new Db.d(n6.toString(), 4);
        }
    }
}
