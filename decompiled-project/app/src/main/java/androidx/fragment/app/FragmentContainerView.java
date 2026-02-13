package androidx.fragment.app;

import V1.a;
import W1.C;
import W1.C0558a;
import W1.F;
import W1.G;
import W1.M;
import W1.U;
import W1.a0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import y.S;
import y1.K;
import y1.p0;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13481a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13482b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f13483c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        l.e(context, "context");
        this.f13481a = new ArrayList();
        this.f13482b = new ArrayList();
        this.f13484d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f9992b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, U fm) {
        super(context, attrs);
        View view;
        l.e(context, "context");
        l.e(attrs, "attrs");
        l.e(fm, "fm");
        this.f13481a = new ArrayList();
        this.f13482b = new ArrayList();
        this.f13484d = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, a.f9992b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        C D10 = fm.D(id);
        if (classAttribute != null && D10 == null) {
            if (id == -1) {
                throw new IllegalStateException(S.b("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            M J10 = fm.J();
            context.getClassLoader();
            C a9 = J10.a(classAttribute);
            l.d(a9, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a9.L = id;
            a9.f10269M = id;
            a9.f10270N = string;
            a9.f10265H = fm;
            F f4 = fm.f10374w;
            a9.f10266I = f4;
            a9.f10275S = true;
            if ((f4 == null ? null : f4.f10310a) != null) {
                a9.f10275S = true;
            }
            C0558a c0558a = new C0558a(fm);
            c0558a.f10421r = true;
            a9.f10276T = this;
            c0558a.g(getId(), a9, string, 1);
            if (c0558a.f10414i) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0558a.j = false;
            c0558a.f10422s.B(c0558a, true);
        }
        Iterator it = fm.f10357c.f().iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            C c10 = a0Var.f10427c;
            if (c10.f10269M == getId() && (view = c10.f10277U) != null && view.getParent() == null) {
                c10.f10276T = this;
                a0Var.b();
            }
        }
    }

    public final void a(View view) {
        if (this.f13482b.contains(view)) {
            this.f13481a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i7, ViewGroup.LayoutParams layoutParams) {
        l.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof C ? (C) tag : null) != null) {
            super.addView(child, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        p0 i7;
        l.e(insets, "insets");
        p0 h10 = p0.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f13483c;
        if (onApplyWindowInsetsListener != null) {
            l.b(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            l.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            i7 = p0.h(null, onApplyWindowInsets);
        } else {
            i7 = K.i(this, h10);
        }
        l.d(i7, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!i7.f26731a.o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                K.b(getChildAt(i10), i7);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l.e(canvas, "canvas");
        if (this.f13484d) {
            Iterator it = this.f13481a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        l.e(canvas, "canvas");
        l.e(child, "child");
        if (this.f13484d) {
            ArrayList arrayList = this.f13481a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        l.e(view, "view");
        this.f13482b.remove(view);
        if (this.f13481a.remove(view)) {
            this.f13484d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends C> F getFragment() {
        G g;
        C c10;
        U j;
        View view = this;
        while (true) {
            g = null;
            if (view == null) {
                c10 = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            c10 = tag instanceof C ? (C) tag : null;
            if (c10 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (c10 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof G) {
                    g = (G) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (g == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            j = g.j();
        } else {
            if (!c10.K()) {
                throw new IllegalStateException("The Fragment " + c10 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            j = c10.B();
        }
        return (F) j.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        l.e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                l.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        l.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        View view = getChildAt(i7);
        l.d(view, "view");
        a(view);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        l.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i7, int i10) {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            View view = getChildAt(i12);
            l.d(view, "view");
            a(view);
        }
        super.removeViews(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i7, int i10) {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            View view = getChildAt(i12);
            l.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i7, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z8) {
        this.f13484d = z8;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        l.e(listener, "listener");
        this.f13483c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        l.e(view, "view");
        if (view.getParent() == this) {
            this.f13482b.add(view);
        }
        super.startViewTransition(view);
    }
}
