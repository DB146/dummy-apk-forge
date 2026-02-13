package A9;

import H2.C0296j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import i2.AbstractC1302J;
import java.util.ArrayList;

/* renamed from: A9.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0145v extends RecyclerView {

    /* renamed from: Y0, reason: collision with root package name */
    public final N0 f1419Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f1420Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f1421a1;

    /* renamed from: b1, reason: collision with root package name */
    public H2.P f1422b1;

    /* renamed from: c1, reason: collision with root package name */
    public InterfaceC0133s f1423c1;

    /* renamed from: d1, reason: collision with root package name */
    public InterfaceC0126q f1424d1;

    /* renamed from: e1, reason: collision with root package name */
    public InterfaceC0137t f1425e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f1426f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f1427g1;

    public AbstractC0145v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1420Z0 = true;
        this.f1421a1 = true;
        this.f1426f1 = 4;
        N0 n02 = new N0(this);
        this.f1419Y0 = n02;
        setLayoutManager(n02);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((C0296j) getItemAnimator()).g = false;
        this.f13617D.add(new C0122p(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC0126q interfaceC0126q = this.f1424d1;
        if ((interfaceC0126q != null && ((C0077d2) interfaceC0126q).f1109a.t0(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        InterfaceC0137t interfaceC0137t = this.f1425e1;
        return interfaceC0137t != null && interfaceC0137t.a(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC0133s interfaceC0133s = this.f1423c1;
        if (interfaceC0133s == null || !((C0077d2) interfaceC0133s).f1109a.t0(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final View focusSearch(int i7) {
        if (isFocused()) {
            N0 n02 = this.f1419Y0;
            View t5 = n02.t(n02.f879F);
            if (t5 != null) {
                return focusSearch(t5, i7);
            }
        }
        return super.focusSearch(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i10) {
        int indexOfChild;
        N0 n02 = this.f1419Y0;
        View t5 = n02.t(n02.f879F);
        return (t5 != null && i10 >= (indexOfChild = indexOfChild(t5))) ? i10 < i7 + (-1) ? ((indexOfChild + i7) - 1) - i10 : indexOfChild : i10;
    }

    public int getExtraLayoutSpace() {
        return this.f1419Y0.f901c0;
    }

    public int getFocusScrollStrategy() {
        return this.f1419Y0.f897Y;
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.f1419Y0.f889Q;
    }

    public int getHorizontalSpacing() {
        return this.f1419Y0.f889Q;
    }

    public int getInitialPrefetchItemCount() {
        return this.f1426f1;
    }

    public int getItemAlignmentOffset() {
        return ((C0112m1) this.f1419Y0.f899a0.f29d).f1301c;
    }

    public float getItemAlignmentOffsetPercent() {
        return ((C0112m1) this.f1419Y0.f899a0.f29d).f1302d;
    }

    public int getItemAlignmentViewId() {
        return ((C0112m1) this.f1419Y0.f899a0.f29d).f1299a;
    }

    public InterfaceC0137t getOnUnhandledKeyListener() {
        return this.f1425e1;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.f1419Y0.f903e0.f386c;
    }

    public final int getSaveChildrenPolicy() {
        return this.f1419Y0.f903e0.f385b;
    }

    public int getSelectedPosition() {
        return this.f1419Y0.f879F;
    }

    public int getSelectedSubPosition() {
        return this.f1419Y0.f880G;
    }

    public InterfaceC0141u getSmoothScrollByBehavior() {
        return null;
    }

    public final int getSmoothScrollMaxPendingMoves() {
        return this.f1419Y0.f908q;
    }

    public final float getSmoothScrollSpeedFactor() {
        return this.f1419Y0.f907p;
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.f1419Y0.f890R;
    }

    public int getVerticalSpacing() {
        return this.f1419Y0.f890R;
    }

    public int getWindowAlignment() {
        return ((v3) this.f1419Y0.f898Z.f23859d).f1445f;
    }

    public int getWindowAlignmentOffset() {
        return ((v3) this.f1419Y0.f898Z.f23859d).g;
    }

    public float getWindowAlignmentOffsetPercent() {
        return ((v3) this.f1419Y0.f898Z.f23859d).f1446h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void h0(int i7) {
        N0 n02 = this.f1419Y0;
        if ((n02.f875B & 64) != 0) {
            n02.E1(i7, false);
        } else {
            super.h0(i7);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1421a1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i7, int i10) {
        k0(i7, i10, null, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7, int i10, Interpolator interpolator) {
        k0(i7, i10, (AccelerateDecelerateInterpolator) interpolator, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i7) {
        N0 n02 = this.f1419Y0;
        if ((n02.f875B & 64) != 0) {
            n02.E1(i7, false);
        } else {
            super.m0(i7);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z8, int i7, Rect rect) {
        super.onFocusChanged(z8, i7, rect);
        N0 n02 = this.f1419Y0;
        if (!z8) {
            n02.getClass();
            return;
        }
        int i10 = n02.f879F;
        while (true) {
            View t5 = n02.t(i10);
            if (t5 == null) {
                return;
            }
            if (t5.getVisibility() == 0 && t5.hasFocusable()) {
                t5.requestFocus();
                return;
            }
            i10++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i10;
        int i11;
        int i12;
        boolean z8 = true;
        if ((this.f1427g1 & 1) == 1) {
            return false;
        }
        N0 n02 = this.f1419Y0;
        int i13 = n02.f897Y;
        if (i13 != 1 && i13 != 2) {
            View t5 = n02.t(n02.f879F);
            if (t5 != null) {
                return t5.requestFocus(i7, rect);
            }
            return false;
        }
        int y10 = n02.y();
        if ((i7 & 2) != 0) {
            i12 = 1;
            i11 = y10;
            i10 = 0;
        } else {
            i10 = y10 - 1;
            i11 = -1;
            i12 = -1;
        }
        v3 v3Var = (v3) n02.f898Z.f23859d;
        int i14 = v3Var.j;
        int i15 = ((v3Var.f1447i - i14) - v3Var.k) + i14;
        while (true) {
            if (i10 == i11) {
                z8 = false;
                break;
            }
            View x2 = n02.x(i10);
            if (x2.getVisibility() == 0 && n02.f911t.g(x2) >= i14 && n02.f911t.d(x2) <= i15 && x2.requestFocus(i7, rect)) {
                break;
            }
            i10 += i12;
        }
        return z8;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        int i10;
        N0 n02 = this.f1419Y0;
        if (n02.f910s == 0) {
            if (i7 == 1) {
                i10 = 262144;
            }
            i10 = 0;
        } else {
            if (i7 == 1) {
                i10 = 524288;
            }
            i10 = 0;
        }
        int i11 = n02.f875B;
        if ((786432 & i11) == i10) {
            return;
        }
        n02.f875B = i10 | (i11 & (-786433)) | 256;
        ((v3) n02.f898Z.f23858c).f1448l = i7 == 1;
    }

    public final void r0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1302J.f18216a);
        boolean z8 = obtainStyledAttributes.getBoolean(4, false);
        boolean z10 = obtainStyledAttributes.getBoolean(3, false);
        N0 n02 = this.f1419Y0;
        n02.f875B = (z8 ? 2048 : 0) | (n02.f875B & (-6145)) | (z10 ? 4096 : 0);
        boolean z11 = obtainStyledAttributes.getBoolean(6, true);
        boolean z12 = obtainStyledAttributes.getBoolean(5, true);
        n02.f875B = (z11 ? 8192 : 0) | (n02.f875B & (-24577)) | (z12 ? 16384 : 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, obtainStyledAttributes.getDimensionPixelSize(8, 0));
        if (n02.f910s == 1) {
            n02.f890R = dimensionPixelSize;
            n02.f891S = dimensionPixelSize;
        } else {
            n02.f890R = dimensionPixelSize;
            n02.f892T = dimensionPixelSize;
        }
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, obtainStyledAttributes.getDimensionPixelSize(7, 0));
        if (n02.f910s == 0) {
            n02.f889Q = dimensionPixelSize2;
            n02.f891S = dimensionPixelSize2;
        } else {
            n02.f889Q = dimensionPixelSize2;
            n02.f892T = dimensionPixelSize2;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setGravity(obtainStyledAttributes.getInt(0, 0));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        boolean z8 = view.hasFocus() && isFocusable();
        if (z8) {
            this.f1427g1 = 1 | this.f1427g1;
            requestFocus();
        }
        super.removeView(view);
        if (z8) {
            this.f1427g1 ^= -2;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        boolean hasFocus = getChildAt(i7).hasFocus();
        if (hasFocus) {
            this.f1427g1 |= 1;
            requestFocus();
        }
        super.removeViewAt(i7);
        if (hasFocus) {
            this.f1427g1 ^= -2;
        }
    }

    public void setAnimateChildLayout(boolean z8) {
        if (this.f1420Z0 != z8) {
            this.f1420Z0 = z8;
            if (z8) {
                super.setItemAnimator(this.f1422b1);
            } else {
                this.f1422b1 = getItemAnimator();
                super.setItemAnimator(null);
            }
        }
    }

    public void setChildrenVisibility(int i7) {
        N0 n02 = this.f1419Y0;
        n02.f884K = i7;
        if (i7 != -1) {
            int y10 = n02.y();
            for (int i10 = 0; i10 < y10; i10++) {
                n02.x(i10).setVisibility(n02.f884K);
            }
        }
    }

    public void setExtraLayoutSpace(int i7) {
        N0 n02 = this.f1419Y0;
        int i10 = n02.f901c0;
        if (i10 == i7) {
            return;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
        n02.f901c0 = i7;
        n02.F0();
    }

    public void setFocusDrawingOrderEnabled(boolean z8) {
        super.setChildrenDrawingOrderEnabled(z8);
    }

    public void setFocusScrollStrategy(int i7) {
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.f1419Y0.f897Y = i7;
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z8) {
        setDescendantFocusability(z8 ? 393216 : 262144);
        N0 n02 = this.f1419Y0;
        n02.f875B = (z8 ? 32768 : 0) | (n02.f875B & (-32769));
    }

    public void setGravity(int i7) {
        this.f1419Y0.f893U = i7;
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z8) {
        this.f1421a1 = z8;
    }

    @Deprecated
    public void setHorizontalMargin(int i7) {
        setHorizontalSpacing(i7);
    }

    public void setHorizontalSpacing(int i7) {
        N0 n02 = this.f1419Y0;
        if (n02.f910s == 0) {
            n02.f889Q = i7;
            n02.f891S = i7;
        } else {
            n02.f889Q = i7;
            n02.f892T = i7;
        }
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i7) {
        this.f1426f1 = i7;
    }

    public void setItemAlignmentOffset(int i7) {
        N0 n02 = this.f1419Y0;
        ((C0112m1) n02.f899a0.f29d).f1301c = i7;
        n02.F1();
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f4) {
        N0 n02 = this.f1419Y0;
        ((C0112m1) n02.f899a0.f29d).a(f4);
        n02.F1();
        requestLayout();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z8) {
        N0 n02 = this.f1419Y0;
        ((C0112m1) n02.f899a0.f29d).f1303e = z8;
        n02.F1();
        requestLayout();
    }

    public void setItemAlignmentViewId(int i7) {
        N0 n02 = this.f1419Y0;
        ((C0112m1) n02.f899a0.f29d).f1299a = i7;
        n02.F1();
    }

    @Deprecated
    public void setItemMargin(int i7) {
        setItemSpacing(i7);
    }

    public void setItemSpacing(int i7) {
        N0 n02 = this.f1419Y0;
        n02.f889Q = i7;
        n02.f890R = i7;
        n02.f892T = i7;
        n02.f891S = i7;
        requestLayout();
    }

    public void setLayoutEnabled(boolean z8) {
        N0 n02 = this.f1419Y0;
        int i7 = n02.f875B;
        if (((i7 & 512) != 0) != z8) {
            n02.f875B = (i7 & (-513)) | (z8 ? 512 : 0);
            n02.F0();
        }
    }

    public void setOnChildLaidOutListener(K1 k12) {
        this.f1419Y0.f878E = k12;
    }

    public void setOnChildSelectedListener(L1 l12) {
        this.f1419Y0.f876C = l12;
    }

    public void setOnChildViewHolderSelectedListener(M1 m12) {
        N0 n02 = this.f1419Y0;
        if (m12 == null) {
            n02.f877D = null;
            return;
        }
        ArrayList arrayList = n02.f877D;
        if (arrayList == null) {
            n02.f877D = new ArrayList();
        } else {
            arrayList.clear();
        }
        n02.f877D.add(m12);
    }

    public void setOnKeyInterceptListener(InterfaceC0126q interfaceC0126q) {
        this.f1424d1 = interfaceC0126q;
    }

    public void setOnMotionInterceptListener(r rVar) {
    }

    public void setOnTouchInterceptListener(InterfaceC0133s interfaceC0133s) {
        this.f1423c1 = interfaceC0133s;
    }

    public void setOnUnhandledKeyListener(InterfaceC0137t interfaceC0137t) {
        this.f1425e1 = interfaceC0137t;
    }

    public void setPruneChild(boolean z8) {
        N0 n02 = this.f1419Y0;
        int i7 = n02.f875B;
        if (((i7 & 65536) != 0) != z8) {
            n02.f875B = (i7 & (-65537)) | (z8 ? 65536 : 0);
            if (z8) {
                n02.F0();
            }
        }
    }

    public final void setSaveChildrenLimitNumber(int i7) {
        A4.h hVar = this.f1419Y0.f903e0;
        hVar.f386c = i7;
        hVar.q();
    }

    public final void setSaveChildrenPolicy(int i7) {
        A4.h hVar = this.f1419Y0.f903e0;
        hVar.f385b = i7;
        hVar.q();
    }

    public void setScrollEnabled(boolean z8) {
        int i7;
        N0 n02 = this.f1419Y0;
        int i10 = n02.f875B;
        if (((i10 & 131072) != 0) != z8) {
            int i11 = (i10 & (-131073)) | (z8 ? 131072 : 0);
            n02.f875B = i11;
            if ((i11 & 131072) == 0 || n02.f897Y != 0 || (i7 = n02.f879F) == -1) {
                return;
            }
            n02.z1(true, i7, n02.f880G);
        }
    }

    public void setSelectedPosition(int i7) {
        this.f1419Y0.E1(i7, false);
    }

    public void setSelectedPositionSmooth(int i7) {
        this.f1419Y0.E1(i7, true);
    }

    public final void setSmoothScrollByBehavior(InterfaceC0141u interfaceC0141u) {
    }

    public final void setSmoothScrollMaxPendingMoves(int i7) {
        this.f1419Y0.f908q = i7;
    }

    public final void setSmoothScrollSpeedFactor(float f4) {
        this.f1419Y0.f907p = f4;
    }

    @Deprecated
    public void setVerticalMargin(int i7) {
        setVerticalSpacing(i7);
    }

    public void setVerticalSpacing(int i7) {
        N0 n02 = this.f1419Y0;
        if (n02.f910s == 1) {
            n02.f890R = i7;
            n02.f891S = i7;
        } else {
            n02.f890R = i7;
            n02.f892T = i7;
        }
        requestLayout();
    }

    public void setWindowAlignment(int i7) {
        ((v3) this.f1419Y0.f898Z.f23859d).f1445f = i7;
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i7) {
        ((v3) this.f1419Y0.f898Z.f23859d).g = i7;
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f4) {
        v3 v3Var = (v3) this.f1419Y0.f898Z.f23859d;
        v3Var.getClass();
        if ((f4 < 0.0f || f4 > 100.0f) && f4 != -1.0f) {
            throw new IllegalArgumentException();
        }
        v3Var.f1446h = f4;
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z8) {
        v3 v3Var = (v3) this.f1419Y0.f898Z.f23859d;
        v3Var.f1444e = z8 ? v3Var.f1444e | 2 : v3Var.f1444e & (-3);
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z8) {
        v3 v3Var = (v3) this.f1419Y0.f898Z.f23859d;
        v3Var.f1444e = z8 ? v3Var.f1444e | 1 : v3Var.f1444e & (-2);
        requestLayout();
    }
}
