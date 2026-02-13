package J3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f5495a = new Hc.e(3);

    public static C0340d a(D3.a aVar, Drawable drawable, int i7, int i10) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z8 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            if (i7 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i10 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i7 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i10 = current.getIntrinsicHeight();
                    }
                    Lock lock = A.f5448b;
                    lock.lock();
                    Bitmap f4 = aVar.f(i7, i10, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(f4);
                        current.setBounds(0, 0, i7, i10);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = f4;
                        z8 = true;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            bitmap = null;
            z8 = true;
        }
        if (!z8) {
            aVar = f5495a;
        }
        return C0340d.e(aVar, bitmap);
    }
}
