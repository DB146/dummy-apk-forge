package s4;

import java.io.EOFException;
import m4.L;
import m5.InterfaceC1613j;

/* renamed from: s4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1981i implements v {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24063a = new byte[4096];

    @Override // s4.v
    public final void a(L l10) {
    }

    @Override // s4.v
    public final void c(int i7, n5.v vVar) {
        vVar.H(i7);
    }

    @Override // s4.v
    public final int d(InterfaceC1613j interfaceC1613j, int i7, boolean z8) {
        byte[] bArr = this.f24063a;
        int D10 = interfaceC1613j.D(bArr, 0, Math.min(bArr.length, i7));
        if (D10 != -1) {
            return D10;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // s4.v
    public final void e(long j, int i7, int i10, int i11, u uVar) {
    }
}
