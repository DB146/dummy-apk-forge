package u;

import v.AbstractC2121a;

/* renamed from: u.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2038A {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24561a = Q.f24633a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f24562b = AbstractC2064q.f24709a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f24563c = AbstractC2121a.f24923c;

    /* renamed from: d, reason: collision with root package name */
    public int f24564d;

    /* renamed from: e, reason: collision with root package name */
    public int f24565e;

    /* renamed from: f, reason: collision with root package name */
    public int f24566f;

    public C2038A(int i7) {
        if (i7 >= 0) {
            e(Q.e(i7));
        } else {
            AbstractC2121a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f24565e = 0;
        long[] jArr = this.f24561a;
        if (jArr != Q.f24633a) {
            Eb.n.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.f24561a;
            int i7 = this.f24564d;
            int i10 = i7 >> 3;
            long j = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        Eb.n.U(this.f24563c, null, 0, this.f24564d);
        this.f24566f = Q.a(this.f24564d) - this.f24565e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(long j) {
        int i7;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24564d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f24561a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (i11 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f24562b[i7] == j) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i7 >= 0;
    }

    public final int c(int i7) {
        int i10 = this.f24564d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f24561a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j10) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j) {
        int i7;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24564d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f24561a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (i11 * 72340172838076673L) ^ j10;
            long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j12 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f24562b[i7] == j) {
                    break loop0;
                }
                j12 &= j12 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (i7 >= 0) {
            return this.f24563c[i7];
        }
        return null;
    }

    public final void e(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, Q.d(i7)) : 0;
        this.f24564d = max;
        if (max == 0) {
            jArr = Q.f24633a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
        }
        this.f24561a = jArr;
        int i10 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f24566f = Q.a(this.f24564d) - this.f24565e;
        this.f24562b = new long[max];
        this.f24563c = new Object[max];
    }

    public final boolean equals(Object obj) {
        int i7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2038A)) {
            return false;
        }
        C2038A c2038a = (C2038A) obj;
        if (c2038a.f24565e != this.f24565e) {
            return false;
        }
        long[] jArr = this.f24562b;
        Object[] objArr = this.f24563c;
        long[] jArr2 = this.f24561a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i10 = 0;
            loop0: while (true) {
                long j = jArr2[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j) < 128) {
                            int i14 = (i10 << 3) + i13;
                            i7 = i13;
                            long j10 = jArr[i14];
                            Object obj2 = objArr[i14];
                            if (obj2 == null) {
                                if (c2038a.d(j10) != null || !c2038a.b(j10)) {
                                    break loop0;
                                }
                            } else if (!obj2.equals(c2038a.d(j10))) {
                                return false;
                            }
                            i11 = 8;
                        } else {
                            i7 = i13;
                        }
                        j >>= i11;
                        i13 = i7 + 1;
                    }
                    if (i12 != i11) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r1 = c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r37.f24566f != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (((r37.f24561a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        r1 = r37.f24564d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r1 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (java.lang.Long.compare((r37.f24565e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        r1 = r37.f24561a;
        r2 = r37.f24564d;
        r3 = r37.f24562b;
        r7 = r37.f24563c;
        r6 = (r2 + 7) >> 3;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (r12 >= r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        r8 = r1[r12] & r14;
        r1[r12] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r12 = r12 + 1;
        r14 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        r6 = Eb.n.Y(r1);
        r8 = r6 - 1;
        r1[r8] = (r1[r8] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f2, code lost:
    
        if (r8 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        r9 = r8 >> 3;
        r18 = (r8 & 7) << 3;
        r14 = (r1[r9] >> r18) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0104, code lost:
    
        if (r14 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
    
        if (r14 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010e, code lost:
    
        r14 = java.lang.Long.hashCode(r3[r8]) * (-862048943);
        r14 = ((r14 << 16) ^ r14) >>> 7;
        r15 = c(r14);
        r14 = r14 & r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0130, code lost:
    
        if ((((r15 - r14) & r2) / 8) != (((r8 - r14) & r2) / 8)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0132, code lost:
    
        r1[r9] = (r1[r9] & (~(255 << r18))) | ((r4 & 127) << r18);
        r1[r1.length - r13] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0150, code lost:
    
        r5 = r15 >> 3;
        r33 = r1[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0160, code lost:
    
        if (((r33 >> r6) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0162, code lost:
    
        r1[r5] = ((r4 & 127) << r6) | (r33 & (~(255 << r6)));
        r1[r9] = (r1[r9] & (~(255 << r18))) | (128 << r18);
        r3[r15] = r3[r8];
        r3[r8] = 0;
        r7[r15] = r7[r8];
        r7[r8] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ab, code lost:
    
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018b, code lost:
    
        r1[r5] = ((r4 & 127) << r6) | (r33 & (~(255 << r6)));
        r4 = r3[r15];
        r3[r15] = r3[r8];
        r3[r8] = r4;
        r4 = r7[r15];
        r7[r15] = r7[r8];
        r7[r8] = r4;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ba, code lost:
    
        r37.f24566f = u.Q.a(r37.f24564d) - r37.f24565e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024d, code lost:
    
        r1 = c(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01cf, code lost:
    
        r1 = u.Q.c(r37.f24564d);
        r2 = r37.f24561a;
        r3 = r37.f24562b;
        r4 = r37.f24563c;
        r5 = r37.f24564d;
        e(r1);
        r1 = r37.f24561a;
        r7 = r37.f24562b;
        r8 = r37.f24563c;
        r9 = r37.f24564d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e9, code lost:
    
        if (r12 >= r5) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fa, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fc, code lost:
    
        r15 = r3[r12];
        r13 = java.lang.Long.hashCode(r15) * (-862048943);
        r13 = r13 ^ (r13 << 16);
        r6 = c(r13 >>> 7);
        r14 = r13 & 127;
        r13 = r6 >> 3;
        r16 = (r6 & 7) << 3;
        r18 = r2;
        r27 = r3;
        r2 = (r1[r13] & (~(255 << r16))) | (r14 << r16);
        r1[r13] = r2;
        r1[(((r6 - 7) & r9) + (r9 & 7)) >> 3] = r2;
        r7[r6] = r15;
        r8[r6] = r4[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0245, code lost:
    
        r12 = r12 + 1;
        r2 = r18;
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023e, code lost:
    
        r18 = r2;
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cc, code lost:
    
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0251, code lost:
    
        r16 = r1;
        r2 = 1;
        r37.f24565e++;
        r1 = r37.f24566f;
        r3 = r37.f24561a;
        r4 = r16 >> 3;
        r5 = r3[r4];
        r7 = (r16 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x026d, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0270, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0271, code lost:
    
        r37.f24566f = r1 - r2;
        r1 = r37.f24564d;
        r5 = (r5 & (~(255 << r7))) | (r10 << r7);
        r3[r4] = r5;
        r3[(((r16 - 7) & r1) + (r1 & 7)) >> 3] = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, long j) {
        int i7;
        char c10 = 11601;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24564d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f24561a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            int i18 = 1;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i19 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = -9187201950435737472L;
            long j14 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j14 == 0) {
                    break;
                }
                i7 = (i14 + (Long.numberOfTrailingZeros(j14) >> 3)) & i13;
                if (this.f24562b[i7] == j) {
                    break loop0;
                } else {
                    j14 &= j14 - 1;
                }
            }
            i15 = i19 + 8;
            i14 = (i14 + i15) & i13;
            i11 = i11;
            c10 = c10;
        }
        this.f24562b[i7] = j;
        this.f24563c[i7] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f24562b;
        Object[] objArr = this.f24563c;
        long[] jArr2 = this.f24561a;
        int length = jArr2.length - 2;
        int i7 = 0;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j = jArr2[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i10 << 3) + i13;
                            long j10 = jArr[i14];
                            Object obj = objArr[i14];
                            i11 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j10);
                        }
                        j >>= 8;
                    }
                    if (i12 != 8) {
                        return i11;
                    }
                }
                if (i10 == length) {
                    i7 = i11;
                    break;
                }
                i10++;
            }
        }
        return i7;
    }

    public final String toString() {
        int i7;
        int i10;
        if (this.f24565e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f24562b;
        Object[] objArr = this.f24563c;
        long[] jArr2 = this.f24561a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j = jArr2[i11];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i10 = i11;
                            long j10 = jArr[i15];
                            Object obj = objArr[i15];
                            sb2.append(j10);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i12++;
                            if (i12 < this.f24565e) {
                                sb2.append(", ");
                            }
                        } else {
                            i10 = i11;
                        }
                        j >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i16 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i7 = i16;
                } else {
                    i7 = i11;
                }
                if (i7 == length) {
                    break;
                }
                i11 = i7 + 1;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
