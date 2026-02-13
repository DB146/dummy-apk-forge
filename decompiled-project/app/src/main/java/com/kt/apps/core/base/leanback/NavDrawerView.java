package com.kt.apps.core.base.leanback;

import A9.A1;
import A9.B1;
import A9.C0163z1;
import A9.D1;
import A9.E1;
import A9.F1;
import Db.o;
import Rb.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.NavDrawerView;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
import m.C1526h;
import n.MenuC1678l;
import s6.C1998h;
import x9.c;

/* loaded from: classes2.dex */
public final class NavDrawerView extends LinearLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final o f15958z = b.z(new C0163z1(0));

    /* renamed from: a, reason: collision with root package name */
    public int f15959a;

    /* renamed from: b, reason: collision with root package name */
    public final C1998h f15960b;

    /* renamed from: c, reason: collision with root package name */
    public D1 f15961c;

    /* renamed from: d, reason: collision with root package name */
    public final o f15962d;

    /* renamed from: e, reason: collision with root package name */
    public final o f15963e;

    /* renamed from: f, reason: collision with root package name */
    public final o f15964f;

    /* renamed from: u, reason: collision with root package name */
    public final int f15965u;

    /* renamed from: v, reason: collision with root package name */
    public final int f15966v;

    /* renamed from: w, reason: collision with root package name */
    public final o f15967w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15968x;

    /* renamed from: y, reason: collision with root package name */
    public E1 f15969y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [s6.h, android.view.Menu, n.l] */
    public NavDrawerView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        boolean z8 = false;
        ?? menuC1678l = new MenuC1678l(context);
        this.f15960b = menuC1678l;
        this.f15962d = b.z(new C0163z1(1));
        final int i7 = 0;
        this.f15963e = b.z(new a() { // from class: A9.C1
            @Override // Rb.a
            public final Object invoke() {
                final int i10 = 1;
                final NavDrawerView navDrawerView = this;
                Context context2 = context;
                final int i11 = 0;
                switch (i7) {
                    case 0:
                        Db.o oVar = NavDrawerView.f15958z;
                        ValueAnimator ofInt = ValueAnimator.ofInt(com.bumptech.glide.d.i(context2, 0), com.bumptech.glide.d.i(context2, 150));
                        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: A9.y1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator it) {
                                int i12 = 0;
                                NavDrawerView navDrawerView2 = navDrawerView;
                                switch (i11) {
                                    case 0:
                                        Db.o oVar2 = NavDrawerView.f15958z;
                                        kotlin.jvm.internal.l.e(it, "it");
                                        D1 d12 = navDrawerView2.f15961c;
                                        if (d12 != null) {
                                            ((W) ((A1.d) d12).f330b).f1028q1.setAlpha(it.getAnimatedFraction() * 0.85f);
                                        }
                                        int childCount = navDrawerView2.getChildCount();
                                        while (i12 < childCount) {
                                            TextView textView = (TextView) navDrawerView2.getChildAt(i12).findViewById(R.id.row_header);
                                            ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
                                            if (layoutParams != null) {
                                                Object animatedValue = it.getAnimatedValue();
                                                kotlin.jvm.internal.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                                layoutParams.width = ((Integer) animatedValue).intValue();
                                            }
                                            if (textView != null) {
                                                textView.setLayoutParams(layoutParams);
                                            }
                                            i12++;
                                        }
                                        return;
                                    default:
                                        Db.o oVar3 = NavDrawerView.f15958z;
                                        kotlin.jvm.internal.l.e(it, "it");
                                        D1 d13 = navDrawerView2.f15961c;
                                        if (d13 != null) {
                                            ((W) ((A1.d) d13).f330b).f1028q1.setAlpha((1 - it.getAnimatedFraction()) * 0.85f);
                                        }
                                        int childCount2 = navDrawerView2.getChildCount();
                                        while (i12 < childCount2) {
                                            TextView textView2 = (TextView) navDrawerView2.getChildAt(i12).findViewById(R.id.row_header);
                                            ViewGroup.LayoutParams layoutParams2 = textView2 != null ? textView2.getLayoutParams() : null;
                                            if (layoutParams2 != null) {
                                                Object animatedValue2 = it.getAnimatedValue();
                                                kotlin.jvm.internal.l.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                                                layoutParams2.width = ((Integer) animatedValue2).intValue();
                                            }
                                            if (textView2 != null) {
                                                textView2.setLayoutParams(layoutParams2);
                                            }
                                            i12++;
                                        }
                                        return;
                                }
                            }
                        });
                        ofInt.addListener(new G1(navDrawerView, i10));
                        return ofInt;
                    default:
                        Db.o oVar2 = NavDrawerView.f15958z;
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(com.bumptech.glide.d.i(context2, 150), com.bumptech.glide.d.i(context2, 0));
                        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: A9.y1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator it) {
                                int i12 = 0;
                                NavDrawerView navDrawerView2 = navDrawerView;
                                switch (i10) {
                                    case 0:
                                        Db.o oVar22 = NavDrawerView.f15958z;
                                        kotlin.jvm.internal.l.e(it, "it");
                                        D1 d12 = navDrawerView2.f15961c;
                                        if (d12 != null) {
                                            ((W) ((A1.d) d12).f330b).f1028q1.setAlpha(it.getAnimatedFraction() * 0.85f);
                                        }
                                        int childCount = navDrawerView2.getChildCount();
                                        while (i12 < childCount) {
                                            TextView textView = (TextView) navDrawerView2.getChildAt(i12).findViewById(R.id.row_header);
                                            ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
                                            if (layoutParams != null) {
                                                Object animatedValue = it.getAnimatedValue();
                                                kotlin.jvm.internal.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                                layoutParams.width = ((Integer) animatedValue).intValue();
                                            }
                                            if (textView != null) {
                                                textView.setLayoutParams(layoutParams);
                                            }
                                            i12++;
                                        }
                                        return;
                                    default:
                                        Db.o oVar3 = NavDrawerView.f15958z;
                                        kotlin.jvm.internal.l.e(it, "it");
                                        D1 d13 = navDrawerView2.f15961c;
                                        if (d13 != null) {
                                            ((W) ((A1.d) d13).f330b).f1028q1.setAlpha((1 - it.getAnimatedFraction()) * 0.85f);
                                        }
                                        int childCount2 = navDrawerView2.getChildCount();
                                        while (i12 < childCount2) {
                                            TextView textView2 = (TextView) navDrawerView2.getChildAt(i12).findViewById(R.id.row_header);
                                            ViewGroup.LayoutParams layoutParams2 = textView2 != null ? textView2.getLayoutParams() : null;
                                            if (layoutParams2 != null) {
                                                Object animatedValue2 = it.getAnimatedValue();
                                                kotlin.jvm.internal.l.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                                                layoutParams2.width = ((Integer) animatedValue2).intValue();
                                            }
                                            if (textView2 != null) {
                                                textView2.setLayoutParams(layoutParams2);
                                            }
                                            i12++;
                                        }
                                        return;
                                }
                            }
                        });
                        ofInt2.addListener(new G1(navDrawerView, i11));
                        return ofInt2;
                }
            }
        });
        final int i10 = 1;
        this.f15964f = b.z(new a() { // from class: A9.C1
            @Override // Rb.a
            public final Object invoke() {
                final int i102 = 1;
                final NavDrawerView navDrawerView = this;
                Context context2 = context;
                final int i11 = 0;
                switch (i10) {
                    case 0:
                        Db.o oVar = NavDrawerView.f15958z;
                        ValueAnimator ofInt = ValueAnimator.ofInt(com.bumptech.glide.d.i(context2, 0), com.bumptech.glide.d.i(context2, 150));
                        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: A9.y1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator it) {
                                int i12 = 0;
                                NavDrawerView navDrawerView2 = navDrawerView;
                                switch (i11) {
                                    case 0:
                                        Db.o oVar22 = NavDrawerView.f15958z;
                                        kotlin.jvm.internal.l.e(it, "it");
                                        D1 d12 = navDrawerView2.f15961c;
                                        if (d12 != null) {
                                            ((W) ((A1.d) d12).f330b).f1028q1.setAlpha(it.getAnimatedFraction() * 0.85f);
                                        }
                                        int childCount = navDrawerView2.getChildCount();
                                        while (i12 < childCount) {
                                            TextView textView = (TextView) navDrawerView2.getChildAt(i12).findViewById(R.id.row_header);
                                            ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
                                            if (layoutParams != null) {
                                                Object animatedValue = it.getAnimatedValue();
                                                kotlin.jvm.internal.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                                layoutParams.width = ((Integer) animatedValue).intValue();
                                            }
                                            if (textView != null) {
                                                textView.setLayoutParams(layoutParams);
                                            }
                                            i12++;
                                        }
                                        return;
                                    default:
                                        Db.o oVar3 = NavDrawerView.f15958z;
                                        kotlin.jvm.internal.l.e(it, "it");
                                        D1 d13 = navDrawerView2.f15961c;
                                        if (d13 != null) {
                                            ((W) ((A1.d) d13).f330b).f1028q1.setAlpha((1 - it.getAnimatedFraction()) * 0.85f);
                                        }
                                        int childCount2 = navDrawerView2.getChildCount();
                                        while (i12 < childCount2) {
                                            TextView textView2 = (TextView) navDrawerView2.getChildAt(i12).findViewById(R.id.row_header);
                                            ViewGroup.LayoutParams layoutParams2 = textView2 != null ? textView2.getLayoutParams() : null;
                                            if (layoutParams2 != null) {
                                                Object animatedValue2 = it.getAnimatedValue();
                                                kotlin.jvm.internal.l.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                                                layoutParams2.width = ((Integer) animatedValue2).intValue();
                                            }
                                            if (textView2 != null) {
                                                textView2.setLayoutParams(layoutParams2);
                                            }
                                            i12++;
                                        }
                                        return;
                                }
                            }
                        });
                        ofInt.addListener(new G1(navDrawerView, i102));
                        return ofInt;
                    default:
                        Db.o oVar2 = NavDrawerView.f15958z;
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(com.bumptech.glide.d.i(context2, 150), com.bumptech.glide.d.i(context2, 0));
                        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: A9.y1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator it) {
                                int i12 = 0;
                                NavDrawerView navDrawerView2 = navDrawerView;
                                switch (i102) {
                                    case 0:
                                        Db.o oVar22 = NavDrawerView.f15958z;
                                        kotlin.jvm.internal.l.e(it, "it");
                                        D1 d12 = navDrawerView2.f15961c;
                                        if (d12 != null) {
                                            ((W) ((A1.d) d12).f330b).f1028q1.setAlpha(it.getAnimatedFraction() * 0.85f);
                                        }
                                        int childCount = navDrawerView2.getChildCount();
                                        while (i12 < childCount) {
                                            TextView textView = (TextView) navDrawerView2.getChildAt(i12).findViewById(R.id.row_header);
                                            ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
                                            if (layoutParams != null) {
                                                Object animatedValue = it.getAnimatedValue();
                                                kotlin.jvm.internal.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                                layoutParams.width = ((Integer) animatedValue).intValue();
                                            }
                                            if (textView != null) {
                                                textView.setLayoutParams(layoutParams);
                                            }
                                            i12++;
                                        }
                                        return;
                                    default:
                                        Db.o oVar3 = NavDrawerView.f15958z;
                                        kotlin.jvm.internal.l.e(it, "it");
                                        D1 d13 = navDrawerView2.f15961c;
                                        if (d13 != null) {
                                            ((W) ((A1.d) d13).f330b).f1028q1.setAlpha((1 - it.getAnimatedFraction()) * 0.85f);
                                        }
                                        int childCount2 = navDrawerView2.getChildCount();
                                        while (i12 < childCount2) {
                                            TextView textView2 = (TextView) navDrawerView2.getChildAt(i12).findViewById(R.id.row_header);
                                            ViewGroup.LayoutParams layoutParams2 = textView2 != null ? textView2.getLayoutParams() : null;
                                            if (layoutParams2 != null) {
                                                Object animatedValue2 = it.getAnimatedValue();
                                                kotlin.jvm.internal.l.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                                                layoutParams2.width = ((Integer) animatedValue2).intValue();
                                            }
                                            if (textView2 != null) {
                                                textView2.setLayoutParams(layoutParams2);
                                            }
                                            i12++;
                                        }
                                        return;
                                }
                            }
                        });
                        ofInt2.addListener(new G1(navDrawerView, i11));
                        return ofInt2;
                }
            }
        });
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f26278a);
        l.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f15966v = obtainStyledAttributes.getDimensionPixelSize(0, R.dimen.nav_spacing_between);
        this.f15965u = obtainStyledAttributes.getInteger(1, 0);
        int i11 = 2;
        if (obtainStyledAttributes.hasValue(2)) {
            new C1526h(context).inflate(obtainStyledAttributes.getResourceId(2, R.menu.navigation_menu), menuC1678l);
            int size = menuC1678l.f20959f.size();
            int i12 = -1;
            int i13 = 0;
            int i14 = 0;
            boolean z10 = true;
            while (i14 < size) {
                MenuItem item = this.f15960b.getItem(i14);
                boolean isEnabled = item.isEnabled();
                View inflate = LayoutInflater.from(context).inflate(R.layout.header_dashboard, (ViewGroup) null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                if (isEnabled) {
                    if (z10 && this.f15965u == i14) {
                        this.f15959a = item.getItemId();
                        if (Build.VERSION.SDK_INT >= 26) {
                            inflate.setFocusedByDefault(true);
                        } else {
                            inflate.requestFocus();
                            Method method = ((F1) f15958z.getValue()).f822a;
                            if (method != null) {
                                method.invoke(this, inflate);
                            }
                        }
                        z10 = z8;
                        i12 = i14;
                    }
                    get_enablePositionMap().put(Integer.valueOf(i14), Integer.valueOf(i13));
                    i13++;
                }
                int i15 = i12;
                boolean z11 = z10;
                int i16 = i13;
                ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
                TextView textView = (TextView) inflate.findViewById(R.id.row_header);
                int i17 = this.f15966v / i11;
                marginLayoutParams.topMargin = i17;
                marginLayoutParams.bottomMargin = i17;
                imageView.setImageDrawable(item.getIcon());
                inflate.setTag(Integer.valueOf(item.getItemId()));
                inflate.setLayoutParams(marginLayoutParams);
                inflate.setPressed(i14 == i15 ? true : z8);
                inflate.setSelected(z8);
                inflate.setOnFocusChangeListener(new A1(this, i14, inflate, imageView, textView, item, 1));
                inflate.setOnClickListener(new B1(this, 1));
                textView.setText((CharSequence) null);
                textView.setVisibility(4);
                addView(inflate, i14);
                i14++;
                i12 = i15;
                z10 = z11;
                i13 = i16;
                z8 = false;
                i11 = 2;
            }
        }
        obtainStyledAttributes.recycle();
        this.f15967w = b.z(new C0163z1(2));
    }

    public static void a(NavDrawerView navDrawerView, int i7, View view, ImageView imageView, TextView textView, MenuItem menuItem, boolean z8) {
        String message = "OnFocusChange: " + i7 + ", " + z8;
        l.e(message, "message");
        if (!navDrawerView.f15968x) {
            view.setPressed(l.a(view.getTag(), Integer.valueOf(navDrawerView.f15959a)));
            imageView.setSelected(false);
            textView.setSelected(false);
        }
        if (z8) {
            E1 e12 = navDrawerView.f15969y;
            if (e12 != null) {
                Integer num = navDrawerView.get_enablePositionMap().get(Integer.valueOf(i7));
                int intValue = num != null ? num.intValue() : -1;
                menuItem.getItemId();
                e12.b(intValue);
            }
            if (!menuItem.isEnabled()) {
                navDrawerView.i(i7, true);
            }
        }
        if (menuItem.isEnabled()) {
            return;
        }
        view.setSelected(false);
        view.setPressed(false);
        imageView.setSelected(false);
        textView.setSelected(false);
    }

    public static void b(NavDrawerView navDrawerView, int i7, View view, ImageView imageView, TextView textView, MenuItem menuItem, boolean z8) {
        String message = "OnFocusChange: " + i7 + ", " + z8;
        l.e(message, "message");
        if (!navDrawerView.f15968x) {
            view.setPressed(l.a(view.getTag(), Integer.valueOf(navDrawerView.f15959a)));
            imageView.setSelected(false);
            textView.setSelected(false);
        }
        if (z8) {
            E1 e12 = navDrawerView.f15969y;
            if (e12 != null) {
                Integer num = navDrawerView.get_enablePositionMap().get(Integer.valueOf(i7));
                int intValue = num != null ? num.intValue() : -1;
                menuItem.getItemId();
                e12.b(intValue);
            }
            if (!menuItem.isEnabled()) {
                navDrawerView.i(i7, true);
            }
        }
        if (menuItem.isEnabled()) {
            return;
        }
        view.setSelected(false);
        view.setPressed(false);
        imageView.setSelected(false);
        textView.setSelected(false);
    }

    private final ValueAnimator getCloseAnimator() {
        return (ValueAnimator) this.f15964f.getValue();
    }

    private final ValueAnimator getOpenNavigator() {
        return (ValueAnimator) this.f15963e.getValue();
    }

    private final Map<Integer, Integer> get_enablePositionMap() {
        return (Map) this.f15962d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomicBoolean get_isAnimating() {
        return (AtomicBoolean) this.f15967w.getValue();
    }

    public final void d() {
        if (!this.f15968x || e()) {
            return;
        }
        this.f15968x = false;
        get_isAnimating().set(true);
        getOpenNavigator().cancel();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            TextView textView = (TextView) getChildAt(i7).findViewWithTag(Integer.valueOf(R.id.row_header));
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
        }
        getCloseAnimator().start();
    }

    public final boolean e() {
        return get_isAnimating().get();
    }

    public final void f() {
        if (this.f15968x || e()) {
            return;
        }
        this.f15968x = true;
        get_isAnimating().set(true);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            TextView textView = (TextView) getChildAt(i7).findViewById(R.id.row_header);
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(this.f15960b.getItem(i7).getTitle());
            }
        }
        getOpenNavigator().start();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        String message = "{focusedView: " + view + ",direction: " + i7 + "}";
        l.e(message, "message");
        if (!this.f15968x && view != null && i7 != 17 && i7 != 66) {
            return view;
        }
        if (i7 == 130) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (l.a(getChildAt(i10).getTag(), Integer.valueOf(this.f15959a))) {
                    if (i10 == getChildCount() - 1) {
                        return getChildAt(i10);
                    }
                    int i11 = i10 + 1;
                    i(i11 % getChildCount(), false);
                    return getChildAt(i11 % getChildCount());
                }
            }
        }
        if (i7 == 33) {
            int childCount2 = getChildCount();
            for (int i12 = 0; i12 < childCount2; i12++) {
                if (l.a(getChildAt(i12).getTag(), Integer.valueOf(this.f15959a))) {
                    if (i12 == 0) {
                        return getChildAt(i12);
                    }
                    i(((getChildCount() + i12) - 1) % getChildCount(), false);
                    return getChildAt(((getChildCount() + i12) - 1) % getChildCount());
                }
            }
        }
        if (!(view != null ? l.a(view.getTag(), Integer.valueOf(this.f15959a)) : false) || i7 != 66) {
            int childCount3 = getChildCount();
            for (int i13 = 0; i13 < childCount3; i13++) {
                if (l.a(getChildAt(i13).getTag(), Integer.valueOf(this.f15959a))) {
                    return getChildAt(i13);
                }
            }
            return getParent().focusSearch(view, i7);
        }
        Log.d("TuanDV", "focusSearch: " + this.f15959a);
        ViewParent parent = getParent();
        if (parent != null) {
            return parent.focusSearch(view, i7);
        }
        return null;
    }

    public final void g() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            childAt.setSelected(false);
            childAt.setPressed(l.a(childAt.getTag(), Integer.valueOf(this.f15959a)));
            TextView textView = (TextView) childAt.findViewById(R.id.row_header);
            if (textView != null) {
                textView.setVisibility(4);
            }
        }
        this.f15968x = false;
        get_isAnimating().set(false);
    }

    public final D1 getOnAnimatedFraction() {
        return this.f15961c;
    }

    public final E1 getOnNavDrawerItemSelected() {
        return this.f15969y;
    }

    public final void h(int i7) {
        Object obj;
        String message = "setEnableSelectedItem: " + i7;
        l.e(message, "message");
        final int a02 = Eb.o.a0(get_enablePositionMap().values(), Integer.valueOf(i7));
        Set<Integer> keySet = get_enablePositionMap().keySet();
        l.e(keySet, "<this>");
        boolean z8 = keySet instanceof List;
        if (z8) {
            obj = ((List) keySet).get(a02);
        } else {
            Rb.c cVar = new Rb.c() { // from class: Eb.s
                @Override // Rb.c
                public final Object invoke(Object obj2) {
                    ((Integer) obj2).intValue();
                    throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + a02 + '.');
                }
            };
            if (!z8) {
                if (a02 < 0) {
                    cVar.invoke(Integer.valueOf(a02));
                    throw null;
                }
                int i10 = 0;
                for (Object obj2 : keySet) {
                    int i11 = i10 + 1;
                    if (a02 == i10) {
                        obj = obj2;
                    } else {
                        i10 = i11;
                    }
                }
                cVar.invoke(Integer.valueOf(a02));
                throw null;
            }
            List list = (List) keySet;
            if (a02 < 0 || a02 >= list.size()) {
                cVar.invoke(Integer.valueOf(a02));
                throw null;
            }
            obj = list.get(a02);
        }
        i(((Number) obj).intValue(), true);
    }

    public final void i(int i7, boolean z8) {
        String message = "setItemSelected: " + i7;
        l.e(message, "message");
        Integer valueOf = Integer.valueOf(i7);
        if (i7 <= -1) {
            valueOf = null;
        }
        int itemId = this.f15960b.getItem(valueOf != null ? valueOf.intValue() : 0).getItemId();
        this.f15959a = itemId;
        if (z8) {
            int childCount = getChildCount();
            boolean z10 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).setSelected(false);
                if (getChildAt(i10).isFocused()) {
                    z10 = true;
                }
            }
            if (z10) {
                ((LinearLayout) findViewWithTag(Integer.valueOf(itemId))).setSelected(true);
            } else {
                ((LinearLayout) findViewWithTag(Integer.valueOf(itemId))).setPressed(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (l.a(childAt.getTag(), Integer.valueOf(this.f15959a))) {
                return childAt.requestFocus(i7, rect);
            }
        }
        return super.requestFocus(i7, rect);
    }

    public final void setMenu(int i7) {
        removeAllViews();
        C1998h c1998h = this.f15960b;
        boolean z8 = true;
        c1998h.f20946D = true;
        c1998h.clear();
        c1998h.clearHeader();
        c1998h.f20951I.clear();
        c1998h.f20946D = false;
        c1998h.f20947E = false;
        c1998h.f20948F = false;
        c1998h.p(true);
        new C1526h(getContext()).inflate(i7, c1998h);
        int size = c1998h.f20959f.size();
        int i10 = -1;
        boolean z10 = true;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            MenuItem item = c1998h.getItem(i12);
            boolean isEnabled = item.isEnabled();
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.header_dashboard, (ViewGroup) null);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            if (isEnabled) {
                if (z10 && this.f15965u == i12) {
                    this.f15959a = item.getItemId();
                    if (Build.VERSION.SDK_INT >= 26) {
                        inflate.setFocusedByDefault(true);
                    } else {
                        inflate.requestFocus();
                        Method method = ((F1) f15958z.getValue()).f822a;
                        if (method != null) {
                            method.invoke(this, inflate);
                        }
                    }
                    z10 = false;
                    i10 = i12;
                }
                get_enablePositionMap().put(Integer.valueOf(i12), Integer.valueOf(i11));
                i11++;
            }
            int i13 = i10;
            boolean z11 = z10;
            int i14 = i11;
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            TextView textView = (TextView) inflate.findViewById(R.id.row_header);
            int i15 = this.f15966v / 2;
            marginLayoutParams.topMargin = i15;
            marginLayoutParams.bottomMargin = i15;
            imageView.setImageDrawable(item.getIcon());
            inflate.setTag(Integer.valueOf(item.getItemId()));
            inflate.setLayoutParams(marginLayoutParams);
            inflate.setPressed(i12 == i13 ? z8 : false);
            inflate.setSelected(false);
            inflate.setOnFocusChangeListener(new A1(this, i12, inflate, imageView, textView, item, 0));
            inflate.setOnClickListener(new B1(this, 0));
            textView.setText((CharSequence) null);
            textView.setVisibility(4);
            addView(inflate, i12);
            i12++;
            z10 = z11;
            i11 = i14;
            i10 = i13;
            z8 = true;
        }
    }

    public final void setOnAnimatedFraction(D1 d12) {
        this.f15961c = d12;
    }

    public final void setOnNavDrawerItemSelected(E1 e12) {
        this.f15969y = e12;
    }

    @Override // android.view.View
    public final String toString() {
        return "NavDrawerView";
    }
}
