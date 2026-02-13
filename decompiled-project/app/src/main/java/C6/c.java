package C6;

import A9.R2;
import A9.S2;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f2922e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2923f;
    public final TimeInterpolator g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f2924h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f2925i;
    public final Aa.q j;
    public final R2 k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2926l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f2927m;

    public c(m mVar) {
        super(mVar);
        this.j = new Aa.q(this, 2);
        this.k = new R2(this, 3);
        this.f2922e = Tb.a.D(mVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f2923f = Tb.a.D(mVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = Tb.a.E(mVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1053a.f16531a);
        this.f2924h = Tb.a.E(mVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1053a.f16534d);
    }

    @Override // C6.n
    public final void a() {
        if (this.f2973b.f2953D != null) {
            return;
        }
        t(u());
    }

    @Override // C6.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // C6.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // C6.n
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // C6.n
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // C6.n
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // C6.n
    public final void m(EditText editText) {
        this.f2925i = editText;
        this.f2972a.setEndIconVisible(u());
    }

    @Override // C6.n
    public final void p(boolean z8) {
        if (this.f2973b.f2953D == null) {
            return;
        }
        t(z8);
    }

    @Override // C6.n
    public final void r() {
        final int i7 = 1;
        final int i10 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f2924h);
        ofFloat.setDuration(this.f2923f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: C6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f2919b;

            {
                this.f2919b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i7) {
                    case 0:
                        c cVar = this.f2919b;
                        cVar.getClass();
                        cVar.f2975d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        c cVar2 = this.f2919b;
                        cVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f2975d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f2922e;
        ofFloat2.setDuration(i11);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: C6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f2919b;

            {
                this.f2919b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        c cVar = this.f2919b;
                        cVar.getClass();
                        cVar.f2975d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        c cVar2 = this.f2919b;
                        cVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f2975d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2926l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f2926l.addListener(new b(this, i10));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i11);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: C6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f2919b;

            {
                this.f2919b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        c cVar = this.f2919b;
                        cVar.getClass();
                        cVar.f2975d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        c cVar2 = this.f2919b;
                        cVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar2.f2975d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f2927m = ofFloat3;
        ofFloat3.addListener(new b(this, i7));
    }

    @Override // C6.n
    public final void s() {
        EditText editText = this.f2925i;
        if (editText != null) {
            editText.post(new S2(this, 6));
        }
    }

    public final void t(boolean z8) {
        boolean z10 = this.f2973b.d() == z8;
        if (z8 && !this.f2926l.isRunning()) {
            this.f2927m.cancel();
            this.f2926l.start();
            if (z10) {
                this.f2926l.end();
                return;
            }
            return;
        }
        if (z8) {
            return;
        }
        this.f2926l.cancel();
        this.f2927m.start();
        if (z10) {
            this.f2927m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f2925i;
        return editText != null && (editText.hasFocus() || this.f2975d.hasFocus()) && this.f2925i.getText().length() > 0;
    }
}
