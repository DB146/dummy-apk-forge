package d5;

import a5.C0776b;
import a5.f;
import a5.g;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;
import n5.D;
import n5.v;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051b extends f {

    /* renamed from: A, reason: collision with root package name */
    public final v f16526A = new v();

    /* renamed from: B, reason: collision with root package name */
    public final v f16527B = new v();

    /* renamed from: C, reason: collision with root package name */
    public final C1050a f16528C = new C1050a();

    /* renamed from: D, reason: collision with root package name */
    public Inflater f16529D;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a5.g, d5.c, java.lang.Object] */
    @Override // a5.f
    public final g b(int i7, boolean z8, byte[] bArr) {
        v vVar;
        boolean z10;
        C0776b c0776b;
        int i10;
        int i11;
        v vVar2;
        int x2;
        int i12;
        v vVar3 = this.f16526A;
        vVar3.E(i7, bArr);
        if (vVar3.a() > 0 && vVar3.e() == 120) {
            if (this.f16529D == null) {
                this.f16529D = new Inflater();
            }
            Inflater inflater = this.f16529D;
            v vVar4 = this.f16527B;
            if (D.I(vVar3, vVar4, inflater)) {
                vVar3.E(vVar4.f21231c, vVar4.f21229a);
            }
        }
        C1050a c1050a = this.f16528C;
        int i13 = 0;
        c1050a.f16521d = 0;
        c1050a.f16522e = 0;
        c1050a.f16523f = 0;
        c1050a.g = 0;
        c1050a.f16524h = 0;
        c1050a.f16525i = 0;
        v vVar5 = c1050a.f16518a;
        vVar5.D(0);
        c1050a.f16520c = false;
        ArrayList arrayList = new ArrayList();
        while (vVar3.a() >= 3) {
            int i14 = vVar3.f21231c;
            int v10 = vVar3.v();
            int A10 = vVar3.A();
            int i15 = vVar3.f21230b + A10;
            if (i15 > i14) {
                vVar3.G(i14);
                c0776b = null;
                v vVar6 = vVar5;
                i12 = i13;
                vVar = vVar6;
            } else {
                int i16 = 128;
                int[] iArr = c1050a.f16519b;
                if (v10 != 128) {
                    switch (v10) {
                        case 20:
                            if (A10 % 5 == 2) {
                                vVar3.H(2);
                                Arrays.fill(iArr, i13);
                                int i17 = A10 / 5;
                                int i18 = i13;
                                while (i18 < i17) {
                                    int v11 = vVar3.v();
                                    double v12 = vVar3.v();
                                    int[] iArr2 = iArr;
                                    double v13 = vVar3.v() - i16;
                                    double v14 = vVar3.v() - 128;
                                    iArr2[v11] = (D.i((int) ((1.402d * v13) + v12), 0, 255) << 16) | (vVar3.v() << 24) | (D.i((int) ((v12 - (0.34414d * v14)) - (v13 * 0.71414d)), 0, 255) << 8) | D.i((int) ((v14 * 1.772d) + v12), 0, 255);
                                    i18++;
                                    iArr = iArr2;
                                    vVar5 = vVar5;
                                    i16 = 128;
                                }
                                vVar2 = vVar5;
                                c1050a.f16520c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (A10 >= 4) {
                                vVar3.H(3);
                                int i19 = A10 - 4;
                                if (((128 & vVar3.v()) != 0 ? 1 : i13) != 0) {
                                    if (i19 >= 7 && (x2 = vVar3.x()) >= 4) {
                                        c1050a.f16524h = vVar3.A();
                                        c1050a.f16525i = vVar3.A();
                                        vVar5.D(x2 - 4);
                                        i19 = A10 - 11;
                                    }
                                }
                                int i20 = vVar5.f21230b;
                                int i21 = vVar5.f21231c;
                                if (i20 < i21 && i19 > 0) {
                                    int min = Math.min(i19, i21 - i20);
                                    vVar3.f(i20, vVar5.f21229a, min);
                                    vVar5.G(i20 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (A10 >= 19) {
                                c1050a.f16521d = vVar3.A();
                                c1050a.f16522e = vVar3.A();
                                vVar3.H(11);
                                c1050a.f16523f = vVar3.A();
                                c1050a.g = vVar3.A();
                                break;
                            }
                            break;
                    }
                    vVar2 = vVar5;
                    vVar = vVar2;
                    i11 = 0;
                    c0776b = null;
                } else {
                    v vVar7 = vVar5;
                    if (c1050a.f16521d == 0 || c1050a.f16522e == 0 || c1050a.f16524h == 0 || c1050a.f16525i == 0) {
                        vVar = vVar7;
                    } else {
                        vVar = vVar7;
                        int i22 = vVar.f21231c;
                        if (i22 != 0 && vVar.f21230b == i22 && c1050a.f16520c) {
                            vVar.G(0);
                            int i23 = c1050a.f16524h * c1050a.f16525i;
                            int[] iArr3 = new int[i23];
                            int i24 = 0;
                            while (i24 < i23) {
                                int v15 = vVar.v();
                                if (v15 != 0) {
                                    i10 = i24 + 1;
                                    iArr3[i24] = iArr[v15];
                                } else {
                                    int v16 = vVar.v();
                                    if (v16 != 0) {
                                        i10 = ((v16 & 64) == 0 ? v16 & 63 : ((v16 & 63) << 8) | vVar.v()) + i24;
                                        Arrays.fill(iArr3, i24, i10, (v16 & 128) == 0 ? 0 : iArr[vVar.v()]);
                                    }
                                }
                                i24 = i10;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr3, c1050a.f16524h, c1050a.f16525i, Bitmap.Config.ARGB_8888);
                            float f4 = c1050a.f16523f;
                            float f10 = c1050a.f16521d;
                            float f11 = f4 / f10;
                            float f12 = c1050a.g;
                            float f13 = c1050a.f16522e;
                            c0776b = new C0776b(null, null, null, createBitmap, f12 / f13, 0, 0, f11, 0, Integer.MIN_VALUE, -3.4028235E38f, c1050a.f16524h / f10, c1050a.f16525i / f13, false, -16777216, Integer.MIN_VALUE, 0.0f);
                            z10 = 0;
                            c1050a.f16521d = z10 ? 1 : 0;
                            c1050a.f16522e = z10 ? 1 : 0;
                            c1050a.f16523f = z10 ? 1 : 0;
                            c1050a.g = z10 ? 1 : 0;
                            c1050a.f16524h = z10 ? 1 : 0;
                            c1050a.f16525i = z10 ? 1 : 0;
                            vVar.D(z10 ? 1 : 0);
                            c1050a.f16520c = z10;
                            i11 = z10;
                        }
                    }
                    z10 = 0;
                    c0776b = null;
                    c1050a.f16521d = z10 ? 1 : 0;
                    c1050a.f16522e = z10 ? 1 : 0;
                    c1050a.f16523f = z10 ? 1 : 0;
                    c1050a.g = z10 ? 1 : 0;
                    c1050a.f16524h = z10 ? 1 : 0;
                    c1050a.f16525i = z10 ? 1 : 0;
                    vVar.D(z10 ? 1 : 0);
                    c1050a.f16520c = z10;
                    i11 = z10;
                }
                vVar3.G(i15);
                i12 = i11;
            }
            if (c0776b != null) {
                arrayList.add(c0776b);
            }
            int i25 = i12;
            vVar5 = vVar;
            i13 = i25;
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        ?? obj = new Object();
        obj.f16530a = unmodifiableList;
        return obj;
    }
}
