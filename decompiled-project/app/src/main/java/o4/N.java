package o4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class N extends z {

    /* renamed from: i, reason: collision with root package name */
    public final long f21769i = 150000;
    public final long j = 20000;
    public final short k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f21770l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21771m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f21772n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f21773o;

    /* renamed from: p, reason: collision with root package name */
    public int f21774p;

    /* renamed from: q, reason: collision with root package name */
    public int f21775q;

    /* renamed from: r, reason: collision with root package name */
    public int f21776r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21777s;

    /* renamed from: t, reason: collision with root package name */
    public long f21778t;

    public N() {
        byte[] bArr = n5.D.f21146f;
        this.f21772n = bArr;
        this.f21773o = bArr;
    }

    @Override // o4.InterfaceC1802p
    public final void e(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i7 = this.f21774p;
            if (i7 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f21772n.length));
                int limit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > this.k) {
                            int i10 = this.f21770l;
                            position = ((limit2 / i10) * i10) + i10;
                            break;
                        }
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f21774p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f21777s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i7 == 1) {
                int limit3 = byteBuffer.limit();
                int k = k(byteBuffer);
                int position2 = k - byteBuffer.position();
                byte[] bArr = this.f21772n;
                int length = bArr.length;
                int i11 = this.f21775q;
                int i12 = length - i11;
                if (k >= limit3 || position2 >= i12) {
                    int min = Math.min(position2, i12);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f21772n, this.f21775q, min);
                    int i13 = this.f21775q + min;
                    this.f21775q = i13;
                    byte[] bArr2 = this.f21772n;
                    if (i13 == bArr2.length) {
                        if (this.f21777s) {
                            l(this.f21776r, bArr2);
                            this.f21778t += (this.f21775q - (this.f21776r * 2)) / this.f21770l;
                        } else {
                            this.f21778t += (i13 - this.f21776r) / this.f21770l;
                        }
                        m(byteBuffer, this.f21772n, this.f21775q);
                        this.f21775q = 0;
                        this.f21774p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    l(i11, bArr);
                    this.f21775q = 0;
                    this.f21774p = 0;
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                int limit4 = byteBuffer.limit();
                int k7 = k(byteBuffer);
                byteBuffer.limit(k7);
                this.f21778t += byteBuffer.remaining() / this.f21770l;
                m(byteBuffer, this.f21773o, this.f21776r);
                if (k7 < limit4) {
                    l(this.f21776r, this.f21773o);
                    this.f21774p = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // o4.z
    public final C1800n f(C1800n c1800n) {
        if (c1800n.f21869c == 2) {
            return this.f21771m ? c1800n : C1800n.f21866e;
        }
        throw new C1801o(c1800n);
    }

    @Override // o4.z
    public final void g() {
        if (this.f21771m) {
            C1800n c1800n = this.f21921b;
            int i7 = c1800n.f21870d;
            this.f21770l = i7;
            int i10 = c1800n.f21867a;
            int i11 = ((int) ((this.f21769i * i10) / 1000000)) * i7;
            if (this.f21772n.length != i11) {
                this.f21772n = new byte[i11];
            }
            int i12 = ((int) ((this.j * i10) / 1000000)) * i7;
            this.f21776r = i12;
            if (this.f21773o.length != i12) {
                this.f21773o = new byte[i12];
            }
        }
        this.f21774p = 0;
        this.f21778t = 0L;
        this.f21775q = 0;
        this.f21777s = false;
    }

    @Override // o4.z
    public final void h() {
        int i7 = this.f21775q;
        if (i7 > 0) {
            l(i7, this.f21772n);
        }
        if (this.f21777s) {
            return;
        }
        this.f21778t += this.f21776r / this.f21770l;
    }

    @Override // o4.z
    public final void i() {
        this.f21771m = false;
        this.f21776r = 0;
        byte[] bArr = n5.D.f21146f;
        this.f21772n = bArr;
        this.f21773o = bArr;
    }

    @Override // o4.z, o4.InterfaceC1802p
    public final boolean isActive() {
        return this.f21771m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.k) {
                int i7 = this.f21770l;
                return (position / i7) * i7;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i7, byte[] bArr) {
        j(i7).put(bArr, 0, i7).flip();
        if (i7 > 0) {
            this.f21777s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i7) {
        int min = Math.min(byteBuffer.remaining(), this.f21776r);
        int i10 = this.f21776r - min;
        System.arraycopy(bArr, i7 - i10, this.f21773o, 0, i10);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f21773o, i10, min);
    }
}
