package com.google.crypto.tink.shaded.protobuf;

import H2.C0305t;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015i {

    /* renamed from: a, reason: collision with root package name */
    public int f15778a;

    /* renamed from: b, reason: collision with root package name */
    public C0305t f15779b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f15780c;

    /* renamed from: d, reason: collision with root package name */
    public int f15781d;

    /* renamed from: e, reason: collision with root package name */
    public int f15782e;

    /* renamed from: f, reason: collision with root package name */
    public int f15783f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public int f15784h;

    /* renamed from: i, reason: collision with root package name */
    public int f15785i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C1015i(byte[] bArr, int i7, int i10, boolean z8) {
        this.f15780c = bArr;
        this.f15781d = i10 + i7;
        this.f15783f = i7;
        this.g = i7;
    }

    public static int a(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public final int c() {
        return this.f15783f - this.g;
    }

    public final boolean d() {
        return this.f15783f == this.f15781d;
    }

    public final int e(int i7) {
        if (i7 < 0) {
            throw C.d();
        }
        int c10 = c() + i7;
        int i10 = this.f15785i;
        if (c10 > i10) {
            throw C.f();
        }
        this.f15785i = c10;
        m();
        return i10;
    }

    public final boolean f() {
        return j() != 0;
    }

    public final int g() {
        int i7 = this.f15783f;
        if (this.f15781d - i7 < 4) {
            throw C.f();
        }
        this.f15783f = i7 + 4;
        byte[] bArr = this.f15780c;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long h() {
        int i7 = this.f15783f;
        if (this.f15781d - i7 < 8) {
            throw C.f();
        }
        this.f15783f = i7 + 8;
        byte[] bArr = this.f15780c;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int i() {
        int i7;
        int i10 = this.f15783f;
        int i11 = this.f15781d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f15780c;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f15783f = i12;
                return b2;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b2;
                if (i14 < 0) {
                    i7 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i7 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i7 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i7 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i19;
                            }
                            i7 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f15783f = i13;
                return i7;
            }
        }
        return (int) k();
    }

    public final long j() {
        long j;
        long j10;
        long j11;
        long j12;
        int i7 = this.f15783f;
        int i10 = this.f15781d;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f15780c;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                this.f15783f = i11;
                return b2;
            }
            if (i10 - i11 >= 9) {
                int i12 = i7 + 2;
                int i13 = (bArr[i11] << 7) ^ b2;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i7 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i7 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j12 = (-2080896) ^ i17;
                        } else {
                            long j13 = i17;
                            i12 = i7 + 5;
                            long j14 = j13 ^ (bArr[i16] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i16 = i7 + 6;
                                long j15 = j14 ^ (bArr[i12] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i7 + 7;
                                    j14 = j15 ^ (bArr[i16] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i16 = i7 + 8;
                                        j15 = j14 ^ (bArr[i12] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i7 + 9;
                                            long j16 = (j15 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i18 = i7 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j = j11 ^ j14;
                        }
                        i12 = i16;
                        j = j12;
                    }
                }
                this.f15783f = i12;
                return j;
            }
        }
        return k();
    }

    public final long k() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i10 = this.f15783f;
            if (i10 == this.f15781d) {
                throw C.f();
            }
            this.f15783f = i10 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((this.f15780c[i10] & 128) == 0) {
                return j;
            }
        }
        throw C.c();
    }

    public final int l() {
        if (d()) {
            this.f15784h = 0;
            return 0;
        }
        int i7 = i();
        this.f15784h = i7;
        if ((i7 >>> 3) != 0) {
            return i7;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public final void m() {
        int i7 = this.f15781d + this.f15782e;
        this.f15781d = i7;
        int i10 = i7 - this.g;
        int i11 = this.f15785i;
        if (i10 <= i11) {
            this.f15782e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f15782e = i12;
        this.f15781d = i7 - i12;
    }
}
