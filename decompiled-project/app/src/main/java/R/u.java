package R;

import H2.C0305t;
import Q.AbstractC0508p;
import Q.B0;
import Q.C0;
import Q.C0478a;
import Q.InterfaceC0482c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u extends P8.h {

    /* renamed from: d, reason: collision with root package name */
    public static final u f8776d = new P8.h(1, 0, 2);

    @Override // P8.h
    public final void c(C0305t c0305t, InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        C0478a c0478a;
        int c10;
        int d10 = c0305t.d(0);
        if (c02.f8287n != 0) {
            AbstractC0508p.c("Cannot move a group while inserting");
        }
        if (!(d10 >= 0)) {
            AbstractC0508p.c("Parameter offset is out of bounds");
        }
        if (d10 == 0) {
            return;
        }
        int i7 = c02.f8293t;
        int i10 = c02.f8295v;
        int i11 = c02.f8294u;
        int i12 = i7;
        while (d10 > 0) {
            i12 += c02.f8278b[(c02.q(i12) * 5) + 3];
            if (i12 > i11) {
                AbstractC0508p.c("Parameter offset is out of bounds");
            }
            d10--;
        }
        int i13 = c02.f8278b[(c02.q(i12) * 5) + 3];
        int f4 = c02.f(c02.f8278b, c02.q(c02.f8293t));
        int f10 = c02.f(c02.f8278b, c02.q(i12));
        int i14 = i12 + i13;
        int f11 = c02.f(c02.f8278b, c02.q(i14));
        int i15 = f11 - f10;
        c02.v(i15, Math.max(c02.f8293t - 1, 0));
        c02.u(i13);
        int[] iArr = c02.f8278b;
        int q10 = c02.q(i14) * 5;
        Eb.n.M(c02.q(i7) * 5, q10, (i13 * 5) + q10, iArr, iArr);
        if (i15 > 0) {
            Object[] objArr = c02.f8279c;
            int g = c02.g(f10 + i15);
            System.arraycopy(objArr, g, objArr, f4, c02.g(f11 + i15) - g);
        }
        int i16 = f10 + i15;
        int i17 = i16 - f4;
        int i18 = c02.k;
        int i19 = c02.f8285l;
        int length = c02.f8279c.length;
        int i20 = c02.f8286m;
        int i21 = i7 + i13;
        int i22 = i7;
        while (i22 < i21) {
            int q11 = c02.q(i22);
            int i23 = i18;
            int i24 = i17;
            iArr[(q11 * 5) + 4] = C0.h(C0.h(c02.f(iArr, q11) - i17, i20 < q11 ? 0 : i23, i19, length), c02.k, c02.f8285l, c02.f8279c.length);
            i22++;
            i18 = i23;
            i17 = i24;
            i19 = i19;
            length = length;
        }
        int i25 = i14 + i13;
        int n6 = c02.n();
        int b2 = B0.b(c02.f8280d, i14, n6);
        ArrayList arrayList = new ArrayList();
        if (b2 >= 0) {
            while (b2 < c02.f8280d.size() && (c10 = c02.c((c0478a = (C0478a) c02.f8280d.get(b2)))) >= i14 && c10 < i25) {
                arrayList.add(c0478a);
                c02.f8280d.remove(b2);
            }
        }
        int i26 = i7 - i14;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            C0478a c0478a2 = (C0478a) arrayList.get(i27);
            int c11 = c02.c(c0478a2) + i26;
            if (c11 >= c02.g) {
                c0478a2.f8373a = -(n6 - c11);
            } else {
                c0478a2.f8373a = c11;
            }
            c02.f8280d.add(B0.b(c02.f8280d, c11, n6), c0478a2);
        }
        if (c02.G(i14, i13)) {
            AbstractC0508p.c("Unexpectedly removed anchors");
        }
        c02.l(i10, c02.f8294u, i7);
        if (i15 > 0) {
            c02.H(i16, i15, i14 - 1);
        }
    }
}
