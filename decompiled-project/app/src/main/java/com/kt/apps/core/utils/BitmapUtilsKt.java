package com.kt.apps.core.utils;

import C3.m;
import C3.v;
import J3.o;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.n;
import com.kt.apps.media.xemtv.App;
import com.kt.apps.media.xemtv.beta.R;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l1.AbstractC1449a;
import u.C2052e;

/* loaded from: classes2.dex */
public final class BitmapUtilsKt {
    private static final float[] red50PercentMatrix = {0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static final ExecutorService BITMAP_THREAD_POOL = Executors.newCachedThreadPool();
    private static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());

    public static final /* synthetic */ ExecutorService access$getBITMAP_THREAD_POOL$p() {
        return BITMAP_THREAD_POOL;
    }

    public static final /* synthetic */ Handler access$getMAIN_HANDLER$p() {
        return MAIN_HANDLER;
    }

    public static final int averageColors(int i7, int i10) {
        int i11 = i7 + 255;
        return ((((i11 & i10) & 255) >> 1) / 2) | ((((((i10 >> 24) & i11) >> 24) & 255) / 2) << 24) | ((((((i10 >> 16) & i11) >> 16) & 255) / 2) << 16) | ((((((i10 >> 8) & i11) >> 8) & 255) / 2) << 8);
    }

    private static final int getDominantColor(Bitmap bitmap) {
        z2.f a9 = new z2.d(bitmap).a();
        z2.g gVar = z2.g.f28211e;
        C2052e c2052e = a9.f28207b;
        z2.e eVar = (z2.e) c2052e.get(gVar);
        if (eVar == null && (eVar = a9.f28209d) == null) {
            eVar = (z2.e) c2052e.get(z2.g.f28213h);
        }
        if (eVar != null) {
            return eVar.f28200d;
        }
        return 0;
    }

    public static final int getMainColor(Bitmap bitmap) {
        kotlin.jvm.internal.l.e(bitmap, "<this>");
        z2.f a9 = new z2.d(bitmap).a();
        App app = App.f16183y;
        if (app == null) {
            kotlin.jvm.internal.l.j("app");
            throw null;
        }
        AbstractC1449a.getColor(app, R.color.black);
        z2.g gVar = z2.g.f28211e;
        C2052e c2052e = a9.f28207b;
        App app2 = App.f16183y;
        if (app2 == null) {
            kotlin.jvm.internal.l.j("app");
            throw null;
        }
        int color = AbstractC1449a.getColor(app2, R.color.black);
        z2.e eVar = (z2.e) c2052e.get(z2.g.f28212f);
        return eVar != null ? eVar.f28200d : color;
    }

    public static final float[] getRed50PercentMatrix() {
        return red50PercentMatrix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [J3.e, java.lang.Object] */
    public static final void loadDrawableRes(ImageView imageView, int i7, ImageView.ScaleType scaleType) {
        PackageInfo packageInfo;
        kotlin.jvm.internal.l.e(imageView, "<this>");
        kotlin.jvm.internal.l.e(scaleType, "scaleType");
        n e2 = com.bumptech.glide.b.e(imageView);
        Integer valueOf = Integer.valueOf(i7);
        com.bumptech.glide.k l10 = e2.l(Drawable.class);
        com.bumptech.glide.k E10 = l10.E(valueOf);
        Context context = l10.f14656I;
        com.bumptech.glide.k kVar = (com.bumptech.glide.k) E10.t(context.getTheme());
        ConcurrentHashMap concurrentHashMap = V3.b.f10029a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = V3.b.f10029a;
        A3.h hVar = (A3.h) concurrentHashMap2.get(packageName);
        if (hVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
                packageInfo = null;
            }
            V3.d dVar = new V3.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            hVar = (A3.h) concurrentHashMap2.putIfAbsent(packageName, dVar);
            if (hVar == null) {
                hVar = dVar;
            }
        }
        com.bumptech.glide.k kVar2 = (com.bumptech.glide.k) ((com.bumptech.glide.k) kVar.r(new V3.a(context.getResources().getConfiguration().uiMode & 48, hVar))).f(R.drawable.bg_tv);
        kVar2.getClass();
        ((com.bumptech.glide.k) kVar2.o(o.f5481c, new Object(), true)).D(imageView);
    }

