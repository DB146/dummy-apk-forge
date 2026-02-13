package J3;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i extends AbstractC0341e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5475b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(A3.h.f353a);

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5475b);
    }

    @Override // J3.AbstractC0341e
    public final Bitmap c(D3.a aVar, Bitmap bitmap, int i7, int i10) {
        Paint paint = A.f5447a;
        if (bitmap.getWidth() > i7 || bitmap.getHeight() > i10) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return A.b(aVar, bitmap, i7, i10);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // A3.h
    public final int hashCode() {
        return -670243078;
    }
}
