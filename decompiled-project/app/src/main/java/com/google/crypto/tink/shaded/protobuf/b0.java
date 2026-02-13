package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f15756a;

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f15757b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f15758c;

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f15759d;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.d0] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f15756a = cls;
        f15757b = A(false);
        f15758c = A(true);
        f15759d = new Object();
    }

    public static d0 A(boolean z8) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (d0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z8));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(d0 d0Var, AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2) {
        d0Var.getClass();
        c0 c0Var = abstractC1028w.unknownFields;
        c0 c0Var2 = abstractC1028w2.unknownFields;
        if (!c0Var2.equals(c0.f15762f)) {
            int i7 = c0Var.f15763a + c0Var2.f15763a;
            int[] copyOf = Arrays.copyOf(c0Var.f15764b, i7);
            System.arraycopy(c0Var2.f15764b, 0, copyOf, c0Var.f15763a, c0Var2.f15763a);
            Object[] copyOf2 = Arrays.copyOf(c0Var.f15765c, i7);
            System.arraycopy(c0Var2.f15765c, 0, copyOf2, c0Var.f15763a, c0Var2.f15763a);
            c0Var = new c0(i7, copyOf, copyOf2, true);
        }
        abstractC1028w.unknownFields = c0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        if (!z8) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                boolean booleanValue = ((Boolean) list.get(i10)).booleanValue();
                c1016j.B0(i7, 0);
                c1016j.u0(booleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = C1016j.f15787e;
            i11++;
        }
        c1016j.C0(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            c1016j.u0(((Boolean) list.get(i13)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void E(int i7, List list, C1018l c1018l) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1018l.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            AbstractC1014h abstractC1014h = (AbstractC1014h) list.get(i10);
            C1016j c1016j = (C1016j) c1018l.f15795a;
            c1016j.B0(i7, 2);
            c1016j.C0(abstractC1014h.size());
            C1013g c1013g = (C1013g) abstractC1014h;
            c1016j.v0(c1013g.f15773d, c1013g.z(), c1013g.size());
        }
    }

    public static void F(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                double doubleValue = ((Double) list.get(i10)).doubleValue();
                c1016j.getClass();
                c1016j.y0(i7, Double.doubleToRawLongBits(doubleValue));
                i10++;
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = C1016j.f15787e;
            i11 += 8;
        }
        c1016j.C0(i11);
        while (i10 < list.size()) {
            c1016j.z0(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void G(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        if (!z8) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue = ((Integer) list.get(i10)).intValue();
                c1016j.B0(i7, 0);
                c1016j.A0(intValue);
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C1016j.h0(((Integer) list.get(i12)).intValue());
        }
        c1016j.C0(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            c1016j.A0(((Integer) list.get(i13)).intValue());
        }
    }

    public static void H(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c1016j.w0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = C1016j.f15787e;
            i11 += 4;
        }
        c1016j.C0(i11);
        while (i10 < list.size()) {
            c1016j.x0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void I(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c1016j.y0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = C1016j.f15787e;
            i11 += 8;
        }
        c1016j.C0(i11);
        while (i10 < list.size()) {
            c1016j.z0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void J(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                float floatValue = ((Float) list.get(i10)).floatValue();
                c1016j.getClass();
                c1016j.w0(i7, Float.floatToRawIntBits(floatValue));
                i10++;
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = C1016j.f15787e;
            i11 += 4;
        }
        c1016j.C0(i11);
        while (i10 < list.size()) {
            c1016j.x0(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void K(int i7, List list, C1018l c1018l, a0 a0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1018l.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1018l.h(i7, list.get(i10), a0Var);
        }
    }

    public static void L(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        if (!z8) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue = ((Integer) list.get(i10)).intValue();
                c1016j.B0(i7, 0);
                c1016j.A0(intValue);
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C1016j.h0(((Integer) list.get(i12)).intValue());
        }
        c1016j.C0(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            c1016j.A0(((Integer) list.get(i13)).intValue());
        }
    }

    public static void M(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c1016j.D0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C1016j.t0(((Long) list.get(i12)).longValue());
        }
        c1016j.C0(i11);
        while (i10 < list.size()) {
            c1016j.E0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void N(int i7, List list, C1018l c1018l, a0 a0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1018l.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            c1018l.k(i7, list.get(i10), a0Var);
        }
    }

    public static void O(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c1016j.w0(i7, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = C1016j.f15787e;
            i11 += 4;
        }
        c1016j.C0(i11);
        while (i10 < list.size()) {
            c1016j.x0(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void P(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c1016j.y0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = C1016j.f15787e;
            i11 += 8;
        }
        c1016j.C0(i11);
        while (i10 < list.size()) {
            c1016j.z0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void Q(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        if (!z8) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue = ((Integer) list.get(i10)).intValue();
                c1016j.B0(i7, 0);
                c1016j.C0((intValue >> 31) ^ (intValue << 1));
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue2 = ((Integer) list.get(i12)).intValue();
            i11 += C1016j.r0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c1016j.C0(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            int intValue3 = ((Integer) list.get(i13)).intValue();
            c1016j.C0((intValue3 >> 31) ^ (intValue3 << 1));
        }
    }

    public static void R(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                long longValue = ((Long) list.get(i10)).longValue();
                c1016j.D0(i7, (longValue >> 63) ^ (longValue << 1));
                i10++;
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long longValue2 = ((Long) list.get(i12)).longValue();
            i11 += C1016j.t0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c1016j.C0(i11);
        while (i10 < list.size()) {
            long longValue3 = ((Long) list.get(i10)).longValue();
            c1016j.E0((longValue3 >> 63) ^ (longValue3 << 1));
            i10++;
        }
    }

    public static void S(int i7, List list, C1018l c1018l) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1018l.getClass();
        boolean z8 = list instanceof F;
        C1016j c1016j = (C1016j) c1018l.f15795a;
        if (!z8) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String str = (String) list.get(i10);
                c1016j.B0(i7, 2);
                int i11 = c1016j.f15792d;
                try {
                    int r02 = C1016j.r0(str.length() * 3);
                    int r03 = C1016j.r0(str.length());
                    byte[] bArr = c1016j.f15790b;
                    int i12 = c1016j.f15791c;
                    if (r03 == r02) {
                        int i13 = i11 + r03;
                        c1016j.f15792d = i13;
                        int Q3 = o0.f15808a.Q(str, bArr, i13, i12 - i13);
                        c1016j.f15792d = i11;
                        c1016j.C0((Q3 - i11) - r03);
                        c1016j.f15792d = Q3;
                    } else {
                        c1016j.C0(o0.b(str));
                        int i14 = c1016j.f15792d;
                        c1016j.f15792d = o0.f15808a.Q(str, bArr, i14, i12 - i14);
                    }
                } catch (n0 e2) {
                    c1016j.f15792d = i11;
                    C1016j.f15787e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                    byte[] bytes = str.getBytes(A.f15705a);
                    try {
                        c1016j.C0(bytes.length);
                        c1016j.v0(bytes, 0, bytes.length);
                    } catch (C1017k e10) {
                        throw e10;
                    } catch (IndexOutOfBoundsException e11) {
                        throw new C1017k(e11);
                    }
                } catch (IndexOutOfBoundsException e12) {
                    throw new C1017k(e12);
                }
            }
            return;
        }
        F f4 = (F) list;
        for (int i15 = 0; i15 < list.size(); i15++) {
            Object v10 = f4.v(i15);
            if (v10 instanceof String) {
                String str2 = (String) v10;
                c1016j.B0(i7, 2);
                int i16 = c1016j.f15792d;
                try {
                    int r04 = C1016j.r0(str2.length() * 3);
                    int r05 = C1016j.r0(str2.length());
                    byte[] bArr2 = c1016j.f15790b;
                    int i17 = c1016j.f15791c;
                    if (r05 == r04) {
                        int i18 = i16 + r05;
                        c1016j.f15792d = i18;
                        int Q10 = o0.f15808a.Q(str2, bArr2, i18, i17 - i18);
                        c1016j.f15792d = i16;
                        c1016j.C0((Q10 - i16) - r05);
                        c1016j.f15792d = Q10;
                    } else {
                        c1016j.C0(o0.b(str2));
                        int i19 = c1016j.f15792d;
                        c1016j.f15792d = o0.f15808a.Q(str2, bArr2, i19, i17 - i19);
                    }
                } catch (n0 e13) {
                    c1016j.f15792d = i16;
                    C1016j.f15787e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e13);
                    byte[] bytes2 = str2.getBytes(A.f15705a);
                    try {
                        c1016j.C0(bytes2.length);
                        c1016j.v0(bytes2, 0, bytes2.length);
                    } catch (C1017k e14) {
                        throw e14;
                    } catch (IndexOutOfBoundsException e15) {
                        throw new C1017k(e15);
                    }
                } catch (IndexOutOfBoundsException e16) {
                    throw new C1017k(e16);
                }
            } else {
                AbstractC1014h abstractC1014h = (AbstractC1014h) v10;
                c1016j.B0(i7, 2);
                c1016j.C0(abstractC1014h.size());
                C1013g c1013g = (C1013g) abstractC1014h;
                c1016j.v0(c1013g.f15773d, c1013g.z(), c1013g.size());
            }
        }
    }

    public static void T(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        if (!z8) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue = ((Integer) list.get(i10)).intValue();
                c1016j.B0(i7, 0);
                c1016j.C0(intValue);
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C1016j.r0(((Integer) list.get(i12)).intValue());
        }
        c1016j.C0(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            c1016j.C0(((Integer) list.get(i13)).intValue());
        }
    }

    public static void U(int i7, List list, C1018l c1018l, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1016j c1016j = (C1016j) c1018l.f15795a;
        int i10 = 0;
        if (!z8) {
            while (i10 < list.size()) {
                c1016j.D0(i7, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c1016j.B0(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            i11 += C1016j.t0(((Long) list.get(i12)).longValue());
        }
        c1016j.C0(i11);
        while (i10 < list.size()) {
            c1016j.E0(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1016j.X(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p02 = C1016j.p0(i7) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            p02 += C1016j.Z((AbstractC1014h) list.get(i10));
        }
        return p02;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1016j.p0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1029x) {
            AbstractC1029x abstractC1029x = (AbstractC1029x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1029x.t(0);
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C1016j.h0(((Integer) list.get(i10)).intValue());
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1016j.c0(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1016j.d0(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, a0 a0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1016j.f0(i7, (AbstractC1007a) list.get(i11), a0Var);
        }
        return i10;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1016j.p0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1029x) {
            AbstractC1029x abstractC1029x = (AbstractC1029x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1029x.t(0);
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C1016j.h0(((Integer) list.get(i10)).intValue());
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C1016j.p0(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            J j = (J) list;
            if (size <= 0) {
                return 0;
            }
            j.t(0);
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C1016j.t0(((Long) list.get(i10)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, a0 a0Var) {
        AbstractC1007a abstractC1007a = (AbstractC1007a) obj;
        int p02 = C1016j.p0(i7);
        abstractC1007a.getClass();
        AbstractC1028w abstractC1028w = (AbstractC1028w) abstractC1007a;
        int i10 = abstractC1028w.memoizedSerializedSize;
        if (i10 == -1) {
            i10 = a0Var.d(abstractC1007a);
            abstractC1028w.memoizedSerializedSize = i10;
        }
        return C1016j.r0(i10) + i10 + p02;
    }

    public static int p(int i7, List list, a0 a0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p02 = C1016j.p0(i7) * size;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1007a abstractC1007a = (AbstractC1007a) list.get(i10);
            abstractC1007a.getClass();
            AbstractC1028w abstractC1028w = (AbstractC1028w) abstractC1007a;
            int i11 = abstractC1028w.memoizedSerializedSize;
            if (i11 == -1) {
                i11 = a0Var.d(abstractC1007a);
                abstractC1028w.memoizedSerializedSize = i11;
            }
            p02 += C1016j.r0(i11) + i11;
        }
        return p02;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1016j.p0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1029x) {
            AbstractC1029x abstractC1029x = (AbstractC1029x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1029x.t(0);
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = ((Integer) list.get(i10)).intValue();
            i7 += C1016j.r0((intValue >> 31) ^ (intValue << 1));
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1016j.p0(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            J j = (J) list;
            if (size <= 0) {
                return 0;
            }
            j.t(0);
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i7 += C1016j.t0((longValue >> 63) ^ (longValue << 1));
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int p02 = C1016j.p0(i7) * size;
        if (list instanceof F) {
            F f4 = (F) list;
            while (i10 < size) {
                Object v10 = f4.v(i10);
                p02 = (v10 instanceof AbstractC1014h ? C1016j.Z((AbstractC1014h) v10) : C1016j.o0((String) v10)) + p02;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                p02 = (obj instanceof AbstractC1014h ? C1016j.Z((AbstractC1014h) obj) : C1016j.o0((String) obj)) + p02;
                i10++;
            }
        }
        return p02;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1016j.p0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1029x) {
            AbstractC1029x abstractC1029x = (AbstractC1029x) list;
            if (size <= 0) {
                return 0;
            }
            abstractC1029x.t(0);
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C1016j.r0(((Integer) list.get(i10)).intValue());
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1016j.p0(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            J j = (J) list;
            if (size <= 0) {
                return 0;
            }
            j.t(0);
            throw null;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i7 += C1016j.t0(((Long) list.get(i10)).longValue());
        }
        return i7;
    }

    public static Object z(int i7, List list, Object obj, d0 d0Var) {
        return obj;
    }
}
