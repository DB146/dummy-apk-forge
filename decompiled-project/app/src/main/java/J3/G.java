package J3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import y6.C2399e;

/* loaded from: classes.dex */
public final class G implements A3.n {

    /* renamed from: d, reason: collision with root package name */
    public static final A3.k f5453d = new A3.k("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new j());

    /* renamed from: e, reason: collision with root package name */
    public static final A3.k f5454e = new A3.k("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new k());

    /* renamed from: f, reason: collision with root package name */
    public static final C2399e f5455f = new C2399e(7);
    public static final List g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final F f5456a;

    /* renamed from: b, reason: collision with root package name */
    public final D3.a f5457b;

    /* renamed from: c, reason: collision with root package name */
    public final C2399e f5458c = f5455f;

    public G(D3.a aVar, F f4) {
        this.f5457b = aVar;
        this.f5456a = f4;
    }

    @Override // A3.n
    public final boolean a(Object obj, A3.l lVar) {
        return true;
    }

    @Override // A3.n
    public final C3.A b(Object obj, int i7, int i10, A3.l lVar) {
        long longValue = ((Long) lVar.c(f5453d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(A3.c.h("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) lVar.c(f5454e);
        if (num == null) {
            num = 2;
        }
        o oVar = (o) lVar.c(o.g);
        if (oVar == null) {
            oVar = o.f5484f;
        }
        o oVar2 = oVar;
        this.f5458c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f5456a.m(mediaMetadataRetriever, obj);
            return C0340d.e(this.f5457b, c(obj, mediaMetadataRetriever, longValue, num.intValue(), i7, i10, oVar2));
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|10|(4:11|12|(2:14|(1:16)(3:17|18|19))|22)|23|24|(5:31|32|33|(1:39)|37)|(1:45)|46|(3:79|(0)|(1:62)(2:63|64))(4:50|(3:53|(1:55)(1:77)|51)|78|(0)(0))|56|57|58|(3:66|67|(3:69|(1:71)|72))|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0184, code lost:
    
        if (android.util.Log.isLoggable("VideoDecoder", 3) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:
    
        android.util.Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0112, code lost:
    
        if (r0 < 33) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0072, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap c(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j, int i7, int i10, int i11, o oVar) {
        int i12;
        int parseInt;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
            } catch (Throwable th) {
                th = th;
                mediaExtractor = null;
            }
            if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                mediaExtractor = new MediaExtractor();
                try {
                    this.f5456a.r(mediaExtractor, obj);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i13 = 0; i13 < trackCount; i13++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i13).getString("mime"))) {
                            mediaExtractor.release();
                            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                        }
                    } catch (Throwable th3) {
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        throw th3;
                    }
                }
                mediaExtractor.release();
                if (Build.VERSION.SDK_INT >= 27 && i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && oVar != o.f5483e) {
                    try {
                        int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                        if (parseInt != 90 || parseInt == 270) {
                            parseInt3 = parseInt2;
                            parseInt2 = parseInt3;
                        }
                        float b2 = oVar.b(parseInt2, parseInt3, i10, i11);
                        bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i7, Math.round(parseInt2 * b2), Math.round(b2 * parseInt3));
                    } catch (Throwable th4) {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th4);
                        }
                    }
                }
                if (bitmap == null) {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(j, i7);
                }
                if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
                    i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 30) {
                    }
                    if (bitmap == null) {
                        return bitmap;
                    }
                    throw new Db.d("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details", 5);
                }
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    if (Build.ID.startsWith((String) it.next())) {
                    }
                }
                if (bitmap == null) {
                }
                String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                int parseInt4 = Integer.parseInt(extractMetadata);
                int parseInt5 = Integer.parseInt(extractMetadata2);
                if ((parseInt4 == 7 || parseInt4 == 6) && parseInt5 == 6) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                        if (Log.isLoggable("VideoDecoder", 3)) {
                            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                        }
                        Matrix matrix = new Matrix();
                        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                if (bitmap == null) {
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 27) {
            int parseInt22 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt32 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt != 90) {
            }
            parseInt32 = parseInt22;
            parseInt22 = parseInt32;
            float b22 = oVar.b(parseInt22, parseInt32, i10, i11);
            bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j, i7, Math.round(parseInt22 * b22), Math.round(b22 * parseInt32));
        }
        if (bitmap == null) {
        }
        if (Build.MODEL.startsWith("Pixel")) {
        }
        i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
        }
        if (bitmap == null) {
        }
    }
}
