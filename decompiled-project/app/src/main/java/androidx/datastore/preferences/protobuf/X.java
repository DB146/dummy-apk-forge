package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f13362a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f13363b;

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f13364c;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.e0, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        T t5 = T.f13352c;
        e0 e0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f13362a = cls;
        try {
            T t10 = T.f13352c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e0Var = (e0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f13363b = e0Var;
        f13364c = new Object();
    }

    public static void A(e0 e0Var, Object obj, Object obj2) {
        e0Var.getClass();
        AbstractC0817u abstractC0817u = (AbstractC0817u) obj;
        d0 d0Var = abstractC0817u.unknownFields;
        d0 d0Var2 = ((AbstractC0817u) obj2).unknownFields;
        d0 d0Var3 = d0.f13387f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i7 = d0Var.f13388a + d0Var2.f13388a;
                int[] copyOf = Arrays.copyOf(d0Var.f13389b, i7);
                System.arraycopy(d0Var2.f13389b, 0, copyOf, d0Var.f13388a, d0Var2.f13388a);
                Object[] copyOf2 = Arrays.copyOf(d0Var.f13390c, i7);
                System.arraycopy(d0Var2.f13390c, 0, copyOf2, d0Var.f13388a, d0Var2.f13388a);
                d0Var = new d0(i7, copyOf, copyOf2, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f13392e) {
                        throw new UnsupportedOperationException();
                    }
                    int i10 = d0Var.f13388a + d0Var2.f13388a;
                    d0Var.a(i10);
                    System.arraycopy(d0Var2.f13389b, 0, d0Var.f13389b, d0Var.f13388a, d0Var2.f13388a);
                    System.arraycopy(d0Var2.f13390c, 0, d0Var.f13390c, d0Var.f13388a, d0Var2.f13388a);
                    d0Var.f13388a = i10;
                }
            }
        }
        abstractC0817u.unknownFields = d0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.q0(i7, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = C0808k.g;
            i11++;
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.o0(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static void D(int i7, List list, E e2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e2.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((C0808k) e2.f13325a).r0(i7, (C0804g) list.get(i10));
        }
    }

    public static void E(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                c0808k.getClass();
                c0808k.v0(i7, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = C0808k.g;
            i11 += 8;
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.w0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void F(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.x0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0808k.l0(((Integer) list.get(i12)).intValue());
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.y0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void G(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.t0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = C0808k.g;
            i11 += 4;
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.u0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void H(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.v0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = C0808k.g;
            i11 += 8;
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.w0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void I(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                c0808k.getClass();
                c0808k.t0(i7, Float.floatToRawIntBits(floatValue));
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = C0808k.g;
            i11 += 4;
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.u0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void J(int i7, List list, E e2, W w10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e2.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e2.h(i7, list.get(i10), w10);
        }
    }

    public static void K(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.x0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0808k.l0(((Integer) list.get(i12)).intValue());
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.y0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void L(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.E0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0808k.l0(((Long) list.get(i12)).longValue());
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.F0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void M(int i7, List list, E e2, W w10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e2.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            e2.k(i7, list.get(i10), w10);
        }
    }

    public static void N(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.t0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = C0808k.g;
            i11 += 4;
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.u0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void O(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.v0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = C0808k.g;
            i11 += 8;
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.w0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void P(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                int intValue = ((Integer) list.get(i10)).intValue();
                c0808k.C0(i7, (intValue >> 31) ^ (intValue << 1));
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += C0808k.j0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            int intValue3 = ((Integer) list.get(i10)).intValue();
            c0808k.D0((intValue3 >> 31) ^ (intValue3 << 1));
            i10++;
        }
    }

    public static void Q(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                c0808k.E0(i7, (longValue >> 63) ^ (longValue << 1));
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += C0808k.l0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            c0808k.F0((longValue3 >> 63) ^ (longValue3 << 1));
            i10++;
        }
    }

    public static void R(int i7, List list, E e2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e2.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((C0808k) e2.f13325a).z0(i7, (String) list.get(i10));
        }
    }

    public static void S(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.C0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0808k.j0(((Integer) list.get(i12)).intValue());
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.D0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void T(int i7, List list, E e2, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C0808k c0808k = (C0808k) e2.f13325a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c0808k.E0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c0808k.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C0808k.l0(((Long) list.get(i12)).longValue());
        }
        c0808k.D0(i11);
        while (i10 < list.size()) {
            c0808k.F0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0808k.R(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h02 = C0808k.h0(i7) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int size2 = ((C0804g) list.get(i10)).size();
            h02 += C0808k.j0(size2) + size2;
        }
        return h02;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0808k.h0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C0808k.l0(((Integer) list.get(i10)).intValue());
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0808k.V(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0808k.W(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, W w10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C0808k.Y(i7, (AbstractC0798a) list.get(i11), w10);
        }
        return i10;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0808k.h0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C0808k.l0(((Integer) list.get(i10)).intValue());
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0808k.h0(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C0808k.l0(((Long) list.get(i10)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, W w10) {
        int h02 = C0808k.h0(i7);
        int a9 = ((AbstractC0798a) obj).a(w10);
        return C0808k.j0(a9) + a9 + h02;
    }

    public static int p(int i7, List list, W w10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h02 = C0808k.h0(i7) * size;
        for (int i10 = 0; i10 < size; i10++) {
            int a9 = ((AbstractC0798a) list.get(i10)).a(w10);
            h02 += C0808k.j0(a9) + a9;
        }
        return h02;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0808k.h0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = ((Integer) list.get(i10)).intValue();
            i7 += C0808k.j0((intValue >> 31) ^ (intValue << 1));
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0808k.h0(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i7 += C0808k.l0((longValue >> 63) ^ (longValue << 1));
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h02 = C0808k.h0(i7) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof C0804g) {
                int size2 = ((C0804g) obj).size();
                h02 = C0808k.j0(size2) + size2 + h02;
            } else {
                h02 = C0808k.g0((String) obj) + h02;
            }
        }
        return h02;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0808k.h0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C0808k.j0(((Integer) list.get(i10)).intValue());
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0808k.h0(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C0808k.l0(((Long) list.get(i10)).longValue());
        }
        return i7;
    }

    public static Object z(Object obj, int i7, InterfaceC0818v interfaceC0818v, Object obj2, e0 e0Var) {
        return obj2;
    }
}
