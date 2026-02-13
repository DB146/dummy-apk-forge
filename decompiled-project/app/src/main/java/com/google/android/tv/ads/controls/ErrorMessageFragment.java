package com.google.android.tv.ads.controls;

import A9.C0076d1;
import L6.a;
import L6.b;
import W1.C;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class ErrorMessageFragment extends C {

    /* renamed from: m0, reason: collision with root package name */
    public ConstraintLayout f15700m0;

    /* renamed from: n0, reason: collision with root package name */
    public ConstraintLayout f15701n0;

    public ErrorMessageFragment() {
        super(R.layout.fragment_error_message);
    }

    @Override // W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        viewGroup.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_error_message, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.error_message_base_layout);
        constraintLayout.getClass();
        this.f15700m0 = constraintLayout;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate.findViewById(R.id.error_message_layout);
        constraintLayout2.getClass();
        this.f15701n0 = constraintLayout2;
        this.f15700m0.setAlpha(0.0f);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(i0(), R.animator.animator_drawer_in);
        animatorSet.setTarget(this);
        animatorSet.start();
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(i0(), R.animator.animator_drawer_out);
        animatorSet2.setTarget(this);
        animatorSet2.addListener(new C0076d1(this, 2));
        Button button = (Button) inflate.findViewById(R.id.error_message_back_button);
        button.getClass();
        button.setOnClickListener(new a(animatorSet2, 0));
        g0().a().a(this, new b(animatorSet2, 0));
        return inflate;
    }

    @Keep
    public float getBackgroundAlpha() {
        return this.f15700m0.getAlpha();
    }

    @Keep
    public float getDrawerTranslationX() {
        return this.f15701n0.getTranslationX() / this.f15701n0.getWidth();
    }

    @Keep
    public void setBackgroundAlpha(float f4) {
        this.f15700m0.setAlpha(f4);
        this.f15700m0.invalidate();
    }

    @Keep
    public void setDrawerTranslationX(float f4) {
        this.f15701n0.setTranslationX(r0.getWidth() * f4);
        this.f15701n0.invalidate();
    }
}
