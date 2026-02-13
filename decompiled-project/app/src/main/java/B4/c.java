package B4;

import ea.C1112g;
import java.util.Arrays;
import m4.L;
import n5.v;
import s4.C1987o;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: n, reason: collision with root package name */
    public C1987o f2058n;

    /* renamed from: o, reason: collision with root package name */
    public A4.e f2059o;

    @Override // B4.i
    public final long b(v vVar) {
        byte[] bArr = vVar.f21229a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i7 = (bArr[2] & 255) >> 4;
        if (i7 == 6 || i7 == 7) {
            vVar.H(4);
            vVar.B();
        }
        int G9 = tc.b.G(i7, vVar);
        vVar.G(0);
        return G9;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [A4.e, java.lang.Object] */
    @Override // B4.i
    public final boolean c(v vVar, long j, q3.c cVar) {
        byte[] bArr = vVar.f21229a;
        C1987o c1987o = this.f2058n;
        if (c1987o == null) {
            C1987o c1987o2 = new C1987o(bArr, 17);
            this.f2058n = c1987o2;
            cVar.f23371b = c1987o2.c(Arrays.copyOfRange(bArr, 9, vVar.f21231c), null);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & Byte.MAX_VALUE) != 3) {
            if (b2 != -1) {
                return true;
            }
            A4.e eVar = this.f2059o;
            if (eVar != null) {
                eVar.f377a = j;
                cVar.f23372c = eVar;
            }
            ((L) cVar.f23371b).getClass();
            return false;
        }
        C1112g H10 = vc.i.H(vVar);
        C1987o c1987o3 = new C1987o(c1987o.f24068a, c1987o.f24069b, c1987o.f24070c, c1987o.f24071d, c1987o.f24072e, c1987o.g, c1987o.f24074h, c1987o.j, H10, c1987o.f24076l);
        this.f2058n = c1987o3;
        ?? obj = new Object();
        obj.f379c = c1987o3;
        obj.f380d = H10;
        obj.f377a = -1L;
        obj.f378b = -1L;
        this.f2059o = obj;
        return true;
    }

    @Override // B4.i
    public final void d(boolean z8) {
        super.d(z8);
        if (z8) {
            this.f2058n = null;
            this.f2059o = null;
        }
    }
}
