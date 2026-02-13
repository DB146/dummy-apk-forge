package o5;

import java.util.Collections;
import java.util.List;
import m4.C1586o0;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f21958a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21959b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21960c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21961d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21962e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21963f;
    public final String g;

    public e(List list, int i7, int i10, int i11, int i12, float f4, String str) {
        this.f21958a = list;
        this.f21959b = i7;
        this.f21960c = i10;
        this.f21961d = i11;
        this.f21962e = i12;
        this.f21963f = f4;
        this.g = str;
    }

    public static e a(n5.v vVar) {
        int i7;
        int i10;
        try {
            vVar.H(21);
            int v10 = vVar.v() & 3;
            int v11 = vVar.v();
            int i11 = vVar.f21230b;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < v11; i14++) {
                vVar.H(1);
                int A10 = vVar.A();
                for (int i15 = 0; i15 < A10; i15++) {
                    int A11 = vVar.A();
                    i13 += A11 + 4;
                    vVar.H(A11);
                }
            }
            vVar.G(i11);
            byte[] bArr = new byte[i13];
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f4 = 1.0f;
            String str = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 < v11) {
                int v12 = vVar.v() & 63;
                int A12 = vVar.A();
                int i21 = i12;
                while (i21 < A12) {
                    int A13 = vVar.A();
                    int i22 = v11;
                    System.arraycopy(AbstractC1705a.f21155d, i12, bArr, i20, 4);
                    int i23 = i20 + 4;
                    System.arraycopy(vVar.f21229a, vVar.f21230b, bArr, i23, A13);
                    if (v12 == 33 && i21 == 0) {
                        n5.p I6 = AbstractC1705a.I(i23, bArr, i23 + A13);
                        int i24 = I6.j;
                        i17 = I6.k;
                        i18 = I6.f21203l;
                        f4 = I6.f21202i;
                        i7 = v12;
                        i10 = A12;
                        i16 = i24;
                        str = AbstractC1705a.f(I6.f21195a, I6.f21196b, I6.f21197c, I6.f21198d, I6.f21199e, I6.f21200f);
                    } else {
                        i7 = v12;
                        i10 = A12;
                    }
                    i20 = i23 + A13;
                    vVar.H(A13);
                    i21++;
                    v11 = i22;
                    v12 = i7;
                    A12 = i10;
                    i12 = 0;
                }
                i19++;
                i12 = 0;
            }
            return new e(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), v10 + 1, i16, i17, i18, f4, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw C1586o0.a("Error parsing HEVC config", e2);
        }
    }
}
