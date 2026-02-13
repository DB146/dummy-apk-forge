package com.google.android.material.chip;

import A9.O;
import D6.a;
import Q5.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import c6.AbstractC0911a;
import com.google.android.gms.common.api.f;
import com.google.android.material.chip.Chip;
import d6.b;
import i1.C1290a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l1.AbstractC1449a;
import m6.C1626b;
import m6.C1627c;
import m6.C1628d;
import m6.C1630f;
import m6.InterfaceC1629e;
import o.C1750o;
import r1.InterfaceC1914a;
import s6.InterfaceC1996f;
import s6.InterfaceC1997g;
import s6.m;
import s6.o;
import v6.d;
import w1.AbstractC2202f;
import w1.C2198b;
import w6.AbstractC2221a;
import y1.AbstractC2352B;
import y1.K;
import y6.C2404j;
import y6.t;

/* loaded from: classes.dex */
public class Chip extends C1750o implements InterfaceC1629e, t, InterfaceC1997g {
    public static final Rect L = new Rect();

    /* renamed from: M, reason: collision with root package name */
    public static final int[] f15264M = {R.attr.state_selected};

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f15265N = {R.attr.state_checkable};

    /* renamed from: A, reason: collision with root package name */
    public boolean f15266A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f15267B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f15268C;

    /* renamed from: D, reason: collision with root package name */
    public int f15269D;

    /* renamed from: E, reason: collision with root package name */
    public int f15270E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f15271F;

    /* renamed from: G, reason: collision with root package name */
    public final C1628d f15272G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15273H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f15274I;

    /* renamed from: J, reason: collision with root package name */
    public final RectF f15275J;

    /* renamed from: K, reason: collision with root package name */
    public final C1626b f15276K;

    /* renamed from: e, reason: collision with root package name */
    public C1630f f15277e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f15278f;

    /* renamed from: u, reason: collision with root package name */
    public RippleDrawable f15279u;

    /* renamed from: v, reason: collision with root package name */
    public View.OnClickListener f15280v;

