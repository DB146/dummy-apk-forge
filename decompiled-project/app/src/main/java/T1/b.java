package T1;

import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f9203a;

    /* renamed from: b, reason: collision with root package name */
    public final Hc.e f9204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection) {
        super(inputConnection, false);
        Hc.e eVar = new Hc.e(15);
        this.f9203a = editText;
        this.f9204b = eVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i10) {
        Editable editableText = this.f9203a.getEditableText();
        this.f9204b.getClass();
        return Hc.e.u(this, editableText, i7, i10, false) || super.deleteSurroundingText(i7, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i10) {
        Editable editableText = this.f9203a.getEditableText();
        this.f9204b.getClass();
        return Hc.e.u(this, editableText, i7, i10, true) || super.deleteSurroundingTextInCodePoints(i7, i10);
    }
}
