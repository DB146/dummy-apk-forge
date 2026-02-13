package C6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y1.K;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2981A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f2982B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2983a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2985c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f2986d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f2987e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f2988f;
    public final Context g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f2989h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f2990i;
    public int j;
    public FrameLayout k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2991l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2992m;

    /* renamed from: n, reason: collision with root package name */
    public int f2993n;

    /* renamed from: o, reason: collision with root package name */
    public int f2994o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2995p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2996q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f2997r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2998s;

    /* renamed from: t, reason: collision with root package name */
    public int f2999t;

    /* renamed from: u, reason: collision with root package name */
    public int f3000u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f3001v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f3002w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3003x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f3004y;

    /* renamed from: z, reason: collision with root package name */
    public int f3005z;

    public p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.f2989h = textInputLayout;
        this.f2992m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f2983a = Tb.a.D(context, R.attr.motionDurationShort4, 217);
        this.f2984b = Tb.a.D(context, R.attr.motionDurationMedium4, 167);
        this.f2985c = Tb.a.D(context, R.attr.motionDurationShort4, 167);
        this.f2986d = Tb.a.E(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC1053a.f16534d);
        LinearInterpolator linearInterpolator = AbstractC1053a.f16531a;
        this.f2987e = Tb.a.E(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f2988f = Tb.a.E(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i7) {
        if (this.f2990i == null && this.k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f2990i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f2990i;
            TextInputLayout textInputLayout = this.f2989h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.f2990i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i7 == 0 || i7 == 1) {
            this.k.setVisibility(0);
            this.k.addView(appCompatTextView);
        } else {
            this.f2990i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f2990i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f2990i != null) {
            TextInputLayout textInputLayout = this.f2989h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean t5 = Tb.a.t(context);
                LinearLayout linearLayout = this.f2990i;
                WeakHashMap weakHashMap = K.f26642a;
                int paddingStart = editText.getPaddingStart();
                if (t5) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (t5) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (t5) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f2991l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z8, AppCompatTextView appCompatTextView, int i7, int i10, int i11) {
        if (appCompatTextView == null || !z8) {
            return;
        }
        if (i7 == i11 || i7 == i10) {
            boolean z10 = i11 == i7;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i12 = this.f2985c;
            ofFloat.setDuration(z10 ? this.f2984b : i12);
            ofFloat.setInterpolator(z10 ? this.f2987e : this.f2988f);
            if (i7 == i11 && i10 != 0) {
                ofFloat.setStartDelay(i12);
            }
            arrayList.add(ofFloat);
            if (i11 != i7 || i10 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f2992m, 0.0f);
            ofFloat2.setDuration(this.f2983a);
            ofFloat2.setInterpolator(this.f2986d);
            ofFloat2.setStartDelay(i12);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i7) {
        if (i7 == 1) {
            return this.f2997r;
        }
        if (i7 != 2) {
            return null;
        }
        return this.f3004y;
    }

    public final void f() {
        this.f2995p = null;
        c();
        if (this.f2993n == 1) {
            if (!this.f3003x || TextUtils.isEmpty(this.f3002w)) {
                this.f2994o = 0;
            } else {
                this.f2994o = 2;
            }
        }
        i(h(this.f2997r, ""), this.f2993n, this.f2994o);
    }

    public final void g(AppCompatTextView appCompatTextView, int i7) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f2990i;
        if (linearLayout == null) {
            return;
        }
        if ((i7 == 0 || i7 == 1) && (frameLayout = this.k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i10 = this.j - 1;
        this.j = i10;
        LinearLayout linearLayout2 = this.f2990i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = K.f26642a;
        TextInputLayout textInputLayout = this.f2989h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f2994o == this.f2993n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence));
    }

    public final void i(boolean z8, int i7, int i10) {
        TextView e2;
        TextView e10;
        if (i7 == i10) {
            return;
        }
        if (z8) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f2991l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f3003x, this.f3004y, 2, i7, i10);
            d(arrayList, this.f2996q, this.f2997r, 1, i7, i10);
            int size = arrayList.size();
            long j = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Animator animator = (Animator) arrayList.get(i11);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new o(this, i10, e(i7), i7, e(i10)));
            animatorSet.start();
        } else if (i7 != i10) {
            if (i10 != 0 && (e10 = e(i10)) != null) {
                e10.setVisibility(0);
                e10.setAlpha(1.0f);
            }
            if (i7 != 0 && (e2 = e(i7)) != null) {
                e2.setVisibility(4);
                if (i7 == 1) {
                    e2.setText((CharSequence) null);
                }
            }
            this.f2993n = i10;
        }
        TextInputLayout textInputLayout = this.f2989h;
        textInputLayout.r();
        textInputLayout.u(z8, false);
        textInputLayout.x();
    }
}
