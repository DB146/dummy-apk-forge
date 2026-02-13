package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
public abstract class P {
    public static int A(byte[] bArr, int i7, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        J j = (J) interfaceC1031z;
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a + M3;
        while (M3 < i10) {
            M3 = O(bArr, M3, z8);
            j.o(C1015i.b(z8.f7976b));
        }
        if (M3 == i10) {
            return M3;
        }
        throw C.f();
    }

    public static int B(byte[] bArr, int i7, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1029x abstractC1029x = (AbstractC1029x) interfaceC1031z;
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a + M3;
        while (M3 < i10) {
            M3 = M(bArr, M3, z8);
            abstractC1029x.o(z8.f7975a);
        }
        if (M3 == i10) {
            return M3;
        }
        throw C.f();
    }

    public static int C(byte[] bArr, int i7, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        J j = (J) interfaceC1031z;
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a + M3;
        while (M3 < i10) {
            M3 = O(bArr, M3, z8);
            j.o(z8.f7976b);
        }
        if (M3 == i10) {
            return M3;
        }
        throw C.f();
    }

    public static int D(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1029x abstractC1029x = (AbstractC1029x) interfaceC1031z;
        int M3 = M(bArr, i10, z8);
        abstractC1029x.o(C1015i.a(z8.f7975a));
        while (M3 < i11) {
            int M10 = M(bArr, M3, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            M3 = M(bArr, M10, z8);
            abstractC1029x.o(C1015i.a(z8.f7975a));
        }
        return M3;
    }

    public static int E(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        J j = (J) interfaceC1031z;
        int O10 = O(bArr, i10, z8);
        j.o(C1015i.b(z8.f7976b));
        while (O10 < i11) {
            int M3 = M(bArr, O10, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            O10 = O(bArr, M3, z8);
            j.o(C1015i.b(z8.f7976b));
        }
        return O10;
    }

    public static int F(byte[] bArr, int i7, P4.Z z8) {
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a;
        if (i10 < 0) {
            throw C.d();
        }
        if (i10 == 0) {
            z8.f7977c = "";
            return M3;
        }
        z8.f7977c = new String(bArr, M3, i10, A.f15705a);
        return M3 + i10;
    }

    public static int G(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        int M3 = M(bArr, i10, z8);
        int i12 = z8.f7975a;
        if (i12 < 0) {
            throw C.d();
        }
        if (i12 == 0) {
            interfaceC1031z.add("");
        } else {
            interfaceC1031z.add(new String(bArr, M3, i12, A.f15705a));
            M3 += i12;
        }
        while (M3 < i11) {
            int M10 = M(bArr, M3, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            M3 = M(bArr, M10, z8);
            int i13 = z8.f7975a;
            if (i13 < 0) {
                throw C.d();
            }
            if (i13 == 0) {
                interfaceC1031z.add("");
            } else {
                interfaceC1031z.add(new String(bArr, M3, i13, A.f15705a));
                M3 += i13;
            }
        }
        return M3;
    }

    public static int H(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        int M3 = M(bArr, i10, z8);
        int i12 = z8.f7975a;
        if (i12 < 0) {
            throw C.d();
        }
        if (i12 == 0) {
            interfaceC1031z.add("");
        } else {
            int i13 = M3 + i12;
            if (!o0.f15808a.T(M3, bArr, i13)) {
                throw C.a();
            }
            interfaceC1031z.add(new String(bArr, M3, i12, A.f15705a));
            M3 = i13;
        }
        while (M3 < i11) {
            int M10 = M(bArr, M3, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            M3 = M(bArr, M10, z8);
            int i14 = z8.f7975a;
            if (i14 < 0) {
                throw C.d();
            }
            if (i14 == 0) {
                interfaceC1031z.add("");
            } else {
                int i15 = M3 + i14;
                if (!o0.f15808a.T(M3, bArr, i15)) {
                    throw C.a();
                }
                interfaceC1031z.add(new String(bArr, M3, i14, A.f15705a));
                M3 = i15;
            }
        }
        return M3;
    }

    public static int I(byte[] bArr, int i7, P4.Z z8) {
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a;
        if (i10 < 0) {
            throw C.d();
        }
        if (i10 == 0) {
            z8.f7977c = "";
            return M3;
        }
        z8.f7977c = o0.f15808a.K(M3, bArr, i10);
        return M3 + i10;
    }

    public static int J(int i7, byte[] bArr, int i10, int i11, c0 c0Var, P4.Z z8) {
        if ((i7 >>> 3) == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int O10 = O(bArr, i10, z8);
            c0Var.c(i7, Long.valueOf(z8.f7976b));
            return O10;
        }
        if (i12 == 1) {
            c0Var.c(i7, Long.valueOf(m(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int M3 = M(bArr, i10, z8);
            int i13 = z8.f7975a;
            if (i13 < 0) {
                throw C.d();
            }
            if (i13 > bArr.length - M3) {
                throw C.f();
            }
            if (i13 == 0) {
                c0Var.c(i7, AbstractC1014h.f15775b);
            } else {
                c0Var.c(i7, AbstractC1014h.o(M3, bArr, i13));
            }
            return M3 + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new IOException("Protocol message contained an invalid tag (zero).");
            }
            c0Var.c(i7, Integer.valueOf(k(i10, bArr)));
            return i10 + 4;
        }
        c0 b2 = c0.b();
        int i14 = (i7 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int M10 = M(bArr, i10, z8);
            int i16 = z8.f7975a;
            if (i16 == i14) {
                i15 = i16;
                i10 = M10;
                break;
            }
            i15 = i16;
            i10 = J(i16, bArr, M10, i11, b2, z8);
        }
        if (i10 > i11 || i15 != i14) {
            throw C.e();
        }
        c0Var.c(i7, b2);
        return i10;
    }

    public static int L(int i7, byte[] bArr, int i10, P4.Z z8) {
        int i11 = i7 & 127;
        int i12 = i10 + 1;
        byte b2 = bArr[i10];
        if (b2 >= 0) {
            z8.f7975a = i11 | (b2 << 7);
            return i12;
        }
        int i13 = i11 | ((b2 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            z8.f7975a = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            z8.f7975a = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            z8.f7975a = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                z8.f7975a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int M(byte[] bArr, int i7, P4.Z z8) {
        int i10 = i7 + 1;
        byte b2 = bArr[i7];
        if (b2 < 0) {
            return L(b2, bArr, i10, z8);
        }
        z8.f7975a = b2;
        return i10;
    }

    public static int N(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1029x abstractC1029x = (AbstractC1029x) interfaceC1031z;
        int M3 = M(bArr, i10, z8);
        abstractC1029x.o(z8.f7975a);
        while (M3 < i11) {
            int M10 = M(bArr, M3, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            M3 = M(bArr, M10, z8);
            abstractC1029x.o(z8.f7975a);
        }
        return M3;
    }

    public static int O(byte[] bArr, int i7, P4.Z z8) {
        int i10 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            z8.f7976b = j;
            return i10;
        }
        int i11 = i7 + 2;
        byte b2 = bArr[i10];
        long j10 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b2 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j10 |= (r10 & Byte.MAX_VALUE) << i12;
            b2 = bArr[i11];
            i11 = i13;
        }
        z8.f7976b = j10;
        return i11;
    }

    public static int P(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        J j = (J) interfaceC1031z;
        int O10 = O(bArr, i10, z8);
        j.o(z8.f7976b);
        while (O10 < i11) {
            int M3 = M(bArr, O10, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            O10 = O(bArr, M3, z8);
            j.o(z8.f7976b);
        }
        return O10;
    }

    public static String R(AbstractC1014h abstractC1014h) {
        StringBuilder sb2 = new StringBuilder(abstractC1014h.size());
        for (int i7 = 0; i7 < abstractC1014h.size(); i7++) {
            byte b2 = abstractC1014h.b(i7);
            if (b2 == 34) {
                sb2.append("\\\"");
            } else if (b2 == 39) {
                sb2.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b2 >>> 6) & 3) + 48));
                            sb2.append((char) (((b2 >>> 3) & 7) + 48));
                            sb2.append((char) ((b2 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b2);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean S(byte b2) {
        return b2 > -65;
    }

    public static final void V(StringBuilder sb2, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                V(sb2, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                V(sb2, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            C1013g c1013g = AbstractC1014h.f15775b;
            sb2.append(R(new C1013g(((String) obj).getBytes(A.f15705a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1014h) {
            sb2.append(": \"");
            sb2.append(R((AbstractC1014h) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1028w) {
            sb2.append(" {");
            W((AbstractC1028w) obj, sb2, i7 + 2);
            sb2.append("\n");
            while (i10 < i7) {
                sb2.append(' ');
                i10++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i7 + 2;
        V(sb2, i12, "key", entry.getKey());
        V(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        while (i10 < i7) {
            sb2.append(' ');
            i10++;
        }
        sb2.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ad, code lost:
    
        if (((java.lang.Integer) r4).intValue() == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01af, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bf, code lost:
    
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d1, code lost:
    
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(AbstractC1028w abstractC1028w, StringBuilder sb2, int i7) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : abstractC1028w.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z8 = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    V(sb2, i7, e(str2), AbstractC1028w.h(method2, abstractC1028w, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    V(sb2, i7, e(str3), AbstractC1028w.h(method3, abstractC1028w, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object h10 = AbstractC1028w.h(method4, abstractC1028w, new Object[0]);
                    if (method5 == null) {
                        if (h10 instanceof Boolean) {
                            equals = !((Boolean) h10).booleanValue();
                        } else if (!(h10 instanceof Integer)) {
                            if (!(h10 instanceof Float)) {
                                if (!(h10 instanceof Double)) {
                                    equals = h10 instanceof String ? h10.equals("") : h10 instanceof AbstractC1014h ? h10.equals(AbstractC1014h.f15775b) : !(h10 instanceof AbstractC1007a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            z8 = false;
                        }
                    } else {
                        z8 = ((Boolean) AbstractC1028w.h(method5, abstractC1028w, new Object[0])).booleanValue();
                    }
                    if (z8) {
                        V(sb2, i7, e(str4), h10);
                    }
                }
            }
        }
        c0 c0Var = abstractC1028w.unknownFields;
        if (c0Var != null) {
            for (int i10 = 0; i10 < c0Var.f15763a; i10++) {
                V(sb2, i7, String.valueOf(c0Var.f15764b[i10] >>> 3), c0Var.f15765c[i10]);
            }
        }
    }

    public static void a(byte b2, byte b10, byte b11, byte b12, char[] cArr, int i7) {
        if (!S(b10)) {
            if ((((b10 + 112) + (b2 << 28)) >> 30) == 0 && !S(b11) && !S(b12)) {
                int i10 = ((b2 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i7] = (char) ((i10 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw C.a();
    }

    public static boolean b(byte b2) {
        return b2 >= 0;
    }

    public static void c(byte b2, byte b10, char[] cArr, int i7) {
        if (b2 < -62 || S(b10)) {
            throw C.a();
        }
        cArr[i7] = (char) (((b2 & 31) << 6) | (b10 & 63));
    }

    public static void d(byte b2, byte b10, byte b11, char[] cArr, int i7) {
        if (S(b10) || ((b2 == -32 && b10 < -96) || ((b2 == -19 && b10 >= -96) || S(b11)))) {
            throw C.a();
        }
        cArr[i7] = (char) (((b2 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
    }

    public static final String e(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static int f(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1010d abstractC1010d = (AbstractC1010d) interfaceC1031z;
        int O10 = O(bArr, i10, z8);
        abstractC1010d.o(z8.f7976b != 0);
        while (O10 < i11) {
            int M3 = M(bArr, O10, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            O10 = O(bArr, M3, z8);
            abstractC1010d.o(z8.f7976b != 0);
        }
        return O10;
    }

    public static int g(byte[] bArr, int i7, P4.Z z8) {
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a;
        if (i10 < 0) {
            throw C.d();
        }
        if (i10 > bArr.length - M3) {
            throw C.f();
        }
        if (i10 == 0) {
            z8.f7977c = AbstractC1014h.f15775b;
            return M3;
        }
        z8.f7977c = AbstractC1014h.o(M3, bArr, i10);
        return M3 + i10;
    }

    public static int h(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        int M3 = M(bArr, i10, z8);
        int i12 = z8.f7975a;
        if (i12 < 0) {
            throw C.d();
        }
        if (i12 > bArr.length - M3) {
            throw C.f();
        }
        if (i12 == 0) {
            interfaceC1031z.add(AbstractC1014h.f15775b);
        } else {
            interfaceC1031z.add(AbstractC1014h.o(M3, bArr, i12));
            M3 += i12;
        }
        while (M3 < i11) {
            int M10 = M(bArr, M3, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            M3 = M(bArr, M10, z8);
            int i13 = z8.f7975a;
            if (i13 < 0) {
                throw C.d();
            }
            if (i13 > bArr.length - M3) {
                throw C.f();
            }
            if (i13 == 0) {
                interfaceC1031z.add(AbstractC1014h.f15775b);
            } else {
                interfaceC1031z.add(AbstractC1014h.o(M3, bArr, i13));
                M3 += i13;
            }
        }
        return M3;
    }

    public static double i(int i7, byte[] bArr) {
        return Double.longBitsToDouble(m(i7, bArr));
    }

    public static int j(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1019m abstractC1019m = (AbstractC1019m) interfaceC1031z;
        abstractC1019m.o(i(i10, bArr));
        int i12 = i10 + 8;
        while (i12 < i11) {
            int M3 = M(bArr, i12, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            abstractC1019m.o(Double.longBitsToDouble(m(M3, bArr)));
            i12 = M3 + 8;
        }
        return i12;
    }

    public static int k(int i7, byte[] bArr) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int l(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1029x abstractC1029x = (AbstractC1029x) interfaceC1031z;
        abstractC1029x.o(k(i10, bArr));
        int i12 = i10 + 4;
        while (i12 < i11) {
            int M3 = M(bArr, i12, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            abstractC1029x.o(k(M3, bArr));
            i12 = M3 + 4;
        }
        return i12;
    }

    public static long m(int i7, byte[] bArr) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public static int n(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        J j = (J) interfaceC1031z;
        j.o(m(i10, bArr));
        int i12 = i10 + 8;
        while (i12 < i11) {
            int M3 = M(bArr, i12, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            j.o(m(M3, bArr));
            i12 = M3 + 8;
        }
        return i12;
    }

    public static float o(int i7, byte[] bArr) {
        return Float.intBitsToFloat(k(i7, bArr));
    }

    public static int p(int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1024s abstractC1024s = (AbstractC1024s) interfaceC1031z;
        abstractC1024s.o(o(i10, bArr));
        int i12 = i10 + 4;
        while (i12 < i11) {
            int M3 = M(bArr, i12, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            abstractC1024s.o(Float.intBitsToFloat(k(M3, bArr)));
            i12 = M3 + 4;
        }
        return i12;
    }

    public static int q(a0 a0Var, byte[] bArr, int i7, int i10, int i11, P4.Z z8) {
        Q q10 = (Q) a0Var;
        Object c10 = q10.c();
        int F10 = q10.F(c10, bArr, i7, i10, i11, z8);
        q10.a(c10);
        z8.f7977c = c10;
        return F10;
    }

    public static int r(a0 a0Var, int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        int i12 = (i7 & (-8)) | 4;
        int q10 = q(a0Var, bArr, i10, i11, i12, z8);
        interfaceC1031z.add(z8.f7977c);
        while (q10 < i11) {
            int M3 = M(bArr, q10, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            q10 = q(a0Var, bArr, M3, i11, i12, z8);
            interfaceC1031z.add(z8.f7977c);
        }
        return q10;
    }

    public static int s(a0 a0Var, byte[] bArr, int i7, int i10, P4.Z z8) {
        int i11 = i7 + 1;
        int i12 = bArr[i7];
        if (i12 < 0) {
            i11 = L(i12, bArr, i11, z8);
            i12 = z8.f7975a;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw C.f();
        }
        Object c10 = a0Var.c();
        int i14 = i12 + i13;
        a0Var.j(c10, bArr, i13, i14, z8);
        a0Var.a(c10);
        z8.f7977c = c10;
        return i14;
    }

    public static int t(a0 a0Var, int i7, byte[] bArr, int i10, int i11, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        int s3 = s(a0Var, bArr, i10, i11, z8);
        interfaceC1031z.add(z8.f7977c);
        while (s3 < i11) {
            int M3 = M(bArr, s3, z8);
            if (i7 != z8.f7975a) {
                break;
            }
            s3 = s(a0Var, bArr, M3, i11, z8);
            interfaceC1031z.add(z8.f7977c);
        }
        return s3;
    }

    public static int u(byte[] bArr, int i7, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1010d abstractC1010d = (AbstractC1010d) interfaceC1031z;
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a + M3;
        while (M3 < i10) {
            M3 = O(bArr, M3, z8);
            abstractC1010d.o(z8.f7976b != 0);
        }
        if (M3 == i10) {
            return M3;
        }
        throw C.f();
    }

    public static int v(byte[] bArr, int i7, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1019m abstractC1019m = (AbstractC1019m) interfaceC1031z;
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a + M3;
        while (M3 < i10) {
            abstractC1019m.o(Double.longBitsToDouble(m(M3, bArr)));
            M3 += 8;
        }
        if (M3 == i10) {
            return M3;
        }
        throw C.f();
    }

    public static int w(byte[] bArr, int i7, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1029x abstractC1029x = (AbstractC1029x) interfaceC1031z;
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a + M3;
        while (M3 < i10) {
            abstractC1029x.o(k(M3, bArr));
            M3 += 4;
        }
        if (M3 == i10) {
            return M3;
        }
        throw C.f();
    }

    public static int x(byte[] bArr, int i7, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        J j = (J) interfaceC1031z;
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a + M3;
        while (M3 < i10) {
            j.o(m(M3, bArr));
            M3 += 8;
        }
        if (M3 == i10) {
            return M3;
        }
        throw C.f();
    }

    public static int y(byte[] bArr, int i7, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1024s abstractC1024s = (AbstractC1024s) interfaceC1031z;
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a + M3;
        while (M3 < i10) {
            abstractC1024s.o(Float.intBitsToFloat(k(M3, bArr)));
            M3 += 4;
        }
        if (M3 == i10) {
            return M3;
        }
        throw C.f();
    }

    public static int z(byte[] bArr, int i7, InterfaceC1031z interfaceC1031z, P4.Z z8) {
        AbstractC1029x abstractC1029x = (AbstractC1029x) interfaceC1031z;
        int M3 = M(bArr, i7, z8);
        int i10 = z8.f7975a + M3;
        while (M3 < i10) {
            M3 = M(bArr, M3, z8);
            abstractC1029x.o(C1015i.a(z8.f7975a));
        }
        if (M3 == i10) {
            return M3;
        }
        throw C.f();
    }

    public abstract String K(int i7, byte[] bArr, int i10);

    public abstract int Q(String str, byte[] bArr, int i7, int i10);

    public boolean T(int i7, byte[] bArr, int i10) {
        return U(i7, bArr, i10) == 0;
    }

    public abstract int U(int i7, byte[] bArr, int i10);
}
