package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.kt.apps.media.xemtv.beta.R;
import o7.o;
import y1.C2354b;

/* loaded from: classes.dex */
public final class c extends C2354b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f15553d;

    public c(ClockFaceView clockFaceView) {
        this.f15553d = clockFaceView;
    }

    @Override // y1.C2354b
    public final void d(View view, z1.e eVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f26680a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f28173a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f15553d.L.get(intValue - 1));
        }
        eVar.k(o.m(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        eVar.b(z1.d.f28159e);
    }

    @Override // y1.C2354b
    public final boolean g(View view, int i7, Bundle bundle) {
        if (i7 != 16) {
            return super.g(view, i7, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f15553d;
        view.getHitRect(clockFaceView.f15523I);
        float centerX = clockFaceView.f15523I.centerX();
        float centerY = clockFaceView.f15523I.centerY();
        clockFaceView.f15522H.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f15522H.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
