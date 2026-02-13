package kotlin.jvm.internal;

import Eb.B;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import y7.u0;

/* loaded from: classes2.dex */
public final class e implements Yb.c, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f19125b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f19126a;

    static {
        List y10 = u0.y(Rb.a.class, Rb.c.class, Rb.e.class, Rb.f.class, Rb.g.class, Rb.h.class, Rb.i.class, Y.b.class, Y.b.class, Y.b.class, Y.b.class, Y.b.class, Rb.b.class, Y.b.class, Y.b.class, Y.b.class, Y.b.class, Y.b.class, Y.b.class, Y.b.class, Y.b.class, Y.b.class, Rb.d.class);
        ArrayList arrayList = new ArrayList(Eb.p.S(y10, 10));
        int i7 = 0;
        for (Object obj : y10) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                u0.M();
                throw null;
            }
            arrayList.add(new Db.j((Class) obj, Integer.valueOf(i7)));
            i7 = i10;
        }
        f19125b = B.K(arrayList);
    }

    public e(Class jClass) {
        l.e(jClass, "jClass");
        this.f19126a = jClass;
    }

    @Override // kotlin.jvm.internal.d
    public final Class a() {
        return this.f19126a;
    }

    public final String b() {
        String c10;
        Class jClass = this.f19126a;
        l.e(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String c11 = y.c(jClass.getName());
            return c11 == null ? jClass.getCanonicalName() : c11;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (c10 = y.c(componentType.getName())) != null) {
            str = c10.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String c() {
        String e2;
        Class jClass = this.f19126a;
        l.e(jClass, "jClass");
        String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String e10 = y.e(jClass.getName());
                return e10 == null ? jClass.getSimpleName() : e10;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (e2 = y.e(componentType.getName())) != null) {
                str = e2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ac.g.t0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return ac.g.t0(simpleName, enclosingConstructor.getName() + '$', simpleName);
        }
        int e02 = ac.g.e0(simpleName, '$', 0, 6);
        if (e02 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(e02 + 1, simpleName.length());
        l.d(substring, "substring(...)");
        return substring;
    }

    public final boolean d(Object obj) {
        Class jClass = this.f19126a;
        l.e(jClass, "jClass");
        Map map = f19125b;
        l.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return y.d(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = c2.i.r(w.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && c2.i.r(this).equals(c2.i.r((Yb.c) obj));
    }

    public final int hashCode() {
        return c2.i.r(this).hashCode();
    }

    public final String toString() {
        return this.f19126a + " (Kotlin reflection is not available)";
    }
}
