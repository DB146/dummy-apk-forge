package T1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class h implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f9214a;

    public h(TransformationMethod transformationMethod) {
        this.f9214a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f9214a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null) {
            return charSequence;
        }
        S1.a.b();
        throw null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z8, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f9214a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z8, i7, rect);
        }
    }
}
