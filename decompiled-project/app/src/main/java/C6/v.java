package C6;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import y1.K;

/* loaded from: classes.dex */
public final class v implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f3031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f3032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3033c;

    public v(TextInputLayout textInputLayout, EditText editText) {
        this.f3033c = textInputLayout;
        this.f3032b = editText;
        this.f3031a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f3033c;
        textInputLayout.u(!textInputLayout.f15472O0, false);
        if (textInputLayout.f15516y) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f15456G) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f3032b;
        int lineCount = editText.getLineCount();
        int i7 = this.f3031a;
        if (lineCount != i7) {
            if (lineCount < i7) {
                WeakHashMap weakHashMap = K.f26642a;
                int minimumHeight = editText.getMinimumHeight();
                int i10 = textInputLayout.f15459H0;
                if (minimumHeight != i10) {
                    editText.setMinimumHeight(i10);
                }
            }
            this.f3031a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
