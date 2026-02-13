package j6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;
import q3.f;
import w6.AbstractC2221a;
import y1.K;
import y6.C2400f;
import y6.C2401g;
import y6.C2404j;
import y6.t;

/* renamed from: j6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1383c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f18648a;

    /* renamed from: b, reason: collision with root package name */
    public C2404j f18649b;

    /* renamed from: c, reason: collision with root package name */
    public int f18650c;

    /* renamed from: d, reason: collision with root package name */
    public int f18651d;

    /* renamed from: e, reason: collision with root package name */
    public int f18652e;

    /* renamed from: f, reason: collision with root package name */
    public int f18653f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f18654h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f18655i;
    public ColorStateList j;
    public ColorStateList k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f18656l;

    /* renamed from: m, reason: collision with root package name */
    public C2401g f18657m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18661q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f18663s;

    /* renamed from: t, reason: collision with root package name */
    public int f18664t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18658n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18659o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18660p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18662r = true;

    public C1383c(MaterialButton materialButton, C2404j c2404j) {
        this.f18648a = materialButton;
        this.f18649b = c2404j;
    }

    public final t a() {
        RippleDrawable rippleDrawable = this.f18663s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f18663s.getNumberOfLayers() > 2 ? (t) this.f18663s.getDrawable(2) : (t) this.f18663s.getDrawable(1);
    }

    public final C2401g b(boolean z8) {
        RippleDrawable rippleDrawable = this.f18663s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C2401g) ((LayerDrawable) ((InsetDrawable) this.f18663s.getDrawable(0)).getDrawable()).getDrawable(!z8 ? 1 : 0);
    }

    public final void c(C2404j c2404j) {
        this.f18649b = c2404j;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(c2404j);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(c2404j);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(c2404j);
        }
    }

    public final void d(int i7, int i10) {
        WeakHashMap weakHashMap = K.f26642a;
        MaterialButton materialButton = this.f18648a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f18652e;
        int i12 = this.f18653f;
        this.f18653f = i10;
        this.f18652e = i7;
        if (!this.f18659o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i7) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void e() {
        C2401g c2401g = new C2401g(this.f18649b);
        MaterialButton materialButton = this.f18648a;
        c2401g.i(materialButton.getContext());
        c2401g.setTintList(this.j);
        PorterDuff.Mode mode = this.f18655i;
        if (mode != null) {
            c2401g.setTintMode(mode);
        }
        float f4 = this.f18654h;
        ColorStateList colorStateList = this.k;
        c2401g.f27035a.j = f4;
        c2401g.invalidateSelf();
        C2400f c2400f = c2401g.f27035a;
        if (c2400f.f27014d != colorStateList) {
            c2400f.f27014d = colorStateList;
            c2401g.onStateChange(c2401g.getState());
        }
        C2401g c2401g2 = new C2401g(this.f18649b);
        c2401g2.setTint(0);
        float f10 = this.f18654h;
        int p10 = this.f18658n ? f.p(materialButton, R.attr.colorSurface) : 0;
        c2401g2.f27035a.j = f10;
        c2401g2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(p10);
        C2400f c2400f2 = c2401g2.f27035a;
        if (c2400f2.f27014d != valueOf) {
            c2400f2.f27014d = valueOf;
            c2401g2.onStateChange(c2401g2.getState());
        }
        C2401g c2401g3 = new C2401g(this.f18649b);
        this.f18657m = c2401g3;
        c2401g3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2221a.b(this.f18656l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c2401g2, c2401g}), this.f18650c, this.f18652e, this.f18651d, this.f18653f), this.f18657m);
        this.f18663s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C2401g b2 = b(false);
        if (b2 != null) {
            b2.j(this.f18664t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        C2401g b2 = b(false);
        C2401g b10 = b(true);
        if (b2 != null) {
            float f4 = this.f18654h;
            ColorStateList colorStateList = this.k;
            b2.f27035a.j = f4;
            b2.invalidateSelf();
            C2400f c2400f = b2.f27035a;
            if (c2400f.f27014d != colorStateList) {
                c2400f.f27014d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b10 != null) {
                float f10 = this.f18654h;
                int p10 = this.f18658n ? f.p(this.f18648a, R.attr.colorSurface) : 0;
                b10.f27035a.j = f10;
                b10.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(p10);
                C2400f c2400f2 = b10.f27035a;
                if (c2400f2.f27014d != valueOf) {
                    c2400f2.f27014d = valueOf;
                    b10.onStateChange(b10.getState());
                }
            }
        }
    }
}
