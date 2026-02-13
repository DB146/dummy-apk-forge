package com.kt.apps.core.base.leanback;

import A9.C0084f1;
import A9.InterfaceC0064a1;
import A9.P0;
import A9.T;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public class GuidedActionsRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final float f15927a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15928b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0064a1 f15929c;

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15928b = false;
        this.f15927a = GuidanceStylingRelativeLayout.a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        P0 p02;
        InterfaceC0064a1 interfaceC0064a1 = this.f15929c;
        if (interfaceC0064a1 != null) {
            T t5 = (T) interfaceC0064a1;
            t5.getClass();
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (p02 = ((C0084f1) t5.f964a).f1153r) != null) {
                p02.getClass();
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        this.f15928b = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View findViewById;
        int size = View.MeasureSpec.getSize(i10);
        if (size > 0 && (findViewById = findViewById(R.id.guidedactions_sub_list)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.f15928b) {
                this.f15928b = true;
            }
            if (this.f15928b) {
                marginLayoutParams.topMargin = (int) ((this.f15927a * size) / 100.0f);
            }
        }
        super.onMeasure(i7, i10);
    }

    public void setInterceptKeyEventListener(InterfaceC0064a1 interfaceC0064a1) {
        this.f15929c = interfaceC0064a1;
    }
}
