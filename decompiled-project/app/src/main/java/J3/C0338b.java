package J3;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: J3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338b implements A3.o {

    /* renamed from: b, reason: collision with root package name */
    public static final A3.k f5462b = A3.k.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c, reason: collision with root package name */
    public static final A3.k f5463c = new A3.k("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, A3.k.f355e);

    /* renamed from: a, reason: collision with root package name */
    public final D3.f f5464a;

    public C0338b(D3.f fVar) {
        this.f5464a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    @Override // A3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Object obj, File file, A3.l lVar) {
        boolean z8;
        Bitmap bitmap = (Bitmap) ((C3.A) obj).get();
        A3.k kVar = f5463c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) lVar.c(kVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i7 = W3.i.f10608b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int intValue = ((Integer) lVar.c(f5462b)).intValue();
        OutputStream outputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                D3.f fVar = this.f5464a;
                if (fVar != null) {
                    try {
                        outputStream = new com.bumptech.glide.load.data.c(fileOutputStream, fVar);
                    } catch (IOException e2) {
                        e = e2;
                        outputStream = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        z8 = false;
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                        }
                        return z8;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = fileOutputStream;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    outputStream = fileOutputStream;
                }
                bitmap.compress(compressFormat, intValue, outputStream);
                outputStream.close();
                try {
                    outputStream.close();
                } catch (IOException unused3) {
                }
                z8 = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            e = e10;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + W3.o.c(bitmap) + " in " + W3.i.a(elapsedRealtimeNanos) + ", options format: " + lVar.c(kVar) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z8;
    }

    @Override // A3.o
    public final int q(A3.l lVar) {
        return 2;
    }
}
