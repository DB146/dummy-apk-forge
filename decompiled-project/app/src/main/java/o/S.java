package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import h.AbstractC1213a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l1.AbstractC1449a;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21421a;

    /* renamed from: b, reason: collision with root package name */
    public m4.O0 f21422b;

    /* renamed from: c, reason: collision with root package name */
    public m4.O0 f21423c;

    /* renamed from: d, reason: collision with root package name */
    public m4.O0 f21424d;

    /* renamed from: e, reason: collision with root package name */
    public m4.O0 f21425e;

    /* renamed from: f, reason: collision with root package name */
    public m4.O0 f21426f;
    public m4.O0 g;

    /* renamed from: h, reason: collision with root package name */
    public m4.O0 f21427h;

    /* renamed from: i, reason: collision with root package name */
    public final C1723a0 f21428i;
    public int j = 0;
    public int k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f21429l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21430m;

    public S(TextView textView) {
        this.f21421a = textView;
        this.f21428i = new C1723a0(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [m4.O0, java.lang.Object] */
    public static m4.O0 c(Context context, r rVar, int i7) {
        ColorStateList f4;
        synchronized (rVar) {
            f4 = rVar.f21581a.f(context, i7);
        }
        if (f4 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f20119b = true;
        obj.f20120c = f4;
        return obj;
    }

    public final void a(Drawable drawable, m4.O0 o02) {
        if (drawable == null || o02 == null) {
            return;
        }
        r.e(drawable, o02, this.f21421a.getDrawableState());
    }

    public final void b() {
        m4.O0 o02 = this.f21422b;
        TextView textView = this.f21421a;
        if (o02 != null || this.f21423c != null || this.f21424d != null || this.f21425e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f21422b);
            a(compoundDrawables[1], this.f21423c);
            a(compoundDrawables[2], this.f21424d);
            a(compoundDrawables[3], this.f21425e);
        }
        if (this.f21426f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f21426f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        m4.O0 o02 = this.f21427h;
        if (o02 != null) {
            return (ColorStateList) o02.f20120c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        m4.O0 o02 = this.f21427h;
        if (o02 != null) {
            return (PorterDuff.Mode) o02.f20121d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i7) {
        boolean z8;
        boolean z10;
        String str;
        String str2;
        boolean z11;
        int i10;
        int i11;
        int i12;
        float f4;
        ColorStateList colorStateList;
        int resourceId;
        int i13;
        int resourceId2;
        int i14;
        TextView textView = this.f21421a;
        Context context = textView.getContext();
        r a9 = r.a();
        int[] iArr = AbstractC1213a.f17572h;
        l2.X u3 = l2.X.u(context, attributeSet, iArr, i7);
        y1.K.m(textView, textView.getContext(), iArr, attributeSet, (TypedArray) u3.f19195c, i7, 0);
        TypedArray typedArray = (TypedArray) u3.f19195c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f21422b = c(context, a9, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f21423c = c(context, a9, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f21424d = c(context, a9, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f21425e = c(context, a9, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f21426f = c(context, a9, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a9, typedArray.getResourceId(6, 0));
        }
        u3.w();
        boolean z12 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC1213a.f17585w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            l2.X x2 = new l2.X(context, obtainStyledAttributes);
            if (z12 || !obtainStyledAttributes.hasValue(14)) {
                z8 = false;
                z10 = false;
            } else {
                z8 = obtainStyledAttributes.getBoolean(14, false);
                z10 = true;
            }
            m(context, x2);
            int i15 = Build.VERSION.SDK_INT;
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i14 = 26;
            } else {
                i14 = 26;
                str2 = null;
            }
            str = (i15 < i14 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            x2.w();
        } else {
            z8 = false;
            z10 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        l2.X x10 = new l2.X(context, obtainStyledAttributes2);
        if (z12 || !obtainStyledAttributes2.hasValue(14)) {
            z11 = z8;
        } else {
            z11 = obtainStyledAttributes2.getBoolean(14, false);
            z10 = true;
        }
        int i16 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i16 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i16 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, x10);
        x10.w();
        if (!z12 && z10) {
            textView.setAllCaps(z11);
        }
        Typeface typeface = this.f21429l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            P.d(textView, str);
        }
        if (str2 != null) {
            O.b(textView, O.a(str2));
        }
        int[] iArr3 = AbstractC1213a.f17573i;
        C1723a0 c1723a0 = this.f21428i;
        Context context2 = c1723a0.j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, 0);
        TextView textView2 = c1723a0.f21480i;
        y1.K.m(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i7, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c1723a0.f21473a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i17 = 0; i17 < length; i17++) {
                    iArr4[i17] = obtainTypedArray.getDimensionPixelSize(i17, -1);
                }
                c1723a0.f21478f = C1723a0.b(iArr4);
                c1723a0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c1723a0.j()) {
            c1723a0.f21473a = 0;
        } else if (c1723a0.f21473a == 1) {
            if (!c1723a0.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i13 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c1723a0.k(dimension2, dimension3, dimension);
            }
            c1723a0.h();
        }
        if (c1.f21488c && c1723a0.f21473a != 0) {
            int[] iArr5 = c1723a0.f21478f;
            if (iArr5.length > 0) {
                if (P.a(textView) != -1.0f) {
                    P.b(textView, Math.round(c1723a0.f21476d), Math.round(c1723a0.f21477e), Math.round(c1723a0.f21475c), 0);
                } else {
                    P.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b2 = resourceId4 != -1 ? a9.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b10 = resourceId5 != -1 ? a9.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b11 = resourceId6 != -1 ? a9.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b12 = resourceId7 != -1 ? a9.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b13 = resourceId8 != -1 ? a9.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b14 = resourceId9 != -1 ? a9.b(context, resourceId9) : null;
        if (b13 != null || b14 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b13 == null) {
                b13 = compoundDrawablesRelative[0];
            }
            if (b10 == null) {
                b10 = compoundDrawablesRelative[1];
            }
            if (b14 == null) {
                b14 = compoundDrawablesRelative[2];
            }
            if (b12 == null) {
                b12 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b13, b10, b14, b12);
        } else if (b2 != null || b10 != null || b11 != null || b12 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b2 == null) {
                    b2 = compoundDrawables[0];
                }
                if (b10 == null) {
                    b10 = compoundDrawables[1];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[2];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b2, b10, b11, b12);
            } else {
                if (b10 == null) {
                    b10 = compoundDrawablesRelative2[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b10, compoundDrawablesRelative2[2], b12);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC1449a.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i10 = -1;
            textView.setCompoundDrawableTintMode(AbstractC1737h0.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i10 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i10);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i10);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue == null || peekValue.type != 5) {
                i11 = -1;
                f4 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i12 = -1;
            } else {
                int i18 = peekValue.data;
                int i19 = i18 & 15;
                f4 = TypedValue.complexToFloat(i18);
                i12 = i19;
                i11 = -1;
            }
        } else {
            i11 = -1;
            i12 = -1;
            f4 = -1.0f;
        }
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i11) {
            y7.u0.H(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i11) {
            y7.u0.I(textView, dimensionPixelSize2);
        }
        if (f4 != -1.0f) {
            if (i12 == i11) {
                y7.u0.J(textView, (int) f4);
            } else if (Build.VERSION.SDK_INT >= 34) {
                C1.j.i(textView, i12, f4);
            } else {
                y7.u0.J(textView, Math.round(TypedValue.applyDimension(i12, f4, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i7) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC1213a.f17585w);
        l2.X x2 = new l2.X(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f21421a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, x2);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            P.d(textView, string);
        }
        x2.w();
        Typeface typeface = this.f21429l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i7, int i10, int i11, int i12) {
        C1723a0 c1723a0 = this.f21428i;
        if (c1723a0.j()) {
            DisplayMetrics displayMetrics = c1723a0.j.getResources().getDisplayMetrics();
            c1723a0.k(TypedValue.applyDimension(i12, i7, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (c1723a0.h()) {
                c1723a0.a();
            }
        }
    }

    public final void i(int[] iArr, int i7) {
        C1723a0 c1723a0 = this.f21428i;
        if (c1723a0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1723a0.j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i7, iArr[i10], displayMetrics));
                    }
                }
                c1723a0.f21478f = C1723a0.b(iArr2);
                if (!c1723a0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1723a0.g = false;
            }
            if (c1723a0.h()) {
                c1723a0.a();
            }
        }
    }

    public final void j(int i7) {
        C1723a0 c1723a0 = this.f21428i;
        if (c1723a0.j()) {
            if (i7 == 0) {
                c1723a0.f21473a = 0;
                c1723a0.f21476d = -1.0f;
                c1723a0.f21477e = -1.0f;
                c1723a0.f21475c = -1.0f;
                c1723a0.f21478f = new int[0];
                c1723a0.f21474b = false;
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException(h3.o.l(i7, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1723a0.j.getResources().getDisplayMetrics();
            c1723a0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1723a0.h()) {
                c1723a0.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m4.O0, java.lang.Object] */
    public final void k(ColorStateList colorStateList) {
        if (this.f21427h == null) {
            this.f21427h = new Object();
        }
        m4.O0 o02 = this.f21427h;
        o02.f20120c = colorStateList;
        o02.f20119b = colorStateList != null;
        this.f21422b = o02;
        this.f21423c = o02;
        this.f21424d = o02;
        this.f21425e = o02;
        this.f21426f = o02;
        this.g = o02;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m4.O0, java.lang.Object] */
    public final void l(PorterDuff.Mode mode) {
        if (this.f21427h == null) {
            this.f21427h = new Object();
        }
        m4.O0 o02 = this.f21427h;
        o02.f20121d = mode;
        o02.f20118a = mode != null;
        this.f21422b = o02;
        this.f21423c = o02;
        this.f21424d = o02;
        this.f21425e = o02;
        this.f21426f = o02;
        this.g = o02;
    }

    public final void m(Context context, l2.X x2) {
        String string;
        int i7 = this.j;
        TypedArray typedArray = (TypedArray) x2.f19195c;
        this.j = typedArray.getInt(2, i7);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.k = i11;
            if (i11 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f21430m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f21429l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f21429l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f21429l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f21429l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.k;
        int i15 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface p10 = x2.p(i13, this.j, new N(this, i14, i15, new WeakReference(this.f21421a)));
                if (p10 != null) {
                    if (i10 < 28 || this.k == -1) {
                        this.f21429l = p10;
                    } else {
                        this.f21429l = Q.a(Typeface.create(p10, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.f21430m = this.f21429l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f21429l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.f21429l = Typeface.create(string, this.j);
        } else {
            this.f21429l = Q.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
