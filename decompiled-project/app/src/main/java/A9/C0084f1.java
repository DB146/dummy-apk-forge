package A9;

import a2.AbstractC0708a;
import android.content.Context;
import android.text.TextUtils;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.transition.FadeAndShortSlide;
import com.kt.apps.core.base.leanback.GuidanceStylingRelativeLayout;
import com.kt.apps.core.base.leanback.GuidedActionItemContainer;
import com.kt.apps.core.base.leanback.GuidedActionsRelativeLayout;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0084f1 {

    /* renamed from: u, reason: collision with root package name */
    public static final C0120o1 f1138u;

    /* renamed from: a, reason: collision with root package name */
    public ViewGroup f1139a;

    /* renamed from: b, reason: collision with root package name */
    public VerticalGridView f1140b;

    /* renamed from: c, reason: collision with root package name */
    public VerticalGridView f1141c;

    /* renamed from: d, reason: collision with root package name */
    public View f1142d;

    /* renamed from: e, reason: collision with root package name */
    public View f1143e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1144f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f1145h;

    /* renamed from: i, reason: collision with root package name */
    public float f1146i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public float f1147l;

    /* renamed from: m, reason: collision with root package name */
    public int f1148m;

    /* renamed from: n, reason: collision with root package name */
    public int f1149n;

    /* renamed from: o, reason: collision with root package name */
    public int f1150o;

    /* renamed from: p, reason: collision with root package name */
    public int f1151p;

    /* renamed from: q, reason: collision with root package name */
    public int f1152q;

    /* renamed from: r, reason: collision with root package name */
    public P0 f1153r = null;

    /* renamed from: s, reason: collision with root package name */
    public TransitionSet f1154s;

    /* renamed from: t, reason: collision with root package name */
    public float f1155t;

    static {
        C0120o1 c0120o1 = new C0120o1();
        f1138u = c0120o1;
        C0116n1 c0116n1 = new C0116n1();
        c0116n1.f1299a = R.id.guidedactions_item_title;
        c0116n1.f1304f = true;
        c0116n1.f1301c = 0;
        c0116n1.f1303e = true;
        c0116n1.a(0.0f);
        c0120o1.f1326a = new C0116n1[]{c0116n1};
    }

    public final void a(boolean z8) {
        if (this.f1154s == null && this.f1153r != null) {
            V0 v02 = (V0) this.f1140b.getAdapter();
            if (v02.j.indexOf(this.f1153r) < 0) {
                return;
            }
            this.f1153r.getClass();
            e(null, z8);
        }
    }

    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        float f4 = layoutInflater.getContext().getTheme().obtainStyledAttributes(AbstractC0708a.f12483a).getFloat(46, 40.0f);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(this.f1144f ? R.layout.lb_guidedbuttonactions : R.layout.lb_guidedactions, viewGroup, false);
        this.f1139a = viewGroup2;
        this.f1143e = viewGroup2.findViewById(this.f1144f ? R.id.guidedactions_content2 : R.id.guidedactions_content);
        ViewGroup viewGroup3 = this.f1139a;
        if (viewGroup3 instanceof VerticalGridView) {
            this.f1140b = (VerticalGridView) viewGroup3;
        } else {
            VerticalGridView verticalGridView = (VerticalGridView) viewGroup3.findViewById(this.f1144f ? R.id.guidedactions_list2 : R.id.guidedactions_list);
            this.f1140b = verticalGridView;
            if (verticalGridView == null) {
                throw new IllegalStateException("No ListView exists.");
            }
            verticalGridView.setWindowAlignmentOffsetPercent(f4);
            this.f1140b.setWindowAlignment(0);
            if (!this.f1144f) {
                this.f1141c = (VerticalGridView) this.f1139a.findViewById(R.id.guidedactions_sub_list);
                this.f1142d = this.f1139a.findViewById(R.id.guidedactions_sub_list_background);
            }
        }
        this.f1140b.setFocusable(false);
        this.f1140b.setFocusableInTouchMode(false);
        Context context = this.f1139a.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.guidedActionEnabledChevronAlpha, typedValue, true);
        this.k = typedValue.getFloat();
        context.getTheme().resolveAttribute(R.attr.guidedActionDisabledChevronAlpha, typedValue, true);
        this.f1147l = typedValue.getFloat();
        context.getTheme().resolveAttribute(R.attr.guidedActionTitleMinLines, typedValue, true);
        this.f1148m = context.getResources().getInteger(typedValue.resourceId);
        context.getTheme().resolveAttribute(R.attr.guidedActionTitleMaxLines, typedValue, true);
        this.f1149n = context.getResources().getInteger(typedValue.resourceId);
        context.getTheme().resolveAttribute(R.attr.guidedActionDescriptionMinLines, typedValue, true);
        this.f1150o = context.getResources().getInteger(typedValue.resourceId);
        context.getTheme().resolveAttribute(R.attr.guidedActionVerticalPadding, typedValue, true);
        this.f1151p = context.getResources().getDimensionPixelSize(typedValue.resourceId);
        this.f1152q = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
        context.getResources().getValue(R.dimen.lb_guidedactions_item_unselected_text_alpha, typedValue, true);
        this.g = typedValue.getFloat();
        context.getResources().getValue(R.dimen.lb_guidedactions_item_disabled_text_alpha, typedValue, true);
        this.f1145h = typedValue.getFloat();
        context.getResources().getValue(R.dimen.lb_guidedactions_item_unselected_description_text_alpha, typedValue, true);
        this.f1146i = typedValue.getFloat();
        context.getResources().getValue(R.dimen.lb_guidedactions_item_disabled_description_text_alpha, typedValue, true);
        this.j = typedValue.getFloat();
        this.f1155t = GuidanceStylingRelativeLayout.a(context);
        View view = this.f1143e;
        if (view instanceof GuidedActionsRelativeLayout) {
            ((GuidedActionsRelativeLayout) view).setInterceptKeyEventListener(new T(this));
        }
        return this.f1139a;
    }

    public final void c(C0080e1 c0080e1, boolean z8, boolean z10) {
        View view = c0080e1.f4707a;
        if (z8) {
            e(c0080e1, z10);
            view.setFocusable(false);
            View view2 = c0080e1.f1122y;
            view2.requestFocus();
            view2.setOnClickListener(new A0(this, c0080e1, 1));
            return;
        }
        view.setFocusable(true);
        view.requestFocus();
        e(null, z10);
        View view3 = c0080e1.f1122y;
        view3.setOnClickListener(null);
        view3.setClickable(false);
    }

    public final void d(C0080e1 c0080e1, boolean z8, boolean z10) {
        if (z8 == (c0080e1.f1115C != 0) || this.f1154s != null) {
            return;
        }
        P0 p02 = c0080e1.f1118u;
        View view = c0080e1.f1122y;
        TextView textView = c0080e1.f1120w;
        TextView textView2 = c0080e1.f1121x;
        if (z8) {
            CharSequence charSequence = p02.g;
            if (textView != null && charSequence != null) {
                textView.setText(charSequence);
            }
            CharSequence charSequence2 = p02.f930h;
            if (textView2 != null && charSequence2 != null) {
                textView2.setText(charSequence2);
            }
            if (view != null) {
                c(c0080e1, z8, z10);
                c0080e1.f1115C = 3;
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setText(p02.f1101c);
        }
        if (textView2 != null) {
            textView2.setText(p02.f1102d);
        }
        int i7 = c0080e1.f1115C;
        if (i7 == 2) {
            if (textView2 != null) {
                textView2.setVisibility(TextUtils.isEmpty(p02.f1102d) ? 8 : 0);
                textView2.setInputType(p02.j);
            }
        } else if (i7 == 1) {
            if (textView != null) {
                textView.setInputType(p02.f931i);
            }
        } else if (i7 == 3 && view != null) {
            c(c0080e1, z8, z10);
        }
        c0080e1.f1115C = 0;
    }

    public final void e(C0080e1 c0080e1, boolean z8) {
        C0080e1 c0080e12;
        int childCount = this.f1140b.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                c0080e12 = null;
                break;
            }
            VerticalGridView verticalGridView = this.f1140b;
            c0080e12 = (C0080e1) verticalGridView.L(verticalGridView.getChildAt(i7));
            if ((c0080e1 == null && c0080e12.f4707a.getVisibility() == 0) || (c0080e1 != null && c0080e12.f1118u == c0080e1.f1118u)) {
                break;
            } else {
                i7++;
            }
        }
        if (c0080e12 == null) {
            return;
        }
        c0080e12.f1118u.getClass();
        if (z8) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(112);
            fadeAndShortSlide.f13497c = c0080e12.f4707a.getHeight() * 0.5f;
            fadeAndShortSlide.setEpicenterCallback(new W1.e0(new q3.s(this), 2));
            ChangeTransform changeTransform = new ChangeTransform();
            androidx.leanback.transition.a aVar = new androidx.leanback.transition.a();
            aVar.setReparent(false);
            Fade fade = new Fade(3);
            androidx.leanback.transition.a aVar2 = new androidx.leanback.transition.a();
            aVar2.setReparent(false);
            if (c0080e1 == null) {
                fadeAndShortSlide.setStartDelay(150L);
                changeTransform.setStartDelay(100L);
                aVar.setStartDelay(100L);
                aVar2.setStartDelay(100L);
            } else {
                fade.setStartDelay(100L);
                aVar2.setStartDelay(50L);
                changeTransform.setStartDelay(50L);
                aVar.setStartDelay(50L);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                VerticalGridView verticalGridView2 = this.f1140b;
                C0080e1 c0080e13 = (C0080e1) verticalGridView2.L(verticalGridView2.getChildAt(i10));
                if (c0080e13 != c0080e12) {
                    fadeAndShortSlide.addTarget(c0080e13.f4707a);
                    fade.excludeTarget(c0080e13.f4707a, true);
                }
            }
            aVar2.addTarget(this.f1141c);
            aVar2.addTarget(this.f1142d);
            transitionSet.addTransition(fadeAndShortSlide);
            transitionSet.addTransition(fade);
            transitionSet.addTransition(aVar2);
            this.f1154s = transitionSet;
            E6.b.c(transitionSet, new C(this, 2));
            TransitionManager.beginDelayedTransition(this.f1139a, this.f1154s);
        }
        if (c0080e1 == null) {
            this.f1153r = null;
            this.f1140b.setPruneChild(true);
        } else {
            P0 p02 = c0080e1.f1118u;
            if (p02 != this.f1153r) {
                this.f1153r = p02;
                this.f1140b.setPruneChild(false);
            }
        }
        this.f1140b.setAnimateChildLayout(false);
        int childCount2 = this.f1140b.getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            VerticalGridView verticalGridView3 = this.f1140b;
            f((C0080e1) verticalGridView3.L(verticalGridView3.getChildAt(i11)));
        }
    }

    public final void f(C0080e1 c0080e1) {
        float f4 = 0.0f;
        if (!c0080e1.f1116D) {
            P0 p02 = this.f1153r;
            View view = c0080e1.f1122y;
            View view2 = c0080e1.f4707a;
            if (p02 == null) {
                view2.setVisibility(0);
                view2.setTranslationY(0.0f);
                if (view != null) {
                    c0080e1.f1122y.setActivated(false);
                    if (view2 instanceof GuidedActionItemContainer) {
                        ((GuidedActionItemContainer) view2).setFocusOutAllowed(true);
                    }
                }
            } else if (c0080e1.f1118u == p02) {
                view2.setVisibility(0);
                c0080e1.f1118u.getClass();
                if (view != null) {
                    view2.setTranslationY(0.0f);
                    c0080e1.f1122y.setActivated(true);
                    if (view2 instanceof GuidedActionItemContainer) {
                        ((GuidedActionItemContainer) view2).setFocusOutAllowed(false);
                    }
                }
            } else {
                view2.setVisibility(4);
                view2.setTranslationY(0.0f);
            }
        }
        ImageView imageView = c0080e1.f1114B;
        if (imageView != null) {
            P0 p03 = c0080e1.f1118u;
            boolean z8 = (p03.f929f & 4) == 4;
            if (!z8) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            imageView.setAlpha(p03.a() ? this.k : this.f1147l);
            if (!z8) {
                if (p03 == this.f1153r) {
                    imageView.setRotation(270.0f);
                    return;
                } else {
                    imageView.setRotation(90.0f);
                    return;
                }
            }
            ViewGroup viewGroup = this.f1139a;
            if (viewGroup != null && viewGroup.getLayoutDirection() == 1) {
                f4 = 180.0f;
            }
            imageView.setRotation(f4);
        }
    }
}
