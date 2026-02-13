package J8;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: J8.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355j extends G8.z {

    /* renamed from: d, reason: collision with root package name */
    public static final C0354i f5697d = new C0354i();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5698a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5699b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5700c = new HashMap();

    public C0355j(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i7 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i7] = field;
                    i7++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i7);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String name = r42.name();
                String str = r42.toString();
                H8.b bVar = (H8.b) field2.getAnnotation(H8.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        this.f5698a.put(str2, r42);
                    }
                }
                this.f5698a.put(name, r42);
                this.f5699b.put(str, r42);
                this.f5700c.put(r42, name);
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        String h02 = aVar.h0();
        Enum r02 = (Enum) this.f5698a.get(h02);
        return r02 == null ? (Enum) this.f5699b.get(h02) : r02;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        Enum r32 = (Enum) obj;
        bVar.e0(r32 == null ? null : (String) this.f5700c.get(r32));
    }
}
