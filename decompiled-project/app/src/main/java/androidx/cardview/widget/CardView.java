package androidx.cardview.widget;

import Y5.C0660y;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ea.C1111f;
import s.AbstractC1968a;
import t.C2013a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f */
    public static final int[] f13105f = {R.attr.colorBackground};

    /* renamed from: u */
    public static final C0660y f13106u = new C0660y(18);

    /* renamed from: a */
    public boolean f13107a;

    /* renamed from: b */
    public boolean f13108b;

    /* renamed from: c */
    public final Rect f13109c;

    /* renamed from: d */
    public final Rect f13110d;

    /* renamed from: e */
    public final C1111f f13111e;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f13109c = rect;
        this.f13110d = new Rect();
        C1111f c1111f = new C1111f(this);
        this.f13111e = c1111f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1968a.f24008a, com.kt.apps.media.xemtv.beta.R.attr.cardViewStyle, com.kt.apps.media.xemtv.beta.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f13105f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.kt.apps.media.xemtv.beta.R.color.cardview_light_background) : getResources().getColor(com.kt.apps.media.xemtv.beta.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f13107a = obtainStyledAttributes.getBoolean(7, false);
        this.f13108b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C0660y c0660y = f13106u;
        C2013a c2013a = new C2013a(valueOf, dimension);
        c1111f.f16837b = c2013a;
        setBackgroundDrawable(c2013a);
        setClipToOutline(true);
        setElevation(dimension2);
        c0660y.d(c1111f, dimension3);
    }

    public static /* synthetic */ void a(CardView cardView, int i7, int i10, int i11, int i12) {
        super.setPadding(i7, i10, i11, i12);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C2013a) ((Drawable) this.f13111e.f16837b)).f24407h;
    }

    public float getCardElevation() {
        return ((CardView) this.f13111e.f16838c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f13109c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f13109c.left;
    }

    public int getContentPaddingRight() {
        return this.f13109c.right;
    }

    public int getContentPaddingTop() {
        return this.f13109c.top;
    }

    public float getMaxCardElevation() {
        return ((C2013a) ((Drawable) this.f13111e.f16837b)).f24405e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f13108b;
    }

    public float getRadius() {
        return ((C2013a) ((Drawable) this.f13111e.f16837b)).f24401a;
    }

    public boolean getUseCompatPadding() {
        return this.f13107a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    public void setCardBackgroundColor(int i7) {
        ColorStateList valueOf = ColorStateList.valueOf(i7);
        C2013a c2013a = (C2013a) ((Drawable) this.f13111e.f16837b);
        if (valueOf == null) {
            c2013a.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c2013a.f24407h = valueOf;
        c2013a.f24402b.setColor(valueOf.getColorForState(c2013a.getState(), c2013a.f24407h.getDefaultColor()));
        c2013a.invalidateSelf();
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C2013a c2013a = (C2013a) ((Drawable) this.f13111e.f16837b);
        if (colorStateList == null) {
            c2013a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c2013a.f24407h = colorStateList;
        c2013a.f24402b.setColor(colorStateList.getColorForState(c2013a.getState(), c2013a.f24407h.getDefaultColor()));
        c2013a.invalidateSelf();
    }

    public void setCardElevation(float f4) {
        ((CardView) this.f13111e.f16838c).setElevation(f4);
    }

    public void setMaxCardElevation(float f4) {
        f13106u.d(this.f13111e, f4);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i7) {
        super.setMinimumHeight(i7);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i7) {
        super.setMinimumWidth(i7);
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i7, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z8) {
        if (z8 != this.f13108b) {
            this.f13108b = z8;
            C0660y c0660y = f13106u;
            C1111f c1111f = this.f13111e;
            c0660y.d(c1111f, ((C2013a) ((Drawable) c1111f.f16837b)).f24405e);
        }
    }

    public void setRadius(float f4) {
        C2013a c2013a = (C2013a) ((Drawable) this.f13111e.f16837b);
        if (f4 == c2013a.f24401a) {
            return;
        }
        c2013a.f24401a = f4;
        c2013a.b(null);
        c2013a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.f13107a != z8) {
            this.f13107a = z8;
            C0660y c0660y = f13106u;
            C1111f c1111f = this.f13111e;
            c0660y.d(c1111f, ((C2013a) ((Drawable) c1111f.f16837b)).f24405e);
        }
    }
}
