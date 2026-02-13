package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.AbstractC1213a;

/* renamed from: o.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1756r0 extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f21582A;

    /* renamed from: B, reason: collision with root package name */
    public int f21583B;

    /* renamed from: C, reason: collision with root package name */
    public int f21584C;

    /* renamed from: a, reason: collision with root package name */
    public boolean f21585a;

    /* renamed from: b, reason: collision with root package name */
    public int f21586b;

    /* renamed from: c, reason: collision with root package name */
    public int f21587c;

    /* renamed from: d, reason: collision with root package name */
    public int f21588d;

    /* renamed from: e, reason: collision with root package name */
    public int f21589e;

    /* renamed from: f, reason: collision with root package name */
    public int f21590f;

    /* renamed from: u, reason: collision with root package name */
    public float f21591u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21592v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f21593w;

    /* renamed from: x, reason: collision with root package name */
    public int[] f21594x;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f21595y;

    /* renamed from: z, reason: collision with root package name */
    public int f21596z;

    public AbstractC1756r0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21585a = true;
        this.f21586b = -1;
        this.f21587c = 0;
        this.f21589e = 8388659;
        int[] iArr = AbstractC1213a.f17576n;
        l2.X u3 = l2.X.u(context, attributeSet, iArr, 0);
        y1.K.m(this, context, iArr, attributeSet, (TypedArray) u3.f19195c, 0, 0);
        TypedArray typedArray = (TypedArray) u3.f19195c;
        int i7 = typedArray.getInt(1, -1);
        if (i7 >= 0) {
            setOrientation(i7);
        }
        int i10 = typedArray.getInt(0, -1);
        if (i10 >= 0) {
            setGravity(i10);
        }
        boolean z8 = typedArray.getBoolean(2, true);
        if (!z8) {
            setBaselineAligned(z8);
        }
        this.f21591u = typedArray.getFloat(4, -1.0f);
        this.f21586b = typedArray.getInt(3, -1);
        this.f21592v = typedArray.getBoolean(7, false);
        setDividerDrawable(u3.n(5));
        this.f21583B = typedArray.getInt(8, 0);
        this.f21584C = typedArray.getDimensionPixelSize(6, 0);
        u3.w();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1755q0;
    }

    public final void d(Canvas canvas, int i7) {
        this.f21595y.setBounds(getPaddingLeft() + this.f21584C, i7, (getWidth() - getPaddingRight()) - this.f21584C, this.f21582A + i7);
        this.f21595y.draw(canvas);
    }

    public final void e(Canvas canvas, int i7) {
        this.f21595y.setBounds(i7, getPaddingTop() + this.f21584C, this.f21596z + i7, (getHeight() - getPaddingBottom()) - this.f21584C);
        this.f21595y.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, o.q0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, o.q0] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1755q0 generateDefaultLayoutParams() {
        int i7 = this.f21588d;
        if (i7 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i7 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, o.q0] */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1755q0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f21586b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f21586b;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f21586b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i11 = this.f21587c;
        if (this.f21588d == 1 && (i7 = this.f21589e & 112) != 48) {
            if (i7 == 16) {
                i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f21590f) / 2;
            } else if (i7 == 80) {
                i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f21590f;
            }
        }
        return i11 + ((LinearLayout.LayoutParams) ((C1755q0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f21586b;
    }

    public Drawable getDividerDrawable() {
        return this.f21595y;
    }

    public int getDividerPadding() {
        return this.f21584C;
    }

    public int getDividerWidth() {
        return this.f21596z;
    }

    public int getGravity() {
        return this.f21589e;
    }

    public int getOrientation() {
        return this.f21588d;
    }

    public int getShowDividers() {
        return this.f21583B;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f21591u;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, o.q0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, o.q0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, o.q0] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1755q0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1755q0 ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i7) {
        if (i7 == 0) {
            return (this.f21583B & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f21583B & 4) != 0;
        }
        if ((this.f21583B & 2) == 0) {
            return false;
        }
        for (int i10 = i7 - 1; i10 >= 0; i10--) {
            if (getChildAt(i10).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        if (this.f21595y == null) {
            return;
        }
        int i10 = 0;
        if (this.f21588d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1755q0) childAt.getLayoutParams())).topMargin) - this.f21582A);
                }
                i10++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f21582A : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1755q0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z8 = c1.f21486a;
        boolean z10 = getLayoutDirection() == 1;
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                C1755q0 c1755q0 = (C1755q0) childAt3.getLayoutParams();
                e(canvas, z10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1755q0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1755q0).leftMargin) - this.f21596z);
            }
            i10++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1755q0 c1755q02 = (C1755q0) childAt4.getLayoutParams();
                if (z10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1755q02).leftMargin;
                    i7 = this.f21596z;
                    right = left - i7;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1755q02).rightMargin;
                }
            } else if (z10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.f21596z;
                right = left - i7;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = 8;
        if (this.f21588d == 1) {
            int paddingLeft = getPaddingLeft();
            int i28 = i11 - i7;
            int paddingRight = i28 - getPaddingRight();
            int paddingRight2 = (i28 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i29 = this.f21589e;
            int i30 = i29 & 112;
            int i31 = 8388615 & i29;
            int paddingTop = i30 != 16 ? i30 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.f21590f : getPaddingTop() + (((i12 - i10) - this.f21590f) / 2);
            int i32 = 0;
            while (i32 < virtualChildCount) {
                View childAt = getChildAt(i32);
                if (childAt != null && childAt.getVisibility() != i27) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C1755q0 c1755q0 = (C1755q0) childAt.getLayoutParams();
                    int i33 = ((LinearLayout.LayoutParams) c1755q0).gravity;
                    if (i33 < 0) {
                        i33 = i31;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i33, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i24 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c1755q0).leftMargin;
                        i25 = ((LinearLayout.LayoutParams) c1755q0).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i26 = ((LinearLayout.LayoutParams) c1755q0).leftMargin + paddingLeft;
                        if (i(i32)) {
                            paddingTop += this.f21582A;
                        }
                        int i34 = paddingTop + ((LinearLayout.LayoutParams) c1755q0).topMargin;
                        childAt.layout(i26, i34, measuredWidth + i26, i34 + measuredHeight);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c1755q0).bottomMargin + i34;
                    } else {
                        i24 = paddingRight - measuredWidth;
                        i25 = ((LinearLayout.LayoutParams) c1755q0).rightMargin;
                    }
                    i26 = i24 - i25;
                    if (i(i32)) {
                    }
                    int i342 = paddingTop + ((LinearLayout.LayoutParams) c1755q0).topMargin;
                    childAt.layout(i26, i342, measuredWidth + i26, i342 + measuredHeight);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) c1755q0).bottomMargin + i342;
                }
                i32++;
                i27 = 8;
            }
            return;
        }
        boolean z10 = c1.f21486a;
        boolean z11 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i35 = i12 - i10;
        int paddingBottom = i35 - getPaddingBottom();
        int paddingBottom2 = (i35 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i36 = this.f21589e;
        int i37 = 8388615 & i36;
        int i38 = i36 & 112;
        boolean z12 = this.f21585a;
        int[] iArr = this.f21593w;
        int[] iArr2 = this.f21594x;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i37, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i7) - this.f21590f : getPaddingLeft() + (((i11 - i7) - this.f21590f) / 2);
        if (z11) {
            i14 = virtualChildCount2 - 1;
            i13 = -1;
        } else {
            i13 = 1;
            i14 = 0;
        }
        int i39 = 0;
        while (i39 < virtualChildCount2) {
            int i40 = (i13 * i39) + i14;
            View childAt2 = getChildAt(i40);
            if (childAt2 == null) {
                i15 = i14;
                i16 = i13;
                i17 = virtualChildCount2;
                i18 = i38;
                i19 = 1;
            } else {
                i15 = i14;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    C1755q0 c1755q02 = (C1755q0) childAt2.getLayoutParams();
                    i16 = i13;
                    if (z12) {
                        i17 = virtualChildCount2;
                        if (((LinearLayout.LayoutParams) c1755q02).height != -1) {
                            i20 = childAt2.getBaseline();
                            i21 = ((LinearLayout.LayoutParams) c1755q02).gravity;
                            if (i21 < 0) {
                                i21 = i38;
                            }
                            i22 = i21 & 112;
                            i18 = i38;
                            if (i22 != 16) {
                                i23 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c1755q02).topMargin) - ((LinearLayout.LayoutParams) c1755q02).bottomMargin;
                            } else if (i22 == 48) {
                                i23 = ((LinearLayout.LayoutParams) c1755q02).topMargin + paddingTop2;
                                if (i20 != -1) {
                                    i23 = (iArr[1] - i20) + i23;
                                }
                            } else if (i22 != 80) {
                                i23 = paddingTop2;
                            } else {
                                i23 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c1755q02).bottomMargin;
                                if (i20 != -1) {
                                    i23 -= iArr2[2] - (childAt2.getMeasuredHeight() - i20);
                                }
                            }
                            if (i(i40)) {
                                paddingLeft2 += this.f21596z;
                            }
                            int i41 = paddingLeft2 + ((LinearLayout.LayoutParams) c1755q02).leftMargin;
                            childAt2.layout(i41, i23, i41 + measuredWidth2, i23 + measuredHeight2);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1755q02).rightMargin + i41;
                        }
                    } else {
                        i17 = virtualChildCount2;
                    }
                    i20 = -1;
                    i21 = ((LinearLayout.LayoutParams) c1755q02).gravity;
                    if (i21 < 0) {
                    }
                    i22 = i21 & 112;
                    i18 = i38;
                    if (i22 != 16) {
                    }
                    if (i(i40)) {
                    }
                    int i412 = paddingLeft2 + ((LinearLayout.LayoutParams) c1755q02).leftMargin;
                    childAt2.layout(i412, i23, i412 + measuredWidth2, i23 + measuredHeight2);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1755q02).rightMargin + i412;
                } else {
                    i16 = i13;
                    i17 = virtualChildCount2;
                    i18 = i38;
                }
                i19 = 1;
            }
            i39 += i19;
            i14 = i15;
            i13 = i16;
            virtualChildCount2 = i17;
            i38 = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i7, int i10) {
        char c10;
        int i11;
        int max;
        float f4;
        int i12;
        int i13;
        int i14;
        int i15;
        char c11;
        int i16;
        int i17;
        int i18;
        int i19;
        float f10;
        int i20;
        int i21;
        boolean z8;
        int baseline;
        int i22;
        int i23;
        float f11;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z10;
        boolean z11;
        C1755q0 c1755q0;
        boolean z12;
        int i29;
        boolean z13;
        int i30;
        int i31;
        int baseline2;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z14;
        C1755q0 c1755q02;
        boolean z15;
        int i41;
        boolean z16;
        int max2;
        int i42 = -2;
        int i43 = 1073741824;
        int i44 = 8;
        int i45 = Integer.MIN_VALUE;
        float f12 = 0.0f;
        boolean z17 = true;
        if (this.f21588d == 1) {
            this.f21590f = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i10);
            int i46 = this.f21586b;
            boolean z18 = this.f21592v;
            boolean z19 = true;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            boolean z20 = false;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            boolean z21 = false;
            float f13 = 0.0f;
            while (i47 < virtualChildCount) {
                View childAt = getChildAt(i47);
                if (childAt == null) {
                    this.f21590f = this.f21590f;
                } else if (childAt.getVisibility() != i44) {
                    if (i(i47)) {
                        this.f21590f += this.f21582A;
                    }
                    C1755q0 c1755q03 = (C1755q0) childAt.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) c1755q03).weight;
                    f13 += f14;
                    if (mode2 == i43 && ((LinearLayout.LayoutParams) c1755q03).height == 0 && f14 > f12) {
                        int i53 = this.f21590f;
                        this.f21590f = Math.max(i53, ((LinearLayout.LayoutParams) c1755q03).topMargin + i53 + ((LinearLayout.LayoutParams) c1755q03).bottomMargin);
                        i37 = i46;
                        i38 = mode2;
                        i39 = mode;
                        i40 = virtualChildCount;
                        c1755q02 = c1755q03;
                        z15 = true;
                        z14 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) c1755q03).height != 0 || f14 <= f12) {
                            i36 = i45;
                        } else {
                            ((LinearLayout.LayoutParams) c1755q03).height = i42;
                            i36 = 0;
                        }
                        int i54 = f13 == f12 ? this.f21590f : 0;
                        i37 = i46;
                        i38 = mode2;
                        i39 = mode;
                        i40 = virtualChildCount;
                        z14 = true;
                        c1755q02 = c1755q03;
                        measureChildWithMargins(childAt, i7, 0, i10, i54);
                        if (i36 != i45) {
                            ((LinearLayout.LayoutParams) c1755q02).height = i36;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i55 = this.f21590f;
                        this.f21590f = Math.max(i55, i55 + measuredHeight + ((LinearLayout.LayoutParams) c1755q02).topMargin + ((LinearLayout.LayoutParams) c1755q02).bottomMargin);
                        int i56 = i50;
                        if (z18) {
                            i50 = Math.max(measuredHeight, i56);
                        }
                        z15 = z20;
                    }
                    if (i37 >= 0 && i37 == i47 + 1) {
                        this.f21587c = this.f21590f;
                    }
                    if (i47 < i37 && ((LinearLayout.LayoutParams) c1755q02).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    i41 = i39;
                    if (i41 == 1073741824 || ((LinearLayout.LayoutParams) c1755q02).width != -1) {
                        z16 = false;
                    } else {
                        z16 = z14;
                        z21 = z16;
                    }
                    int i57 = ((LinearLayout.LayoutParams) c1755q02).leftMargin + ((LinearLayout.LayoutParams) c1755q02).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i57;
                    max2 = Math.max(i51, measuredWidth);
                    int combineMeasuredStates = View.combineMeasuredStates(i52, childAt.getMeasuredState());
                    boolean z22 = (z19 && ((LinearLayout.LayoutParams) c1755q02).width == -1) ? z14 : false;
                    if (((LinearLayout.LayoutParams) c1755q02).weight > 0.0f) {
                        if (!z16) {
                            i57 = measuredWidth;
                        }
                        i49 = Math.max(i49, i57);
                    } else {
                        int i58 = i49;
                        if (!z16) {
                            i57 = measuredWidth;
                        }
                        i48 = Math.max(i48, i57);
                        i49 = i58;
                    }
                    z20 = z15;
                    i52 = combineMeasuredStates;
                    z19 = z22;
                    i47++;
                    mode = i41;
                    i51 = max2;
                    i46 = i37;
                    z17 = z14;
                    mode2 = i38;
                    virtualChildCount = i40;
                    i42 = -2;
                    i43 = 1073741824;
                    i44 = 8;
                    i45 = Integer.MIN_VALUE;
                    f12 = 0.0f;
                }
                i37 = i46;
                i38 = mode2;
                i41 = mode;
                i40 = virtualChildCount;
                max2 = i51;
                z14 = true;
                i47++;
                mode = i41;
                i51 = max2;
                i46 = i37;
                z17 = z14;
                mode2 = i38;
                virtualChildCount = i40;
                i42 = -2;
                i43 = 1073741824;
                i44 = 8;
                i45 = Integer.MIN_VALUE;
                f12 = 0.0f;
            }
            int i59 = mode2;
            int i60 = mode;
            int i61 = virtualChildCount;
            boolean z23 = z17;
            int i62 = i48;
            int i63 = i49;
            int i64 = i50;
            int i65 = i51;
            int i66 = i52;
            if (this.f21590f > 0 && i(i61)) {
                this.f21590f += this.f21582A;
            }
            int i67 = i59;
            if (z18 && (i67 == Integer.MIN_VALUE || i67 == 0)) {
                this.f21590f = 0;
                for (int i68 = 0; i68 < i61; i68++) {
                    View childAt2 = getChildAt(i68);
                    if (childAt2 == null) {
                        this.f21590f = this.f21590f;
                    } else if (childAt2.getVisibility() != 8) {
                        C1755q0 c1755q04 = (C1755q0) childAt2.getLayoutParams();
                        int i69 = this.f21590f;
                        this.f21590f = Math.max(i69, i69 + i64 + ((LinearLayout.LayoutParams) c1755q04).topMargin + ((LinearLayout.LayoutParams) c1755q04).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f21590f;
            this.f21590f = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, 0);
            int i70 = (16777215 & resolveSizeAndState) - this.f21590f;
            if (z20 || (i70 != 0 && f13 > 0.0f)) {
                float f15 = this.f21591u;
                if (f15 > 0.0f) {
                    f13 = f15;
                }
                this.f21590f = 0;
                int i71 = 0;
                while (i71 < i61) {
                    View childAt3 = getChildAt(i71);
                    if (childAt3.getVisibility() == 8) {
                        i33 = i67;
                    } else {
                        C1755q0 c1755q05 = (C1755q0) childAt3.getLayoutParams();
                        float f16 = ((LinearLayout.LayoutParams) c1755q05).weight;
                        if (f16 > 0.0f) {
                            int i72 = (int) ((i70 * f16) / f13);
                            f13 -= f16;
                            int i73 = i70 - i72;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c1755q05).leftMargin + ((LinearLayout.LayoutParams) c1755q05).rightMargin, ((LinearLayout.LayoutParams) c1755q05).width);
                            if (((LinearLayout.LayoutParams) c1755q05).height == 0) {
                                i35 = 1073741824;
                                if (i67 == 1073741824) {
                                    if (i72 <= 0) {
                                        i72 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i72, 1073741824));
                                    i66 = View.combineMeasuredStates(i66, childAt3.getMeasuredState() & (-256));
                                    i70 = i73;
                                }
                            } else {
                                i35 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i72;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i35));
                            i66 = View.combineMeasuredStates(i66, childAt3.getMeasuredState() & (-256));
                            i70 = i73;
                        }
                        int i74 = ((LinearLayout.LayoutParams) c1755q05).leftMargin + ((LinearLayout.LayoutParams) c1755q05).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i74;
                        int max3 = Math.max(i65, measuredWidth2);
                        if (i60 != 1073741824) {
                            i33 = i67;
                            i34 = -1;
                        } else {
                            i33 = i67;
                            i34 = -1;
                        }
                        i74 = measuredWidth2;
                        i62 = Math.max(i62, i74);
                        boolean z24 = (z19 && ((LinearLayout.LayoutParams) c1755q05).width == i34) ? z23 : false;
                        int i75 = this.f21590f;
                        this.f21590f = Math.max(i75, childAt3.getMeasuredHeight() + i75 + ((LinearLayout.LayoutParams) c1755q05).topMargin + ((LinearLayout.LayoutParams) c1755q05).bottomMargin);
                        z19 = z24;
                        i65 = max3;
                    }
                    i71++;
                    i67 = i33;
                }
                this.f21590f = getPaddingBottom() + getPaddingTop() + this.f21590f;
            } else {
                i62 = Math.max(i62, i63);
                if (z18 && i67 != 1073741824) {
                    for (int i76 = 0; i76 < i61; i76++) {
                        View childAt4 = getChildAt(i76);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1755q0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i64, 1073741824));
                        }
                    }
                }
            }
            int i77 = i65;
            if (z19 || i60 == 1073741824) {
                i62 = i77;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i62, getSuggestedMinimumWidth()), i7, i66), resolveSizeAndState);
            if (z21) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i78 = 0; i78 < i61; i78++) {
                    View childAt5 = getChildAt(i78);
                    if (childAt5.getVisibility() != 8) {
                        C1755q0 c1755q06 = (C1755q0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c1755q06).width == -1) {
                            int i79 = ((LinearLayout.LayoutParams) c1755q06).height;
                            ((LinearLayout.LayoutParams) c1755q06).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i10, 0);
                            ((LinearLayout.LayoutParams) c1755q06).height = i79;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f21590f = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i7);
        int mode4 = View.MeasureSpec.getMode(i10);
        if (this.f21593w == null || this.f21594x == null) {
            this.f21593w = new int[4];
            this.f21594x = new int[4];
        }
        int[] iArr = this.f21593w;
        int[] iArr2 = this.f21594x;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z25 = this.f21585a;
        boolean z26 = this.f21592v;
        boolean z27 = mode3 == 1073741824;
        boolean z28 = true;
        int i80 = 0;
        float f17 = 0.0f;
        int i81 = 0;
        int i82 = 0;
        int i83 = 0;
        int i84 = 0;
        int i85 = 0;
        boolean z29 = false;
        boolean z30 = false;
        while (i82 < virtualChildCount2) {
            View childAt6 = getChildAt(i82);
            if (childAt6 == null) {
                this.f21590f = this.f21590f;
                i28 = i82;
                z10 = z26;
                z11 = z25;
            } else {
                int i86 = i80;
                int i87 = i81;
                if (childAt6.getVisibility() == 8) {
                    z11 = z25;
                    i80 = i86;
                    i81 = i87;
                    i28 = i82;
                    z10 = z26;
                } else {
                    if (i(i82)) {
                        this.f21590f += this.f21596z;
                    }
                    C1755q0 c1755q07 = (C1755q0) childAt6.getLayoutParams();
                    float f18 = ((LinearLayout.LayoutParams) c1755q07).weight;
                    float f19 = f17 + f18;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c1755q07).width == 0 && f18 > 0.0f) {
                        if (z27) {
                            i32 = i82;
                            this.f21590f = ((LinearLayout.LayoutParams) c1755q07).leftMargin + ((LinearLayout.LayoutParams) c1755q07).rightMargin + this.f21590f;
                        } else {
                            i32 = i82;
                            int i88 = this.f21590f;
                            this.f21590f = Math.max(i88, ((LinearLayout.LayoutParams) c1755q07).leftMargin + i88 + ((LinearLayout.LayoutParams) c1755q07).rightMargin);
                        }
                        if (z25) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            c1755q0 = c1755q07;
                            i25 = i86;
                            i26 = i87;
                            i28 = i32;
                            z10 = z26;
                            z11 = z25;
                        } else {
                            c1755q0 = c1755q07;
                            i25 = i86;
                            i26 = i87;
                            i28 = i32;
                            i29 = 1073741824;
                            z10 = z26;
                            z11 = z25;
                            z12 = true;
                            if (mode4 == i29 && ((LinearLayout.LayoutParams) c1755q0).height == -1) {
                                z13 = true;
                                z30 = true;
                            } else {
                                z13 = false;
                            }
                            i30 = ((LinearLayout.LayoutParams) c1755q0).topMargin + ((LinearLayout.LayoutParams) c1755q0).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i30;
                            int combineMeasuredStates2 = View.combineMeasuredStates(i83, childAt6.getMeasuredState());
                            if (z11 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i31 = i30;
                            } else {
                                int i89 = ((LinearLayout.LayoutParams) c1755q0).gravity;
                                if (i89 < 0) {
                                    i89 = this.f21589e;
                                }
                                int i90 = (((i89 & 112) >> 4) & (-2)) >> 1;
                                i31 = i30;
                                iArr[i90] = Math.max(iArr[i90], baseline2);
                                iArr2[i90] = Math.max(iArr2[i90], measuredHeight3 - baseline2);
                            }
                            int max4 = Math.max(i26, measuredHeight3);
                            boolean z31 = !z28 && ((LinearLayout.LayoutParams) c1755q0).height == -1;
                            if (((LinearLayout.LayoutParams) c1755q0).weight <= 0.0f) {
                                if (z13) {
                                    measuredHeight3 = i31;
                                }
                                i85 = Math.max(i85, measuredHeight3);
                                i80 = i25;
                            } else {
                                if (z13) {
                                    measuredHeight3 = i31;
                                }
                                i80 = Math.max(i25, measuredHeight3);
                            }
                            i81 = max4;
                            i83 = combineMeasuredStates2;
                            z29 = z12;
                            z28 = z31;
                            f17 = f19;
                        }
                    } else {
                        int i91 = i82;
                        if (((LinearLayout.LayoutParams) c1755q07).width == 0) {
                            f11 = 0.0f;
                            if (f18 > 0.0f) {
                                ((LinearLayout.LayoutParams) c1755q07).width = -2;
                                i24 = 0;
                                i25 = i86;
                                i26 = i87;
                                i27 = i24;
                                i28 = i91;
                                z10 = z26;
                                z11 = z25;
                                measureChildWithMargins(childAt6, i7, f19 != f11 ? this.f21590f : 0, i10, 0);
                                if (i27 == Integer.MIN_VALUE) {
                                    c1755q0 = c1755q07;
                                    ((LinearLayout.LayoutParams) c1755q0).width = i27;
                                } else {
                                    c1755q0 = c1755q07;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (z27) {
                                    int i92 = this.f21590f;
                                    this.f21590f = Math.max(i92, i92 + measuredWidth3 + ((LinearLayout.LayoutParams) c1755q0).leftMargin + ((LinearLayout.LayoutParams) c1755q0).rightMargin);
                                } else {
                                    this.f21590f = ((LinearLayout.LayoutParams) c1755q0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c1755q0).rightMargin + this.f21590f;
                                }
                                if (z10) {
                                    i84 = Math.max(measuredWidth3, i84);
                                }
                            }
                        } else {
                            f11 = 0.0f;
                        }
                        i24 = Integer.MIN_VALUE;
                        i25 = i86;
                        i26 = i87;
                        i27 = i24;
                        i28 = i91;
                        z10 = z26;
                        z11 = z25;
                        measureChildWithMargins(childAt6, i7, f19 != f11 ? this.f21590f : 0, i10, 0);
                        if (i27 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (z27) {
                        }
                        if (z10) {
                        }
                    }
                    z12 = z29;
                    i29 = 1073741824;
                    if (mode4 == i29) {
                    }
                    z13 = false;
                    i30 = ((LinearLayout.LayoutParams) c1755q0).topMargin + ((LinearLayout.LayoutParams) c1755q0).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i30;
                    int combineMeasuredStates22 = View.combineMeasuredStates(i83, childAt6.getMeasuredState());
                    if (z11) {
                    }
                    i31 = i30;
                    int max42 = Math.max(i26, measuredHeight32);
                    if (z28) {
                    }
                    if (((LinearLayout.LayoutParams) c1755q0).weight <= 0.0f) {
                    }
                    i81 = max42;
                    i83 = combineMeasuredStates22;
                    z29 = z12;
                    z28 = z31;
                    f17 = f19;
                }
            }
            i82 = i28 + 1;
            z26 = z10;
            z25 = z11;
        }
        int i93 = i81;
        boolean z32 = z26;
        boolean z33 = z25;
        if (this.f21590f > 0 && i(virtualChildCount2)) {
            this.f21590f += this.f21596z;
        }
        int i94 = iArr[1];
        if (i94 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c10 = 3;
            if (iArr[3] == -1) {
                max = i93;
                i11 = i83;
                if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    this.f21590f = 0;
                    for (i23 = 0; i23 < virtualChildCount2; i23++) {
                        View childAt7 = getChildAt(i23);
                        if (childAt7 == null) {
                            this.f21590f = this.f21590f;
                        } else if (childAt7.getVisibility() != 8) {
                            C1755q0 c1755q08 = (C1755q0) childAt7.getLayoutParams();
                            if (z27) {
                                this.f21590f = ((LinearLayout.LayoutParams) c1755q08).leftMargin + i84 + ((LinearLayout.LayoutParams) c1755q08).rightMargin + this.f21590f;
                            } else {
                                int i95 = this.f21590f;
                                this.f21590f = Math.max(i95, i95 + i84 + ((LinearLayout.LayoutParams) c1755q08).leftMargin + ((LinearLayout.LayoutParams) c1755q08).rightMargin);
                            }
                        }
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f21590f;
                this.f21590f = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i7, 0);
                int i96 = (16777215 & resolveSizeAndState2) - this.f21590f;
                if (!z29 || (i96 != 0 && f17 > 0.0f)) {
                    f4 = this.f21591u;
                    if (f4 > 0.0f) {
                        f17 = f4;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f21590f = 0;
                    int i97 = i11;
                    max = -1;
                    i12 = 0;
                    while (i12 < virtualChildCount2) {
                        View childAt8 = getChildAt(i12);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i17 = i96;
                            i18 = virtualChildCount2;
                        } else {
                            C1755q0 c1755q09 = (C1755q0) childAt8.getLayoutParams();
                            float f20 = ((LinearLayout.LayoutParams) c1755q09).weight;
                            if (f20 > 0.0f) {
                                i18 = virtualChildCount2;
                                int i98 = (int) ((i96 * f20) / f17);
                                float f21 = f17 - f20;
                                int i99 = i96 - i98;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c1755q09).topMargin + ((LinearLayout.LayoutParams) c1755q09).bottomMargin, ((LinearLayout.LayoutParams) c1755q09).height);
                                if (((LinearLayout.LayoutParams) c1755q09).width == 0) {
                                    i22 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i98 <= 0) {
                                            i98 = 0;
                                        }
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i98, 1073741824), childMeasureSpec2);
                                        i97 = View.combineMeasuredStates(i97, childAt8.getMeasuredState() & (-16777216));
                                        f17 = f21;
                                        i19 = i99;
                                    }
                                } else {
                                    i22 = 1073741824;
                                }
                                int measuredWidth4 = childAt8.getMeasuredWidth() + i98;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i22), childMeasureSpec2);
                                i97 = View.combineMeasuredStates(i97, childAt8.getMeasuredState() & (-16777216));
                                f17 = f21;
                                i19 = i99;
                            } else {
                                i19 = i96;
                                i18 = virtualChildCount2;
                            }
                            if (z27) {
                                f10 = f17;
                                this.f21590f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1755q09).leftMargin + ((LinearLayout.LayoutParams) c1755q09).rightMargin + this.f21590f;
                                i20 = i19;
                            } else {
                                f10 = f17;
                                int i100 = this.f21590f;
                                i20 = i19;
                                this.f21590f = Math.max(i100, childAt8.getMeasuredWidth() + i100 + ((LinearLayout.LayoutParams) c1755q09).leftMargin + ((LinearLayout.LayoutParams) c1755q09).rightMargin);
                            }
                            boolean z34 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c1755q09).height == -1;
                            int i101 = ((LinearLayout.LayoutParams) c1755q09).topMargin + ((LinearLayout.LayoutParams) c1755q09).bottomMargin;
                            int measuredHeight4 = childAt8.getMeasuredHeight() + i101;
                            max = Math.max(max, measuredHeight4);
                            if (!z34) {
                                i101 = measuredHeight4;
                            }
                            i80 = Math.max(i80, i101);
                            if (z28) {
                                i21 = -1;
                                if (((LinearLayout.LayoutParams) c1755q09).height == -1) {
                                    z8 = true;
                                    if (!z33 && (baseline = childAt8.getBaseline()) != i21) {
                                        int i102 = ((LinearLayout.LayoutParams) c1755q09).gravity;
                                        if (i102 < 0) {
                                            i102 = this.f21589e;
                                        }
                                        int i103 = (((i102 & 112) >> 4) & (-2)) >> 1;
                                        iArr[i103] = Math.max(iArr[i103], baseline);
                                        iArr2[i103] = Math.max(iArr2[i103], measuredHeight4 - baseline);
                                    }
                                    z28 = z8;
                                    i17 = i20;
                                    f17 = f10;
                                }
                            } else {
                                i21 = -1;
                            }
                            z8 = false;
                            if (!z33) {
                            }
                            z28 = z8;
                            i17 = i20;
                            f17 = f10;
                        }
                        i12++;
                        i96 = i17;
                        virtualChildCount2 = i18;
                    }
                    i13 = i10;
                    i14 = virtualChildCount2;
                    this.f21590f = getPaddingRight() + getPaddingLeft() + this.f21590f;
                    i15 = iArr[1];
                    if (i15 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c11 = 3;
                        if (iArr[3] == -1) {
                            i16 = 0;
                            i11 = i97;
                        }
                    } else {
                        c11 = 3;
                    }
                    i16 = 0;
                    max = Math.max(max, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
                    i11 = i97;
                } else {
                    i80 = Math.max(i80, i85);
                    if (z32 && mode3 != 1073741824) {
                        for (int i104 = 0; i104 < virtualChildCount2; i104++) {
                            View childAt9 = getChildAt(i104);
                            if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1755q0) childAt9.getLayoutParams())).weight > 0.0f) {
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(i84, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i13 = i10;
                    i14 = virtualChildCount2;
                    i16 = 0;
                }
                if (!z28 || mode4 == 1073741824) {
                    i80 = max;
                }
                setMeasuredDimension((i11 & (-16777216)) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i80, getSuggestedMinimumHeight()), i13, i11 << 16));
                if (z30) {
                    return;
                }
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                int i105 = i14;
                while (i16 < i105) {
                    View childAt10 = getChildAt(i16);
                    if (childAt10.getVisibility() != 8) {
                        C1755q0 c1755q010 = (C1755q0) childAt10.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c1755q010).height == -1) {
                            int i106 = ((LinearLayout.LayoutParams) c1755q010).width;
                            ((LinearLayout.LayoutParams) c1755q010).width = childAt10.getMeasuredWidth();
                            measureChildWithMargins(childAt10, i7, 0, makeMeasureSpec3, 0);
                            ((LinearLayout.LayoutParams) c1755q010).width = i106;
                        }
                    }
                    i16++;
                }
                return;
            }
        } else {
            c10 = 3;
        }
        i11 = i83;
        max = Math.max(i93, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i94, iArr[2]))));
        if (z32) {
            this.f21590f = 0;
            while (i23 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f21590f;
        this.f21590f = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i7, 0);
        int i962 = (16777215 & resolveSizeAndState22) - this.f21590f;
        if (z29) {
        }
        f4 = this.f21591u;
        if (f4 > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f21590f = 0;
        int i972 = i11;
        max = -1;
        i12 = 0;
        while (i12 < virtualChildCount2) {
        }
        i13 = i10;
        i14 = virtualChildCount2;
        this.f21590f = getPaddingRight() + getPaddingLeft() + this.f21590f;
        i15 = iArr[1];
        if (i15 != -1) {
        }
        c11 = 3;
        i16 = 0;
        max = Math.max(max, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
        i11 = i972;
        if (!z28) {
        }
        i80 = max;
        setMeasuredDimension((i11 & (-16777216)) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i80, getSuggestedMinimumHeight()), i13, i11 << 16));
        if (z30) {
        }
    }

    public void setBaselineAligned(boolean z8) {
        this.f21585a = z8;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f21586b = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f21595y) {
            return;
        }
        this.f21595y = drawable;
        if (drawable != null) {
            this.f21596z = drawable.getIntrinsicWidth();
            this.f21582A = drawable.getIntrinsicHeight();
        } else {
            this.f21596z = 0;
            this.f21582A = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f21584C = i7;
    }

    public void setGravity(int i7) {
        if (this.f21589e != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f21589e = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i10 = i7 & 8388615;
        int i11 = this.f21589e;
        if ((8388615 & i11) != i10) {
            this.f21589e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z8) {
        this.f21592v = z8;
    }

    public void setOrientation(int i7) {
        if (this.f21588d != i7) {
            this.f21588d = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f21583B) {
            requestLayout();
        }
        this.f21583B = i7;
    }

    public void setVerticalGravity(int i7) {
        int i10 = i7 & 112;
        int i11 = this.f21589e;
        if ((i11 & 112) != i10) {
            this.f21589e = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f4) {
        this.f21591u = Math.max(0.0f, f4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
