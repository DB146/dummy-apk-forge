package com.google.android.material.datepicker;

import W1.DialogInterfaceOnCancelListenerC0577u;
import Y5.B;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import c6.AbstractC0911a;
import com.google.android.material.internal.CheckableImageButton;
import com.kt.apps.media.xemtv.beta.R;
import h3.H;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o6.ViewOnTouchListenerC1809a;
import q1.AbstractC1875a;
import y1.AbstractC2352B;
import y1.K;
import y1.q0;
import y1.t0;
import y6.C2401g;

/* loaded from: classes.dex */
public final class n<S> extends DialogInterfaceOnCancelListenerC0577u {
    public final LinkedHashSet C0;

    /* renamed from: D0, reason: collision with root package name */
    public final LinkedHashSet f15335D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f15336E0;

    /* renamed from: F0, reason: collision with root package name */
    public u f15337F0;

    /* renamed from: G0, reason: collision with root package name */
    public b f15338G0;

    /* renamed from: H0, reason: collision with root package name */
    public l f15339H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f15340I0;

    /* renamed from: J0, reason: collision with root package name */
    public CharSequence f15341J0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f15342K0;

    /* renamed from: L0, reason: collision with root package name */
    public int f15343L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f15344M0;

    /* renamed from: N0, reason: collision with root package name */
    public CharSequence f15345N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f15346O0;

    /* renamed from: P0, reason: collision with root package name */
    public CharSequence f15347P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f15348Q0;

    /* renamed from: R0, reason: collision with root package name */
    public CharSequence f15349R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f15350S0;

    /* renamed from: T0, reason: collision with root package name */
    public CharSequence f15351T0;

    /* renamed from: U0, reason: collision with root package name */
    public TextView f15352U0;

    /* renamed from: V0, reason: collision with root package name */
    public CheckableImageButton f15353V0;

    /* renamed from: W0, reason: collision with root package name */
    public C2401g f15354W0;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f15355X0;

    /* renamed from: Y0, reason: collision with root package name */
    public CharSequence f15356Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public CharSequence f15357Z0;

