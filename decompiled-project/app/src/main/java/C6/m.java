package C6;

import B0.G;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l2.X;
import y1.K;
import z1.AccessibilityManagerTouchExplorationStateChangeListenerC2584b;

/* loaded from: classes.dex */
public final class m extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public int f2950A;

    /* renamed from: B, reason: collision with root package name */
    public ImageView.ScaleType f2951B;

    /* renamed from: C, reason: collision with root package name */
    public View.OnLongClickListener f2952C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f2953D;

    /* renamed from: E, reason: collision with root package name */
    public final AppCompatTextView f2954E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2955F;

    /* renamed from: G, reason: collision with root package name */
    public EditText f2956G;

    /* renamed from: H, reason: collision with root package name */
    public final AccessibilityManager f2957H;

    /* renamed from: I, reason: collision with root package name */
    public A1.d f2958I;

    /* renamed from: J, reason: collision with root package name */
    public final j f2959J;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2960a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f2961b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f2962c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f2963d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f2964e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f2965f;

    /* renamed from: u, reason: collision with root package name */
    public final CheckableImageButton f2966u;

    /* renamed from: v, reason: collision with root package name */
    public final l f2967v;

    /* renamed from: w, reason: collision with root package name */
    public int f2968w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f2969x;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2970y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuff.Mode f2971z;

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, C6.l] */
    public m(TextInputLayout textInputLayout, X x2) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f2968w = 0;
        this.f2969x = new LinkedHashSet();
        this.f2959J = new j(this);
        k kVar = new k(this);
        this.f2957H = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f2960a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2961b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a9 = a(this, from, R.id.text_input_error_icon);
        this.f2962c = a9;
        CheckableImageButton a10 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f2966u = a10;
        ?? obj = new Object();
        obj.f2948c = new SparseArray();
        obj.f2949d = this;
        TypedArray typedArray = (TypedArray) x2.f19195c;
        obj.f2946a = typedArray.getResourceId(28, 0);
        obj.f2947b = typedArray.getResourceId(52, 0);
        this.f2967v = obj;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f2954E = appCompatTextView;
        TypedArray typedArray2 = (TypedArray) x2.f19195c;
        if (typedArray2.hasValue(38)) {
            this.f2963d = Tb.a.o(getContext(), x2, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f2964e = s6.o.h(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(x2.n(37));
        }
        a9.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = K.f26642a;
        a9.setImportantForAccessibility(2);
        a9.setClickable(false);
        a9.setPressable(false);
        a9.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f2970y = Tb.a.o(getContext(), x2, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f2971z = s6.o.h(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && a10.getContentDescription() != (text = typedArray2.getText(27))) {
                a10.setContentDescription(text);
            }
            a10.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f2970y = Tb.a.o(getContext(), x2, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f2971z = s6.o.h(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (a10.getContentDescription() != text2) {
                a10.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2950A) {
            this.f2950A = dimensionPixelSize;
            a10.setMinimumWidth(dimensionPixelSize);
            a10.setMinimumHeight(dimensionPixelSize);
            a9.setMinimumWidth(dimensionPixelSize);
            a9.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType h10 = Tb.a.h(typedArray2.getInt(31, -1));
            this.f2951B = h10;
            a10.setScaleType(h10);
            a9.setScaleType(h10);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            appCompatTextView.setTextColor(x2.m(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f2953D = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(a10);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(a9);
        textInputLayout.f15506s0.add(kVar);
        if (textInputLayout.f15488d != null) {
            kVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new G(this, 3));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i7) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i7);
        if (Tb.a.t(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final n b() {
        n dVar;
        int i7 = this.f2968w;
        l lVar = this.f2967v;
        SparseArray sparseArray = (SparseArray) lVar.f2948c;
        n nVar = (n) sparseArray.get(i7);
        if (nVar == null) {
            m mVar = (m) lVar.f2949d;
            if (i7 == -1) {
                dVar = new d(mVar, 0);
            } else if (i7 == 0) {
                dVar = new d(mVar, 1);
            } else if (i7 == 1) {
                nVar = new t(mVar, lVar.f2947b);
                sparseArray.append(i7, nVar);
            } else if (i7 == 2) {
                dVar = new c(mVar);
            } else {
                if (i7 != 3) {
                    throw new IllegalArgumentException(h3.o.l(i7, "Invalid end icon mode: "));
                }
                dVar = new i(mVar);
            }
            nVar = dVar;
            sparseArray.append(i7, nVar);
        }
        return nVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f2966u;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = K.f26642a;
        return this.f2954E.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f2961b.getVisibility() == 0 && this.f2966u.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f2962c.getVisibility() == 0;
    }

    public final void f(boolean z8) {
        boolean z10;
        boolean isActivated;
        boolean z11;
        n b2 = b();
        boolean k = b2.k();
        CheckableImageButton checkableImageButton = this.f2966u;
        boolean z12 = true;
        if (!k || (z11 = checkableImageButton.f15403d) == b2.l()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(b2 instanceof i) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z8 || z12) {
            Tb.a.B(this.f2960a, checkableImageButton, this.f2970y);
        }
    }

    public final void g(int i7) {
        if (this.f2968w == i7) {
            return;
        }
        n b2 = b();
        A1.d dVar = this.f2958I;
        AccessibilityManager accessibilityManager = this.f2957H;
        if (dVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2584b(dVar));
        }
        this.f2958I = null;
        b2.s();
        this.f2968w = i7;
        Iterator it = this.f2969x.iterator();
        if (it.hasNext()) {
            throw h3.o.j(it);
        }
        h(i7 != 0);
        n b10 = b();
        int i10 = this.f2967v.f2946a;
        if (i10 == 0) {
            i10 = b10.d();
        }
        Drawable x2 = i10 != 0 ? Q5.e.x(getContext(), i10) : null;
        CheckableImageButton checkableImageButton = this.f2966u;
        checkableImageButton.setImageDrawable(x2);
        TextInputLayout textInputLayout = this.f2960a;
        if (x2 != null) {
            Tb.a.b(textInputLayout, checkableImageButton, this.f2970y, this.f2971z);
            Tb.a.B(textInputLayout, checkableImageButton, this.f2970y);
        }
        int c10 = b10.c();
        CharSequence text = c10 != 0 ? getResources().getText(c10) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b10.k());
        if (!b10.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i7);
        }
        b10.r();
        A1.d h10 = b10.h();
        this.f2958I = h10;
        if (h10 != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = K.f26642a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2584b(this.f2958I));
            }
        }
        View.OnClickListener f4 = b10.f();
        View.OnLongClickListener onLongClickListener = this.f2952C;
        checkableImageButton.setOnClickListener(f4);
        Tb.a.J(checkableImageButton, onLongClickListener);
        EditText editText = this.f2956G;
        if (editText != null) {
            b10.m(editText);
            j(b10);
        }
        Tb.a.b(textInputLayout, checkableImageButton, this.f2970y, this.f2971z);
        f(true);
    }

    public final void h(boolean z8) {
        if (d() != z8) {
            this.f2966u.setVisibility(z8 ? 0 : 8);
            k();
            m();
            this.f2960a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2962c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        Tb.a.b(this.f2960a, checkableImageButton, this.f2963d, this.f2964e);
    }

    public final void j(n nVar) {
        if (this.f2956G == null) {
            return;
        }
        if (nVar.e() != null) {
            this.f2956G.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.f2966u.setOnFocusChangeListener(nVar.g());
        }
    }

    public final void k() {
        this.f2961b.setVisibility((this.f2966u.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f2953D == null || this.f2955F) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f2962c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f2960a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f15514x.f2996q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f2968w != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i7;
        TextInputLayout textInputLayout = this.f2960a;
        if (textInputLayout.f15488d == null) {
            return;
        }
        if (d() || e()) {
            i7 = 0;
        } else {
            EditText editText = textInputLayout.f15488d;
            WeakHashMap weakHashMap = K.f26642a;
            i7 = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f15488d.getPaddingTop();
        int paddingBottom = textInputLayout.f15488d.getPaddingBottom();
        WeakHashMap weakHashMap2 = K.f26642a;
        this.f2954E.setPaddingRelative(dimensionPixelSize, paddingTop, i7, paddingBottom);
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.f2954E;
        int visibility = appCompatTextView.getVisibility();
        int i7 = (this.f2953D == null || this.f2955F) ? 8 : 0;
        if (visibility != i7) {
            b().p(i7 == 0);
        }
        k();
        appCompatTextView.setVisibility(i7);
        this.f2960a.q();
    }
}
