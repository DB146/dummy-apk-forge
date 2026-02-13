package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016j extends P {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f15787e = Logger.getLogger(C1016j.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f15788f = l0.f15801f;

    /* renamed from: a, reason: collision with root package name */
    public C1018l f15789a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f15790b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15791c;

    /* renamed from: d, reason: collision with root package name */
    public int f15792d;

    public C1016j(byte[] bArr, int i7) {
        if (((bArr.length - i7) | i7) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i7)));
        }
        this.f15790b = bArr;
        this.f15792d = 0;
        this.f15791c = i7;
    }

    public static int X(int i7) {
        return p0(i7) + 1;
    }

    public static int Y(int i7, AbstractC1014h abstractC1014h) {
        return Z(abstractC1014h) + p0(i7);
    }

    public static int Z(AbstractC1014h abstractC1014h) {
        int size = abstractC1014h.size();
        return r0(size) + size;
    }

    public static int a0(int i7) {
        return p0(i7) + 8;
    }

    public static int b0(int i7, int i10) {
        return h0(i10) + p0(i7);
    }

    public static int c0(int i7) {
        return p0(i7) + 4;
    }

    public static int d0(int i7) {
        return p0(i7) + 8;
    }

    public static int e0(int i7) {
        return p0(i7) + 4;
    }

    public static int f0(int i7, AbstractC1007a abstractC1007a, a0 a0Var) {
        int p02 = p0(i7) * 2;
        abstractC1007a.getClass();
        AbstractC1028w abstractC1028w = (AbstractC1028w) abstractC1007a;
        int i10 = abstractC1028w.memoizedSerializedSize;
        if (i10 == -1) {
            i10 = a0Var.d(abstractC1007a);
            abstractC1028w.memoizedSerializedSize = i10;
        }
        return i10 + p02;
    }

    public static int g0(int i7, int i10) {
        return h0(i10) + p0(i7);
    }

    public static int h0(int i7) {
        if (i7 >= 0) {
            return r0(i7);
        }
        return 10;
    }

    public static int i0(int i7, long j) {
        return t0(j) + p0(i7);
    }

    public static int j0(int i7) {
        return p0(i7) + 4;
    }

    public static int k0(int i7) {
        return p0(i7) + 8;
    }

    public static int l0(int i7, int i10) {
        return r0((i10 >> 31) ^ (i10 << 1)) + p0(i7);
    }

    public static int m0(int i7, long j) {
        return t0((j >> 63) ^ (j << 1)) + p0(i7);
    }

    public static int n0(int i7, String str) {
        return o0(str) + p0(i7);
    }

    public static int o0(String str) {
        int length;
        try {
            length = o0.b(str);
        } catch (n0 unused) {
            length = str.getBytes(A.f15705a).length;
        }
        return r0(length) + length;
    }

    public static int p0(int i7) {
        return r0(i7 << 3);
    }

    public static int q0(int i7, int i10) {
        return r0(i10) + p0(i7);
    }

    public static int r0(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int s0(int i7, long j) {
        return t0(j) + p0(i7);
    }

    public static int t0(long j) {
        int i7;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j) != 0) {
            i7 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public final void A0(int i7) {
        if (i7 >= 0) {
            C0(i7);
        } else {
            E0(i7);
        }
    }

    public final void B0(int i7, int i10) {
        C0((i7 << 3) | i10);
    }

    public final void C0(int i7) {
        byte[] bArr = this.f15790b;
        boolean z8 = f15788f;
        int i10 = this.f15791c;
        if (z8 && !AbstractC1009c.a()) {
            int i11 = this.f15792d;
            if (i10 - i11 >= 5) {
                if ((i7 & (-128)) == 0) {
                    this.f15792d = i11 + 1;
                    l0.n(bArr, i11, (byte) i7);
                    return;
                }
                this.f15792d = i11 + 1;
                l0.n(bArr, i11, (byte) (i7 | 128));
                int i12 = i7 >>> 7;
                if ((i12 & (-128)) == 0) {
                    int i13 = this.f15792d;
                    this.f15792d = i13 + 1;
                    l0.n(bArr, i13, (byte) i12);
                    return;
                }
                int i14 = this.f15792d;
                this.f15792d = i14 + 1;
                l0.n(bArr, i14, (byte) (i12 | 128));
                int i15 = i7 >>> 14;
                if ((i15 & (-128)) == 0) {
                    int i16 = this.f15792d;
                    this.f15792d = i16 + 1;
                    l0.n(bArr, i16, (byte) i15);
                    return;
                }
                int i17 = this.f15792d;
                this.f15792d = i17 + 1;
                l0.n(bArr, i17, (byte) (i15 | 128));
                int i18 = i7 >>> 21;
                if ((i18 & (-128)) == 0) {
                    int i19 = this.f15792d;
                    this.f15792d = i19 + 1;
                    l0.n(bArr, i19, (byte) i18);
                    return;
                } else {
                    int i20 = this.f15792d;
                    this.f15792d = i20 + 1;
                    l0.n(bArr, i20, (byte) (i18 | 128));
                    int i21 = this.f15792d;
                    this.f15792d = i21 + 1;
                    l0.n(bArr, i21, (byte) (i7 >>> 28));
                    return;
                }
            }
        }
        while ((i7 & (-128)) != 0) {
            try {
                int i22 = this.f15792d;
                this.f15792d = i22 + 1;
                bArr[i22] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new C1017k(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15792d), Integer.valueOf(i10), 1), e2);
            }
        }
        int i23 = this.f15792d;
        this.f15792d = i23 + 1;
        bArr[i23] = (byte) i7;
    }

    public final void D0(int i7, long j) {
        B0(i7, 0);
        E0(j);
    }

    public final void E0(long j) {
        byte[] bArr = this.f15790b;
        boolean z8 = f15788f;
        int i7 = this.f15791c;
        if (z8 && i7 - this.f15792d >= 10) {
            while ((j & (-128)) != 0) {
                int i10 = this.f15792d;
                this.f15792d = i10 + 1;
                l0.n(bArr, i10, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i11 = this.f15792d;
            this.f15792d = i11 + 1;
            l0.n(bArr, i11, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i12 = this.f15792d;
                this.f15792d = i12 + 1;
                bArr[i12] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new C1017k(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15792d), Integer.valueOf(i7), 1), e2);
            }
        }
        int i13 = this.f15792d;
        this.f15792d = i13 + 1;
        bArr[i13] = (byte) j;
    }

    public final void u0(byte b2) {
        try {
            byte[] bArr = this.f15790b;
            int i7 = this.f15792d;
            this.f15792d = i7 + 1;
            bArr[i7] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new C1017k(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15792d), Integer.valueOf(this.f15791c), 1), e2);
        }
    }

    public final void v0(byte[] bArr, int i7, int i10) {
        try {
            System.arraycopy(bArr, i7, this.f15790b, this.f15792d, i10);
            this.f15792d += i10;
        } catch (IndexOutOfBoundsException e2) {
            throw new C1017k(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15792d), Integer.valueOf(this.f15791c), Integer.valueOf(i10)), e2);
        }
    }

    public final void w0(int i7, int i10) {
        B0(i7, 5);
        x0(i10);
    }

    public final void x0(int i7) {
        try {
            byte[] bArr = this.f15790b;
            int i10 = this.f15792d;
            int i11 = i10 + 1;
            this.f15792d = i11;
            bArr[i10] = (byte) (i7 & 255);
            int i12 = i10 + 2;
            this.f15792d = i12;
            bArr[i11] = (byte) ((i7 >> 8) & 255);
            int i13 = i10 + 3;
            this.f15792d = i13;
            bArr[i12] = (byte) ((i7 >> 16) & 255);
            this.f15792d = i10 + 4;
            bArr[i13] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new C1017k(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15792d), Integer.valueOf(this.f15791c), 1), e2);
        }
    }

    public final void y0(int i7, long j) {
        B0(i7, 1);
        z0(j);
    }

    public final void z0(long j) {
        try {
            byte[] bArr = this.f15790b;
            int i7 = this.f15792d;
            int i10 = i7 + 1;
            this.f15792d = i10;
            bArr[i7] = (byte) (((int) j) & 255);
            int i11 = i7 + 2;
            this.f15792d = i11;
            bArr[i10] = (byte) (((int) (j >> 8)) & 255);
            int i12 = i7 + 3;
            this.f15792d = i12;
            bArr[i11] = (byte) (((int) (j >> 16)) & 255);
            int i13 = i7 + 4;
            this.f15792d = i13;
            bArr[i12] = (byte) (((int) (j >> 24)) & 255);
            int i14 = i7 + 5;
            this.f15792d = i14;
            bArr[i13] = (byte) (((int) (j >> 32)) & 255);
            int i15 = i7 + 6;
            this.f15792d = i15;
            bArr[i14] = (byte) (((int) (j >> 40)) & 255);
            int i16 = i7 + 7;
            this.f15792d = i16;
            bArr[i15] = (byte) (((int) (j >> 48)) & 255);
            this.f15792d = i7 + 8;
            bArr[i16] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new C1017k(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15792d), Integer.valueOf(this.f15791c), 1), e2);
        }
    }
}
