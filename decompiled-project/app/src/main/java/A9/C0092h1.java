package A9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.leanback.transition.FadeAndShortSlide;
import com.kt.apps.core.base.leanback.GuidedStepRootLayout;
import com.kt.apps.core.base.leanback.NonOverlappingLinearLayout;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* renamed from: A9.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0092h1 extends W1.C {

    /* renamed from: m0, reason: collision with root package name */
    public ContextThemeWrapper f1209m0;

    /* renamed from: n0, reason: collision with root package name */
    public O0 f1210n0;

    /* renamed from: o0, reason: collision with root package name */
    public C0084f1 f1211o0;

    /* renamed from: p0, reason: collision with root package name */
    public C0084f1 f1212p0;

    /* renamed from: q0, reason: collision with root package name */
    public V0 f1213q0;

    /* renamed from: r0, reason: collision with root package name */
    public V0 f1214r0;

    /* renamed from: s0, reason: collision with root package name */
    public V0 f1215s0;

    /* renamed from: t0, reason: collision with root package name */
    public P3.p f1216t0;

    /* renamed from: u0, reason: collision with root package name */
    public ArrayList f1217u0 = new ArrayList();

    /* renamed from: v0, reason: collision with root package name */
    public ArrayList f1218v0 = new ArrayList();

    public C0092h1() {
        t0();
    }

    public static boolean o0(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.guidedStepThemeFlag, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }

    public static boolean p0(P0 p02) {
        return (p02.f929f & 64) == 64 && p02.f1099a != -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A9.O0, java.lang.Object] */
    @Override // W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.f1210n0 = new Object();
        this.f1211o0 = new C0084f1();
        C0084f1 c0084f1 = new C0084f1();
        if (c0084f1.f1139a != null) {
            throw new IllegalStateException("setAsButtonActions() must be called before creating views");
        }
        c0084f1.f1144f = true;
        this.f1212p0 = c0084f1;
        t0();
        ArrayList arrayList = new ArrayList();
        q0(arrayList);
        if (bundle != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                p0((P0) arrayList.get(i7));
            }
        }
        this.f1217u0 = arrayList;
        V0 v02 = this.f1213q0;
        if (v02 != null) {
            v02.n(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        if (bundle != null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                p0((P0) arrayList2.get(i10));
            }
        }
        this.f1218v0 = arrayList2;
        V0 v03 = this.f1215s0;
        if (v03 != null) {
            v03.n(arrayList2);
        }
    }

    @Override // W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context C2 = C();
        if (!o0(C2)) {
            TypedValue typedValue = new TypedValue();
            boolean resolveAttribute = C2.getTheme().resolveAttribute(R.attr.guidedStepTheme, typedValue, true);
            if (resolveAttribute) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C2, typedValue.resourceId);
                if (o0(contextThemeWrapper)) {
                    this.f1209m0 = contextThemeWrapper;
                } else {
                    this.f1209m0 = null;
                    resolveAttribute = false;
                }
            }
            if (!resolveAttribute) {
                Log.e("GuidedStepF", "GuidedStepSupportFragment does not have an appropriate theme set.");
            }
        }
        ContextThemeWrapper contextThemeWrapper2 = this.f1209m0;
        LayoutInflater cloneInContext = contextThemeWrapper2 == null ? layoutInflater : layoutInflater.cloneInContext(contextThemeWrapper2);
        GuidedStepRootLayout guidedStepRootLayout = (GuidedStepRootLayout) cloneInContext.inflate(R.layout.lb_guidedstep_fragment, viewGroup, false);
        guidedStepRootLayout.setFocusOutStart(false);
        guidedStepRootLayout.setFocusOutEnd(false);
        ViewGroup viewGroup2 = (ViewGroup) guidedStepRootLayout.findViewById(R.id.content_fragment);
        ViewGroup viewGroup3 = (ViewGroup) guidedStepRootLayout.findViewById(R.id.action_fragment);
        ((NonOverlappingLinearLayout) viewGroup3).setFocusableViewAvailableFixEnabled(true);
        q3.n r02 = r0();
        O0 o02 = this.f1210n0;
        o02.getClass();
        View inflate = cloneInContext.inflate(R.layout.lb_guidance, viewGroup2, false);
        o02.f922a = (TextView) inflate.findViewById(R.id.guidance_title);
        o02.f924c = (TextView) inflate.findViewById(R.id.guidance_breadcrumb);
        o02.f923b = (TextView) inflate.findViewById(R.id.guidance_description);
        o02.f925d = (ImageView) inflate.findViewById(R.id.guidance_icon);
        o02.f926e = inflate.findViewById(R.id.guidance_container);
        TextView textView = (TextView) o02.f922a;
        String str = (String) r02.f23396b;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) o02.f924c;
        String str2 = (String) r02.f23398d;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = (TextView) o02.f923b;
        String str3 = (String) r02.f23397c;
        if (textView3 != null) {
            textView3.setText(str3);
        }
        ImageView imageView = (ImageView) o02.f925d;
        if (imageView != null) {
            Drawable drawable = (Drawable) r02.f23399e;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
        View view = (View) o02.f926e;
        if (view != null && TextUtils.isEmpty(view.getContentDescription())) {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(str2);
                sb2.append('\n');
            }
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
                sb2.append('\n');
            }
            if (!TextUtils.isEmpty(str3)) {
                sb2.append(str3);
                sb2.append('\n');
            }
            ((View) o02.f926e).setContentDescription(sb2);
        }
        viewGroup2.addView(inflate);
        viewGroup3.addView(this.f1211o0.b(cloneInContext, viewGroup3));
        ViewGroup b2 = this.f1212p0.b(cloneInContext, viewGroup3);
        viewGroup3.addView(b2);
        C0088g1 c0088g1 = new C0088g1(this, 0);
        this.f1213q0 = new V0(this.f1217u0, new C0088g1(this, 1), this, this.f1211o0, false);
        this.f1215s0 = new V0(this.f1218v0, new C0088g1(this, 2), this, this.f1212p0, false);
        this.f1214r0 = new V0(null, new C0088g1(this, 3), this, this.f1211o0, true);
        P3.p pVar = new P3.p(1, false);
        ArrayList arrayList = new ArrayList();
        pVar.f7842c = arrayList;
        this.f1216t0 = pVar;
        V0 v02 = this.f1213q0;
        V0 v03 = this.f1215s0;
        arrayList.add(new Pair(v02, v03));
        if (v02 != null) {
            v02.f983m = pVar;
        }
        if (v03 != null) {
            v03.f983m = pVar;
        }
        P3.p pVar2 = this.f1216t0;
        V0 v04 = this.f1214r0;
        ((ArrayList) pVar2.f7842c).add(new Pair(v04, null));
        if (v04 != null) {
            v04.f983m = pVar2;
        }
        this.f1216t0.f7843d = c0088g1;
        C0084f1 c0084f1 = this.f1211o0;
        c0084f1.getClass();
        c0084f1.f1140b.setAdapter(this.f1213q0);
        VerticalGridView verticalGridView = this.f1211o0.f1141c;
        if (verticalGridView != null) {
            verticalGridView.setAdapter(this.f1214r0);
        }
        this.f1212p0.f1140b.setAdapter(this.f1215s0);
        if (this.f1218v0.size() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b2.getLayoutParams();
            layoutParams.weight = 0.0f;
            b2.setLayoutParams(layoutParams);
        } else {
            Context context = this.f1209m0;
            if (context == null) {
                context = C();
            }
            TypedValue typedValue2 = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.guidedActionContentWidthWeightTwoPanels, typedValue2, true)) {
                View findViewById = guidedStepRootLayout.findViewById(R.id.action_fragment_root);
                float f4 = typedValue2.getFloat();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams2.weight = f4;
                findViewById.setLayoutParams(layoutParams2);
            }
        }
        View inflate2 = cloneInContext.inflate(R.layout.lb_guidedstep_background, (ViewGroup) guidedStepRootLayout, false);
        if (inflate2 != null) {
            ((FrameLayout) guidedStepRootLayout.findViewById(R.id.guidedstep_background_view_root)).addView(inflate2, 0);
        }
        return guidedStepRootLayout;
    }

    @Override // W1.C
    public final void V() {
        O0 o02 = this.f1210n0;
        o02.f924c = null;
        o02.f923b = null;
        o02.f925d = null;
        o02.f922a = null;
        o02.f926e = null;
        C0084f1 c0084f1 = this.f1211o0;
        c0084f1.f1153r = null;
        c0084f1.f1154s = null;
        c0084f1.f1140b = null;
        c0084f1.f1141c = null;
        c0084f1.f1142d = null;
        c0084f1.f1143e = null;
        c0084f1.f1139a = null;
        C0084f1 c0084f12 = this.f1212p0;
        c0084f12.f1153r = null;
        c0084f12.f1154s = null;
        c0084f12.f1140b = null;
        c0084f12.f1141c = null;
        c0084f12.f1142d = null;
        c0084f12.f1143e = null;
        c0084f12.f1139a = null;
        this.f1213q0 = null;
        this.f1214r0 = null;
        this.f1215s0 = null;
        this.f1216t0 = null;
        this.f10275S = true;
    }

    @Override // W1.C
    public final void Z() {
        this.f10275S = true;
        this.f10277U.findViewById(R.id.action_fragment).requestFocus();
    }

    @Override // W1.C
    public final void a0(Bundle bundle) {
        ArrayList arrayList = this.f1217u0;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            p0((P0) arrayList.get(i7));
        }
        ArrayList arrayList2 = this.f1218v0;
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            p0((P0) arrayList2.get(i10));
        }
    }

    public void q0(ArrayList arrayList) {
    }

    public q3.n r0() {
        String str = "";
        return new q3.n(1, str, str, str, null);
    }

    public void s0(P0 p02) {
    }

    public final void t0() {
        Bundle bundle = this.f10300u;
        int i7 = bundle == null ? 1 : bundle.getInt("uiStyle", 1);
        if (i7 == 0) {
            FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(8388613);
            fadeAndShortSlide.excludeTarget(R.id.guidedstep_background, true);
            fadeAndShortSlide.excludeTarget(R.id.guidedactions_sub_list_background, true);
            z().f10583i = fadeAndShortSlide;
            Fade fade = new Fade(3);
            fade.addTarget(R.id.guidedactions_sub_list_background);
            androidx.leanback.transition.a aVar = new androidx.leanback.transition.a();
            aVar.setReparent(false);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(fade);
            transitionSet.addTransition(aVar);
            z().f10585m = transitionSet;
        } else if (i7 == 1) {
            Fade fade2 = new Fade(3);
            fade2.addTarget(R.id.guidedstep_background);
            FadeAndShortSlide fadeAndShortSlide2 = new FadeAndShortSlide(8388615);
            fadeAndShortSlide2.addTarget(R.id.content_fragment);
            fadeAndShortSlide2.addTarget(R.id.action_fragment_root);
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.setOrdering(0);
            transitionSet2.addTransition(fade2);
            transitionSet2.addTransition(fadeAndShortSlide2);
            z().f10583i = transitionSet2;
            z().f10585m = null;
        } else if (i7 == 2) {
            z().f10583i = null;
            z().f10585m = null;
        }
        FadeAndShortSlide fadeAndShortSlide3 = new FadeAndShortSlide(8388611);
        fadeAndShortSlide3.excludeTarget(R.id.guidedstep_background, true);
        fadeAndShortSlide3.excludeTarget(R.id.guidedactions_sub_list_background, true);
        z().k = fadeAndShortSlide3;
    }
}
