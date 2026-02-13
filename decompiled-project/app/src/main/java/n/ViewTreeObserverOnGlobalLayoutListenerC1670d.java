package n;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import o.D0;
import o.I;
import o.L;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1670d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20900b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1670d(Object obj, int i7) {
        this.f20899a = i7;
        this.f20900b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f20899a) {
            case 0:
                ViewOnKeyListenerC1672f viewOnKeyListenerC1672f = (ViewOnKeyListenerC1672f) this.f20900b;
                if (viewOnKeyListenerC1672f.b()) {
                    ArrayList arrayList = viewOnKeyListenerC1672f.f20923v;
                    if (arrayList.size() <= 0 || ((C1671e) arrayList.get(0)).f20901a.f21636M) {
                        return;
                    }
                    View view = viewOnKeyListenerC1672f.f20906C;
                    if (view == null || !view.isShown()) {
                        viewOnKeyListenerC1672f.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C1671e) it.next()).f20901a.c();
                    }
                    return;
                }
                return;
            case 1:
                ViewOnKeyListenerC1665C viewOnKeyListenerC1665C = (ViewOnKeyListenerC1665C) this.f20900b;
                if (viewOnKeyListenerC1665C.b()) {
                    D0 d02 = viewOnKeyListenerC1665C.f20874v;
                    if (d02.f21636M) {
                        return;
                    }
                    View view2 = viewOnKeyListenerC1665C.f20860A;
                    if (view2 == null || !view2.isShown()) {
                        viewOnKeyListenerC1665C.dismiss();
                        return;
                    } else {
                        d02.c();
                        return;
                    }
                }
                return;
            case 2:
                L l10 = (L) this.f20900b;
                if (!l10.getInternalPopup().b()) {
                    l10.f21408f.l(l10.getTextDirection(), l10.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = l10.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                I i7 = (I) this.f20900b;
                L l11 = i7.f21394U;
                i7.getClass();
                if (!l11.isAttachedToWindow() || !l11.getGlobalVisibleRect(i7.f21392S)) {
                    i7.dismiss();
                    return;
                } else {
                    i7.s();
                    i7.c();
                    return;
                }
        }
    }
}
