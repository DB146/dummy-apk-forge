package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f15796a = Logger.getLogger(l0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f15797b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f15798c;

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f15799d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f15800e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f15801f;
    public static final long g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f15802h;

    /* JADX WARN: Removed duplicated region for block: B:18:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        boolean z8;
        Unsafe unsafe;
        boolean z10;
        Field d10;
        k0 k0Var;
        Unsafe l10 = l();
        f15797b = l10;
        f15798c = AbstractC1009c.f15760a;
        Class cls2 = Long.TYPE;
        boolean e2 = e(cls2);
        Class cls3 = Integer.TYPE;
        boolean e10 = e(cls3);
        k0 k0Var2 = null;
        if (l10 != null) {
            if (!AbstractC1009c.a()) {
                k0Var2 = new k0(l10);
            } else if (e2) {
                k0Var2 = new i0(l10, 1);
            } else if (e10) {
                k0Var2 = new i0(l10, 0);
            }
        }
        f15799d = k0Var2;
        if (l10 != null) {
            try {
                cls = l10.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, cls2);
            } catch (Throwable th) {
                f15796a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
            if (d() != null) {
                if (!AbstractC1009c.a()) {
                    cls.getMethod("getByte", cls2);
                    cls.getMethod("putByte", cls2, Byte.TYPE);
                    cls.getMethod("getInt", cls2);
                    cls.getMethod("putInt", cls2, cls3);
                    cls.getMethod("getLong", cls2);
                    cls.getMethod("putLong", cls2, cls2);
                    cls.getMethod("copyMemory", cls2, cls2, cls2);
                    cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                }
                z8 = true;
                f15800e = z8;
                unsafe = f15797b;
                if (unsafe != null) {
                    try {
                        Class<?> cls4 = unsafe.getClass();
                        cls4.getMethod("objectFieldOffset", Field.class);
                        cls4.getMethod("arrayBaseOffset", Class.class);
                        cls4.getMethod("arrayIndexScale", Class.class);
                        Class cls5 = Long.TYPE;
                        cls4.getMethod("getInt", Object.class, cls5);
                        cls4.getMethod("putInt", Object.class, cls5, Integer.TYPE);
                        cls4.getMethod("getLong", Object.class, cls5);
                        cls4.getMethod("putLong", Object.class, cls5, cls5);
                        cls4.getMethod("getObject", Object.class, cls5);
                        cls4.getMethod("putObject", Object.class, cls5, Object.class);
                        if (!AbstractC1009c.a()) {
                            cls4.getMethod("getByte", Object.class, cls5);
                            cls4.getMethod("putByte", Object.class, cls5, Byte.TYPE);
                            cls4.getMethod("getBoolean", Object.class, cls5);
                            cls4.getMethod("putBoolean", Object.class, cls5, Boolean.TYPE);
                            cls4.getMethod("getFloat", Object.class, cls5);
                            cls4.getMethod("putFloat", Object.class, cls5, Float.TYPE);
                            cls4.getMethod("getDouble", Object.class, cls5);
                            cls4.getMethod("putDouble", Object.class, cls5, Double.TYPE);
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        f15796a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                    }
                    f15801f = z10;
                    g = b(byte[].class);
                    b(boolean[].class);
                    c(boolean[].class);
                    b(int[].class);
                    c(int[].class);
                    b(long[].class);
                    c(long[].class);
                    b(float[].class);
                    c(float[].class);
                    b(double[].class);
                    c(double[].class);
                    b(Object[].class);
                    c(Object[].class);
                    d10 = d();
                    if (d10 != null && (k0Var = f15799d) != null) {
                        k0Var.j(d10);
                    }
                    f15802h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }
                z10 = false;
                f15801f = z10;
                g = b(byte[].class);
                b(boolean[].class);
                c(boolean[].class);
                b(int[].class);
                c(int[].class);
                b(long[].class);
                c(long[].class);
                b(float[].class);
                c(float[].class);
                b(double[].class);
                c(double[].class);
                b(Object[].class);
                c(Object[].class);
                d10 = d();
                if (d10 != null) {
                    k0Var.j(d10);
                }
                f15802h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
            }
        }
        z8 = false;
        f15800e = z8;
        unsafe = f15797b;
        if (unsafe != null) {
        }
        z10 = false;
        f15801f = z10;
        g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        d10 = d();
        if (d10 != null) {
        }
        f15802h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return f15797b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int b(Class cls) {
        if (f15801f) {
            return f15799d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f15801f) {
            f15799d.b(cls);
        }
    }

    public static Field d() {
        Field field;
        Field field2;
        if (AbstractC1009c.a()) {
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

    public static boolean e(Class cls) {
        if (!AbstractC1009c.a()) {
            return false;
        }
        try {
            Class cls2 = f15798c;
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

    public static byte f(byte[] bArr, long j) {
        return f15799d.d(bArr, g + j);
    }

    public static byte g(Object obj, long j) {
        return (byte) ((f15799d.g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte h(Object obj, long j) {
        return (byte) ((f15799d.g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int i(AbstractC1007a abstractC1007a, long j) {
        return f15799d.g(abstractC1007a, j);
    }

    public static long j(AbstractC1007a abstractC1007a, long j) {
        return f15799d.h(abstractC1007a, j);
    }

    public static Object k(Object obj, long j) {
        return f15799d.i(obj, j);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new h0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(Object obj, long j, boolean z8) {
        f15799d.k(obj, j, z8);
    }

    public static void n(byte[] bArr, long j, byte b2) {
        f15799d.l(bArr, g + j, b2);
    }

    public static void o(Object obj, long j, byte b2) {
        long j10 = (-4) & j;
        int g2 = f15799d.g(obj, j10);
        int i7 = ((~((int) j)) & 3) << 3;
        s(obj, ((255 & b2) << i7) | (g2 & (~(255 << i7))), j10);
    }

    public static void p(Object obj, long j, byte b2) {
        long j10 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        s(obj, ((255 & b2) << i7) | (f15799d.g(obj, j10) & (~(255 << i7))), j10);
    }

    public static void q(Object obj, long j, double d10) {
        f15799d.m(obj, j, d10);
    }

    public static void r(Object obj, long j, float f4) {
        f15799d.n(obj, j, f4);
    }

    public static void s(Object obj, int i7, long j) {
        f15799d.o(obj, i7, j);
    }

    public static void t(Object obj, long j, long j10) {
        f15799d.p(obj, j, j10);
    }

    public static void u(Object obj, long j, Object obj2) {
        f15799d.q(obj, j, obj2);
    }
}
