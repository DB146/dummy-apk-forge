package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f13419a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f13420b;

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f13421c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f13422d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f13423e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f13424f;
    public static final boolean g;

    static {
        Unsafe i7 = i();
        f13419a = i7;
        f13420b = AbstractC0800c.f13381a;
        boolean h10 = h(Long.TYPE);
        boolean h11 = h(Integer.TYPE);
        i0 i0Var = null;
        if (i7 != null) {
            if (!AbstractC0800c.a()) {
                i0Var = new i0(i7);
            } else if (h10) {
                i0Var = new g0(i7, 1);
            } else if (h11) {
                i0Var = new g0(i7, 0);
            }
        }
        f13421c = i0Var;
        f13422d = i0Var == null ? false : i0Var.r();
        f13423e = i0Var == null ? false : i0Var.q();
        f13424f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g2 = g();
        if (g2 != null && i0Var != null) {
            i0Var.i(g2);
        }
        g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(j0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(Object obj, long j) {
        return ((byte) ((f13421c.f(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(Object obj, long j) {
        return ((byte) ((f13421c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f13419a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(Class cls) {
        if (f13423e) {
            return f13421c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f13423e) {
            f13421c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0800c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        if (!AbstractC0800c.a()) {
            return false;
        }
        try {
            Class cls2 = f13420b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new f0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b2) {
        f13421c.k(bArr, f13424f + j, b2);
    }

    public static void k(Object obj, long j, byte b2) {
        long j10 = (-4) & j;
        int f4 = f13421c.f(obj, j10);
        int i7 = ((~((int) j)) & 3) << 3;
        m(obj, ((255 & b2) << i7) | (f4 & (~(255 << i7))), j10);
    }

    public static void l(Object obj, long j, byte b2) {
        long j10 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        m(obj, ((255 & b2) << i7) | (f13421c.f(obj, j10) & (~(255 << i7))), j10);
    }

    public static void m(Object obj, int i7, long j) {
        f13421c.n(obj, i7, j);
    }

    public static void n(Object obj, long j, long j10) {
        f13421c.o(obj, j, j10);
    }

    public static void o(Object obj, long j, Object obj2) {
        f13421c.p(obj, j, obj2);
    }
}
