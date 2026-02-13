package J3;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5499e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f5500f;
    public static final File g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile w f5501h;

    /* renamed from: b, reason: collision with root package name */
    public int f5503b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5504c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5505d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f5502a = 20000;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f5499e = i7 < 29;
        f5500f = i7 >= 28;
        g = new File("/proc/self/fd");
    }

    public static w a() {
        if (f5501h == null) {
            synchronized (w.class) {
                try {
                    if (f5501h == null) {
                        f5501h = new w();
                    }
                } finally {
                }
            }
        }
        return f5501h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f5502a;
    }

    public final boolean c(int i7, int i10, boolean z8, boolean z10) {
        boolean z11;
        if (!z8) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f5500f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f5499e && !this.f5505d.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i7 < 0 || i10 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        synchronized (this) {
            try {
                int i11 = this.f5503b + 1;
                this.f5503b = i11;
                if (i11 >= 50) {
                    this.f5503b = 0;
                    int length = g.list().length;
                    long b2 = b();
                    boolean z12 = ((long) length) < b2;
                    this.f5504c = z12;
                    if (!z12 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b2);
                    }
                }
                z11 = this.f5504c;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z11) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }
}
