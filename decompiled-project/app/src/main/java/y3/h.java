package y3;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import j0.AbstractC1362A;
import o0.AbstractC1775c;
import o0.C1773a;
import o0.C1774b;

/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f26808a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1775c f26809b;

    public h(Drawable drawable) {
        AbstractC1775c abstractC1775c;
        this.f26808a = drawable;
        if (drawable == null) {
            abstractC1775c = null;
        } else if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            kotlin.jvm.internal.l.d(bitmap, "bitmap");
            abstractC1775c = new C1773a(new R7.b(bitmap, 22));
        } else if (drawable instanceof ColorDrawable) {
            abstractC1775c = new C1774b(AbstractC1362A.b(((ColorDrawable) drawable).getColor()));
        } else {
            Drawable mutate = drawable.mutate();
            kotlin.jvm.internal.l.d(mutate, "mutate()");
            abstractC1775c = new C2379b(mutate);
        }
        this.f26809b = abstractC1775c;
    }

    @Override // y3.j
    public final Drawable a() {
        return this.f26808a;
    }

    @Override // y3.j
    public final AbstractC1775c b() {
        return this.f26809b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y3.j
    public final void c(Drawable.Callback callback) {
        kotlin.jvm.internal.l.e(callback, "callback");
        Drawable drawable = this.f26808a;
        if (drawable != 0) {
            drawable.setCallback(callback);
        }
        if (drawable != 0) {
            drawable.setVisible(true, true);
        }
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y3.j
    public final void d() {
        Drawable drawable = this.f26808a;
        if (drawable != 0) {
            drawable.setCallback(null);
        }
        if (drawable != 0) {
            drawable.setVisible(false, false);
        }
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
