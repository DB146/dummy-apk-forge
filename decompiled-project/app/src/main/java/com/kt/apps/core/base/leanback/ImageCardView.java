package com.kt.apps.core.base.leanback;

import A9.AbstractC0118o;
import a2.AbstractC0708a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import y1.K;

/* loaded from: classes2.dex */
public class ImageCardView extends AbstractC0118o {

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f15943G;

    /* renamed from: H, reason: collision with root package name */
    public final ViewGroup f15944H;

    /* renamed from: I, reason: collision with root package name */
    public final TextView f15945I;

    /* renamed from: J, reason: collision with root package name */
    public final TextView f15946J;

    /* renamed from: K, reason: collision with root package name */
    public final ImageView f15947K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public final ObjectAnimator f15948M;

    public ImageCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setFocusable(true);
        setFocusableInTouchMode(true);
        LayoutInflater from = LayoutInflater.from(getContext());
        from.inflate(R.layout.lb_image_card_view, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0708a.g;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.imageCardViewStyle, R.style.Widget_Leanback_ImageCardView);
        K.m(this, getContext(), iArr, attributeSet, obtainStyledAttributes, R.attr.imageCardViewStyle, R.style.Widget_Leanback_ImageCardView);
        int i7 = obtainStyledAttributes.getInt(1, 0);
        boolean z8 = i7 == 0;
        boolean z10 = (i7 & 1) == 1;
        boolean z11 = (i7 & 2) == 2;
        boolean z12 = (i7 & 4) == 4;
        boolean z13 = !z12 && (i7 & 8) == 8;
        ImageView imageView = (ImageView) findViewById(R.id.main_image);
        this.f15943G = imageView;
        if (imageView.getDrawable() == null) {
            this.f15943G.setVisibility(4);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f15943G, "alpha", 1.0f);
        this.f15948M = ofFloat;
        ofFloat.setDuration(this.f15943G.getResources().getInteger(android.R.integer.config_shortAnimTime));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.info_field);
        this.f15944H = viewGroup;
        if (z8) {
            removeView(viewGroup);
            obtainStyledAttributes.recycle();
            return;
        }
        if (z10) {
            TextView textView = (TextView) from.inflate(R.layout.lb_image_card_view_themed_title, viewGroup, false);
            this.f15945I = textView;
            this.f15944H.addView(textView);
        }
        if (z11) {
            TextView textView2 = (TextView) from.inflate(R.layout.lb_image_card_view_themed_content, this.f15944H, false);
            this.f15946J = textView2;
            this.f15944H.addView(textView2);
        }
        if (z12 || z13) {
            ImageView imageView2 = (ImageView) from.inflate(z13 ? R.layout.lb_image_card_view_themed_badge_left : R.layout.lb_image_card_view_themed_badge_right, this.f15944H, false);
            this.f15947K = imageView2;
            this.f15944H.addView(imageView2);
        }
        if (z10 && !z11 && this.f15947K != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f15945I.getLayoutParams();
            if (z13) {
                layoutParams.addRule(17, this.f15947K.getId());
            } else {
                layoutParams.addRule(16, this.f15947K.getId());
            }
            this.f15945I.setLayoutParams(layoutParams);
        }
        if (z11) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f15946J.getLayoutParams();
            if (!z10) {
                layoutParams2.addRule(10);
            }
            if (z13) {
                layoutParams2.removeRule(16);
                layoutParams2.removeRule(20);
                layoutParams2.addRule(17, this.f15947K.getId());
            }
            this.f15946J.setLayoutParams(layoutParams2);
        }
        ImageView imageView3 = this.f15947K;
        if (imageView3 != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) imageView3.getLayoutParams();
            if (z11) {
                layoutParams3.addRule(8, this.f15946J.getId());
            } else if (z10) {
                layoutParams3.addRule(8, this.f15945I.getId());
            }
            this.f15947K.setLayoutParams(layoutParams3);
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setInfoAreaBackground(drawable);
        }
        ImageView imageView4 = this.f15947K;
        if (imageView4 != null && imageView4.getDrawable() == null) {
            this.f15947K.setVisibility(8);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(int i7, int i10) {
        ViewGroup.LayoutParams layoutParams = this.f15943G.getLayoutParams();
        layoutParams.width = i7;
        layoutParams.height = i10;
        this.f15943G.setLayoutParams(layoutParams);
    }

    public Drawable getBadgeImage() {
        ImageView imageView = this.f15947K;
        if (imageView == null) {
            return null;
        }
        return imageView.getDrawable();
    }

    public CharSequence getContentText() {
        TextView textView = this.f15946J;
        if (textView == null) {
            return null;
        }
        return textView.getText();
    }

    public Drawable getInfoAreaBackground() {
        ViewGroup viewGroup = this.f15944H;
        if (viewGroup != null) {
            return viewGroup.getBackground();
        }
        return null;
    }

    public Drawable getMainImage() {
        ImageView imageView = this.f15943G;
        if (imageView == null) {
            return null;
        }
        return imageView.getDrawable();
    }

    public final ImageView getMainImageView() {
        return this.f15943G;
    }

    public CharSequence getTitleText() {
        TextView textView = this.f15945I;
        if (textView == null) {
            return null;
        }
        return textView.getText();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        if (this.f15943G.getAlpha() == 0.0f) {
            this.f15943G.setAlpha(0.0f);
            if (this.L) {
                this.f15948M.start();
            }
        }
    }

    @Override // A9.AbstractC0118o, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.L = false;
        this.f15948M.cancel();
        this.f15943G.setAlpha(1.0f);
        super.onDetachedFromWindow();
    }

    public void setBadgeImage(Drawable drawable) {
        ImageView imageView = this.f15947K;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        if (drawable != null) {
            this.f15947K.setVisibility(0);
        } else {
            this.f15947K.setVisibility(8);
        }
    }

    public void setContentText(CharSequence charSequence) {
        TextView textView = this.f15946J;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setInfoAreaBackground(Drawable drawable) {
        ViewGroup viewGroup = this.f15944H;
        if (viewGroup != null) {
            viewGroup.setBackground(drawable);
        }
    }

    public void setInfoAreaBackgroundColor(int i7) {
        ViewGroup viewGroup = this.f15944H;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i7);
        }
    }

    public void setMainImage(Drawable drawable) {
        ImageView imageView = this.f15943G;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            this.f15948M.cancel();
            this.f15943G.setAlpha(1.0f);
            this.f15943G.setVisibility(4);
        } else {
            this.f15943G.setVisibility(0);
            this.f15943G.setAlpha(0.0f);
            if (this.L) {
                this.f15948M.start();
            }
        }
    }

    public void setMainImageAdjustViewBounds(boolean z8) {
        ImageView imageView = this.f15943G;
        if (imageView != null) {
            imageView.setAdjustViewBounds(z8);
        }
    }

    public void setMainImageScaleType(ImageView.ScaleType scaleType) {
        ImageView imageView = this.f15943G;
        if (imageView != null) {
            imageView.setScaleType(scaleType);
        }
    }

    public void setTitleText(CharSequence charSequence) {
        TextView textView = this.f15945I;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }
}
