package C6;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;
import l2.X;
import y1.K;

/* loaded from: classes.dex */
public final class u extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3021a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f3022b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3023c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f3024d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3025e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f3026f;

    /* renamed from: u, reason: collision with root package name */
    public int f3027u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView.ScaleType f3028v;

    /* renamed from: w, reason: collision with root package name */
    public View.OnLongClickListener f3029w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3030x;

    public u(TextInputLayout textInputLayout, X x2) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f3021a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f3024d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f3022b = appCompatTextView;
        if (Tb.a.t(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f3029w;
        checkableImageButton.setOnClickListener(null);
        Tb.a.J(checkableImageButton, onLongClickListener);
        this.f3029w = null;
        checkableImageButton.setOnLongClickListener(null);
        Tb.a.J(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) x2.f19195c;
        if (typedArray.hasValue(69)) {
            this.f3025e = Tb.a.o(getContext(), x2, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f3026f = s6.o.h(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(x2.n(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f3027u) {
            this.f3027u = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType h10 = Tb.a.h(typedArray.getInt(68, -1));
            this.f3028v = h10;
            checkableImageButton.setScaleType(h10);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = K.f26642a;
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            appCompatTextView.setTextColor(x2.m(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f3023c = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int i7;
        CheckableImageButton checkableImageButton = this.f3024d;
        if (checkableImageButton.getVisibility() == 0) {
            i7 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i7 = 0;
        }
        WeakHashMap weakHashMap = K.f26642a;
        return this.f3022b.getPaddingStart() + getPaddingStart() + i7;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3024d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f3025e;
            PorterDuff.Mode mode = this.f3026f;
            TextInputLayout textInputLayout = this.f3021a;
            Tb.a.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            Tb.a.B(textInputLayout, checkableImageButton, this.f3025e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f3029w;
        checkableImageButton.setOnClickListener(null);
        Tb.a.J(checkableImageButton, onLongClickListener);
        this.f3029w = null;
        checkableImageButton.setOnLongClickListener(null);
        Tb.a.J(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z8) {
        CheckableImageButton checkableImageButton = this.f3024d;
        if ((checkableImageButton.getVisibility() == 0) != z8) {
            checkableImageButton.setVisibility(z8 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f3021a.f15488d;
        if (editText == null) {
            return;
        }
        if (this.f3024d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = K.f26642a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = K.f26642a;
        this.f3022b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i7 = (this.f3023c == null || this.f3030x) ? 8 : 0;
        setVisibility((this.f3024d.getVisibility() == 0 || i7 == 0) ? 0 : 8);
        this.f3022b.setVisibility(i7);
        this.f3021a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        d();
    }
}
