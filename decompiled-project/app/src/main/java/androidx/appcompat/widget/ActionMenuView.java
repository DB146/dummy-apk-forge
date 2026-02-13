package androidx.appcompat.widget;

import Y5.B;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.common.api.f;
import ia.C1358d;
import n.C1680n;
import n.InterfaceC1677k;
import n.InterfaceC1692z;
import n.MenuC1678l;
import o.AbstractC1756r0;
import o.C1732f;
import o.C1738i;
import o.C1740j;
import o.C1744l;
import o.C1755q0;
import o.InterfaceC1742k;
import o.InterfaceC1746m;
import o.c1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1756r0 implements InterfaceC1677k, InterfaceC1692z {

    /* renamed from: D, reason: collision with root package name */
    public MenuC1678l f12973D;

    /* renamed from: E, reason: collision with root package name */
    public Context f12974E;

    /* renamed from: F, reason: collision with root package name */
    public int f12975F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f12976G;

    /* renamed from: H, reason: collision with root package name */
    public C1740j f12977H;

    /* renamed from: I, reason: collision with root package name */
    public C1358d f12978I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f12979J;

    /* renamed from: K, reason: collision with root package name */
    public int f12980K;
    public final int L;

    /* renamed from: M, reason: collision with root package name */
    public final int f12981M;

    /* renamed from: N, reason: collision with root package name */
    public InterfaceC1746m f12982N;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.L = (int) (56.0f * f4);
        this.f12981M = (int) (f4 * 4.0f);
        this.f12974E = context;
        this.f12975F = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, o.l] */
    public static C1744l j() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f21531a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, o.l] */
    public static C1744l k(ViewGroup.LayoutParams layoutParams) {
        C1744l c1744l;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C1744l) {
            C1744l c1744l2 = (C1744l) layoutParams;
            ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c1744l2);
            layoutParams2.f21531a = c1744l2.f21531a;
            c1744l = layoutParams2;
        } else {
            c1744l = new LinearLayout.LayoutParams(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1744l).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1744l).gravity = 16;
        }
        return c1744l;
    }

    @Override // n.InterfaceC1692z
    public final void b(MenuC1678l menuC1678l) {
        this.f12973D = menuC1678l;
    }

    @Override // n.InterfaceC1677k
    public final boolean c(C1680n c1680n) {
        return this.f12973D.q(c1680n, null, 0);
    }

    @Override // o.AbstractC1756r0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1744l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // o.AbstractC1756r0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1755q0 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, o.q0] */
    @Override // o.AbstractC1756r0
    /* renamed from: g */
    public final C1755q0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // o.AbstractC1756r0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // o.AbstractC1756r0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // o.AbstractC1756r0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f12973D == null) {
            Context context = getContext();
            MenuC1678l menuC1678l = new MenuC1678l(context);
            this.f12973D = menuC1678l;
            menuC1678l.f20958e = new C1358d(this, 6);
            C1740j c1740j = new C1740j(context);
            this.f12977H = c1740j;
            c1740j.f21526z = true;
            c1740j.f21504A = true;
            c1740j.f21519e = new B(15);
            this.f12973D.b(c1740j, this.f12974E);
            C1740j c1740j2 = this.f12977H;
            c1740j2.f21522v = this;
            this.f12973D = c1740j2.f21517c;
        }
        return this.f12973D;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1740j c1740j = this.f12977H;
        C1738i c1738i = c1740j.f21523w;
        if (c1738i != null) {
            return c1738i.getDrawable();
        }
        if (c1740j.f21525y) {
            return c1740j.f21524x;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f12975F;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // o.AbstractC1756r0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1755q0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i7) {
        boolean z8 = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof InterfaceC1742k)) {
            z8 = ((InterfaceC1742k) childAt).b();
        }
        return (i7 <= 0 || !(childAt2 instanceof InterfaceC1742k)) ? z8 : z8 | ((InterfaceC1742k) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1740j c1740j = this.f12977H;
        if (c1740j != null) {
            c1740j.d();
            if (this.f12977H.e()) {
                this.f12977H.c();
                this.f12977H.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1740j c1740j = this.f12977H;
        if (c1740j != null) {
            c1740j.c();
            C1732f c1732f = c1740j.f21511H;
            if (c1732f == null || !c1732f.b()) {
                return;
            }
            c1732f.f21016i.dismiss();
        }
    }

    @Override // o.AbstractC1756r0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int width;
        int i13;
        if (!this.f12979J) {
            super.onLayout(z8, i7, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i11 - i7;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z10 = c1.f21486a;
        boolean z11 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C1744l c1744l = (C1744l) childAt.getLayoutParams();
                if (c1744l.f21531a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        i13 = getPaddingLeft() + ((LinearLayout.LayoutParams) c1744l).leftMargin;
                        width = i13 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1744l).rightMargin;
                        i13 = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i13, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1744l).leftMargin) + ((LinearLayout.LayoutParams) c1744l).rightMargin;
                    l(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int max = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C1744l c1744l2 = (C1744l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1744l2.f21531a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) c1744l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1744l2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C1744l c1744l3 = (C1744l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1744l3.f21531a) {
                int i27 = paddingLeft + ((LinearLayout.LayoutParams) c1744l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c1744l3).rightMargin + max + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // o.AbstractC1756r0, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        boolean z8;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        ?? r42;
        int i16;
        int i17;
        int i18;
        MenuC1678l menuC1678l;
        boolean z11 = this.f12979J;
        boolean z12 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f12979J = z12;
        if (z11 != z12) {
            this.f12980K = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f12979J && (menuC1678l = this.f12973D) != null && size != this.f12980K) {
            this.f12980K = size;
            menuC1678l.p(true);
        }
        int childCount = getChildCount();
        if (!this.f12979J || childCount <= 0) {
            for (int i19 = 0; i19 < childCount; i19++) {
                C1744l c1744l = (C1744l) getChildAt(i19).getLayoutParams();
                ((LinearLayout.LayoutParams) c1744l).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1744l).leftMargin = 0;
            }
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i20 = size2 - paddingRight;
        int i21 = this.L;
        int i22 = i20 / i21;
        int i23 = i20 % i21;
        if (i22 == 0) {
            setMeasuredDimension(i20, 0);
            return;
        }
        int i24 = (i23 / i22) + i21;
        int childCount2 = getChildCount();
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean z13 = false;
        int i29 = 0;
        long j = 0;
        while (true) {
            i11 = this.f12981M;
            if (i28 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i28);
            int i30 = size3;
            int i31 = i20;
            if (childAt.getVisibility() == 8) {
                i16 = mode;
                i17 = paddingBottom;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i32 = i26 + 1;
                if (z14) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                C1744l c1744l2 = (C1744l) childAt.getLayoutParams();
                c1744l2.f21536f = false;
                c1744l2.f21533c = 0;
                c1744l2.f21532b = 0;
                c1744l2.f21534d = false;
                ((LinearLayout.LayoutParams) c1744l2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1744l2).rightMargin = 0;
                c1744l2.f21535e = z14 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i33 = c1744l2.f21531a ? 1 : i22;
                C1744l c1744l3 = (C1744l) childAt.getLayoutParams();
                i16 = mode;
                i17 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z14 ? (ActionMenuItemView) childAt : null;
                boolean z15 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i33 <= 0 || (z15 && i33 < 2)) {
                    i18 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i33 * i24, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i18 = measuredWidth / i24;
                    if (measuredWidth % i24 != 0) {
                        i18++;
                    }
                    if (z15 && i18 < 2) {
                        i18 = 2;
                    }
                }
                c1744l3.f21534d = !c1744l3.f21531a && z15;
                c1744l3.f21532b = i18;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18 * i24, 1073741824), makeMeasureSpec);
                i27 = Math.max(i27, i18);
                if (c1744l2.f21534d) {
                    i29++;
                }
                if (c1744l2.f21531a) {
                    z13 = true;
                }
                i22 -= i18;
                i25 = Math.max(i25, childAt.getMeasuredHeight());
                if (i18 == 1) {
                    j |= 1 << i28;
                }
                i26 = i32;
            }
            i28++;
            size3 = i30;
            i20 = i31;
            paddingBottom = i17;
            mode = i16;
        }
        int i34 = mode;
        int i35 = i20;
        int i36 = size3;
        boolean z16 = z13 && i26 == 2;
        boolean z17 = false;
        while (i29 > 0 && i22 > 0) {
            int i37 = f.API_PRIORITY_OTHER;
            int i38 = 0;
            int i39 = 0;
            long j10 = 0;
            while (i39 < childCount2) {
                C1744l c1744l4 = (C1744l) getChildAt(i39).getLayoutParams();
                boolean z18 = z17;
                if (c1744l4.f21534d) {
                    int i40 = c1744l4.f21532b;
                    if (i40 < i37) {
                        j10 = 1 << i39;
                        i37 = i40;
                        i38 = 1;
                    } else if (i40 == i37) {
                        j10 |= 1 << i39;
                        i38++;
                    }
                }
                i39++;
                z17 = z18;
            }
            z8 = z17;
            j |= j10;
            if (i38 > i22) {
                break;
            }
            int i41 = i37 + 1;
            int i42 = 0;
            while (i42 < childCount2) {
                View childAt2 = getChildAt(i42);
                C1744l c1744l5 = (C1744l) childAt2.getLayoutParams();
                int i43 = i25;
                int i44 = childMeasureSpec;
                int i45 = childCount2;
                long j11 = 1 << i42;
                if ((j10 & j11) != 0) {
                    if (z16 && c1744l5.f21535e) {
                        r42 = 1;
                        r42 = 1;
                        if (i22 == 1) {
                            childAt2.setPadding(i11 + i24, 0, i11, 0);
                        }
                    } else {
                        r42 = 1;
                    }
                    c1744l5.f21532b += r42;
                    c1744l5.f21536f = r42;
                    i22--;
                } else if (c1744l5.f21532b == i41) {
                    j |= j11;
                }
                i42++;
                childMeasureSpec = i44;
                i25 = i43;
                childCount2 = i45;
            }
            z17 = true;
        }
        z8 = z17;
        int i46 = i25;
        int i47 = childMeasureSpec;
        int i48 = childCount2;
        boolean z19 = !z13 && i26 == 1;
        if (i22 <= 0 || j == 0 || (i22 >= i26 - 1 && !z19 && i27 <= 1)) {
            i12 = i48;
            z10 = z8;
        } else {
            float bitCount = Long.bitCount(j);
            if (!z19) {
                if ((j & 1) != 0 && !((C1744l) getChildAt(0).getLayoutParams()).f21535e) {
                    bitCount -= 0.5f;
                }
                int i49 = i48 - 1;
                if ((j & (1 << i49)) != 0 && !((C1744l) getChildAt(i49).getLayoutParams()).f21535e) {
                    bitCount -= 0.5f;
                }
            }
            int i50 = bitCount > 0.0f ? (int) ((i22 * i24) / bitCount) : 0;
            boolean z20 = z8;
            i12 = i48;
            for (int i51 = 0; i51 < i12; i51++) {
                if ((j & (1 << i51)) != 0) {
                    View childAt3 = getChildAt(i51);
                    C1744l c1744l6 = (C1744l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1744l6.f21533c = i50;
                        c1744l6.f21536f = true;
                        if (i51 == 0 && !c1744l6.f21535e) {
                            ((LinearLayout.LayoutParams) c1744l6).leftMargin = (-i50) / 2;
                        }
                        z20 = true;
                    } else {
                        if (c1744l6.f21531a) {
                            c1744l6.f21533c = i50;
                            c1744l6.f21536f = true;
                            ((LinearLayout.LayoutParams) c1744l6).rightMargin = (-i50) / 2;
                            z20 = true;
                        } else {
                            if (i51 != 0) {
                                ((LinearLayout.LayoutParams) c1744l6).leftMargin = i50 / 2;
                            }
                            if (i51 != i12 - 1) {
                                ((LinearLayout.LayoutParams) c1744l6).rightMargin = i50 / 2;
                            }
                        }
                    }
                }
            }
            z10 = z20;
        }
        if (z10) {
            int i52 = 0;
            while (i52 < i12) {
                View childAt4 = getChildAt(i52);
                C1744l c1744l7 = (C1744l) childAt4.getLayoutParams();
                if (c1744l7.f21536f) {
                    i15 = i47;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1744l7.f21532b * i24) + c1744l7.f21533c, 1073741824), i15);
                } else {
                    i15 = i47;
                }
                i52++;
                i47 = i15;
            }
        }
        if (i34 != 1073741824) {
            i14 = i35;
            i13 = i46;
        } else {
            i13 = i36;
            i14 = i35;
        }
        setMeasuredDimension(i14, i13);
    }

    public void setExpandedActionViewsExclusive(boolean z8) {
        this.f12977H.f21508E = z8;
    }

    public void setOnMenuItemClickListener(InterfaceC1746m interfaceC1746m) {
        this.f12982N = interfaceC1746m;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1740j c1740j = this.f12977H;
        C1738i c1738i = c1740j.f21523w;
        if (c1738i != null) {
            c1738i.setImageDrawable(drawable);
        } else {
            c1740j.f21525y = true;
            c1740j.f21524x = drawable;
        }
    }

    public void setOverflowReserved(boolean z8) {
        this.f12976G = z8;
    }

    public void setPopupTheme(int i7) {
        if (this.f12975F != i7) {
            this.f12975F = i7;
            if (i7 == 0) {
                this.f12974E = getContext();
            } else {
                this.f12974E = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(C1740j c1740j) {
        this.f12977H = c1740j;
        c1740j.f21522v = this;
        this.f12973D = c1740j.f21517c;
    }
}
