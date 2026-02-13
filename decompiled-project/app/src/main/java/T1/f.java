package T1;

import Z9.x;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends x {

    /* renamed from: c, reason: collision with root package name */
    public final e f9211c;

    public f(TextView textView) {
        this.f9211c = new e(textView);
    }

    @Override // Z9.x
    public final boolean A() {
        return this.f9211c.f9210e;
    }

    @Override // Z9.x
    public final void P(boolean z8) {
    }

    @Override // Z9.x
    public final void Q(boolean z8) {
        this.f9211c.f9210e = z8;
    }

    @Override // Z9.x
    public final TransformationMethod Z(TransformationMethod transformationMethod) {
        return transformationMethod;
    }

    @Override // Z9.x
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }
}
