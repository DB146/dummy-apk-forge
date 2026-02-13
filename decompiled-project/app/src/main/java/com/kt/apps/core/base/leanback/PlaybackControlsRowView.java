package com.kt.apps.core.base.leanback;

import A9.InterfaceC0065a2;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public class PlaybackControlsRowView extends LinearLayout {
    public PlaybackControlsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public InterfaceC0065a2 getOnUnhandledKeyListener() {
        return null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        View findFocus = findFocus();
        if (findFocus == null || !findFocus.requestFocus(i7, rect)) {
            return super.onRequestFocusInDescendants(i7, rect);
        }
        return true;
    }

    public void setOnUnhandledKeyListener(InterfaceC0065a2 interfaceC0065a2) {
    }
}
