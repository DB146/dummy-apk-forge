package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805h extends AbstractC0807j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13401c;

    /* renamed from: d, reason: collision with root package name */
    public int f13402d;

    /* renamed from: e, reason: collision with root package name */
    public int f13403e;

    /* renamed from: f, reason: collision with root package name */
    public int f13404f;

    /* renamed from: u, reason: collision with root package name */
    public final int f13405u;

    /* renamed from: v, reason: collision with root package name */
    public int f13406v;

    /* renamed from: w, reason: collision with root package name */
    public int f13407w = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0805h(byte[] bArr, int i7, int i10, boolean z8) {
        this.f13401c = bArr;
        this.f13402d = i10 + i7;
        this.f13404f = i7;
        this.f13405u = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int A() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long B() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final boolean C(int i7) {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                K(8);
                return true;
            }
            if (i10 == 2) {
                K(G());
                return true;
            }
            if (i10 == 3) {
                D();
                a(((i7 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw C0821y.b();
            }
            K(4);
            return true;
        }
        int i12 = this.f13402d - this.f13404f;
        byte[] bArr = this.f13401c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f13404f;
                this.f13404f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw C0821y.c();
        }
        while (i11 < 10) {
            int i14 = this.f13404f;
            if (i14 == this.f13402d) {
                throw C0821y.e();
            }
            this.f13404f = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw C0821y.c();
        return true;
    }

    public final int E() {
        int i7 = this.f13404f;
        if (this.f13402d - i7 < 4) {
            throw C0821y.e();
        }
        this.f13404f = i7 + 4;
        byte[] bArr = this.f13401c;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long F() {
        int i7 = this.f13404f;
        if (this.f13402d - i7 < 8) {
            throw C0821y.e();
        }
        this.f13404f = i7 + 8;
        byte[] bArr = this.f13401c;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int G() {
        int i7;
        int i10 = this.f13404f;
        int i11 = this.f13402d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f13401c;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f13404f = i12;
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
                this.f13404f = i13;
                return i7;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j10;
        long j11;
        long j12;
        int i7 = this.f13404f;
        int i10 = this.f13402d;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f13401c;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                this.f13404f = i11;
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
                this.f13404f = i12;
                return j;
            }
        }
        return I();
    }

    public final long I() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i10 = this.f13404f;
            if (i10 == this.f13402d) {
                throw C0821y.e();
            }
            this.f13404f = i10 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((this.f13401c[i10] & 128) == 0) {
                return j;
            }
        }
        throw C0821y.c();
    }

    public final void J() {
        int i7 = this.f13402d + this.f13403e;
        this.f13402d = i7;
        int i10 = i7 - this.f13405u;
        int i11 = this.f13407w;
        if (i10 <= i11) {
            this.f13403e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f13403e = i12;
        this.f13402d = i7 - i12;
    }

    public final void K(int i7) {
        if (i7 >= 0) {
            int i10 = this.f13402d;
            int i11 = this.f13404f;
            if (i7 <= i10 - i11) {
                this.f13404f = i11 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw C0821y.e();
        }
        throw C0821y.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final void a(int i7) {
        if (this.f13406v != i7) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int b() {
        return this.f13404f - this.f13405u;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final boolean c() {
        return this.f13404f == this.f13402d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final void h(int i7) {
        this.f13407w = i7;
        J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int i(int i7) {
        if (i7 < 0) {
            throw C0821y.d();
        }
        int b2 = b() + i7;
        if (b2 < 0) {
            throw new IOException("Failed to parse the message.");
        }
        int i10 = this.f13407w;
        if (b2 > i10) {
            throw C0821y.e();
        }
        this.f13407w = b2;
        J();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final boolean j() {
        return H() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final C0804g k() {
        byte[] bArr;
        int G9 = G();
        byte[] bArr2 = this.f13401c;
        if (G9 > 0) {
            int i7 = this.f13402d;
            int i10 = this.f13404f;
            if (G9 <= i7 - i10) {
                C0804g o10 = C0804g.o(i10, bArr2, G9);
                this.f13404f += G9;
                return o10;
            }
        }
        if (G9 == 0) {
            return C0804g.f13396c;
        }
        if (G9 > 0) {
            int i11 = this.f13402d;
            int i12 = this.f13404f;
            if (G9 <= i11 - i12) {
                int i13 = G9 + i12;
                this.f13404f = i13;
                bArr = Arrays.copyOfRange(bArr2, i12, i13);
                C0804g c0804g = C0804g.f13396c;
                return new C0804g(bArr);
            }
        }
        if (G9 > 0) {
            throw C0821y.e();
        }
        if (G9 != 0) {
            throw C0821y.d();
        }
        bArr = AbstractC0819w.f13468b;
        C0804g c0804g2 = C0804g.f13396c;
        return new C0804g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final double m() {
        return Double.longBitsToDouble(F());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int n() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int o() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long p() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final float q() {
        return Float.intBitsToFloat(E());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int r() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long s() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int t() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long u() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int v() {
        int G9 = G();
        return (-(G9 & 1)) ^ (G9 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long w() {
        long H10 = H();
        return (-(H10 & 1)) ^ (H10 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final String x() {
        int G9 = G();
        if (G9 > 0) {
            int i7 = this.f13402d;
            int i10 = this.f13404f;
            if (G9 <= i7 - i10) {
                String str = new String(this.f13401c, i10, G9, AbstractC0819w.f13467a);
                this.f13404f += G9;
                return str;
            }
        }
        if (G9 == 0) {
            return "";
        }
        if (G9 < 0) {
            throw C0821y.d();
        }
        throw C0821y.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final String y() {
        int G9 = G();
        if (G9 > 0) {
            int i7 = this.f13402d;
            int i10 = this.f13404f;
            if (G9 <= i7 - i10) {
                String k = m0.f13436a.k(i10, this.f13401c, G9);
                this.f13404f += G9;
                return k;
            }
        }
        if (G9 == 0) {
            return "";
        }
        if (G9 <= 0) {
            throw C0821y.d();
        }
        throw C0821y.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int z() {
        if (c()) {
            this.f13406v = 0;
            return 0;
        }
        int G9 = G();
        this.f13406v = G9;
        if ((G9 >>> 3) != 0) {
            return G9;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }
}
