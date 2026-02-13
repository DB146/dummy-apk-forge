package f6;

import L7.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import s6.l;
import s6.m;
import s6.o;
import v6.d;
import y1.K;
import y6.C2395a;
import y6.C2401g;
import y6.C2404j;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139a extends Drawable implements l {

    /* renamed from: A, reason: collision with root package name */
    public WeakReference f16966A;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f16967a;

    /* renamed from: b, reason: collision with root package name */
    public final C2401g f16968b;

    /* renamed from: c, reason: collision with root package name */
    public final m f16969c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f16970d;

    /* renamed from: e, reason: collision with root package name */
    public final C1141c f16971e;

    /* renamed from: f, reason: collision with root package name */
    public float f16972f;

    /* renamed from: u, reason: collision with root package name */
    public float f16973u;

    /* renamed from: v, reason: collision with root package name */
    public final int f16974v;

    /* renamed from: w, reason: collision with root package name */
    public float f16975w;

    /* renamed from: x, reason: collision with root package name */
    public float f16976x;

    /* renamed from: y, reason: collision with root package name */
    public float f16977y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f16978z;

    public C1139a(Context context) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f16967a = weakReference;
        o.c(context, o.f24181b, "Theme.MaterialComponents");
        this.f16970d = new Rect();
        m mVar = new m(this);
        this.f16969c = mVar;
        TextPaint textPaint = mVar.f24174a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        C1141c c1141c = new C1141c(context);
        this.f16971e = c1141c;
        boolean e2 = e();
        C1140b c1140b = c1141c.f17009b;
        C2401g c2401g = new C2401g(C2404j.a(context, e2 ? c1140b.f17002u.intValue() : c1140b.f17000e.intValue(), e() ? c1140b.f17003v.intValue() : c1140b.f17001f.intValue(), new C2395a(0)).c());
        this.f16968b = c2401g;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && mVar.g != (dVar = new d(context2, c1140b.f16999d.intValue()))) {
            mVar.b(dVar, context2);
            textPaint.setColor(c1140b.f16998c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i7 = c1140b.f17007z;
        if (i7 != -2) {
            this.f16974v = ((int) Math.pow(10.0d, i7 - 1.0d)) - 1;
        } else {
            this.f16974v = c1140b.f16979A;
        }
        mVar.f24178e = true;
        i();
        invalidateSelf();
        mVar.f24178e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c1140b.f16997b.intValue());
        if (c2401g.f27035a.f27013c != valueOf) {
            c2401g.k(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(c1140b.f16998c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f16978z;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f16978z.get();
            WeakReference weakReference3 = this.f16966A;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(c1140b.f16986H.booleanValue(), false);
    }

    @Override // s6.l
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        C1141c c1141c = this.f16971e;
        C1140b c1140b = c1141c.f17009b;
        String str = c1140b.f17005x;
        boolean z8 = str != null;
        WeakReference weakReference = this.f16967a;
        if (z8) {
            int i7 = c1140b.f17007z;
            if (i7 == -2 || str == null || str.length() <= i7) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i7 - 1), "…");
        }
        if (!f()) {
            return null;
        }
        int i10 = this.f16974v;
        C1140b c1140b2 = c1141c.f17009b;
        if (i10 == -2 || d() <= this.f16974v) {
            return NumberFormat.getInstance(c1140b2.f16980B).format(d());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(c1140b2.f16980B, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f16974v), "+");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.f16966A;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i7 = this.f16971e.f17009b.f17006y;
        if (i7 != -1) {
            return i7;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String b2;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f16968b.draw(canvas);
        if (!e() || (b2 = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        m mVar = this.f16969c;
        mVar.f24174a.getTextBounds(b2, 0, b2.length(), rect);
        float exactCenterY = this.f16973u - rect.exactCenterY();
        canvas.drawText(b2, this.f16972f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), mVar.f24174a);
    }

    public final boolean e() {
        return this.f16971e.f17009b.f17005x != null || f();
    }

    public final boolean f() {
        C1140b c1140b = this.f16971e.f17009b;
        return c1140b.f17005x == null && c1140b.f17006y != -1;
    }

    public final void g() {
        Context context = (Context) this.f16967a.get();
        if (context == null) {
            return;
        }
        boolean e2 = e();
        C1141c c1141c = this.f16971e;
        this.f16968b.setShapeAppearanceModel(C2404j.a(context, e2 ? c1141c.f17009b.f17002u.intValue() : c1141c.f17009b.f17000e.intValue(), e() ? c1141c.f17009b.f17003v.intValue() : c1141c.f17009b.f17001f.intValue(), new C2395a(0)).c());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16971e.f17009b.f17004w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f16970d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f16970d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.f16978z = new WeakReference(view);
        this.f16966A = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        float f4;
        float f10;
        float y10;
        float x2;
        float height;
        float width;
        float f11;
        float f12;
        WeakReference weakReference = this.f16967a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f16978z;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f16970d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f16966A;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean e2 = e();
        C1141c c1141c = this.f16971e;
        float f13 = e2 ? c1141c.f17011d : c1141c.f17010c;
        this.f16975w = f13;
        if (f13 != -1.0f) {
            this.f16976x = f13;
            this.f16977y = f13;
        } else {
            this.f16976x = Math.round((e() ? c1141c.g : c1141c.f17012e) / 2.0f);
            this.f16977y = Math.round((e() ? c1141c.f17014h : c1141c.f17013f) / 2.0f);
        }
        if (e()) {
            String b2 = b();
            float f14 = this.f16976x;
            m mVar = this.f16969c;
            if (mVar.f24178e) {
                mVar.a(b2);
                f11 = mVar.f24176c;
            } else {
                f11 = mVar.f24176c;
            }
            this.f16976x = Math.max(f14, (f11 / 2.0f) + c1141c.f17009b.f16987I.intValue());
            float f15 = this.f16977y;
            if (mVar.f24178e) {
                mVar.a(b2);
                f12 = mVar.f24177d;
            } else {
                f12 = mVar.f24177d;
            }
            float max = Math.max(f15, (f12 / 2.0f) + c1141c.f17009b.f16988J.intValue());
            this.f16977y = max;
            this.f16976x = Math.max(this.f16976x, max);
        }
        int intValue = c1141c.f17009b.L.intValue();
        boolean e10 = e();
        C1140b c1140b = c1141c.f17009b;
        if (e10) {
            intValue = c1140b.f16991N.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                intValue = AbstractC1053a.c(AbstractC1053a.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), intValue, intValue - c1140b.f16994Q.intValue());
            }
        }
        int i7 = c1141c.k;
        if (i7 == 0) {
            intValue -= Math.round(this.f16977y);
        }
        int intValue2 = c1140b.f16993P.intValue() + intValue;
        int intValue3 = c1140b.f16985G.intValue();
        if (intValue3 == 8388691 || intValue3 == 8388693) {
            this.f16973u = rect3.bottom - intValue2;
        } else {
            this.f16973u = rect3.top + intValue2;
        }
        int intValue4 = e() ? c1140b.f16990M.intValue() : c1140b.f16989K.intValue();
        if (i7 == 1) {
            intValue4 += e() ? c1141c.j : c1141c.f17015i;
        }
        int intValue5 = c1140b.f16992O.intValue() + intValue4;
        int intValue6 = c1140b.f16985G.intValue();
        if (intValue6 == 8388659 || intValue6 == 8388691) {
            WeakHashMap weakHashMap = K.f26642a;
            this.f16972f = view.getLayoutDirection() == 0 ? (rect3.left - this.f16976x) + intValue5 : (rect3.right + this.f16976x) - intValue5;
        } else {
            WeakHashMap weakHashMap2 = K.f26642a;
            this.f16972f = view.getLayoutDirection() == 0 ? (rect3.right + this.f16976x) - intValue5 : (rect3.left - this.f16976x) + intValue5;
        }
        if (c1140b.f16995R.booleanValue()) {
            View c10 = c();
            if (c10 != null) {
                FrameLayout c11 = c();
                if (c11 == null || c11.getId() != R.id.mtrl_anchor_parent) {
                    f4 = 0.0f;
                    f10 = 0.0f;
                } else if (c10.getParent() instanceof View) {
                    f4 = c10.getY();
                    f10 = c10.getX();
                    c10 = (View) c10.getParent();
                }
                y10 = c10.getY() + (this.f16973u - this.f16977y) + f4;
                x2 = c10.getX() + (this.f16972f - this.f16976x) + f10;
                if (!(c10.getParent() instanceof View)) {
                }
                if (!(c10.getParent() instanceof View)) {
                }
                if (y10 < 0.0f) {
                }
                if (x2 < 0.0f) {
                }
                if (height > 0.0f) {
                }
                if (width > 0.0f) {
                }
            } else if (view.getParent() instanceof View) {
                float y11 = view.getY();
                f10 = view.getX();
                View view2 = (View) view.getParent();
                f4 = y11;
                c10 = view2;
                y10 = c10.getY() + (this.f16973u - this.f16977y) + f4;
                x2 = c10.getX() + (this.f16972f - this.f16976x) + f10;
                height = !(c10.getParent() instanceof View) ? ((this.f16973u + this.f16977y) - (((View) c10.getParent()).getHeight() - c10.getY())) + f4 : 0.0f;
                width = !(c10.getParent() instanceof View) ? ((this.f16972f + this.f16976x) - (((View) c10.getParent()).getWidth() - c10.getX())) + f10 : 0.0f;
                if (y10 < 0.0f) {
                    this.f16973u = Math.abs(y10) + this.f16973u;
                }
                if (x2 < 0.0f) {
                    this.f16972f = Math.abs(x2) + this.f16972f;
                }
                if (height > 0.0f) {
                    this.f16973u -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f16972f -= Math.abs(width);
                }
            }
        }
        float f16 = this.f16972f;
        float f17 = this.f16973u;
        float f18 = this.f16976x;
        float f19 = this.f16977y;
        rect2.set((int) (f16 - f18), (int) (f17 - f19), (int) (f16 + f18), (int) (f17 + f19));
        float f20 = this.f16975w;
        C2401g c2401g = this.f16968b;
        if (f20 != -1.0f) {
            j e11 = c2401g.f27035a.f27011a.e();
            e11.f6360f = new C2395a(f20);
            e11.g = new C2395a(f20);
            e11.f6361h = new C2395a(f20);
            e11.f6362i = new C2395a(f20);
            c2401g.setShapeAppearanceModel(e11.c());
        }
        if (rect.equals(rect2)) {
            return;
        }
        c2401g.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, s6.l
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        C1141c c1141c = this.f16971e;
        c1141c.f17008a.f17004w = i7;
        c1141c.f17009b.f17004w = i7;
        this.f16969c.f24174a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
