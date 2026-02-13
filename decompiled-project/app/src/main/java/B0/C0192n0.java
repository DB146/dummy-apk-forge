package B0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import x0.AbstractC2256a;

/* renamed from: B0.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192n0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1935a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1936b;

    public C0192n0(Context context) {
        super(context);
        setClipChildren(false);
        this.f1935a = new HashMap();
        this.f1936b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Y0.j, A0.L> getHolderToLayoutNode() {
        return this.f1935a;
    }

    public final HashMap<A0.L, Y0.j> getLayoutNodeToHolder() {
        return this.f1936b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        for (Y0.j jVar : this.f1935a.keySet()) {
            jVar.layout(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (!(View.MeasureSpec.getMode(i7) == 1073741824)) {
            AbstractC2256a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            AbstractC2256a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        for (Y0.j jVar : this.f1935a.keySet()) {
            int i12 = jVar.f11101I;
            if (i12 != Integer.MIN_VALUE && (i11 = jVar.f11102J) != Integer.MIN_VALUE) {
                jVar.measure(i12, i11);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            A0.L l10 = (A0.L) this.f1935a.get(childAt);
            if (childAt.isLayoutRequested() && l10 != null) {
                A0.L.S(l10, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
