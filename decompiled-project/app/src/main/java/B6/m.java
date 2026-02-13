package B6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import f6.C1139a;
import f6.C1140b;
import java.util.WeakHashMap;
import w6.AbstractC2221a;
import y1.D;
import y1.K;
import y7.u0;

/* loaded from: classes.dex */
public final class m extends LinearLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f2139z = 0;

    /* renamed from: a, reason: collision with root package name */
    public j f2140a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f2141b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f2142c;

    /* renamed from: d, reason: collision with root package name */
    public View f2143d;

    /* renamed from: e, reason: collision with root package name */
    public C1139a f2144e;

    /* renamed from: f, reason: collision with root package name */
    public View f2145f;

    /* renamed from: u, reason: collision with root package name */
    public TextView f2146u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f2147v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f2148w;

    /* renamed from: x, reason: collision with root package name */
    public int f2149x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f2150y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Context context) {
        super(context);
        this.f2150y = oVar;
        this.f2149x = 2;
        f(context);
        int i7 = oVar.f2183e;
        WeakHashMap weakHashMap = K.f26642a;
        setPaddingRelative(i7, oVar.f2185f, oVar.f2194u, oVar.f2195v);
        setGravity(17);
        setOrientation(!oVar.f2169R ? 1 : 0);
        setClickable(true);
        D.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private C1139a getBadge() {
        return this.f2144e;
    }

    private C1139a getOrCreateBadge() {
        if (this.f2144e == null) {
            this.f2144e = new C1139a(getContext());
        }
        c();
        C1139a c1139a = this.f2144e;
        if (c1139a != null) {
            return c1139a;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a(View view) {
        if (this.f2144e == null || view == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        C1139a c1139a = this.f2144e;
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c1139a.setBounds(rect);
        c1139a.h(view, null);
        if (c1139a.c() != null) {
            c1139a.c().setForeground(c1139a);
        } else {
            view.getOverlay().add(c1139a);
        }
        this.f2143d = view;
    }

    public final void b() {
        if (this.f2144e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f2143d;
            if (view != null) {
                C1139a c1139a = this.f2144e;
                if (c1139a != null) {
                    if (c1139a.c() != null) {
                        c1139a.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(c1139a);
                    }
                }
                this.f2143d = null;
            }
        }
    }

    public final void c() {
        j jVar;
        if (this.f2144e != null) {
            if (this.f2145f != null) {
                b();
                return;
            }
            ImageView imageView = this.f2142c;
            if (imageView != null && (jVar = this.f2140a) != null && jVar.f2128a != null) {
                if (this.f2143d == imageView) {
                    d(imageView);
                    return;
                } else {
                    b();
                    a(this.f2142c);
                    return;
                }
            }
            TextView textView = this.f2141b;
            if (textView == null || this.f2140a == null) {
                b();
            } else if (this.f2143d == textView) {
                d(textView);
            } else {
                b();
                a(this.f2141b);
            }
        }
    }

    public final void d(View view) {
        C1139a c1139a = this.f2144e;
        if (c1139a == null || view != this.f2143d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c1139a.setBounds(rect);
        c1139a.h(view, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2148w;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f2148w.setState(drawableState)) {
            invalidate();
            this.f2150y.invalidate();
        }
    }

    public final void e() {
        boolean z8;
        g();
        j jVar = this.f2140a;
        if (jVar != null) {
            o oVar = jVar.f2133f;
            if (oVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = oVar.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == jVar.f2131d) {
                z8 = true;
                setSelected(z8);
            }
        }
        z8 = false;
        setSelected(z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, B6.m] */
    public final void f(Context context) {
        o oVar = this.f2150y;
        int i7 = oVar.f2160H;
        if (i7 != 0) {
            Drawable x2 = Q5.e.x(context, i7);
            this.f2148w = x2;
            if (x2 != null && x2.isStateful()) {
                this.f2148w.setState(getDrawableState());
            }
        } else {
            this.f2148w = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (oVar.f2154B != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = oVar.f2154B;
            int[] iArr = AbstractC2221a.f25811d;
            int a9 = AbstractC2221a.a(colorStateList, AbstractC2221a.f25810c);
            int[] iArr2 = AbstractC2221a.f25809b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{a9, AbstractC2221a.a(colorStateList, iArr2), AbstractC2221a.a(colorStateList, AbstractC2221a.f25808a)});
            boolean z8 = oVar.f2173V;
            if (z8) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z8 ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = K.f26642a;
        setBackground(gradientDrawable);
        oVar.invalidate();
    }

    public final void g() {
        int i7;
        ViewParent parent;
        j jVar = this.f2140a;
        View view = jVar != null ? jVar.f2132e : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f2145f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f2145f);
                }
                addView(view);
            }
            this.f2145f = view;
            TextView textView = this.f2141b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f2142c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f2142c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f2146u = textView2;
            if (textView2 != null) {
                this.f2149x = textView2.getMaxLines();
            }
            this.f2147v = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f2145f;
            if (view3 != null) {
                removeView(view3);
                this.f2145f = null;
            }
            this.f2146u = null;
            this.f2147v = null;
        }
        if (this.f2145f == null) {
            if (this.f2142c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.kt.apps.media.xemtv.beta.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f2142c = imageView2;
                addView(imageView2, 0);
            }
            if (this.f2141b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.kt.apps.media.xemtv.beta.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f2141b = textView3;
                addView(textView3);
                this.f2149x = this.f2141b.getMaxLines();
            }
            TextView textView4 = this.f2141b;
            o oVar = this.f2150y;
            textView4.setTextAppearance(oVar.f2196w);
            if (!isSelected() || (i7 = oVar.f2198y) == -1) {
                this.f2141b.setTextAppearance(oVar.f2197x);
            } else {
                this.f2141b.setTextAppearance(i7);
            }
            ColorStateList colorStateList = oVar.f2199z;
            if (colorStateList != null) {
                this.f2141b.setTextColor(colorStateList);
            }
            h(this.f2141b, this.f2142c, true);
            c();
            ImageView imageView3 = this.f2142c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new l(this, imageView3));
            }
            TextView textView5 = this.f2141b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new l(this, textView5));
            }
        } else {
            TextView textView6 = this.f2146u;
            if (textView6 != null || this.f2147v != null) {
                h(textView6, this.f2147v, false);
            }
        }
        if (jVar == null || TextUtils.isEmpty(jVar.f2130c)) {
            return;
        }
        setContentDescription(jVar.f2130c);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f2141b, this.f2142c, this.f2145f};
        int i7 = 0;
        int i10 = 0;
        boolean z8 = false;
        for (int i11 = 0; i11 < 3; i11++) {
            View view = viewArr[i11];
            if (view != null && view.getVisibility() == 0) {
                i10 = z8 ? Math.min(i10, view.getTop()) : view.getTop();
                i7 = z8 ? Math.max(i7, view.getBottom()) : view.getBottom();
                z8 = true;
            }
        }
        return i7 - i10;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f2141b, this.f2142c, this.f2145f};
        int i7 = 0;
        int i10 = 0;
        boolean z8 = false;
        for (int i11 = 0; i11 < 3; i11++) {
            View view = viewArr[i11];
            if (view != null && view.getVisibility() == 0) {
                i10 = z8 ? Math.min(i10, view.getLeft()) : view.getLeft();
                i7 = z8 ? Math.max(i7, view.getRight()) : view.getRight();
                z8 = true;
            }
        }
        return i7 - i10;
    }

    public j getTab() {
        return this.f2140a;
    }

    public final void h(TextView textView, ImageView imageView, boolean z8) {
        boolean z10;
        Drawable drawable;
        j jVar = this.f2140a;
        Drawable mutate = (jVar == null || (drawable = jVar.f2128a) == null) ? null : drawable.mutate();
        o oVar = this.f2150y;
        if (mutate != null) {
            mutate.setTintList(oVar.f2153A);
            PorterDuff.Mode mode = oVar.f2157E;
            if (mode != null) {
                mutate.setTintMode(mode);
            }
        }
        j jVar2 = this.f2140a;
        CharSequence charSequence = jVar2 != null ? jVar2.f2129b : null;
        if (imageView != null) {
            if (mutate != null) {
                imageView.setImageDrawable(mutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (isEmpty) {
                z10 = false;
            } else {
                this.f2140a.getClass();
                z10 = true;
            }
            textView.setText(!isEmpty ? charSequence : null);
            textView.setVisibility(z10 ? 0 : 8);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z10 = false;
        }
        if (z8 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int d10 = (z10 && imageView.getVisibility() == 0) ? (int) s6.o.d(getContext(), 8) : 0;
            if (oVar.f2169R) {
                if (d10 != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(d10);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (d10 != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = d10;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        j jVar3 = this.f2140a;
        CharSequence charSequence2 = jVar3 != null ? jVar3.f2130c : null;
        if (isEmpty) {
            charSequence = charSequence2;
        }
        u0.K(this, charSequence);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1139a c1139a = this.f2144e;
        if (c1139a != null && c1139a.isVisible()) {
            C1139a c1139a2 = this.f2144e;
            CharSequence charSequence = null;
            if (c1139a2.isVisible()) {
                C1140b c1140b = c1139a2.f16971e.f17009b;
                String str = c1140b.f17005x;
                if (str != null) {
                    String str2 = c1140b.f16981C;
                    charSequence = str2 != null ? str2 : str;
                } else if (!c1139a2.f()) {
                    charSequence = c1140b.f16982D;
                } else if (c1140b.f16983E != 0 && (context = (Context) c1139a2.f16967a.get()) != null) {
                    if (c1139a2.f16974v != -2) {
                        int d10 = c1139a2.d();
                        int i7 = c1139a2.f16974v;
                        if (d10 > i7) {
                            charSequence = context.getString(c1140b.f16984F, Integer.valueOf(i7));
                        }
                    }
                    charSequence = context.getResources().getQuantityString(c1140b.f16983E, c1139a2.d(), Integer.valueOf(c1139a2.d()));
                }
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) o7.o.m(isSelected(), 0, 1, this.f2140a.f2131d, 1).f22101b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) z1.d.f28159e.f28168a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.kt.apps.media.xemtv.beta.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        o oVar = this.f2150y;
        int tabMaxWidth = oVar.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i7 = View.MeasureSpec.makeMeasureSpec(oVar.f2161I, Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i10);
        if (this.f2141b != null) {
            float f4 = oVar.f2158F;
            int i11 = this.f2149x;
            ImageView imageView = this.f2142c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f2141b;
                if (textView != null && textView.getLineCount() > 1) {
                    f4 = oVar.f2159G;
                }
            } else {
                i11 = 1;
            }
            float textSize = this.f2141b.getTextSize();
            int lineCount = this.f2141b.getLineCount();
            int maxLines = this.f2141b.getMaxLines();
            if (f4 != textSize || (maxLines >= 0 && i11 != maxLines)) {
                if (oVar.f2168Q == 1 && f4 > textSize && lineCount == 1) {
                    Layout layout = this.f2141b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f4 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f2141b.setTextSize(0, f4);
                this.f2141b.setMaxLines(i11);
                super.onMeasure(i7, i10);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f2140a == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        j jVar = this.f2140a;
        o oVar = jVar.f2133f;
        if (oVar == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        oVar.j(jVar, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        isSelected();
        super.setSelected(z8);
        TextView textView = this.f2141b;
        if (textView != null) {
            textView.setSelected(z8);
        }
        ImageView imageView = this.f2142c;
        if (imageView != null) {
            imageView.setSelected(z8);
        }
        View view = this.f2145f;
        if (view != null) {
            view.setSelected(z8);
        }
    }

    public void setTab(j jVar) {
        if (jVar != this.f2140a) {
            this.f2140a = jVar;
            e();
        }
    }
}
