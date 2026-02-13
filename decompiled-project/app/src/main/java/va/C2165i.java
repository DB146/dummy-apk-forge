package va;

import A9.O0;
import A9.O2;
import A9.Q2;
import W1.C0575s;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kt.apps.core.base.leanback.BrowseFrameLayout;
import com.kt.apps.core.base.receiver.NetworkChangeReceiver;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1111f;
import java.lang.ref.WeakReference;
import r7.C1947c;
import x9.AbstractC2271a;
import y7.u0;

/* renamed from: va.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2165i extends G {

    /* renamed from: Q0, reason: collision with root package name */
    public final O0 f25332Q0 = vc.i.o(this, kotlin.jvm.internal.w.a(C2161e.class), new C2164h(this, 0), new C2164h(this, 1), new C2164h(this, 2));

    @Override // y9.AbstractC2457B
    public final void C0(final View rootView) {
        kotlin.jvm.internal.l.e(rootView, "rootView");
        TextInputEditText textInputEditText = (TextInputEditText) rootView.findViewById(R.id.textInputEditText_2);
        kotlin.jvm.internal.l.b(textInputEditText);
        textInputEditText.addTextChangedListener(new C2163g(rootView));
        final int i7 = 0;
        textInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: va.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2165i f25327b;

            {
                this.f25327b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                switch (i7) {
                    case 0:
                        C2165i c2165i = this.f25327b;
                        if (i10 == 5) {
                            InputMethodManager inputMethodManager = (InputMethodManager) c2165i.i0().getSystemService(InputMethodManager.class);
                            kotlin.jvm.internal.l.d(inputMethodManager, "getInputMethodManager(...)");
                            if (inputMethodManager.isActive(textView)) {
                                inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                            }
                            ((TextInputEditText) rootView.findViewById(R.id.textInputEditText)).requestFocus();
                            return true;
                        }
                        if (i10 != 6) {
                            return true;
                        }
                        InputMethodManager inputMethodManager2 = (InputMethodManager) c2165i.i0().getSystemService(InputMethodManager.class);
                        kotlin.jvm.internal.l.d(inputMethodManager2, "getInputMethodManager(...)");
                        if (inputMethodManager2.isActive(textView)) {
                            inputMethodManager2.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                        }
                        c2165i.F0();
                        return true;
                    default:
                        if (i10 != 5 && i10 != 6) {
                            return true;
                        }
                        InputMethodManager inputMethodManager3 = (InputMethodManager) this.f25327b.i0().getSystemService(InputMethodManager.class);
                        kotlin.jvm.internal.l.d(inputMethodManager3, "getInputMethodManager(...)");
                        if (inputMethodManager3.isActive(textView)) {
                            inputMethodManager3.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                        }
                        ChipGroup chipGroup = (ChipGroup) rootView.findViewById(R.id.type_group);
                        if (chipGroup == null) {
                            return true;
                        }
                        chipGroup.requestFocus();
                        return true;
                }
            }
        });
        final int i10 = 1;
        ((TextInputEditText) rootView.findViewById(R.id.textInputEditText)).setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: va.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C2165i f25327b;

            {
                this.f25327b = this;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i102, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        C2165i c2165i = this.f25327b;
                        if (i102 == 5) {
                            InputMethodManager inputMethodManager = (InputMethodManager) c2165i.i0().getSystemService(InputMethodManager.class);
                            kotlin.jvm.internal.l.d(inputMethodManager, "getInputMethodManager(...)");
                            if (inputMethodManager.isActive(textView)) {
                                inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                            }
                            ((TextInputEditText) rootView.findViewById(R.id.textInputEditText)).requestFocus();
                            return true;
                        }
                        if (i102 != 6) {
                            return true;
                        }
                        InputMethodManager inputMethodManager2 = (InputMethodManager) c2165i.i0().getSystemService(InputMethodManager.class);
                        kotlin.jvm.internal.l.d(inputMethodManager2, "getInputMethodManager(...)");
                        if (inputMethodManager2.isActive(textView)) {
                            inputMethodManager2.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                        }
                        c2165i.F0();
                        return true;
                    default:
                        if (i102 != 5 && i102 != 6) {
                            return true;
                        }
                        InputMethodManager inputMethodManager3 = (InputMethodManager) this.f25327b.i0().getSystemService(InputMethodManager.class);
                        kotlin.jvm.internal.l.d(inputMethodManager3, "getInputMethodManager(...)");
                        if (inputMethodManager3.isActive(textView)) {
                            inputMethodManager3.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                        }
                        ChipGroup chipGroup = (ChipGroup) rootView.findViewById(R.id.type_group);
                        if (chipGroup == null) {
                            return true;
                        }
                        chipGroup.requestFocus();
                        return true;
                }
            }
        });
        View findViewById = rootView.findViewById(R.id.btn_save);
        kotlin.jvm.internal.l.b(findViewById);
        findViewById.setOnClickListener(new Aa.q(this, 12));
    }

    @Override // y9.AbstractC2457B
    public final void D0(View view) {
        BrowseFrameLayout browseFrameLayout = (BrowseFrameLayout) view;
        browseFrameLayout.setOnFocusSearchListener(new C1947c(this, 12));
        browseFrameLayout.setOnDispatchKeyListener(new O2(this, 2));
    }

    public final void F0() {
        TextInputLayout textInputLayout;
        TextInputEditText textInputEditText;
        Editable text;
        ChipGroup chipGroup;
        TextInputLayout textInputLayout2;
        int i7 = 1;
        View view = this.f10277U;
        TextInputEditText textInputEditText2 = view != null ? (TextInputEditText) view.findViewById(R.id.textInputEditText_2) : null;
        Editable text2 = textInputEditText2 != null ? textInputEditText2.getText() : null;
        if (text2 == null || ac.g.h0(text2)) {
            ActivityUtilsKt.showErrorDialog$default(this, null, "Đường dẫn không được bỏ trống", null, null, null, false, false, null, null, 509, null);
            return;
        }
        View view2 = this.f10277U;
        CharSequence prefixText = (view2 == null || (textInputLayout2 = (TextInputLayout) view2.findViewById(R.id.textInputLayout_2)) == null) ? null : textInputLayout2.getPrefixText();
        Editable text3 = textInputEditText2 != null ? textInputEditText2.getText() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) prefixText);
        sb2.append((Object) text3);
        String sb3 = sb2.toString();
        if (!((ac.e) AbstractC2271a.f26276c.getValue()).d(sb3)) {
            ActivityUtilsKt.showErrorDialog$default(this, null, "Đường dẫn không hợp lệ! Vui lòng kiểm tra lại", "Lỗi", null, null, false, false, null, null, 505, null);
            return;
        }
        View view3 = this.f10277U;
        Integer valueOf = (view3 == null || (chipGroup = (ChipGroup) view3.findViewById(R.id.type_group)) == null) ? null : Integer.valueOf(chipGroup.getCheckedChipId());
        M9.c cVar = (valueOf != null && valueOf.intValue() == R.id.type_football) ? M9.c.f6847b : (valueOf != null && valueOf.intValue() == R.id.type_movie) ? M9.c.f6848c : M9.c.f6846a;
        View view4 = this.f10277U;
        CharSequence v02 = (view4 == null || (textInputEditText = (TextInputEditText) view4.findViewById(R.id.textInputEditText)) == null || (text = textInputEditText.getText()) == null) ? null : ac.g.v0(text);
        if (v02 == null || v02.length() == 0) {
            v02 = null;
        }
        if (v02 == null) {
            View view5 = this.f10277U;
            v02 = (view5 == null || (textInputLayout = (TextInputLayout) view5.findViewById(R.id.textInputLayout)) == null) ? null : textInputLayout.getHint();
        }
        M9.d dVar = new M9.d(String.valueOf(v02), sb3, cVar);
        WeakReference weakReference = NetworkChangeReceiver.f16114b;
        if (!c2.q.n(i0())) {
            ActivityUtilsKt.showErrorDialog$default(this, null, "Vui lòng kết nối internet và thử lại", null, null, null, false, false, null, null, 509, null);
            return;
        }
        C2161e G02 = G0();
        M9.d dVar2 = G02.f25325o;
        if (!sb3.equals(dVar2 != null ? dVar2.f6851b : null) || !(G02.a().d() instanceof y9.E)) {
            G02.a().k(new Object());
            G02.f25325o = dVar;
            M9.t tVar = G02.f25314a;
            tVar.getClass();
            U9.h z8 = tVar.f6916c.z();
            z8.getClass();
            ob.m f4 = android.support.v4.media.session.b.k(z8.f9862a, true, new U9.b(sb3, 1)).f(Ab.e.f1561c);
            M9.h hVar = M9.h.f6866f;
            M9.h hVar2 = M9.h.f6867u;
            q3.s sVar = new q3.s(10, G02, dVar, false);
            nb.e eVar = new nb.e(0, new q3.c(11, G02, dVar, false), new A1.d(G02, dVar));
            try {
                qb.k kVar = new qb.k(eVar, sVar, 1);
                eVar.c(kVar);
                try {
                    try {
                        f4.d(new tb.d(new C1111f(14, kVar, hVar2), hVar, 1));
                        G02.add(eVar);
                    } catch (NullPointerException e2) {
                        throw e2;
                    } catch (Throwable th) {
                        u0.L(th);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                } catch (NullPointerException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    u0.L(th2);
                    NullPointerException nullPointerException2 = new NullPointerException("subscribeActual failed");
                    nullPointerException2.initCause(th2);
                    throw nullPointerException2;
                }
            } catch (NullPointerException e11) {
                throw e11;
            } catch (Throwable th3) {
                u0.L(th3);
                com.bumptech.glide.d.t(th3);
                NullPointerException nullPointerException3 = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException3.initCause(th3);
                throw nullPointerException3;
            }
        }
        G0().a().j(H());
        G0().a().e(H(), new C0575s(i7, this));
    }

    public final C2161e G0() {
        return (C2161e) this.f25332Q0.getValue();
    }

    @Override // y9.AbstractC2457B, A9.A2, W1.C
    public final View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.l.e(inflater, "inflater");
        View inflate = LayoutInflater.from(C()).inflate(R.layout.fragment_add_extensions, viewGroup, false);
        kotlin.jvm.internal.l.b(inflate);
        D0(inflate);
        B0().f1327a = 500L;
        B0().f1329c = (ViewGroup) g0().findViewById(android.R.id.content);
        return inflate;
    }

    @Override // y9.AbstractC2457B, A9.A2, W1.C
    public final void V() {
        G0().f25325o = null;
        super.V();
    }

    @Override // W1.C
    public final void Z() {
        this.f10275S = true;
        View view = this.f10277U;
        if (view != null) {
            view.requestFocus();
        }
    }

    @Override // y9.AbstractC2457B, A9.A2, W1.C
    public final void d0(View view, Bundle bundle) {
        kotlin.jvm.internal.l.e(view, "view");
        C0(view);
        View findViewById = view.findViewById(R.id.textInputEditText);
        kotlin.jvm.internal.l.d(findViewById, "findViewById(...)");
        TextInputEditText textInputEditText = (TextInputEditText) findViewById;
        textInputEditText.setOnFocusChangeListener(new Q2(2, this, textInputEditText.getOnFocusChangeListener()));
        View findViewById2 = view.findViewById(R.id.textInputEditText_2);
        kotlin.jvm.internal.l.d(findViewById2, "findViewById(...)");
        TextInputEditText textInputEditText2 = (TextInputEditText) findViewById2;
        textInputEditText2.setOnFocusChangeListener(new Q2(2, this, textInputEditText2.getOnFocusChangeListener()));
        ((TextInputEditText) view.findViewById(R.id.textInputEditText)).requestFocus();
    }
}
