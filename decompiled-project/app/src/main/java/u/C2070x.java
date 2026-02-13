package u;

import v.AbstractC2121a;

/* renamed from: u.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2070x extends AbstractC2059l {

    /* renamed from: f, reason: collision with root package name */
    public int f24729f;

    public /* synthetic */ C2070x() {
        this(6);
    }

    public C2070x(int i7) {
        this.f24691a = Q.f24633a;
        this.f24692b = AbstractC2061n.f24697a;
        this.f24693c = AbstractC2121a.f24923c;
        if (i7 >= 0) {
            e(Q.e(i7));
        } else {
            AbstractC2121a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f24695e = 0;
        long[] jArr = this.f24691a;
        if (jArr != Q.f24633a) {
            Eb.n.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.f24691a;
            int i7 = this.f24694d;
            int i10 = i7 >> 3;
            long j = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        Eb.n.U(this.f24693c, null, 0, this.f24694d);
        this.f24729f = Q.a(this.f24694d) - this.f24695e;
    }

    public final int d(int i7) {
        int i10 = this.f24694d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f24691a;
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

    public final void e(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, Q.d(i7)) : 0;
        this.f24694d = max;
        if (max == 0) {
            jArr = Q.f24633a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
        }
        this.f24691a = jArr;
        int i10 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f24729f = Q.a(this.f24694d) - this.f24695e;
        this.f24692b = new int[max];
        this.f24693c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i7) {
        int i10;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f24694d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f24691a;
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
                if (this.f24692b[i10] == i7) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (i10 < 0) {
            return null;
        }
        this.f24695e--;
        long[] jArr2 = this.f24691a;
        int i18 = this.f24694d;
        int i19 = i10 >> 3;
        int i20 = (i10 & 7) << 3;
        long j12 = (jArr2[i19] & (~(255 << i20))) | (254 << i20);
        jArr2[i19] = j12;
        jArr2[(((i10 - 7) & i18) + (i18 & 7)) >> 3] = j12;
        Object[] objArr = this.f24693c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r2 = r0.d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r0.f24729f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (((r0.f24691a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        r2 = r0.f24694d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r2 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (java.lang.Long.compare((r0.f24695e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        r2 = r0.f24691a;
        r3 = r0.f24694d;
        r4 = r0.f24692b;
        r8 = r0.f24693c;
        r7 = (r3 + 7) >> 3;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (r15 >= r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        r9 = r2[r15] & r13;
        r2[r15] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r15 = r15 + 1;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d9, code lost:
    
        r7 = Eb.n.Y(r2);
        r9 = r7 - 1;
        r2[r9] = (r2[r9] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f4, code lost:
    
        if (r9 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f6, code lost:
    
        r10 = r9 >> 3;
        r19 = (r9 & 7) << 3;
        r13 = (r2[r10] >> r19) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0106, code lost:
    
        if (r13 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010d, code lost:
    
        if (r13 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0110, code lost:
    
        r13 = java.lang.Integer.hashCode(r4[r9]) * (-862048943);
        r13 = ((r13 << 16) ^ r13) >>> 7;
        r14 = r0.d(r13);
        r13 = r13 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0132, code lost:
    
        if ((((r14 - r13) & r3) / 8) != (((r9 - r13) & r3) / 8)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0153, code lost:
    
        r6 = r14 >> 3;
        r32 = r2[r6];
        r7 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0163, code lost:
    
        if (((r32 >> r7) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0165, code lost:
    
        r34 = r11;
        r2[r6] = (r32 & (~(255 << r7))) | ((r5 & 127) << r7);
        r2[r10] = (r2[r10] & (~(255 << r19))) | (128 << r19);
        r4[r14] = r4[r9];
        r4[r9] = 0;
        r8[r14] = r8[r9];
        r8[r9] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01af, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r0 = r36;
        r11 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018f, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        r2[r10] = (r2[r10] & (~(255 << r19))) | ((r5 & 127) << r19);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c5, code lost:
    
        r34 = r11;
        r0.f24729f = u.Q.a(r0.f24694d) - r0.f24695e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0252, code lost:
    
        r1 = r0.d(r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0258, code lost:
    
        r0.f24695e++;
        r2 = r0.f24729f;
        r4 = r0.f24691a;
        r5 = r1 >> 3;
        r6 = r4[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0272, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0274, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0277, code lost:
    
        r0.f24729f = r2 - r15;
        r2 = r0.f24694d;
        r6 = (r6 & (~(255 << r8))) | (r34 << r8);
        r4[r5] = r6;
        r4[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r6;
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0276, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d7, code lost:
    
        r34 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01de, code lost:
    
        r1 = u.Q.c(r0.f24694d);
        r2 = r0.f24691a;
        r3 = r0.f24692b;
        r4 = r0.f24693c;
        r5 = r0.f24694d;
        r0.e(r1);
        r1 = r0.f24691a;
        r6 = r0.f24692b;
        r8 = r0.f24693c;
        r9 = r0.f24694d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f8, code lost:
    
        if (r10 >= r5) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0209, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020b, code lost:
    
        r11 = r3[r10];
        r12 = java.lang.Integer.hashCode(r11) * (-862048943);
        r12 = r12 ^ (r12 << 16);
        r14 = r0.d(r12 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024c, code lost:
    
        r10 = r10 + 1;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x024a, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01db, code lost:
    
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0091, code lost:
    
        r34 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0257, code lost:
    
        r1 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i7, Object obj) {
        int i10;
        C2070x c2070x = this;
        int i11 = i7;
        int hashCode = Integer.hashCode(i7) * (-862048943);
        int i12 = hashCode ^ (hashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = c2070x.f24694d;
        int i16 = i13 & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = c2070x.f24691a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j10 = i14;
            int i20 = i17;
            long j11 = j ^ (j10 * 72340172838076673L);
            long j12 = -9187201950435737472L;
            long j13 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                i10 = (i16 + (Long.numberOfTrailingZeros(j13) >> 3)) & i15;
                if (c2070x.f24692b[i10] == i11) {
                    break loop0;
                } else {
                    j13 &= j13 - 1;
                }
            }
            i17 = i20 + 8;
            i16 = (i16 + i17) & i15;
            i11 = i7;
        }
        c2070x.f24692b[i10] = i7;
        c2070x.f24693c[i10] = obj;
    }
}
