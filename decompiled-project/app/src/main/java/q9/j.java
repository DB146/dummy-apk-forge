package q9;

import android.graphics.Rect;
import android.util.Log;
import p9.r;

/* loaded from: classes2.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23588a;

    @Override // q9.l
    public final float a(r rVar, r rVar2) {
        int i7;
        switch (this.f23588a) {
            case 0:
                if (rVar.f23214a <= 0 || rVar.f23215b <= 0) {
                    return 0.0f;
                }
                r a9 = rVar.a(rVar2);
                float f4 = a9.f23214a * 1.0f;
                float f10 = f4 / rVar.f23214a;
                if (f10 > 1.0f) {
                    f10 = (float) Math.pow(1.0f / f10, 1.1d);
                }
                float f11 = ((a9.f23215b * 1.0f) / rVar2.f23215b) + (f4 / rVar2.f23214a);
                return ((1.0f / f11) / f11) * f10;
            case 1:
                if (rVar.f23214a <= 0 || rVar.f23215b <= 0) {
                    return 0.0f;
                }
                float f12 = rVar.b(rVar2).f23214a;
                float f13 = (f12 * 1.0f) / rVar.f23214a;
                if (f13 > 1.0f) {
                    f13 = (float) Math.pow(1.0f / f13, 1.1d);
                }
                float f14 = ((rVar2.f23215b * 1.0f) / r0.f23215b) * ((rVar2.f23214a * 1.0f) / f12);
                return (((1.0f / f14) / f14) / f14) * f13;
            default:
                int i10 = rVar.f23214a;
                if (i10 <= 0 || (i7 = rVar.f23215b) <= 0) {
                    return 0.0f;
                }
                int i11 = rVar2.f23214a;
                float f15 = (i10 * 1.0f) / i11;
                if (f15 < 1.0f) {
                    f15 = 1.0f / f15;
                }
                float f16 = i7;
                float f17 = rVar2.f23215b;
                float f18 = (f16 * 1.0f) / f17;
                if (f18 < 1.0f) {
                    f18 = 1.0f / f18;
                }
                float f19 = (1.0f / f15) / f18;
                float f20 = ((i10 * 1.0f) / f16) / ((i11 * 1.0f) / f17);
                if (f20 < 1.0f) {
                    f20 = 1.0f / f20;
                }
                return (((1.0f / f20) / f20) / f20) * f19;
        }
    }

    @Override // q9.l
    public final Rect b(r rVar, r rVar2) {
        switch (this.f23588a) {
            case 0:
                r a9 = rVar.a(rVar2);
                Log.i("j", "Preview: " + rVar + "; Scaled: " + a9 + "; Want: " + rVar2);
                int i7 = rVar2.f23214a;
                int i10 = a9.f23214a;
                int i11 = (i10 - i7) / 2;
                int i12 = rVar2.f23215b;
                int i13 = a9.f23215b;
                int i14 = (i13 - i12) / 2;
                return new Rect(-i11, -i14, i10 - i11, i13 - i14);
            case 1:
                r b2 = rVar.b(rVar2);
                Log.i("j", "Preview: " + rVar + "; Scaled: " + b2 + "; Want: " + rVar2);
                int i15 = rVar2.f23214a;
                int i16 = b2.f23214a;
                int i17 = (i16 - i15) / 2;
                int i18 = rVar2.f23215b;
                int i19 = b2.f23215b;
                int i20 = (i19 - i18) / 2;
                return new Rect(-i17, -i20, i16 - i17, i19 - i20);
            default:
                return new Rect(0, 0, rVar2.f23214a, rVar2.f23215b);
        }
    }
}
