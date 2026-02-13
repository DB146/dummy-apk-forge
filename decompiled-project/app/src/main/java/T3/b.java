package T3;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f9216b;

    /* renamed from: c, reason: collision with root package name */
    public final j f9217c;

    /* renamed from: d, reason: collision with root package name */
    public Animatable f9218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9219e;

    public b(ImageView imageView, int i7) {
        this.f9219e = i7;
        W3.g.c(imageView, "Argument must not be null");
        this.f9216b = imageView;
        this.f9217c = new j(imageView);
    }

    @Override // T3.a, T3.i
    public final void a(S3.c cVar) {
        this.f9216b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // T3.a, T3.i
    public final void b(Drawable drawable) {
        l(null);
        this.f9218d = null;
        this.f9216b.setImageDrawable(drawable);
    }

    @Override // T3.a, P3.i
    public final void c() {
        Animatable animatable = this.f9218d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // T3.i
    public final void d(S3.g gVar) {
        this.f9217c.f9235b.remove(gVar);
    }

    @Override // T3.a, T3.i
    public final void e(Drawable drawable) {
        l(null);
        this.f9218d = null;
        this.f9216b.setImageDrawable(drawable);
    }

    @Override // T3.i
    public final void f(S3.g gVar) {
        j jVar = this.f9217c;
        ImageView imageView = jVar.f9234a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int a9 = jVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = jVar.f9234a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int a10 = jVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a9 > 0 || a9 == Integer.MIN_VALUE) && (a10 > 0 || a10 == Integer.MIN_VALUE)) {
            gVar.m(a9, a10);
            return;
        }
        ArrayList arrayList = jVar.f9235b;
        if (!arrayList.contains(gVar)) {
            arrayList.add(gVar);
        }
        if (jVar.f9236c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            d dVar = new d(jVar);
            jVar.f9236c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    @Override // T3.a, T3.i
    public final S3.c g() {
        Object tag = this.f9216b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof S3.c) {
            return (S3.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // T3.a, T3.i
    public final void h(Drawable drawable) {
        j jVar = this.f9217c;
        ViewTreeObserver viewTreeObserver = jVar.f9234a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(jVar.f9236c);
        }
        jVar.f9236c = null;
        jVar.f9235b.clear();
        Animatable animatable = this.f9218d;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        this.f9218d = null;
        this.f9216b.setImageDrawable(drawable);
    }

    @Override // T3.i
    public final void i(Object obj) {
        l(obj);
        if (!(obj instanceof Animatable)) {
            this.f9218d = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f9218d = animatable;
        animatable.start();
    }

    @Override // T3.a, P3.i
    public final void j() {
        Animatable animatable = this.f9218d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void l(Object obj) {
        switch (this.f9219e) {
            case 0:
                this.f9216b.setImageBitmap((Bitmap) obj);
                return;
            default:
                this.f9216b.setImageDrawable((Drawable) obj);
                return;
        }
    }

    public final String toString() {
        return "Target for: " + this.f9216b;
    }
}
