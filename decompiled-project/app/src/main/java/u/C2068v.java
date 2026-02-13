package u;

/* renamed from: u.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2068v {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24721a = Q.f24633a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f24722b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f24723c;

    /* renamed from: d, reason: collision with root package name */
    public int f24724d;

    /* renamed from: e, reason: collision with root package name */
    public int f24725e;

    /* renamed from: f, reason: collision with root package name */
    public int f24726f;

    public C2068v() {
        int[] iArr = AbstractC2061n.f24697a;
        this.f24722b = iArr;
        this.f24723c = iArr;
        e(Q.e(6));
    }

    public final void a() {
        this.f24725e = 0;
        long[] jArr = this.f24721a;
        if (jArr != Q.f24633a) {
            Eb.n.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.f24721a;
            int i7 = this.f24724d;
            int i10 = i7 >> 3;
            long j = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        this.f24726f = Q.a(this.f24724d) - this.f24725e;
    }

    public final int b(int i7) {
        int i10 = this.f24724d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f24721a;
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

    public final int c(int i7) {
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24724d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f24721a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (this.f24722b[numberOfTrailingZeros] == i7) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int d(int i7) {
        int c10 = c(i7);
        if (c10 >= 0) {
            return this.f24723c[c10];
        }
        return -1;
    }

    public final void e(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, Q.d(i7)) : 0;
        this.f24724d = max;
        if (max == 0) {
            jArr = Q.f24633a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
        }
        this.f24721a = jArr;
        int i10 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f24726f = Q.a(this.f24724d) - this.f24725e;
        this.f24722b = new int[max];
        this.f24723c = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2068v)) {
            return false;
        }
        C2068v c2068v = (C2068v) obj;
        if (c2068v.f24725e != this.f24725e) {
            return false;
        }
        int[] iArr = this.f24722b;
        int[] iArr2 = this.f24723c;
        long[] jArr = this.f24721a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        loop0: while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i7 << 3) + i11;
                        int i13 = iArr[i12];
                        int i14 = iArr2[i12];
                        int c10 = c2068v.c(i13);
                        if (c10 < 0 || i14 != c2068v.f24723c[c10]) {
                            break loop0;
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        r2 = r0.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r0.f24726f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (((r0.f24721a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r2 = r0.f24724d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (java.lang.Long.compare((r0.f24725e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        r2 = r0.f24721a;
        r3 = r0.f24724d;
        r4 = r0.f24722b;
        r8 = r0.f24723c;
        r7 = (r3 + 7) >> 3;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        if (r15 >= r7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        r9 = r2[r15] & r13;
        r2[r15] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r15 = r15 + 1;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        r7 = Eb.n.Y(r2);
        r9 = r7 - 1;
        r2[r9] = (r2[r9] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
    
        if (r9 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f8, code lost:
    
        r10 = r9 >> 3;
        r19 = (r9 & 7) << 3;
        r13 = (r2[r10] >> r19) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        if (r13 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010f, code lost:
    
        if (r13 == 254) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0112, code lost:
    
        r13 = java.lang.Integer.hashCode(r4[r9]) * (-862048943);
        r13 = ((r13 << 16) ^ r13) >>> 7;
        r14 = r0.b(r13);
        r13 = r13 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0134, code lost:
    
        if ((((r14 - r13) & r3) / 8) != (((r9 - r13) & r3) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0155, code lost:
    
        r6 = r14 >> 3;
        r32 = r2[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0165, code lost:
    
        if (((r32 >> r7) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0167, code lost:
    
        r34 = r11;
        r2[r6] = (r32 & (~(255 << r7))) | ((r5 & 127) << r7);
        r2[r10] = (r2[r10] & (~(255 << r19))) | (128 << r19);
        r4[r14] = r4[r9];
        r4[r9] = 0;
        r8[r14] = r8[r9];
        r8[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b0, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r0 = r36;
        r11 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0190, code lost:
    
        r34 = r11;
        r2[r6] = ((r5 & 127) << r7) | (r32 & (~(255 << r7)));
        r0 = r4[r14];
        r4[r14] = r4[r9];
        r4[r9] = r0;
        r0 = r8[r14];
        r8[r14] = r8[r9];
        r8[r9] = r0;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0136, code lost:
    
        r2[r10] = (r2[r10] & (~(255 << r19))) | ((r5 & 127) << r19);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010a, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c6, code lost:
    
        r34 = r11;
        r0.f24726f = u.Q.a(r0.f24724d) - r0.f24725e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0253, code lost:
    
        r2 = r0.b(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0257, code lost:
    
        r0.f24725e++;
        r1 = r0.f24726f;
        r4 = r0.f24721a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0271, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0273, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0276, code lost:
    
        r0.f24726f = r1 - r15;
        r1 = r0.f24724d;
        r6 = (r6 & (~(255 << r8))) | (r34 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r1 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0275, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d8, code lost:
    
        r34 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01df, code lost:
    
        r1 = u.Q.c(r0.f24724d);
        r2 = r0.f24721a;
        r3 = r0.f24722b;
        r4 = r0.f24723c;
        r5 = r0.f24724d;
        r0.e(r1);
        r1 = r0.f24721a;
        r6 = r0.f24722b;
        r8 = r0.f24723c;
        r9 = r0.f24724d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f9, code lost:
    
        if (r10 >= r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020a, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x020c, code lost:
    
        r11 = r3[r10];
        r12 = java.lang.Integer.hashCode(r11) * (-862048943);
        r12 = r12 ^ (r12 << 16);
        r14 = r0.b(r12 >>> 7);
        r19 = r8;
        r7 = r12 & 127;
        r12 = r14 >> 3;
        r22 = (r14 & 7) << 3;
        r7 = (r7 << r22) | (r1[r12] & (~(255 << r22)));
        r1[r12] = r7;
        r1[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r7;
        r6[r14] = r11;
        r19[r14] = r4[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x024d, code lost:
    
        r10 = r10 + 1;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024b, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01dc, code lost:
    
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0093, code lost:
    
        r34 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i7, int i10) {
        int i11;
        C2068v c2068v = this;
        int i12 = i7;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = c2068v.f24724d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = c2068v.f24721a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            long j = ((jArr[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr[i19] >>> i20);
            long j10 = i15;
            int i21 = i18;
            long j11 = j ^ (j10 * 72340172838076673L);
            long j12 = -9187201950435737472L;
            long j13 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j13) >> 3)) & i16;
                if (c2068v.f24722b[numberOfTrailingZeros] == i12) {
                    i11 = numberOfTrailingZeros;
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i18 = i21 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i7;
        }
        if (i11 < 0) {
            i11 = ~i11;
        }
        c2068v.f24722b[i11] = i7;
        c2068v.f24723c[i11] = i10;
    }

    public final int hashCode() {
        int[] iArr = this.f24722b;
        int[] iArr2 = this.f24723c;
        long[] jArr = this.f24721a;
        int length = jArr.length - 2;
        int i7 = 0;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr[i14];
                            i11 += Integer.hashCode(iArr2[i14]) ^ Integer.hashCode(i15);
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
        if (this.f24725e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.f24722b;
        int[] iArr2 = this.f24723c;
        long[] jArr = this.f24721a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i7 << 3) + i12;
                            int i14 = iArr[i13];
                            int i15 = iArr2[i13];
                            sb2.append(i14);
                            sb2.append("=");
                            sb2.append(i15);
                            i10++;
                            if (i10 < this.f24725e) {
                                sb2.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