    /* renamed from: w, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f15281w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1996f f15282x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f15283y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f15284z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.chipStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.kt.apps.media.xemtv.beta.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f15274I = new Rect();
        this.f15275J = new RectF();
        this.f15276K = new C1626b(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C1630f c1630f = new C1630f(context2, attributeSet);
        int[] iArr = AbstractC0911a.f14405d;
        TypedArray g = o.g(c1630f.f20744s0, attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.chipStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c1630f.f20718S0 = g.hasValue(37);
        Context context3 = c1630f.f20744s0;
        ColorStateList n6 = Tb.a.n(context3, g, 24);
        if (c1630f.L != n6) {
            c1630f.L = n6;
            c1630f.onStateChange(c1630f.getState());
        }
        ColorStateList n8 = Tb.a.n(context3, g, 11);
        if (c1630f.f20705M != n8) {
            c1630f.f20705M = n8;
            c1630f.onStateChange(c1630f.getState());
        }
        float dimension = g.getDimension(19, 0.0f);
        if (c1630f.f20707N != dimension) {
            c1630f.f20707N = dimension;
            c1630f.invalidateSelf();
            c1630f.v();
        }
        if (g.hasValue(12)) {
            c1630f.B(g.getDimension(12, 0.0f));
        }
        c1630f.G(Tb.a.n(context3, g, 22));
        c1630f.H(g.getDimension(23, 0.0f));
        c1630f.Q(Tb.a.n(context3, g, 36));
        String text = g.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(c1630f.f20717S, text);
        m mVar = c1630f.f20750y0;
        if (!equals) {
            c1630f.f20717S = text;
            mVar.f24178e = true;
            c1630f.invalidateSelf();
            c1630f.v();
        }
        d dVar = (!g.hasValue(0) || (resourceId3 = g.getResourceId(0, 0)) == 0) ? null : new d(context3, resourceId3);
        dVar.k = g.getDimension(1, dVar.k);
        mVar.b(dVar, context3);
        int i7 = g.getInt(3, 0);
        if (i7 == 1) {
            c1630f.f20712P0 = TextUtils.TruncateAt.START;
        } else if (i7 == 2) {
            c1630f.f20712P0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i7 == 3) {
            c1630f.f20712P0 = TextUtils.TruncateAt.END;
        }
        c1630f.F(g.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c1630f.F(g.getBoolean(15, false));
        }
        c1630f.C(Tb.a.p(context3, g, 14));
        if (g.hasValue(17)) {
            c1630f.E(Tb.a.n(context3, g, 17));
        }
        c1630f.D(g.getDimension(16, -1.0f));
        c1630f.N(g.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c1630f.N(g.getBoolean(26, false));
        }
        c1630f.I(Tb.a.p(context3, g, 25));
        c1630f.M(Tb.a.n(context3, g, 30));
        c1630f.K(g.getDimension(28, 0.0f));
        c1630f.x(g.getBoolean(6, false));
        c1630f.A(g.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c1630f.A(g.getBoolean(8, false));
        }
        c1630f.y(Tb.a.p(context3, g, 7));
        if (g.hasValue(9)) {
            c1630f.z(Tb.a.n(context3, g, 9));
        }
        c1630f.f20734i0 = (!g.hasValue(39) || (resourceId2 = g.getResourceId(39, 0)) == 0) ? null : b.a(context3, resourceId2);
        c1630f.f20735j0 = (!g.hasValue(33) || (resourceId = g.getResourceId(33, 0)) == 0) ? null : b.a(context3, resourceId);
        float dimension2 = g.getDimension(21, 0.0f);
        if (c1630f.f20736k0 != dimension2) {
            c1630f.f20736k0 = dimension2;
            c1630f.invalidateSelf();
            c1630f.v();
        }
        c1630f.P(g.getDimension(35, 0.0f));
        c1630f.O(g.getDimension(34, 0.0f));
        float dimension3 = g.getDimension(41, 0.0f);
        if (c1630f.f20739n0 != dimension3) {
            c1630f.f20739n0 = dimension3;
            c1630f.invalidateSelf();
            c1630f.v();
        }
        float dimension4 = g.getDimension(40, 0.0f);
        if (c1630f.f20740o0 != dimension4) {
            c1630f.f20740o0 = dimension4;
            c1630f.invalidateSelf();
            c1630f.v();
        }
        c1630f.L(g.getDimension(29, 0.0f));
        c1630f.J(g.getDimension(27, 0.0f));
        float dimension5 = g.getDimension(13, 0.0f);
        if (c1630f.f20743r0 != dimension5) {
            c1630f.f20743r0 = dimension5;
            c1630f.invalidateSelf();
            c1630f.v();
        }
        c1630f.f20716R0 = g.getDimensionPixelSize(4, f.API_PRIORITY_OTHER);
        g.recycle();
        o.a(context2, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.chipStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.chipStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.chipStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Chip_Action);
        this.f15268C = obtainStyledAttributes.getBoolean(32, false);
        this.f15270E = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(o.d(getContext(), 48))));
        obtainStyledAttributes.recycle();
        setChipDrawable(c1630f);
        c1630f.j(AbstractC2352B.e(this));
        o.a(context2, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.chipStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Chip_Action);
        o.b(context2, attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.chipStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.kt.apps.media.xemtv.beta.R.attr.chipStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f15272G = new C1628d(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new C1627c(this));
        }
        setChecked(this.f15283y);
        setText(c1630f.f20717S);
        setEllipsize(c1630f.f20712P0);
        h();
        if (!this.f15277e.f20714Q0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f15268C) {
            setMinHeight(this.f15270E);
        }
        this.f15269D = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: m6.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                Chip chip = Chip.this;
                InterfaceC1996f interfaceC1996f = chip.f15282x;
                if (interfaceC1996f != null) {
                    U2.b bVar = (U2.b) ((C1290a) interfaceC1996f).f18187b;
                    if (!z8 ? bVar.h(chip, bVar.f9507b) : bVar.b(chip)) {
                        bVar.g();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f15281w;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z8);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f15275J;
        rectF.setEmpty();
        if (c() && this.f15280v != null) {
            C1630f c1630f = this.f15277e;
            Rect bounds = c1630f.getBounds();
            rectF.setEmpty();
            if (c1630f.T()) {
                float f4 = c1630f.f20743r0 + c1630f.f20742q0 + c1630f.f20728c0 + c1630f.f20741p0 + c1630f.f20740o0;
                if (c1630f.getLayoutDirection() == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f4;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f4;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i7 = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f15274I;
        rect.set(i7, i10, i11, i12);
        return rect;
    }

    private d getTextAppearance() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20750y0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z8) {
        if (this.f15266A != z8) {
            this.f15266A = z8;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z8) {
        if (this.f15284z != z8) {
            this.f15284z = z8;
            refreshDrawableState();
        }
    }

    public final void b(int i7) {
        this.f15270E = i7;
        if (!this.f15268C) {
            InsetDrawable insetDrawable = this.f15278f;
            if (insetDrawable == null) {
                int[] iArr = AbstractC2221a.f25808a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f15278f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = AbstractC2221a.f25808a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i7 - ((int) this.f15277e.f20707N));
        int max2 = Math.max(0, i7 - this.f15277e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f15278f;
            if (insetDrawable2 == null) {
                int[] iArr3 = AbstractC2221a.f25808a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f15278f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = AbstractC2221a.f25808a;
                    f();
                    return;
                }
                return;
            }
        }
        int i10 = max2 > 0 ? max2 / 2 : 0;
        int i11 = max > 0 ? max / 2 : 0;
        if (this.f15278f != null) {
            Rect rect = new Rect();
            this.f15278f.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                int[] iArr5 = AbstractC2221a.f25808a;
                f();
                return;
            }
        }
        if (getMinHeight() != i7) {
            setMinHeight(i7);
        }
        if (getMinWidth() != i7) {
            setMinWidth(i7);
        }
        this.f15278f = new InsetDrawable((Drawable) this.f15277e, i10, i11, i10, i11);
        int[] iArr6 = AbstractC2221a.f25808a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            Object obj = c1630f.f20725Z;
            if (obj != null) {
                if (obj instanceof InterfaceC1914a) {
                }
                if (obj == null) {
                    return true;
                }
            }
            obj = null;
            if (obj == null) {
            }
        }
        return false;
    }

    public final boolean d() {
        C1630f c1630f = this.f15277e;
        return c1630f != null && c1630f.f20730e0;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i7;
        if (!this.f15273H) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C1628d c1628d = this.f15272G;
        AccessibilityManager accessibilityManager = c1628d.f4973h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Chip chip = c1628d.f20691q;
                int i10 = (chip.c() && chip.getCloseIconTouchBounds().contains(x2, y10)) ? 1 : 0;
                int i11 = c1628d.f4976m;
                if (i11 != i10) {
                    c1628d.f4976m = i10;
                    c1628d.q(i10, 128);
                    c1628d.q(i11, 256);
                }
                if (i10 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i7 = c1628d.f4976m) != Integer.MIN_VALUE) {
                if (i7 == Integer.MIN_VALUE) {
                    return true;
                }
                c1628d.f4976m = Integer.MIN_VALUE;
                c1628d.q(i7, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f15273H) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C1628d c1628d = this.f15272G;
        c1628d.getClass();
        boolean z8 = false;
        int i7 = 0;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        z8 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i10 = 33;
                                } else if (keyCode == 21) {
                                    i10 = 17;
                                } else if (keyCode != 22) {
                                    i10 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i7 < repeatCount && c1628d.m(i10, null)) {
                                    i7++;
                                    z10 = true;
                                }
                                z8 = z10;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i11 = c1628d.f4975l;
                    if (i11 != Integer.MIN_VALUE) {
                        Chip chip = c1628d.f20691q;
                        if (i11 == 0) {
                            chip.performClick();
                        } else if (i11 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f15280v;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f15273H) {
                                chip.f15272G.q(1, 1);
                            }
                        }
                    }
                    z8 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z8 = c1628d.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z8 = c1628d.m(1, null);
            }
        }
        if (!z8 || c1628d.f4975l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // o.C1750o, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i7;
        super.drawableStateChanged();
        C1630f c1630f = this.f15277e;
        boolean z8 = false;
        if (c1630f != null && C1630f.u(c1630f.f20725Z)) {
            C1630f c1630f2 = this.f15277e;
            ?? isEnabled = isEnabled();
            int i10 = isEnabled;
            if (this.f15267B) {
                i10 = isEnabled + 1;
            }
            int i11 = i10;
            if (this.f15266A) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.f15284z) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (this.f15267B) {
                iArr[i7] = 16842908;
                i7++;
            }
            if (this.f15266A) {
                iArr[i7] = 16843623;
                i7++;
            }
            if (this.f15284z) {
                iArr[i7] = 16842919;
                i7++;
            }
            if (isChecked()) {
                iArr[i7] = 16842913;
            }
            if (!Arrays.equals(c1630f2.f20706M0, iArr)) {
                c1630f2.f20706M0 = iArr;
                if (c1630f2.T()) {
                    z8 = c1630f2.w(c1630f2.getState(), iArr);
                }
            }
        }
        if (z8) {
            invalidate();
        }
    }

    public final void e() {
        C1630f c1630f;
        if (!c() || (c1630f = this.f15277e) == null || !c1630f.f20724Y || this.f15280v == null) {
            K.n(this, null);
            this.f15273H = false;
        } else {
            K.n(this, this.f15272G);
            this.f15273H = true;
        }
    }

    public final void f() {
        this.f15279u = new RippleDrawable(AbstractC2221a.b(this.f15277e.f20715R), getBackgroundDrawable(), null);
        this.f15277e.getClass();
        RippleDrawable rippleDrawable = this.f15279u;
        WeakHashMap weakHashMap = K.f26642a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        C1630f c1630f;
        if (TextUtils.isEmpty(getText()) || (c1630f = this.f15277e) == null) {
            return;
        }
        int r10 = (int) (c1630f.r() + c1630f.f20743r0 + c1630f.f20740o0);
        C1630f c1630f2 = this.f15277e;
        int q10 = (int) (c1630f2.q() + c1630f2.f20736k0 + c1630f2.f20739n0);
        if (this.f15278f != null) {
            Rect rect = new Rect();
            this.f15278f.getPadding(rect);
            q10 += rect.left;
            r10 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = K.f26642a;
        setPaddingRelative(q10, paddingTop, r10, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f15271F)) {
            return this.f15271F;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f15288v.f9506a) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f15278f;
        return insetDrawable == null ? this.f15277e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20732g0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20733h0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20705M;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return Math.max(0.0f, c1630f.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f15277e;
    }

    public float getChipEndPadding() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20743r0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C1630f c1630f = this.f15277e;
        if (c1630f == null || (drawable = c1630f.f20720U) == 0) {
            return null;
        }
        boolean z8 = drawable instanceof InterfaceC1914a;
        Drawable drawable2 = drawable;
        if (z8) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20722W;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20721V;
        }
        return null;
    }

    public float getChipMinHeight() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20707N;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20736k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20711P;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20713Q;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C1630f c1630f = this.f15277e;
        if (c1630f == null || (drawable = c1630f.f20725Z) == 0) {
            return null;
        }
        boolean z8 = drawable instanceof InterfaceC1914a;
        Drawable drawable2 = drawable;
        if (z8) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20729d0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20742q0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20728c0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20741p0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20727b0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20712P0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f15273H) {
            C1628d c1628d = this.f15272G;
            if (c1628d.f4975l == 1 || c1628d.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public b getHideMotionSpec() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20735j0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20738m0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20737l0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20715R;
        }
        return null;
    }

    public C2404j getShapeAppearanceModel() {
        return this.f15277e.f27035a.f27011a;
    }

    public b getShowMotionSpec() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20734i0;
        }
        return null;
    }

    public float getTextEndPadding() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20740o0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            return c1630f.f20739n0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            paint.drawableState = c1630f.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f15276K);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        E6.b.A(this, this.f15277e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f15264M);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f15265N);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z8, int i7, Rect rect) {
        super.onFocusChanged(z8, i7, rect);
        if (this.f15273H) {
            C1628d c1628d = this.f15272G;
            int i10 = c1628d.f4975l;
            if (i10 != Integer.MIN_VALUE) {
                c1628d.j(i10);
            }
            if (z8) {
                c1628d.m(i7, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f24158c) {
                i7 = 0;
                for (int i10 = 0; i10 < chipGroup.getChildCount(); i10++) {
                    View childAt = chipGroup.getChildAt(i10);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i10).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
            i7 = -1;
            Object tag = getTag(com.kt.apps.media.xemtv.beta.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o7.o.m(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i7, 1).f22101b);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i7);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        if (this.f15269D != i7) {
            this.f15269D = i7;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f15284z) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z8 = true;
                    }
                }
                z8 = false;
            } else if (this.f15284z) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f15280v;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f15273H) {
                    this.f15272G.q(1, 1);
                }
                z8 = true;
                setCloseIconPressed(false);
            }
            z8 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z8 = true;
            }
            z8 = false;
        }
        return z8 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f15271F = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f15279u) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // o.C1750o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f15279u) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // o.C1750o, android.view.View
    public void setBackgroundResource(int i7) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z8) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.x(z8);
        }
    }

    public void setCheckableResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.x(c1630f.f20744s0.getResources().getBoolean(i7));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        C1630f c1630f = this.f15277e;
        if (c1630f == null) {
            this.f15283y = z8;
        } else if (c1630f.f20730e0) {
            super.setChecked(z8);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z8) {
        setCheckedIconVisible(z8);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i7) {
        setCheckedIconVisible(i7);
    }

    public void setCheckedIconResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.y(e.x(c1630f.f20744s0, i7));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.z(AbstractC1449a.getColorStateList(c1630f.f20744s0, i7));
        }
    }

    public void setCheckedIconVisible(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.A(c1630f.f20744s0.getResources().getBoolean(i7));
        }
    }

    public void setCheckedIconVisible(boolean z8) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.A(z8);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C1630f c1630f = this.f15277e;
        if (c1630f == null || c1630f.f20705M == colorStateList) {
            return;
        }
        c1630f.f20705M = colorStateList;
        c1630f.onStateChange(c1630f.getState());
    }

    public void setChipBackgroundColorResource(int i7) {
        ColorStateList colorStateList;
        C1630f c1630f = this.f15277e;
        if (c1630f == null || c1630f.f20705M == (colorStateList = AbstractC1449a.getColorStateList(c1630f.f20744s0, i7))) {
            return;
        }
        c1630f.f20705M = colorStateList;
        c1630f.onStateChange(c1630f.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.B(f4);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.B(c1630f.f20744s0.getResources().getDimension(i7));
        }
    }

    public void setChipDrawable(C1630f c1630f) {
        C1630f c1630f2 = this.f15277e;
        if (c1630f2 != c1630f) {
            if (c1630f2 != null) {
                c1630f2.f20710O0 = new WeakReference(null);
            }
            this.f15277e = c1630f;
            c1630f.f20714Q0 = false;
            c1630f.f20710O0 = new WeakReference(this);
            b(this.f15270E);
        }
    }

    public void setChipEndPadding(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f == null || c1630f.f20743r0 == f4) {
            return;
        }
        c1630f.f20743r0 = f4;
        c1630f.invalidateSelf();
        c1630f.v();
    }

    public void setChipEndPaddingResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            float dimension = c1630f.f20744s0.getResources().getDimension(i7);
            if (c1630f.f20743r0 != dimension) {
                c1630f.f20743r0 = dimension;
                c1630f.invalidateSelf();
                c1630f.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z8) {
        setChipIconVisible(z8);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i7) {
        setChipIconVisible(i7);
    }

    public void setChipIconResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.C(e.x(c1630f.f20744s0, i7));
        }
    }

    public void setChipIconSize(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.D(f4);
        }
    }

    public void setChipIconSizeResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.D(c1630f.f20744s0.getResources().getDimension(i7));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.E(AbstractC1449a.getColorStateList(c1630f.f20744s0, i7));
        }
    }

    public void setChipIconVisible(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.F(c1630f.f20744s0.getResources().getBoolean(i7));
        }
    }

    public void setChipIconVisible(boolean z8) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.F(z8);
        }
    }

    public void setChipMinHeight(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f == null || c1630f.f20707N == f4) {
            return;
        }
        c1630f.f20707N = f4;
        c1630f.invalidateSelf();
        c1630f.v();
    }

    public void setChipMinHeightResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            float dimension = c1630f.f20744s0.getResources().getDimension(i7);
            if (c1630f.f20707N != dimension) {
                c1630f.f20707N = dimension;
                c1630f.invalidateSelf();
                c1630f.v();
            }
        }
    }

    public void setChipStartPadding(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f == null || c1630f.f20736k0 == f4) {
            return;
        }
        c1630f.f20736k0 = f4;
        c1630f.invalidateSelf();
        c1630f.v();
    }

    public void setChipStartPaddingResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            float dimension = c1630f.f20744s0.getResources().getDimension(i7);
            if (c1630f.f20736k0 != dimension) {
                c1630f.f20736k0 = dimension;
                c1630f.invalidateSelf();
                c1630f.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.G(AbstractC1449a.getColorStateList(c1630f.f20744s0, i7));
        }
    }

    public void setChipStrokeWidth(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.H(f4);
        }
    }

    public void setChipStrokeWidthResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.H(c1630f.f20744s0.getResources().getDimension(i7));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i7) {
        setText(getResources().getString(i7));
    }

    public void setCloseIcon(Drawable drawable) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.I(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C1630f c1630f = this.f15277e;
        if (c1630f == null || c1630f.f20729d0 == charSequence) {
            return;
        }
        String str = C2198b.f25644b;
        C2198b c2198b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C2198b.f25647e : C2198b.f25646d;
        c2198b.getClass();
        O o10 = AbstractC2202f.f25654a;
        c1630f.f20729d0 = c2198b.c(charSequence);
        c1630f.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z8) {
        setCloseIconVisible(z8);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i7) {
        setCloseIconVisible(i7);
    }

    public void setCloseIconEndPadding(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.J(f4);
        }
    }

    public void setCloseIconEndPaddingResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.J(c1630f.f20744s0.getResources().getDimension(i7));
        }
    }

    public void setCloseIconResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.I(e.x(c1630f.f20744s0, i7));
        }
        e();
    }

    public void setCloseIconSize(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.K(f4);
        }
    }

    public void setCloseIconSizeResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.K(c1630f.f20744s0.getResources().getDimension(i7));
        }
    }

    public void setCloseIconStartPadding(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.L(f4);
        }
    }

    public void setCloseIconStartPaddingResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.L(c1630f.f20744s0.getResources().getDimension(i7));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.M(AbstractC1449a.getColorStateList(c1630f.f20744s0, i7));
        }
    }

    public void setCloseIconVisible(int i7) {
        setCloseIconVisible(getResources().getBoolean(i7));
    }

    public void setCloseIconVisible(boolean z8) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.N(z8);
        }
        e();
    }

    @Override // o.C1750o, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // o.C1750o, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        if (i7 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i7, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.j(f4);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f15277e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.f20712P0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        this.f15268C = z8;
        b(this.f15270E);
    }

    @Override // android.widget.TextView
    public void setGravity(int i7) {
        if (i7 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i7);
        }
    }

    public void setHideMotionSpec(b bVar) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.f20735j0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.f20735j0 = b.a(c1630f.f20744s0, i7);
        }
    }

    public void setIconEndPadding(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.O(f4);
        }
    }

    public void setIconEndPaddingResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.O(c1630f.f20744s0.getResources().getDimension(i7));
        }
    }

    public void setIconStartPadding(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.P(f4);
        }
    }

    public void setIconStartPaddingResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.P(c1630f.f20744s0.getResources().getDimension(i7));
        }
    }

    @Override // s6.InterfaceC1997g
    public void setInternalOnCheckedChangeListener(InterfaceC1996f interfaceC1996f) {
        this.f15282x = interfaceC1996f;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
        if (this.f15277e == null) {
            return;
        }
        super.setLayoutDirection(i7);
    }

    @Override // android.widget.TextView
    public void setLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i7);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i7) {
        super.setMaxWidth(i7);
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.f20716R0 = i7;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i7) {
        if (i7 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i7);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15281w = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f15280v = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.Q(colorStateList);
        }
        this.f15277e.getClass();
        f();
    }

    public void setRippleColorResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.Q(AbstractC1449a.getColorStateList(c1630f.f20744s0, i7));
            this.f15277e.getClass();
            f();
        }
    }

    @Override // y6.t
    public void setShapeAppearanceModel(C2404j c2404j) {
        this.f15277e.setShapeAppearanceModel(c2404j);
    }

    public void setShowMotionSpec(b bVar) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.f20734i0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.f20734i0 = b.a(c1630f.f20744s0, i7);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z8) {
        if (!z8) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z8);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C1630f c1630f = this.f15277e;
        if (c1630f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c1630f.f20714Q0 ? null : charSequence, bufferType);
        C1630f c1630f2 = this.f15277e;
        if (c1630f2 == null || TextUtils.equals(c1630f2.f20717S, charSequence)) {
            return;
        }
        c1630f2.f20717S = charSequence;
        c1630f2.f20750y0.f24178e = true;
        c1630f2.invalidateSelf();
        c1630f2.v();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i7) {
        super.setTextAppearance(i7);
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            Context context = c1630f.f20744s0;
            c1630f.f20750y0.b(new d(context, i7), context);
        }
        h();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            Context context2 = c1630f.f20744s0;
            c1630f.f20750y0.b(new d(context2, i7), context2);
        }
        h();
    }

    public void setTextAppearance(d dVar) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            c1630f.f20750y0.b(dVar, c1630f.f20744s0);
        }
        h();
    }

    public void setTextAppearanceResource(int i7) {
        setTextAppearance(getContext(), i7);
    }

    public void setTextEndPadding(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f == null || c1630f.f20740o0 == f4) {
            return;
        }
        c1630f.f20740o0 = f4;
        c1630f.invalidateSelf();
        c1630f.v();
    }

    public void setTextEndPaddingResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            float dimension = c1630f.f20744s0.getResources().getDimension(i7);
            if (c1630f.f20740o0 != dimension) {
                c1630f.f20740o0 = dimension;
                c1630f.invalidateSelf();
                c1630f.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f4) {
        super.setTextSize(i7, f4);
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            float applyDimension = TypedValue.applyDimension(i7, f4, getResources().getDisplayMetrics());
            m mVar = c1630f.f20750y0;
            d dVar = mVar.g;
            if (dVar != null) {
                dVar.k = applyDimension;
                mVar.f24174a.setTextSize(applyDimension);
                c1630f.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f4) {
        C1630f c1630f = this.f15277e;
        if (c1630f == null || c1630f.f20739n0 == f4) {
            return;
        }
        c1630f.f20739n0 = f4;
        c1630f.invalidateSelf();
        c1630f.v();
    }

    public void setTextStartPaddingResource(int i7) {
        C1630f c1630f = this.f15277e;
        if (c1630f != null) {
            float dimension = c1630f.f20744s0.getResources().getDimension(i7);
            if (c1630f.f20739n0 != dimension) {
                c1630f.f20739n0 = dimension;
                c1630f.invalidateSelf();
                c1630f.v();
            }
        }
    }
}
