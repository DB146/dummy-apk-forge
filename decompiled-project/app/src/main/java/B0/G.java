package B0;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import n.ViewOnKeyListenerC1665C;
import n.ViewOnKeyListenerC1672f;
import y1.AbstractC2377z;
import z1.AccessibilityManagerTouchExplorationStateChangeListenerC2584b;

/* loaded from: classes.dex */
public final class G implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1680b;

    public /* synthetic */ G(Object obj, int i7) {
        this.f1679a = i7;
        this.f1680b = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f1680b;
        switch (this.f1679a) {
            case 0:
                L l10 = (L) obj;
                AccessibilityManager accessibilityManager2 = l10.g;
                accessibilityManager2.addAccessibilityStateChangeListener(l10.f1732i);
                accessibilityManager2.addTouchExplorationStateChangeListener(l10.j);
                return;
            case 1:
            case 2:
                return;
            case 3:
                C6.m mVar = (C6.m) obj;
                if (mVar.f2958I == null || (accessibilityManager = mVar.f2957H) == null) {
                    return;
                }
                WeakHashMap weakHashMap = y1.K.f26642a;
                if (mVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2584b(mVar.f2958I));
                    return;
                }
                return;
            case 4:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = y1.K.f26642a;
                AbstractC2377z.c(view2);
                return;
            case 5:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z8;
        AccessibilityManager accessibilityManager;
        switch (this.f1679a) {
            case 0:
                L l10 = (L) this.f1680b;
                l10.f1733l.removeCallbacks(l10.f1725M);
                AccessibilityManager accessibilityManager2 = l10.g;
                accessibilityManager2.removeAccessibilityStateChangeListener(l10.f1732i);
                accessibilityManager2.removeTouchExplorationStateChangeListener(l10.j);
                return;
            case 1:
                AbstractC0167b abstractC0167b = (AbstractC0167b) this.f1680b;
                kotlin.jvm.internal.l.e(abstractC0167b, "<this>");
                Iterator it = Zb.i.N(abstractC0167b.getParent(), y1.P.f26654a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            kotlin.jvm.internal.l.e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z8 = true;
                            }
                        }
                    }
                }
                if (z8) {
                    return;
                }
                abstractC0167b.c();
                return;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((cc.D0) this.f1680b).cancel(null);
                return;
            case 3:
                C6.m mVar = (C6.m) this.f1680b;
                A1.d dVar = mVar.f2958I;
                if (dVar == null || (accessibilityManager = mVar.f2957H) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2584b(dVar));
                return;
            case 4:
                return;
            case 5:
                ViewOnKeyListenerC1672f viewOnKeyListenerC1672f = (ViewOnKeyListenerC1672f) this.f1680b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1672f.L;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1672f.L = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1672f.L.removeGlobalOnLayoutListener(viewOnKeyListenerC1672f.f20924w);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ViewOnKeyListenerC1665C viewOnKeyListenerC1665C = (ViewOnKeyListenerC1665C) this.f1680b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1665C.f20862C;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1665C.f20862C = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1665C.f20862C.removeGlobalOnLayoutListener(viewOnKeyListenerC1665C.f20875w);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
