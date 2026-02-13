package Eb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class n extends vc.i {
    public static List J(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.l.d(asList, "asList(...)");
        return asList;
    }

    public static boolean K(Object[] objArr, Object obj) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        return a0(objArr, obj) >= 0;
    }

    public static boolean L(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = objArr[i7];
            Object obj2 = objArr2[i7];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!L((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void M(int i7, int i10, int i11, int[] iArr, int[] destination) {
        kotlin.jvm.internal.l.e(iArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        System.arraycopy(iArr, i10, destination, i7, i11 - i10);
    }

    public static void N(byte[] bArr, int i7, byte[] destination, int i10, int i11) {
        kotlin.jvm.internal.l.e(bArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        System.arraycopy(bArr, i10, destination, i7, i11 - i10);
    }

    public static void O(long[] jArr, long[] destination, int i7, int i10, int i11) {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        System.arraycopy(jArr, i10, destination, i7, i11 - i10);
    }

    public static void P(Object[] objArr, int i7, Object[] destination, int i10, int i11) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        kotlin.jvm.internal.l.e(destination, "destination");
        System.arraycopy(objArr, i10, destination, i7, i11 - i10);
    }

    public static /* synthetic */ void Q(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        if ((i11 & 2) != 0) {
            i7 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        M(i7, 0, i10, iArr, iArr2);
    }

    public static /* synthetic */ void R(Object[] objArr, int i7, Object[] objArr2, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i7 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        P(objArr, 0, objArr2, i7, i10);
    }

    public static byte[] S(int i7, byte[] bArr, int i10) {
        kotlin.jvm.internal.l.e(bArr, "<this>");
        vc.i.i(i10, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i10);
        kotlin.jvm.internal.l.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] T(Object[] objArr, int i7, int i10) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        vc.i.i(i10, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i7, i10);
        kotlin.jvm.internal.l.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void U(Object[] objArr, R7.a aVar, int i7, int i10) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        Arrays.fill(objArr, i7, i10, aVar);
    }

    public static void V(long[] jArr, long j) {
        int length = jArr.length;
        kotlin.jvm.internal.l.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j);
    }

    public static /* synthetic */ void W(Object[] objArr, R7.a aVar) {
        U(objArr, aVar, 0, objArr.length);
    }

    public static ArrayList X(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int Y(long[] jArr) {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static Object Z(int i7, Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        if (i7 < 0 || i7 >= objArr.length) {
            return null;
        }
        return objArr[i7];
    }

    public static int a0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static String b0(int i7, Object[] objArr) {
        String str = (i7 & 1) != 0 ? ", " : ",";
        String str2 = (i7 & 2) != 0 ? "" : "[";
        String str3 = (i7 & 4) == 0 ? "]" : "";
        kotlin.jvm.internal.l.e(objArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            com.bumptech.glide.d.b(sb2, obj, null);
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static String c0(byte[] bArr, String str, Ba.i iVar, int i7) {
        String str2 = (i7 & 2) != 0 ? "" : "[";
        String str3 = (i7 & 4) == 0 ? "]" : "";
        if ((i7 & 32) != 0) {
            iVar = null;
        }
        kotlin.jvm.internal.l.e(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i10 = 0;
        for (byte b2 : bArr) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            if (iVar != null) {
                sb2.append((CharSequence) iVar.invoke(Byte.valueOf(b2)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b2));
            }
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static List d0(long[] jArr) {
        kotlin.jvm.internal.l.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return v.f3891a;
        }
        if (length == 1) {
            return u0.x(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List e0(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new k(objArr, false)) : u0.x(objArr[0]) : v.f3891a;
    }

    public static Set f0(Object[] objArr) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return x.f3893a;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            kotlin.jvm.internal.l.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(B.F(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
