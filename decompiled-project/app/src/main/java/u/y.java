package u;

import v.AbstractC2121a;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24730a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f24731b;

    /* renamed from: c, reason: collision with root package name */
    public int f24732c;

    /* renamed from: d, reason: collision with root package name */
    public int f24733d;

    /* renamed from: e, reason: collision with root package name */
    public int f24734e;

    public /* synthetic */ y() {
        this(6);
    }

    public y(int i7) {
        this.f24730a = Q.f24633a;
        this.f24731b = AbstractC2061n.f24697a;
        if (i7 >= 0) {
            d(Q.e(i7));
        } else {
            AbstractC2121a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r3 = c(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r32.f24734e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (((r32.f24730a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        r3 = r32.f24732c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (r3 <= 8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (java.lang.Long.compare((r32.f24733d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
    
        r3 = r32.f24730a;
        r5 = r32.f24732c;
        r6 = r32.f24731b;
        r8 = (r5 + 7) >> 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (r9 >= r8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        r1 = r3[r9] & r12;
        r3[r9] = (-72340172838076674L) & ((~r1) + (r1 >>> 7));
        r9 = r9 + 1;
        r2 = r2;
        r12 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        r20 = r2;
        r1 = Eb.n.Y(r3);
        r2 = r1 - 1;
        r3[r2] = (r3[r2] & 72057594037927935L) | (-72057594037927936L);
        r3[r1] = r3[0];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
    
        if (r2 == r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
    
        r1 = r2 >> 3;
        r28 = (r2 & 7) << 3;
        r8 = (r3[r1] >> r28) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0113, code lost:
    
        if (r8 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011a, code lost:
    
        if (r8 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011d, code lost:
    
        r8 = java.lang.Integer.hashCode(r6[r2]) * (-862048943);
        r9 = (r8 ^ (r8 << 16)) >>> 7;
        r21 = c(r9);
        r9 = r9 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013e, code lost:
    
        if ((((r21 - r9) & r5) / 8) != (((r2 - r9) & r5) / 8)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0166, code lost:
    
        r9 = r21 >> 3;
        r12 = r3[r9];
        r14 = (r21 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0176, code lost:
    
        if (((r12 >> r14) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0178, code lost:
    
        r30 = r10;
        r3[r9] = ((r8 & 127) << r14) | ((~(255 << r14)) & r12);
        r3[r1] = (r3[r1] & (~(255 << r28))) | (128 << r28);
        r6[r21] = r6[r2];
        r6[r2] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b1, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r2 = r2 + 1;
        r10 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019a, code lost:
    
        r30 = r10;
        r3[r9] = ((r8 & 127) << r14) | ((~(255 << r14)) & r12);
        r1 = r6[r21];
        r6[r21] = r6[r2];
        r6[r2] = r1;
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0140, code lost:
    
        r3[r1] = ((r8 & 127) << r28) | (r3[r1] & (~(255 << r28)));
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0115, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c7, code lost:
    
        r30 = r10;
        r32.f24734e = u.Q.a(r32.f24732c) - r32.f24733d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0243, code lost:
    
        r1 = c(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0249, code lost:
    
        r32.f24733d++;
        r2 = r32.f24734e;
        r3 = r32.f24730a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0262, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0264, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0267, code lost:
    
        r32.f24734e = r2 - r8;
        r2 = r32.f24732c;
        r5 = (r5 & (~(255 << r7))) | (r30 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0266, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d6, code lost:
    
        r20 = r2;
        r30 = r10;
        r1 = u.Q.c(r32.f24732c);
        r2 = r32.f24730a;
        r3 = r32.f24731b;
        r5 = r32.f24732c;
        d(r1);
        r1 = r32.f24730a;
        r6 = r32.f24731b;
        r7 = r32.f24732c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f1, code lost:
    
        if (r9 >= r5) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0202, code lost:
    
        if (((r2[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0204, code lost:
    
        r10 = r3[r9];
        r11 = java.lang.Integer.hashCode(r10) * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r13 = c(r11 >>> 7);
        r14 = r9;
        r8 = r11 & 127;
        r11 = r13 >> 3;
        r19 = (r13 & 7) << 3;
        r8 = (r8 << r19) | (r1[r11] & (~(255 << r19)));
        r1[r11] = r8;
        r1[(((r13 - 7) & r7) + (r7 & 7)) >> 3] = r8;
        r6[r13] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x023f, code lost:
    
        r9 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023e, code lost:
    
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0099, code lost:
    
        r20 = r2;
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0248, code lost:
    
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i7) {
        int i10;
        int i11;
        int i12 = i7;
        int i13 = this.f24733d;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i14 = hashCode ^ (hashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f24732c;
        int i18 = i15 & i17;
        int i19 = 0;
        loop0: while (true) {
            long[] jArr = this.f24730a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = i19;
            long j = (((-i21) >> 63) & (jArr[i20 + 1] << (64 - i21))) | (jArr[i20] >>> i21);
            long j10 = i16;
            int i23 = i15;
            long j11 = j ^ (j10 * 72340172838076673L);
            long j12 = -9187201950435737472L;
            long j13 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i11 = (i18 + (Long.numberOfTrailingZeros(j13) >> 3)) & i17;
                if (this.f24731b[i11] == i12) {
                    i10 = i13;
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i19 = i22 + 8;
            i18 = (i18 + i19) & i17;
            i12 = i7;
            i15 = i23;
        }
        this.f24731b[i11] = i7;
        return this.f24733d != i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i7) {
        int i10;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f24732c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f24730a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (i12 * 72340172838076673L) ^ j;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f24731b[i10] == i7) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        return i10 >= 0;
    }

    public final int c(int i7) {
        int i10 = this.f24732c;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f24730a;
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

    public final void d(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, Q.d(i7)) : 0;
        this.f24732c = max;
        if (max == 0) {
            jArr = Q.f24633a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
        }
        this.f24730a = jArr;
        int i10 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f24734e = Q.a(this.f24732c) - this.f24733d;
        this.f24731b = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(int i7) {
        int i10;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f24732c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f24730a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (i12 * 72340172838076673L) ^ j;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i10 = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f24731b[i10] == i7) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        boolean z8 = i10 >= 0;
        if (z8) {
            f(i10);
        }
        return z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.f24733d != this.f24733d) {
            return false;
        }
        int[] iArr = this.f24731b;
        long[] jArr = this.f24730a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && !yVar.b(iArr[(i7 << 3) + i11])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return true;
    }

    public final void f(int i7) {
        this.f24733d--;
        long[] jArr = this.f24730a;
        int i10 = this.f24732c;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.f24731b;
        long[] jArr = this.f24730a;
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
                            i11 = Integer.hashCode(iArr[(i10 << 3) + i13]) + i11;
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f24731b;
        long[] jArr = this.f24730a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            int i10 = 0;
            loop0: while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = iArr[(i7 << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append(i13);
                            i10++;
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
        sb2.append((CharSequence) "]");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
