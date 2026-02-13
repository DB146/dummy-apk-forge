package sc;

import Eb.o;
import Y5.C0658x;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import rc.AbstractC1958b;
import rc.C1964h;
import rc.C1967k;
import rc.D;
import rc.z;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1967k f24359a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1967k f24360b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1967k f24361c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1967k f24362d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1967k f24363e;

    static {
        C1967k c1967k = C1967k.f23967d;
        f24359a = C0658x.c("/");
        f24360b = C0658x.c("\\");
        f24361c = C0658x.c("/\\");
        f24362d = C0658x.c(".");
        f24363e = C0658x.c("..");
    }

    public static final int a(z zVar) {
        if (zVar.f24007a.f() == 0) {
            return -1;
        }
        C1967k c1967k = zVar.f24007a;
        if (c1967k.r(0) != 47) {
            if (c1967k.r(0) != 92) {
                if (c1967k.f() <= 2 || c1967k.r(1) != 58 || c1967k.r(2) != 92) {
                    return -1;
                }
                char r10 = (char) c1967k.r(0);
                return (('a' > r10 || r10 >= '{') && ('A' > r10 || r10 >= '[')) ? -1 : 3;
            }
            if (c1967k.f() > 2 && c1967k.r(1) == 92) {
                C1967k other = f24360b;
                l.e(other, "other");
                int i7 = c1967k.i(2, other.f23968a);
                return i7 == -1 ? c1967k.f() : i7;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rc.h] */
    public static final z b(z zVar, z child, boolean z8) {
        l.e(zVar, "<this>");
        l.e(child, "child");
        if (a(child) != -1 || child.o() != null) {
            return child;
        }
        C1967k c10 = c(zVar);
        if (c10 == null && (c10 = c(child)) == null) {
            c10 = f(z.f24006b);
        }
        ?? obj = new Object();
        obj.i0(zVar.f24007a);
        if (obj.f23966b > 0) {
            obj.i0(c10);
        }
        obj.i0(child.f24007a);
        return d(obj, z8);
    }

    public static final C1967k c(z zVar) {
        C1967k c1967k = zVar.f24007a;
        C1967k c1967k2 = f24359a;
        if (C1967k.j(c1967k, c1967k2) != -1) {
            return c1967k2;
        }
        C1967k c1967k3 = f24360b;
        if (C1967k.j(zVar.f24007a, c1967k3) != -1) {
            return c1967k3;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x030a, code lost:
    
        if (r1 < '[') goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x014c, code lost:
    
        r19 = r4;
        r20 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x013a, code lost:
    
        if (r22 == r1) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0292 A[EDGE_INSN: B:30:0x0292->B:31:0x0292 BREAK  A[LOOP:0: B:2:0x000a->B:28:0x028b], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final z d(C1964h c1964h, boolean z8) {
        Object obj;
        D d10;
        long j;
        int i7;
        int i10;
        long j10;
        long j11;
        int i11;
        C1967k c1967k;
        int i12;
        C1967k bytes;
        C1964h c1964h2;
        C1967k c1967k2;
        C1967k X10;
        D d11;
        int i13;
        long j12;
        long j13;
        long j14;
        int i14;
        Object obj2 = new Object();
        int i15 = 0;
        C1967k c1967k3 = null;
        int i16 = 0;
        while (true) {
            C1967k bytes2 = f24359a;
            l.e(bytes2, "bytes");
            byte[] bArr = bytes2.f23968a;
            int length = bArr.length;
            if (length < 0) {
                obj = obj2;
            } else {
                long j15 = length;
                obj = obj2;
                if (j15 <= c1964h.f23966b && length <= bArr.length) {
                    if (length != 0) {
                        byte[] bArr2 = a.f24355a;
                        AbstractC1958b.e(bArr.length, i15, j15);
                        if (length <= 0) {
                            throw new IllegalArgumentException("byteCount == 0");
                        }
                        long j16 = c1964h.f23966b;
                        long j17 = 1 > j16 ? j16 : 1L;
                        if (0 != j17 && (d10 = c1964h.f23965a) != null) {
                            if (j16 < 0) {
                                for (long j18 = 0; j16 > j18; j18 = 0) {
                                    d10 = d10.g;
                                    l.b(d10);
                                    j16 -= d10.f23933c - d10.f23932b;
                                }
                                byte b2 = bArr[0];
                                j = j16;
                                long min = Math.min(j17, (c1964h.f23966b - j15) + 1);
                                long j19 = 0;
                                while (j < min) {
                                    long j20 = min;
                                    int min2 = (int) Math.min(d10.f23933c, (d10.f23932b + min) - j);
                                    i7 = (int) ((d10.f23932b + j19) - j);
                                    while (i7 < min2) {
                                        if (d10.f23931a[i7] == b2) {
                                            i11 = 1;
                                            if (a.a(d10, i7 + 1, bArr, 1, length)) {
                                                j10 = (i7 - d10.f23932b) + j;
                                                j11 = -1;
                                                break;
                                            }
                                        } else {
                                            i11 = 1;
                                        }
                                        i7 += i11;
                                    }
                                    j19 = j + (d10.f23933c - d10.f23932b);
                                    d10 = d10.f23936f;
                                    l.b(d10);
                                    j = j19;
                                    min = j20;
                                }
                            } else {
                                long j21 = 0;
                                while (true) {
                                    long j22 = (d10.f23933c - d10.f23932b) + j21;
                                    if (j22 > 0) {
                                        break;
                                    }
                                    d10 = d10.f23936f;
                                    l.b(d10);
                                    j21 = j22;
                                }
                                byte b10 = bArr[0];
                                j = j21;
                                long min3 = Math.min(j17, (c1964h.f23966b - j15) + 1);
                                long j23 = 0;
                                while (j < min3) {
                                    long j24 = min3;
                                    int min4 = (int) Math.min(d10.f23933c, (d10.f23932b + min3) - j);
                                    i7 = (int) ((d10.f23932b + j23) - j);
                                    while (i7 < min4) {
                                        if (d10.f23931a[i7] == b10) {
                                            i10 = 1;
                                            if (a.a(d10, i7 + 1, bArr, 1, length)) {
                                                j10 = (i7 - d10.f23932b) + j;
                                                j11 = -1;
                                                break;
                                            }
                                        } else {
                                            i10 = 1;
                                        }
                                        i7 += i10;
                                    }
                                    j23 = j + (d10.f23933c - d10.f23932b);
                                    d10 = d10.f23936f;
                                    l.b(d10);
                                    j = j23;
                                    min3 = j24;
                                }
                            }
                        }
                        j11 = -1;
                        j10 = -1;
                    }
                    c1967k = c1967k3;
                    i12 = i16;
                    c1967k3 = c1967k == null ? e(c1964h.V()) : c1967k;
                    i16 = i12 + 1;
                    obj2 = obj;
                    i15 = 0;
                }
            }
            bytes = f24360b;
            l.e(bytes, "bytes");
            byte[] bArr3 = bytes.f23968a;
            int length2 = bArr3.length;
            if (length2 < 0) {
                break;
            }
            long j25 = length2;
            if (j25 > c1964h.f23966b || length2 > bArr3.length) {
                break;
            }
            if (length2 != 0) {
                byte[] bArr4 = a.f24355a;
                AbstractC1958b.e(bArr3.length, 0, j25);
                if (length2 <= 0) {
                    throw new IllegalArgumentException("byteCount == 0");
                }
                long j26 = c1964h.f23966b;
                long j27 = 1 > j26 ? j26 : 1L;
                if (0 != j27 && (d11 = c1964h.f23965a) != null) {
                    if (j26 < 0) {
                        for (long j28 = 0; j26 > j28; j28 = 0) {
                            d11 = d11.g;
                            l.b(d11);
                            j26 -= d11.f23933c - d11.f23932b;
                        }
                        byte b11 = bArr3[0];
                        long min5 = Math.min(j27, (c1964h.f23966b - j25) + 1);
                        long j29 = j26;
                        long j30 = 0;
                        while (j29 < min5) {
                            c1967k = c1967k3;
                            i12 = i16;
                            long j31 = min5;
                            int min6 = (int) Math.min(d11.f23933c, (d11.f23932b + min5) - j29);
                            int i17 = (int) ((d11.f23932b + j30) - j29);
                            while (i17 < min6) {
                                if (d11.f23931a[i17] == b11) {
                                    i14 = 1;
                                    if (a.a(d11, i17 + 1, bArr3, 1, length2)) {
                                        j12 = (i17 - d11.f23932b) + j29;
                                    }
                                } else {
                                    i14 = 1;
                                }
                                i17 += i14;
                            }
                            j30 = j29 + (d11.f23933c - d11.f23932b);
                            d11 = d11.f23936f;
                            l.b(d11);
                            j29 = j30;
                            c1967k3 = c1967k;
                            i16 = i12;
                            min5 = j31;
                        }
                    } else {
                        c1967k = c1967k3;
                        i12 = i16;
                        long j32 = 0;
                        while (true) {
                            long j33 = (d11.f23933c - d11.f23932b) + j32;
                            if (j33 > 0) {
                                break;
                            }
                            d11 = d11.f23936f;
                            l.b(d11);
                            j32 = j33;
                        }
                        byte b12 = bArr3[0];
                        long min7 = Math.min(j27, (c1964h.f23966b - j25) + 1);
                        long j34 = 0;
                        while (j32 < min7) {
                            long j35 = min7;
                            int min8 = (int) Math.min(d11.f23933c, (d11.f23932b + min7) - j32);
                            int i18 = (int) ((d11.f23932b + j34) - j32);
                            while (i18 < min8) {
                                if (d11.f23931a[i18] == b12) {
                                    i13 = 1;
                                    if (a.a(d11, i18 + 1, bArr3, 1, length2)) {
                                        j12 = (i18 - d11.f23932b) + j32;
                                    }
                                } else {
                                    i13 = 1;
                                }
                                i18 += i13;
                            }
                            j34 = j32 + (d11.f23933c - d11.f23932b);
                            d11 = d11.f23936f;
                            l.b(d11);
                            j32 = j34;
                            min7 = j35;
                        }
                        j14 = -1;
                        j13 = -1;
                        if (j13 == j14) {
                            break;
                        }
                        if (c1967k == null) {
                        }
                        i16 = i12 + 1;
                        obj2 = obj;
                        i15 = 0;
                    }
                    j13 = j12;
                    j14 = -1;
                    if (j13 == j14) {
                    }
                    if (c1967k == null) {
                    }
                    i16 = i12 + 1;
                    obj2 = obj;
                    i15 = 0;
                }
                c1967k = c1967k3;
                i12 = i16;
                j14 = -1;
                j13 = -1;
                if (j13 == j14) {
                }
                if (c1967k == null) {
                }
                i16 = i12 + 1;
                obj2 = obj;
                i15 = 0;
            }
            c1967k = c1967k3;
            i12 = i16;
            if (c1967k == null) {
            }
            i16 = i12 + 1;
            obj2 = obj;
            i15 = 0;
        }
        int i19 = i12;
        C1967k c1967k4 = c1967k;
        boolean z10 = i19 >= 2 && l.a(c1967k4, bytes);
        C1967k c1967k5 = f24361c;
        if (z10) {
            l.b(c1967k4);
            C1964h c1964h3 = obj;
            c1964h3.i0(c1967k4);
            c1964h3.i0(c1967k4);
            c1964h2 = c1964h3;
        } else {
            C1964h c1964h4 = obj;
            if (i19 > 0) {
                l.b(c1967k4);
                c1964h4.i0(c1967k4);
                c1964h2 = c1964h4;
            } else {
                long T10 = c1964h.T(c1967k5);
                if (c1967k4 == null) {
                    c1967k4 = T10 == -1 ? f(z.f24006b) : e(c1964h.P(T10));
                }
                c1964h2 = c1964h4;
                if (l.a(c1967k4, bytes)) {
                    c1964h2 = c1964h4;
                    if (c1964h.f23966b >= 2) {
                        c1964h2 = c1964h4;
                        if (c1964h.P(1L) == 58) {
                            char P10 = (char) c1964h.P(0L);
                            if ('a' > P10 || P10 >= '{') {
                                c1964h2 = c1964h4;
                                if ('A' <= P10) {
                                    c1964h2 = c1964h4;
                                }
                            }
                            if (T10 == 2) {
                                c1964h4.m(3L, c1964h);
                                c1964h2 = c1964h4;
                            } else {
                                c1964h4.m(2L, c1964h);
                                c1964h2 = c1964h4;
                            }
                        }
                    }
                }
            }
        }
        boolean z11 = c1964h2.f23966b > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean K10 = c1964h.K();
            c1967k2 = f24362d;
            if (K10) {
                break;
            }
            long T11 = c1964h.T(c1967k5);
            if (T11 == -1) {
                X10 = c1964h.X(c1964h.f23966b);
            } else {
                X10 = c1964h.X(T11);
                c1964h.V();
            }
            C1967k c1967k6 = f24363e;
            if (l.a(X10, c1967k6)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (!z8 || (!z11 && (arrayList.isEmpty() || l.a(o.e0(arrayList), c1967k6)))) {
                        arrayList.add(X10);
                    } else if (!z10 || arrayList.size() != 1) {
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(u0.s(arrayList));
                        }
                    }
                }
            } else if (!l.a(X10, c1967k2) && !l.a(X10, C1967k.f23967d)) {
                arrayList.add(X10);
            }
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            if (i20 > 0) {
                c1964h2.i0(c1967k4);
            }
            c1964h2.i0((C1967k) arrayList.get(i20));
        }
        if (c1964h2.f23966b == 0) {
            c1964h2.i0(c1967k2);
        }
        return new z(c1964h2.X(c1964h2.f23966b));
    }

    public static final C1967k e(byte b2) {
        if (b2 == 47) {
            return f24359a;
        }
        if (b2 == 92) {
            return f24360b;
        }
        throw new IllegalArgumentException(h3.o.l(b2, "not a directory separator: "));
    }

    public static final C1967k f(String str) {
        if (l.a(str, "/")) {
            return f24359a;
        }
        if (l.a(str, "\\")) {
            return f24360b;
        }
        throw new IllegalArgumentException(X.c.t("not a directory separator: ", str));
    }
}
