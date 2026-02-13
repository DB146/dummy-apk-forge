package N3;

import A3.l;
import A3.n;
import C3.A;
import U9.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import h3.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import q3.s;
import x3.C2260b;
import x3.C2261c;
import x3.C2262d;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final j f7165f = new j(10);
    public static final E3.c g = new E3.c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f7166a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7167b;

    /* renamed from: c, reason: collision with root package name */
    public final E3.c f7168c;

    /* renamed from: d, reason: collision with root package name */
    public final j f7169d;

    /* renamed from: e, reason: collision with root package name */
    public final s f7170e;

    public a(Context context, ArrayList arrayList, D3.a aVar, D3.f fVar) {
        j jVar = f7165f;
        this.f7166a = context.getApplicationContext();
        this.f7167b = arrayList;
        this.f7169d = jVar;
        this.f7170e = new s(16, aVar, fVar, false);
        this.f7168c = g;
    }

    public static int d(C2260b c2260b, int i7, int i10) {
        int min = Math.min(c2260b.g / i10, c2260b.f26179f / i7);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder q10 = o.q(max, i7, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            q10.append(i10);
            q10.append("], actual dimens: [");
            q10.append(c2260b.f26179f);
            q10.append("x");
            q10.append(c2260b.g);
            q10.append("]");
            Log.v("BufferGifDecoder", q10.toString());
        }
        return max;
    }

    @Override // A3.n
    public final boolean a(Object obj, l lVar) {
        return !((Boolean) lVar.c(h.f7202b)).booleanValue() && E6.b.t(this.f7167b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // A3.n
    public final A b(Object obj, int i7, int i10, l lVar) {
        C2261c c2261c;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        E3.c cVar = this.f7168c;
        synchronized (cVar) {
            try {
                C2261c c2261c2 = (C2261c) cVar.f3523a.poll();
                if (c2261c2 == null) {
                    c2261c2 = new C2261c();
                }
                c2261c = c2261c2;
                c2261c.f26183b = null;
                Arrays.fill(c2261c.f26182a, (byte) 0);
                c2261c.f26184c = new C2260b();
                c2261c.f26185d = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c2261c.f26183b = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                c2261c.f26183b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i7, i10, c2261c, lVar);
        } finally {
            this.f7168c.a(c2261c);
        }
    }

    public final L3.b c(ByteBuffer byteBuffer, int i7, int i10, C2261c c2261c, l lVar) {
        Bitmap.Config config;
        int i11 = W3.i.f10608b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int i12 = 2;
        try {
            C2260b b2 = c2261c.b();
            if (b2.f26176c > 0 && b2.f26175b == 0) {
                if (lVar.c(h.f7201a) == A3.b.f349b) {
                    try {
                        config = Bitmap.Config.RGB_565;
                    } catch (Throwable th) {
                        th = th;
                        if (Log.isLoggable("BufferGifDecoder", i12)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + W3.i.a(elapsedRealtimeNanos));
                        }
                        throw th;
                    }
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d10 = d(b2, i7, i10);
                j jVar = this.f7169d;
                s sVar = this.f7170e;
                jVar.getClass();
                C2262d c2262d = new C2262d(sVar, b2, byteBuffer, d10);
                c2262d.c(config);
                c2262d.k = (c2262d.k + 1) % c2262d.f26194l.f26176c;
                Bitmap b10 = c2262d.b();
                if (b10 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + W3.i.a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                L3.b bVar = new L3.b(1, new c(new b(new g(com.bumptech.glide.b.a(this.f7166a), c2262d, i7, i10, b10), 0)));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + W3.i.a(elapsedRealtimeNanos));
                }
                return bVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + W3.i.a(elapsedRealtimeNanos));
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            i12 = 2;
        }
    }
}
