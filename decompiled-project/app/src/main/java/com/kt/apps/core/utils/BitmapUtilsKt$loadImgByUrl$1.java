package com.kt.apps.core.utils;

import C3.v;
import E4.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.widget.ImageView;
import com.kt.apps.core.utils.blurry.Blur;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class BitmapUtilsKt$loadImgByUrl$1 implements S3.e {
    final /* synthetic */ ImageView $this_loadImgByUrl;

    public BitmapUtilsKt$loadImgByUrl$1(ImageView imageView) {
        this.$this_loadImgByUrl = imageView;
    }

    private final void blurBackgroundBelowAndroidS(Bitmap bitmap) {
        ExecutorService executorService;
        executorService = BitmapUtilsKt.BITMAP_THREAD_POOL;
        executorService.execute(new j(this.$this_loadImgByUrl, bitmap, 1));
    }

    public static final void blurBackgroundBelowAndroidS$lambda$2(ImageView imageView, Bitmap bitmap) {
        Bitmap of;
        Handler handler;
        try {
            ImageBlurUtils imageBlurUtils = ImageBlurUtils.INSTANCE;
            Context context = imageView.getContext();
            kotlin.jvm.internal.l.d(context, "getContext(...)");
            kotlin.jvm.internal.l.b(bitmap);
            of = imageBlurUtils.blur(context, bitmap, -1, 25.0f);
        } catch (Exception unused) {
            Context context2 = imageView.getContext();
            BlurFactor blurFactor = new BlurFactor();
            blurFactor.width = (int) (((bitmap != null ? bitmap.getWidth() : 50) / 2) * imageView.getContext().getResources().getDisplayMetrics().scaledDensity);
            blurFactor.height = (int) (((bitmap != null ? bitmap.getHeight() : 120) / 2) * imageView.getContext().getResources().getDisplayMetrics().scaledDensity);
            blurFactor.radius = 10;
            blurFactor.sampling = 1;
            of = Blur.of(context2, bitmap, blurFactor);
        }
        handler = BitmapUtilsKt.MAIN_HANDLER;
        handler.post(new j(imageView, of, 2));
    }

    public static final void blurBackgroundBelowAndroidS$lambda$2$lambda$1(ImageView imageView, Bitmap bitmap) {
        kotlin.jvm.internal.l.b(bitmap);
        Resources resources = imageView.getContext().getResources();
        kotlin.jvm.internal.l.d(resources, "getResources(...)");
        imageView.setBackground(new BitmapDrawable(resources, bitmap));
    }

    public static final void onResourceReady$lambda$4(Bitmap bitmap, ImageView imageView) {
        ImageReader newInstance;
        RenderEffect createBlurEffect;
        RecordingCanvas beginRecording;
        HardwareRenderer.FrameRenderRequest createRenderRequest;
        HardwareRenderer.FrameRenderRequest waitForPresent;
        HardwareBuffer hardwareBuffer;
        Bitmap wrapHardwareBuffer;
        Handler handler;
        newInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
        kotlin.jvm.internal.l.d(newInstance, "newInstance(...)");
        RenderNode f4 = s.f();
        HardwareRenderer e2 = s.e();
        e2.setSurface(newInstance.getSurface());
        e2.setContentRoot(f4);
        f4.setPosition(0, 0, newInstance.getWidth() * 4, newInstance.getHeight() * 4);
        createBlurEffect = RenderEffect.createBlurEffect(50.0f, 50.0f, Shader.TileMode.MIRROR);
        kotlin.jvm.internal.l.d(createBlurEffect, "createBlurEffect(...)");
        f4.setRenderEffect(createBlurEffect);
        beginRecording = f4.beginRecording();
        kotlin.jvm.internal.l.d(beginRecording, "beginRecording(...)");
        beginRecording.drawBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true), 0.0f, 0.0f, (Paint) null);
        f4.endRecording();
        createRenderRequest = e2.createRenderRequest();
        waitForPresent = createRenderRequest.setWaitForPresent(true);
        waitForPresent.syncAndDraw();
        Image acquireNextImage = newInstance.acquireNextImage();
        if (acquireNextImage == null) {
            throw new RuntimeException("No Image");
        }
        hardwareBuffer = acquireNextImage.getHardwareBuffer();
        if (hardwareBuffer == null) {
            throw new RuntimeException("No HardwareBuffer");
        }
        wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
        if (wrapHardwareBuffer == null) {
            throw new RuntimeException("Create Bitmap Failed");
        }
        handler = BitmapUtilsKt.MAIN_HANDLER;
        handler.post(new j(imageView, wrapHardwareBuffer, 3));
        hardwareBuffer.close();
        acquireNextImage.close();
        newInstance.close();
        f4.discardDisplayList();
        e2.destroy();
    }

    public static final void onResourceReady$lambda$4$lambda$3(ImageView imageView, Bitmap bitmap) {
        Resources resources = imageView.getContext().getResources();
        kotlin.jvm.internal.l.d(resources, "getResources(...)");
        imageView.setBackground(new BitmapDrawable(resources, bitmap));
    }

    @Override // S3.e
    public boolean onLoadFailed(v vVar, Object obj, T3.i target, boolean z8) {
        kotlin.jvm.internal.l.e(target, "target");
        return false;
    }

    @Override // S3.e
    public boolean onResourceReady(Bitmap resource, Object model, T3.i iVar, A3.a dataSource, boolean z8) {
        ExecutorService executorService;
        kotlin.jvm.internal.l.e(resource, "resource");
        kotlin.jvm.internal.l.e(model, "model");
        kotlin.jvm.internal.l.e(dataSource, "dataSource");
        this.$this_loadImgByUrl.setImageBitmap(resource);
        if (Build.VERSION.SDK_INT < 31) {
            blurBackgroundBelowAndroidS(resource);
            return true;
        }
        this.$this_loadImgByUrl.setImageBitmap(resource);
        try {
            executorService = BitmapUtilsKt.BITMAP_THREAD_POOL;
            executorService.execute(new j(resource, this.$this_loadImgByUrl));
            return true;
        } catch (Exception unused) {
            blurBackgroundBelowAndroidS(resource);
            return true;
        }
    }
}
