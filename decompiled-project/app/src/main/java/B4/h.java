package B4;

import N6.H;
import java.util.ArrayList;
import java.util.Arrays;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import n5.v;
import o4.AbstractC1787a;
import y7.u0;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f2074o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f2075p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f2076n;

    public static boolean e(v vVar, byte[] bArr) {
        if (vVar.a() < bArr.length) {
            return false;
        }
        int i7 = vVar.f21230b;
        byte[] bArr2 = new byte[bArr.length];
        vVar.f(0, bArr2, bArr.length);
        vVar.G(i7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // B4.i
    public final long b(v vVar) {
        byte[] bArr = vVar.f21229a;
        return (this.f2084i * AbstractC1787a.g(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // B4.i
    public final boolean c(v vVar, long j, q3.c cVar) {
        if (e(vVar, f2074o)) {
            byte[] copyOf = Arrays.copyOf(vVar.f21229a, vVar.f21231c);
            int i7 = copyOf[9] & 255;
            ArrayList c10 = AbstractC1787a.c(copyOf);
            if (((L) cVar.f23371b) != null) {
                return true;
            }
            K k = new K();
            k.k = "audio/opus";
            k.f19996x = i7;
            k.f19997y = 48000;
            k.f19985m = c10;
            cVar.f23371b = new L(k);
            return true;
        }
        if (!e(vVar, f2075p)) {
            AbstractC1705a.n((L) cVar.f23371b);
            return false;
        }
        AbstractC1705a.n((L) cVar.f23371b);
        if (this.f2076n) {
            return true;
        }
        this.f2076n = true;
        vVar.H(8);
        F4.c D10 = u0.D(H.G((String[]) u0.F(vVar, false, false).f18487b));
        if (D10 == null) {
            return true;
        }
        K a9 = ((L) cVar.f23371b).a();
        F4.c cVar2 = ((L) cVar.f23371b).f20094x;
        if (cVar2 != null) {
            D10 = D10.a(cVar2.f4071a);
        }
        a9.f19983i = D10;
        cVar.f23371b = new L(a9);
        return true;
    }

    @Override // B4.i
    public final void d(boolean z8) {
        super.d(z8);
        if (z8) {
            this.f2076n = false;
        }
    }
}
