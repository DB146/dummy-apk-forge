package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f15552a;

    public b(ClockFaceView clockFaceView) {
        this.f15552a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f15552a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f15522H.f15540d) - clockFaceView.f15529P;
        if (height != clockFaceView.f15555F) {
            clockFaceView.f15555F = height;
            clockFaceView.m();
            int i7 = clockFaceView.f15555F;
            ClockHandView clockHandView = clockFaceView.f15522H;
            clockHandView.f15548z = i7;
            clockHandView.invalidate();
        }
        return true;
    }
}
