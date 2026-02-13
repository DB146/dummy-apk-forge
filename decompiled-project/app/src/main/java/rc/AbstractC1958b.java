package rc;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import y7.u0;

/* renamed from: rc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1958b {
    public static final boolean a(byte[] a9, int i7, byte[] b2, int i10, int i11) {
        kotlin.jvm.internal.l.e(a9, "a");
        kotlin.jvm.internal.l.e(b2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a9[i12 + i7] != b2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final B b(G g) {
        kotlin.jvm.internal.l.e(g, "<this>");
        return new B(g);
    }

    public static final C c(H h10) {
        kotlin.jvm.internal.l.e(h10, "<this>");
        return new C(h10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, rc.h, rc.H] */
    public static void d(long j, C1964h c1964h, int i7, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        int i14;
        int i15;
        Object obj;
        int i16 = i7;
        if (i10 >= i11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i17 = i10; i17 < i11; i17++) {
            if (((C1967k) arrayList.get(i17)).f() < i16) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C1967k c1967k = (C1967k) arrayList.get(i10);
        C1967k c1967k2 = (C1967k) arrayList.get(i11 - 1);
        int i18 = -1;
        if (i16 == c1967k.f()) {
            int intValue = ((Number) arrayList2.get(i10)).intValue();
            int i19 = i10 + 1;
            C1967k c1967k3 = (C1967k) arrayList.get(i19);
            i12 = i19;
            i13 = intValue;
            c1967k = c1967k3;
        } else {
            i12 = i10;
            i13 = -1;
        }
        if (c1967k.r(i16) == c1967k2.r(i16)) {
            int min = Math.min(c1967k.f(), c1967k2.f());
            int i20 = 0;
            for (int i21 = i16; i21 < min && c1967k.r(i21) == c1967k2.r(i21); i21++) {
                i20++;
            }
            long j10 = 4;
            long j11 = (c1964h.f23966b / j10) + j + 2 + i20 + 1;
            c1964h.o0(-i20);
            c1964h.o0(i13);
            int i22 = i20 + i16;
            while (i16 < i22) {
                c1964h.o0(c1967k.r(i16) & 255);
                i16++;
            }
            if (i12 + 1 == i11) {
                if (i22 != ((C1967k) arrayList.get(i12)).f()) {
                    throw new IllegalStateException("Check failed.");
                }
                c1964h.o0(((Number) arrayList2.get(i12)).intValue());
                return;
            } else {
                ?? obj2 = new Object();
                c1964h.o0(((int) ((obj2.f23966b / j10) + j11)) * (-1));
                d(j11, obj2, i22, arrayList, i12, i11, arrayList2);
                c1964h.k0(obj2);
                return;
            }
        }
        int i23 = 1;
        for (int i24 = i12 + 1; i24 < i11; i24++) {
            if (((C1967k) arrayList.get(i24 - 1)).r(i16) != ((C1967k) arrayList.get(i24)).r(i16)) {
                i23++;
            }
        }
        long j12 = 4;
        long j13 = (c1964h.f23966b / j12) + j + 2 + (i23 * 2);
        c1964h.o0(i23);
        c1964h.o0(i13);
        for (int i25 = i12; i25 < i11; i25++) {
            byte r10 = ((C1967k) arrayList.get(i25)).r(i16);
            if (i25 == i12 || r10 != ((C1967k) arrayList.get(i25 - 1)).r(i16)) {
                c1964h.o0(r10 & 255);
            }
        }
        int i26 = i12;
        C1964h c1964h2 = new Object();
        while (i26 < i11) {
            byte r11 = ((C1967k) arrayList.get(i26)).r(i16);
            int i27 = i26 + 1;
            int i28 = i27;
            while (true) {
                if (i28 >= i11) {
                    i14 = i11;
                    break;
                } else {
                    if (r11 != ((C1967k) arrayList.get(i28)).r(i16)) {
                        i14 = i28;
                        break;
                    }
                    i28++;
                }
            }
            if (i27 == i14 && i16 + 1 == ((C1967k) arrayList.get(i26)).f()) {
                c1964h.o0(((Number) arrayList2.get(i26)).intValue());
                i15 = i14;
                obj = c1964h2;
            } else {
                c1964h.o0(((int) ((c1964h2.f23966b / j12) + j13)) * i18);
                i15 = i14;
                obj = c1964h2;
                d(j13, c1964h2, i16 + 1, arrayList, i26, i14, arrayList2);
            }
            c1964h2 = obj;
            i26 = i15;
            i18 = -1;
        }
        c1964h.k0(c1964h2);
    }

    public static final void e(long j, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j || j - j10 < j11) {
            StringBuilder l10 = X.c.l(j, "size=", " offset=");
            l10.append(j10);
            l10.append(" byteCount=");
            l10.append(j11);
            throw new ArrayIndexOutOfBoundsException(l10.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, rc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y f(C1967k... c1967kArr) {
        if (c1967kArr.length == 0) {
            return new y(new C1967k[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new Eb.k(c1967kArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(-1);
        }
        int length = c1967kArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList2.set(u0.h(arrayList, c1967kArr[i10]), Integer.valueOf(i11));
            i10++;
            i11++;
        }
        if (((C1967k) arrayList.get(0)).f() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            C1967k prefix = (C1967k) arrayList.get(i12);
            int i13 = i12 + 1;
            int i14 = i13;
            while (i14 < arrayList.size()) {
                C1967k c1967k = (C1967k) arrayList.get(i14);
                c1967k.getClass();
                kotlin.jvm.internal.l.e(prefix, "prefix");
                if (c1967k.v(0, prefix, prefix.f())) {
                    if (c1967k.f() == prefix.f()) {
                        throw new IllegalArgumentException(("duplicate option: " + c1967k).toString());
                    }
                    if (((Number) arrayList2.get(i14)).intValue() > ((Number) arrayList2.get(i12)).intValue()) {
                        arrayList.remove(i14);
                        ((Number) arrayList2.remove(i14)).intValue();
                    } else {
                        i14++;
                    }
                }
            }
            i12 = i13;
        }
        ?? obj = new Object();
        d(0L, obj, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i15 = (int) (obj.f23966b / 4);
        int[] iArr = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr[i16] = obj.Z();
        }
        Object[] copyOf = Arrays.copyOf(c1967kArr, c1967kArr.length);
        kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
        return new y((C1967k[]) copyOf, iArr);
    }

    public static final int g(int i7) {
        return ((i7 & 255) << 24) | (((-16777216) & i7) >>> 24) | ((16711680 & i7) >>> 8) | ((65280 & i7) << 8);
    }

    public static final C1959c h(Socket socket) {
        sc.f fVar = new sc.f(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.l.d(outputStream, "getOutputStream(...)");
        return new C1959c(0, fVar, new C1959c(1, outputStream, fVar));
    }

    public static final C1960d i(Socket socket) {
        sc.f fVar = new sc.f(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.l.d(inputStream, "getInputStream(...)");
        return new C1960d(0, fVar, new C1960d(1, inputStream, fVar));
    }

    public static final String j(byte b2) {
        char[] cArr = sc.b.f24357a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String k(int i7) {
        int i10 = 0;
        if (i7 == 0) {
            return "0";
        }
        char[] cArr = sc.b.f24357a;
        char[] cArr2 = {cArr[(i7 >> 28) & 15], cArr[(i7 >> 24) & 15], cArr[(i7 >> 20) & 15], cArr[(i7 >> 16) & 15], cArr[(i7 >> 12) & 15], cArr[(i7 >> 8) & 15], cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
        while (i10 < 8 && cArr2[i10] == '0') {
            i10++;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(A3.c.f(i10, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i10 <= 8) {
            return new String(cArr2, i10, 8 - i10);
        }
        throw new IllegalArgumentException(A3.c.f(i10, "startIndex: ", " > endIndex: 8"));
    }
}
