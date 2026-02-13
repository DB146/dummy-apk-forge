package u;

import v.AbstractC2121a;

/* renamed from: u.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2040C {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24572a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24573b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f24574c;

    /* renamed from: d, reason: collision with root package name */
    public int f24575d;

    /* renamed from: e, reason: collision with root package name */
    public int f24576e;

    /* renamed from: f, reason: collision with root package name */
    public int f24577f;

    public /* synthetic */ C2040C() {
        this(6);
    }

    public C2040C(int i7) {
        this.f24572a = Q.f24633a;
        this.f24573b = AbstractC2121a.f24923c;
        this.f24574c = AbstractC2057j.f24689a;
        if (i7 >= 0) {
            d(Q.e(i7));
        } else {
            AbstractC2121a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f24576e = 0;
        long[] jArr = this.f24572a;
        if (jArr != Q.f24633a) {
            Eb.n.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.f24572a;
            int i7 = this.f24575d;
            int i10 = i7 >> 3;
            long j = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        Eb.n.U(this.f24573b, null, 0, this.f24575d);
        this.f24577f = Q.a(this.f24575d) - this.f24576e;
    }

    public final int b(int i7) {
        int i10 = this.f24575d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f24572a;
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

    public final int c(Object obj) {
        int i7 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24575d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f24572a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (kotlin.jvm.internal.l.a(this.f24573b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i13 = i14 + i7;
        }
    }

    public final void d(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, Q.d(i7)) : 0;
        this.f24575d = max;
        if (max == 0) {
            jArr = Q.f24633a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
        }
        this.f24572a = jArr;
        int i10 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f24577f = Q.a(this.f24575d) - this.f24576e;
        this.f24573b = new Object[max];
        this.f24574c = new float[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        r2 = b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r36.f24577f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (((r36.f24572a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        r2 = r36.f24575d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r2 <= 8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (java.lang.Long.compare((r36.f24576e * 32) ^ Long.MIN_VALUE, (r2 * 25) ^ Long.MIN_VALUE) > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        r2 = r36.f24572a;
        r3 = r36.f24575d;
        r4 = r36.f24573b;
        r11 = r36.f24574c;
        r10 = (r3 + 7) >> 3;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        if (r15 >= r10) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        r8 = r2[r15] & r13;
        r2[r15] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r15 = r15 + 1;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        r8 = Eb.n.Y(r2);
        r9 = r8 - 1;
        r2[r9] = (r2[r9] & 72057594037927935L) | (-72057594037927936L);
        r2[r8] = r2[0];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        if (r8 == r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0101, code lost:
    
        r9 = r8 >> 3;
        r14 = (r8 & 7) << 3;
        r12 = (r2[r9] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        if (r12 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0117, code lost:
    
        if (r12 == 254) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011a, code lost:
    
        r10 = r4[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011c, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
    
        r10 = r10.hashCode();
        r6 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012a, code lost:
    
        r12 = r10 * r6;
        r12 = ((r12 << 16) ^ r12) >>> 7;
        r13 = b(r12);
        r12 = r12 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
    
        if ((((r13 - r12) & r3) / 8) != (((r8 - r12) & r3) / 8)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0145, code lost:
    
        r2[r9] = (r2[r9] & (~(255 << r14))) | ((r6 & 127) << r14);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0165, code lost:
    
        r33 = r8;
        r7 = r13 >> 3;
        r19 = r2[r7];
        r8 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
    
        if (((r19 >> r8) & 255) != 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0179, code lost:
    
        r12 = r11;
        r35 = r5;
        r2[r7] = (r19 & (~(255 << r8))) | ((r6 & 127) << r8);
        r2[r9] = (r2[r9] & (~(255 << r14))) | (128 << r14);
        r4[r13] = r4[r33];
        r4[r33] = null;
        r12[r13] = r12[r33];
        r12[r33] = 0.0f;
        r8 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c7, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r11 = r12;
        r5 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a6, code lost:
    
        r35 = r5;
        r12 = r11;
        r2[r7] = ((r6 & 127) << r8) | (r19 & (~(255 << r8)));
        r5 = r4[r13];
        r4[r13] = r4[r33];
        r4[r33] = r5;
        r5 = r12[r13];
        r12[r13] = r12[r33];
        r12[r33] = r5;
        r8 = r33 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0126, code lost:
    
        r6 = -862048943;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d9, code lost:
    
        r35 = r5;
        r20 = 0;
        r36.f24577f = u.Q.a(r36.f24575d) - r36.f24576e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0273, code lost:
    
        r2 = b(r35);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0277, code lost:
    
        r4 = 1;
        r36.f24576e++;
        r3 = r36.f24577f;
        r5 = r36.f24572a;
        r6 = r2 >> 3;
        r7 = r5[r6];
        r9 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0291, code lost:
    
        if (((r7 >> r9) & 255) != 128) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0294, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0296, code lost:
    
        r36.f24577f = r3 - r4;
        r3 = r36.f24575d;
        r7 = (r7 & (~(255 << r9))) | (r25 << r9);
        r5[r6] = r7;
        r5[(((r2 - 7) & r3) + (r3 & 7)) >> 3] = r7;
        r2 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ec, code lost:
    
        r35 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ee, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f6, code lost:
    
        r2 = u.Q.c(r36.f24575d);
        r3 = r36.f24572a;
        r4 = r36.f24573b;
        r5 = r36.f24574c;
        r6 = r36.f24575d;
        d(r2);
        r2 = r36.f24572a;
        r7 = r36.f24573b;
        r8 = r36.f24574c;
        r9 = r36.f24575d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0211, code lost:
    
        if (r11 >= r6) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0222, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0224, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0226, code lost:
    
        if (r12 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0228, code lost:
    
        r10 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0233, code lost:
    
        r10 = r10 * (-862048943);
        r10 = r10 ^ (r10 << 16);
        r14 = b(r10 >>> 7);
        r15 = r3;
        r19 = r4;
        r3 = r10 & 127;
        r10 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r3 = (r3 << r21) | (r2[r10] & (~(255 << r21)));
        r2[r10] = r3;
        r2[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r3;
        r7[r14] = r12;
        r8[r14] = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x026d, code lost:
    
        r11 = r11 + 1;
        r3 = r15;
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0230, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026a, code lost:
    
        r15 = r3;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01f1, code lost:
    
        r35 = r5;
        r25 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009b, code lost:
    
        r25 = r11;
        r20 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(float f4, Object obj) {
        int i7;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24575d;
        int i14 = i11 & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f24572a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = i12;
            int i18 = i12;
            long j11 = j ^ (j10 * 72340172838076673L);
            long j12 = -9187201950435737472L;
            long j13 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j13 == 0) {
                    break;
                }
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (kotlin.jvm.internal.l.a(this.f24573b[numberOfTrailingZeros], obj)) {
                    i7 = numberOfTrailingZeros;
                    break loop0;
                }
                j13 &= j13 - 1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
        if (i7 < 0) {
            i7 = ~i7;
        }
        this.f24573b[i7] = obj;
        this.f24574c[i7] = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2040C)) {
            return false;
        }
        C2040C c2040c = (C2040C) obj;
        if (c2040c.f24576e != this.f24576e) {
            return false;
        }
        Object[] objArr = this.f24573b;
        float[] fArr = this.f24574c;
        long[] jArr = this.f24572a;
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
                        Object obj2 = objArr[i12];
                        float f4 = fArr[i12];
                        int c10 = c2040c.c(obj2);
                        if (c10 < 0 || f4 != c2040c.f24574c[c10]) {
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

    public final int hashCode() {
        Object[] objArr = this.f24573b;
        float[] fArr = this.f24574c;
        long[] jArr = this.f24572a;
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
                            Object obj = objArr[i14];
                            i11 += Float.hashCode(fArr[i14]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f24576e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f24573b;
        float[] fArr = this.f24574c;
        long[] jArr = this.f24572a;
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
                            Object obj = objArr[i13];
                            float f4 = fArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(f4);
                            i10++;
                            if (i10 < this.f24576e) {
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
