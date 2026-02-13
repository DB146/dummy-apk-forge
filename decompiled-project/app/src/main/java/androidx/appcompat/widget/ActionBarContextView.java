package androidx.appcompat.widget;

import E.C0246a;
import Q5.e;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.k;
import com.kt.apps.media.xemtv.beta.R;
import h.AbstractC1213a;
import m.AbstractC1519a;
import n.InterfaceC1692z;
import n.MenuC1678l;
import o.C1732f;
import o.C1740j;
import o.c1;
import y1.K;
import y1.S;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public View f12923A;

    /* renamed from: B, reason: collision with root package name */
    public LinearLayout f12924B;

    /* renamed from: C, reason: collision with root package name */
    public TextView f12925C;

    /* renamed from: D, reason: collision with root package name */
    public TextView f12926D;

    /* renamed from: E, reason: collision with root package name */
    public final int f12927E;

    /* renamed from: F, reason: collision with root package name */
    public final int f12928F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f12929G;

    /* renamed from: H, reason: collision with root package name */
    public final int f12930H;

    /* renamed from: a, reason: collision with root package name */
    public final C0246a f12931a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12932b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f12933c;

    /* renamed from: d, reason: collision with root package name */
    public C1740j f12934d;

    /* renamed from: e, reason: collision with root package name */
    public int f12935e;

    /* renamed from: f, reason: collision with root package name */
    public S f12936f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12937u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12938v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f12939w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f12940x;

    /* renamed from: y, reason: collision with root package name */
    public View f12941y;

    /* renamed from: z, reason: collision with root package name */
    public View f12942z;

    /* JADX WARN: Type inference failed for: r1v0, types: [E.a, java.lang.Object] */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        ?? obj = new Object();
        obj.f3391c = this;
        obj.f3389a = false;
        this.f12931a = obj;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f12932b = context;
        } else {
            this.f12932b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1213a.f17569d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : e.x(context, resourceId));
        this.f12927E = obtainStyledAttributes.getResourceId(5, 0);
        this.f12928F = obtainStyledAttributes.getResourceId(4, 0);
        this.f12935e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f12930H = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i10);
        return Math.max(0, i7 - view.getMeasuredWidth());
    }

    public static int g(int i7, int i10, int i11, View view, boolean z8) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z8) {
            view.layout(i7 - measuredWidth, i12, i7, measuredHeight + i12);
        } else {
            view.layout(i7, i12, i7 + measuredWidth, measuredHeight + i12);
        }
        return z8 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC1519a abstractC1519a) {
        View view = this.f12941y;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f12930H, (ViewGroup) this, false);
            this.f12941y = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f12941y);
        }
        View findViewById = this.f12941y.findViewById(R.id.action_mode_close_button);
        this.f12942z = findViewById;
        findViewById.setOnClickListener(new k(abstractC1519a, 4));
        MenuC1678l c10 = abstractC1519a.c();
        C1740j c1740j = this.f12934d;
        if (c1740j != null) {
            c1740j.c();
            C1732f c1732f = c1740j.f21511H;
            if (c1732f != null && c1732f.b()) {
                c1732f.f21016i.dismiss();
            }
        }
        C1740j c1740j2 = new C1740j(getContext());
        this.f12934d = c1740j2;
        c1740j2.f21526z = true;
        c1740j2.f21504A = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c10.b(this.f12934d, this.f12932b);
        C1740j c1740j3 = this.f12934d;
        InterfaceC1692z interfaceC1692z = c1740j3.f21522v;
        if (interfaceC1692z == null) {
            InterfaceC1692z interfaceC1692z2 = (InterfaceC1692z) c1740j3.f21518d.inflate(c1740j3.f21520f, (ViewGroup) this, false);
            c1740j3.f21522v = interfaceC1692z2;
            interfaceC1692z2.b(c1740j3.f21517c);
            c1740j3.d();
        }
        InterfaceC1692z interfaceC1692z3 = c1740j3.f21522v;
        if (interfaceC1692z != interfaceC1692z3) {
            ((ActionMenuView) interfaceC1692z3).setPresenter(c1740j3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC1692z3;
        this.f12933c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f12933c, layoutParams);
    }

    public final void d() {
        if (this.f12924B == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f12924B = linearLayout;
            this.f12925C = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f12926D = (TextView) this.f12924B.findViewById(R.id.action_bar_subtitle);
            int i7 = this.f12927E;
            if (i7 != 0) {
                this.f12925C.setTextAppearance(getContext(), i7);
            }
            int i10 = this.f12928F;
            if (i10 != 0) {
                this.f12926D.setTextAppearance(getContext(), i10);
            }
        }
        this.f12925C.setText(this.f12939w);
        this.f12926D.setText(this.f12940x);
        boolean isEmpty = TextUtils.isEmpty(this.f12939w);
        boolean isEmpty2 = TextUtils.isEmpty(this.f12940x);
        this.f12926D.setVisibility(!isEmpty2 ? 0 : 8);
        this.f12924B.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f12924B.getParent() == null) {
            addView(this.f12924B);
        }
    }

    public final void e() {
        removeAllViews();
        this.f12923A = null;
        this.f12933c = null;
        this.f12934d = null;
        View view = this.f12942z;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f12936f != null ? this.f12931a.f3390b : getVisibility();
    }

    public int getContentHeight() {
        return this.f12935e;
    }

    public CharSequence getSubtitle() {
        return this.f12940x;
    }

    public CharSequence getTitle() {
        return this.f12939w;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            S s3 = this.f12936f;
            if (s3 != null) {
                s3.b();
            }
            super.setVisibility(i7);
        }
    }

    public final S i(int i7, long j) {
        S s3 = this.f12936f;
        if (s3 != null) {
            s3.b();
        }
        C0246a c0246a = this.f12931a;
        if (i7 != 0) {
            S a9 = K.a(this);
            a9.a(0.0f);
            a9.c(j);
            ((ActionBarContextView) c0246a.f3391c).f12936f = a9;
            c0246a.f3390b = i7;
            a9.d(c0246a);
            return a9;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        S a10 = K.a(this);
        a10.a(1.0f);
        a10.c(j);
        ((ActionBarContextView) c0246a.f3391c).f12936f = a10;
        c0246a.f3390b = i7;
        a10.d(c0246a);
        return a10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1213a.f17566a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C1740j c1740j = this.f12934d;
        if (c1740j != null) {
            Configuration configuration2 = c1740j.f21516b.getResources().getConfiguration();
            int i7 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            c1740j.f21507D = (configuration2.smallestScreenWidthDp > 600 || i7 > 600 || (i7 > 960 && i10 > 720) || (i7 > 720 && i10 > 960)) ? 5 : (i7 >= 500 || (i7 > 640 && i10 > 480) || (i7 > 480 && i10 > 640)) ? 4 : i7 >= 360 ? 3 : 2;
            MenuC1678l menuC1678l = c1740j.f21517c;
            if (menuC1678l != null) {
                menuC1678l.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1740j c1740j = this.f12934d;
        if (c1740j != null) {
            c1740j.c();
            C1732f c1732f = this.f12934d.f21511H;
            if (c1732f == null || !c1732f.b()) {
                return;
            }
            c1732f.f21016i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f12938v = false;
        }
        if (!this.f12938v) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f12938v = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f12938v = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        boolean z10 = c1.f21486a;
        boolean z11 = getLayoutDirection() == 1;
        int paddingRight = z11 ? (i11 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f12941y;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12941y.getLayoutParams();
            int i13 = z11 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = z11 ? paddingRight - i13 : paddingRight + i13;
            int g = g(i15, paddingTop, paddingTop2, this.f12941y, z11) + i15;
            paddingRight = z11 ? g - i14 : g + i14;
        }
        LinearLayout linearLayout = this.f12924B;
        if (linearLayout != null && this.f12923A == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.f12924B, z11);
        }
        View view2 = this.f12923A;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z11);
        }
        int paddingLeft = z11 ? getPaddingLeft() : (i11 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f12933c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i7);
        int i11 = this.f12935e;
        if (i11 <= 0) {
            i11 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i12 = i11 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        View view = this.f12941y;
        if (view != null) {
            int f4 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12941y.getLayoutParams();
            paddingLeft = f4 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f12933c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f12933c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f12924B;
        if (linearLayout != null && this.f12923A == null) {
            if (this.f12929G) {
                this.f12924B.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f12924B.getMeasuredWidth();
                boolean z8 = measuredWidth <= paddingLeft;
                if (z8) {
                    paddingLeft -= measuredWidth;
                }
                this.f12924B.setVisibility(z8 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f12923A;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = i13 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i13 >= 0) {
                paddingLeft = Math.min(i13, paddingLeft);
            }
            int i15 = layoutParams.height;
            int i16 = i15 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i15 >= 0) {
                i12 = Math.min(i15, i12);
            }
            this.f12923A.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i14), View.MeasureSpec.makeMeasureSpec(i12, i16));
        }
        if (this.f12935e > 0) {
            setMeasuredDimension(size, i11);
            return;
        }
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i17) {
                i17 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12937u = false;
        }
        if (!this.f12937u) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f12937u = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f12937u = false;
        }
        return true;
    }

    public void setContentHeight(int i7) {
        this.f12935e = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f12923A;
        if (view2 != null) {
            removeView(view2);
        }
        this.f12923A = view;
        if (view != null && (linearLayout = this.f12924B) != null) {
            removeView(linearLayout);
            this.f12924B = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f12940x = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f12939w = charSequence;
        d();
        K.o(this, charSequence);
    }

    public void setTitleOptional(boolean z8) {
        if (z8 != this.f12929G) {
            requestLayout();
        }
        this.f12929G = z8;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
