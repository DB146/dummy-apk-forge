package com.kt.apps.core.base.leanback;

import A9.C0089g2;
import A9.C0101j2;
import A9.InterfaceC0105k2;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public class PlaybackTransportRowView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0105k2 f15998a;

    public PlaybackTransportRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z8;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        InterfaceC0105k2 interfaceC0105k2 = this.f15998a;
        if (interfaceC0105k2 != null) {
            C0101j2 c0101j2 = ((C0089g2) interfaceC0105k2).f1202a;
            View.OnKeyListener onKeyListener = c0101j2.f1465l;
            if (onKeyListener != null) {
                z8 = onKeyListener.onKey(c0101j2.f1271a, keyEvent.getKeyCode(), keyEvent);
            } else {
                z8 = false;
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        View childAt;
        if (view != null) {
            if (i7 == 33) {
                for (int indexOfChild = indexOfChild(getFocusedChild()) - 1; indexOfChild >= 0; indexOfChild--) {
                    View childAt2 = getChildAt(indexOfChild);
                    if (childAt2.hasFocusable()) {
                        return childAt2;
                    }
                }
            } else {
                if (i7 == 130) {
                    int indexOfChild2 = indexOfChild(getFocusedChild());
                    do {
                        indexOfChild2++;
                        if (indexOfChild2 < getChildCount()) {
                            childAt = getChildAt(indexOfChild2);
                        }
                    } while (!childAt.hasFocusable());
                    return childAt;
                }
                if ((i7 == 17 || i7 == 66) && (getFocusedChild() instanceof ViewGroup)) {
                    return FocusFinder.getInstance().findNextFocus((ViewGroup) getFocusedChild(), view, i7);
                }
            }
        }
        return super.focusSearch(view, i7);
    }

    public InterfaceC0105k2 getOnUnhandledKeyListener() {
        return this.f15998a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        View findFocus = findFocus();
        if (findFocus != null && findFocus.requestFocus(i7, rect)) {
            return true;
        }
        View findViewById = findViewById(R.id.playback_progress);
        if (findViewById != null && findViewById.isFocusable() && findViewById.requestFocus(i7, rect)) {
            return true;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    public void setOnUnhandledKeyListener(InterfaceC0105k2 interfaceC0105k2) {
        this.f15998a = interfaceC0105k2;
    }
}
