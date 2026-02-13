package androidx.appcompat.widget;

import Q5.e;
import R7.b;
import W1.L;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.datepicker.k;
import com.kt.apps.media.xemtv.beta.R;
import e3.RunnableC1077b;
import h.AbstractC1213a;
import ia.C1358d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l2.X;
import m.C1526h;
import n.C1680n;
import n.MenuC1678l;
import o.C1740j;
import o.H0;
import o.InterfaceC1731e0;
import o.N0;
import o.O0;
import o.P0;
import o.Q0;
import o.R0;
import o.S0;
import o.T0;
import o.U0;
import o.c1;
import y1.K;
import y7.u0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f13057A;

    /* renamed from: B, reason: collision with root package name */
    public final int f13058B;

    /* renamed from: C, reason: collision with root package name */
    public final int f13059C;

    /* renamed from: D, reason: collision with root package name */
    public int f13060D;

    /* renamed from: E, reason: collision with root package name */
    public int f13061E;

    /* renamed from: F, reason: collision with root package name */
    public int f13062F;

    /* renamed from: G, reason: collision with root package name */
    public int f13063G;

    /* renamed from: H, reason: collision with root package name */
    public H0 f13064H;

    /* renamed from: I, reason: collision with root package name */
    public int f13065I;

    /* renamed from: J, reason: collision with root package name */
    public int f13066J;

    /* renamed from: K, reason: collision with root package name */
    public final int f13067K;
    public CharSequence L;

    /* renamed from: M, reason: collision with root package name */
    public CharSequence f13068M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f13069N;

    /* renamed from: O, reason: collision with root package name */
    public ColorStateList f13070O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f13071P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f13072Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f13073R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f13074S;

    /* renamed from: T, reason: collision with root package name */
    public final int[] f13075T;

    /* renamed from: U, reason: collision with root package name */
    public final X f13076U;

    /* renamed from: V, reason: collision with root package name */
    public ArrayList f13077V;

    /* renamed from: W, reason: collision with root package name */
    public final b f13078W;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f13079a;

    /* renamed from: a0, reason: collision with root package name */
    public U0 f13080a0;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f13081b;

    /* renamed from: b0, reason: collision with root package name */
    public C1740j f13082b0;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f13083c;

    /* renamed from: c0, reason: collision with root package name */
    public P0 f13084c0;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatImageButton f13085d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f13086d0;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f13087e;

    /* renamed from: e0, reason: collision with root package name */
    public OnBackInvokedCallback f13088e0;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f13089f;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f13090f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f13091g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RunnableC1077b f13092h0;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f13093u;

    /* renamed from: v, reason: collision with root package name */
    public AppCompatImageButton f13094v;

    /* renamed from: w, reason: collision with root package name */
    public View f13095w;

    /* renamed from: x, reason: collision with root package name */
    public Context f13096x;

    /* renamed from: y, reason: collision with root package name */
    public int f13097y;

    /* renamed from: z, reason: collision with root package name */
    public int f13098z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f13067K = 8388627;
        this.f13073R = new ArrayList();
        this.f13074S = new ArrayList();
        this.f13075T = new int[2];
        this.f13076U = new X(new N0(this, 1));
        this.f13077V = new ArrayList();
        this.f13078W = new b(this, 27);
        this.f13092h0 = new RunnableC1077b(this, 10);
        Context context2 = getContext();
        int[] iArr = AbstractC1213a.f17586x;
        X u3 = X.u(context2, attributeSet, iArr, R.attr.toolbarStyle);
        K.m(this, context, iArr, attributeSet, (TypedArray) u3.f19195c, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) u3.f19195c;
        this.f13098z = typedArray.getResourceId(28, 0);
        this.f13057A = typedArray.getResourceId(19, 0);
        this.f13067K = typedArray.getInteger(0, 8388627);
        this.f13058B = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f13063G = dimensionPixelOffset;
        this.f13062F = dimensionPixelOffset;
        this.f13061E = dimensionPixelOffset;
        this.f13060D = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f13060D = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f13061E = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f13062F = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f13063G = dimensionPixelOffset5;
        }
        this.f13059C = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        H0 h02 = this.f13064H;
        h02.f21389h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            h02.f21387e = dimensionPixelSize;
            h02.f21383a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            h02.f21388f = dimensionPixelSize2;
            h02.f21384b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            h02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f13065I = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f13066J = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f13089f = u3.n(4);
        this.f13093u = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f13096x = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable n6 = u3.n(16);
        if (n6 != null) {
            setNavigationIcon(n6);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable n8 = u3.n(11);
        if (n8 != null) {
            setLogo(n8);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(u3.m(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(u3.m(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        u3.w();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1526h(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, o.Q0] */
    public static Q0 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f21420b = 0;
        marginLayoutParams.f21419a = 8388627;
        return marginLayoutParams;
    }

    public static Q0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z8 = layoutParams instanceof Q0;
        if (z8) {
            Q0 q02 = (Q0) layoutParams;
            Q0 q03 = new Q0(q02);
            q03.f21420b = 0;
            q03.f21420b = q02.f21420b;
            return q03;
        }
        if (z8) {
            Q0 q04 = new Q0((Q0) layoutParams);
            q04.f21420b = 0;
            return q04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Q0 q05 = new Q0(layoutParams);
            q05.f21420b = 0;
            return q05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Q0 q06 = new Q0(marginLayoutParams);
        q06.f21420b = 0;
        ((ViewGroup.MarginLayoutParams) q06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) q06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) q06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) q06).bottomMargin = marginLayoutParams.bottomMargin;
        return q06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i7, ArrayList arrayList) {
        boolean z8 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection());
        arrayList.clear();
        if (!z8) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                Q0 q02 = (Q0) childAt.getLayoutParams();
                if (q02.f21420b == 0 && t(childAt)) {
                    int i11 = q02.f21419a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            Q0 q03 = (Q0) childAt2.getLayoutParams();
            if (q03.f21420b == 0 && t(childAt2)) {
                int i13 = q03.f21419a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Q0 h10 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (Q0) layoutParams;
        h10.f21420b = 1;
        if (!z8 || this.f13095w == null) {
            addView(view, h10);
        } else {
            view.setLayoutParams(h10);
            this.f13074S.add(view);
        }
    }

    public final void c() {
        if (this.f13094v == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f13094v = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f13089f);
            this.f13094v.setContentDescription(this.f13093u);
            Q0 h10 = h();
            h10.f21419a = (this.f13058B & 112) | 8388611;
            h10.f21420b = 2;
            this.f13094v.setLayoutParams(h10);
            this.f13094v.setOnClickListener(new k(this, 5));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof Q0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.H0, java.lang.Object] */
    public final void d() {
        if (this.f13064H == null) {
            ?? obj = new Object();
            obj.f21383a = 0;
            obj.f21384b = 0;
            obj.f21385c = Integer.MIN_VALUE;
            obj.f21386d = Integer.MIN_VALUE;
            obj.f21387e = 0;
            obj.f21388f = 0;
            obj.g = false;
            obj.f21389h = false;
            this.f13064H = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f13079a;
        if (actionMenuView.f12973D == null) {
            MenuC1678l menuC1678l = (MenuC1678l) actionMenuView.getMenu();
            if (this.f13084c0 == null) {
                this.f13084c0 = new P0(this);
            }
            this.f13079a.setExpandedActionViewsExclusive(true);
            menuC1678l.b(this.f13084c0, this.f13096x);
            u();
        }
    }

    public final void f() {
        if (this.f13079a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f13079a = actionMenuView;
            actionMenuView.setPopupTheme(this.f13097y);
            this.f13079a.setOnMenuItemClickListener(this.f13078W);
            ActionMenuView actionMenuView2 = this.f13079a;
            C1358d c1358d = new C1358d(this, 7);
            actionMenuView2.getClass();
            actionMenuView2.f12978I = c1358d;
            Q0 h10 = h();
            h10.f21419a = (this.f13058B & 112) | 8388613;
            this.f13079a.setLayoutParams(h10);
            b(this.f13079a, false);
        }
    }

    public final void g() {
        if (this.f13085d == null) {
            this.f13085d = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            Q0 h10 = h();
            h10.f21419a = (this.f13058B & 112) | 8388611;
            this.f13085d.setLayoutParams(h10);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o.Q0] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f21419a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1213a.f17567b);
        marginLayoutParams.f21419a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f21420b = 0;
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f13094v;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.f13094v;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        H0 h02 = this.f13064H;
        if (h02 != null) {
            return h02.g ? h02.f21383a : h02.f21384b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f13066J;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        H0 h02 = this.f13064H;
        if (h02 != null) {
            return h02.f21383a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        H0 h02 = this.f13064H;
        if (h02 != null) {
            return h02.f21384b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        H0 h02 = this.f13064H;
        if (h02 != null) {
            return h02.g ? h02.f21384b : h02.f21383a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f13065I;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1678l menuC1678l;
        ActionMenuView actionMenuView = this.f13079a;
        return (actionMenuView == null || (menuC1678l = actionMenuView.f12973D) == null || !menuC1678l.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f13066J, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f13065I, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f13087e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f13087e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f13079a.getMenu();
    }

    public View getNavButtonView() {
        return this.f13085d;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.f13085d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.f13085d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public C1740j getOuterActionMenuPresenter() {
        return this.f13082b0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f13079a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f13096x;
    }

    public int getPopupTheme() {
        return this.f13097y;
    }

    public CharSequence getSubtitle() {
        return this.f13068M;
    }

    public final TextView getSubtitleTextView() {
        return this.f13083c;
    }

    public CharSequence getTitle() {
        return this.L;
    }

    public int getTitleMarginBottom() {
        return this.f13063G;
    }

    public int getTitleMarginEnd() {
        return this.f13061E;
    }

    public int getTitleMarginStart() {
        return this.f13060D;
    }

    public int getTitleMarginTop() {
        return this.f13062F;
    }

    public final TextView getTitleTextView() {
        return this.f13081b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.U0, java.lang.Object] */
    public InterfaceC1731e0 getWrapper() {
        Drawable drawable;
        if (this.f13080a0 == null) {
            ?? obj = new Object();
            obj.f21446n = 0;
            obj.f21436a = this;
            obj.f21442h = getTitle();
            obj.f21443i = getSubtitle();
            obj.g = obj.f21442h != null;
            obj.f21441f = getNavigationIcon();
            X u3 = X.u(getContext(), null, AbstractC1213a.f17566a, R.attr.actionBarStyle);
            obj.f21447o = u3.n(15);
            TypedArray typedArray = (TypedArray) u3.f19195c;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.g = true;
                obj.f21442h = text;
                if ((obj.f21437b & 8) != 0) {
                    Toolbar toolbar = obj.f21436a;
                    toolbar.setTitle(text);
                    if (obj.g) {
                        K.o(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f21443i = text2;
                if ((obj.f21437b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable n6 = u3.n(20);
            if (n6 != null) {
                obj.f21440e = n6;
                obj.c();
            }
            Drawable n8 = u3.n(17);
            if (n8 != null) {
                obj.f21439d = n8;
                obj.c();
            }
            if (obj.f21441f == null && (drawable = obj.f21447o) != null) {
                obj.f21441f = drawable;
                int i7 = obj.f21437b & 4;
                Toolbar toolbar2 = obj.f21436a;
                if (i7 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f21438c;
                if (view != null && (obj.f21437b & 16) != 0) {
                    removeView(view);
                }
                obj.f21438c = inflate;
                if (inflate != null && (obj.f21437b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f21437b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f13064H.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f13098z = resourceId2;
                AppCompatTextView appCompatTextView = this.f13081b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f13057A = resourceId3;
                AppCompatTextView appCompatTextView2 = this.f13083c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            u3.w();
            if (R.string.abc_action_bar_up_description != obj.f21446n) {
                obj.f21446n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = obj.f21446n;
                    obj.j = i10 != 0 ? getContext().getString(i10) : null;
                    obj.b();
                }
            }
            obj.j = getNavigationContentDescription();
            setNavigationOnClickListener(new T0(obj));
            this.f13080a0 = obj;
        }
        return this.f13080a0;
    }

    public final int j(View view, int i7) {
        Q0 q02 = (Q0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int i11 = q02.f21419a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.f13067K & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) q02).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) q02).topMargin;
        if (i12 < i13) {
            i12 = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) q02).bottomMargin;
            if (i14 < i15) {
                i12 = Math.max(0, i12 - (i15 - i14));
            }
        }
        return paddingTop + i12;
    }

    public void m(int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    public final void n() {
        Iterator it = this.f13077V.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f13076U.f19195c).iterator();
        while (it2.hasNext()) {
            ((L) it2.next()).f10329a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f13077V = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f13074S.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f13092h0);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f13072Q = false;
        }
        if (!this.f13072Q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f13072Q = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f13072Q = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298 A[LOOP:0: B:40:0x0296->B:41:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b5 A[LOOP:1: B:44:0x02b3->B:45:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d3 A[LOOP:2: B:48:0x02d1->B:49:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0321 A[LOOP:3: B:57:0x031f->B:58:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        boolean t5;
        boolean t10;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19;
        int i20;
        int i21;
        int paddingTop;
        int i22;
        int i23;
        int i24;
        int i25;
        int size;
        int i26;
        int i27;
        int size2;
        int i28;
        int size3;
        int i29;
        int i30;
        int i31;
        int size4;
        boolean z11 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i32 = width - paddingRight;
        int[] iArr = this.f13075T;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = K.f26642a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i12 - i10) : 0;
        if (!t(this.f13085d)) {
            i13 = paddingLeft;
        } else {
            if (z11) {
                i14 = q(this.f13085d, i32, min, iArr);
                i13 = paddingLeft;
                if (t(this.f13094v)) {
                    if (z11) {
                        i14 = q(this.f13094v, i14, min, iArr);
                    } else {
                        i13 = p(this.f13094v, i13, min, iArr);
                    }
                }
                if (t(this.f13079a)) {
                    if (z11) {
                        i13 = p(this.f13079a, i13, min, iArr);
                    } else {
                        i14 = q(this.f13079a, i14, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i13);
                iArr[1] = Math.max(0, currentContentInsetRight - (i32 - i14));
                int max = Math.max(i13, currentContentInsetLeft);
                int min2 = Math.min(i14, i32 - currentContentInsetRight);
                if (t(this.f13095w)) {
                    if (z11) {
                        min2 = q(this.f13095w, min2, min, iArr);
                    } else {
                        max = p(this.f13095w, max, min, iArr);
                    }
                }
                if (t(this.f13087e)) {
                    if (z11) {
                        min2 = q(this.f13087e, min2, min, iArr);
                    } else {
                        max = p(this.f13087e, max, min, iArr);
                    }
                }
                t5 = t(this.f13081b);
                t10 = t(this.f13083c);
                if (t5) {
                    i15 = paddingRight;
                    i16 = 0;
                } else {
                    Q0 q02 = (Q0) this.f13081b.getLayoutParams();
                    i15 = paddingRight;
                    i16 = ((ViewGroup.MarginLayoutParams) q02).bottomMargin + this.f13081b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) q02).topMargin;
                }
                if (t10) {
                    i17 = width;
                } else {
                    Q0 q03 = (Q0) this.f13083c.getLayoutParams();
                    i17 = width;
                    i16 += this.f13083c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) q03).topMargin + ((ViewGroup.MarginLayoutParams) q03).bottomMargin;
                }
                if (!t5 || t10) {
                    AppCompatTextView appCompatTextView = !t5 ? this.f13081b : this.f13083c;
                    AppCompatTextView appCompatTextView2 = !t10 ? this.f13083c : this.f13081b;
                    Q0 q04 = (Q0) appCompatTextView.getLayoutParams();
                    Q0 q05 = (Q0) appCompatTextView2.getLayoutParams();
                    if ((t5 || this.f13081b.getMeasuredWidth() <= 0) && (!t10 || this.f13083c.getMeasuredWidth() <= 0)) {
                        i18 = paddingLeft;
                        z10 = false;
                    } else {
                        i18 = paddingLeft;
                        z10 = true;
                    }
                    i19 = this.f13067K & 112;
                    i20 = min;
                    if (i19 != 48) {
                        i21 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) q04).topMargin + this.f13062F;
                    } else if (i19 != 80) {
                        int i33 = (((height - paddingTop2) - paddingBottom) - i16) / 2;
                        i21 = max;
                        int i34 = ((ViewGroup.MarginLayoutParams) q04).topMargin + this.f13062F;
                        if (i33 < i34) {
                            i33 = i34;
                        } else {
                            int i35 = (((height - paddingBottom) - i16) - i33) - paddingTop2;
                            int i36 = ((ViewGroup.MarginLayoutParams) q04).bottomMargin;
                            int i37 = this.f13063G;
                            if (i35 < i36 + i37) {
                                i33 = Math.max(0, i33 - ((((ViewGroup.MarginLayoutParams) q05).bottomMargin + i37) - i35));
                            }
                        }
                        paddingTop = paddingTop2 + i33;
                    } else {
                        i21 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) q05).bottomMargin) - this.f13063G) - i16;
                    }
                    if (z11) {
                        int i38 = (z10 ? this.f13060D : 0) - iArr[0];
                        max = Math.max(0, i38) + i21;
                        iArr[0] = Math.max(0, -i38);
                        if (t5) {
                            Q0 q06 = (Q0) this.f13081b.getLayoutParams();
                            int measuredWidth = this.f13081b.getMeasuredWidth() + max;
                            int measuredHeight = this.f13081b.getMeasuredHeight() + paddingTop;
                            this.f13081b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i22 = measuredWidth + this.f13061E;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) q06).bottomMargin;
                        } else {
                            i22 = max;
                        }
                        if (t10) {
                            int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Q0) this.f13083c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f13083c.getMeasuredWidth() + max;
                            this.f13083c.layout(max, i39, measuredWidth2, this.f13083c.getMeasuredHeight() + i39);
                            i23 = measuredWidth2 + this.f13061E;
                        } else {
                            i23 = max;
                        }
                        if (z10) {
                            max = Math.max(i22, i23);
                        }
                    } else {
                        int i40 = (z10 ? this.f13060D : 0) - iArr[1];
                        min2 -= Math.max(0, i40);
                        iArr[1] = Math.max(0, -i40);
                        if (t5) {
                            Q0 q07 = (Q0) this.f13081b.getLayoutParams();
                            int measuredWidth3 = min2 - this.f13081b.getMeasuredWidth();
                            int measuredHeight2 = this.f13081b.getMeasuredHeight() + paddingTop;
                            this.f13081b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i24 = measuredWidth3 - this.f13061E;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) q07).bottomMargin;
                        } else {
                            i24 = min2;
                        }
                        if (t10) {
                            int i41 = paddingTop + ((ViewGroup.MarginLayoutParams) ((Q0) this.f13083c.getLayoutParams())).topMargin;
                            this.f13083c.layout(min2 - this.f13083c.getMeasuredWidth(), i41, min2, this.f13083c.getMeasuredHeight() + i41);
                            i25 = min2 - this.f13061E;
                        } else {
                            i25 = min2;
                        }
                        if (z10) {
                            min2 = Math.min(i24, i25);
                        }
                        max = i21;
                    }
                } else {
                    i18 = paddingLeft;
                    i20 = min;
                }
                ArrayList arrayList = this.f13073R;
                a(3, arrayList);
                size = arrayList.size();
                i26 = max;
                for (i27 = 0; i27 < size; i27++) {
                    i26 = p((View) arrayList.get(i27), i26, i20, iArr);
                }
                int i42 = i20;
                a(5, arrayList);
                size2 = arrayList.size();
                for (i28 = 0; i28 < size2; i28++) {
                    min2 = q((View) arrayList.get(i28), min2, i42, iArr);
                }
                a(1, arrayList);
                int i43 = iArr[0];
                int i44 = iArr[1];
                size3 = arrayList.size();
                int i45 = i44;
                int i46 = i43;
                i29 = 0;
                int i47 = 0;
                while (i29 < size3) {
                    View view = (View) arrayList.get(i29);
                    Q0 q08 = (Q0) view.getLayoutParams();
                    int i48 = ((ViewGroup.MarginLayoutParams) q08).leftMargin - i46;
                    int i49 = ((ViewGroup.MarginLayoutParams) q08).rightMargin - i45;
                    int max2 = Math.max(0, i48);
                    int max3 = Math.max(0, i49);
                    int max4 = Math.max(0, -i48);
                    int max5 = Math.max(0, -i49);
                    i47 += view.getMeasuredWidth() + max2 + max3;
                    i29++;
                    i45 = max5;
                    i46 = max4;
                }
                i31 = ((((i17 - i18) - i15) / 2) + i18) - (i47 / 2);
                int i50 = i47 + i31;
                if (i31 >= i26) {
                    i26 = i50 > min2 ? i31 - (i50 - min2) : i31;
                }
                size4 = arrayList.size();
                for (i30 = 0; i30 < size4; i30++) {
                    i26 = p((View) arrayList.get(i30), i26, i42, iArr);
                }
                arrayList.clear();
            }
            i13 = p(this.f13085d, paddingLeft, min, iArr);
        }
        i14 = i32;
        if (t(this.f13094v)) {
        }
        if (t(this.f13079a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i13);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i32 - i14));
        int max6 = Math.max(i13, currentContentInsetLeft2);
        int min22 = Math.min(i14, i32 - currentContentInsetRight2);
        if (t(this.f13095w)) {
        }
        if (t(this.f13087e)) {
        }
        t5 = t(this.f13081b);
        t10 = t(this.f13083c);
        if (t5) {
        }
        if (t10) {
        }
        if (t5) {
        }
        if (!t5) {
        }
        if (!t10) {
        }
        Q0 q042 = (Q0) appCompatTextView.getLayoutParams();
        Q0 q052 = (Q0) appCompatTextView2.getLayoutParams();
        if (t5) {
        }
        i18 = paddingLeft;
        z10 = false;
        i19 = this.f13067K & 112;
        i20 = min;
        if (i19 != 48) {
        }
        if (z11) {
        }
        ArrayList arrayList2 = this.f13073R;
        a(3, arrayList2);
        size = arrayList2.size();
        i26 = max6;
        while (i27 < size) {
        }
        int i422 = i20;
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i28 < size2) {
        }
        a(1, arrayList2);
        int i432 = iArr[0];
        int i442 = iArr[1];
        size3 = arrayList2.size();
        int i452 = i442;
        int i462 = i432;
        i29 = 0;
        int i472 = 0;
        while (i29 < size3) {
        }
        i31 = ((((i17 - i18) - i15) / 2) + i18) - (i472 / 2);
        int i502 = i472 + i31;
        if (i31 >= i26) {
        }
        size4 = arrayList2.size();
        while (i30 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        char c10;
        char c11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z8 = c1.f21486a;
        int i18 = 0;
        if (getLayoutDirection() == 1) {
            c11 = 1;
            c10 = 0;
        } else {
            c10 = 1;
            c11 = 0;
        }
        if (t(this.f13085d)) {
            s(this.f13085d, i7, 0, i10, this.f13059C);
            i11 = k(this.f13085d) + this.f13085d.getMeasuredWidth();
            i12 = Math.max(0, l(this.f13085d) + this.f13085d.getMeasuredHeight());
            i13 = View.combineMeasuredStates(0, this.f13085d.getMeasuredState());
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (t(this.f13094v)) {
            s(this.f13094v, i7, 0, i10, this.f13059C);
            i11 = k(this.f13094v) + this.f13094v.getMeasuredWidth();
            i12 = Math.max(i12, l(this.f13094v) + this.f13094v.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f13094v.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        int[] iArr = this.f13075T;
        iArr[c11] = max2;
        if (t(this.f13079a)) {
            s(this.f13079a, i7, max, i10, this.f13059C);
            i14 = k(this.f13079a) + this.f13079a.getMeasuredWidth();
            i12 = Math.max(i12, l(this.f13079a) + this.f13079a.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f13079a.getMeasuredState());
        } else {
            i14 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i14);
        iArr[c10] = Math.max(0, currentContentInsetEnd - i14);
        if (t(this.f13095w)) {
            max3 += r(this.f13095w, i7, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.f13095w) + this.f13095w.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f13095w.getMeasuredState());
        }
        if (t(this.f13087e)) {
            max3 += r(this.f13087e, i7, max3, i10, 0, iArr);
            i12 = Math.max(i12, l(this.f13087e) + this.f13087e.getMeasuredHeight());
            i13 = View.combineMeasuredStates(i13, this.f13087e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (((Q0) childAt.getLayoutParams()).f21420b == 0 && t(childAt)) {
                max3 += r(childAt, i7, max3, i10, 0, iArr);
                i12 = Math.max(i12, l(childAt) + childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
            }
        }
        int i20 = this.f13062F + this.f13063G;
        int i21 = this.f13060D + this.f13061E;
        if (t(this.f13081b)) {
            r(this.f13081b, i7, max3 + i21, i10, i20, iArr);
            int k = k(this.f13081b) + this.f13081b.getMeasuredWidth();
            i15 = l(this.f13081b) + this.f13081b.getMeasuredHeight();
            i16 = View.combineMeasuredStates(i13, this.f13081b.getMeasuredState());
            i17 = k;
        } else {
            i15 = 0;
            i16 = i13;
            i17 = 0;
        }
        if (t(this.f13083c)) {
            i17 = Math.max(i17, r(this.f13083c, i7, max3 + i21, i10, i15 + i20, iArr));
            i15 = l(this.f13083c) + this.f13083c.getMeasuredHeight() + i15;
            i16 = View.combineMeasuredStates(i16, this.f13083c.getMeasuredState());
        }
        int max4 = Math.max(i12, i15);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i17, getSuggestedMinimumWidth()), i7, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, i16 << 16);
        if (this.f13086d0) {
            int childCount2 = getChildCount();
            for (int i22 = 0; i22 < childCount2; i22++) {
                View childAt2 = getChildAt(i22);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i18);
        }
        i18 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i18);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof S0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        S0 s02 = (S0) parcelable;
        super.onRestoreInstanceState(s02.f4568a);
        ActionMenuView actionMenuView = this.f13079a;
        MenuC1678l menuC1678l = actionMenuView != null ? actionMenuView.f12973D : null;
        int i7 = s02.f21431c;
        if (i7 != 0 && this.f13084c0 != null && menuC1678l != null && (findItem = menuC1678l.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (s02.f21432d) {
            RunnableC1077b runnableC1077b = this.f13092h0;
            removeCallbacks(runnableC1077b);
            post(runnableC1077b);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        d();
        H0 h02 = this.f13064H;
        boolean z8 = i7 == 1;
        if (z8 == h02.g) {
            return;
        }
        h02.g = z8;
        if (!h02.f21389h) {
            h02.f21383a = h02.f21387e;
            h02.f21384b = h02.f21388f;
            return;
        }
        if (z8) {
            int i10 = h02.f21386d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = h02.f21387e;
            }
            h02.f21383a = i10;
            int i11 = h02.f21385c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = h02.f21388f;
            }
            h02.f21384b = i11;
            return;
        }
        int i12 = h02.f21385c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = h02.f21387e;
        }
        h02.f21383a = i12;
        int i13 = h02.f21386d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = h02.f21388f;
        }
        h02.f21384b = i13;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, H1.b, o.S0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1740j c1740j;
        C1680n c1680n;
        ?? bVar = new H1.b(super.onSaveInstanceState());
        P0 p02 = this.f13084c0;
        if (p02 != null && (c1680n = p02.f21417b) != null) {
            bVar.f21431c = c1680n.f20985a;
        }
        ActionMenuView actionMenuView = this.f13079a;
        bVar.f21432d = (actionMenuView == null || (c1740j = actionMenuView.f12977H) == null || !c1740j.e()) ? false : true;
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13071P = false;
        }
        if (!this.f13071P) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f13071P = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f13071P = false;
        }
        return true;
    }

    public final int p(View view, int i7, int i10, int[] iArr) {
        Q0 q02 = (Q0) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) q02).leftMargin - iArr[0];
        int max = Math.max(0, i11) + i7;
        iArr[0] = Math.max(0, -i11);
        int j = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) q02).rightMargin + max;
    }

    public final int q(View view, int i7, int i10, int[] iArr) {
        Q0 q02 = (Q0) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) q02).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int j = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) q02).leftMargin);
    }

    public final int r(View view, int i7, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + max + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z8) {
        if (this.f13091g0 != z8) {
            this.f13091g0 = z8;
            u();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.f13094v;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(e.x(getContext(), i7));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f13094v.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.f13094v;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.f13089f);
            }
        }
    }

    public void setCollapsible(boolean z8) {
        this.f13086d0 = z8;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f13066J) {
            this.f13066J = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f13065I) {
            this.f13065I = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(e.x(getContext(), i7));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f13087e == null) {
                this.f13087e = new AppCompatImageView(getContext(), null);
            }
            if (!o(this.f13087e)) {
                b(this.f13087e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f13087e;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f13087e);
                this.f13074S.remove(this.f13087e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f13087e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f13087e == null) {
            this.f13087e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f13087e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.f13085d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            u0.K(this.f13085d, charSequence);
        }
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(e.x(getContext(), i7));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f13085d)) {
                b(this.f13085d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f13085d;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.f13085d);
                this.f13074S.remove(this.f13085d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f13085d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f13085d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(R0 r02) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f13079a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f13097y != i7) {
            this.f13097y = i7;
            if (i7 == 0) {
                this.f13096x = getContext();
            } else {
                this.f13096x = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f13083c;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f13083c);
                this.f13074S.remove(this.f13083c);
            }
        } else {
            if (this.f13083c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f13083c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f13083c.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f13057A;
                if (i7 != 0) {
                    this.f13083c.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f13070O;
                if (colorStateList != null) {
                    this.f13083c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f13083c)) {
                b(this.f13083c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f13083c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f13068M = charSequence;
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f13070O = colorStateList;
        AppCompatTextView appCompatTextView = this.f13083c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f13081b;
            if (appCompatTextView != null && o(appCompatTextView)) {
                removeView(this.f13081b);
                this.f13074S.remove(this.f13081b);
            }
        } else {
            if (this.f13081b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f13081b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f13081b.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f13098z;
                if (i7 != 0) {
                    this.f13081b.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f13069N;
                if (colorStateList != null) {
                    this.f13081b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f13081b)) {
                b(this.f13081b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f13081b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.L = charSequence;
    }

    public void setTitleMarginBottom(int i7) {
        this.f13063G = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f13061E = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f13060D = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f13062F = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f13069N = colorStateList;
        AppCompatTextView appCompatTextView = this.f13081b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a9 = O0.a(this);
            P0 p02 = this.f13084c0;
            boolean z8 = (p02 == null || p02.f21417b == null || a9 == null || !isAttachedToWindow() || !this.f13091g0) ? false : true;
            if (z8 && this.f13090f0 == null) {
                if (this.f13088e0 == null) {
                    this.f13088e0 = O0.b(new N0(this, 0));
                }
                O0.c(a9, this.f13088e0);
                this.f13090f0 = a9;
                return;
            }
            if (z8 || (onBackInvokedDispatcher = this.f13090f0) == null) {
                return;
            }
            O0.d(onBackInvokedDispatcher, this.f13088e0);
            this.f13090f0 = null;
        }
    }
}