    public n() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.C0 = new LinkedHashSet();
        this.f15335D0 = new LinkedHashSet();
    }

    public static int v0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b2 = x.b();
        b2.set(5, 1);
        Calendar a9 = x.a(b2);
        a9.get(2);
        a9.get(1);
        int maximum = a9.getMaximum(7);
        a9.getActualMaximum(5);
        a9.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean w0(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Q5.e.P(R.attr.materialCalendarStyle, context, l.class.getCanonicalName()).data, new int[]{i7});
        boolean z8 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z8;
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public final void S(Bundle bundle) {
        super.S(bundle);
        if (bundle == null) {
            bundle = this.f10300u;
        }
        this.f15336E0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f15338G0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f15340I0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f15341J0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f15343L0 = bundle.getInt("INPUT_MODE_KEY");
        this.f15344M0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f15345N0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f15346O0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f15347P0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f15348Q0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f15349R0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f15350S0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f15351T0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f15341J0;
        if (charSequence == null) {
            charSequence = i0().getResources().getText(this.f15340I0);
        }
        this.f15356Y0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f15357Z0 = charSequence;
    }

    @Override // W1.C
    public final View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f15342K0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f15342K0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(v0(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(v0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = K.f26642a;
        textView.setAccessibilityLiveRegion(1);
        this.f15353V0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f15352U0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f15353V0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f15353V0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, Q5.e.x(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], Q5.e.x(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f15353V0.setChecked(this.f15343L0 != 0);
        K.n(this.f15353V0, null);
        CheckableImageButton checkableImageButton2 = this.f15353V0;
        this.f15353V0.setContentDescription(this.f15343L0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f15353V0.setOnClickListener(new Aa.q(this, 6));
        u0();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public final void a0(Bundle bundle) {
        super.a0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f15336E0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f15338G0;
        ?? obj = new Object();
        int i7 = a.f15292b;
        int i10 = a.f15292b;
        long j = bVar.f15294a.f15365f;
        long j10 = bVar.f15295b.f15365f;
        obj.f15293a = Long.valueOf(bVar.f15297d.f15365f);
        l lVar = this.f15339H0;
        p pVar = lVar == null ? null : lVar.f15323p0;
        if (pVar != null) {
            obj.f15293a = Long.valueOf(pVar.f15365f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f15296c);
        p b2 = p.b(j);
        p b10 = p.b(j10);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = obj.f15293a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b10, dVar, l10 == null ? null : p.b(l10.longValue()), bVar.f15298e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f15340I0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f15341J0);
        bundle.putInt("INPUT_MODE_KEY", this.f15343L0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f15344M0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f15345N0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f15346O0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f15347P0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f15348Q0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f15349R0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f15350S0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f15351T0);
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public final void b0() {
        super.b0();
        Dialog dialog = this.f10565x0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f15342K0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f15354W0);
            if (!this.f15355X0) {
                View findViewById = j0().findViewById(R.id.fullscreen_header);
                ColorStateList u3 = H.u(findViewById.getBackground());
                Integer valueOf = u3 != null ? Integer.valueOf(u3.getDefaultColor()) : null;
                int i7 = Build.VERSION.SDK_INT;
                boolean z8 = false;
                boolean z10 = valueOf == null || valueOf.intValue() == 0;
                int o10 = q3.f.o(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z10) {
                    valueOf = Integer.valueOf(o10);
                }
                c2.q.z(window, false);
                window.getContext();
                int h10 = i7 < 27 ? AbstractC1875a.h(q3.f.o(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(h10);
                boolean z11 = q3.f.s(0) || q3.f.s(valueOf.intValue());
                B b2 = new B(window.getDecorView());
                (i7 >= 35 ? new t0(window, b2) : i7 >= 30 ? new t0(window, b2) : i7 >= 26 ? new q0(window, b2) : new q0(window, b2)).B(z11);
                boolean s3 = q3.f.s(o10);
                if (q3.f.s(h10) || (h10 == 0 && s3)) {
                    z8 = true;
                }
                B b10 = new B(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                (i10 >= 35 ? new t0(window, b10) : i10 >= 30 ? new t0(window, b10) : i10 >= 26 ? new q0(window, b10) : new q0(window, b10)).A(z8);
                m mVar = new m(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = K.f26642a;
                AbstractC2352B.l(findViewById, mVar);
                this.f15355X0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = F().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f15354W0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f10565x0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC1809a(dialog2, rect));
        }
        i0();
        int i11 = this.f15336E0;
        if (i11 == 0) {
            u0();
            throw null;
        }
        u0();
        b bVar = this.f15338G0;
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i11);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f15297d);
        lVar.l0(bundle);
        this.f15339H0 = lVar;
        u uVar = lVar;
        if (this.f15343L0 == 1) {
            u0();
            b bVar2 = this.f15338G0;
            u oVar = new o();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i11);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            oVar.l0(bundle2);
            uVar = oVar;
        }
        this.f15337F0 = uVar;
        this.f15352U0.setText((this.f15343L0 == 1 && F().getConfiguration().orientation == 2) ? this.f15357Z0 : this.f15356Y0);
        u0();
        throw null;
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u, W1.C
    public final void c0() {
        this.f15337F0.f15379m0.clear();
        super.c0();
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f15335D0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f10277U;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // W1.DialogInterfaceOnCancelListenerC0577u
    public final Dialog q0() {
        Context i02 = i0();
        i0();
        int i7 = this.f15336E0;
        if (i7 == 0) {
            u0();
            throw null;
        }
        Dialog dialog = new Dialog(i02, i7);
        Context context = dialog.getContext();
        this.f15342K0 = w0(context, android.R.attr.windowFullscreen);
        this.f15354W0 = new C2401g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0911a.f14413o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f15354W0.i(context);
        this.f15354W0.k(ColorStateList.valueOf(color));
        C2401g c2401g = this.f15354W0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = K.f26642a;
        c2401g.j(AbstractC2352B.e(decorView));
        return dialog;
    }

    public final void u0() {
        if (this.f10300u.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }
}
