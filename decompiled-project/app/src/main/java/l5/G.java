package l5;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Iterator;
import k6.ViewOnLayoutChangeListenerC1430a;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: A, reason: collision with root package name */
    public boolean f19340A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f19341B;

    /* renamed from: a, reason: collision with root package name */
    public final B f19343a;

    /* renamed from: b, reason: collision with root package name */
    public final View f19344b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f19345c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f19346d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f19347e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f19348f;
    public final ViewGroup g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f19349h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f19350i;
    public final View j;
    public final View k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f19351l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f19352m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f19353n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f19354o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f19355p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f19356q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f19357r;

    /* renamed from: s, reason: collision with root package name */
    public final C f19358s = new C(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final C f19359t = new C(this, 3);

    /* renamed from: u, reason: collision with root package name */
    public final C f19360u = new C(this, 4);

    /* renamed from: v, reason: collision with root package name */
    public final C f19361v = new C(this, 5);

    /* renamed from: w, reason: collision with root package name */
    public final C f19362w = new C(this, 6);

    /* renamed from: x, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC1430a f19363x = new ViewOnLayoutChangeListenerC1430a(this, 2);

    /* renamed from: C, reason: collision with root package name */
    public boolean f19342C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f19365z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f19364y = new ArrayList();

    public G(B b2) {
        this.f19343a = b2;
        final int i7 = 0;
        final int i10 = 3;
        final int i11 = 2;
        final int i12 = 1;
        this.f19344b = b2.findViewById(R.id.exo_controls_background);
        this.f19345c = (ViewGroup) b2.findViewById(R.id.exo_center_controls);
        this.f19347e = (ViewGroup) b2.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) b2.findViewById(R.id.exo_bottom_bar);
        this.f19346d = viewGroup;
        this.f19350i = (ViewGroup) b2.findViewById(R.id.exo_time);
        View findViewById = b2.findViewById(R.id.exo_progress);
        this.j = findViewById;
        this.f19348f = (ViewGroup) b2.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) b2.findViewById(R.id.exo_extra_controls);
        this.f19349h = (ViewGroup) b2.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = b2.findViewById(R.id.exo_overflow_show);
        this.k = findViewById2;
        View findViewById3 = b2.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new Aa.q(this, 11));
            findViewById3.setOnClickListener(new Aa.q(this, 11));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l5.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ G f19334b;

            {
                this.f19334b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        G g = this.f19334b;
                        g.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = g.f19344b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = g.f19345c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = g.f19347e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        G g2 = this.f19334b;
                        g2.getClass();
                        g2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        G g10 = this.f19334b;
                        g10.getClass();
                        g10.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        G g11 = this.f19334b;
                        g11.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = g11.f19344b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = g11.f19345c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = g11.f19347e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat.addListener(new E(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l5.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ G f19334b;

            {
                this.f19334b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i7) {
                    case 0:
                        G g = this.f19334b;
                        g.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = g.f19344b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = g.f19345c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = g.f19347e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        G g2 = this.f19334b;
                        g2.getClass();
                        g2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        G g10 = this.f19334b;
                        g10.getClass();
                        g10.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        G g11 = this.f19334b;
                        g11.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = g11.f19344b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = g11.f19345c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = g11.f19347e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat2.addListener(new E(this, 1));
        Resources resources = b2.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f19351l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new F(this, b2, i7));
        animatorSet.play(ofFloat).with(d(findViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f19352m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new F(this, b2, i12));
        animatorSet2.play(d(findViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f19353n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new F(this, b2, i11));
        animatorSet3.play(ofFloat).with(d(findViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f19354o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new E(this, 2));
        animatorSet4.play(ofFloat2).with(d(findViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f19355p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new E(this, 3));
        animatorSet5.play(ofFloat2).with(d(findViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19356q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l5.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ G f19334b;

            {
                this.f19334b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        G g = this.f19334b;
                        g.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = g.f19344b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = g.f19345c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = g.f19347e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        G g2 = this.f19334b;
                        g2.getClass();
                        g2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        G g10 = this.f19334b;
                        g10.getClass();
                        g10.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        G g11 = this.f19334b;
                        g11.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = g11.f19344b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = g11.f19345c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = g11.f19347e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat3.addListener(new E(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f19357r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: l5.D

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ G f19334b;

            {
                this.f19334b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        G g = this.f19334b;
                        g.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = g.f19344b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = g.f19345c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = g.f19347e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        G g2 = this.f19334b;
                        g2.getClass();
                        g2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        G g10 = this.f19334b;
                        g10.getClass();
                        g10.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        G g11 = this.f19334b;
                        g11.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = g11.f19344b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = g11.f19345c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = g11.f19347e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat4.addListener(new E(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static ObjectAnimator d(View view, float f4, float f10) {
        return ObjectAnimator.ofFloat(view, "translationY", f4, f10);
    }

    public static boolean j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f4) {
        ViewGroup viewGroup = this.f19349h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f4) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f19350i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f4);
        }
        ViewGroup viewGroup3 = this.f19348f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f4);
        }
    }

    public final boolean b(View view) {
        return view != null && this.f19364y.contains(view);
    }

    public final void e(Runnable runnable, long j) {
        if (j >= 0) {
            this.f19343a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        C c10 = this.f19362w;
        B b2 = this.f19343a;
        b2.removeCallbacks(c10);
        b2.removeCallbacks(this.f19359t);
        b2.removeCallbacks(this.f19361v);
        b2.removeCallbacks(this.f19360u);
    }

    public final void g() {
        if (this.f19365z == 3) {
            return;
        }
        f();
        int showTimeoutMs = this.f19343a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f19342C) {
                e(this.f19362w, showTimeoutMs);
            } else if (this.f19365z == 1) {
                e(this.f19360u, 2000L);
            } else {
                e(this.f19361v, showTimeoutMs);
            }
        }
    }

    public final void h(View view, boolean z8) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f19364y;
        if (!z8) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f19340A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i7) {
        int i10 = this.f19365z;
        this.f19365z = i7;
        B b2 = this.f19343a;
        if (i7 == 2) {
            b2.setVisibility(8);
        } else if (i10 == 2) {
            b2.setVisibility(0);
        }
        if (i10 != i7) {
            Iterator it = b2.f19299d.iterator();
            while (it.hasNext()) {
                InterfaceC1486A interfaceC1486A = (InterfaceC1486A) it.next();
                b2.getVisibility();
                H h10 = (H) interfaceC1486A;
                h10.getClass();
                h10.f19368c.j();
            }
        }
    }

    public final void k() {
        if (!this.f19342C) {
            i(0);
            g();
            return;
        }
        int i7 = this.f19365z;
        if (i7 == 1) {
            this.f19354o.start();
        } else if (i7 == 2) {
            this.f19355p.start();
        } else if (i7 == 3) {
            this.f19341B = true;
        } else if (i7 == 4) {
            return;
        }
        g();
    }
}
