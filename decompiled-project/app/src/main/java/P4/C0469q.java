package P4;

import android.net.Uri;
import java.util.Map;
import m5.C1619p;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;

/* renamed from: P4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469q implements InterfaceC1616m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1616m f8124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8125b;

    /* renamed from: c, reason: collision with root package name */
    public final P f8126c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8127d;

    /* renamed from: e, reason: collision with root package name */
    public int f8128e;

    public C0469q(InterfaceC1616m interfaceC1616m, int i7, P p10) {
        AbstractC1705a.h(i7 > 0);
        this.f8124a = interfaceC1616m;
        this.f8125b = i7;
        this.f8126c = p10;
        this.f8127d = new byte[1];
        this.f8128e = i7;
    }

    @Override // m5.InterfaceC1613j
    public final int D(byte[] bArr, int i7, int i10) {
        int i11 = this.f8128e;
        InterfaceC1616m interfaceC1616m = this.f8124a;
        if (i11 == 0) {
            byte[] bArr2 = this.f8127d;
            int i12 = 0;
            if (interfaceC1616m.D(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int D10 = interfaceC1616m.D(bArr3, i12, i14);
                        if (D10 != -1) {
                            i12 += D10;
                            i14 -= D10;
                        }
                    }
                    while (i13 > 0 && bArr3[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        n5.v vVar = new n5.v(bArr3, i13);
                        P p10 = this.f8126c;
                        long max = !p10.f7906z ? p10.f7903w : Math.max(p10.f7894A.h(true), p10.f7903w);
                        int a9 = vVar.a();
                        c0 c0Var = p10.f7905y;
                        c0Var.getClass();
                        c0Var.c(a9, vVar);
                        c0Var.e(max, 1, a9, 0, null);
                        p10.f7906z = true;
                    }
                }
                this.f8128e = this.f8125b;
            }
            return -1;
        }
        int D11 = interfaceC1616m.D(bArr, i7, Math.min(this.f8128e, i10));
        if (D11 != -1) {
            this.f8128e -= D11;
        }
        return D11;
    }

    @Override // m5.InterfaceC1616m
    public final void a(m5.T t5) {
        t5.getClass();
        this.f8124a.a(t5);
    }

    @Override // m5.InterfaceC1616m
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // m5.InterfaceC1616m
    public final long d(C1619p c1619p) {
        throw new UnsupportedOperationException();
    }

    @Override // m5.InterfaceC1616m
    public final Map n() {
        return this.f8124a.n();
    }

    @Override // m5.InterfaceC1616m
    public final Uri w() {
        return this.f8124a.w();
    }
}
