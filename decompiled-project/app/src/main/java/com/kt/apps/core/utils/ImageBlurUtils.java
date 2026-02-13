package com.kt.apps.core.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.Matrix4f;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.ScriptIntrinsicColorMatrix;
import android.renderscript.ScriptIntrinsicResize;

/* loaded from: classes2.dex */
public final class ImageBlurUtils {
    public static final ImageBlurUtils INSTANCE = new ImageBlurUtils();

    private ImageBlurUtils() {
    }

    private final void applyBackgroundColor(Bitmap bitmap, int i7) {
        int width = bitmap.getWidth();
        for (int i10 = 0; i10 < width; i10++) {
            int height = bitmap.getHeight();
            for (int i11 = 0; i11 < height; i11++) {
                bitmap.setPixel(i10, i11, BitmapUtilsKt.averageColors(i7, bitmap.getPixel(i10, i11)));
            }
        }
    }

    public final Bitmap blur(Context context, Bitmap originalBitmap, int i7, float f4) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(originalBitmap, "originalBitmap");
        RenderScript create = RenderScript.create(context);
        Bitmap createBitmap = Bitmap.createBitmap(originalBitmap.getWidth() / 4, originalBitmap.getHeight() / 4, Bitmap.Config.ARGB_8888);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap);
        ScriptIntrinsicResize create2 = ScriptIntrinsicResize.create(create);
        create2.setInput(Allocation.createFromBitmap(create, originalBitmap));
        create2.forEach_bicubic(createFromBitmap);
        createFromBitmap.copyTo(createBitmap);
        ScriptIntrinsicBlur create3 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create3.setInput(Allocation.createFromBitmap(create, createBitmap));
        create3.setRadius(f4);
        create3.forEach(createFromBitmap);
        createFromBitmap.copyTo(createBitmap);
        ScriptIntrinsicColorMatrix create4 = ScriptIntrinsicColorMatrix.create(create, Element.U8_4(create));
        create4.setColorMatrix(new Matrix4f(BitmapUtilsKt.getRed50PercentMatrix()));
        create4.forEach(Allocation.createFromBitmap(create, createBitmap), createFromBitmap);
        createFromBitmap.copyTo(createBitmap);
        create.destroy();
        return createBitmap;
    }
}
