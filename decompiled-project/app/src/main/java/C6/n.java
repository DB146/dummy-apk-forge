package C6;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2972a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2973b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2974c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f2975d;

    public n(m mVar) {
        this.f2972a = mVar.f2960a;
        this.f2973b = mVar;
        this.f2974c = mVar.getContext();
        this.f2975d = mVar.f2966u;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public A1.d h() {
        return null;
    }

    public boolean i(int i7) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof i;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(z1.e eVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z8) {
    }

    public final void q() {
        this.f2973b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
