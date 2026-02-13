package o4;

import java.nio.ByteBuffer;

/* renamed from: o4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785A extends z {

    /* renamed from: i, reason: collision with root package name */
    public int[] f21679i;
    public int[] j;

    @Override // o4.InterfaceC1802p
    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = j(((limit - position) / this.f21921b.f21870d) * this.f21922c.f21870d);
        while (position < limit) {
            for (int i7 : iArr) {
                j.putShort(byteBuffer.getShort((i7 * 2) + position));
            }
            position += this.f21921b.f21870d;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    @Override // o4.z
    public final C1800n f(C1800n c1800n) {
        int[] iArr = this.f21679i;
        if (iArr == null) {
            return C1800n.f21866e;
        }
        if (c1800n.f21869c != 2) {
            throw new C1801o(c1800n);
        }
        int length = iArr.length;
        int i7 = c1800n.f21868b;
        boolean z8 = i7 != length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= i7) {
                throw new C1801o(c1800n);
            }
            z8 |= i11 != i10;
            i10++;
        }
        return z8 ? new C1800n(c1800n.f21867a, iArr.length, 2) : C1800n.f21866e;
    }

    @Override // o4.z
    public final void g() {
        this.j = this.f21679i;
    }

    @Override // o4.z
    public final void i() {
        this.j = null;
        this.f21679i = null;
    }
}
