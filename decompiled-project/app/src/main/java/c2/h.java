package c2;

import W1.G;
import android.R;
import android.animation.ValueAnimator;
import android.app.Fragment;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import l1.AbstractC1449a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final G f14146a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f14147b;

    /* renamed from: c, reason: collision with root package name */
    public View f14148c;

    /* renamed from: d, reason: collision with root package name */
    public c f14149d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14150e;

    /* renamed from: f, reason: collision with root package name */
    public final a f14151f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f14152h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14153i;
    public long j;
    public final ValueAnimator k;

    /* renamed from: l, reason: collision with root package name */
    public g f14154l;

    /* renamed from: m, reason: collision with root package name */
    public int f14155m;

    /* renamed from: n, reason: collision with root package name */
    public E5.k f14156n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14157o;

    /* JADX WARN: Multi-variable type inference failed */
    public h(G g) {
        a aVar;
        b bVar = new b(this);
        B6.c cVar = new B6.c(this, 4);
        this.f14146a = g;
        c cVar2 = c.f14132f;
        cVar2.f14135c++;
        this.f14149d = cVar2;
        int i7 = g.getResources().getDisplayMetrics().heightPixels;
        int i10 = g.getResources().getDisplayMetrics().widthPixels;
        this.f14147b = new Handler();
        Z1.a aVar2 = new Z1.a(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        this.k = ofInt;
        ofInt.addListener(bVar);
        ofInt.addUpdateListener(cVar);
        ofInt.setInterpolator(aVar2);
        TypedArray obtainStyledAttributes = g.getTheme().obtainStyledAttributes(new int[]{R.attr.windowBackground});
        this.f14150e = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        a aVar3 = (a) g.getFragmentManager().findFragmentByTag("c2.h");
        if (aVar3 == null) {
            Fragment fragment = new Fragment();
            g.getFragmentManager().beginTransaction().add(fragment, "c2.h").commit();
            aVar = fragment;
        } else {
            h hVar = aVar3.f14129a;
            aVar = aVar3;
            if (hVar != null) {
                throw new IllegalStateException("Created duplicated BackgroundManager for same activity, please use getInstance() instead");
            }
        }
        aVar.f14129a = this;
        this.f14151f = aVar;
    }

    public static h c(G g) {
        h hVar;
        a aVar = (a) g.getFragmentManager().findFragmentByTag("c2.h");
        return (aVar == null || (hVar = aVar.f14129a) == null) ? new h(g) : hVar;
    }

    public static boolean f(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable2 != null) {
            if (drawable == drawable2) {
                return true;
            }
            if ((drawable instanceof e) && (drawable2 instanceof e)) {
                ((e) drawable).f14140a.getClass();
                ((e) drawable2).f14140a.getClass();
                throw null;
            }
            if ((drawable instanceof ColorDrawable) && (drawable2 instanceof ColorDrawable) && ((ColorDrawable) drawable).getColor() == ((ColorDrawable) drawable2).getColor()) {
                return true;
            }
        }
        return false;
    }

    public final void a(Window window) {
        View decorView = window.getDecorView();
        if (this.f14153i) {
            throw new IllegalStateException("Already attached to " + this.f14148c);
        }
        this.f14148c = decorView;
        this.f14153i = true;
        c cVar = this.f14149d;
        int i7 = cVar.f14133a;
        Drawable drawable = cVar.f14134b;
        this.g = i7;
        this.f14152h = drawable == null ? null : drawable.getConstantState().newDrawable().mutate();
        i();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [c2.e, android.graphics.drawable.Drawable] */
    public final Drawable b() {
        Drawable.ConstantState constantState;
        if (this.g != 0) {
            return new ColorDrawable(this.g);
        }
        G g = this.f14146a;
        int i7 = this.f14150e;
        Drawable drawable = null;
        if (i7 != -1) {
            c cVar = this.f14149d;
            WeakReference weakReference = cVar.f14137e;
            if (weakReference != null && cVar.f14136d == i7 && (constantState = (Drawable.ConstantState) weakReference.get()) != null) {
                drawable = constantState.newDrawable();
            }
            if (drawable == null) {
                drawable = AbstractC1449a.getDrawable(g, i7);
                cVar.f14137e = new WeakReference(drawable.getConstantState());
                cVar.f14136d = i7;
            }
        }
        if (drawable != null) {
            return drawable;
        }
        g.getResources();
        ?? drawable2 = new Drawable();
        drawable2.f14140a = new d();
        return drawable2;
    }

    public final void d() {
        if (this.f14156n == null || !this.f14157o || this.k.isStarted() || !this.f14151f.isResumed() || this.f14154l.f14143b < 255) {
            return;
        }
        long max = Math.max(0L, (this.j + 500) - System.currentTimeMillis());
        this.j = System.currentTimeMillis();
        this.f14147b.postDelayed(this.f14156n, max);
        this.f14157o = false;
    }

    public final void e() {
        E5.k kVar = this.f14156n;
        if (kVar != null) {
            this.f14147b.removeCallbacks(kVar);
            this.f14156n = null;
        }
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        g gVar = this.f14154l;
        if (gVar != null) {
            G g = this.f14146a;
            gVar.a(com.kt.apps.media.xemtv.beta.R.id.background_imagein, g);
            this.f14154l.a(com.kt.apps.media.xemtv.beta.R.id.background_imageout, g);
            this.f14154l = null;
        }
        this.f14152h = null;
    }

    public final void g(Drawable drawable) {
        this.f14149d.f14134b = drawable;
        this.f14152h = drawable;
        if (this.f14154l == null) {
            return;
        }
        if (drawable == null) {
            h(b());
        } else {
            h(drawable);
        }
    }

    public final void h(Drawable drawable) {
        if (!this.f14153i) {
            throw new IllegalStateException("Must attach before setting background drawable");
        }
        E5.k kVar = this.f14156n;
        if (kVar != null) {
            if (f(drawable, (Drawable) kVar.f3696b)) {
                return;
            }
            this.f14147b.removeCallbacks(this.f14156n);
            this.f14156n = null;
        }
        this.f14156n = new E5.k(26, this, drawable, false);
        this.f14157o = true;
        d();
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [android.graphics.drawable.LayerDrawable, c2.g] */
    public final void i() {
        if (this.f14153i) {
            g gVar = this.f14154l;
            G g = this.f14146a;
            if (gVar == null) {
                LayerDrawable layerDrawable = (LayerDrawable) AbstractC1449a.getDrawable(g, com.kt.apps.media.xemtv.beta.R.drawable.lb_background).mutate();
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    drawableArr[i7] = layerDrawable.getDrawable(i7);
                }
                ?? layerDrawable2 = new LayerDrawable(drawableArr);
                layerDrawable2.f14143b = 255;
                layerDrawable2.f14145d = new WeakReference(this);
                layerDrawable2.f14142a = new A7.a[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.f14142a[i10] = new A7.a(drawableArr[i10]);
                }
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                }
                this.f14154l = layerDrawable2;
                int i12 = 0;
                while (true) {
                    if (i12 >= layerDrawable2.getNumberOfLayers()) {
                        i12 = -1;
                        break;
                    } else if (layerDrawable2.getId(i12) == com.kt.apps.media.xemtv.beta.R.id.background_imagein) {
                        break;
                    } else {
                        i12++;
                    }
                }
                this.f14155m = i12;
                g gVar2 = this.f14154l;
                for (int i13 = 0; i13 < gVar2.getNumberOfLayers() && gVar2.getId(i13) != com.kt.apps.media.xemtv.beta.R.id.background_imageout; i13++) {
                }
                if (this.f14148c.getBackground() != null) {
                    this.f14154l.setAlpha(this.f14148c.getBackground().getAlpha());
                }
                this.f14148c.setBackground(this.f14154l);
            }
            Drawable drawable = this.f14152h;
            if (drawable == null) {
                this.f14154l.b(com.kt.apps.media.xemtv.beta.R.id.background_imagein, b());
            } else {
                this.f14154l.b(com.kt.apps.media.xemtv.beta.R.id.background_imagein, drawable);
            }
            this.f14154l.a(com.kt.apps.media.xemtv.beta.R.id.background_imageout, g);
        }
    }
}
