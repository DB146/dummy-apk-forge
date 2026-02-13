package com.google.android.material.textfield;

import A9.C0072c1;
import A9.O;
import A9.S2;
import B0.C;
import B6.c;
import C6.i;
import C6.k;
import C6.m;
import C6.p;
import C6.s;
import C6.u;
import C6.v;
import C6.w;
import C6.x;
import C6.z;
import D6.a;
import H1.b;
import L7.j;
import Q5.e;
import a3.C0730g;
import a3.y;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import c6.AbstractC0911a;
import com.google.android.material.internal.CheckableImageButton;
import d6.AbstractC1053a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l1.AbstractC1449a;
import l2.X;
import o.AbstractC1737h0;
import o.r;
import q1.AbstractC1875a;
import q3.f;
import s6.AbstractC1993c;
import s6.C1992b;
import s6.o;
import v6.C2146a;
import v6.d;
import w1.AbstractC2202f;
import w1.C2198b;
import y1.E;
import y1.K;
import y6.C2395a;
import y6.C2399e;
import y6.C2400f;
import y6.C2401g;
import y6.C2404j;
import y6.InterfaceC2397c;
import y7.u0;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: Q0, reason: collision with root package name */
    public static final int[][] f15444Q0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public boolean f15445A;

    /* renamed from: A0, reason: collision with root package name */
    public int f15446A0;

    /* renamed from: B, reason: collision with root package name */
    public x f15447B;

    /* renamed from: B0, reason: collision with root package name */
    public ColorStateList f15448B0;

    /* renamed from: C, reason: collision with root package name */
    public AppCompatTextView f15449C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public int f15450D;

    /* renamed from: D0, reason: collision with root package name */
    public int f15451D0;

    /* renamed from: E, reason: collision with root package name */
    public int f15452E;

    /* renamed from: E0, reason: collision with root package name */
    public int f15453E0;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f15454F;

    /* renamed from: F0, reason: collision with root package name */
    public int f15455F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f15456G;

    /* renamed from: G0, reason: collision with root package name */
    public int f15457G0;

    /* renamed from: H, reason: collision with root package name */
    public AppCompatTextView f15458H;

    /* renamed from: H0, reason: collision with root package name */
    public int f15459H0;

    /* renamed from: I, reason: collision with root package name */
    public ColorStateList f15460I;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f15461I0;

    /* renamed from: J, reason: collision with root package name */
    public int f15462J;

    /* renamed from: J0, reason: collision with root package name */
    public final C1992b f15463J0;

    /* renamed from: K, reason: collision with root package name */
    public C0730g f15464K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f15465K0;
    public C0730g L;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f15466L0;

    /* renamed from: M, reason: collision with root package name */
    public ColorStateList f15467M;

    /* renamed from: M0, reason: collision with root package name */
    public ValueAnimator f15468M0;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f15469N;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f15470N0;

    /* renamed from: O, reason: collision with root package name */
    public ColorStateList f15471O;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f15472O0;

    /* renamed from: P, reason: collision with root package name */
    public ColorStateList f15473P;

    /* renamed from: P0, reason: collision with root package name */
    public boolean f15474P0;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f15475Q;

    /* renamed from: R, reason: collision with root package name */
    public CharSequence f15476R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f15477S;

    /* renamed from: T, reason: collision with root package name */
    public C2401g f15478T;

    /* renamed from: U, reason: collision with root package name */
    public C2401g f15479U;

    /* renamed from: V, reason: collision with root package name */
    public StateListDrawable f15480V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f15481W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f15482a;

    /* renamed from: a0, reason: collision with root package name */
    public C2401g f15483a0;

    /* renamed from: b, reason: collision with root package name */
    public final u f15484b;

    /* renamed from: b0, reason: collision with root package name */
    public C2401g f15485b0;

    /* renamed from: c, reason: collision with root package name */
    public final m f15486c;

    /* renamed from: c0, reason: collision with root package name */
    public C2404j f15487c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f15488d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f15489d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f15490e;

    /* renamed from: e0, reason: collision with root package name */
    public final int f15491e0;

    /* renamed from: f, reason: collision with root package name */
    public int f15492f;

    /* renamed from: f0, reason: collision with root package name */
    public int f15493f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f15494g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f15495h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f15496i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f15497j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f15498k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f15499l0;

    /* renamed from: m0, reason: collision with root package name */
    public final Rect f15500m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Rect f15501n0;

    /* renamed from: o0, reason: collision with root package name */
    public final RectF f15502o0;

    /* renamed from: p0, reason: collision with root package name */
    public Typeface f15503p0;

    /* renamed from: q0, reason: collision with root package name */
    public ColorDrawable f15504q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f15505r0;

    /* renamed from: s0, reason: collision with root package name */
    public final LinkedHashSet f15506s0;

    /* renamed from: t0, reason: collision with root package name */
    public ColorDrawable f15507t0;

    /* renamed from: u, reason: collision with root package name */
    public int f15508u;

    /* renamed from: u0, reason: collision with root package name */
    public int f15509u0;

    /* renamed from: v, reason: collision with root package name */
    public int f15510v;

    /* renamed from: v0, reason: collision with root package name */
    public Drawable f15511v0;

    /* renamed from: w, reason: collision with root package name */
    public int f15512w;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f15513w0;

    /* renamed from: x, reason: collision with root package name */
    public final p f15514x;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f15515x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f15516y;

    /* renamed from: y0, reason: collision with root package name */
    public int f15517y0;

    /* renamed from: z, reason: collision with root package name */
    public int f15518z;

    /* renamed from: z0, reason: collision with root package name */
    public int f15519z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.textInputStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_Design_TextInputLayout), attributeSet, com.kt.apps.media.xemtv.beta.R.attr.textInputStyle);
        this.f15492f = -1;
        this.f15508u = -1;
        this.f15510v = -1;
        this.f15512w = -1;
        this.f15514x = new p(this);
        this.f15447B = new A4.p(12);
        this.f15500m0 = new Rect();
        this.f15501n0 = new Rect();
        this.f15502o0 = new RectF();
        this.f15506s0 = new LinkedHashSet();
        C1992b c1992b = new C1992b(this);
        this.f15463J0 = c1992b;
        this.f15474P0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f15482a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC1053a.f16531a;
        c1992b.f24115Q = linearInterpolator;
        c1992b.h(false);
        c1992b.f24114P = linearInterpolator;
        c1992b.h(false);
        if (c1992b.g != 8388659) {
            c1992b.g = 8388659;
            c1992b.h(false);
        }
        int[] iArr = AbstractC0911a.f14400G;
        o.a(context2, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.textInputStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_Design_TextInputLayout);
        o.b(context2, attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.textInputStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.textInputStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_Design_TextInputLayout);
        X x2 = new X(context2, obtainStyledAttributes);
        u uVar = new u(this, x2);
        this.f15484b = uVar;
        this.f15475Q = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f15466L0 = obtainStyledAttributes.getBoolean(47, true);
        this.f15465K0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f15487c0 = C2404j.b(context2, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.textInputStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_Design_TextInputLayout).c();
        this.f15491e0 = context2.getResources().getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f15494g0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f15496i0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f15497j0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f15495h0 = this.f15496i0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f15487c0.e();
        if (dimension >= 0.0f) {
            e2.f6360f = new C2395a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.g = new C2395a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f6361h = new C2395a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.f6362i = new C2395a(dimension4);
        }
        this.f15487c0 = e2.c();
        ColorStateList o10 = Tb.a.o(context2, x2, 7);
        if (o10 != null) {
            int defaultColor = o10.getDefaultColor();
            this.C0 = defaultColor;
            this.f15499l0 = defaultColor;
            if (o10.isStateful()) {
                this.f15451D0 = o10.getColorForState(new int[]{-16842910}, -1);
                this.f15453E0 = o10.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f15455F0 = o10.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f15453E0 = this.C0;
                ColorStateList colorStateList = AbstractC1449a.getColorStateList(context2, com.kt.apps.media.xemtv.beta.R.color.mtrl_filled_background_color);
                this.f15451D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f15455F0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f15499l0 = 0;
            this.C0 = 0;
            this.f15451D0 = 0;
            this.f15453E0 = 0;
            this.f15455F0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList m10 = x2.m(1);
            this.f15515x0 = m10;
            this.f15513w0 = m10;
        }
        ColorStateList o11 = Tb.a.o(context2, x2, 14);
        this.f15446A0 = obtainStyledAttributes.getColor(14, 0);
        this.f15517y0 = AbstractC1449a.getColor(context2, com.kt.apps.media.xemtv.beta.R.color.mtrl_textinput_default_box_stroke_color);
        this.f15457G0 = AbstractC1449a.getColor(context2, com.kt.apps.media.xemtv.beta.R.color.mtrl_textinput_disabled_color);
        this.f15519z0 = AbstractC1449a.getColor(context2, com.kt.apps.media.xemtv.beta.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (o11 != null) {
            setBoxStrokeColorStateList(o11);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(Tb.a.o(context2, x2, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f15471O = x2.m(24);
        this.f15473P = x2.m(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i7 = obtainStyledAttributes.getInt(34, 1);
        boolean z8 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z10 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z11 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f15452E = obtainStyledAttributes.getResourceId(22, 0);
        this.f15450D = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i7);
        setCounterOverflowTextAppearance(this.f15450D);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f15452E);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(x2.m(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(x2.m(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(x2.m(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(x2.m(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(x2.m(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(x2.m(58));
        }
        m mVar = new m(this, x2);
        this.f15486c = mVar;
        boolean z12 = obtainStyledAttributes.getBoolean(0, true);
        x2.w();
        WeakHashMap weakHashMap = K.f26642a;
        setImportantForAccessibility(2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 >= 26) {
            E.b(this, 1);
        }
        frameLayout.addView(uVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z8);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f15488d;
        if (!(editText instanceof AutoCompleteTextView) || e.C(editText)) {
            return this.f15478T;
        }
        int p10 = f.p(this.f15488d, com.kt.apps.media.xemtv.beta.R.attr.colorControlHighlight);
        int i7 = this.f15493f0;
        int[][] iArr = f15444Q0;
        if (i7 != 2) {
            if (i7 != 1) {
                return null;
            }
            C2401g c2401g = this.f15478T;
            int i10 = this.f15499l0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{f.u(0.1f, p10, i10), i10}), c2401g, c2401g);
        }
        Context context = getContext();
        C2401g c2401g2 = this.f15478T;
        TypedValue P10 = e.P(com.kt.apps.media.xemtv.beta.R.attr.colorSurface, context, "TextInputLayout");
        int i11 = P10.resourceId;
        int color = i11 != 0 ? AbstractC1449a.getColor(context, i11) : P10.data;
        C2401g c2401g3 = new C2401g(c2401g2.f27035a.f27011a);
        int u3 = f.u(0.1f, p10, color);
        c2401g3.k(new ColorStateList(iArr, new int[]{u3, 0}));
        c2401g3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{u3, color});
        C2401g c2401g4 = new C2401g(c2401g2.f27035a.f27011a);
        c2401g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2401g3, c2401g4), c2401g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f15480V == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f15480V = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f15480V.addState(new int[0], f(false));
        }
        return this.f15480V;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f15479U == null) {
            this.f15479U = f(true);
        }
        return this.f15479U;
    }

    public static void k(ViewGroup viewGroup, boolean z8) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            childAt.setEnabled(z8);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z8);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f15488d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f15488d = editText;
        int i7 = this.f15492f;
        if (i7 != -1) {
            setMinEms(i7);
        } else {
            setMinWidth(this.f15510v);
        }
        int i10 = this.f15508u;
        if (i10 != -1) {
            setMaxEms(i10);
        } else {
            setMaxWidth(this.f15512w);
        }
        this.f15481W = false;
        i();
        setTextInputAccessibilityDelegate(new w(this));
        Typeface typeface = this.f15488d.getTypeface();
        C1992b c1992b = this.f15463J0;
        c1992b.m(typeface);
        float textSize = this.f15488d.getTextSize();
        if (c1992b.f24137h != textSize) {
            c1992b.f24137h = textSize;
            c1992b.h(false);
        }
        int i11 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f15488d.getLetterSpacing();
        if (c1992b.f24121W != letterSpacing) {
            c1992b.f24121W = letterSpacing;
            c1992b.h(false);
        }
        int gravity = this.f15488d.getGravity();
        int i12 = (gravity & (-113)) | 48;
        if (c1992b.g != i12) {
            c1992b.g = i12;
            c1992b.h(false);
        }
        if (c1992b.f24135f != gravity) {
            c1992b.f24135f = gravity;
            c1992b.h(false);
        }
        WeakHashMap weakHashMap = K.f26642a;
        this.f15459H0 = editText.getMinimumHeight();
        this.f15488d.addTextChangedListener(new v(this, editText));
        if (this.f15513w0 == null) {
            this.f15513w0 = this.f15488d.getHintTextColors();
        }
        if (this.f15475Q) {
            if (TextUtils.isEmpty(this.f15476R)) {
                CharSequence hint = this.f15488d.getHint();
                this.f15490e = hint;
                setHint(hint);
                this.f15488d.setHint((CharSequence) null);
            }
            this.f15477S = true;
        }
        if (i11 >= 29) {
            p();
        }
        if (this.f15449C != null) {
            n(this.f15488d.getText());
        }
        r();
        this.f15514x.b();
        this.f15484b.bringToFront();
        m mVar = this.f15486c;
        mVar.bringToFront();
        Iterator it = this.f15506s0.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a(this);
        }
        mVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f15476R)) {
            return;
        }
        this.f15476R = charSequence;
        C1992b c1992b = this.f15463J0;
        if (charSequence == null || !TextUtils.equals(c1992b.f24100A, charSequence)) {
            c1992b.f24100A = charSequence;
            c1992b.f24101B = null;
            Bitmap bitmap = c1992b.f24104E;
            if (bitmap != null) {
                bitmap.recycle();
                c1992b.f24104E = null;
            }
            c1992b.h(false);
        }
        if (this.f15461I0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z8) {
        if (this.f15456G == z8) {
            return;
        }
        if (z8) {
            AppCompatTextView appCompatTextView = this.f15458H;
            if (appCompatTextView != null) {
                this.f15482a.addView(appCompatTextView);
                this.f15458H.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f15458H;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f15458H = null;
        }
        this.f15456G = z8;
    }

    public final void a(float f4) {
        int i7 = 1;
        C1992b c1992b = this.f15463J0;
        if (c1992b.f24127b == f4) {
            return;
        }
        if (this.f15468M0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15468M0 = valueAnimator;
            valueAnimator.setInterpolator(Tb.a.E(getContext(), com.kt.apps.media.xemtv.beta.R.attr.motionEasingEmphasizedInterpolator, AbstractC1053a.f16532b));
            this.f15468M0.setDuration(Tb.a.D(getContext(), com.kt.apps.media.xemtv.beta.R.attr.motionDurationMedium4, 167));
            this.f15468M0.addUpdateListener(new c(this, i7));
        }
        this.f15468M0.setFloatValues(c1992b.f24127b, f4);
        this.f15468M0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i7, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f15482a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i7;
        int i10;
        C2401g c2401g = this.f15478T;
        if (c2401g == null) {
            return;
        }
        C2404j c2404j = c2401g.f27035a.f27011a;
        C2404j c2404j2 = this.f15487c0;
        if (c2404j != c2404j2) {
            c2401g.setShapeAppearanceModel(c2404j2);
        }
        if (this.f15493f0 == 2 && (i7 = this.f15495h0) > -1 && (i10 = this.f15498k0) != 0) {
            C2401g c2401g2 = this.f15478T;
            c2401g2.f27035a.j = i7;
            c2401g2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i10);
            C2400f c2400f = c2401g2.f27035a;
            if (c2400f.f27014d != valueOf) {
                c2400f.f27014d = valueOf;
                c2401g2.onStateChange(c2401g2.getState());
            }
        }
        int i11 = this.f15499l0;
        if (this.f15493f0 == 1) {
            i11 = AbstractC1875a.f(this.f15499l0, f.o(getContext(), com.kt.apps.media.xemtv.beta.R.attr.colorSurface, 0));
        }
        this.f15499l0 = i11;
        this.f15478T.k(ColorStateList.valueOf(i11));
        C2401g c2401g3 = this.f15483a0;
        if (c2401g3 != null && this.f15485b0 != null) {
            if (this.f15495h0 > -1 && this.f15498k0 != 0) {
                c2401g3.k(this.f15488d.isFocused() ? ColorStateList.valueOf(this.f15517y0) : ColorStateList.valueOf(this.f15498k0));
                this.f15485b0.k(ColorStateList.valueOf(this.f15498k0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d10;
        if (!this.f15475Q) {
            return 0;
        }
        int i7 = this.f15493f0;
        C1992b c1992b = this.f15463J0;
        if (i7 == 0) {
            d10 = c1992b.d();
        } else {
            if (i7 != 2) {
                return 0;
            }
            d10 = c1992b.d() / 2.0f;
        }
        return (int) d10;
    }

    public final C0730g d() {
        C0730g c0730g = new C0730g();
        c0730g.f12589c = Tb.a.D(getContext(), com.kt.apps.media.xemtv.beta.R.attr.motionDurationShort2, 87);
        c0730g.f12590d = Tb.a.E(getContext(), com.kt.apps.media.xemtv.beta.R.attr.motionEasingLinearInterpolator, AbstractC1053a.f16531a);
        return c0730g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i7) {
        EditText editText = this.f15488d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i7);
            return;
        }
        if (this.f15490e != null) {
            boolean z8 = this.f15477S;
            this.f15477S = false;
            CharSequence hint = editText.getHint();
            this.f15488d.setHint(this.f15490e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i7);
                return;
            } finally {
                this.f15488d.setHint(hint);
                this.f15477S = z8;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i7);
        onProvideAutofillVirtualStructure(viewStructure, i7);
        FrameLayout frameLayout = this.f15482a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure newChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(newChild, i7);
            if (childAt == this.f15488d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f15472O0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f15472O0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C2401g c2401g;
        int i7;
        super.draw(canvas);
        boolean z8 = this.f15475Q;
        C1992b c1992b = this.f15463J0;
        if (z8) {
            c1992b.getClass();
            int save = canvas.save();
            if (c1992b.f24101B != null) {
                RectF rectF = c1992b.f24133e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c1992b.f24112N;
                    textPaint.setTextSize(c1992b.f24106G);
                    float f4 = c1992b.f24143p;
                    float f10 = c1992b.f24144q;
                    float f11 = c1992b.f24105F;
                    if (f11 != 1.0f) {
                        canvas.scale(f11, f11, f4, f10);
                    }
                    if (c1992b.f24132d0 <= 1 || c1992b.f24102C) {
                        canvas.translate(f4, f10);
                        c1992b.f24123Y.draw(canvas);
                    } else {
                        float lineStart = c1992b.f24143p - c1992b.f24123Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f10);
                        float f12 = alpha;
                        textPaint.setAlpha((int) (c1992b.f24128b0 * f12));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            float f13 = c1992b.f24107H;
                            float f14 = c1992b.f24108I;
                            float f15 = c1992b.f24109J;
                            int i11 = c1992b.f24110K;
                            textPaint.setShadowLayer(f13, f14, f15, AbstractC1875a.h(i11, (textPaint.getAlpha() * Color.alpha(i11)) / 255));
                        }
                        c1992b.f24123Y.draw(canvas);
                        textPaint.setAlpha((int) (c1992b.f24126a0 * f12));
                        if (i10 >= 31) {
                            float f16 = c1992b.f24107H;
                            float f17 = c1992b.f24108I;
                            float f18 = c1992b.f24109J;
                            int i12 = c1992b.f24110K;
                            textPaint.setShadowLayer(f16, f17, f18, AbstractC1875a.h(i12, (Color.alpha(i12) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c1992b.f24123Y.getLineBaseline(0);
                        CharSequence charSequence = c1992b.f24130c0;
                        float f19 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f19, textPaint);
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(c1992b.f24107H, c1992b.f24108I, c1992b.f24109J, c1992b.f24110K);
                        }
                        String trim = c1992b.f24130c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i7 = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i7 = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c1992b.f24123Y.getLineEnd(i7), str.length()), 0.0f, f19, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f15485b0 == null || (c2401g = this.f15483a0) == null) {
            return;
        }
        c2401g.draw(canvas);
        if (this.f15488d.isFocused()) {
            Rect bounds = this.f15485b0.getBounds();
            Rect bounds2 = this.f15483a0.getBounds();
            float f20 = c1992b.f24127b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC1053a.c(f20, centerX, bounds2.left);
            bounds.right = AbstractC1053a.c(f20, centerX, bounds2.right);
            this.f15485b0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z8;
        ColorStateList colorStateList;
        if (this.f15470N0) {
            return;
        }
        this.f15470N0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1992b c1992b = this.f15463J0;
        if (c1992b != null) {
            c1992b.L = drawableState;
            ColorStateList colorStateList2 = c1992b.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c1992b.j) != null && colorStateList.isStateful())) {
                c1992b.h(false);
                z8 = true;
                if (this.f15488d != null) {
                    WeakHashMap weakHashMap = K.f26642a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z8) {
                    invalidate();
                }
                this.f15470N0 = false;
            }
        }
        z8 = false;
        if (this.f15488d != null) {
        }
        r();
        x();
        if (z8) {
        }
        this.f15470N0 = false;
    }

    public final boolean e() {
        return this.f15475Q && !TextUtils.isEmpty(this.f15476R) && (this.f15478T instanceof C6.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, y6.j] */
    /* JADX WARN: Type inference failed for: r6v1, types: [y7.u0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [y7.u0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [y7.u0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [y7.u0, java.lang.Object] */
    public final C2401g f(boolean z8) {
        int i7 = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_shape_corner_size_small_component);
        float f4 = z8 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f15488d;
        float popupElevation = editText instanceof s ? ((s) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        C2399e c2399e = new C2399e(i7);
        C2399e c2399e2 = new C2399e(i7);
        C2399e c2399e3 = new C2399e(i7);
        C2399e c2399e4 = new C2399e(i7);
        C2395a c2395a = new C2395a(f4);
        C2395a c2395a2 = new C2395a(f4);
        C2395a c2395a3 = new C2395a(dimensionPixelOffset);
        C2395a c2395a4 = new C2395a(dimensionPixelOffset);
        ?? obj5 = new Object();
        obj5.f27048a = obj;
        obj5.f27049b = obj2;
        obj5.f27050c = obj3;
        obj5.f27051d = obj4;
        obj5.f27052e = c2395a;
        obj5.f27053f = c2395a2;
        obj5.g = c2395a4;
        obj5.f27054h = c2395a3;
        obj5.f27055i = c2399e;
        obj5.j = c2399e2;
        obj5.k = c2399e3;
        obj5.f27056l = c2399e4;
        EditText editText2 = this.f15488d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof s ? ((s) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C2401g.f27024K;
            TypedValue P10 = e.P(com.kt.apps.media.xemtv.beta.R.attr.colorSurface, context, C2401g.class.getSimpleName());
            int i10 = P10.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i10 != 0 ? AbstractC1449a.getColor(context, i10) : P10.data);
        }
        C2401g c2401g = new C2401g();
        c2401g.i(context);
        c2401g.k(dropDownBackgroundTintList);
        c2401g.j(popupElevation);
        c2401g.setShapeAppearanceModel(obj5);
        C2400f c2400f = c2401g.f27035a;
        if (c2400f.g == null) {
            c2400f.g = new Rect();
        }
        c2401g.f27035a.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c2401g.invalidateSelf();
        return c2401g;
    }

    public final int g(int i7, boolean z8) {
        return ((z8 || getPrefixText() == null) ? (!z8 || getSuffixText() == null) ? this.f15488d.getCompoundPaddingLeft() : this.f15486c.c() : this.f15484b.a()) + i7;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f15488d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public C2401g getBoxBackground() {
        int i7 = this.f15493f0;
        if (i7 == 1 || i7 == 2) {
            return this.f15478T;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f15499l0;
    }

    public int getBoxBackgroundMode() {
        return this.f15493f0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f15494g0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean f4 = o.f(this);
        RectF rectF = this.f15502o0;
        return f4 ? this.f15487c0.f27054h.a(rectF) : this.f15487c0.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean f4 = o.f(this);
        RectF rectF = this.f15502o0;
        return f4 ? this.f15487c0.g.a(rectF) : this.f15487c0.f27054h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean f4 = o.f(this);
        RectF rectF = this.f15502o0;
        return f4 ? this.f15487c0.f27052e.a(rectF) : this.f15487c0.f27053f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean f4 = o.f(this);
        RectF rectF = this.f15502o0;
        return f4 ? this.f15487c0.f27053f.a(rectF) : this.f15487c0.f27052e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f15446A0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f15448B0;
    }

    public int getBoxStrokeWidth() {
        return this.f15496i0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f15497j0;
    }

    public int getCounterMaxLength() {
        return this.f15518z;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f15516y && this.f15445A && (appCompatTextView = this.f15449C) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f15469N;
    }

    public ColorStateList getCounterTextColor() {
        return this.f15467M;
    }

    public ColorStateList getCursorColor() {
        return this.f15471O;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f15473P;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f15513w0;
    }

    public EditText getEditText() {
        return this.f15488d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f15486c.f2966u.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f15486c.f2966u.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f15486c.f2950A;
    }

    public int getEndIconMode() {
        return this.f15486c.f2968w;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f15486c.f2951B;
    }

    public CheckableImageButton getEndIconView() {
        return this.f15486c.f2966u;
    }

    public CharSequence getError() {
        p pVar = this.f15514x;
        if (pVar.f2996q) {
            return pVar.f2995p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f15514x.f2999t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f15514x.f2998s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f15514x.f2997r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f15486c.f2962c.getDrawable();
    }

    public CharSequence getHelperText() {
        p pVar = this.f15514x;
        if (pVar.f3003x) {
            return pVar.f3002w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f15514x.f3004y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f15475Q) {
            return this.f15476R;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f15463J0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C1992b c1992b = this.f15463J0;
        return c1992b.e(c1992b.k);
    }

    public ColorStateList getHintTextColor() {
        return this.f15515x0;
    }

    public x getLengthCounter() {
        return this.f15447B;
    }

    public int getMaxEms() {
        return this.f15508u;
    }

    public int getMaxWidth() {
        return this.f15512w;
    }

    public int getMinEms() {
        return this.f15492f;
    }

    public int getMinWidth() {
        return this.f15510v;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f15486c.f2966u.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f15486c.f2966u.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f15456G) {
            return this.f15454F;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f15462J;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f15460I;
    }

    public CharSequence getPrefixText() {
        return this.f15484b.f3023c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f15484b.f3022b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f15484b.f3022b;
    }

    public C2404j getShapeAppearanceModel() {
        return this.f15487c0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f15484b.f3024d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f15484b.f3024d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f15484b.f3027u;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f15484b.f3028v;
    }

    public CharSequence getSuffixText() {
        return this.f15486c.f2953D;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f15486c.f2954E.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f15486c.f2954E;
    }

    public Typeface getTypeface() {
        return this.f15503p0;
    }

    public final int h(int i7, boolean z8) {
        return i7 - ((z8 || getSuffixText() == null) ? (!z8 || getPrefixText() == null) ? this.f15488d.getCompoundPaddingRight() : this.f15484b.a() : this.f15486c.c());
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [y6.g, C6.f] */
    public final void i() {
        int i7 = this.f15493f0;
        if (i7 == 0) {
            this.f15478T = null;
            this.f15483a0 = null;
            this.f15485b0 = null;
        } else if (i7 == 1) {
            this.f15478T = new C2401g(this.f15487c0);
            this.f15483a0 = new C2401g();
            this.f15485b0 = new C2401g();
        } else {
            if (i7 != 2) {
                throw new IllegalArgumentException(A3.c.k(new StringBuilder(), this.f15493f0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f15475Q || (this.f15478T instanceof C6.f)) {
                this.f15478T = new C2401g(this.f15487c0);
            } else {
                C2404j c2404j = this.f15487c0;
                int i10 = C6.f.f2930M;
                if (c2404j == null) {
                    c2404j = new C2404j();
                }
                C6.e eVar = new C6.e(c2404j, new RectF());
                ?? c2401g = new C2401g(eVar);
                c2401g.L = eVar;
                this.f15478T = c2401g;
            }
            this.f15483a0 = null;
            this.f15485b0 = null;
        }
        s();
        x();
        if (this.f15493f0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f15494g0 = getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (Tb.a.t(getContext())) {
                this.f15494g0 = getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f15488d != null && this.f15493f0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f15488d;
                WeakHashMap weakHashMap = K.f26642a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f15488d.getPaddingEnd(), getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (Tb.a.t(getContext())) {
                EditText editText2 = this.f15488d;
                WeakHashMap weakHashMap2 = K.f26642a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f15488d.getPaddingEnd(), getResources().getDimensionPixelSize(com.kt.apps.media.xemtv.beta.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f15493f0 != 0) {
            t();
        }
        EditText editText3 = this.f15488d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f15493f0;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f4;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        int i7;
        int i10;
        if (e()) {
            int width = this.f15488d.getWidth();
            int gravity = this.f15488d.getGravity();
            C1992b c1992b = this.f15463J0;
            boolean b2 = c1992b.b(c1992b.f24100A);
            c1992b.f24102C = b2;
            Rect rect = c1992b.f24131d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i10 = rect.left;
                        f11 = i10;
                    } else {
                        f4 = rect.right;
                        f10 = c1992b.f24124Z;
                    }
                } else if (b2) {
                    f4 = rect.right;
                    f10 = c1992b.f24124Z;
                } else {
                    i10 = rect.left;
                    f11 = i10;
                }
                float max = Math.max(f11, rect.left);
                rectF = this.f15502o0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f12 = (width / 2.0f) + (c1992b.f24124Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c1992b.f24102C) {
                        f12 = max + c1992b.f24124Z;
                    } else {
                        i7 = rect.right;
                        f12 = i7;
                    }
                } else if (c1992b.f24102C) {
                    i7 = rect.right;
                    f12 = i7;
                } else {
                    f12 = c1992b.f24124Z + max;
                }
                rectF.right = Math.min(f12, rect.right);
                rectF.bottom = c1992b.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f13 = rectF.left;
                float f14 = this.f15491e0;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f15495h0);
                C6.f fVar = (C6.f) this.f15478T;
                fVar.getClass();
                fVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f4 = width / 2.0f;
            f10 = c1992b.f24124Z / 2.0f;
            f11 = f4 - f10;
            float max2 = Math.max(f11, rect.left);
            rectF = this.f15502o0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f12 = (width / 2.0f) + (c1992b.f24124Z / 2.0f);
            rectF.right = Math.min(f12, rect.right);
            rectF.bottom = c1992b.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(AppCompatTextView appCompatTextView, int i7) {
        try {
            appCompatTextView.setTextAppearance(i7);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(com.kt.apps.media.xemtv.beta.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(AbstractC1449a.getColor(getContext(), com.kt.apps.media.xemtv.beta.R.color.design_error));
    }

    public final boolean m() {
        p pVar = this.f15514x;
        return (pVar.f2994o != 1 || pVar.f2997r == null || TextUtils.isEmpty(pVar.f2995p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((A4.p) this.f15447B).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z8 = this.f15445A;
        int i7 = this.f15518z;
        String str = null;
        if (i7 == -1) {
            this.f15449C.setText(String.valueOf(length));
            this.f15449C.setContentDescription(null);
            this.f15445A = false;
        } else {
            this.f15445A = length > i7;
            Context context = getContext();
            this.f15449C.setContentDescription(context.getString(this.f15445A ? com.kt.apps.media.xemtv.beta.R.string.character_counter_overflowed_content_description : com.kt.apps.media.xemtv.beta.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f15518z)));
            if (z8 != this.f15445A) {
                o();
            }
            String str2 = C2198b.f25644b;
            C2198b c2198b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C2198b.f25647e : C2198b.f25646d;
            AppCompatTextView appCompatTextView = this.f15449C;
            String string = getContext().getString(com.kt.apps.media.xemtv.beta.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f15518z));
            if (string == null) {
                c2198b.getClass();
            } else {
                c2198b.getClass();
                O o10 = AbstractC2202f.f25654a;
                str = c2198b.c(string).toString();
            }
            appCompatTextView.setText(str);
        }
        if (this.f15488d == null || z8 == this.f15445A) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f15449C;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.f15445A ? this.f15450D : this.f15452E);
            if (!this.f15445A && (colorStateList2 = this.f15467M) != null) {
                this.f15449C.setTextColor(colorStateList2);
            }
            if (!this.f15445A || (colorStateList = this.f15469N) == null) {
                return;
            }
            this.f15449C.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15463J0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        m mVar = this.f15486c;
        mVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z8 = false;
        this.f15474P0 = false;
        if (this.f15488d != null && this.f15488d.getMeasuredHeight() < (max = Math.max(mVar.getMeasuredHeight(), this.f15484b.getMeasuredHeight()))) {
            this.f15488d.setMinimumHeight(max);
            z8 = true;
        }
        boolean q10 = q();
        if (z8 || q10) {
            this.f15488d.post(new S2(this, 8));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        EditText editText = this.f15488d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC1993c.f24154a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f15500m0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC1993c.f24154a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC1993c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC1993c.f24155b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C2401g c2401g = this.f15483a0;
            if (c2401g != null) {
                int i13 = rect.bottom;
                c2401g.setBounds(rect.left, i13 - this.f15496i0, rect.right, i13);
            }
            C2401g c2401g2 = this.f15485b0;
            if (c2401g2 != null) {
                int i14 = rect.bottom;
                c2401g2.setBounds(rect.left, i14 - this.f15497j0, rect.right, i14);
            }
            if (this.f15475Q) {
                float textSize = this.f15488d.getTextSize();
                C1992b c1992b = this.f15463J0;
                if (c1992b.f24137h != textSize) {
                    c1992b.f24137h = textSize;
                    c1992b.h(false);
                }
                int gravity = this.f15488d.getGravity();
                int i15 = (gravity & (-113)) | 48;
                if (c1992b.g != i15) {
                    c1992b.g = i15;
                    c1992b.h(false);
                }
                if (c1992b.f24135f != gravity) {
                    c1992b.f24135f = gravity;
                    c1992b.h(false);
                }
                if (this.f15488d == null) {
                    throw new IllegalStateException();
                }
                boolean f4 = o.f(this);
                int i16 = rect.bottom;
                Rect rect2 = this.f15501n0;
                rect2.bottom = i16;
                int i17 = this.f15493f0;
                if (i17 == 1) {
                    rect2.left = g(rect.left, f4);
                    rect2.top = rect.top + this.f15494g0;
                    rect2.right = h(rect.right, f4);
                } else if (i17 != 2) {
                    rect2.left = g(rect.left, f4);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, f4);
                } else {
                    rect2.left = this.f15488d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f15488d.getPaddingRight();
                }
                int i18 = rect2.left;
                int i19 = rect2.top;
                int i20 = rect2.right;
                int i21 = rect2.bottom;
                Rect rect3 = c1992b.f24131d;
                if (rect3.left != i18 || rect3.top != i19 || rect3.right != i20 || rect3.bottom != i21) {
                    rect3.set(i18, i19, i20, i21);
                    c1992b.f24111M = true;
                }
                if (this.f15488d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c1992b.f24113O;
                textPaint.setTextSize(c1992b.f24137h);
                textPaint.setTypeface(c1992b.f24148u);
                textPaint.setLetterSpacing(c1992b.f24121W);
                float f10 = -textPaint.ascent();
                rect2.left = this.f15488d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f15493f0 != 1 || this.f15488d.getMinLines() > 1) ? rect.top + this.f15488d.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f15488d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f15493f0 != 1 || this.f15488d.getMinLines() > 1) ? rect.bottom - this.f15488d.getCompoundPaddingBottom() : (int) (rect2.top + f10);
                rect2.bottom = compoundPaddingBottom;
                int i22 = rect2.left;
                int i23 = rect2.top;
                int i24 = rect2.right;
                Rect rect4 = c1992b.f24129c;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    c1992b.f24111M = true;
                }
                c1992b.h(false);
                if (!e() || this.f15461I0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        EditText editText;
        super.onMeasure(i7, i10);
        boolean z8 = this.f15474P0;
        m mVar = this.f15486c;
        if (!z8) {
            mVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f15474P0 = true;
        }
        if (this.f15458H != null && (editText = this.f15488d) != null) {
            this.f15458H.setGravity(editText.getGravity());
            this.f15458H.setPadding(this.f15488d.getCompoundPaddingLeft(), this.f15488d.getCompoundPaddingTop(), this.f15488d.getCompoundPaddingRight(), this.f15488d.getCompoundPaddingBottom());
        }
        mVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.onRestoreInstanceState(zVar.f4568a);
        setError(zVar.f3036c);
        if (zVar.f3037d) {
            post(new C(this, 3));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, y6.j] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        boolean z8 = i7 == 1;
        if (z8 != this.f15489d0) {
            InterfaceC2397c interfaceC2397c = this.f15487c0.f27052e;
            RectF rectF = this.f15502o0;
            float a9 = interfaceC2397c.a(rectF);
            float a10 = this.f15487c0.f27053f.a(rectF);
            float a11 = this.f15487c0.f27054h.a(rectF);
            float a12 = this.f15487c0.g.a(rectF);
            C2404j c2404j = this.f15487c0;
            u0 u0Var = c2404j.f27048a;
            u0 u0Var2 = c2404j.f27049b;
            u0 u0Var3 = c2404j.f27051d;
            u0 u0Var4 = c2404j.f27050c;
            C2399e c2399e = new C2399e(0);
            C2399e c2399e2 = new C2399e(0);
            C2399e c2399e3 = new C2399e(0);
            C2399e c2399e4 = new C2399e(0);
            j.d(u0Var2);
            j.d(u0Var);
            j.d(u0Var4);
            j.d(u0Var3);
            C2395a c2395a = new C2395a(a10);
            C2395a c2395a2 = new C2395a(a9);
            C2395a c2395a3 = new C2395a(a12);
            C2395a c2395a4 = new C2395a(a11);
            ?? obj = new Object();
            obj.f27048a = u0Var2;
            obj.f27049b = u0Var;
            obj.f27050c = u0Var3;
            obj.f27051d = u0Var4;
            obj.f27052e = c2395a;
            obj.f27053f = c2395a2;
            obj.g = c2395a4;
            obj.f27054h = c2395a3;
            obj.f27055i = c2399e;
            obj.j = c2399e2;
            obj.k = c2399e3;
            obj.f27056l = c2399e4;
            this.f15489d0 = z8;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [C6.z, android.os.Parcelable, H1.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        if (m()) {
            bVar.f3036c = getError();
        }
        m mVar = this.f15486c;
        bVar.f3037d = mVar.f2968w != 0 && mVar.f2966u.f15403d;
        return bVar;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f15471O;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue N10 = e.N(context, com.kt.apps.media.xemtv.beta.R.attr.colorControlActivated);
            if (N10 != null) {
                int i7 = N10.resourceId;
                if (i7 != 0) {
                    colorStateList2 = AbstractC1449a.getColorStateList(context, i7);
                } else {
                    int i10 = N10.data;
                    if (i10 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i10);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f15488d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f15488d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f15449C != null && this.f15445A)) && (colorStateList = this.f15473P) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        boolean z8;
        m mVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f15488d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z10 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            u uVar = this.f15484b;
            if (uVar.getMeasuredWidth() > 0) {
                int measuredWidth = uVar.getMeasuredWidth() - this.f15488d.getPaddingLeft();
                if (this.f15504q0 == null || this.f15505r0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f15504q0 = colorDrawable3;
                    this.f15505r0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f15488d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f15504q0;
                if (drawable2 != colorDrawable4) {
                    this.f15488d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z8 = true;
                    mVar = this.f15486c;
                    if ((!mVar.e() || ((mVar.f2968w != 0 && mVar.d()) || mVar.f2953D != null)) && mVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = mVar.f2954E.getMeasuredWidth() - this.f15488d.getPaddingRight();
                        if (!mVar.e()) {
                            checkableImageButton = mVar.f2962c;
                        } else if (mVar.f2968w != 0 && mVar.d()) {
                            checkableImageButton = mVar.f2966u;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f15488d.getCompoundDrawablesRelative();
                        colorDrawable = this.f15507t0;
                        if (colorDrawable != null || this.f15509u0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f15507t0 = colorDrawable5;
                                this.f15509u0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f15507t0;
                            if (drawable == colorDrawable2) {
                                this.f15511v0 = drawable;
                                this.f15488d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z10 = z8;
                            }
                        } else {
                            this.f15509u0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f15488d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f15507t0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f15507t0 == null) {
                            return z8;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.f15488d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f15507t0) {
                            this.f15488d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f15511v0, compoundDrawablesRelative3[3]);
                        } else {
                            z10 = z8;
                        }
                        this.f15507t0 = null;
                    }
                    return z10;
                }
                z8 = false;
                mVar = this.f15486c;
                if (mVar.e()) {
                }
                int measuredWidth22 = mVar.f2954E.getMeasuredWidth() - this.f15488d.getPaddingRight();
                if (!mVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f15488d.getCompoundDrawablesRelative();
                colorDrawable = this.f15507t0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f15507t0;
                if (drawable == colorDrawable2) {
                }
                return z10;
            }
        }
        if (this.f15504q0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f15488d.getCompoundDrawablesRelative();
            this.f15488d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f15504q0 = null;
            z8 = true;
            mVar = this.f15486c;
            if (mVar.e()) {
            }
            int measuredWidth222 = mVar.f2954E.getMeasuredWidth() - this.f15488d.getPaddingRight();
            if (!mVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f15488d.getCompoundDrawablesRelative();
            colorDrawable = this.f15507t0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f15507t0;
            if (drawable == colorDrawable2) {
            }
            return z10;
        }
        z8 = false;
        mVar = this.f15486c;
        if (mVar.e()) {
        }
        int measuredWidth2222 = mVar.f2954E.getMeasuredWidth() - this.f15488d.getPaddingRight();
        if (!mVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f15488d.getCompoundDrawablesRelative();
        colorDrawable = this.f15507t0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f15507t0;
        if (drawable == colorDrawable2) {
        }
        return z10;
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f15488d;
        if (editText == null || this.f15493f0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1737h0.f21500a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f15445A && (appCompatTextView = this.f15449C) != null) {
            mutate.setColorFilter(r.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f15488d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f15488d;
        if (editText == null || this.f15478T == null) {
            return;
        }
        if ((this.f15481W || editText.getBackground() == null) && this.f15493f0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f15488d;
            WeakHashMap weakHashMap = K.f26642a;
            editText2.setBackground(editTextBoxBackground);
            this.f15481W = true;
        }
    }

    public void setBoxBackgroundColor(int i7) {
        if (this.f15499l0 != i7) {
            this.f15499l0 = i7;
            this.C0 = i7;
            this.f15453E0 = i7;
            this.f15455F0 = i7;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i7) {
        setBoxBackgroundColor(AbstractC1449a.getColor(getContext(), i7));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.C0 = defaultColor;
        this.f15499l0 = defaultColor;
        this.f15451D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f15453E0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f15455F0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i7) {
        if (i7 == this.f15493f0) {
            return;
        }
        this.f15493f0 = i7;
        if (this.f15488d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i7) {
        this.f15494g0 = i7;
    }

    public void setBoxCornerFamily(int i7) {
        j e2 = this.f15487c0.e();
        InterfaceC2397c interfaceC2397c = this.f15487c0.f27052e;
        u0 f4 = E6.b.f(i7);
        e2.f6356b = f4;
        j.d(f4);
        e2.f6360f = interfaceC2397c;
        InterfaceC2397c interfaceC2397c2 = this.f15487c0.f27053f;
        u0 f10 = E6.b.f(i7);
        e2.f6357c = f10;
        j.d(f10);
        e2.g = interfaceC2397c2;
        InterfaceC2397c interfaceC2397c3 = this.f15487c0.f27054h;
        u0 f11 = E6.b.f(i7);
        e2.f6359e = f11;
        j.d(f11);
        e2.f6362i = interfaceC2397c3;
        InterfaceC2397c interfaceC2397c4 = this.f15487c0.g;
        u0 f12 = E6.b.f(i7);
        e2.f6358d = f12;
        j.d(f12);
        e2.f6361h = interfaceC2397c4;
        this.f15487c0 = e2.c();
        b();
    }

    public void setBoxStrokeColor(int i7) {
        if (this.f15446A0 != i7) {
            this.f15446A0 = i7;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f15517y0 = colorStateList.getDefaultColor();
            this.f15457G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f15519z0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f15446A0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f15446A0 != colorStateList.getDefaultColor()) {
            this.f15446A0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f15448B0 != colorStateList) {
            this.f15448B0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i7) {
        this.f15496i0 = i7;
        x();
    }

    public void setBoxStrokeWidthFocused(int i7) {
        this.f15497j0 = i7;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i7) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i7));
    }

    public void setBoxStrokeWidthResource(int i7) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i7));
    }

    public void setCounterEnabled(boolean z8) {
        if (this.f15516y != z8) {
            p pVar = this.f15514x;
            if (z8) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f15449C = appCompatTextView;
                appCompatTextView.setId(com.kt.apps.media.xemtv.beta.R.id.textinput_counter);
                Typeface typeface = this.f15503p0;
                if (typeface != null) {
                    this.f15449C.setTypeface(typeface);
                }
                this.f15449C.setMaxLines(1);
                pVar.a(this.f15449C, 2);
                ((ViewGroup.MarginLayoutParams) this.f15449C.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.kt.apps.media.xemtv.beta.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f15449C != null) {
                    EditText editText = this.f15488d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                pVar.g(this.f15449C, 2);
                this.f15449C = null;
            }
            this.f15516y = z8;
        }
    }

    public void setCounterMaxLength(int i7) {
        if (this.f15518z != i7) {
            if (i7 > 0) {
                this.f15518z = i7;
            } else {
                this.f15518z = -1;
            }
            if (!this.f15516y || this.f15449C == null) {
                return;
            }
            EditText editText = this.f15488d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i7) {
        if (this.f15450D != i7) {
            this.f15450D = i7;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f15469N != colorStateList) {
            this.f15469N = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i7) {
        if (this.f15452E != i7) {
            this.f15452E = i7;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f15467M != colorStateList) {
            this.f15467M = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f15471O != colorStateList) {
            this.f15471O = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f15473P != colorStateList) {
            this.f15473P = colorStateList;
            if (m() || (this.f15449C != null && this.f15445A)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f15513w0 = colorStateList;
        this.f15515x0 = colorStateList;
        if (this.f15488d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        k(this, z8);
        super.setEnabled(z8);
    }

    public void setEndIconActivated(boolean z8) {
        this.f15486c.f2966u.setActivated(z8);
    }

    public void setEndIconCheckable(boolean z8) {
        this.f15486c.f2966u.setCheckable(z8);
    }

    public void setEndIconContentDescription(int i7) {
        m mVar = this.f15486c;
        CharSequence text = i7 != 0 ? mVar.getResources().getText(i7) : null;
        CheckableImageButton checkableImageButton = mVar.f2966u;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15486c.f2966u;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i7) {
        m mVar = this.f15486c;
        Drawable x2 = i7 != 0 ? e.x(mVar.getContext(), i7) : null;
        CheckableImageButton checkableImageButton = mVar.f2966u;
        checkableImageButton.setImageDrawable(x2);
        if (x2 != null) {
            ColorStateList colorStateList = mVar.f2970y;
            PorterDuff.Mode mode = mVar.f2971z;
            TextInputLayout textInputLayout = mVar.f2960a;
            Tb.a.b(textInputLayout, checkableImageButton, colorStateList, mode);
            Tb.a.B(textInputLayout, checkableImageButton, mVar.f2970y);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        m mVar = this.f15486c;
        CheckableImageButton checkableImageButton = mVar.f2966u;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = mVar.f2970y;
            PorterDuff.Mode mode = mVar.f2971z;
            TextInputLayout textInputLayout = mVar.f2960a;
            Tb.a.b(textInputLayout, checkableImageButton, colorStateList, mode);
            Tb.a.B(textInputLayout, checkableImageButton, mVar.f2970y);
        }
    }

    public void setEndIconMinSize(int i7) {
        m mVar = this.f15486c;
        if (i7 < 0) {
            mVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i7 != mVar.f2950A) {
            mVar.f2950A = i7;
            CheckableImageButton checkableImageButton = mVar.f2966u;
            checkableImageButton.setMinimumWidth(i7);
            checkableImageButton.setMinimumHeight(i7);
            CheckableImageButton checkableImageButton2 = mVar.f2962c;
            checkableImageButton2.setMinimumWidth(i7);
            checkableImageButton2.setMinimumHeight(i7);
        }
    }

    public void setEndIconMode(int i7) {
        this.f15486c.g(i7);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f15486c;
        View.OnLongClickListener onLongClickListener = mVar.f2952C;
        CheckableImageButton checkableImageButton = mVar.f2966u;
        checkableImageButton.setOnClickListener(onClickListener);
        Tb.a.J(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f15486c;
        mVar.f2952C = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f2966u;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Tb.a.J(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        m mVar = this.f15486c;
        mVar.f2951B = scaleType;
        mVar.f2966u.setScaleType(scaleType);
        mVar.f2962c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        m mVar = this.f15486c;
        if (mVar.f2970y != colorStateList) {
            mVar.f2970y = colorStateList;
            Tb.a.b(mVar.f2960a, mVar.f2966u, colorStateList, mVar.f2971z);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f15486c;
        if (mVar.f2971z != mode) {
            mVar.f2971z = mode;
            Tb.a.b(mVar.f2960a, mVar.f2966u, mVar.f2970y, mode);
        }
    }

    public void setEndIconVisible(boolean z8) {
        this.f15486c.h(z8);
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.f15514x;
        if (!pVar.f2996q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            pVar.f();
            return;
        }
        pVar.c();
        pVar.f2995p = charSequence;
        pVar.f2997r.setText(charSequence);
        int i7 = pVar.f2993n;
        if (i7 != 1) {
            pVar.f2994o = 1;
        }
        pVar.i(pVar.h(pVar.f2997r, charSequence), i7, pVar.f2994o);
    }

    public void setErrorAccessibilityLiveRegion(int i7) {
        p pVar = this.f15514x;
        pVar.f2999t = i7;
        AppCompatTextView appCompatTextView = pVar.f2997r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = K.f26642a;
            appCompatTextView.setAccessibilityLiveRegion(i7);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.f15514x;
        pVar.f2998s = charSequence;
        AppCompatTextView appCompatTextView = pVar.f2997r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z8) {
        p pVar = this.f15514x;
        if (pVar.f2996q == z8) {
            return;
        }
        pVar.c();
        TextInputLayout textInputLayout = pVar.f2989h;
        if (z8) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.g, null);
            pVar.f2997r = appCompatTextView;
            appCompatTextView.setId(com.kt.apps.media.xemtv.beta.R.id.textinput_error);
            pVar.f2997r.setTextAlignment(5);
            Typeface typeface = pVar.f2982B;
            if (typeface != null) {
                pVar.f2997r.setTypeface(typeface);
            }
            int i7 = pVar.f3000u;
            pVar.f3000u = i7;
            AppCompatTextView appCompatTextView2 = pVar.f2997r;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i7);
            }
            ColorStateList colorStateList = pVar.f3001v;
            pVar.f3001v = colorStateList;
            AppCompatTextView appCompatTextView3 = pVar.f2997r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = pVar.f2998s;
            pVar.f2998s = charSequence;
            AppCompatTextView appCompatTextView4 = pVar.f2997r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i10 = pVar.f2999t;
            pVar.f2999t = i10;
            AppCompatTextView appCompatTextView5 = pVar.f2997r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = K.f26642a;
                appCompatTextView5.setAccessibilityLiveRegion(i10);
            }
            pVar.f2997r.setVisibility(4);
            pVar.a(pVar.f2997r, 0);
        } else {
            pVar.f();
            pVar.g(pVar.f2997r, 0);
            pVar.f2997r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        pVar.f2996q = z8;
    }

    public void setErrorIconDrawable(int i7) {
        m mVar = this.f15486c;
        mVar.i(i7 != 0 ? e.x(mVar.getContext(), i7) : null);
        Tb.a.B(mVar.f2960a, mVar.f2962c, mVar.f2963d);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f15486c.i(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m mVar = this.f15486c;
        CheckableImageButton checkableImageButton = mVar.f2962c;
        View.OnLongClickListener onLongClickListener = mVar.f2965f;
        checkableImageButton.setOnClickListener(onClickListener);
        Tb.a.J(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        m mVar = this.f15486c;
        mVar.f2965f = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f2962c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Tb.a.J(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        m mVar = this.f15486c;
        if (mVar.f2963d != colorStateList) {
            mVar.f2963d = colorStateList;
            Tb.a.b(mVar.f2960a, mVar.f2962c, colorStateList, mVar.f2964e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        m mVar = this.f15486c;
        if (mVar.f2964e != mode) {
            mVar.f2964e = mode;
            Tb.a.b(mVar.f2960a, mVar.f2962c, mVar.f2963d, mode);
        }
    }

    public void setErrorTextAppearance(int i7) {
        p pVar = this.f15514x;
        pVar.f3000u = i7;
        AppCompatTextView appCompatTextView = pVar.f2997r;
        if (appCompatTextView != null) {
            pVar.f2989h.l(appCompatTextView, i7);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.f15514x;
        pVar.f3001v = colorStateList;
        AppCompatTextView appCompatTextView = pVar.f2997r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z8) {
        if (this.f15465K0 != z8) {
            this.f15465K0 = z8;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.f15514x;
        if (isEmpty) {
            if (pVar.f3003x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!pVar.f3003x) {
            setHelperTextEnabled(true);
        }
        pVar.c();
        pVar.f3002w = charSequence;
        pVar.f3004y.setText(charSequence);
        int i7 = pVar.f2993n;
        if (i7 != 2) {
            pVar.f2994o = 2;
        }
        pVar.i(pVar.h(pVar.f3004y, charSequence), i7, pVar.f2994o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.f15514x;
        pVar.f2981A = colorStateList;
        AppCompatTextView appCompatTextView = pVar.f3004y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z8) {
        int i7 = 1;
        p pVar = this.f15514x;
        if (pVar.f3003x == z8) {
            return;
        }
        pVar.c();
        if (z8) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.g, null);
            pVar.f3004y = appCompatTextView;
            appCompatTextView.setId(com.kt.apps.media.xemtv.beta.R.id.textinput_helper_text);
            pVar.f3004y.setTextAlignment(5);
            Typeface typeface = pVar.f2982B;
            if (typeface != null) {
                pVar.f3004y.setTypeface(typeface);
            }
            pVar.f3004y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = pVar.f3004y;
            WeakHashMap weakHashMap = K.f26642a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i10 = pVar.f3005z;
            pVar.f3005z = i10;
            AppCompatTextView appCompatTextView3 = pVar.f3004y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i10);
            }
            ColorStateList colorStateList = pVar.f2981A;
            pVar.f2981A = colorStateList;
            AppCompatTextView appCompatTextView4 = pVar.f3004y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            pVar.a(pVar.f3004y, 1);
            pVar.f3004y.setAccessibilityDelegate(new C0072c1(pVar, i7));
        } else {
            pVar.c();
            int i11 = pVar.f2993n;
            if (i11 == 2) {
                pVar.f2994o = 0;
            }
            pVar.i(pVar.h(pVar.f3004y, ""), i11, pVar.f2994o);
            pVar.g(pVar.f3004y, 1);
            pVar.f3004y = null;
            TextInputLayout textInputLayout = pVar.f2989h;
            textInputLayout.r();
            textInputLayout.x();
        }
        pVar.f3003x = z8;
    }

    public void setHelperTextTextAppearance(int i7) {
        p pVar = this.f15514x;
        pVar.f3005z = i7;
        AppCompatTextView appCompatTextView = pVar.f3004y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i7);
        }
    }

    public void setHint(int i7) {
        setHint(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f15475Q) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z8) {
        this.f15466L0 = z8;
    }

    public void setHintEnabled(boolean z8) {
        if (z8 != this.f15475Q) {
            this.f15475Q = z8;
            if (z8) {
                CharSequence hint = this.f15488d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f15476R)) {
                        setHint(hint);
                    }
                    this.f15488d.setHint((CharSequence) null);
                }
                this.f15477S = true;
            } else {
                this.f15477S = false;
                if (!TextUtils.isEmpty(this.f15476R) && TextUtils.isEmpty(this.f15488d.getHint())) {
                    this.f15488d.setHint(this.f15476R);
                }
                setHintInternal(null);
            }
            if (this.f15488d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i7) {
        C1992b c1992b = this.f15463J0;
        TextInputLayout textInputLayout = c1992b.f24125a;
        d dVar = new d(textInputLayout.getContext(), i7);
        ColorStateList colorStateList = dVar.j;
        if (colorStateList != null) {
            c1992b.k = colorStateList;
        }
        float f4 = dVar.k;
        if (f4 != 0.0f) {
            c1992b.f24138i = f4;
        }
        ColorStateList colorStateList2 = dVar.f25085a;
        if (colorStateList2 != null) {
            c1992b.f24119U = colorStateList2;
        }
        c1992b.f24117S = dVar.f25089e;
        c1992b.f24118T = dVar.f25090f;
        c1992b.f24116R = dVar.g;
        c1992b.f24120V = dVar.f25092i;
        C2146a c2146a = c1992b.f24152y;
        if (c2146a != null) {
            c2146a.f25079m = true;
        }
        o7.o oVar = new o7.o(c1992b, 7);
        dVar.a();
        c1992b.f24152y = new C2146a(oVar, dVar.f25095n);
        dVar.c(textInputLayout.getContext(), c1992b.f24152y);
        c1992b.h(false);
        this.f15515x0 = c1992b.k;
        if (this.f15488d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f15515x0 != colorStateList) {
            if (this.f15513w0 == null) {
                C1992b c1992b = this.f15463J0;
                if (c1992b.k != colorStateList) {
                    c1992b.k = colorStateList;
                    c1992b.h(false);
                }
            }
            this.f15515x0 = colorStateList;
            if (this.f15488d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(x xVar) {
        this.f15447B = xVar;
    }

    public void setMaxEms(int i7) {
        this.f15508u = i7;
        EditText editText = this.f15488d;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxEms(i7);
    }

    public void setMaxWidth(int i7) {
        this.f15512w = i7;
        EditText editText = this.f15488d;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMaxWidth(i7);
    }

    public void setMaxWidthResource(int i7) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    public void setMinEms(int i7) {
        this.f15492f = i7;
        EditText editText = this.f15488d;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinEms(i7);
    }

    public void setMinWidth(int i7) {
        this.f15510v = i7;
        EditText editText = this.f15488d;
        if (editText == null || i7 == -1) {
            return;
        }
        editText.setMinWidth(i7);
    }

    public void setMinWidthResource(int i7) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i7));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i7) {
        m mVar = this.f15486c;
        mVar.f2966u.setContentDescription(i7 != 0 ? mVar.getResources().getText(i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f15486c.f2966u.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i7) {
        m mVar = this.f15486c;
        mVar.f2966u.setImageDrawable(i7 != 0 ? e.x(mVar.getContext(), i7) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f15486c.f2966u.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z8) {
        m mVar = this.f15486c;
        if (z8 && mVar.f2968w != 1) {
            mVar.g(1);
        } else if (z8) {
            mVar.getClass();
        } else {
            mVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        m mVar = this.f15486c;
        mVar.f2970y = colorStateList;
        Tb.a.b(mVar.f2960a, mVar.f2966u, colorStateList, mVar.f2971z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        m mVar = this.f15486c;
        mVar.f2971z = mode;
        Tb.a.b(mVar.f2960a, mVar.f2966u, mVar.f2970y, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f15458H == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f15458H = appCompatTextView;
            appCompatTextView.setId(com.kt.apps.media.xemtv.beta.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f15458H;
            WeakHashMap weakHashMap = K.f26642a;
            appCompatTextView2.setImportantForAccessibility(2);
            C0730g d10 = d();
            this.f15464K = d10;
            d10.f12588b = 67L;
            this.L = d();
            setPlaceholderTextAppearance(this.f15462J);
            setPlaceholderTextColor(this.f15460I);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f15456G) {
                setPlaceholderTextEnabled(true);
            }
            this.f15454F = charSequence;
        }
        EditText editText = this.f15488d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i7) {
        this.f15462J = i7;
        AppCompatTextView appCompatTextView = this.f15458H;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i7);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f15460I != colorStateList) {
            this.f15460I = colorStateList;
            AppCompatTextView appCompatTextView = this.f15458H;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        u uVar = this.f15484b;
        uVar.getClass();
        uVar.f3023c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        uVar.f3022b.setText(charSequence);
        uVar.e();
    }

    public void setPrefixTextAppearance(int i7) {
        this.f15484b.f3022b.setTextAppearance(i7);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f15484b.f3022b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C2404j c2404j) {
        C2401g c2401g = this.f15478T;
        if (c2401g == null || c2401g.f27035a.f27011a == c2404j) {
            return;
        }
        this.f15487c0 = c2404j;
        b();
    }

    public void setStartIconCheckable(boolean z8) {
        this.f15484b.f3024d.setCheckable(z8);
    }

    public void setStartIconContentDescription(int i7) {
        setStartIconContentDescription(i7 != 0 ? getResources().getText(i7) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15484b.f3024d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i7) {
        setStartIconDrawable(i7 != 0 ? e.x(getContext(), i7) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f15484b.b(drawable);
    }

    public void setStartIconMinSize(int i7) {
        u uVar = this.f15484b;
        if (i7 < 0) {
            uVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i7 != uVar.f3027u) {
            uVar.f3027u = i7;
            CheckableImageButton checkableImageButton = uVar.f3024d;
            checkableImageButton.setMinimumWidth(i7);
            checkableImageButton.setMinimumHeight(i7);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u uVar = this.f15484b;
        View.OnLongClickListener onLongClickListener = uVar.f3029w;
        CheckableImageButton checkableImageButton = uVar.f3024d;
        checkableImageButton.setOnClickListener(onClickListener);
        Tb.a.J(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u uVar = this.f15484b;
        uVar.f3029w = onLongClickListener;
        CheckableImageButton checkableImageButton = uVar.f3024d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Tb.a.J(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u uVar = this.f15484b;
        uVar.f3028v = scaleType;
        uVar.f3024d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u uVar = this.f15484b;
        if (uVar.f3025e != colorStateList) {
            uVar.f3025e = colorStateList;
            Tb.a.b(uVar.f3021a, uVar.f3024d, colorStateList, uVar.f3026f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u uVar = this.f15484b;
        if (uVar.f3026f != mode) {
            uVar.f3026f = mode;
            Tb.a.b(uVar.f3021a, uVar.f3024d, uVar.f3025e, mode);
        }
    }

    public void setStartIconVisible(boolean z8) {
        this.f15484b.c(z8);
    }

    public void setSuffixText(CharSequence charSequence) {
        m mVar = this.f15486c;
        mVar.getClass();
        mVar.f2953D = TextUtils.isEmpty(charSequence) ? null : charSequence;
        mVar.f2954E.setText(charSequence);
        mVar.n();
    }

    public void setSuffixTextAppearance(int i7) {
        this.f15486c.f2954E.setTextAppearance(i7);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f15486c.f2954E.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(w wVar) {
        EditText editText = this.f15488d;
        if (editText != null) {
            K.n(editText, wVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f15503p0) {
            this.f15503p0 = typeface;
            this.f15463J0.m(typeface);
            p pVar = this.f15514x;
            if (typeface != pVar.f2982B) {
                pVar.f2982B = typeface;
                AppCompatTextView appCompatTextView = pVar.f2997r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = pVar.f3004y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f15449C;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f15493f0 != 1) {
            FrameLayout frameLayout = this.f15482a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z8, boolean z10) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f15488d;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f15488d;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f15513w0;
        C1992b c1992b = this.f15463J0;
        if (colorStateList2 != null) {
            c1992b.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f15513w0;
            c1992b.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f15457G0) : this.f15457G0));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.f15514x.f2997r;
            c1992b.i(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f15445A && (appCompatTextView = this.f15449C) != null) {
            c1992b.i(appCompatTextView.getTextColors());
        } else if (z12 && (colorStateList = this.f15515x0) != null && c1992b.k != colorStateList) {
            c1992b.k = colorStateList;
            c1992b.h(false);
        }
        m mVar = this.f15486c;
        u uVar = this.f15484b;
        if (z11 || !this.f15465K0 || (isEnabled() && z12)) {
            if (z10 || this.f15461I0) {
                ValueAnimator valueAnimator = this.f15468M0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f15468M0.cancel();
                }
                if (z8 && this.f15466L0) {
                    a(1.0f);
                } else {
                    c1992b.k(1.0f);
                }
                this.f15461I0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f15488d;
                v(editText3 != null ? editText3.getText() : null);
                uVar.f3030x = false;
                uVar.e();
                mVar.f2955F = false;
                mVar.n();
                return;
            }
            return;
        }
        if (z10 || !this.f15461I0) {
            ValueAnimator valueAnimator2 = this.f15468M0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f15468M0.cancel();
            }
            if (z8 && this.f15466L0) {
                a(0.0f);
            } else {
                c1992b.k(0.0f);
            }
            if (e() && !((C6.f) this.f15478T).L.f2929q.isEmpty() && e()) {
                ((C6.f) this.f15478T).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f15461I0 = true;
            AppCompatTextView appCompatTextView3 = this.f15458H;
            if (appCompatTextView3 != null && this.f15456G) {
                appCompatTextView3.setText((CharSequence) null);
                y.a(this.f15482a, this.L);
                this.f15458H.setVisibility(4);
            }
            uVar.f3030x = true;
            uVar.e();
            mVar.f2955F = true;
            mVar.n();
        }
    }

    public final void v(Editable editable) {
        ((A4.p) this.f15447B).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f15482a;
        if (length != 0 || this.f15461I0) {
            AppCompatTextView appCompatTextView = this.f15458H;
            if (appCompatTextView == null || !this.f15456G) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            y.a(frameLayout, this.L);
            this.f15458H.setVisibility(4);
            return;
        }
        if (this.f15458H == null || !this.f15456G || TextUtils.isEmpty(this.f15454F)) {
            return;
        }
        this.f15458H.setText(this.f15454F);
        y.a(frameLayout, this.f15464K);
        this.f15458H.setVisibility(0);
        this.f15458H.bringToFront();
        announceForAccessibility(this.f15454F);
    }

    public final void w(boolean z8, boolean z10) {
        int defaultColor = this.f15448B0.getDefaultColor();
        int colorForState = this.f15448B0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f15448B0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z8) {
            this.f15498k0 = colorForState2;
        } else if (z10) {
            this.f15498k0 = colorForState;
        } else {
            this.f15498k0 = defaultColor;
        }
    }

    public final void x() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f15478T == null || this.f15493f0 == 0) {
            return;
        }
        boolean z8 = false;
        boolean z10 = isFocused() || ((editText2 = this.f15488d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f15488d) != null && editText.isHovered())) {
            z8 = true;
        }
        if (!isEnabled()) {
            this.f15498k0 = this.f15457G0;
        } else if (m()) {
            if (this.f15448B0 != null) {
                w(z10, z8);
            } else {
                this.f15498k0 = getErrorCurrentTextColors();
            }
        } else if (!this.f15445A || (appCompatTextView = this.f15449C) == null) {
            if (z10) {
                this.f15498k0 = this.f15446A0;
            } else if (z8) {
                this.f15498k0 = this.f15519z0;
            } else {
                this.f15498k0 = this.f15517y0;
            }
        } else if (this.f15448B0 != null) {
            w(z10, z8);
        } else {
            this.f15498k0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        m mVar = this.f15486c;
        mVar.l();
        CheckableImageButton checkableImageButton = mVar.f2962c;
        ColorStateList colorStateList = mVar.f2963d;
        TextInputLayout textInputLayout = mVar.f2960a;
        Tb.a.B(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = mVar.f2970y;
        CheckableImageButton checkableImageButton2 = mVar.f2966u;
        Tb.a.B(textInputLayout, checkableImageButton2, colorStateList2);
        if (mVar.b() instanceof i) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                Tb.a.b(textInputLayout, checkableImageButton2, mVar.f2970y, mVar.f2971z);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        u uVar = this.f15484b;
        Tb.a.B(uVar.f3021a, uVar.f3024d, uVar.f3025e);
        if (this.f15493f0 == 2) {
            int i7 = this.f15495h0;
            if (z10 && isEnabled()) {
                this.f15495h0 = this.f15497j0;
            } else {
                this.f15495h0 = this.f15496i0;
            }
            if (this.f15495h0 != i7 && e() && !this.f15461I0) {
                if (e()) {
                    ((C6.f) this.f15478T).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f15493f0 == 1) {
            if (!isEnabled()) {
                this.f15499l0 = this.f15451D0;
            } else if (z8 && !z10) {
                this.f15499l0 = this.f15455F0;
            } else if (z10) {
                this.f15499l0 = this.f15453E0;
            } else {
                this.f15499l0 = this.C0;
            }
        }
        b();
    }
}
