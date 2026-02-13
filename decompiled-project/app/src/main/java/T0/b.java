package T0;

import A0.J;
import Q.C;
import Q.C0480b;
import Q.C0487e0;
import Q.I0;
import Q7.h;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import i0.e;
import j0.k;
import y7.u0;

/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name */
    public final float f9197a;

    /* renamed from: b, reason: collision with root package name */
    public final C0487e0 f9198b = C0480b.o(new e(9205357640488583168L));

    /* renamed from: c, reason: collision with root package name */
    public final C f9199c;

    public b(k kVar, float f4) {
        this.f9197a = f4;
        J j = new J(this, 14);
        h hVar = I0.f8308a;
        this.f9199c = new C(j, null);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        u0.G(textPaint, this.f9197a);
        textPaint.setShader((Shader) this.f9199c.getValue());
    }
}
