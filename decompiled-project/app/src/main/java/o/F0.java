package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import c3.C0898o;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l1.AbstractC1449a;
import u.C2066t;

/* loaded from: classes.dex */
public final class F0 {
    public static F0 g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f21374a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f21375b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f21376c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21377d;

    /* renamed from: e, reason: collision with root package name */
    public T6.a f21378e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f21372f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h, reason: collision with root package name */
    public static final E0 f21373h = new C2066t(6);

    public static synchronized F0 b() {
        F0 f02;
        synchronized (F0.class) {
            try {
                if (g == null) {
                    g = new F0();
                }
                f02 = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f02;
    }

    public static synchronized PorterDuffColorFilter e(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (F0.class) {
            E0 e02 = f21373h;
            e02.getClass();
            int i10 = (31 + i7) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) e02.get(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i7) {
        Drawable drawable;
        if (this.f21376c == null) {
            this.f21376c = new TypedValue();
        }
        TypedValue typedValue = this.f21376c;
        context.getResources().getValue(i7, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            u.r rVar = (u.r) this.f21375b.get(context);
            drawable = null;
            if (rVar != null) {
                WeakReference weakReference = (WeakReference) rVar.b(j);
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawable = constantState.newDrawable(context.getResources());
                    } else {
                        rVar.f(j);
                    }
                }
            }
        }
        if (drawable != null) {
            return drawable;
        }
        LayerDrawable layerDrawable = null;
        if (this.f21378e != null) {
            if (i7 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i7 == R.drawable.abc_ratingbar_material) {
                layerDrawable = T6.a.o(this, context, R.dimen.abc_star_big);
            } else if (i7 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = T6.a.o(this, context, R.dimen.abc_star_medium);
            } else if (i7 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = T6.a.o(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawable.getConstantState();
                    if (constantState2 != null) {
                        u.r rVar2 = (u.r) this.f21375b.get(context);
                        if (rVar2 == null) {
                            rVar2 = new u.r((Object) null);
                            this.f21375b.put(context, rVar2);
                        }
                        rVar2.e(new WeakReference(constantState2), j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawable;
    }

    public final synchronized Drawable c(Context context, int i7) {
        return d(context, i7, false);
    }

    public final synchronized Drawable d(Context context, int i7, boolean z8) {
        Drawable a9;
        try {
            if (!this.f21377d) {
                this.f21377d = true;
                Drawable c10 = c(context, R.drawable.abc_vector_test);
                if (c10 == null || (!(c10 instanceof C0898o) && !"android.graphics.drawable.VectorDrawable".equals(c10.getClass().getName()))) {
                    this.f21377d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            a9 = a(context, i7);
            if (a9 == null) {
                a9 = AbstractC1449a.getDrawable(context, i7);
            }
            if (a9 != null) {
                a9 = g(context, i7, z8, a9);
            }
            if (a9 != null) {
                AbstractC1737h0.a(a9);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a9;
    }

    public final synchronized ColorStateList f(Context context, int i7) {
        ColorStateList colorStateList;
        u.U u3;
        WeakHashMap weakHashMap = this.f21374a;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (u3 = (u.U) weakHashMap.get(context)) == null) ? null : (ColorStateList) u3.c(i7);
        if (colorStateList == null) {
            T6.a aVar = this.f21378e;
            if (aVar != null) {
                colorStateList2 = aVar.p(context, i7);
            }
            if (colorStateList2 != null) {
                if (this.f21374a == null) {
                    this.f21374a = new WeakHashMap();
                }
                u.U u10 = (u.U) this.f21374a.get(context);
                if (u10 == null) {
                    u10 = new u.U(0);
                    this.f21374a.put(context, u10);
                }
                u10.a(i7, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i7, boolean z8, Drawable drawable) {
        int i10;
        boolean z10;
        int round;
        ColorStateList f4 = f(context, i7);
        PorterDuff.Mode mode = null;
        if (f4 != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTintList(f4);
            if (this.f21378e != null && i7 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return mutate;
            }
            mutate.setTintMode(mode);
            return mutate;
        }
        if (this.f21378e != null) {
            if (i7 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c10 = K0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = r.f21579b;
                T6.a.v(findDrawableByLayerId, c10, mode2);
                T6.a.v(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), K0.c(context, R.attr.colorControlNormal), mode2);
                T6.a.v(layerDrawable.findDrawableByLayerId(android.R.id.progress), K0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i7 == R.drawable.abc_ratingbar_material || i7 == R.drawable.abc_ratingbar_indicator_material || i7 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = K0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = r.f21579b;
                T6.a.v(findDrawableByLayerId2, b2, mode3);
                T6.a.v(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), K0.c(context, R.attr.colorControlActivated), mode3);
                T6.a.v(layerDrawable2.findDrawableByLayerId(android.R.id.progress), K0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        T6.a aVar = this.f21378e;
        boolean z11 = false;
        if (aVar != null) {
            PorterDuff.Mode mode4 = r.f21579b;
            if (T6.a.j((int[]) aVar.f9320a, i7)) {
                i10 = R.attr.colorControlNormal;
            } else if (T6.a.j((int[]) aVar.f9322c, i7)) {
                i10 = R.attr.colorControlActivated;
            } else {
                if (T6.a.j((int[]) aVar.f9323d, i7)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i7 == R.drawable.abc_list_divider_mtrl_alpha) {
                    z10 = true;
                    round = Math.round(40.8f);
                    i10 = 16842800;
                    if (z10) {
                        Drawable mutate2 = drawable.mutate();
                        mutate2.setColorFilter(r.c(K0.c(context, i10), mode4));
                        if (round != -1) {
                            mutate2.setAlpha(round);
                        }
                        z11 = true;
                    }
                } else if (i7 != R.drawable.abc_dialog_material_background) {
                    i10 = 0;
                    z10 = false;
                    round = -1;
                    if (z10) {
                    }
                }
                i10 = 16842801;
            }
            z10 = true;
            round = -1;
            if (z10) {
            }
        }
        if (z11 || !z8) {
            return drawable;
        }
        return null;
    }
}
