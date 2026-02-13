package m5;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: h, reason: collision with root package name */
    public static final A0.B f20571h = new A0.B(21);

    /* renamed from: i, reason: collision with root package name */
    public static final A0.B f20572i = new A0.B(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f20573a;

    /* renamed from: e, reason: collision with root package name */
    public int f20577e;

    /* renamed from: f, reason: collision with root package name */
    public int f20578f;
    public int g;

    /* renamed from: c, reason: collision with root package name */
    public final P[] f20575c = new P[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20574b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f20576d = -1;

    public Q(int i7) {
        this.f20573a = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i7, float f4) {
        P p10;
        int i10 = this.f20576d;
        ArrayList arrayList = this.f20574b;
        if (i10 != 1) {
            Collections.sort(arrayList, f20571h);
            this.f20576d = 1;
        }
        int i11 = this.g;
        P[] pArr = this.f20575c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.g = i12;
            p10 = pArr[i12];
        } else {
            p10 = new Object();
        }
        int i13 = this.f20577e;
        this.f20577e = i13 + 1;
        p10.f20568a = i13;
        p10.f20569b = i7;
        p10.f20570c = f4;
        arrayList.add(p10);
        this.f20578f += i7;
        while (true) {
            int i14 = this.f20578f;
            int i15 = this.f20573a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            P p11 = (P) arrayList.get(0);
            int i17 = p11.f20569b;
            if (i17 <= i16) {
                this.f20578f -= i17;
                arrayList.remove(0);
                int i18 = this.g;
                if (i18 < 5) {
                    this.g = i18 + 1;
                    pArr[i18] = p11;
                }
            } else {
                p11.f20569b = i17 - i16;
                this.f20578f -= i16;
            }
        }
    }

    public final float b() {
        int i7 = this.f20576d;
        ArrayList arrayList = this.f20574b;
        if (i7 != 0) {
            Collections.sort(arrayList, f20572i);
            this.f20576d = 0;
        }
        float f4 = 0.5f * this.f20578f;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            P p10 = (P) arrayList.get(i11);
            i10 += p10.f20569b;
            if (i10 >= f4) {
                return p10.f20570c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((P) h3.o.k(1, arrayList)).f20570c;
    }
}
