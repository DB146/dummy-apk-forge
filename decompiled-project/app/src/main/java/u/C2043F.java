package u;

import A0.C0005a;
import java.util.Arrays;
import java.util.Collection;
import v.AbstractC2121a;

/* renamed from: u.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2043F {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24586a = Q.f24633a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f24587b = AbstractC2121a.f24923c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f24588c = AbstractC2065s.f24715b;

    /* renamed from: d, reason: collision with root package name */
    public int f24589d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: e, reason: collision with root package name */
    public int f24590e = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: f, reason: collision with root package name */
    public int f24591f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f24592h;

    public C2043F(int i7) {
        if (i7 >= 0) {
            f(Q.e(i7));
        } else {
            AbstractC2121a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i7 = this.g;
        int d10 = d(obj);
        this.f24587b[d10] = obj;
        long[] jArr = this.f24588c;
        int i10 = this.f24589d;
        jArr[d10] = (i10 & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((d10 & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f24589d = d10;
        if (this.f24590e == Integer.MAX_VALUE) {
            this.f24590e = d10;
        }
        return this.g != i7;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.f24586a;
        if (jArr != Q.f24633a) {
            Eb.n.V(jArr, -9187201950435737472L);
            long[] jArr2 = this.f24586a;
            int i7 = this.f24591f;
            int i10 = i7 >> 3;
            long j = 255 << ((i7 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        Eb.n.U(this.f24587b, null, 0, this.f24591f);
        Eb.n.V(this.f24588c, 4611686018427387903L);
        this.f24589d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f24590e = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f24592h = Q.a(this.f24591f) - this.g;
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
        int i12 = this.f24591f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f24586a;
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
                if (kotlin.jvm.internal.l.a(this.f24587b[i7], obj)) {
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
        int i10;
        long[] jArr;
        Object[] objArr;
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        long j12;
        int i14;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i15 = hashCode ^ (hashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f24591f;
        int i19 = i16 & i18;
        int i20 = 0;
        while (true) {
            long[] jArr2 = this.f24586a;
            int i21 = i19 >> 3;
            int i22 = (i19 & 7) << 3;
            long j13 = ((jArr2[i21 + 1] << (64 - i22)) & ((-i22) >> 63)) | (jArr2[i21] >>> i22);
            long j14 = i17;
            int i23 = i17;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = -9187201950435737472L;
            for (long j17 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L); j17 != 0; j17 &= j17 - 1) {
                int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j17) >> 3)) & i18;
                if (kotlin.jvm.internal.l.a(this.f24587b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int e2 = e(i16);
                if (this.f24592h != 0 || ((this.f24586a[e2 >> 3] >> ((e2 & 7) << 3)) & 255) == 254) {
                    j = j14;
                    i7 = 0;
                } else {
                    int i24 = this.f24591f;
                    if (i24 > 8) {
                        i10 = i16;
                        if (Long.compare((this.g * 32) ^ Long.MIN_VALUE, (i24 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f24586a;
                            if (jArr3 == null) {
                                j = j14;
                                i7 = 0;
                            } else {
                                int i25 = this.f24591f;
                                Object[] objArr2 = this.f24587b;
                                long[] jArr4 = this.f24588c;
                                long[] jArr5 = new long[i25];
                                Arrays.fill(jArr5, 0, i25, 9223372034707292159L);
                                int i26 = (i25 + 7) >> 3;
                                int i27 = 0;
                                while (i27 < i26) {
                                    long j18 = jArr3[i27] & j16;
                                    jArr3[i27] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                    i27++;
                                    j16 = -9187201950435737472L;
                                }
                                int length = jArr3.length;
                                int i28 = length - 1;
                                int i29 = length - 2;
                                jArr3[i29] = (jArr3[i29] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i28] = jArr3[0];
                                int i30 = 0;
                                while (i30 != i25) {
                                    int i31 = i30 >> 3;
                                    int i32 = (i30 & 7) << 3;
                                    long j19 = (jArr3[i31] >> i32) & 255;
                                    if (j19 != 128 && j19 == 254) {
                                        Object obj2 = objArr2[i30];
                                        if (obj2 != null) {
                                            i13 = obj2.hashCode();
                                            i12 = -862048943;
                                        } else {
                                            i12 = -862048943;
                                            i13 = 0;
                                        }
                                        int i33 = i13 * i12;
                                        int i34 = ((i33 << 16) ^ i33) >>> 7;
                                        int e10 = e(i34);
                                        int i35 = i34 & i25;
                                        if (((e10 - i35) & i25) / 8 == ((i30 - i35) & i25) / 8) {
                                            j12 = j14;
                                            jArr3[i31] = ((r14 & 127) << i32) | (jArr3[i31] & (~(255 << i32)));
                                            if (jArr5[i30] == 9223372034707292159L) {
                                                long j20 = i30;
                                                jArr5[i30] = j20 | (j20 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i30++;
                                        } else {
                                            j12 = j14;
                                            int i36 = e10 >> 3;
                                            long j21 = jArr3[i36];
                                            int i37 = (e10 & 7) << 3;
                                            if (((j21 >> i37) & 255) == 128) {
                                                jArr3[i36] = (j21 & (~(255 << i37))) | ((r14 & 127) << i37);
                                                jArr3[i31] = (jArr3[i31] & (~(255 << i32))) | (128 << i32);
                                                objArr2[e10] = objArr2[i30];
                                                objArr2[i30] = null;
                                                jArr4[e10] = jArr4[i30];
                                                jArr4[i30] = 4611686018427387903L;
                                                int i38 = (int) ((jArr5[i30] >> 32) & 4294967295L);
                                                if (i38 != Integer.MAX_VALUE) {
                                                    jArr5[i38] = e10 | (jArr5[i38] & (-4294967296L));
                                                    jArr5[i30] = (jArr5[i30] & 4294967295L) | (-4294967296L);
                                                    i14 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                                                } else {
                                                    i14 = Integer.MAX_VALUE;
                                                    jArr5[i30] = (com.google.android.gms.common.api.f.API_PRIORITY_OTHER << 32) | e10;
                                                }
                                                jArr5[e10] = (i30 << 32) | i14;
                                            } else {
                                                jArr3[i36] = ((r14 & 127) << i37) | (j21 & (~(255 << i37)));
                                                Object obj3 = objArr2[e10];
                                                objArr2[e10] = objArr2[i30];
                                                objArr2[i30] = obj3;
                                                long j22 = jArr4[e10];
                                                jArr4[e10] = jArr4[i30];
                                                jArr4[i30] = j22;
                                                int i39 = (int) ((jArr5[i30] >> 32) & 4294967295L);
                                                if (i39 != Integer.MAX_VALUE) {
                                                    long j23 = e10;
                                                    jArr5[i39] = (jArr5[i39] & (-4294967296L)) | j23;
                                                    jArr5[i30] = (jArr5[i30] & 4294967295L) | (j23 << 32);
                                                } else {
                                                    long j24 = e10;
                                                    jArr5[i30] = j24 | (j24 << 32);
                                                    i39 = i30;
                                                }
                                                jArr5[e10] = (i39 << 32) | i30;
                                                i30--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i30++;
                                        }
                                        j14 = j12;
                                    } else {
                                        i30++;
                                    }
                                }
                                j = j14;
                                i7 = 0;
                                this.f24592h = Q.a(this.f24591f) - this.g;
                                long[] jArr6 = this.f24588c;
                                int length2 = jArr6.length;
                                for (int i40 = 0; i40 < length2; i40++) {
                                    long j25 = jArr6[i40];
                                    int i41 = (int) ((j25 >> 31) & 2147483647L);
                                    int i42 = (int) (j25 & 2147483647L);
                                    long j26 = j25 & (-4611686018427387904L);
                                    if (i41 == Integer.MAX_VALUE) {
                                        i11 = Integer.MAX_VALUE;
                                        j11 = 4294967295L;
                                    } else {
                                        j11 = 4294967295L;
                                        i11 = (int) (jArr5[i41] & 4294967295L);
                                    }
                                    jArr6[i40] = ((j26 | i11) << 31) | (i42 == Integer.MAX_VALUE ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : (int) (jArr5[i42] & j11));
                                }
                                int i43 = this.f24589d;
                                if (i43 != Integer.MAX_VALUE) {
                                    j10 = 4294967295L;
                                    this.f24589d = (int) (jArr5[i43] & 4294967295L);
                                } else {
                                    j10 = 4294967295L;
                                }
                                int i44 = this.f24590e;
                                if (i44 != Integer.MAX_VALUE) {
                                    this.f24590e = (int) (jArr5[i44] & j10);
                                }
                            }
                            e2 = e(i10);
                        }
                    } else {
                        i10 = i16;
                    }
                    j = j14;
                    i7 = 0;
                    int c10 = Q.c(this.f24591f);
                    long[] jArr7 = this.f24586a;
                    Object[] objArr3 = this.f24587b;
                    long[] jArr8 = this.f24588c;
                    int i45 = this.f24591f;
                    int[] iArr = new int[i45];
                    f(c10);
                    long[] jArr9 = this.f24586a;
                    Object[] objArr4 = this.f24587b;
                    long[] jArr10 = this.f24588c;
                    int i46 = this.f24591f;
                    int i47 = 0;
                    while (i47 < i45) {
                        if (((jArr7[i47 >> 3] >> ((i47 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i47];
                            int hashCode2 = (obj4 != null ? obj4.hashCode() : 0) * (-862048943);
                            int i48 = hashCode2 ^ (hashCode2 << 16);
                            int e11 = e(i48 >>> 7);
                            jArr = jArr7;
                            objArr = objArr3;
                            long j27 = i48 & 127;
                            int i49 = e11 >> 3;
                            int i50 = (e11 & 7) << 3;
                            long j28 = (j27 << i50) | (jArr9[i49] & (~(255 << i50)));
                            jArr9[i49] = j28;
                            jArr9[(((e11 - 7) & i46) + (i46 & 7)) >> 3] = j28;
                            objArr4[e11] = obj4;
                            jArr10[e11] = jArr8[i47];
                            iArr[i47] = e11;
                        } else {
                            jArr = jArr7;
                            objArr = objArr3;
                        }
                        i47++;
                        jArr7 = jArr;
                        objArr3 = objArr;
                    }
                    long[] jArr11 = this.f24588c;
                    int length3 = jArr11.length;
                    for (int i51 = 0; i51 < length3; i51++) {
                        long j29 = jArr11[i51];
                        jArr11[i51] = (((j29 & (-4611686018427387904L)) | (((int) ((j29 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r7])) << 31) | (((int) (j29 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r8]);
                    }
                    int i52 = this.f24589d;
                    if (i52 != Integer.MAX_VALUE) {
                        this.f24589d = iArr[i52];
                    }
                    int i53 = this.f24590e;
                    if (i53 != Integer.MAX_VALUE) {
                        this.f24590e = iArr[i53];
                    }
                    e2 = e(i10);
                }
                this.g++;
                int i54 = this.f24592h;
                long[] jArr12 = this.f24586a;
                int i55 = e2 >> 3;
                long j30 = jArr12[i55];
                int i56 = (e2 & 7) << 3;
                this.f24592h = i54 - (((j30 >> i56) & 255) != 128 ? i7 : 1);
                int i57 = this.f24591f;
                long j31 = (j30 & (~(255 << i56))) | (j << i56);
                jArr12[i55] = j31;
                jArr12[(((e2 - 7) & i57) + (i57 & 7)) >> 3] = j31;
                return e2;
            }
            i20 += 8;
            i19 = (i19 + i20) & i18;
            i17 = i23;
        }
    }

    public final int e(int i7) {
        int i10 = this.f24591f;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f24586a;
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
        if (!(obj instanceof C2043F)) {
            return false;
        }
        C2043F c2043f = (C2043F) obj;
        if (c2043f.g != this.g) {
            return false;
        }
        Object[] objArr = this.f24587b;
        long[] jArr = this.f24586a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && !c2043f.c(objArr[(i7 << 3) + i11])) {
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
        long[] jArr2;
        int max = i7 > 0 ? Math.max(7, Q.d(i7)) : 0;
        this.f24591f = max;
        if (max == 0) {
            jArr = Q.f24633a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            Eb.n.V(jArr, -9187201950435737472L);
        }
        this.f24586a = jArr;
        int i10 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f24592h = Q.a(this.f24591f) - this.g;
        this.f24587b = max == 0 ? AbstractC2121a.f24923c : new Object[max];
        if (max == 0) {
            jArr2 = AbstractC2065s.f24715b;
        } else {
            jArr2 = new long[max];
            Eb.n.V(jArr2, 4611686018427387903L);
        }
        this.f24588c = jArr2;
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
    public final boolean g(Object obj) {
        int i7;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f24591f;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f24586a;
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
                if (kotlin.jvm.internal.l.a(this.f24587b[i7], obj)) {
                    break loop0;
                }
                j11 &= j11 - 1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z8 = i7 >= 0;
        if (z8) {
            h(i7);
        }
        return z8;
    }

    public final void h(int i7) {
        this.g--;
        long[] jArr = this.f24586a;
        int i10 = this.f24591f;
        int i11 = i7 >> 3;
        int i12 = (i7 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i7 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f24587b[i7] = null;
        long[] jArr2 = this.f24588c;
        long j10 = jArr2[i7];
        int i13 = (int) ((j10 >> 31) & 2147483647L);
        int i14 = (int) (j10 & 2147483647L);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & (-2147483648L)) | (i14 & 2147483647L);
        } else {
            this.f24589d = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((i13 & 2147483647L) << 31) | (jArr2[i14] & (-4611686016279904257L));
        } else {
            this.f24590e = i13;
        }
        jArr2[i7] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i7 = (this.f24591f * 31) + this.g;
        Object[] objArr = this.f24587b;
        long[] jArr = this.f24586a;
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

    public final boolean i(Collection elements) {
        kotlin.jvm.internal.l.e(elements, "elements");
        Object[] objArr = this.f24587b;
        int i7 = this.g;
        long[] jArr = this.f24586a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!Eb.o.V(elements, objArr[i13])) {
                                h(i13);
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
        return i7 != this.g;
    }

    public final String toString() {
        C0005a c0005a = new C0005a(this, 29);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f24587b;
        long[] jArr = this.f24588c;
        int i7 = this.f24590e;
        int i10 = 0;
        while (true) {
            if (i7 == Integer.MAX_VALUE) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = (int) ((jArr[i7] >> 31) & 2147483647L);
            Object obj = objArr[i7];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) c0005a.invoke(obj));
            i10++;
            i7 = i11;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
