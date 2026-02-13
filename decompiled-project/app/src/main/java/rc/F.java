package rc;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class F extends C1967k {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f23940e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f23941f;

    public F(byte[][] bArr, int[] iArr) {
        super(C1967k.f23967d.f23968a);
        this.f23940e = bArr;
        this.f23941f = iArr;
    }

    @Override // rc.C1967k
    public final C1967k B(int i7, int i10) {
        if (i10 == -1234567890) {
            i10 = f();
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(A3.c.f(i7, "beginIndex=", " < 0").toString());
        }
        if (i10 > f()) {
            StringBuilder r10 = h3.o.r(i10, "endIndex=", " > length(");
            r10.append(f());
            r10.append(')');
            throw new IllegalArgumentException(r10.toString().toString());
        }
        int i11 = i10 - i7;
        if (i11 < 0) {
            throw new IllegalArgumentException(X.c.e(i10, i7, "endIndex=", " < beginIndex=").toString());
        }
        if (i7 == 0 && i10 == f()) {
            return this;
        }
        if (i7 == i10) {
            return C1967k.f23967d;
        }
        int g = sc.b.g(this, i7);
        int g2 = sc.b.g(this, i10 - 1);
        byte[][] bArr = this.f23940e;
        byte[][] bArr2 = (byte[][]) Eb.n.T(bArr, g, g2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f23941f;
        if (g <= g2) {
            int i12 = g;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(iArr2[i12] - i7, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr2.length] = iArr2[bArr.length + i12];
                if (i12 == g2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = g != 0 ? iArr2[g - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i7 - i15) + iArr[length];
        return new F(bArr2, iArr);
    }

    @Override // rc.C1967k
    public final C1967k D() {
        return H().D();
    }

    @Override // rc.C1967k
    public final void F(C1964h buffer, int i7) {
        kotlin.jvm.internal.l.e(buffer, "buffer");
        int g = sc.b.g(this, 0);
        int i10 = 0;
        while (i10 < i7) {
            int[] iArr = this.f23941f;
            int i11 = g == 0 ? 0 : iArr[g - 1];
            int i12 = iArr[g] - i11;
            byte[][] bArr = this.f23940e;
            int i13 = iArr[bArr.length + g];
            int min = Math.min(i7, i12 + i11) - i10;
            int i14 = (i10 - i11) + i13;
            D d10 = new D(bArr[g], i14, i14 + min, true, false);
            D d11 = buffer.f23965a;
            if (d11 == null) {
                d10.g = d10;
                d10.f23936f = d10;
                buffer.f23965a = d10;
            } else {
                D d12 = d11.g;
                kotlin.jvm.internal.l.b(d12);
                d12.b(d10);
            }
            i10 += min;
            g++;
        }
        buffer.f23966b += i7;
    }

    public final byte[] G() {
        byte[] bArr = new byte[f()];
        byte[][] bArr2 = this.f23940e;
        int length = bArr2.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < length) {
            int[] iArr = this.f23941f;
            int i12 = iArr[length + i7];
            int i13 = iArr[i7];
            int i14 = i13 - i10;
            Eb.n.N(bArr2[i7], i11, bArr, i12, i12 + i14);
            i11 += i14;
            i7++;
            i10 = i13;
        }
        return bArr;
    }

    public final C1967k H() {
        return new C1967k(G());
    }

    @Override // rc.C1967k
    public final String a() {
        throw null;
    }

    @Override // rc.C1967k
    public final C1967k d(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f23940e;
        int length = bArr.length;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            int[] iArr = this.f23941f;
            int i11 = iArr[length + i7];
            int i12 = iArr[i7];
            messageDigest.update(bArr[i7], i11, i12 - i10);
            i7++;
            i10 = i12;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l.b(digest);
        return new C1967k(digest);
    }

    @Override // rc.C1967k
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1967k) {
            C1967k c1967k = (C1967k) obj;
            if (c1967k.f() == f() && v(0, c1967k, f())) {
                return true;
            }
        }
        return false;
    }

    @Override // rc.C1967k
    public final int f() {
        return this.f23941f[this.f23940e.length - 1];
    }

    @Override // rc.C1967k
    public final String g() {
        return H().g();
    }

    @Override // rc.C1967k
    public final int hashCode() {
        int i7 = this.f23969b;
        if (i7 != 0) {
            return i7;
        }
        byte[][] bArr = this.f23940e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f23941f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f23969b = i11;
        return i11;
    }

    @Override // rc.C1967k
    public final int i(int i7, byte[] other) {
        kotlin.jvm.internal.l.e(other, "other");
        return H().i(i7, other);
    }

    @Override // rc.C1967k
    public final byte[] o() {
        return G();
    }

    @Override // rc.C1967k
    public final byte r(int i7) {
        byte[][] bArr = this.f23940e;
        int length = bArr.length - 1;
        int[] iArr = this.f23941f;
        AbstractC1958b.e(iArr[length], i7, 1L);
        int g = sc.b.g(this, i7);
        return bArr[g][(i7 - (g == 0 ? 0 : iArr[g - 1])) + iArr[bArr.length + g]];
    }

    @Override // rc.C1967k
    public final int t(byte[] other) {
        kotlin.jvm.internal.l.e(other, "other");
        return H().t(other);
    }

    @Override // rc.C1967k
    public final String toString() {
        return H().toString();
    }

    @Override // rc.C1967k
    public final boolean v(int i7, C1967k other, int i10) {
        kotlin.jvm.internal.l.e(other, "other");
        if (i7 < 0 || i7 > f() - i10) {
            return false;
        }
        int i11 = i10 + i7;
        int g = sc.b.g(this, i7);
        int i12 = 0;
        while (i7 < i11) {
            int[] iArr = this.f23941f;
            int i13 = g == 0 ? 0 : iArr[g - 1];
            int i14 = iArr[g] - i13;
            byte[][] bArr = this.f23940e;
            int i15 = iArr[bArr.length + g];
            int min = Math.min(i11, i14 + i13) - i7;
            if (!other.y(i12, bArr[g], (i7 - i13) + i15, min)) {
                return false;
            }
            i12 += min;
            i7 += min;
            g++;
        }
        return true;
    }

    @Override // rc.C1967k
    public final boolean y(int i7, byte[] other, int i10, int i11) {
        kotlin.jvm.internal.l.e(other, "other");
        if (i7 < 0 || i7 > f() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i7;
        int g = sc.b.g(this, i7);
        while (i7 < i12) {
            int[] iArr = this.f23941f;
            int i13 = g == 0 ? 0 : iArr[g - 1];
            int i14 = iArr[g] - i13;
            byte[][] bArr = this.f23940e;
            int i15 = iArr[bArr.length + g];
            int min = Math.min(i12, i14 + i13) - i7;
            if (!AbstractC1958b.a(bArr[g], (i7 - i13) + i15, other, i10, min)) {
                return false;
            }
            i10 += min;
            i7 += min;
            g++;
        }
        return true;
    }

    @Override // rc.C1967k
    public final String z(Charset charset) {
        kotlin.jvm.internal.l.e(charset, "charset");
        return H().z(charset);
    }
}
