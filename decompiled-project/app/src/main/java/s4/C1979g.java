package s4;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import m4.AbstractC1556J;
import m5.InterfaceC1613j;
import n5.D;

/* renamed from: s4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1979g implements InterfaceC1983k {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1613j f24053b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24054c;

    /* renamed from: d, reason: collision with root package name */
    public long f24055d;

    /* renamed from: f, reason: collision with root package name */
    public int f24057f;

    /* renamed from: u, reason: collision with root package name */
    public int f24058u;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f24056e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24052a = new byte[4096];

    static {
        AbstractC1556J.a("goog.exo.extractor");
    }

    public C1979g(InterfaceC1613j interfaceC1613j, long j, long j10) {
        this.f24053b = interfaceC1613j;
        this.f24055d = j;
        this.f24054c = j10;
    }

    @Override // s4.InterfaceC1983k
    public final long A() {
        return this.f24055d + this.f24057f;
    }

    @Override // s4.InterfaceC1983k
    public final void C(int i7) {
        b(i7, false);
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        int i11 = this.f24058u;
        int i12 = 0;
        if (i11 != 0) {
            int min = Math.min(i11, i10);
            System.arraycopy(this.f24056e, 0, bArr, i7, min);
            i(min);
            i12 = min;
        }
        if (i12 == 0) {
            i12 = g(bArr, i7, i10, 0, true);
        }
        if (i12 != -1) {
            this.f24055d += i12;
        }
        return i12;
    }

    @Override // s4.InterfaceC1983k
    public final long E() {
        return this.f24055d;
    }

    public final boolean b(int i7, boolean z8) {
        c(i7);
        int i10 = this.f24058u - this.f24057f;
        while (i10 < i7) {
            i10 = g(this.f24056e, this.f24057f, i7, i10, z8);
            if (i10 == -1) {
                return false;
            }
            this.f24058u = this.f24057f + i10;
        }
        this.f24057f += i7;
        return true;
    }

    public final void c(int i7) {
        int i10 = this.f24057f + i7;
        byte[] bArr = this.f24056e;
        if (i10 > bArr.length) {
            this.f24056e = Arrays.copyOf(this.f24056e, D.i(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    public final int f(int i7, byte[] bArr, int i10) {
        int min;
        c(i10);
        int i11 = this.f24058u;
        int i12 = this.f24057f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            min = g(this.f24056e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f24058u += min;
        } else {
            min = Math.min(i10, i13);
        }
        System.arraycopy(this.f24056e, this.f24057f, bArr, i7, min);
        this.f24057f += min;
        return min;
    }

    public final int g(byte[] bArr, int i7, int i10, int i11, boolean z8) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int D10 = this.f24053b.D(bArr, i7 + i11, i10 - i11);
        if (D10 != -1) {
            return i11 + D10;
        }
        if (i11 == 0 && z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // s4.InterfaceC1983k
    public final boolean h(byte[] bArr, int i7, int i10, boolean z8) {
        int min;
        int i11 = this.f24058u;
        if (i11 == 0) {
            min = 0;
        } else {
            min = Math.min(i11, i10);
            System.arraycopy(this.f24056e, 0, bArr, i7, min);
            i(min);
        }
        int i12 = min;
        while (i12 < i10 && i12 != -1) {
            i12 = g(bArr, i7, i10, i12, z8);
        }
        if (i12 != -1) {
            this.f24055d += i12;
        }
        return i12 != -1;
    }

    public final void i(int i7) {
        int i10 = this.f24058u - i7;
        this.f24058u = i10;
        this.f24057f = 0;
        byte[] bArr = this.f24056e;
        byte[] bArr2 = i10 < bArr.length - 524288 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i10);
        this.f24056e = bArr2;
    }

    @Override // s4.InterfaceC1983k
    public final long k() {
        return this.f24054c;
    }

    @Override // s4.InterfaceC1983k
    public final void m(int i7, byte[] bArr, int i10) {
        x(bArr, i7, i10, false);
    }

    @Override // s4.InterfaceC1983k
    public final void q() {
        this.f24057f = 0;
    }

    @Override // s4.InterfaceC1983k
    public final void r(int i7) {
        int min = Math.min(this.f24058u, i7);
        i(min);
        int i10 = min;
        while (i10 < i7 && i10 != -1) {
            byte[] bArr = this.f24052a;
            i10 = g(bArr, -i10, Math.min(i7, bArr.length + i10), i10, false);
        }
        if (i10 != -1) {
            this.f24055d += i10;
        }
    }

    @Override // s4.InterfaceC1983k
    public final void readFully(byte[] bArr, int i7, int i10) {
        h(bArr, i7, i10, false);
    }

    @Override // s4.InterfaceC1983k
    public final boolean x(byte[] bArr, int i7, int i10, boolean z8) {
        if (!b(i10, z8)) {
            return false;
        }
        System.arraycopy(this.f24056e, this.f24057f - i10, bArr, i7, i10);
        return true;
    }
}
