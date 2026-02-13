package Mc;

import A9.C0119o0;
import A9.C0146v0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class d extends T3.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0146v0 f6945d;

    public d(C0146v0 c0146v0) {
        this.f6945d = c0146v0;
    }

    @Override // T3.i
    public final void h(Drawable drawable) {
    }

    @Override // T3.i
    public final void i(Object obj) {
        C0146v0 c0146v0 = this.f6945d;
        c0146v0.f1432e = (Bitmap) obj;
        C0119o0 c0119o0 = (C0119o0) c0146v0.f1430c;
        Drawable drawable = c0119o0 == null ? null : c0119o0.c(0).f16492b;
        if (drawable instanceof d2.g) {
            ((d2.g) drawable).a((Bitmap) c0146v0.f1432e);
        }
    }
}
