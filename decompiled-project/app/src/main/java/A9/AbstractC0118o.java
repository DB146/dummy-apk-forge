package A9;

import a2.AbstractC0708a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.kt.apps.core.base.leanback.ImageCardView;
import java.util.ArrayList;

/* renamed from: A9.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0118o extends FrameLayout {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f1307F = {R.attr.state_pressed};

    /* renamed from: A, reason: collision with root package name */
    public float f1308A;

    /* renamed from: B, reason: collision with root package name */
    public float f1309B;

    /* renamed from: C, reason: collision with root package name */
    public float f1310C;

    /* renamed from: D, reason: collision with root package name */
    public C0110m f1311D;

    /* renamed from: E, reason: collision with root package name */
    public final RunnableC0102k f1312E;

    /* renamed from: a, reason: collision with root package name */
    public int f1313a;

    /* renamed from: b, reason: collision with root package name */
    public int f1314b;

    /* renamed from: c, reason: collision with root package name */
    public int f1315c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1316d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1317e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1318f;

    /* renamed from: u, reason: collision with root package name */
    public int f1319u;

    /* renamed from: v, reason: collision with root package name */
    public int f1320v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1321w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1322x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1323y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1324z;

    public AbstractC0118o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kt.apps.media.xemtv.beta.R.attr.imageCardViewStyle);
        this.f1312E = new RunnableC0102k((ImageCardView) this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0708a.f12486d, com.kt.apps.media.xemtv.beta.R.attr.imageCardViewStyle, 0);
        try {
            this.f1313a = obtainStyledAttributes.getInteger(3, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(2);
            if (drawable != null) {
                setForeground(drawable);
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                setBackground(drawable2);
            }
            this.f1314b = obtainStyledAttributes.getInteger(5, 1);
            int integer = obtainStyledAttributes.getInteger(4, 2);
            this.f1315c = integer;
            int i7 = this.f1314b;
            if (integer < i7) {
                this.f1315c = i7;
            }
            this.f1322x = obtainStyledAttributes.getInteger(6, getResources().getInteger(com.kt.apps.media.xemtv.beta.R.integer.lb_card_selected_animation_delay));
            this.f1324z = obtainStyledAttributes.getInteger(7, getResources().getInteger(com.kt.apps.media.xemtv.beta.R.integer.lb_card_selected_animation_duration));
            this.f1323y = obtainStyledAttributes.getInteger(0, getResources().getInteger(com.kt.apps.media.xemtv.beta.R.integer.lb_card_activated_animation_duration));
            obtainStyledAttributes.recycle();
            this.f1321w = true;
            this.f1316d = new ArrayList();
            this.f1317e = new ArrayList();
            this.f1318f = new ArrayList();
            this.f1308A = 0.0f;
            this.f1309B = getFinalInfoVisFraction();
            this.f1310C = getFinalInfoAlpha();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setInfoViewVisibility(boolean z8) {
        int i7 = this.f1313a;
        ArrayList arrayList = this.f1317e;
        int i10 = 0;
        if (i7 != 3) {
            if (i7 != 2) {
                if (i7 == 1) {
                    b();
                    if (z8) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ((View) arrayList.get(i11)).setVisibility(0);
                        }
                    }
                    if ((z8 ? 1.0f : 0.0f) == this.f1310C) {
                        return;
                    }
                    C0110m c0110m = new C0110m(this, this.f1310C, z8 ? 1.0f : 0.0f, 0);
                    this.f1311D = c0110m;
                    c0110m.setDuration(this.f1323y);
                    this.f1311D.setInterpolator(new DecelerateInterpolator());
                    this.f1311D.setAnimationListener(new AnimationAnimationListenerC0106l(this, 2));
                    startAnimation(this.f1311D);
                    return;
                }
                return;
            }
            if (this.f1314b != 2) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ((View) arrayList.get(i12)).setVisibility(z8 ? 0 : 8);
                }
                return;
            }
            b();
            if (z8) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((View) arrayList.get(i13)).setVisibility(0);
                }
            }
            float f4 = z8 ? 1.0f : 0.0f;
            if (this.f1309B == f4) {
                return;
            }
            C0110m c0110m2 = new C0110m(this, this.f1309B, f4, 1);
            this.f1311D = c0110m2;
            c0110m2.setDuration(this.f1324z);
            this.f1311D.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f1311D.setAnimationListener(new AnimationAnimationListenerC0106l(this, 1));
            startAnimation(this.f1311D);
            return;
        }
        if (z8) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((View) arrayList.get(i14)).setVisibility(0);
            }
            return;
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            ((View) arrayList.get(i15)).setVisibility(8);
        }
        while (true) {
            ArrayList arrayList2 = this.f1318f;
            if (i10 >= arrayList2.size()) {
                this.f1308A = 0.0f;
                return;
            } else {
                ((View) arrayList2.get(i10)).setVisibility(8);
                i10++;
            }
        }
    }

    public final void a(boolean z8) {
        b();
        int i7 = 0;
        if (z8) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1319u, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f1318f;
                if (i10 >= arrayList.size()) {
                    break;
                }
                View view = (View) arrayList.get(i10);
                view.setVisibility(0);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i11 = Math.max(i11, view.getMeasuredHeight());
                i10++;
            }
            i7 = i11;
        }
        C0110m c0110m = new C0110m(this, this.f1308A, z8 ? i7 : 0.0f, 2);
        this.f1311D = c0110m;
        c0110m.setDuration(this.f1324z);
        this.f1311D.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f1311D.setAnimationListener(new AnimationAnimationListenerC0106l(this, 0));
        startAnimation(this.f1311D);
    }

    public final void b() {
        C0110m c0110m = this.f1311D;
        if (c0110m != null) {
            c0110m.cancel();
            this.f1311D = null;
            clearAnimation();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0114n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, A9.n, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.f1290a = 0;
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A9.n, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.f1290a = 0;
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, A9.n, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.f1290a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0708a.f12487e);
        layoutParams.f1290a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup$LayoutParams, A9.n, android.widget.FrameLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup$LayoutParams, A9.n, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C0114n)) {
            ?? layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.f1290a = 0;
            return layoutParams2;
        }
        C0114n c0114n = (C0114n) layoutParams;
        ?? layoutParams3 = new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams) c0114n);
        layoutParams3.f1290a = 0;
        layoutParams3.f1290a = c0114n.f1290a;
        return layoutParams3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A9.n, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.f1290a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0708a.f12487e);
        layoutParams.f1290a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public int getCardType() {
        return this.f1313a;
    }

    @Deprecated
    public int getExtraVisibility() {
        return this.f1315c;
    }

    public final float getFinalInfoAlpha() {
        return (this.f1313a == 1 && this.f1314b == 2 && !isSelected()) ? 0.0f : 1.0f;
    }

    public final float getFinalInfoVisFraction() {
        return (this.f1313a == 2 && this.f1314b == 2 && !isSelected()) ? 0.0f : 1.0f;
    }

    public int getInfoVisibility() {
        return this.f1314b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        boolean z8 = false;
        boolean z10 = false;
        for (int i10 : super.onCreateDrawableState(i7)) {
            if (i10 == 16842919) {
                z8 = true;
            }
            if (i10 == 16842910) {
                z10 = true;
            }
        }
        return (z8 && z10) ? View.PRESSED_ENABLED_STATE_SET : z8 ? f1307F : z10 ? View.ENABLED_STATE_SET : View.EMPTY_STATE_SET;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1312E);
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        ArrayList arrayList;
        float paddingTop = getPaddingTop();
        int i13 = 0;
        while (true) {
            ArrayList arrayList2 = this.f1316d;
            if (i13 >= arrayList2.size()) {
                break;
            }
            View view = (View) arrayList2.get(i13);
            if (view.getVisibility() != 8) {
                view.layout(getPaddingLeft(), (int) paddingTop, getPaddingLeft() + this.f1319u, (int) (view.getMeasuredHeight() + paddingTop));
                paddingTop += view.getMeasuredHeight();
            }
            i13++;
        }
        if (this.f1313a != 0) {
            int i14 = 0;
            float f4 = 0.0f;
            while (true) {
                arrayList = this.f1317e;
                if (i14 >= arrayList.size()) {
                    break;
                }
                f4 += ((View) arrayList.get(i14)).getMeasuredHeight();
                i14++;
            }
            int i15 = this.f1313a;
            if (i15 == 1) {
                paddingTop -= f4;
                if (paddingTop < 0.0f) {
                    paddingTop = 0.0f;
                }
            } else if (i15 != 2) {
                paddingTop -= this.f1308A;
            } else if (this.f1314b == 2) {
                f4 *= this.f1309B;
            }
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                View view2 = (View) arrayList.get(i16);
                if (view2.getVisibility() != 8) {
                    int measuredHeight = view2.getMeasuredHeight();
                    if (measuredHeight > f4) {
                        measuredHeight = (int) f4;
                    }
                    float f10 = measuredHeight;
                    paddingTop += f10;
                    view2.layout(getPaddingLeft(), (int) paddingTop, getPaddingLeft() + this.f1319u, (int) paddingTop);
                    f4 -= f10;
                    if (f4 <= 0.0f) {
                        break;
                    }
                }
            }
            if (this.f1313a == 3) {
                int i17 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f1318f;
                    if (i17 >= arrayList3.size()) {
                        break;
                    }
                    View view3 = (View) arrayList3.get(i17);
                    if (view3.getVisibility() != 8) {
                        view3.layout(getPaddingLeft(), (int) paddingTop, getPaddingLeft() + this.f1319u, (int) (view3.getMeasuredHeight() + paddingTop));
                        paddingTop += view3.getMeasuredHeight();
                    }
                    i17++;
                }
            }
        }
        onSizeChanged(0, 0, i11 - i7, i12 - i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0036, code lost:
    
        if (r16.f1309B > 0.0f) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[EDGE_INSN: B:42:0x0096->B:43:0x0096 BREAK  A[LOOP:0: B:21:0x005d->B:32:0x0093], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        boolean z8;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        this.f1319u = 0;
        this.f1320v = 0;
        ArrayList arrayList = this.f1316d;
        arrayList.clear();
        ArrayList arrayList2 = this.f1317e;
        arrayList2.clear();
        ArrayList arrayList3 = this.f1318f;
        arrayList3.clear();
        int childCount = getChildCount();
        int i15 = this.f1313a;
        if (i15 != 0) {
            int i16 = this.f1314b;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 == 2) {
                        if (i15 != 2) {
                            z11 = isSelected();
                        }
                    }
                    z11 = false;
                } else {
                    z11 = isActivated();
                }
                if (z11) {
                    z8 = true;
                    boolean z12 = !(this.f1313a != 3) && this.f1308A > 0.0f;
                    i11 = 0;
                    while (true) {
                        if (i11 < childCount) {
                            break;
                        }
                        View childAt = getChildAt(i11);
                        if (childAt != null) {
                            int i17 = ((C0114n) childAt.getLayoutParams()).f1290a;
                            if (i17 == 1) {
                                childAt.setAlpha(this.f1310C);
                                arrayList2.add(childAt);
                                childAt.setVisibility(z8 ? 0 : 8);
                            } else if (i17 == 2) {
                                arrayList3.add(childAt);
                                childAt.setVisibility(z12 ? 0 : 8);
                            } else {
                                arrayList.add(childAt);
                                childAt.setVisibility(0);
                            }
                        }
                        i11++;
                    }
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i18 = 0;
                    int i19 = 0;
                    for (i12 = 0; i12 < arrayList.size(); i12++) {
                        View view = (View) arrayList.get(i12);
                        if (view.getVisibility() != 8) {
                            measureChild(view, makeMeasureSpec, makeMeasureSpec);
                            this.f1319u = Math.max(this.f1319u, view.getMeasuredWidth());
                            i18 += view.getMeasuredHeight();
                            i19 = View.combineMeasuredStates(i19, view.getMeasuredState());
                        }
                    }
                    setPivotX(this.f1319u / 2);
                    setPivotY(i18 / 2);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f1319u, 1073741824);
                    if (this.f1313a == 0) {
                        i13 = 0;
                        i14 = 0;
                    } else {
                        i14 = 0;
                        for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                            View view2 = (View) arrayList2.get(i20);
                            if (view2.getVisibility() != 8) {
                                measureChild(view2, makeMeasureSpec2, makeMeasureSpec);
                                if (this.f1313a != 1) {
                                    i14 += view2.getMeasuredHeight();
                                }
                                i19 = View.combineMeasuredStates(i19, view2.getMeasuredState());
                            }
                        }
                        if (this.f1313a == 3) {
                            i13 = 0;
                            for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                                View view3 = (View) arrayList3.get(i21);
                                if (view3.getVisibility() != 8) {
                                    measureChild(view3, makeMeasureSpec2, makeMeasureSpec);
                                    i13 += view3.getMeasuredHeight();
                                    i19 = View.combineMeasuredStates(i19, view3.getMeasuredState());
                                }
                            }
                        } else {
                            i13 = 0;
                        }
                    }
                    z10 = !(this.f1313a == 0) && this.f1314b == 2;
                    float f4 = i18;
                    float f10 = i14;
                    if (z10) {
                        f10 *= this.f1309B;
                    }
                    this.f1320v = (int) (((f4 + f10) + i13) - (z10 ? 0.0f : this.f1308A));
                    setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + this.f1319u, i7, i19), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + this.f1320v, i10, i19 << 16));
                }
            }
            z11 = true;
            if (z11) {
            }
        }
        z8 = false;
        if (this.f1313a != 3) {
        }
        i11 = 0;
        while (true) {
            if (i11 < childCount) {
            }
            i11++;
        }
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i182 = 0;
        int i192 = 0;
        while (i12 < arrayList.size()) {
        }
        setPivotX(this.f1319u / 2);
        setPivotY(i182 / 2);
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(this.f1319u, 1073741824);
        if (this.f1313a == 0) {
        }
        if (this.f1313a == 0) {
        }
        float f42 = i182;
        float f102 = i14;
        if (z10) {
        }
        this.f1320v = (int) (((f42 + f102) + i13) - (z10 ? 0.0f : this.f1308A));
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + this.f1319u, i7, i192), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + this.f1320v, i10, i192 << 16));
    }

    @Override // android.view.View
    public void setActivated(boolean z8) {
        if (z8 != isActivated()) {
            super.setActivated(z8);
            if (this.f1313a != 0) {
                int i7 = this.f1314b;
                if (i7 == 1) {
                    setInfoViewVisibility(i7 != 0 ? i7 != 1 ? i7 != 2 ? false : isSelected() : isActivated() : true);
                }
            }
        }
    }

    public void setCardType(int i7) {
        if (this.f1313a != i7) {
            if (i7 < 0 || i7 >= 4) {
                Log.e("BaseCardView", "Invalid card type specified: " + i7 + ". Defaulting to type CARD_TYPE_MAIN_ONLY.");
                this.f1313a = 0;
            } else {
                this.f1313a = i7;
            }
            requestLayout();
        }
    }

    @Deprecated
    public void setExtraVisibility(int i7) {
        if (this.f1315c != i7) {
            this.f1315c = i7;
        }
    }

    public void setInfoVisibility(int i7) {
        if (this.f1314b == i7) {
            return;
        }
        b();
        this.f1314b = i7;
        this.f1309B = getFinalInfoVisFraction();
        requestLayout();
        float finalInfoAlpha = getFinalInfoAlpha();
        if (finalInfoAlpha == this.f1310C) {
            return;
        }
        this.f1310C = finalInfoAlpha;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1317e;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).setAlpha(this.f1310C);
            i10++;
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        if (z8 != isSelected()) {
            super.setSelected(z8);
            boolean isSelected = isSelected();
            RunnableC0102k runnableC0102k = this.f1312E;
            removeCallbacks(runnableC0102k);
            if (this.f1313a != 3) {
                if (this.f1314b == 2) {
                    setInfoViewVisibility(isSelected);
                }
            } else if (!isSelected) {
                a(false);
            } else if (this.f1321w) {
                postDelayed(runnableC0102k, this.f1322x);
            } else {
                post(runnableC0102k);
                this.f1321w = true;
            }
        }
    }

    public void setSelectedAnimationDelayed(boolean z8) {
        this.f1321w = z8;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
