package com.kt.apps.core.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f16172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f16173c;

    public /* synthetic */ j(Bitmap bitmap, ImageView imageView) {
        this.f16171a = 0;
        this.f16173c = bitmap;
        this.f16172b = imageView;
    }

    public /* synthetic */ j(ImageView imageView, Bitmap bitmap, int i7) {
        this.f16171a = i7;
        this.f16172b = imageView;
        this.f16173c = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16171a) {
            case 0:
                BitmapUtilsKt$loadImgByUrl$1.a(this.f16173c, this.f16172b);
                return;
            case 1:
                BitmapUtilsKt$loadImgByUrl$1.c(this.f16173c, this.f16172b);
                return;
            case 2:
                BitmapUtilsKt$loadImgByUrl$1.b(this.f16173c, this.f16172b);
                return;
            default:
                BitmapUtilsKt$loadImgByUrl$1.d(this.f16173c, this.f16172b);
                return;
        }
    }
}
