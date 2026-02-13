package u;

import Q.O0;
import v.AbstractC2121a;

/* renamed from: u.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2047J {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24609a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24610b;

    /* renamed from: c, reason: collision with root package name */
    public int f24611c;

    /* renamed from: d, reason: collision with root package name */
    public int f24612d;

    /* renamed from: e, reason: collision with root package name */
    public int f24613e;

    public /* synthetic */ C2047J() {
        this(6);
    }

    public C2047J(int i7) {
        this.f24609a = Q.f24633a;
        this.f24610b = AbstractC2121a.f24923c;
        if (i7 >= 0) {
            f(Q.e(i7));
        } else {
            AbstractC2121a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i7 = this.f24612d;
        this.f24610b[d(obj)] = obj;
        return this.f24612d != i7;
    }

    public final void b() {
        this.f24612d = 0;
        long[] jArr = this.f24609a;
        if (jArr != Q.f24633a) {
            Eb.n.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.f24609a;
            int i7 = this.f24611c;
            int i10 = i7 >> 3;
            long j = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        Eb.n.U(this.f24610b, null, 0, this.f24611c);
        this.f24613e = Q.a(this.f24611c) - this.f24612d;
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
        int i12 = this.f24611c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f24609a;
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
                if (kotlin.jvm.internal.l.a(this.f24610b[i7], obj)) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return i7 >= 0;
    }

    public final int d(Object obj) {
        long j;
        int i7;
        long j10;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24611c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24609a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = i12;
            int i18 = i12;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = -9187201950435737472L;
            for (long j15 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j15) >> 3)) & i13;
                if (kotlin.jvm.internal.l.a(this.f24610b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int e2 = e(i11);
                long j16 = 255;
                if (this.f24613e != 0 || ((this.f24609a[e2 >> 3] >> ((e2 & 7) << 3)) & 255) == 254) {
                    j = j12;
                    i7 = 0;
                } else {
                    int i19 = this.f24611c;
                    if (i19 <= 8 || Long.compare((this.f24612d * 32) ^ Long.MIN_VALUE, (i19 * 25) ^ Long.MIN_VALUE) > 0) {
                        j = j12;
                        i7 = 0;
                        int c10 = Q.c(this.f24611c);
                        long[] jArr2 = this.f24609a;
                        Object[] objArr = this.f24610b;
                        int i20 = this.f24611c;
                        f(c10);
                        long[] jArr3 = this.f24609a;
                        Object[] objArr2 = this.f24610b;
                        int i21 = this.f24611c;
                        int i22 = 0;
                        while (i22 < i20) {
                            if (((jArr2[i22 >> 3] >> ((i22 & 7) << 3)) & j16) < 128) {
                                Object obj2 = objArr[i22];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i23 = hashCode2 ^ (hashCode2 << 16);
                                int e10 = e(i23 >>> 7);
                                long j17 = i23 & 127;
                                int i24 = e10 >> 3;
                                int i25 = (e10 & 7) << 3;
                                long j18 = (j17 << i25) | (jArr3[i24] & (~(255 << i25)));
                                jArr3[i24] = j18;
                                jArr3[(((e10 - 7) & i21) + (i21 & 7)) >> 3] = j18;
                                objArr2[e10] = obj2;
                            }
                            i22++;
                            j16 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f24609a;
                        int i26 = this.f24611c;
                        Object[] objArr3 = this.f24610b;
                        int i27 = (i26 + 7) >> 3;
                        int i28 = 0;
                        while (i28 < i27) {
                            long j19 = jArr4[i28] & j14;
                            jArr4[i28] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                            i28++;
                            j14 = -9187201950435737472L;
                        }
                        int Y2 = Eb.n.Y(jArr4);
                        int i29 = Y2 - 1;
                        jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                        jArr4[Y2] = jArr4[0];
                        int i30 = 0;
                        while (i30 != i26) {
                            int i31 = i30 >> 3;
                            int i32 = (i30 & 7) << 3;
                            long j20 = (jArr4[i31] >> i32) & 255;
                            if (j20 != 128 && j20 == 254) {
                                Object obj3 = objArr3[i30];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * (-862048943);
                                int i33 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int e11 = e(i33);
                                int i34 = i33 & i26;
                                if (((e11 - i34) & i26) / 8 == ((i30 - i34) & i26) / 8) {
                                    jArr4[i31] = (jArr4[i31] & (~(255 << i32))) | ((r13 & 127) << i32);
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i30++;
                                } else {
                                    int i35 = e11 >> 3;
                                    long j21 = jArr4[i35];
                                    int i36 = (e11 & 7) << 3;
                                    if (((j21 >> i36) & 255) == 128) {
                                        j10 = j12;
                                        jArr4[i35] = (j21 & (~(255 << i36))) | ((r13 & 127) << i36);
                                        jArr4[i31] = (jArr4[i31] & (~(255 << i32))) | (128 << i32);
                                        objArr3[e11] = objArr3[i30];
                                        objArr3[i30] = null;
                                    } else {
                                        j10 = j12;
                                        jArr4[i35] = ((r13 & 127) << i36) | (j21 & (~(255 << i36)));
                                        Object obj4 = objArr3[e11];
                                        objArr3[e11] = objArr3[i30];
                                        objArr3[i30] = obj4;
                                        i30--;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i30++;
                                    j12 = j10;
                                }
                            } else {
                                i30++;
                            }
                        }
                        j = j12;
                        i7 = 0;
                        this.f24613e = Q.a(this.f24611c) - this.f24612d;
                    }
                    e2 = e(i11);
                }
                this.f24612d++;
                int i37 = this.f24613e;
                long[] jArr5 = this.f24609a;
                int i38 = e2 >> 3;
                long j22 = jArr5[i38];
                int i39 = (e2 & 7) << 3;
                this.f24613e = i37 - (((j22 >> i39) & 255) != 128 ? i7 : 1);
                int i40 = this.f24611c;
                long j23 = (j22 & (~(255 << i39))) | (j << i39);
                jArr5[i38] = j23;
                jArr5[(((e2 - 7) & i40) + (i40 & 7)) >> 3] = j23;
                return e2;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final int e(int i7) {
        int i10 = this.f24611c;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f24609a;
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
        if (!(obj instanceof C2047J)) {
            return false;
        }
        C2047J c2047j = (C2047J) obj;
        if (c2047j.f24612d != this.f24612d) {
            return false;
        }
        Object[] objArr = this.f24610b;
        long[] jArr = this.f24609a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && !c2047j.c(objArr[(i7 << 3) + i11])) {
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
        long[] jArr;
        int max = i7 > 0 ? Math.max(7, Q.d(i7)) : 0;
        this.f24611c = max;
        if (max == 0) {
            jArr = Q.f24633a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
        }
        this.f24609a = jArr;
        int i10 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f24613e = Q.a(this.f24611c) - this.f24612d;
        this.f24610b = max == 0 ? AbstractC2121a.f24923c : new Object[max];
    }

    public final boolean g() {
        return this.f24612d == 0;
    }

    public final boolean h() {
        return this.f24612d != 0;
    }

    public final int hashCode() {
        int i7 = (this.f24611c * 31) + this.f24612d;
        Object[] objArr = this.f24610b;
        long[] jArr = this.f24609a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!kotlin.jvm.internal.l.a(obj, this)) {
                                i7 += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj) {
        int i7;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = hashCode ^ (hashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f24611c;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f24609a;
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
                if (kotlin.jvm.internal.l.a(this.f24610b[i7], obj)) {
                    break loop0;
                } else {
                    j11 &= j11 - 1;
                }
            }
            i10 += 8;
            i14 = i15 + i10;
        }
        if (i7 >= 0) {
            m(i7);
        }
    }

    public final void j(Object obj) {
        this.f24610b[d(obj)] = obj;
    }

    public final void k(C2047J elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        Object[] objArr = elements.f24610b;
        long[] jArr = elements.f24609a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        j(objArr[(i7 << 3) + i11]);
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(Object obj) {
        int i7;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24611c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f24609a;
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
                if (kotlin.jvm.internal.l.a(this.f24610b[i7], obj)) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z8 = i7 >= 0;
        if (z8) {
            m(i7);
        }
        return z8;
    }

    public final void m(int i7) {
        this.f24612d--;
        long[] jArr = this.f24609a;
        int i10 = this.f24611c;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f24610b[i7] = null;
    }

    public final String toString() {
        O0 o02 = new O0(this, 1);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f24610b;
        long[] jArr = this.f24609a;
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
                            Object obj = objArr[(i7 << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append((CharSequence) o02.invoke(obj));
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
            String sb3 = sb2.toString();
            kotlin.jvm.internal.l.d(sb3, "toString(...)");
            return sb3;
        }
        sb2.append((CharSequence) "]");
        String sb32 = sb2.toString();
        kotlin.jvm.internal.l.d(sb32, "toString(...)");
        return sb32;
    }
}
