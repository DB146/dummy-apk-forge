package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f13416a;

    public i0(Unsafe unsafe) {
        this.f13416a = unsafe;
    }

    public final int a(Class cls) {
        return this.f13416a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f13416a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j);

    public abstract double d(Object obj, long j);

    public abstract float e(Object obj, long j);

    public final int f(Object obj, long j) {
        return this.f13416a.getInt(obj, j);
    }

    public final long g(Object obj, long j) {
        return this.f13416a.getLong(obj, j);
    }

    public final Object h(Object obj, long j) {
        return this.f13416a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f13416a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j, boolean z8);

    public abstract void k(Object obj, long j, byte b2);

    public abstract void l(Object obj, long j, double d10);

    public abstract void m(Object obj, long j, float f4);

    public final void n(Object obj, int i7, long j) {
        this.f13416a.putInt(obj, j, i7);
    }

    public final void o(Object obj, long j, long j10) {
        this.f13416a.putLong(obj, j, j10);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.f13416a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f13416a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            j0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
