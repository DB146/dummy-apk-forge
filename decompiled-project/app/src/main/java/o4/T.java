package o4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class T extends z {

    /* renamed from: i, reason: collision with root package name */
    public int f21811i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f21812l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f21813m;

    /* renamed from: n, reason: collision with root package name */
    public int f21814n;

    /* renamed from: o, reason: collision with root package name */
    public long f21815o;

    @Override // o4.z, o4.InterfaceC1802p
    public final ByteBuffer a() {
        int i7;
        if (super.d() && (i7 = this.f21814n) > 0) {
            j(i7).put(this.f21813m, 0, this.f21814n).flip();
            this.f21814n = 0;
        }
        return super.a();
    }

    @Override // o4.z, o4.InterfaceC1802p
    public final boolean d() {
        return super.d() && this.f21814n == 0;
    }

    @Override // o4.InterfaceC1802p
    public final void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.f21812l);
        this.f21815o += min / this.f21921b.f21870d;
        this.f21812l -= min;
        byteBuffer.position(position + min);
        if (this.f21812l > 0) {
            return;
        }
        int i10 = i7 - min;
        int length = (this.f21814n + i10) - this.f21813m.length;
        ByteBuffer j = j(length);
        int i11 = n5.D.i(length, 0, this.f21814n);
        j.put(this.f21813m, 0, i11);
        int i12 = n5.D.i(length - i11, 0, i10);
        byteBuffer.limit(byteBuffer.position() + i12);
        j.put(byteBuffer);
        byteBuffer.limit(limit);
        int i13 = i10 - i12;
        int i14 = this.f21814n - i11;
        this.f21814n = i14;
        byte[] bArr = this.f21813m;
        System.arraycopy(bArr, i11, bArr, 0, i14);
        byteBuffer.get(this.f21813m, this.f21814n, i13);
        this.f21814n += i13;
        j.flip();
    }

    @Override // o4.z
    public final C1800n f(C1800n c1800n) {
        if (c1800n.f21869c != 2) {
            throw new C1801o(c1800n);
        }
        this.k = true;
        return (this.f21811i == 0 && this.j == 0) ? C1800n.f21866e : c1800n;
    }

    @Override // o4.z
    public final void g() {
        if (this.k) {
            this.k = false;
            int i7 = this.j;
            int i10 = this.f21921b.f21870d;
            this.f21813m = new byte[i7 * i10];
            this.f21812l = this.f21811i * i10;
        }
        this.f21814n = 0;
    }

    @Override // o4.z
    public final void h() {
        if (this.k) {
            if (this.f21814n > 0) {
                this.f21815o += r0 / this.f21921b.f21870d;
            }
            this.f21814n = 0;
        }
    }

    @Override // o4.z
    public final void i() {
        this.f21813m = n5.D.f21146f;
    }
}
