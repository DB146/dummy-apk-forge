package B6;

import A0.C0016f0;
import H2.C0304s;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import i2.C1322j;
import y6.C2400f;
import y6.C2401g;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2117b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f2116a = i7;
        this.f2117b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2116a) {
            case 0:
                ((o) this.f2117b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 1:
                ((TextInputLayout) this.f2117b).f15463J0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0304s c0304s = (C0304s) this.f2117b;
                c0304s.f4804c.setAlpha(floatValue);
                c0304s.f4805d.setAlpha(floatValue);
                c0304s.f4817s.invalidate();
                return;
            case 3:
                ((C1322j) this.f2117b).d();
                return;
            case 4:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c2.h hVar = (c2.h) this.f2117b;
                int i7 = hVar.f14155m;
                if (i7 != -1) {
                    c2.g gVar = hVar.f14154l;
                    A7.a aVar = gVar.f14142a[i7];
                    if (aVar != null) {
                        aVar.f531a = intValue;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((Drawable) ((C0016f0) this.f2117b).g).setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C2401g c2401g = ((BottomSheetBehavior) this.f2117b).f15218i;
                if (c2401g != null) {
                    C2400f c2400f = c2401g.f27035a;
                    if (c2400f.f27018i != floatValue2) {
                        c2400f.f27018i = floatValue2;
                        c2401g.f27039e = true;
                        c2401g.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
