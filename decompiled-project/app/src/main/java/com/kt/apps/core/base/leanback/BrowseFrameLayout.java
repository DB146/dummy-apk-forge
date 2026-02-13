package com.kt.apps.core.base.leanback;

import A9.F;
import A9.G;
import A9.H;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import pa.i;
import ya.a;

/* loaded from: classes2.dex */
public class BrowseFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public H f15911a;

    /* renamed from: b, reason: collision with root package name */
    public F f15912b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnKeyListener f15913c;

    /* renamed from: d, reason: collision with root package name */
    public G f15914d;

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.f15913c;
        return (onKeyListener == null || dispatchKeyEvent) ? dispatchKeyEvent : onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final View findFocus() {
        G g;
        return (isFocused() || getFocusedChild() != null || (g = this.f15914d) == null || ((i) ((a) g).f27550a.o0()).f23239C == null) ? super.findFocus() : ((i) ((a) this.f15914d).f27550a.o0()).f23239C;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        View c10;
        H h10 = this.f15911a;
        return (h10 == null || (c10 = h10.c(view, i7)) == null) ? super.focusSearch(view, i7) : c10;
    }

    public F getOnChildFocusListener() {
        return this.f15912b;
    }

    public H getOnFocusSearchListener() {
        return this.f15911a;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        F f4 = this.f15912b;
        if (f4 == null || !f4.b(i7, rect)) {
            return super.onRequestFocusInDescendants(i7, rect);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        F f4 = this.f15912b;
        if (f4 != null) {
            f4.e(view);
        }
        super.requestChildFocus(view, view2);
    }

    public void setOnChildFocusListener(F f4) {
        this.f15912b = f4;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.f15913c = onKeyListener;
    }

    public void setOnFirstChildFocusListener(G g) {
        this.f15914d = g;
    }

    public void setOnFocusSearchListener(H h10) {
        this.f15911a = h10;
    }
}