    public static /* synthetic */ void loadDrawableRes$default(ImageView imageView, int i7, ImageView.ScaleType scaleType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        }
        loadDrawableRes(imageView, i7, scaleType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [J3.e, java.lang.Object] */
    public static final void loadImageBitmap(final ImageView imageView, String url, final int i7, final Rb.c onResourceReady) {
        kotlin.jvm.internal.l.e(imageView, "<this>");
        kotlin.jvm.internal.l.e(url, "url");
        kotlin.jvm.internal.l.e(onResourceReady, "onResourceReady");
        com.bumptech.glide.k E10 = com.bumptech.glide.b.e(imageView).m().E(url);
        E10.getClass();
        ((com.bumptech.glide.k) E10.o(o.f5481c, new Object(), true)).y(new S3.e() { // from class: com.kt.apps.core.utils.BitmapUtilsKt$loadImageBitmap$1
            @Override // S3.e
            public boolean onLoadFailed(v vVar, Object obj, T3.i target, boolean z8) {
                kotlin.jvm.internal.l.e(target, "target");
                ImageView imageView2 = imageView;
                imageView2.setImageDrawable(AbstractC1449a.getDrawable(imageView2.getContext(), R.drawable.app_icon));
                return true;
            }

            @Override // S3.e
            public boolean onResourceReady(Bitmap resource, Object model, T3.i iVar, A3.a dataSource, boolean z8) {
                kotlin.jvm.internal.l.e(resource, "resource");
                kotlin.jvm.internal.l.e(model, "model");
                kotlin.jvm.internal.l.e(dataSource, "dataSource");
                onResourceReady.invoke(resource);
                imageView.setImageBitmap(resource);
                imageView.setColorFilter(i7);
                return true;
            }
        }).D(imageView);
    }

    public static /* synthetic */ void loadImageBitmap$default(ImageView imageView, String str, int i7, Rb.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        loadImageBitmap(imageView, str, i7, cVar);
    }

    public static final void loadImgByDrawableIdResName(ImageView imageView, String name, String str, ImageView.ScaleType scaleType) {
        kotlin.jvm.internal.l.e(imageView, "<this>");
        kotlin.jvm.internal.l.e(name, "name");
        kotlin.jvm.internal.l.e(scaleType, "scaleType");
        try {
            Context applicationContext = imageView.getContext().getApplicationContext();
            com.bumptech.glide.k E10 = com.bumptech.glide.b.e(imageView).l(Drawable.class).E(AbstractC1449a.getDrawable(applicationContext, applicationContext.getResources().getIdentifier(ac.g.o0(ac.g.o0(ac.g.o0(ac.g.o0(ac.g.v0(name).toString(), ".png"), ".jpg"), ".webp"), ".jpeg"), "drawable", applicationContext.getPackageName())));
            m mVar = m.f2578b;
            ((com.bumptech.glide.k) ((com.bumptech.glide.k) ((com.bumptech.glide.k) ((com.bumptech.glide.k) E10.a((S3.f) new S3.a().e(mVar)).k(410, 230)).s()).e(mVar)).f(R.drawable.bg_tv)).D(imageView);
        } catch (Exception unused) {
            if (str != null) {
                loadImgByUrl(imageView, ac.g.v0(str).toString(), scaleType);
            } else {
                loadDrawableRes(imageView, R.drawable.bg_tv, scaleType);
            }
        }
    }

    public static /* synthetic */ void loadImgByDrawableIdResName$default(ImageView imageView, String str, String str2, ImageView.ScaleType scaleType, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        }
        loadImgByDrawableIdResName(imageView, str, str2, scaleType);
    }

    public static final void loadImgByUrl(ImageView imageView, String url, ImageView.ScaleType scaleType) {
        kotlin.jvm.internal.l.e(imageView, "<this>");
        kotlin.jvm.internal.l.e(url, "url");
        kotlin.jvm.internal.l.e(scaleType, "scaleType");
        ((com.bumptech.glide.k) ((com.bumptech.glide.k) com.bumptech.glide.b.e(imageView).m().E(ac.g.v0(url).toString()).f(R.drawable.bg_tv)).b()).y(new BitmapUtilsKt$loadImgByUrl$1(imageView)).D(imageView);
    }

    public static /* synthetic */ void loadImgByUrl$default(ImageView imageView, String str, ImageView.ScaleType scaleType, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        }
        loadImgByUrl(imageView, str, scaleType);
    }
}
