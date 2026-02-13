package m6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import q1.AbstractC1875a;
import r1.InterfaceC1914a;
import s6.l;
import s6.m;
import s6.o;
import w6.AbstractC2221a;
import y6.C2395a;
import y6.C2400f;
import y6.C2401g;

/* renamed from: m6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630f extends C2401g implements Drawable.Callback, l {

    /* renamed from: T0, reason: collision with root package name */
    public static final int[] f20692T0 = {R.attr.state_enabled};

    /* renamed from: U0, reason: collision with root package name */
    public static final ShapeDrawable f20693U0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    public int f20694A0;

    /* renamed from: B0, reason: collision with root package name */
    public int f20695B0;
    public int C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f20696D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f20697E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f20698F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f20699G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f20700H0;

    /* renamed from: I0, reason: collision with root package name */
    public ColorFilter f20701I0;

    /* renamed from: J0, reason: collision with root package name */
    public PorterDuffColorFilter f20702J0;

    /* renamed from: K0, reason: collision with root package name */
    public ColorStateList f20703K0;
    public ColorStateList L;

    /* renamed from: L0, reason: collision with root package name */
    public PorterDuff.Mode f20704L0;

    /* renamed from: M, reason: collision with root package name */
    public ColorStateList f20705M;

    /* renamed from: M0, reason: collision with root package name */
    public int[] f20706M0;

    /* renamed from: N, reason: collision with root package name */
    public float f20707N;

    /* renamed from: N0, reason: collision with root package name */
    public ColorStateList f20708N0;

    /* renamed from: O, reason: collision with root package name */
    public float f20709O;

    /* renamed from: O0, reason: collision with root package name */
    public WeakReference f20710O0;

    /* renamed from: P, reason: collision with root package name */
    public ColorStateList f20711P;

    /* renamed from: P0, reason: collision with root package name */
    public TextUtils.TruncateAt f20712P0;

    /* renamed from: Q, reason: collision with root package name */
    public float f20713Q;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f20714Q0;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f20715R;

    /* renamed from: R0, reason: collision with root package name */
    public int f20716R0;

    /* renamed from: S, reason: collision with root package name */
    public CharSequence f20717S;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f20718S0;

    /* renamed from: T, reason: collision with root package name */
    public boolean f20719T;

    /* renamed from: U, reason: collision with root package name */
    public Drawable f20720U;

    /* renamed from: V, reason: collision with root package name */
    public ColorStateList f20721V;

    /* renamed from: W, reason: collision with root package name */
    public float f20722W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f20723X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f20724Y;

    /* renamed from: Z, reason: collision with root package name */
    public Drawable f20725Z;

    /* renamed from: a0, reason: collision with root package name */
    public RippleDrawable f20726a0;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f20727b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f20728c0;

    /* renamed from: d0, reason: collision with root package name */
    public SpannableStringBuilder f20729d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f20730e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f20731f0;

    /* renamed from: g0, reason: collision with root package name */
    public Drawable f20732g0;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f20733h0;

    /* renamed from: i0, reason: collision with root package name */
    public d6.b f20734i0;

    /* renamed from: j0, reason: collision with root package name */
    public d6.b f20735j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f20736k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f20737l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f20738m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f20739n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f20740o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f20741p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f20742q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f20743r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Context f20744s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Paint f20745t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Paint.FontMetrics f20746u0;

    /* renamed from: v0, reason: collision with root package name */
    public final RectF f20747v0;

    /* renamed from: w0, reason: collision with root package name */
    public final PointF f20748w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Path f20749x0;

    /* renamed from: y0, reason: collision with root package name */
    public final m f20750y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f20751z0;

    public C1630f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.chipStyle, com.kt.apps.media.xemtv.beta.R.style.Widget_MaterialComponents_Chip_Action);
        this.f20709O = -1.0f;
        this.f20745t0 = new Paint(1);
        this.f20746u0 = new Paint.FontMetrics();
        this.f20747v0 = new RectF();
        this.f20748w0 = new PointF();
        this.f20749x0 = new Path();
        this.f20700H0 = 255;
        this.f20704L0 = PorterDuff.Mode.SRC_IN;
        this.f20710O0 = new WeakReference(null);
        i(context);
        this.f20744s0 = context;
        m mVar = new m(this);
        this.f20750y0 = mVar;
        this.f20717S = "";
        mVar.f24174a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f20692T0;
        setState(iArr);
        if (!Arrays.equals(this.f20706M0, iArr)) {
            this.f20706M0 = iArr;
            if (T()) {
                w(getState(), iArr);
            }
        }
        this.f20714Q0 = true;
        int[] iArr2 = AbstractC2221a.f25808a;
        f20693U0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z8) {
        if (this.f20731f0 != z8) {
            boolean R10 = R();
            this.f20731f0 = z8;
            boolean R11 = R();
            if (R10 != R11) {
                if (R11) {
                    o(this.f20732g0);
                } else {
                    U(this.f20732g0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void B(float f4) {
        if (this.f20709O != f4) {
            this.f20709O = f4;
            L7.j e2 = this.f27035a.f27011a.e();
            e2.f6360f = new C2395a(f4);
            e2.g = new C2395a(f4);
            e2.f6361h = new C2395a(f4);
            e2.f6362i = new C2395a(f4);
            setShapeAppearanceModel(e2.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f20720U;
        if (drawable3 != 0) {
            boolean z8 = drawable3 instanceof InterfaceC1914a;
            drawable2 = drawable3;
            if (z8) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q10 = q();
            this.f20720U = drawable != null ? drawable.mutate() : null;
            float q11 = q();
            U(drawable2);
            if (S()) {
                o(this.f20720U);
            }
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void D(float f4) {
        if (this.f20722W != f4) {
            float q10 = q();
            this.f20722W = f4;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f20723X = true;
        if (this.f20721V != colorStateList) {
            this.f20721V = colorStateList;
            if (S()) {
                this.f20720U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z8) {
        if (this.f20719T != z8) {
            boolean S7 = S();
            this.f20719T = z8;
            boolean S10 = S();
            if (S7 != S10) {
                if (S10) {
                    o(this.f20720U);
                } else {
                    U(this.f20720U);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.f20711P != colorStateList) {
            this.f20711P = colorStateList;
            if (this.f20718S0) {
                C2400f c2400f = this.f27035a;
                if (c2400f.f27014d != colorStateList) {
                    c2400f.f27014d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f4) {
        if (this.f20713Q != f4) {
            this.f20713Q = f4;
            this.f20745t0.setStrokeWidth(f4);
            if (this.f20718S0) {
                this.f27035a.j = f4;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f20725Z;
        if (drawable3 != 0) {
            boolean z8 = drawable3 instanceof InterfaceC1914a;
            drawable2 = drawable3;
            if (z8) {
            }
            if (drawable2 == drawable) {
                float r10 = r();
                this.f20725Z = drawable != null ? drawable.mutate() : null;
                int[] iArr = AbstractC2221a.f25808a;
                this.f20726a0 = new RippleDrawable(AbstractC2221a.b(this.f20715R), this.f20725Z, f20693U0);
                float r11 = r();
                U(drawable2);
                if (T()) {
                    o(this.f20725Z);
                }
                invalidateSelf();
                if (r10 != r11) {
                    v();
                    return;
                }
                return;
            }
            return;
        }
        drawable2 = null;
        if (drawable2 == drawable) {
        }
    }

    public final void J(float f4) {
        if (this.f20742q0 != f4) {
            this.f20742q0 = f4;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void K(float f4) {
        if (this.f20728c0 != f4) {
            this.f20728c0 = f4;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void L(float f4) {
        if (this.f20741p0 != f4) {
            this.f20741p0 = f4;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f20727b0 != colorStateList) {
            this.f20727b0 = colorStateList;
            if (T()) {
                this.f20725Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z8) {
        if (this.f20724Y != z8) {
            boolean T10 = T();
            this.f20724Y = z8;
            boolean T11 = T();
            if (T10 != T11) {
                if (T11) {
                    o(this.f20725Z);
                } else {
                    U(this.f20725Z);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f4) {
        if (this.f20738m0 != f4) {
            float q10 = q();
            this.f20738m0 = f4;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void P(float f4) {
        if (this.f20737l0 != f4) {
            float q10 = q();
            this.f20737l0 = f4;
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.f20715R != colorStateList) {
            this.f20715R = colorStateList;
            this.f20708N0 = null;
            onStateChange(getState());
        }
    }

    public final boolean R() {
        return this.f20731f0 && this.f20732g0 != null && this.f20698F0;
    }

    public final boolean S() {
        return this.f20719T && this.f20720U != null;
    }

    public final boolean T() {
        return this.f20724Y && this.f20725Z != null;
    }

    @Override // s6.l
    public final void a() {
        v();
        invalidateSelf();
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7;
        RectF rectF;
        int i10;
        int i11;
        int i12;
        RectF rectF2;
        float f4;
        int i13;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i7 = this.f20700H0) == 0) {
            return;
        }
        int saveLayerAlpha = i7 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i7) : 0;
        boolean z8 = this.f20718S0;
        Paint paint = this.f20745t0;
        RectF rectF3 = this.f20747v0;
        if (!z8) {
            paint.setColor(this.f20751z0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (!this.f20718S0) {
            paint.setColor(this.f20694A0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f20701I0;
            if (colorFilter == null) {
                colorFilter = this.f20702J0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (this.f20718S0) {
            super.draw(canvas);
        }
        if (this.f20713Q > 0.0f && !this.f20718S0) {
            paint.setColor(this.C0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f20718S0) {
                ColorFilter colorFilter2 = this.f20701I0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f20702J0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f10 = bounds.left;
            float f11 = this.f20713Q / 2.0f;
            rectF3.set(f10 + f11, bounds.top + f11, bounds.right - f11, bounds.bottom - f11);
            float f12 = this.f20709O - (this.f20713Q / 2.0f);
            canvas.drawRoundRect(rectF3, f12, f12, paint);
        }
        paint.setColor(this.f20696D0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f20718S0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f20749x0;
            C2400f c2400f = this.f27035a;
            this.f27030F.b(c2400f.f27011a, c2400f.f27018i, rectF4, this.f27029E, path);
            e(canvas, paint, path, this.f27035a.f27011a, g());
        } else {
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (S()) {
            p(bounds, rectF3);
            float f13 = rectF3.left;
            float f14 = rectF3.top;
            canvas.translate(f13, f14);
            this.f20720U.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f20720U.draw(canvas);
            canvas.translate(-f13, -f14);
        }
        if (R()) {
            p(bounds, rectF3);
            float f15 = rectF3.left;
            float f16 = rectF3.top;
            canvas.translate(f15, f16);
            this.f20732g0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f20732g0.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (!this.f20714Q0 || this.f20717S == null) {
            rectF = rectF3;
            i10 = saveLayerAlpha;
            i11 = 0;
            i12 = 255;
        } else {
            PointF pointF = this.f20748w0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f20717S;
            m mVar = this.f20750y0;
            if (charSequence != null) {
                float q10 = q() + this.f20736k0 + this.f20739n0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + q10;
                } else {
                    pointF.x = bounds.right - q10;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = mVar.f24174a;
                Paint.FontMetrics fontMetrics = this.f20746u0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f20717S != null) {
                float q11 = q() + this.f20736k0 + this.f20739n0;
                float r10 = r() + this.f20743r0 + this.f20740o0;
                if (getLayoutDirection() == 0) {
                    rectF3.left = bounds.left + q11;
                    rectF3.right = bounds.right - r10;
                } else {
                    rectF3.left = bounds.left + r10;
                    rectF3.right = bounds.right - q11;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            v6.d dVar = mVar.g;
            TextPaint textPaint2 = mVar.f24174a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                mVar.g.e(this.f20744s0, textPaint2, mVar.f24175b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.f20717S.toString();
            if (mVar.f24178e) {
                mVar.a(charSequence2);
                f4 = mVar.f24176c;
            } else {
                f4 = mVar.f24176c;
            }
            boolean z10 = Math.round(f4) > Math.round(rectF3.width());
            if (z10) {
                i13 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i13 = 0;
            }
            CharSequence charSequence3 = this.f20717S;
            if (z10 && this.f20712P0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.f20712P0);
            }
            CharSequence charSequence4 = charSequence3;
            int length = charSequence4.length();
            float f17 = pointF.x;
            float f18 = pointF.y;
            rectF = rectF3;
            i10 = saveLayerAlpha;
            i11 = 0;
            i12 = 255;
            canvas.drawText(charSequence4, 0, length, f17, f18, textPaint2);
            if (z10) {
                canvas.restoreToCount(i13);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f19 = this.f20743r0 + this.f20742q0;
                if (getLayoutDirection() == 0) {
                    float f20 = bounds.right - f19;
                    rectF2 = rectF;
                    rectF2.right = f20;
                    rectF2.left = f20 - this.f20728c0;
                } else {
                    rectF2 = rectF;
                    float f21 = bounds.left + f19;
                    rectF2.left = f21;
                    rectF2.right = f21 + this.f20728c0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f22 = this.f20728c0;
                float f23 = exactCenterY - (f22 / 2.0f);
                rectF2.top = f23;
                rectF2.bottom = f23 + f22;
            } else {
                rectF2 = rectF;
            }
            float f24 = rectF2.left;
            float f25 = rectF2.top;
            canvas.translate(f24, f25);
            this.f20725Z.setBounds(i11, i11, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = AbstractC2221a.f25808a;
            this.f20726a0.setBounds(this.f20725Z.getBounds());
            this.f20726a0.jumpToCurrentState();
            this.f20726a0.draw(canvas);
            canvas.translate(-f24, -f25);
        }
        if (this.f20700H0 < i12) {
            canvas.restoreToCount(i10);
        }
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f20700H0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f20701I0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f20707N;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f4;
        float q10 = q() + this.f20736k0 + this.f20739n0;
        String charSequence = this.f20717S.toString();
        m mVar = this.f20750y0;
        if (mVar.f24178e) {
            mVar.a(charSequence);
            f4 = mVar.f24176c;
        } else {
            f4 = mVar.f24176c;
        }
        return Math.min(Math.round(r() + f4 + q10 + this.f20740o0 + this.f20743r0), this.f20716R0);
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f20718S0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f20707N, this.f20709O);
        } else {
            outline.setRoundRect(bounds, this.f20709O);
        }
        outline.setAlpha(this.f20700H0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        v6.d dVar;
        ColorStateList colorStateList;
        return t(this.L) || t(this.f20705M) || t(this.f20711P) || !((dVar = this.f20750y0.g) == null || (colorStateList = dVar.j) == null || !colorStateList.isStateful()) || ((this.f20731f0 && this.f20732g0 != null && this.f20730e0) || u(this.f20720U) || u(this.f20732g0) || t(this.f20703K0));
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f20725Z) {
            if (drawable.isStateful()) {
                drawable.setState(this.f20706M0);
            }
            drawable.setTintList(this.f20727b0);
            return;
        }
        Drawable drawable2 = this.f20720U;
        if (drawable == drawable2 && this.f20723X) {
            drawable2.setTintList(this.f20721V);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i7);
        if (S()) {
            onLayoutDirectionChanged |= this.f20720U.setLayoutDirection(i7);
        }
        if (R()) {
            onLayoutDirectionChanged |= this.f20732g0.setLayoutDirection(i7);
        }
        if (T()) {
            onLayoutDirectionChanged |= this.f20725Z.setLayoutDirection(i7);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        boolean onLevelChange = super.onLevelChange(i7);
        if (S()) {
            onLevelChange |= this.f20720U.setLevel(i7);
        }
        if (R()) {
            onLevelChange |= this.f20732g0.setLevel(i7);
        }
        if (T()) {
            onLevelChange |= this.f20725Z.setLevel(i7);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable, s6.l
    public final boolean onStateChange(int[] iArr) {
        if (this.f20718S0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.f20706M0);
    }

    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f4 = this.f20736k0 + this.f20737l0;
            Drawable drawable = this.f20698F0 ? this.f20732g0 : this.f20720U;
            float f10 = this.f20722W;
            if (f10 <= 0.0f && drawable != null) {
                f10 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f11 = rect.left + f4;
                rectF.left = f11;
                rectF.right = f11 + f10;
            } else {
                float f12 = rect.right - f4;
                rectF.right = f12;
                rectF.left = f12 - f10;
            }
            Drawable drawable2 = this.f20698F0 ? this.f20732g0 : this.f20720U;
            float f13 = this.f20722W;
            if (f13 <= 0.0f && drawable2 != null) {
                f13 = (float) Math.ceil(o.d(this.f20744s0, 24));
                if (drawable2.getIntrinsicHeight() <= f13) {
                    f13 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f13;
        }
    }

    public final float q() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f4 = this.f20737l0;
        Drawable drawable = this.f20698F0 ? this.f20732g0 : this.f20720U;
        float f10 = this.f20722W;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        return f10 + f4 + this.f20738m0;
    }

    public final float r() {
        if (T()) {
            return this.f20741p0 + this.f20728c0 + this.f20742q0;
        }
        return 0.0f;
    }

    public final float s() {
        return this.f20718S0 ? this.f27035a.f27011a.f27052e.a(g()) : this.f20709O;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f20700H0 != i7) {
            this.f20700H0 = i7;
            invalidateSelf();
        }
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f20701I0 != colorFilter) {
            this.f20701I0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f20703K0 != colorStateList) {
            this.f20703K0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // y6.C2401g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f20704L0 != mode) {
            this.f20704L0 = mode;
            ColorStateList colorStateList = this.f20703K0;
            this.f20702J0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z10) {
        boolean visible = super.setVisible(z8, z10);
        if (S()) {
            visible |= this.f20720U.setVisible(z8, z10);
        }
        if (R()) {
            visible |= this.f20732g0.setVisible(z8, z10);
        }
        if (T()) {
            visible |= this.f20725Z.setVisible(z8, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        InterfaceC1629e interfaceC1629e = (InterfaceC1629e) this.f20710O0.get();
        if (interfaceC1629e != null) {
            Chip chip = (Chip) interfaceC1629e;
            chip.b(chip.f15270E);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(int[] iArr, int[] iArr2) {
        boolean z8;
        boolean z10;
        int colorForState;
        ColorStateList colorStateList;
        boolean z11 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.L;
        int c10 = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f20751z0) : 0);
        if (this.f20751z0 != c10) {
            this.f20751z0 = c10;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f20705M;
        int c11 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f20694A0) : 0);
        if (this.f20694A0 != c11) {
            this.f20694A0 = c11;
            onStateChange = true;
        }
        int f4 = AbstractC1875a.f(c11, c10);
        if ((this.f20695B0 != f4) | (this.f27035a.f27013c == null)) {
            this.f20695B0 = f4;
            k(ColorStateList.valueOf(f4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f20711P;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.C0) : 0;
        if (this.C0 != colorForState2) {
            this.C0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f20708N0 == null || !AbstractC2221a.c(iArr)) ? 0 : this.f20708N0.getColorForState(iArr, this.f20696D0);
        if (this.f20696D0 != colorForState3) {
            this.f20696D0 = colorForState3;
        }
        v6.d dVar = this.f20750y0.g;
        int colorForState4 = (dVar == null || (colorStateList = dVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f20697E0);
        if (this.f20697E0 != colorForState4) {
            this.f20697E0 = colorForState4;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (state[i7] != 16842912) {
                    i7++;
                } else if (this.f20730e0) {
                    z8 = true;
                }
            }
        }
        z8 = false;
        if (this.f20698F0 != z8 && this.f20732g0 != null) {
            float q10 = q();
            this.f20698F0 = z8;
            if (q10 != q()) {
                onStateChange = true;
                z10 = true;
                ColorStateList colorStateList5 = this.f20703K0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f20699G0) : 0;
                if (this.f20699G0 == colorForState) {
                    this.f20699G0 = colorForState;
                    ColorStateList colorStateList6 = this.f20703K0;
                    PorterDuff.Mode mode = this.f20704L0;
                    this.f20702J0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z11 = onStateChange;
                }
                if (u(this.f20720U)) {
                    z11 |= this.f20720U.setState(iArr);
                }
                if (u(this.f20732g0)) {
                    z11 |= this.f20732g0.setState(iArr);
                }
                if (u(this.f20725Z)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z11 |= this.f20725Z.setState(iArr3);
                }
                int[] iArr4 = AbstractC2221a.f25808a;
                if (u(this.f20726a0)) {
                    z11 |= this.f20726a0.setState(iArr2);
                }
                if (z11) {
                    invalidateSelf();
                }
                if (z10) {
                    v();
                }
                return z11;
            }
            onStateChange = true;
        }
        z10 = false;
        ColorStateList colorStateList52 = this.f20703K0;
        if (colorStateList52 == null) {
        }
        if (this.f20699G0 == colorForState) {
        }
        if (u(this.f20720U)) {
        }
        if (u(this.f20732g0)) {
        }
        if (u(this.f20725Z)) {
        }
        int[] iArr42 = AbstractC2221a.f25808a;
        if (u(this.f20726a0)) {
        }
        if (z11) {
        }
        if (z10) {
        }
        return z11;
    }

    public final void x(boolean z8) {
        if (this.f20730e0 != z8) {
            this.f20730e0 = z8;
            float q10 = q();
            if (!z8 && this.f20698F0) {
                this.f20698F0 = false;
            }
            float q11 = q();
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f20732g0 != drawable) {
            float q10 = q();
            this.f20732g0 = drawable;
            float q11 = q();
            U(this.f20732g0);
            o(this.f20732g0);
            invalidateSelf();
            if (q10 != q11) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f20733h0 != colorStateList) {
            this.f20733h0 = colorStateList;
            if (this.f20731f0 && (drawable = this.f20732g0) != null && this.f20730e0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }
}
