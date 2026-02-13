package u;

import v.AbstractC2121a;

/* renamed from: u.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2041D {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24578a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24579b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f24580c;

    /* renamed from: d, reason: collision with root package name */
    public int f24581d;

    /* renamed from: e, reason: collision with root package name */
    public int f24582e;

    /* renamed from: f, reason: collision with root package name */
    public int f24583f;

    public /* synthetic */ C2041D() {
        this(6);
    }

    public C2041D(int i7) {
        this.f24578a = Q.f24633a;
        this.f24579b = AbstractC2121a.f24923c;
        this.f24580c = AbstractC2061n.f24697a;
        if (i7 >= 0) {
            e(Q.e(i7));
        } else {
            AbstractC2121a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f24582e = 0;
        long[] jArr = this.f24578a;
        if (jArr != Q.f24633a) {
            Eb.n.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.f24578a;
            int i7 = this.f24581d;
            int i10 = i7 >> 3;
            long j = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        Eb.n.U(this.f24579b, null, 0, this.f24581d);
        this.f24583f = Q.a(this.f24581d) - this.f24582e;
    }

    public final int b(int i7) {
        int i10 = this.f24581d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f24578a;
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
        long j;
        int i7;
        long[] jArr;
        Object[] objArr;
        long j10;
        int i10;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f24581d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f24578a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
            long j12 = i13;
            int i19 = i13;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = -9187201950435737472L;
            for (long j15 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j15) >> 3)) & i14;
                if (kotlin.jvm.internal.l.a(this.f24579b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int b2 = b(i12);
                if (this.f24583f != 0 || ((this.f24578a[b2 >> 3] >> ((b2 & 7) << 3)) & 255) == 254) {
                    j = j12;
                    i7 = 0;
                } else {
                    int i20 = this.f24581d;
                    if (i20 <= 8 || Long.compare((this.f24582e * 32) ^ Long.MIN_VALUE, (i20 * 25) ^ Long.MIN_VALUE) > 0) {
                        j = j12;
                        i7 = 0;
                        int c10 = Q.c(this.f24581d);
                        long[] jArr3 = this.f24578a;
                        Object[] objArr2 = this.f24579b;
                        int[] iArr = this.f24580c;
                        int i21 = this.f24581d;
                        e(c10);
                        long[] jArr4 = this.f24578a;
                        Object[] objArr3 = this.f24579b;
                        int[] iArr2 = this.f24580c;
                        int i22 = this.f24581d;
                        int i23 = 0;
                        while (i23 < i21) {
                            if (((jArr3[i23 >> 3] >> ((i23 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i23];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i24 = hashCode2 ^ (hashCode2 << 16);
                                int b10 = b(i24 >>> 7);
                                jArr = jArr3;
                                objArr = objArr2;
                                long j16 = i24 & 127;
                                int i25 = b10 >> 3;
                                int i26 = (b10 & 7) << 3;
                                long j17 = (j16 << i26) | (jArr4[i25] & (~(255 << i26)));
                                jArr4[i25] = j17;
                                jArr4[(((b10 - 7) & i22) + (i22 & 7)) >> 3] = j17;
                                objArr3[b10] = obj2;
                                iArr2[b10] = iArr[i23];
                            } else {
                                jArr = jArr3;
                                objArr = objArr2;
                            }
                            i23++;
                            jArr3 = jArr;
                            objArr2 = objArr;
                        }
                    } else {
                        long[] jArr5 = this.f24578a;
                        int i27 = this.f24581d;
                        Object[] objArr4 = this.f24579b;
                        int[] iArr3 = this.f24580c;
                        int i28 = (i27 + 7) >> 3;
                        int i29 = 0;
                        while (i29 < i28) {
                            long j18 = jArr5[i29] & j14;
                            jArr5[i29] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                            i29++;
                            j14 = -9187201950435737472L;
                        }
                        int Y2 = Eb.n.Y(jArr5);
                        int i30 = Y2 - 1;
                        long j19 = 72057594037927935L;
                        jArr5[i30] = (jArr5[i30] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[Y2] = jArr5[0];
                        int i31 = 0;
                        while (i31 != i27) {
                            int i32 = i31 >> 3;
                            int i33 = (i31 & 7) << 3;
                            long j20 = (jArr5[i32] >> i33) & 255;
                            if (j20 != 128 && j20 == 254) {
                                Object obj3 = objArr4[i31];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                                int i34 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int b11 = b(i34);
                                int i35 = i34 & i27;
                                if (((b11 - i35) & i27) / 8 == ((i31 - i35) & i27) / 8) {
                                    jArr5[i32] = (jArr5[i32] & (~(255 << i33))) | ((r9 & 127) << i33);
                                    jArr5[jArr5.length - 1] = (jArr5[0] & j19) | Long.MIN_VALUE;
                                    i31++;
                                } else {
                                    int i36 = i31;
                                    int i37 = b11 >> 3;
                                    long j21 = jArr5[i37];
                                    int i38 = (b11 & 7) << 3;
                                    if (((j21 >> i38) & 255) == 128) {
                                        jArr5[i37] = ((r9 & 127) << i38) | (j21 & (~(255 << i38)));
                                        jArr5[i32] = (jArr5[i32] & (~(255 << i33))) | (128 << i33);
                                        objArr4[b11] = objArr4[i36];
                                        objArr4[i36] = null;
                                        iArr3[b11] = iArr3[i36];
                                        iArr3[i36] = 0;
                                        j10 = j12;
                                        i10 = i36;
                                    } else {
                                        j10 = j12;
                                        jArr5[i37] = ((r9 & 127) << i38) | (j21 & (~(255 << i38)));
                                        Object obj4 = objArr4[b11];
                                        objArr4[b11] = objArr4[i36];
                                        objArr4[i36] = obj4;
                                        int i39 = iArr3[b11];
                                        iArr3[b11] = iArr3[i36];
                                        iArr3[i36] = i39;
                                        i10 = i36 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i31 = i10 + 1;
                                    j19 = 72057594037927935L;
                                    j12 = j10;
                                }
                            } else {
                                i31++;
                            }
                        }
                        j = j12;
                        i7 = 0;
                        this.f24583f = Q.a(this.f24581d) - this.f24582e;
                    }
                    b2 = b(i12);
                }
                this.f24582e++;
                int i40 = this.f24583f;
                long[] jArr6 = this.f24578a;
                int i41 = b2 >> 3;
                long j22 = jArr6[i41];
                int i42 = (b2 & 7) << 3;
                this.f24583f = i40 - (((j22 >> i42) & 255) != 128 ? i7 : 1);
                int i43 = this.f24581d;
                long j23 = (j22 & (~(255 << i42))) | (j << i42);
                jArr6[i41] = j23;
                jArr6[(((b2 - 7) & i43) + (i43 & 7)) >> 3] = j23;
                return ~b2;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
    }

    public final int d(Object obj) {
        int i7 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24581d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f24578a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * 72340172838076673L) ^ j;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (kotlin.jvm.internal.l.a(this.f24579b[numberOfTrailingZeros], obj)) {
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

    public final void e(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, Q.d(i7)) : 0;
        this.f24581d = max;
        if (max == 0) {
            jArr = Q.f24633a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
        }
        this.f24578a = jArr;
        int i10 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f24583f = Q.a(this.f24581d) - this.f24582e;
        this.f24579b = new Object[max];
        this.f24580c = new int[max];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2041D)) {
            return false;
        }
        C2041D c2041d = (C2041D) obj;
        if (c2041d.f24582e != this.f24582e) {
            return false;
        }
        Object[] objArr = this.f24579b;
        int[] iArr = this.f24580c;
        long[] jArr = this.f24578a;
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
                        int i13 = iArr[i12];
                        int d10 = c2041d.d(obj2);
                        if (d10 < 0 || i13 != c2041d.f24580c[d10]) {
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

    public final void f(int i7) {
        this.f24582e--;
        long[] jArr = this.f24578a;
        int i10 = this.f24581d;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f24579b[i7] = null;
    }

    public final void g(int i7, Object obj) {
        int c10 = c(obj);
        if (c10 < 0) {
            c10 = ~c10;
        }
        this.f24579b[c10] = obj;
        this.f24580c[c10] = i7;
    }

    public final int hashCode() {
        Object[] objArr = this.f24579b;
        int[] iArr = this.f24580c;
        long[] jArr = this.f24578a;
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
                            i11 += Integer.hashCode(iArr[i14]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f24582e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f24579b;
        int[] iArr = this.f24580c;
        long[] jArr = this.f24578a;
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
                            int i14 = iArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i14);
                            i10++;
                            if (i10 < this.f24582e) {
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
