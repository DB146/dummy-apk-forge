package J3;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class y extends AbstractC0341e {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f5512c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(A3.h.f353a);

    /* renamed from: b, reason: collision with root package name */
    public final int f5513b = 12;

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f5512c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f5513b).array());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    @Override // J3.AbstractC0341e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(D3.a aVar, Bitmap bitmap, int i7, int i10) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap f4;
        Lock lock;
        Bitmap.Config config3;
        Bitmap.Config config4;
        Paint paint = A.f5447a;
        int i11 = this.f5513b;
        W3.g.a("roundingRadius must be greater than 0.", i11 > 0);
        int i12 = Build.VERSION.SDK_INT;
        try {
            if (i12 >= 26) {
                config4 = Bitmap.Config.RGBA_F16;
                if (config4.equals(bitmap.getConfig())) {
                    config = Bitmap.Config.RGBA_F16;
                    if (i12 >= 26) {
                        config3 = Bitmap.Config.RGBA_F16;
                        if (config3.equals(bitmap.getConfig())) {
                            config2 = Bitmap.Config.RGBA_F16;
                            if (config2.equals(bitmap.getConfig())) {
                                f4 = bitmap;
                            } else {
                                f4 = aVar.f(bitmap.getWidth(), bitmap.getHeight(), config2);
                                new Canvas(f4).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            }
                            Bitmap f10 = aVar.f(f4.getWidth(), f4.getHeight(), config);
                            f10.setHasAlpha(true);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(f4, tileMode, tileMode);
                            Paint paint2 = new Paint();
                            paint2.setAntiAlias(true);
                            paint2.setShader(bitmapShader);
                            RectF rectF = new RectF(0.0f, 0.0f, f10.getWidth(), f10.getHeight());
                            lock = A.f5448b;
                            lock.lock();
                            Canvas canvas = new Canvas(f10);
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            float f11 = i11;
                            canvas.drawRoundRect(rectF, f11, f11, paint2);
                            canvas.setBitmap(null);
                            lock.unlock();
                            if (!f4.equals(bitmap)) {
                                aVar.g(f4);
                            }
                            return f10;
                        }
                    }
                    config2 = Bitmap.Config.ARGB_8888;
                    if (config2.equals(bitmap.getConfig())) {
                    }
                    Bitmap f102 = aVar.f(f4.getWidth(), f4.getHeight(), config);
                    f102.setHasAlpha(true);
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader2 = new BitmapShader(f4, tileMode2, tileMode2);
                    Paint paint22 = new Paint();
                    paint22.setAntiAlias(true);
                    paint22.setShader(bitmapShader2);
                    RectF rectF2 = new RectF(0.0f, 0.0f, f102.getWidth(), f102.getHeight());
                    lock = A.f5448b;
                    lock.lock();
                    Canvas canvas2 = new Canvas(f102);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    float f112 = i11;
                    canvas2.drawRoundRect(rectF2, f112, f112, paint22);
                    canvas2.setBitmap(null);
                    lock.unlock();
                    if (!f4.equals(bitmap)) {
                    }
                    return f102;
                }
            }
            Canvas canvas22 = new Canvas(f102);
            canvas22.drawColor(0, PorterDuff.Mode.CLEAR);
            float f1122 = i11;
            canvas22.drawRoundRect(rectF2, f1122, f1122, paint22);
            canvas22.setBitmap(null);
            lock.unlock();
            if (!f4.equals(bitmap)) {
            }
            return f102;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
        config = Bitmap.Config.ARGB_8888;
        if (i12 >= 26) {
        }
        config2 = Bitmap.Config.ARGB_8888;
        if (config2.equals(bitmap.getConfig())) {
        }
        Bitmap f1022 = aVar.f(f4.getWidth(), f4.getHeight(), config);
        f1022.setHasAlpha(true);
        Shader.TileMode tileMode22 = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader22 = new BitmapShader(f4, tileMode22, tileMode22);
        Paint paint222 = new Paint();
        paint222.setAntiAlias(true);
        paint222.setShader(bitmapShader22);
        RectF rectF22 = new RectF(0.0f, 0.0f, f1022.getWidth(), f1022.getHeight());
        lock = A.f5448b;
        lock.lock();
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        return (obj instanceof y) && this.f5513b == ((y) obj).f5513b;
    }

    @Override // A3.h
    public final int hashCode() {
        return W3.o.g(-569625254, W3.o.g(this.f5513b, 17));
    }
}
