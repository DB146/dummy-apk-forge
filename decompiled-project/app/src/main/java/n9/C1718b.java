package n9;

import P8.q;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: n9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1718b {

    /* renamed from: a, reason: collision with root package name */
    public final V8.b f21313a;

    /* renamed from: c, reason: collision with root package name */
    public final int f21315c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21316d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21317e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21318f;
    public final float g;

    /* renamed from: i, reason: collision with root package name */
    public final q f21320i;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21314b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    public final int[] f21319h = new int[3];

    public C1718b(V8.b bVar, int i7, int i10, int i11, int i12, float f4, q qVar) {
        this.f21313a = bVar;
        this.f21315c = i7;
        this.f21316d = i10;
        this.f21317e = i11;
        this.f21318f = i12;
        this.g = f4;
        this.f21320i = qVar;
    }

    public final boolean a(int[] iArr) {
        float f4 = this.g;
        float f10 = f4 / 2.0f;
        for (int i7 = 0; i7 < 3; i7++) {
            if (Math.abs(f4 - iArr[i7]) >= f10) {
                return false;
            }
        }
        return true;
    }

    public final C1717a b(int i7, int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = i11 + i12 + iArr[2];
        float f4 = (i10 - r6) - (i12 / 2.0f);
        int i14 = (int) f4;
        int i15 = i12 * 2;
        V8.b bVar = this.f21313a;
        int i16 = bVar.f10195b;
        int[] iArr2 = this.f21319h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i17 = i7;
        while (i17 >= 0 && bVar.b(i14, i17)) {
            int i18 = iArr2[1];
            if (i18 > i15) {
                break;
            }
            iArr2[1] = i18 + 1;
            i17--;
        }
        float f10 = Float.NaN;
        if (i17 >= 0 && iArr2[1] <= i15) {
            while (i17 >= 0 && !bVar.b(i14, i17)) {
                int i19 = iArr2[0];
                if (i19 > i15) {
                    break;
                }
                iArr2[0] = i19 + 1;
                i17--;
            }
            if (iArr2[0] <= i15) {
                int i20 = i7 + 1;
                while (i20 < i16 && bVar.b(i14, i20)) {
                    int i21 = iArr2[1];
                    if (i21 > i15) {
                        break;
                    }
                    iArr2[1] = i21 + 1;
                    i20++;
                }
                if (i20 != i16 && iArr2[1] <= i15) {
                    while (i20 < i16 && !bVar.b(i14, i20)) {
                        int i22 = iArr2[2];
                        if (i22 > i15) {
                            break;
                        }
                        iArr2[2] = i22 + 1;
                        i20++;
                    }
                    int i23 = iArr2[2];
                    if (i23 <= i15 && Math.abs(((iArr2[0] + iArr2[1]) + i23) - i13) * 5 < i13 * 2 && a(iArr2)) {
                        f10 = (i20 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f10)) {
            return null;
        }
        float f11 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList arrayList = this.f21314b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1717a c1717a = (C1717a) it.next();
            if (Math.abs(f10 - c1717a.f8250b) <= f11) {
                float f12 = c1717a.f8249a;
                if (Math.abs(f4 - f12) <= f11) {
                    float f13 = c1717a.f21312c;
                    float abs = Math.abs(f11 - f13);
                    if (abs <= 1.0f || abs <= f13) {
                        return new C1717a((f12 + f4) / 2.0f, (c1717a.f8250b + f10) / 2.0f, (f13 + f11) / 2.0f);
                    }
                } else {
                    continue;
                }
            }
        }
        C1717a c1717a2 = new C1717a(f4, f10, f11);
        arrayList.add(c1717a2);
        q qVar = this.f21320i;
        if (qVar == null) {
            return null;
        }
        qVar.a(c1717a2);
        return null;
    }
}
