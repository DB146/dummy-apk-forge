package C6;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class t extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f3019e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f3020f;
    public final Aa.q g;

    public t(m mVar, int i7) {
        super(mVar);
        this.f3019e = R.drawable.design_password_eye;
        this.g = new Aa.q(this, 4);
        if (i7 != 0) {
            this.f3019e = i7;
        }
    }

    @Override // C6.n
    public final void b() {
        q();
    }

    @Override // C6.n
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // C6.n
    public final int d() {
        return this.f3019e;
    }

    @Override // C6.n
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // C6.n
    public final boolean k() {
        return true;
    }

    @Override // C6.n
    public final boolean l() {
        EditText editText = this.f3020f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // C6.n
    public final void m(EditText editText) {
        this.f3020f = editText;
        q();
    }

    @Override // C6.n
    public final void r() {
        EditText editText = this.f3020f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3020f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // C6.n
    public final void s() {
        EditText editText = this.f3020f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
