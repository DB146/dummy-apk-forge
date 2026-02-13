package s6;

import Z9.x;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import d6.AbstractC1053a;
import java.util.WeakHashMap;
import v6.C2146a;
import w1.AbstractC2202f;
import y1.K;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1992b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f24100A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f24101B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f24102C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f24104E;

    /* renamed from: F, reason: collision with root package name */
    public float f24105F;

    /* renamed from: G, reason: collision with root package name */
    public float f24106G;

    /* renamed from: H, reason: collision with root package name */
    public float f24107H;

    /* renamed from: I, reason: collision with root package name */
    public float f24108I;

    /* renamed from: J, reason: collision with root package name */
    public float f24109J;

    /* renamed from: K, reason: collision with root package name */
    public int f24110K;
    public int[] L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f24111M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f24112N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f24113O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f24114P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f24115Q;

    /* renamed from: R, reason: collision with root package name */
    public float f24116R;

    /* renamed from: S, reason: collision with root package name */
    public float f24117S;

    /* renamed from: T, reason: collision with root package name */
    public float f24118T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f24119U;

    /* renamed from: V, reason: collision with root package name */
    public float f24120V;

    /* renamed from: W, reason: collision with root package name */
    public float f24121W;

    /* renamed from: X, reason: collision with root package name */
    public float f24122X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f24123Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f24124Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f24125a;

    /* renamed from: a0, reason: collision with root package name */
    public float f24126a0;

    /* renamed from: b, reason: collision with root package name */
    public float f24127b;

    /* renamed from: b0, reason: collision with root package name */
    public float f24128b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f24129c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f24130c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f24131d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f24133e;
    public ColorStateList j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public float f24139l;

    /* renamed from: m, reason: collision with root package name */
    public float f24140m;

    /* renamed from: n, reason: collision with root package name */
    public float f24141n;

    /* renamed from: o, reason: collision with root package name */
    public float f24142o;

    /* renamed from: p, reason: collision with root package name */
    public float f24143p;

    /* renamed from: q, reason: collision with root package name */
    public float f24144q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f24145r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f24146s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f24147t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f24148u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f24149v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f24150w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f24151x;

    /* renamed from: y, reason: collision with root package name */
    public C2146a f24152y;

    /* renamed from: f, reason: collision with root package name */
    public int f24135f = 16;
    public int g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f24137h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f24138i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f24153z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f24103D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f24132d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f24134e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f24136f0 = 1;

    public C1992b(TextInputLayout textInputLayout) {
        this.f24125a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f24112N = textPaint;
        this.f24113O = new TextPaint(textPaint);
        this.f24131d = new Rect();
        this.f24129c = new Rect();
        this.f24133e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f4, int i7, int i10) {
        float f10 = 1.0f - f4;
        return Color.argb(Math.round((Color.alpha(i10) * f4) + (Color.alpha(i7) * f10)), Math.round((Color.red(i10) * f4) + (Color.red(i7) * f10)), Math.round((Color.green(i10) * f4) + (Color.green(i7) * f10)), Math.round((Color.blue(i10) * f4) + (Color.blue(i7) * f10)));
    }

    public static float f(float f4, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return AbstractC1053a.a(f4, f10, f11);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = K.f26642a;
        boolean z8 = this.f24125a.getLayoutDirection() == 1;
        if (this.f24103D) {
            return (z8 ? AbstractC2202f.f25657d : AbstractC2202f.f25656c).f(charSequence, charSequence.length());
        }
        return z8;
    }

    public final void c(float f4, boolean z8) {
        float f10;
        float f11;
        Typeface typeface;
        boolean z10;
        Layout.Alignment alignment;
        if (this.f24100A == null) {
            return;
        }
        float width = this.f24131d.width();
        float width2 = this.f24129c.width();
        if (Math.abs(f4 - 1.0f) < 1.0E-5f) {
            f10 = this.f24138i;
            f11 = this.f24120V;
            this.f24105F = 1.0f;
            typeface = this.f24145r;
        } else {
            float f12 = this.f24137h;
            float f13 = this.f24121W;
            Typeface typeface2 = this.f24148u;
            if (Math.abs(f4 - 0.0f) < 1.0E-5f) {
                this.f24105F = 1.0f;
            } else {
                this.f24105F = f(this.f24137h, this.f24138i, f4, this.f24115Q) / this.f24137h;
            }
            float f14 = this.f24138i / this.f24137h;
            width = (z8 || width2 * f14 <= width) ? width2 : Math.min(width / f14, width2);
            f10 = f12;
            f11 = f13;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f24112N;
        if (width > 0.0f) {
            boolean z11 = this.f24106G != f10;
            boolean z12 = this.f24122X != f11;
            boolean z13 = this.f24151x != typeface;
            StaticLayout staticLayout = this.f24123Y;
            boolean z14 = z11 || z12 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f24111M;
            this.f24106G = f10;
            this.f24122X = f11;
            this.f24151x = typeface;
            this.f24111M = false;
            textPaint.setLinearText(this.f24105F != 1.0f);
            z10 = z14;
        } else {
            z10 = false;
        }
        if (this.f24101B == null || z10) {
            textPaint.setTextSize(this.f24106G);
            textPaint.setTypeface(this.f24151x);
            textPaint.setLetterSpacing(this.f24122X);
            boolean b2 = b(this.f24100A);
            this.f24102C = b2;
            int i7 = this.f24132d0;
            if (i7 <= 1 || b2) {
                i7 = 1;
            }
            if (i7 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f24135f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f24102C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f24102C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            k kVar = new k(this.f24100A, textPaint, (int) width);
            kVar.k = this.f24153z;
            kVar.j = b2;
            kVar.f24170e = alignment;
            kVar.f24173i = false;
            kVar.f24171f = i7;
            kVar.g = this.f24134e0;
            kVar.f24172h = this.f24136f0;
            StaticLayout a9 = kVar.a();
            a9.getClass();
            this.f24123Y = a9;
            this.f24101B = a9.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f24113O;
        textPaint.setTextSize(this.f24138i);
        textPaint.setTypeface(this.f24145r);
        textPaint.setLetterSpacing(this.f24120V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f24147t;
            if (typeface != null) {
                this.f24146s = x.H(configuration, typeface);
            }
            Typeface typeface2 = this.f24150w;
            if (typeface2 != null) {
                this.f24149v = x.H(configuration, typeface2);
            }
            Typeface typeface3 = this.f24146s;
            if (typeface3 == null) {
                typeface3 = this.f24147t;
            }
            this.f24145r = typeface3;
            Typeface typeface4 = this.f24149v;
            if (typeface4 == null) {
                typeface4 = this.f24150w;
            }
            this.f24148u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z8) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f24125a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z8) {
            return;
        }
        c(1.0f, z8);
        CharSequence charSequence = this.f24101B;
        TextPaint textPaint = this.f24112N;
        if (charSequence != null && (staticLayout = this.f24123Y) != null) {
            this.f24130c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f24153z);
        }
        CharSequence charSequence2 = this.f24130c0;
        if (charSequence2 != null) {
            this.f24124Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f24124Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.f24102C ? 1 : 0);
        int i7 = absoluteGravity & 112;
        Rect rect = this.f24131d;
        if (i7 == 48) {
            this.f24140m = rect.top;
        } else if (i7 != 80) {
            this.f24140m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f24140m = textPaint.ascent() + rect.bottom;
        }
        int i10 = absoluteGravity & 8388615;
        if (i10 == 1) {
            this.f24142o = rect.centerX() - (this.f24124Z / 2.0f);
        } else if (i10 != 5) {
            this.f24142o = rect.left;
        } else {
            this.f24142o = rect.right - this.f24124Z;
        }
        c(0.0f, z8);
        float height = this.f24123Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f24123Y;
        if (staticLayout2 == null || this.f24132d0 <= 1) {
            CharSequence charSequence3 = this.f24101B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f24123Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f24135f, this.f24102C ? 1 : 0);
        int i11 = absoluteGravity2 & 112;
        Rect rect2 = this.f24129c;
        if (i11 == 48) {
            this.f24139l = rect2.top;
        } else if (i11 != 80) {
            this.f24139l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f24139l = textPaint.descent() + (rect2.bottom - height);
        }
        int i12 = absoluteGravity2 & 8388615;
        if (i12 == 1) {
            this.f24141n = rect2.centerX() - (measureText / 2.0f);
        } else if (i12 != 5) {
            this.f24141n = rect2.left;
        } else {
            this.f24141n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f24104E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f24104E = null;
        }
        l(this.f24127b);
        float f4 = this.f24127b;
        float f10 = f(rect2.left, rect.left, f4, this.f24114P);
        RectF rectF = this.f24133e;
        rectF.left = f10;
        rectF.top = f(this.f24139l, this.f24140m, f4, this.f24114P);
        rectF.right = f(rect2.right, rect.right, f4, this.f24114P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f4, this.f24114P);
        this.f24143p = f(this.f24141n, this.f24142o, f4, this.f24114P);
        this.f24144q = f(this.f24139l, this.f24140m, f4, this.f24114P);
        l(f4);
        Z1.a aVar = AbstractC1053a.f16532b;
        this.f24126a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f4, aVar);
        WeakHashMap weakHashMap = K.f26642a;
        textInputLayout.postInvalidateOnAnimation();
        this.f24128b0 = f(1.0f, 0.0f, f4, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f4, e(colorStateList2), e(this.k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f11 = this.f24120V;
        float f12 = this.f24121W;
        if (f11 != f12) {
            textPaint.setLetterSpacing(f(f12, f11, f4, aVar));
        } else {
            textPaint.setLetterSpacing(f11);
        }
        this.f24107H = AbstractC1053a.a(0.0f, this.f24116R, f4);
        this.f24108I = AbstractC1053a.a(0.0f, this.f24117S, f4);
        this.f24109J = AbstractC1053a.a(0.0f, this.f24118T, f4);
        int a9 = a(f4, 0, e(this.f24119U));
        this.f24110K = a9;
        textPaint.setShadowLayer(this.f24107H, this.f24108I, this.f24109J, a9);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        C2146a c2146a = this.f24152y;
        if (c2146a != null) {
            c2146a.f25079m = true;
        }
        if (this.f24147t == typeface) {
            return false;
        }
        this.f24147t = typeface;
        Typeface H10 = x.H(this.f24125a.getContext().getResources().getConfiguration(), typeface);
        this.f24146s = H10;
        if (H10 == null) {
            H10 = this.f24147t;
        }
        this.f24145r = H10;
        return true;
    }

    public final void k(float f4) {
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f4 != this.f24127b) {
            this.f24127b = f4;
            float f10 = this.f24129c.left;
            Rect rect = this.f24131d;
            float f11 = f(f10, rect.left, f4, this.f24114P);
            RectF rectF = this.f24133e;
            rectF.left = f11;
            rectF.top = f(this.f24139l, this.f24140m, f4, this.f24114P);
            rectF.right = f(r1.right, rect.right, f4, this.f24114P);
            rectF.bottom = f(r1.bottom, rect.bottom, f4, this.f24114P);
            this.f24143p = f(this.f24141n, this.f24142o, f4, this.f24114P);
            this.f24144q = f(this.f24139l, this.f24140m, f4, this.f24114P);
            l(f4);
            Z1.a aVar = AbstractC1053a.f16532b;
            this.f24126a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f4, aVar);
            WeakHashMap weakHashMap = K.f26642a;
            TextInputLayout textInputLayout = this.f24125a;
            textInputLayout.postInvalidateOnAnimation();
            this.f24128b0 = f(1.0f, 0.0f, f4, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.f24112N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f4, e(colorStateList2), e(this.k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f12 = this.f24120V;
            float f13 = this.f24121W;
            if (f12 != f13) {
                textPaint.setLetterSpacing(f(f13, f12, f4, aVar));
            } else {
                textPaint.setLetterSpacing(f12);
            }
            this.f24107H = AbstractC1053a.a(0.0f, this.f24116R, f4);
            this.f24108I = AbstractC1053a.a(0.0f, this.f24117S, f4);
            this.f24109J = AbstractC1053a.a(0.0f, this.f24118T, f4);
            int a9 = a(f4, 0, e(this.f24119U));
            this.f24110K = a9;
            textPaint.setShadowLayer(this.f24107H, this.f24108I, this.f24109J, a9);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f4) {
        c(f4, false);
        WeakHashMap weakHashMap = K.f26642a;
        this.f24125a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z8;
        boolean j = j(typeface);
        if (this.f24150w != typeface) {
            this.f24150w = typeface;
            Typeface H10 = x.H(this.f24125a.getContext().getResources().getConfiguration(), typeface);
            this.f24149v = H10;
            if (H10 == null) {
                H10 = this.f24150w;
            }
            this.f24148u = H10;
            z8 = true;
        } else {
            z8 = false;
        }
        if (j || z8) {
            h(false);
        }
    }
}
