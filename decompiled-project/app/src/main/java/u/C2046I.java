package u;

import v.AbstractC2121a;

/* renamed from: u.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2046I {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24603a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24604b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f24605c;

    /* renamed from: d, reason: collision with root package name */
    public int f24606d;

    /* renamed from: e, reason: collision with root package name */
    public int f24607e;

    /* renamed from: f, reason: collision with root package name */
    public int f24608f;

    public /* synthetic */ C2046I() {
        this(6);
    }

    public C2046I(int i7) {
        this.f24603a = Q.f24633a;
        Object[] objArr = AbstractC2121a.f24923c;
        this.f24604b = objArr;
        this.f24605c = objArr;
        if (i7 >= 0) {
            h(Q.e(i7));
        } else {
            AbstractC2121a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f24607e = 0;
        long[] jArr = this.f24603a;
        if (jArr != Q.f24633a) {
            Eb.n.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.f24603a;
            int i7 = this.f24606d;
            int i10 = i7 >> 3;
            long j = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        Eb.n.U(this.f24605c, null, 0, this.f24606d);
        Eb.n.U(this.f24604b, null, 0, this.f24606d);
        this.f24608f = Q.a(this.f24606d) - this.f24607e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj) {
        int i7;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24606d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f24603a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * 72340172838076673L) ^ j;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.l.a(this.f24604b[i7], obj)) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i7 >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj) {
        int i7;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24606d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f24603a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (i11 * 72340172838076673L) ^ j;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.l.a(this.f24604b[i7], obj)) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i7 >= 0;
    }

    public final boolean d(Object obj) {
        Object[] objArr = this.f24605c;
        long[] jArr = this.f24603a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && kotlin.jvm.internal.l.a(obj, objArr[(i7 << 3) + i11])) {
                            return true;
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
        return false;
    }

    public final int e(int i7) {
        int i10 = this.f24606d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f24603a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2046I)) {
            return false;
        }
        C2046I c2046i = (C2046I) obj;
        if (c2046i.f24607e != this.f24607e) {
            return false;
        }
        Object[] objArr = this.f24604b;
        Object[] objArr2 = this.f24605c;
        long[] jArr = this.f24603a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            loop0: while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i7 << 3) + i11;
                            Object obj2 = objArr[i12];
                            Object obj3 = objArr2[i12];
                            if (obj3 == null) {
                                if (c2046i.g(obj2) != null || !c2046i.c(obj2)) {
                                    break loop0;
                                }
                            } else if (!obj3.equals(c2046i.g(obj2))) {
                                return false;
                            }
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
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
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
        int i14 = this.f24606d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr2 = this.f24603a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
            long j12 = i13;
            int i19 = i13;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = -9187201950435737472L;
            for (long j15 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j15) >> 3)) & i14;
                if (kotlin.jvm.internal.l.a(this.f24604b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int e2 = e(i12);
                if (this.f24608f != 0 || ((this.f24603a[e2 >> 3] >> ((e2 & 7) << 3)) & 255) == 254) {
                    j = j12;
                    i7 = 0;
                } else {
                    int i20 = this.f24606d;
                    if (i20 <= 8 || Long.compare((this.f24607e * 32) ^ Long.MIN_VALUE, (i20 * 25) ^ Long.MIN_VALUE) > 0) {
                        j = j12;
                        i7 = 0;
                        int c10 = Q.c(this.f24606d);
                        long[] jArr3 = this.f24603a;
                        Object[] objArr2 = this.f24604b;
                        Object[] objArr3 = this.f24605c;
                        int i21 = this.f24606d;
                        h(c10);
                        long[] jArr4 = this.f24603a;
                        Object[] objArr4 = this.f24604b;
                        Object[] objArr5 = this.f24605c;
                        int i22 = this.f24606d;
                        int i23 = 0;
                        while (i23 < i21) {
                            if (((jArr3[i23 >> 3] >> ((i23 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i23];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i24 = hashCode2 ^ (hashCode2 << 16);
                                int e10 = e(i24 >>> 7);
                                jArr = jArr3;
                                objArr = objArr2;
                                long j16 = i24 & 127;
                                int i25 = e10 >> 3;
                                int i26 = (e10 & 7) << 3;
                                long j17 = (j16 << i26) | (jArr4[i25] & (~(255 << i26)));
                                jArr4[i25] = j17;
                                jArr4[(((e10 - 7) & i22) + (i22 & 7)) >> 3] = j17;
                                objArr4[e10] = obj2;
                                objArr5[e10] = objArr3[i23];
                            } else {
                                jArr = jArr3;
                                objArr = objArr2;
                            }
                            i23++;
                            jArr3 = jArr;
                            objArr2 = objArr;
                        }
                    } else {
                        long[] jArr5 = this.f24603a;
                        int i27 = this.f24606d;
                        Object[] objArr6 = this.f24604b;
                        Object[] objArr7 = this.f24605c;
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
                        jArr5[i30] = (jArr5[i30] & 72057594037927935L) | (-72057594037927936L);
                        jArr5[Y2] = jArr5[0];
                        int i31 = 0;
                        while (i31 != i27) {
                            int i32 = i31 >> 3;
                            int i33 = (i31 & 7) << 3;
                            long j19 = (jArr5[i32] >> i33) & 255;
                            if (j19 != 128 && j19 == 254) {
                                Object obj3 = objArr6[i31];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                                int i34 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int e11 = e(i34);
                                int i35 = i34 & i27;
                                if (((e11 - i35) & i27) / 8 == ((i31 - i35) & i27) / 8) {
                                    jArr5[i32] = ((~(255 << i33)) & jArr5[i32]) | ((r9 & 127) << i33);
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    i31++;
                                } else {
                                    int i36 = i31;
                                    int i37 = e11 >> 3;
                                    long j20 = jArr5[i37];
                                    int i38 = (e11 & 7) << 3;
                                    if (((j20 >> i38) & 255) == 128) {
                                        j10 = j12;
                                        jArr5[i37] = ((r9 & 127) << i38) | (j20 & (~(255 << i38)));
                                        jArr5[i32] = (jArr5[i32] & (~(255 << i33))) | (128 << i33);
                                        objArr6[e11] = objArr6[i36];
                                        objArr6[i36] = null;
                                        objArr7[e11] = objArr7[i36];
                                        objArr7[i36] = null;
                                        i10 = i36;
                                    } else {
                                        j10 = j12;
                                        jArr5[i37] = ((r9 & 127) << i38) | (j20 & (~(255 << i38)));
                                        Object obj4 = objArr6[e11];
                                        objArr6[e11] = objArr6[i36];
                                        objArr6[i36] = obj4;
                                        Object obj5 = objArr7[e11];
                                        objArr7[e11] = objArr7[i36];
                                        objArr7[i36] = obj5;
                                        i10 = i36 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    i31 = i10 + 1;
                                    j12 = j10;
                                }
                            } else {
                                i31++;
                            }
                        }
                        j = j12;
                        i7 = 0;
                        this.f24608f = Q.a(this.f24606d) - this.f24607e;
                    }
                    e2 = e(i12);
                }
                this.f24607e++;
                int i39 = this.f24608f;
                long[] jArr6 = this.f24603a;
                int i40 = e2 >> 3;
                long j21 = jArr6[i40];
                int i41 = (e2 & 7) << 3;
                this.f24608f = i39 - (((j21 >> i41) & 255) != 128 ? i7 : 1);
                int i42 = this.f24606d;
                long j22 = (j21 & (~(255 << i41))) | (j << i41);
                jArr6[i40] = j22;
                jArr6[(((e2 - 7) & i42) + (i42 & 7)) >> 3] = j22;
                return ~e2;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        int i7;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f24606d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f24603a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (i12 * 72340172838076673L) ^ j;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.l.a(this.f24604b[i7], obj)) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (i7 >= 0) {
            return this.f24605c[i7];
        }
        return null;
    }

    public final void h(int i7) {
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, Q.d(i7)) : 0;
        this.f24606d = max;
        if (max == 0) {
            jArr = Q.f24633a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
            int i10 = max >> 3;
            long j = 255 << ((max & 7) << 3);
            jArr[i10] = (jArr[i10] & (~j)) | j;
        }
        this.f24603a = jArr;
        this.f24608f = Q.a(this.f24606d) - this.f24607e;
        Object[] objArr = AbstractC2121a.f24923c;
        this.f24604b = max == 0 ? objArr : new Object[max];
        if (max != 0) {
            objArr = new Object[max];
        }
        this.f24605c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f24604b;
        Object[] objArr2 = this.f24605c;
        long[] jArr = this.f24603a;
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
                            Object obj2 = objArr2[i14];
                            i11 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final boolean i() {
        return this.f24607e == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        int i7;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f24606d;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f24603a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (i12 * 72340172838076673L) ^ j;
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j11 == 0) {
                    break;
                }
                i7 = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.l.a(this.f24604b[i7], obj)) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (i7 >= 0) {
            return k(i7);
        }
        return null;
    }

    public final Object k(int i7) {
        this.f24607e--;
        long[] jArr = this.f24603a;
        int i10 = this.f24606d;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f24604b[i7] = null;
        Object[] objArr = this.f24605c;
        Object obj = objArr[i7];
        objArr[i7] = null;
        return obj;
    }

    public final void l(Object obj, Object obj2) {
        int f4 = f(obj);
        if (f4 < 0) {
            f4 = ~f4;
        }
        this.f24604b[f4] = obj;
        this.f24605c[f4] = obj2;
    }

    public final String toString() {
        if (i()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f24604b;
        Object[] objArr2 = this.f24605c;
        long[] jArr = this.f24603a;
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
                            Object obj2 = objArr2[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb2.append(obj2);
                            i10++;
                            if (i10 < this.f24607e) {
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
