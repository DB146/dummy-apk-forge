package T1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class c implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9205a;

    public c(TextView textView) {
        this.f9205a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        if (this.f9205a.isInEditMode()) {
            return charSequence;
        }
        S1.a.b();
        throw null;
    }
}
