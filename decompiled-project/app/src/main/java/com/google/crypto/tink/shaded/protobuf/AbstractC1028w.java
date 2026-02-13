package com.google.crypto.tink.shaded.protobuf;

import H2.C0305t;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1028w extends AbstractC1007a {
    private static Map<Object, AbstractC1028w> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected c0 unknownFields;

    public AbstractC1028w() {
        this.memoizedHashCode = 0;
        this.unknownFields = c0.f15762f;
        this.memoizedSerializedSize = -1;
    }

    public static AbstractC1028w g(Class cls) {
        AbstractC1028w abstractC1028w = defaultInstanceMap.get(cls);
        if (abstractC1028w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1028w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC1028w == null) {
            abstractC1028w = (AbstractC1028w) ((AbstractC1028w) l0.a(cls)).f(6);
            if (abstractC1028w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC1028w);
        }
        return abstractC1028w;
    }

    public static Object h(Method method, AbstractC1007a abstractC1007a, Object... objArr) {
        try {
            return method.invoke(abstractC1007a, objArr);
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

    public static AbstractC1028w j(AbstractC1028w abstractC1028w, AbstractC1014h abstractC1014h, C1021o c1021o) {
        C1013g c1013g = (C1013g) abstractC1014h;
        int z8 = c1013g.z();
        int size = c1013g.size();
        C1015i c1015i = new C1015i(c1013g.f15773d, z8, size, true);
        try {
            c1015i.e(size);
            AbstractC1028w abstractC1028w2 = (AbstractC1028w) abstractC1028w.f(4);
            try {
                X x2 = X.f15745c;
                x2.getClass();
                a0 a9 = x2.a(abstractC1028w2.getClass());
                C0305t c0305t = c1015i.f15779b;
                if (c0305t == null) {
                    c0305t = new C0305t(c1015i);
                }
                a9.g(abstractC1028w2, c0305t, c1021o);
                a9.a(abstractC1028w2);
                if (c1015i.f15784h != 0) {
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                if (abstractC1028w2.i()) {
                    return abstractC1028w2;
                }
                throw new IOException(new Db.d().getMessage());
            } catch (IOException e2) {
                if (e2.getCause() instanceof C) {
                    throw ((C) e2.getCause());
                }
                throw new IOException(e2.getMessage());
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof C) {
                    throw ((C) e10.getCause());
                }
                throw e10;
            }
        } catch (C e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [P4.Z, java.lang.Object] */
    public static AbstractC1028w k(AbstractC1028w abstractC1028w, byte[] bArr, C1021o c1021o) {
        int length = bArr.length;
        AbstractC1028w abstractC1028w2 = (AbstractC1028w) abstractC1028w.f(4);
        try {
            X x2 = X.f15745c;
            x2.getClass();
            a0 a9 = x2.a(abstractC1028w2.getClass());
            ?? obj = new Object();
            c1021o.getClass();
            a9.j(abstractC1028w2, bArr, 0, length, obj);
            a9.a(abstractC1028w2);
            if (abstractC1028w2.memoizedHashCode != 0) {
                throw new RuntimeException();
            }
            if (abstractC1028w2.i()) {
                return abstractC1028w2;
            }
            throw new IOException(new Db.d().getMessage());
        } catch (IOException e2) {
            if (e2.getCause() instanceof C) {
                throw ((C) e2.getCause());
            }
            throw new IOException(e2.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw C.f();
        }
    }

    public static void l(Class cls, AbstractC1028w abstractC1028w) {
        defaultInstanceMap.put(cls, abstractC1028w);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1007a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            X x2 = X.f15745c;
            x2.getClass();
            this.memoizedSerializedSize = x2.a(getClass()).d(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1007a
    public final void d(C1016j c1016j) {
        X x2 = X.f15745c;
        x2.getClass();
        a0 a9 = x2.a(getClass());
        C1018l c1018l = c1016j.f15789a;
        if (c1018l == null) {
            c1018l = new C1018l(c1016j);
        }
        a9.h(this, c1018l);
    }

    public final AbstractC1026u e() {
        return (AbstractC1026u) f(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC1028w) f(6)).getClass().isInstance(obj)) {
            return false;
        }
        X x2 = X.f15745c;
        x2.getClass();
        return x2.a(getClass()).f(this, (AbstractC1028w) obj);
    }

    public abstract Object f(int i7);

    public final int hashCode() {
        int i7 = this.memoizedHashCode;
        if (i7 != 0) {
            return i7;
        }
        X x2 = X.f15745c;
        x2.getClass();
        int i10 = x2.a(getClass()).i(this);
        this.memoizedHashCode = i10;
        return i10;
    }

    public final boolean i() {
        byte byteValue = ((Byte) f(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        X x2 = X.f15745c;
        x2.getClass();
        boolean b2 = x2.a(getClass()).b(this);
        f(2);
        return b2;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        P.W(this, sb2, 0);
        return sb2.toString();
    }
}
