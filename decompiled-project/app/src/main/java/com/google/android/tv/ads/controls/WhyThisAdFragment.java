package com.google.android.tv.ads.controls;

import A9.C0076d1;
import J3.o;
import L6.a;
import L6.b;
import L6.c;
import W1.C;
import W3.g;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.k;
import com.google.android.gms.internal.atv_ads_framework.zzar;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class WhyThisAdFragment extends C {

    /* renamed from: m0, reason: collision with root package name */
    public ImageView f15702m0;

    /* renamed from: n0, reason: collision with root package name */
    public ConstraintLayout f15703n0;

    /* renamed from: o0, reason: collision with root package name */
    public ConstraintLayout f15704o0;

    public WhyThisAdFragment() {
        super(R.layout.fragment_why_this_ad);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [J3.e, java.lang.Object] */
    @Override // W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        viewGroup.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_why_this_ad, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.why_this_ad_base_layout);
        constraintLayout.getClass();
        this.f15703n0 = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate.findViewById(R.id.why_this_ad_layout);
        constraintLayout2.getClass();
        this.f15704o0 = constraintLayout2;
        this.f15703n0.setAlpha(0.0f);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(i0(), R.animator.animator_drawer_in);
        animatorSet.setTarget(this);
        animatorSet.start();
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(i0(), R.animator.animator_drawer_out);
        animatorSet2.setTarget(this);
        animatorSet2.addListener(new C0076d1(this, 3));
        Button button = (Button) inflate.findViewById(R.id.why_this_ad_back_button);
        button.getClass();
        button.setOnClickListener(new a(animatorSet2, 1));
        g0().a().a(this, new b(animatorSet2, 1));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.wta_image_view);
        imageView.getClass();
        this.f15702m0 = imageView;
        String string = h0().getString("wta_uri");
        string.getClass();
        String string2 = h0().getString("wta_alt_text");
        if (!TextUtils.isEmpty(string2)) {
            this.f15702m0.setContentDescription(string2);
        }
        k p10 = com.bumptech.glide.b.b(C()).c(this).p(zzar.zza(string, "zTvAdsFrameworkz"));
        p10.getClass();
        k kVar = (k) p10.o(o.f5480b, new Object(), true);
        kVar.C(new c(this, this.f15702m0), null, kVar, g.f10605a);
        return inflate;
    }

    @Keep
    public float getBackgroundAlpha() {
        return this.f15703n0.getAlpha();
    }

    @Keep
    public float getDrawerTranslationX() {
        return this.f15704o0.getTranslationX() / this.f15704o0.getWidth();
    }

    @Keep
    public void setBackgroundAlpha(float f4) {
        this.f15703n0.setAlpha(f4);
        this.f15703n0.invalidate();
    }

    @Keep
    public void setDrawerTranslationX(float f4) {
        this.f15704o0.setTranslationX(r0.getWidth() * f4);
        this.f15704o0.invalidate();
    }
}
