package v6;

import Z9.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import c6.AbstractC0911a;
import n1.k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f25085a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25087c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25088d;

    /* renamed from: e, reason: collision with root package name */
    public final float f25089e;

    /* renamed from: f, reason: collision with root package name */
    public final float f25090f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25091h;

    /* renamed from: i, reason: collision with root package name */
    public final float f25092i;
    public final ColorStateList j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public final int f25093l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25094m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f25095n;

    public d(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC0911a.f14398E);
        this.k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.j = Tb.a.n(context, obtainStyledAttributes, 3);
        Tb.a.n(context, obtainStyledAttributes, 4);
        Tb.a.n(context, obtainStyledAttributes, 5);
        this.f25087c = obtainStyledAttributes.getInt(2, 0);
        this.f25088d = obtainStyledAttributes.getInt(1, 1);
        int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f25093l = obtainStyledAttributes.getResourceId(i10, 0);
        this.f25086b = obtainStyledAttributes.getString(i10);
        obtainStyledAttributes.getBoolean(14, false);
        this.f25085a = Tb.a.n(context, obtainStyledAttributes, 6);
        this.f25089e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f25090f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i7, AbstractC0911a.f14418t);
        this.f25091h = obtainStyledAttributes2.hasValue(0);
        this.f25092i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f25095n;
        int i7 = this.f25087c;
        if (typeface == null && (str = this.f25086b) != null) {
            this.f25095n = Typeface.create(str, i7);
        }
        if (this.f25095n == null) {
            int i10 = this.f25088d;
            if (i10 == 1) {
                this.f25095n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f25095n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f25095n = Typeface.DEFAULT;
            } else {
                this.f25095n = Typeface.MONOSPACE;
            }
            this.f25095n = Typeface.create(this.f25095n, i7);
        }
    }

    public final Typeface b(Context context) {
        if (this.f25094m) {
            return this.f25095n;
        }
        if (!context.isRestricted()) {
            try {
                int i7 = this.f25093l;
                ThreadLocal threadLocal = k.f21047a;
                Typeface a9 = context.isRestricted() ? null : k.a(context, i7, new TypedValue(), 0, null, false, false);
                this.f25095n = a9;
                if (a9 != null) {
                    this.f25095n = Typeface.create(a9, this.f25087c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f25086b, e2);
            }
        }
        a();
        this.f25094m = true;
        return this.f25095n;
    }

    public final void c(Context context, Y6.b bVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i7 = this.f25093l;
        if (i7 == 0) {
            this.f25094m = true;
        }
        if (this.f25094m) {
            bVar.u(this.f25095n, true);
            return;
        }
        try {
            b bVar2 = new b(this, bVar);
            ThreadLocal threadLocal = k.f21047a;
            if (context.isRestricted()) {
                bVar2.a(-4);
            } else {
                k.a(context, i7, new TypedValue(), 0, bVar2, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f25094m = true;
            bVar.t(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f25086b, e2);
            this.f25094m = true;
            bVar.t(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i7 = this.f25093l;
        if (i7 != 0) {
            ThreadLocal threadLocal = k.f21047a;
            if (!context.isRestricted()) {
                typeface = k.a(context, i7, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, Y6.b bVar) {
        f(context, textPaint, bVar);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f25085a;
        textPaint.setShadowLayer(this.g, this.f25089e, this.f25090f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, Y6.b bVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f25095n);
        c(context, new c(this, context, textPaint, bVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface H10 = x.H(context.getResources().getConfiguration(), typeface);
        if (H10 != null) {
            typeface = H10;
        }
        textPaint.setTypeface(typeface);
        int i7 = (~typeface.getStyle()) & this.f25087c;
        textPaint.setFakeBoldText((i7 & 1) != 0);
        textPaint.setTextSkewX((i7 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.f25091h) {
            textPaint.setLetterSpacing(this.f25092i);
        }
    }
}
