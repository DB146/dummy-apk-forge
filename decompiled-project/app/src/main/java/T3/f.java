package T3;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final e f9229a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f9230b;

    public f(ImageView imageView) {
        W3.g.c(imageView, "Argument must not be null");
        this.f9230b = imageView;
        this.f9229a = new e(imageView);
    }

    @Override // T3.i
    public final void a(S3.c cVar) {
        this.f9230b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // P3.i
    public final void c() {
    }

    @Override // T3.i
    public final void d(S3.g gVar) {
        this.f9229a.f9227b.remove(gVar);
    }

    @Override // T3.i
    public final void e(Drawable drawable) {
    }

    @Override // T3.i
    public final void f(S3.g gVar) {
        e eVar = this.f9229a;
        ImageView imageView = eVar.f9226a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int a9 = eVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = eVar.f9226a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int a10 = eVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a9 > 0 || a9 == Integer.MIN_VALUE) && (a10 > 0 || a10 == Integer.MIN_VALUE)) {
            gVar.m(a9, a10);
            return;
        }
        ArrayList arrayList = eVar.f9227b;
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
        if (eVar.f9228c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            d dVar = new d(eVar);
            eVar.f9228c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    @Override // T3.i
    public final S3.c g() {
        Object tag = this.f9230b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof S3.c) {
            return (S3.c) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // T3.i
    public final void h(Drawable drawable) {
        e eVar = this.f9229a;
        ViewTreeObserver viewTreeObserver = eVar.f9226a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(eVar.f9228c);
        }
        eVar.f9228c = null;
        eVar.f9227b.clear();
        l(drawable);
    }

    @Override // P3.i
    public final void j() {
    }

    @Override // P3.i
    public final void k() {
    }

    public abstract void l(Drawable drawable);

    public final String toString() {
        return "Target for: " + this.f9230b;
    }
}
