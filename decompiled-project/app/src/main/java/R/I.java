package R;

import H2.C0305t;
import Q.C0;
import Q.InterfaceC0482c;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class I extends vc.i {
    public int g;

    /* renamed from: i, reason: collision with root package name */
    public int f8744i;
    public int k;

    /* renamed from: f, reason: collision with root package name */
    public P8.h[] f8742f = new P8.h[16];

    /* renamed from: h, reason: collision with root package name */
    public int[] f8743h = new int[16];
    public Object[] j = new Object[16];

    public final void J() {
        this.g = 0;
        this.f8744i = 0;
        Arrays.fill(this.j, 0, this.k, (Object) null);
        this.k = 0;
    }

    public final void K(InterfaceC0482c interfaceC0482c, C0 c02, Y.k kVar) {
        int i7;
        int i10;
        if (M()) {
            C0305t c0305t = new C0305t(this);
            do {
                I i11 = (I) c0305t.f4829e;
                i11.f8742f[c0305t.f4826b].c(c0305t, interfaceC0482c, c02, kVar);
                int i12 = c0305t.f4826b;
                i7 = i11.g;
                if (i12 >= i7) {
                    break;
                }
                P8.h hVar = i11.f8742f[i12];
                c0305t.f4827c += hVar.f8219b;
                c0305t.f4828d += hVar.f8220c;
                i10 = i12 + 1;
                c0305t.f4826b = i10;
            } while (i10 < i7);
        }
        J();
    }

    public final boolean L() {
        return this.g == 0;
    }

    public final boolean M() {
        return this.g != 0;
    }

    public final void N(P8.h hVar) {
        int i7 = this.g;
        P8.h[] hVarArr = this.f8742f;
        if (i7 == hVarArr.length) {
            P8.h[] hVarArr2 = new P8.h[(i7 > 1024 ? 1024 : i7) + i7];
            System.arraycopy(hVarArr, 0, hVarArr2, 0, i7);
            this.f8742f = hVarArr2;
        }
        int i10 = this.f8744i + hVar.f8219b;
        int[] iArr = this.f8743h;
        int length = iArr.length;
        if (i10 > length) {
            int i11 = (length > 1024 ? 1024 : length) + length;
            if (i11 >= i10) {
                i10 = i11;
            }
            int[] iArr2 = new int[i10];
            Eb.n.M(0, 0, length, iArr, iArr2);
            this.f8743h = iArr2;
        }
        int i12 = this.k;
        int i13 = hVar.f8220c;
        int i14 = i12 + i13;
        Object[] objArr = this.j;
        int length2 = objArr.length;
        if (i14 > length2) {
            int i15 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i15 >= i14) {
                i14 = i15;
            }
            Object[] objArr2 = new Object[i14];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.j = objArr2;
        }
        P8.h[] hVarArr3 = this.f8742f;
        int i16 = this.g;
        this.g = i16 + 1;
        hVarArr3[i16] = hVar;
        this.f8744i += hVar.f8219b;
        this.k += i13;
    }
}
