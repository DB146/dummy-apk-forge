package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806i extends AbstractC0807j {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f13408c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f13409d;

    /* renamed from: e, reason: collision with root package name */
    public int f13410e;

    /* renamed from: f, reason: collision with root package name */
    public int f13411f;

    /* renamed from: u, reason: collision with root package name */
    public int f13412u;

    /* renamed from: v, reason: collision with root package name */
    public int f13413v;

    /* renamed from: w, reason: collision with root package name */
    public int f13414w;

    /* renamed from: x, reason: collision with root package name */
    public int f13415x = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    public C0806i(InputStream inputStream) {
        Charset charset = AbstractC0819w.f13467a;
        this.f13408c = inputStream;
        this.f13409d = new byte[4096];
        this.f13410e = 0;
        this.f13412u = 0;
        this.f13414w = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int A() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long B() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final boolean C(int i7) {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                O(8);
                return true;
            }
            if (i10 == 2) {
                O(J());
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
            O(4);
            return true;
        }
        int i12 = this.f13410e - this.f13412u;
        byte[] bArr = this.f13409d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f13412u;
                this.f13412u = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw C0821y.c();
        }
        while (i11 < 10) {
            if (this.f13412u == this.f13410e) {
                N(1);
            }
            int i14 = this.f13412u;
            this.f13412u = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw C0821y.c();
        return true;
    }

    public final byte[] E(int i7) {
        byte[] F10 = F(i7);
        if (F10 != null) {
            return F10;
        }
        int i10 = this.f13412u;
        int i11 = this.f13410e;
        int i12 = i11 - i10;
        this.f13414w += i11;
        this.f13412u = 0;
        this.f13410e = 0;
        ArrayList G9 = G(i7 - i12);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f13409d, i10, bArr, 0, i12);
        Iterator it = G9.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i7) {
        if (i7 == 0) {
            return AbstractC0819w.f13468b;
        }
        if (i7 < 0) {
            throw C0821y.d();
        }
        int i10 = this.f13414w;
        int i11 = this.f13412u;
        int i12 = i10 + i11 + i7;
        if (i12 - com.google.android.gms.common.api.f.API_PRIORITY_OTHER > 0) {
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.f13415x;
        if (i12 > i13) {
            O((i13 - i10) - i11);
            throw C0821y.e();
        }
        int i14 = this.f13410e - i11;
        int i15 = i7 - i14;
        InputStream inputStream = this.f13408c;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (C0821y e2) {
                e2.f13469a = true;
                throw e2;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f13409d, this.f13412u, bArr, 0, i14);
        this.f13414w += this.f13410e;
        this.f13412u = 0;
        this.f13410e = 0;
        while (i14 < i7) {
            try {
                int read = inputStream.read(bArr, i14, i7 - i14);
                if (read == -1) {
                    throw C0821y.e();
                }
                this.f13414w += read;
                i14 += read;
            } catch (C0821y e10) {
                e10.f13469a = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f13408c.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw C0821y.e();
                }
                this.f13414w += read;
                i10 += read;
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() {
        int i7 = this.f13412u;
        if (this.f13410e - i7 < 4) {
            N(4);
            i7 = this.f13412u;
        }
        this.f13412u = i7 + 4;
        byte[] bArr = this.f13409d;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long I() {
        int i7 = this.f13412u;
        if (this.f13410e - i7 < 8) {
            N(8);
            i7 = this.f13412u;
        }
        this.f13412u = i7 + 8;
        byte[] bArr = this.f13409d;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int J() {
        int i7;
        int i10 = this.f13412u;
        int i11 = this.f13410e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f13409d;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f13412u = i12;
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
                this.f13412u = i13;
                return i7;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j10;
        long j11;
        long j12;
        int i7 = this.f13412u;
        int i10 = this.f13410e;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f13409d;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                this.f13412u = i11;
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
                this.f13412u = i12;
                return j;
            }
        }
        return L();
    }

    public final long L() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f13412u == this.f13410e) {
                N(1);
            }
            int i10 = this.f13412u;
            this.f13412u = i10 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((this.f13409d[i10] & 128) == 0) {
                return j;
            }
        }
        throw C0821y.c();
    }

    public final void M() {
        int i7 = this.f13410e + this.f13411f;
        this.f13410e = i7;
        int i10 = this.f13414w + i7;
        int i11 = this.f13415x;
        if (i10 <= i11) {
            this.f13411f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f13411f = i12;
        this.f13410e = i7 - i12;
    }

    public final void N(int i7) {
        if (P(i7)) {
            return;
        }
        if (i7 <= (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f13414w) - this.f13412u) {
            throw C0821y.e();
        }
        throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i7) {
        int i10 = this.f13410e;
        int i11 = this.f13412u;
        if (i7 <= i10 - i11 && i7 >= 0) {
            this.f13412u = i11 + i7;
            return;
        }
        InputStream inputStream = this.f13408c;
        if (i7 < 0) {
            throw C0821y.d();
        }
        int i12 = this.f13414w;
        int i13 = i12 + i11;
        int i14 = i13 + i7;
        int i15 = this.f13415x;
        if (i14 > i15) {
            O((i15 - i12) - i11);
            throw C0821y.e();
        }
        this.f13414w = i13;
        int i16 = i10 - i11;
        this.f13410e = 0;
        this.f13412u = 0;
        while (i16 < i7) {
            long j = i7 - i16;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i16 += (int) skip;
                    }
                } catch (C0821y e2) {
                    e2.f13469a = true;
                    throw e2;
                }
            } catch (Throwable th) {
                this.f13414w += i16;
                M();
                throw th;
            }
        }
        this.f13414w += i16;
        M();
        if (i16 >= i7) {
            return;
        }
        int i17 = this.f13410e;
        int i18 = i17 - this.f13412u;
        this.f13412u = i17;
        N(1);
        while (true) {
            int i19 = i7 - i18;
            int i20 = this.f13410e;
            if (i19 <= i20) {
                this.f13412u = i19;
                return;
            } else {
                i18 += i20;
                this.f13412u = i20;
                N(1);
            }
        }
    }

    public final boolean P(int i7) {
        int i10 = this.f13412u;
        int i11 = i10 + i7;
        int i12 = this.f13410e;
        if (i11 <= i12) {
            throw new IllegalStateException(A3.c.f(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.f13414w;
        if (i7 > (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i13) - i10 || i13 + i10 + i7 > this.f13415x) {
            return false;
        }
        byte[] bArr = this.f13409d;
        if (i10 > 0) {
            if (i12 > i10) {
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            this.f13414w += i10;
            this.f13410e -= i10;
            this.f13412u = 0;
        }
        int i14 = this.f13410e;
        int min = Math.min(bArr.length - i14, (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - this.f13414w) - i14);
        InputStream inputStream = this.f13408c;
        try {
            int read = inputStream.read(bArr, i14, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f13410e += read;
            M();
            if (this.f13410e >= i7) {
                return true;
            }
            return P(i7);
        } catch (C0821y e2) {
            e2.f13469a = true;
            throw e2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final void a(int i7) {
        if (this.f13413v != i7) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int b() {
        return this.f13414w + this.f13412u;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final boolean c() {
        return this.f13412u == this.f13410e && !P(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final void h(int i7) {
        this.f13415x = i7;
        M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int i(int i7) {
        if (i7 < 0) {
            throw C0821y.d();
        }
        int i10 = this.f13414w + this.f13412u + i7;
        if (i10 < 0) {
            throw new IOException("Failed to parse the message.");
        }
        int i11 = this.f13415x;
        if (i10 > i11) {
            throw C0821y.e();
        }
        this.f13415x = i10;
        M();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final boolean j() {
        return K() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final C0804g k() {
        int J10 = J();
        int i7 = this.f13410e;
        int i10 = this.f13412u;
        int i11 = i7 - i10;
        byte[] bArr = this.f13409d;
        if (J10 <= i11 && J10 > 0) {
            C0804g o10 = C0804g.o(i10, bArr, J10);
            this.f13412u += J10;
            return o10;
        }
        if (J10 == 0) {
            return C0804g.f13396c;
        }
        if (J10 < 0) {
            throw C0821y.d();
        }
        byte[] F10 = F(J10);
        if (F10 != null) {
            return C0804g.o(0, F10, F10.length);
        }
        int i12 = this.f13412u;
        int i13 = this.f13410e;
        int i14 = i13 - i12;
        this.f13414w += i13;
        this.f13412u = 0;
        this.f13410e = 0;
        ArrayList G9 = G(J10 - i14);
        byte[] bArr2 = new byte[J10];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        Iterator it = G9.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        C0804g c0804g = C0804g.f13396c;
        return new C0804g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final double m() {
        return Double.longBitsToDouble(I());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int n() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int o() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long p() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final float q() {
        return Float.intBitsToFloat(H());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int r() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long s() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int t() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long u() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int v() {
        int J10 = J();
        return (-(J10 & 1)) ^ (J10 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final long w() {
        long K10 = K();
        return (-(K10 & 1)) ^ (K10 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final String x() {
        int J10 = J();
        byte[] bArr = this.f13409d;
        if (J10 > 0) {
            int i7 = this.f13410e;
            int i10 = this.f13412u;
            if (J10 <= i7 - i10) {
                String str = new String(bArr, i10, J10, AbstractC0819w.f13467a);
                this.f13412u += J10;
                return str;
            }
        }
        if (J10 == 0) {
            return "";
        }
        if (J10 < 0) {
            throw C0821y.d();
        }
        if (J10 > this.f13410e) {
            return new String(E(J10), AbstractC0819w.f13467a);
        }
        N(J10);
        String str2 = new String(bArr, this.f13412u, J10, AbstractC0819w.f13467a);
        this.f13412u += J10;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final String y() {
        int J10 = J();
        int i7 = this.f13412u;
        int i10 = this.f13410e;
        int i11 = i10 - i7;
        byte[] bArr = this.f13409d;
        if (J10 <= i11 && J10 > 0) {
            this.f13412u = i7 + J10;
        } else {
            if (J10 == 0) {
                return "";
            }
            if (J10 < 0) {
                throw C0821y.d();
            }
            i7 = 0;
            if (J10 <= i10) {
                N(J10);
                this.f13412u = J10;
            } else {
                bArr = E(J10);
            }
        }
        return m0.f13436a.k(i7, bArr, J10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final int z() {
        if (c()) {
            this.f13413v = 0;
            return 0;
        }
        int J10 = J();
        this.f13413v = J10;
        if ((J10 >>> 3) != 0) {
            return J10;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }
}
