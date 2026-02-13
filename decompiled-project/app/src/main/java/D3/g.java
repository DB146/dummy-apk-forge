package D3;

import W3.o;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: x, reason: collision with root package name */
    public static final Bitmap.Config f3179x = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final k f3180a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f3181b;

    /* renamed from: c, reason: collision with root package name */
    public final U9.i f3182c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3183d;

    /* renamed from: e, reason: collision with root package name */
    public long f3184e;

    /* renamed from: f, reason: collision with root package name */
    public int f3185f;

    /* renamed from: u, reason: collision with root package name */
    public int f3186u;

    /* renamed from: v, reason: collision with root package name */
    public int f3187v;

    /* renamed from: w, reason: collision with root package name */
    public int f3188w;

    public g(long j) {
        Bitmap.Config config;
        k kVar = new k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i7 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i7 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f3183d = j;
        this.f3180a = kVar;
        this.f3181b = unmodifiableSet;
        this.f3182c = new U9.i(3);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f3185f + ", misses=" + this.f3186u + ", puts=" + this.f3187v + ", evictions=" + this.f3188w + ", currentSize=" + this.f3184e + ", maxSize=" + this.f3183d + "\nStrategy=" + this.f3180a);
    }

    public final synchronized Bitmap b(int i7, int i10, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b2;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            b2 = this.f3180a.b(i7, i10, config != null ? config : f3179x);
            if (b2 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    this.f3180a.getClass();
                    sb2.append(k.c(o.d(config) * i7 * i10, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f3186u++;
            } else {
                this.f3185f++;
                long j = this.f3184e;
                this.f3180a.getClass();
                this.f3184e = j - o.c(b2);
                this.f3182c.getClass();
                b2.setHasAlpha(true);
                b2.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                this.f3180a.getClass();
                sb3.append(k.c(o.d(config) * i7 * i10, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b2;
    }

    public final synchronized void c(long j) {
        while (this.f3184e > j) {
            try {
                k kVar = this.f3180a;
                Bitmap bitmap = (Bitmap) kVar.f3198b.z();
                if (bitmap != null) {
                    kVar.a(Integer.valueOf(o.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f3184e = 0L;
                    return;
                }
                this.f3182c.getClass();
                long j10 = this.f3184e;
                this.f3180a.getClass();
                this.f3184e = j10 - o.c(bitmap);
                this.f3188w++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Evicting bitmap=");
                    this.f3180a.getClass();
                    sb2.append(k.c(o.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D3.a
    public final Bitmap d(int i7, int i10, Bitmap.Config config) {
        Bitmap b2 = b(i7, i10, config);
        if (b2 != null) {
            return b2;
        }
        if (config == null) {
            config = f3179x;
        }
        return Bitmap.createBitmap(i7, i10, config);
    }

    @Override // D3.a
    public final Bitmap f(int i7, int i10, Bitmap.Config config) {
        Bitmap b2 = b(i7, i10, config);
        if (b2 != null) {
            b2.eraseColor(0);
            return b2;
        }
        if (config == null) {
            config = f3179x;
        }
        return Bitmap.createBitmap(i7, i10, config);
    }

    @Override // D3.a
    public final synchronized void g(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f3180a.getClass();
                if (o.c(bitmap) <= this.f3183d && this.f3181b.contains(bitmap.getConfig())) {
                    this.f3180a.getClass();
                    int c10 = o.c(bitmap);
                    this.f3180a.e(bitmap);
                    this.f3182c.getClass();
                    this.f3187v++;
                    this.f3184e += c10;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Put bitmap in pool=");
                        this.f3180a.getClass();
                        sb2.append(k.c(o.c(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        a();
                    }
                    c(this.f3183d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f3180a.getClass();
                sb3.append(k.c(o.c(bitmap), bitmap.getConfig()));
                sb3.append(", is mutable: ");
                sb3.append(bitmap.isMutable());
                sb3.append(", is allowed config: ");
                sb3.append(this.f3181b.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb3.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D3.a
    public final void k(int i7) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i7);
        }
        if (i7 >= 40 || i7 >= 20) {
            o();
        } else if (i7 >= 20 || i7 == 15) {
            c(this.f3183d / 2);
        }
    }

    @Override // D3.a
    public final void o() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        c(0L);
    }
}
