package androidx.appcompat.widget;

import A9.Q1;
import Q5.e;
import Z9.x;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import h.AbstractC1213a;
import java.util.WeakHashMap;
import l.a;
import l1.AbstractC1449a;
import l2.X;
import o.AbstractC1737h0;
import o.C1761u;
import o.K0;
import o.S;
import o.c1;
import y1.C2375x;
import y1.K;
import y7.u0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: h0, reason: collision with root package name */
    public static final Q1 f13014h0 = new Q1(19, Float.class, "thumbPos");

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f13015i0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f13016A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13017B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f13018C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f13019D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f13020E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f13021F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f13022G;

    /* renamed from: H, reason: collision with root package name */
    public int f13023H;

    /* renamed from: I, reason: collision with root package name */
    public final int f13024I;

    /* renamed from: J, reason: collision with root package name */
    public float f13025J;

    /* renamed from: K, reason: collision with root package name */
    public float f13026K;
    public final VelocityTracker L;

    /* renamed from: M, reason: collision with root package name */
    public final int f13027M;

    /* renamed from: N, reason: collision with root package name */
    public float f13028N;

    /* renamed from: O, reason: collision with root package name */
    public int f13029O;

    /* renamed from: P, reason: collision with root package name */
    public int f13030P;

    /* renamed from: Q, reason: collision with root package name */
    public int f13031Q;

    /* renamed from: R, reason: collision with root package name */
    public int f13032R;

    /* renamed from: S, reason: collision with root package name */
    public int f13033S;

    /* renamed from: T, reason: collision with root package name */
    public int f13034T;

    /* renamed from: U, reason: collision with root package name */
    public int f13035U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f13036V;

    /* renamed from: W, reason: collision with root package name */
    public final TextPaint f13037W;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f13038a;

    /* renamed from: a0, reason: collision with root package name */
    public final ColorStateList f13039a0;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f13040b;

    /* renamed from: b0, reason: collision with root package name */
    public StaticLayout f13041b0;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f13042c;

    /* renamed from: c0, reason: collision with root package name */
    public StaticLayout f13043c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13044d;

    /* renamed from: d0, reason: collision with root package name */
    public final a f13045d0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13046e;

    /* renamed from: e0, reason: collision with root package name */
    public ObjectAnimator f13047e0;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f13048f;

    /* renamed from: f0, reason: collision with root package name */
    public C1761u f13049f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Rect f13050g0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f13051u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuff.Mode f13052v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13053w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13054x;

    /* renamed from: y, reason: collision with root package name */
    public int f13055y;

    /* renamed from: z, reason: collision with root package name */
    public int f13056z;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, l.a] */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.switchStyle);
        int resourceId;
        this.f13040b = null;
        this.f13042c = null;
        this.f13044d = false;
        this.f13046e = false;
        this.f13051u = null;
        this.f13052v = null;
        this.f13053w = false;
        this.f13054x = false;
        this.L = VelocityTracker.obtain();
        this.f13036V = true;
        this.f13050g0 = new Rect();
        K0.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f13037W = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC1213a.f17584v;
        X u3 = X.u(context, attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.switchStyle);
        K.m(this, context, iArr, attributeSet, (TypedArray) u3.f19195c, com.kt.apps.media.xemtv.beta.R.attr.switchStyle, 0);
        Drawable n6 = u3.n(2);
        this.f13038a = n6;
        if (n6 != null) {
            n6.setCallback(this);
        }
        Drawable n8 = u3.n(11);
        this.f13048f = n8;
        if (n8 != null) {
            n8.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) u3.f19195c;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f13022G = typedArray.getBoolean(3, true);
        this.f13055y = typedArray.getDimensionPixelSize(8, 0);
        this.f13056z = typedArray.getDimensionPixelSize(5, 0);
        this.f13016A = typedArray.getDimensionPixelSize(6, 0);
        this.f13017B = typedArray.getBoolean(4, false);
        ColorStateList m10 = u3.m(9);
        if (m10 != null) {
            this.f13040b = m10;
            this.f13044d = true;
        }
        PorterDuff.Mode c10 = AbstractC1737h0.c(typedArray.getInt(10, -1), null);
        if (this.f13042c != c10) {
            this.f13042c = c10;
            this.f13046e = true;
        }
        if (this.f13044d || this.f13046e) {
            a();
        }
        ColorStateList m11 = u3.m(12);
        if (m11 != null) {
            this.f13051u = m11;
            this.f13053w = true;
        }
        PorterDuff.Mode c11 = AbstractC1737h0.c(typedArray.getInt(13, -1), null);
        if (this.f13052v != c11) {
            this.f13052v = c11;
            this.f13054x = true;
        }
        if (this.f13053w || this.f13054x) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC1213a.f17585w);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC1449a.getColorStateList(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f13039a0 = colorStateList;
            } else {
                this.f13039a0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f4 = dimensionPixelSize;
                if (f4 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f4);
                    requestLayout();
                }
            }
            int i7 = obtainStyledAttributes.getInt(1, -1);
            int i10 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i7 != 1 ? i7 != 2 ? i7 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i10 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
                setSwitchTypeface(defaultFromStyle);
                int i11 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i10;
                textPaint.setFakeBoldText((i11 & 1) != 0);
                textPaint.setTextSkewX((2 & i11) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f19136a = context2.getResources().getConfiguration().locale;
                this.f13045d0 = obj;
            } else {
                this.f13045d0 = null;
            }
            setTextOnInternal(this.f13018C);
            setTextOffInternal(this.f13020E);
            obtainStyledAttributes.recycle();
        }
        new S(this).f(attributeSet, com.kt.apps.media.xemtv.beta.R.attr.switchStyle);
        u3.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f13024I = viewConfiguration.getScaledTouchSlop();
        this.f13027M = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.kt.apps.media.xemtv.beta.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C1761u getEmojiTextViewHelper() {
        if (this.f13049f0 == null) {
            this.f13049f0 = new C1761u(this);
        }
        return this.f13049f0;
    }

    private boolean getTargetCheckedState() {
        return this.f13028N > 0.5f;
    }

    private int getThumbOffset() {
        boolean z8 = c1.f21486a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f13028N : this.f13028N) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f13048f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f13050g0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f13038a;
        Rect b2 = drawable2 != null ? AbstractC1737h0.b(drawable2) : AbstractC1737h0.f21502c;
        return ((((this.f13029O - this.f13031Q) - rect.left) - rect.right) - b2.left) - b2.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f13020E = charSequence;
        C1761u emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod Z7 = ((x) emojiTextViewHelper.f21606b.f8074b).Z(this.f13045d0);
        if (Z7 != null) {
            charSequence = Z7.getTransformation(charSequence, this);
        }
        this.f13021F = charSequence;
        this.f13043c0 = null;
        if (this.f13022G) {
            ((x) this.f13049f0.f21606b.f8074b).A();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f13018C = charSequence;
        C1761u emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod Z7 = ((x) emojiTextViewHelper.f21606b.f8074b).Z(this.f13045d0);
        if (Z7 != null) {
            charSequence = Z7.getTransformation(charSequence, this);
        }
        this.f13019D = charSequence;
        this.f13041b0 = null;
        if (this.f13022G) {
            ((x) this.f13049f0.f21606b.f8074b).A();
        }
    }

    public final void a() {
        Drawable drawable = this.f13038a;
        if (drawable != null) {
            if (this.f13044d || this.f13046e) {
                Drawable mutate = drawable.mutate();
                this.f13038a = mutate;
                if (this.f13044d) {
                    mutate.setTintList(this.f13040b);
                }
                if (this.f13046e) {
                    this.f13038a.setTintMode(this.f13042c);
                }
                if (this.f13038a.isStateful()) {
                    this.f13038a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f13048f;
        if (drawable != null) {
            if (this.f13053w || this.f13054x) {
                Drawable mutate = drawable.mutate();
                this.f13048f = mutate;
                if (this.f13053w) {
                    mutate.setTintList(this.f13051u);
                }
                if (this.f13054x) {
                    this.f13048f.setTintMode(this.f13052v);
                }
                if (this.f13048f.isStateful()) {
                    this.f13048f.setState(getDrawableState());
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        int i10;
        int i11 = this.f13032R;
        int i12 = this.f13033S;
        int i13 = this.f13034T;
        int i14 = this.f13035U;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f13038a;
        Rect b2 = drawable != null ? AbstractC1737h0.b(drawable) : AbstractC1737h0.f21502c;
        Drawable drawable2 = this.f13048f;
        Rect rect = this.f13050g0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i15 = rect.left;
            thumbOffset += i15;
            if (b2 != null) {
                int i16 = b2.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = b2.top;
                int i18 = rect.top;
                i7 = i17 > i18 ? (i17 - i18) + i12 : i12;
                int i19 = b2.right;
                int i20 = rect.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = b2.bottom;
                int i22 = rect.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                    this.f13048f.setBounds(i11, i7, i13, i10);
                }
            } else {
                i7 = i12;
            }
            i10 = i14;
            this.f13048f.setBounds(i11, i7, i13, i10);
        }
        Drawable drawable3 = this.f13038a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i23 = thumbOffset - rect.left;
            int i24 = thumbOffset + this.f13031Q + rect.right;
            this.f13038a.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f4, float f10) {
        super.drawableHotspotChanged(f4, f10);
        Drawable drawable = this.f13038a;
        if (drawable != null) {
            drawable.setHotspot(f4, f10);
        }
        Drawable drawable2 = this.f13048f;
        if (drawable2 != null) {
            drawable2.setHotspot(f4, f10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f13038a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f13048f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z8 = c1.f21486a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f13029O;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f13016A : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z8 = c1.f21486a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f13029O;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f13016A : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return u0.P(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f13022G;
    }

    public boolean getSplitTrack() {
        return this.f13017B;
    }

    public int getSwitchMinWidth() {
        return this.f13056z;
    }

    public int getSwitchPadding() {
        return this.f13016A;
    }

    public CharSequence getTextOff() {
        return this.f13020E;
    }

    public CharSequence getTextOn() {
        return this.f13018C;
    }

    public Drawable getThumbDrawable() {
        return this.f13038a;
    }

    public final float getThumbPosition() {
        return this.f13028N;
    }

    public int getThumbTextPadding() {
        return this.f13055y;
    }

    public ColorStateList getThumbTintList() {
        return this.f13040b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f13042c;
    }

    public Drawable getTrackDrawable() {
        return this.f13048f;
    }

    public ColorStateList getTrackTintList() {
        return this.f13051u;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f13052v;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13038a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f13048f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f13047e0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f13047e0.end();
        this.f13047e0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f13015i0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f13048f;
        Rect rect = this.f13050g0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i7 = this.f13033S;
        int i10 = this.f13035U;
        int i11 = i7 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f13038a;
        if (drawable != null) {
            if (!this.f13017B || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b2 = AbstractC1737h0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b2.left;
                rect.right -= b2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f13041b0 : this.f13043c0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f13039a0;
            TextPaint textPaint = this.f13037W;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f13018C : this.f13020E;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int i13;
        int width;
        int i14;
        int i15;
        int i16;
        super.onLayout(z8, i7, i10, i11, i12);
        int i17 = 0;
        if (this.f13038a != null) {
            Drawable drawable = this.f13048f;
            Rect rect = this.f13050g0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = AbstractC1737h0.b(this.f13038a);
            i13 = Math.max(0, b2.left - rect.left);
            i17 = Math.max(0, b2.right - rect.right);
        } else {
            i13 = 0;
        }
        boolean z10 = c1.f21486a;
        if (getLayoutDirection() == 1) {
            i14 = getPaddingLeft() + i13;
            width = ((this.f13029O + i14) - i13) - i17;
        } else {
            width = (getWidth() - getPaddingRight()) - i17;
            i14 = (width - this.f13029O) + i13 + i17;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i18 = this.f13030P;
            int i19 = height - (i18 / 2);
            i15 = i18 + i19;
            i16 = i19;
        } else if (gravity != 80) {
            i16 = getPaddingTop();
            i15 = this.f13030P + i16;
        } else {
            i15 = getHeight() - getPaddingBottom();
            i16 = i15 - this.f13030P;
        }
        this.f13032R = i14;
        this.f13033S = i16;
        this.f13035U = i15;
        this.f13034T = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13 = 0;
        if (this.f13022G) {
            StaticLayout staticLayout = this.f13041b0;
            TextPaint textPaint = this.f13037W;
            if (staticLayout == null) {
                CharSequence charSequence = this.f13019D;
                this.f13041b0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f13043c0 == null) {
                CharSequence charSequence2 = this.f13021F;
                this.f13043c0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f13038a;
        Rect rect = this.f13050g0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i11 = (this.f13038a.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f13038a.getIntrinsicHeight();
        } else {
            i11 = 0;
            i12 = 0;
        }
        this.f13031Q = Math.max(this.f13022G ? (this.f13055y * 2) + Math.max(this.f13041b0.getWidth(), this.f13043c0.getWidth()) : 0, i11);
        Drawable drawable2 = this.f13048f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i13 = this.f13048f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i14 = rect.left;
        int i15 = rect.right;
        Drawable drawable3 = this.f13038a;
        if (drawable3 != null) {
            Rect b2 = AbstractC1737h0.b(drawable3);
            i14 = Math.max(i14, b2.left);
            i15 = Math.max(i15, b2.right);
        }
        int max = this.f13036V ? Math.max(this.f13056z, (this.f13031Q * 2) + i14 + i15) : this.f13056z;
        int max2 = Math.max(i13, i12);
        this.f13029O = max;
        this.f13030P = max2;
        super.onMeasure(i7, i10);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f13018C : this.f13020E;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        VelocityTracker velocityTracker = this.L;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.f13024I;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.f13023H;
                    if (i10 == 1) {
                        float x2 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        float f4 = i7;
                        if (Math.abs(x2 - this.f13025J) > f4 || Math.abs(y10 - this.f13026K) > f4) {
                            this.f13023H = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f13025J = x2;
                            this.f13026K = y10;
                            return true;
                        }
                    } else if (i10 == 2) {
                        float x10 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f10 = x10 - this.f13025J;
                        float f11 = thumbScrollRange != 0 ? f10 / thumbScrollRange : f10 > 0.0f ? 1.0f : -1.0f;
                        boolean z10 = c1.f21486a;
                        if (getLayoutDirection() == 1) {
                            f11 = -f11;
                        }
                        float f12 = this.f13028N;
                        float f13 = f11 + f12;
                        float f14 = f13 >= 0.0f ? f13 > 1.0f ? 1.0f : f13 : 0.0f;
                        if (f14 != f12) {
                            this.f13025J = x10;
                            setThumbPosition(f14);
                        }
                        return true;
                    }
                }
            }
            if (this.f13023H == 2) {
                this.f13023H = 0;
                boolean z11 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z11) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) > this.f13027M) {
                        boolean z12 = c1.f21486a;
                        z8 = getLayoutDirection() != 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                    } else {
                        z8 = getTargetCheckedState();
                    }
                } else {
                    z8 = isChecked;
                }
                if (z8 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z8);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f13023H = 0;
            velocityTracker.clear();
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (isEnabled() && this.f13038a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f13038a;
                Rect rect = this.f13050g0;
                drawable.getPadding(rect);
                int i11 = this.f13033S - i7;
                int i12 = (this.f13032R + thumbOffset) - i7;
                int i13 = this.f13031Q + i12 + rect.left + rect.right + i7;
                int i14 = this.f13035U + i7;
                if (x11 > i12 && x11 < i13 && y11 > i11 && y11 < i14) {
                    this.f13023H = 1;
                    this.f13025J = x11;
                    this.f13026K = y11;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        super.setChecked(z8);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f13018C;
                if (obj == null) {
                    obj = getResources().getString(com.kt.apps.media.xemtv.beta.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = K.f26642a;
                new C2375x(com.kt.apps.media.xemtv.beta.R.id.tag_state_description, CharSequence.class, 64, 30, 2).e(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f13020E;
            if (obj3 == null) {
                obj3 = getResources().getString(com.kt.apps.media.xemtv.beta.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = K.f26642a;
            new C2375x(com.kt.apps.media.xemtv.beta.R.id.tag_state_description, CharSequence.class, 64, 30, 2).e(this, obj4);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f13047e0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f13014h0, isChecked ? 1.0f : 0.0f);
        this.f13047e0 = ofFloat;
        ofFloat.setDuration(250L);
        this.f13047e0.setAutoCancel(true);
        this.f13047e0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u0.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
        setTextOnInternal(this.f13018C);
        setTextOffInternal(this.f13020E);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z8) {
        this.f13036V = z8;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z8) {
        if (this.f13022G != z8) {
            this.f13022G = z8;
            requestLayout();
            if (z8) {
                ((x) this.f13049f0.f21606b.f8074b).A();
            }
        }
    }

    public void setSplitTrack(boolean z8) {
        this.f13017B = z8;
        invalidate();
    }

    public void setSwitchMinWidth(int i7) {
        this.f13056z = i7;
        requestLayout();
    }

    public void setSwitchPadding(int i7) {
        this.f13016A = i7;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f13037W;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f13020E;
        if (obj == null) {
            obj = getResources().getString(com.kt.apps.media.xemtv.beta.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = K.f26642a;
        new C2375x(com.kt.apps.media.xemtv.beta.R.id.tag_state_description, CharSequence.class, 64, 30, 2).e(this, obj);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f13018C;
        if (obj == null) {
            obj = getResources().getString(com.kt.apps.media.xemtv.beta.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = K.f26642a;
        new C2375x(com.kt.apps.media.xemtv.beta.R.id.tag_state_description, CharSequence.class, 64, 30, 2).e(this, obj);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f13038a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f13038a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f4) {
        this.f13028N = f4;
        invalidate();
    }

    public void setThumbResource(int i7) {
        setThumbDrawable(e.x(getContext(), i7));
    }

    public void setThumbTextPadding(int i7) {
        this.f13055y = i7;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f13040b = colorStateList;
        this.f13044d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f13042c = mode;
        this.f13046e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f13048f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f13048f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i7) {
        setTrackDrawable(e.x(getContext(), i7));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f13051u = colorStateList;
        this.f13053w = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f13052v = mode;
        this.f13054x = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13038a || drawable == this.f13048f;
    }
}
