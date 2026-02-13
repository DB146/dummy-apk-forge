package J3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class h extends AbstractC0341e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5474b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(A3.h.f353a);

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5474b);
    }

    @Override // J3.AbstractC0341e
    public final Bitmap c(D3.a aVar, Bitmap bitmap, int i7, int i10) {
        float width;
        float height;
        Paint paint = A.f5447a;
        if (bitmap.getWidth() == i7 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f4 = 0.0f;
        if (bitmap.getWidth() * i10 > bitmap.getHeight() * i7) {
            width = i10 / bitmap.getHeight();
            f4 = (i7 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i7 / bitmap.getWidth();
            height = (i10 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f4 + 0.5f), (int) (height + 0.5f));
        Bitmap f10 = aVar.f(i7, i10, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        f10.setHasAlpha(bitmap.hasAlpha());
        A.a(bitmap, f10, matrix);
        return f10;
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // A3.h
    public final int hashCode() {
        return -599754482;
    }
}
