package Z0;

import B0.AbstractC0167b;
import Q.C0480b;
import Q.C0487e0;
import Q.C0506o;
import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import y1.AbstractC2352B;
import y1.InterfaceC2366n;
import y1.K;
import y1.p0;

/* loaded from: classes.dex */
public final class i extends AbstractC0167b implements InterfaceC2366n {

    /* renamed from: A, reason: collision with root package name */
    public boolean f12115A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f12116B;

    /* renamed from: w, reason: collision with root package name */
    public final Window f12117w;

    /* renamed from: x, reason: collision with root package name */
    public final C0487e0 f12118x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12119y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12120z;

    public i(Context context, Window window) {
        super(context);
        this.f12117w = window;
        this.f12118x = C0480b.o(h.f12114a);
        WeakHashMap weakHashMap = K.f26642a;
        AbstractC2352B.l(this, this);
        K.p(this, new Y0.a(this, 1));
    }

    @Override // B0.AbstractC0167b
    public final void a(C0506o c0506o) {
        c0506o.S(1735448596);
        ((Rb.e) this.f12118x.getValue()).invoke(c0506o, 0);
        c0506o.p(false);
    }

    @Override // B0.AbstractC0167b
    public final void e(int i7, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i13 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i14 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // B0.AbstractC0167b
    public final void f(int i7, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i7, i10);
            return;
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        Window window = this.f12117w;
        int i11 = (mode != Integer.MIN_VALUE || this.f12119y || this.f12120z || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i12 = size - paddingRight;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = i11 - paddingBottom;
        int i14 = i13 >= 0 ? i13 : 0;
        int mode2 = View.MeasureSpec.getMode(i7);
        if (mode2 != 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        }
        childAt.measure(i7, i10);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f12119y || this.f12120z || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // B0.AbstractC0167b
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f12116B;
    }

    @Override // y1.InterfaceC2366n
    public final p0 l(View view, p0 p0Var) {
        if (this.f12120z) {
            return p0Var;
        }
        View childAt = getChildAt(0);
        int max = Math.max(0, childAt.getLeft());
        int max2 = Math.max(0, childAt.getTop());
        int max3 = Math.max(0, getWidth() - childAt.getRight());
        int max4 = Math.max(0, getHeight() - childAt.getBottom());
        return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? p0Var : p0Var.f26731a.n(max, max2, max3, max4);
    }
}
