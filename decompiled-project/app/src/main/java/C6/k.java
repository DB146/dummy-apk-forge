package C6;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f2945a;

    public k(m mVar) {
        this.f2945a = mVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        m mVar = this.f2945a;
        if (mVar.f2956G == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = mVar.f2956G;
        j jVar = mVar.f2959J;
        if (editText != null) {
            editText.removeTextChangedListener(jVar);
            if (mVar.f2956G.getOnFocusChangeListener() == mVar.b().e()) {
                mVar.f2956G.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        mVar.f2956G = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(jVar);
        }
        mVar.b().m(mVar.f2956G);
        mVar.j(mVar.b());
    }
}
