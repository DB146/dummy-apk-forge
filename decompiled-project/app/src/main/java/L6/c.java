package L6;

import T3.f;
import W1.C0558a;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.tv.ads.controls.ErrorMessageFragment;
import com.google.android.tv.ads.controls.WhyThisAdFragment;

/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WhyThisAdFragment f6310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WhyThisAdFragment whyThisAdFragment, ImageView imageView) {
        super(imageView);
        this.f6310c = whyThisAdFragment;
    }

    @Override // T3.i
    public final void b(Drawable drawable) {
        C0558a c0558a = new C0558a(this.f6310c.E());
        c0558a.f10421r = true;
        c0558a.k(null, ErrorMessageFragment.class);
        c0558a.e(false);
    }

    @Override // T3.i
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        this.f6310c.f15702m0.setImageDrawable((Drawable) obj);
    }

    @Override // T3.f
    public final void l(Drawable drawable) {
        this.f6310c.f15702m0.setImageDrawable(drawable);
    }
}
