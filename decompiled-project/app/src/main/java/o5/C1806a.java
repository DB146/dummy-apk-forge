package o5;

import java.util.ArrayList;
import m4.C1586o0;
import n5.AbstractC1705a;

/* renamed from: o5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1806a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21927a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21928b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21929c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21930d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21931e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21932f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final float f21933h;

    /* renamed from: i, reason: collision with root package name */
    public final String f21934i;

    public C1806a(ArrayList arrayList, int i7, int i10, int i11, int i12, int i13, int i14, float f4, String str) {
        this.f21927a = arrayList;
        this.f21928b = i7;
        this.f21929c = i10;
        this.f21930d = i11;
        this.f21931e = i12;
        this.f21932f = i13;
        this.g = i14;
        this.f21933h = f4;
        this.f21934i = str;
    }

    public static C1806a a(n5.v vVar) {
        byte[] bArr;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        float f4;
        String str;
        try {
            vVar.H(4);
            int v10 = (vVar.v() & 3) + 1;
            if (v10 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int v11 = vVar.v() & 31;
            int i14 = 0;
            while (true) {
                bArr = AbstractC1705a.f21152a;
                if (i14 >= v11) {
                    break;
                }
                int A10 = vVar.A();
                int i15 = vVar.f21230b;
                vVar.H(A10);
                byte[] bArr2 = vVar.f21229a;
                byte[] bArr3 = new byte[A10 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i15, bArr3, 4, A10);
                arrayList.add(bArr3);
                i14++;
            }
            int v12 = vVar.v();
            for (int i16 = 0; i16 < v12; i16++) {
                int A11 = vVar.A();
                int i17 = vVar.f21230b;
                vVar.H(A11);
                byte[] bArr4 = vVar.f21229a;
                byte[] bArr5 = new byte[A11 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i17, bArr5, 4, A11);
                arrayList.add(bArr5);
            }
            if (v11 > 0) {
                n5.r J10 = AbstractC1705a.J(v10, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                int i18 = J10.f21210e;
                int i19 = J10.f21211f;
                int i20 = J10.f21216n;
                int i21 = J10.f21217o;
                int i22 = J10.f21218p;
                float f10 = J10.g;
                str = AbstractC1705a.e(J10.f21206a, J10.f21207b, J10.f21208c);
                i11 = i20;
                i12 = i21;
                i13 = i22;
                f4 = f10;
                i7 = i18;
                i10 = i19;
            } else {
                i7 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                f4 = 1.0f;
                str = null;
            }
            return new C1806a(arrayList, v10, i7, i10, i11, i12, i13, f4, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw C1586o0.a("Error parsing AVC config", e2);
        }
    }
}
