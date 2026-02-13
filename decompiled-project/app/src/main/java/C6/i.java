package C6;

import A9.C0076d1;
import A9.P2;
import A9.R2;
import A9.S2;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import java.util.WeakHashMap;
import y1.K;

/* loaded from: classes.dex */
public final class i extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f2933e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2934f;
    public final TimeInterpolator g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f2935h;

    /* renamed from: i, reason: collision with root package name */
    public final Aa.q f2936i;
    public final R2 j;
    public final A1.d k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2937l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2938m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2939n;

    /* renamed from: o, reason: collision with root package name */
    public long f2940o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f2941p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f2942q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f2943r;

    public i(m mVar) {
        super(mVar);
        this.f2936i = new Aa.q(this, 3);
        this.j = new R2(this, 4);
        this.k = new A1.d(this, 7);
        this.f2940o = Long.MAX_VALUE;
        this.f2934f = Tb.a.D(mVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f2933e = Tb.a.D(mVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = Tb.a.E(mVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1053a.f16531a);
    }

    @Override // C6.n
    public final void a() {
        if (this.f2941p.isTouchExplorationEnabled() && Q5.e.C(this.f2935h) && !this.f2975d.hasFocus()) {
            this.f2935h.dismissDropDown();
        }
        this.f2935h.post(new S2(this, 7));
    }

    @Override // C6.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // C6.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // C6.n
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // C6.n
    public final View.OnClickListener f() {
        return this.f2936i;
    }

    @Override // C6.n
    public final A1.d h() {
        return this.k;
    }

    @Override // C6.n
    public final boolean i(int i7) {
        return i7 != 0;
    }

    @Override // C6.n
    public final boolean j() {
        return this.f2937l;
    }

    @Override // C6.n
    public final boolean l() {
        return this.f2939n;
    }

    @Override // C6.n
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f2935h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: C6.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                i iVar = i.this;
                iVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - iVar.f2940o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        iVar.f2938m = false;
                    }
                    iVar.u();
                    iVar.f2938m = true;
                    iVar.f2940o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f2935h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: C6.h
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                i iVar = i.this;
                iVar.f2938m = true;
                iVar.f2940o = System.currentTimeMillis();
                iVar.t(false);
            }
        });
        this.f2935h.setThreshold(0);
        TextInputLayout textInputLayout = this.f2972a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!Q5.e.C(editText) && this.f2941p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = K.f26642a;
            this.f2975d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // C6.n
    public final void n(z1.e eVar) {
        if (!Q5.e.C(this.f2935h)) {
            eVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? eVar.f28173a.isShowingHintText() : eVar.e(4)) {
            eVar.l(null);
        }
    }

    @Override // C6.n
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.f2941p.isEnabled() || Q5.e.C(this.f2935h)) {
            return;
        }
        boolean z8 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f2939n && !this.f2935h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z8) {
            u();
            this.f2938m = true;
            this.f2940o = System.currentTimeMillis();
        }
    }

    @Override // C6.n
    public final void r() {
        int i7 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f2934f);
        ofFloat.addUpdateListener(new P2(this, i7));
        this.f2943r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f2933e);
        ofFloat2.addUpdateListener(new P2(this, i7));
        this.f2942q = ofFloat2;
        ofFloat2.addListener(new C0076d1(this, 1));
        this.f2941p = (AccessibilityManager) this.f2974c.getSystemService("accessibility");
    }

    @Override // C6.n
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f2935h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f2935h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z8) {
        if (this.f2939n != z8) {
            this.f2939n = z8;
            this.f2943r.cancel();
            this.f2942q.start();
        }
    }

    public final void u() {
        if (this.f2935h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f2940o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f2938m = false;
        }
        if (this.f2938m) {
            this.f2938m = false;
            return;
        }
        t(!this.f2939n);
        if (!this.f2939n) {
            this.f2935h.dismissDropDown();
        } else {
            this.f2935h.requestFocus();
            this.f2935h.showDropDown();
        }
    }
}
