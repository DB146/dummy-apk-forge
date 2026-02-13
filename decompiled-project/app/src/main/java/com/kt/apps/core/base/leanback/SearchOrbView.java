package com.kt.apps.core.base.leanback;

import A9.J2;
import A9.K2;
import a2.AbstractC0708a;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kt.apps.media.xemtv.beta.R;
import h3.o;
import java.util.WeakHashMap;
import y1.AbstractC2352B;
import y1.K;

/* loaded from: classes2.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f16037A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16038B;

    /* renamed from: C, reason: collision with root package name */
    public final ArgbEvaluator f16039C;

    /* renamed from: D, reason: collision with root package name */
    public final J2 f16040D;

    /* renamed from: E, reason: collision with root package name */
    public ValueAnimator f16041E;

    /* renamed from: F, reason: collision with root package name */
    public final J2 f16042F;

    /* renamed from: a, reason: collision with root package name */
    public View.OnClickListener f16043a;

    /* renamed from: b, reason: collision with root package name */
    public final View f16044b;

    /* renamed from: c, reason: collision with root package name */
    public final View f16045c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f16046d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f16047e;

    /* renamed from: f, reason: collision with root package name */
    public K2 f16048f;

    /* renamed from: u, reason: collision with root package name */
    public final float f16049u;

    /* renamed from: v, reason: collision with root package name */
    public final int f16050v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16051w;

    /* renamed from: x, reason: collision with root package name */
    public final float f16052x;

    /* renamed from: y, reason: collision with root package name */
    public final float f16053y;

    /* renamed from: z, reason: collision with root package name */
    public ValueAnimator f16054z;

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f16039C = new ArgbEvaluator();
        this.f16040D = new J2(this, 0);
        this.f16042F = new J2(this, 1);
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.f16044b = inflate;
        this.f16045c = inflate.findViewById(R.id.search_orb);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        this.f16046d = imageView;
        this.f16049u = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.f16050v = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.f16051w = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.f16053y = dimensionPixelSize;
        this.f16052x = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        int[] iArr = AbstractC0708a.k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        K.m(this, context, iArr, attributeSet, obtainStyledAttributes, i7, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        setOrbIcon(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = obtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        setOrbColors(new K2(color, obtainStyledAttributes.getColor(0, color), obtainStyledAttributes.getColor(3, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        AbstractC2352B.n(imageView, dimensionPixelSize);
    }

    public final void a(boolean z8) {
        float f4 = z8 ? this.f16049u : 1.0f;
        ViewPropertyAnimator scaleY = this.f16044b.animate().scaleX(f4).scaleY(f4);
        long j = this.f16051w;
        scaleY.setDuration(j).start();
        if (this.f16041E == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f16041E = ofFloat;
            ofFloat.addUpdateListener(this.f16042F);
        }
        if (z8) {
            this.f16041E.start();
        } else {
            this.f16041E.reverse();
        }
        this.f16041E.setDuration(j);
        this.f16037A = z8;
        b();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f16054z;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f16054z = null;
        }
        if (this.f16037A && this.f16038B) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.f16039C, Integer.valueOf(this.f16048f.f859a), Integer.valueOf(this.f16048f.f860b), Integer.valueOf(this.f16048f.f859a));
            this.f16054z = ofObject;
            ofObject.setRepeatCount(-1);
            this.f16054z.setDuration(this.f16050v * 2);
            this.f16054z.addUpdateListener(this.f16040D);
            this.f16054z.start();
        }
    }

    public float getFocusedZoom() {
        return this.f16049u;
    }

    public int getLayoutResourceId() {
        return R.layout.lb_search_orb;
    }

    public int getOrbColor() {
        return this.f16048f.f859a;
    }

    public K2 getOrbColors() {
        return this.f16048f;
    }

    public Drawable getOrbIcon() {
        return this.f16047e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16038B = true;
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f16043a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f16038B = false;
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z8, int i7, Rect rect) {
        super.onFocusChanged(z8, i7, rect);
        a(z8);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f16043a = onClickListener;
    }

    public void setOrbColor(int i7) {
        setOrbColors(new K2(i7, i7, 0));
    }

    public void setOrbColors(K2 k22) {
        this.f16048f = k22;
        this.f16046d.setColorFilter(k22.f861c);
        if (this.f16054z == null) {
            setOrbViewColor(this.f16048f.f859a);
        } else {
            this.f16037A = true;
            b();
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.f16047e = drawable;
        this.f16046d.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i7) {
        View view = this.f16045c;
        if (view.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) view.getBackground()).setColor(i7);
        }
    }

    public void setSearchOrbZ(float f4) {
        float f10 = this.f16053y;
        float f11 = this.f16052x;
        float d10 = o.d(f10, f11, f4, f11);
        WeakHashMap weakHashMap = K.f26642a;
        AbstractC2352B.n(this.f16045c, d10);
    }
}
