package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.kt.apps.media.xemtv.beta.R;
import n.ViewTreeObserverOnGlobalLayoutListenerC1670d;

/* loaded from: classes.dex */
public final class I extends C1770y0 implements K {

    /* renamed from: Q, reason: collision with root package name */
    public CharSequence f21390Q;

    /* renamed from: R, reason: collision with root package name */
    public G f21391R;

    /* renamed from: S, reason: collision with root package name */
    public final Rect f21392S;

    /* renamed from: T, reason: collision with root package name */
    public int f21393T;

    /* renamed from: U, reason: collision with root package name */
    public final /* synthetic */ L f21394U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(L l10, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f21394U = l10;
        this.f21392S = new Rect();
        this.f21627C = l10;
        this.f21636M = true;
        this.f21637N.setFocusable(true);
        this.f21628D = new C6.q(this, 1);
    }

    @Override // o.K
    public final void g(CharSequence charSequence) {
        this.f21390Q = charSequence;
    }

    @Override // o.K
    public final void j(int i7) {
        this.f21393T = i7;
    }

    @Override // o.K
    public final void l(int i7, int i10) {
        ViewTreeObserver viewTreeObserver;
        C1765w c1765w = this.f21637N;
        boolean isShowing = c1765w.isShowing();
        s();
        this.f21637N.setInputMethodMode(2);
        c();
        C1747m0 c1747m0 = this.f21640c;
        c1747m0.setChoiceMode(1);
        c1747m0.setTextDirection(i7);
        c1747m0.setTextAlignment(i10);
        L l10 = this.f21394U;
        int selectedItemPosition = l10.getSelectedItemPosition();
        C1747m0 c1747m02 = this.f21640c;
        if (c1765w.isShowing() && c1747m02 != null) {
            c1747m02.setListSelectionHidden(false);
            c1747m02.setSelection(selectedItemPosition);
            if (c1747m02.getChoiceMode() != 0) {
                c1747m02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = l10.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1670d viewTreeObserverOnGlobalLayoutListenerC1670d = new ViewTreeObserverOnGlobalLayoutListenerC1670d(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1670d);
        this.f21637N.setOnDismissListener(new H(this, viewTreeObserverOnGlobalLayoutListenerC1670d));
    }

    @Override // o.K
    public final CharSequence o() {
        return this.f21390Q;
    }

    @Override // o.C1770y0, o.K
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f21391R = (G) listAdapter;
    }

    public final void s() {
        int i7;
        C1765w c1765w = this.f21637N;
        Drawable background = c1765w.getBackground();
        L l10 = this.f21394U;
        if (background != null) {
            background.getPadding(l10.f21410v);
            boolean z8 = c1.f21486a;
            int layoutDirection = l10.getLayoutDirection();
            Rect rect = l10.f21410v;
            i7 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = l10.f21410v;
            rect2.right = 0;
            rect2.left = 0;
            i7 = 0;
        }
        int paddingLeft = l10.getPaddingLeft();
        int paddingRight = l10.getPaddingRight();
        int width = l10.getWidth();
        int i10 = l10.f21409u;
        if (i10 == -2) {
            int a9 = l10.a(this.f21391R, c1765w.getBackground());
            int i11 = l10.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = l10.f21410v;
            int i12 = (i11 - rect3.left) - rect3.right;
            if (a9 > i12) {
                a9 = i12;
            }
            r(Math.max(a9, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i10);
        }
        boolean z10 = c1.f21486a;
        this.f21643f = l10.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f21642e) - this.f21393T) + i7 : paddingLeft + this.f21393T + i7;
    }
}
