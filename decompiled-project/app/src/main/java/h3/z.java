package h3;

import android.util.Log;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f17722b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile z f17723c;

    /* renamed from: a, reason: collision with root package name */
    public final int f17724a;

    public z(int i7) {
        this.f17724a = i7;
    }

    public static z e() {
        z zVar;
        synchronized (f17722b) {
            try {
                if (f17723c == null) {
                    f17723c = new z(3);
                }
                zVar = f17723c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f17724a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2, Throwable th) {
        if (this.f17724a <= 3) {
            Log.d(str, str2, th);
        }
    }

    public final void c(String str, String str2) {
        if (this.f17724a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (this.f17724a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public final void f(String str, String str2) {
        if (this.f17724a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void h(String str, String str2) {
        if (this.f17724a <= 5) {
            Log.w(str, str2);
        }
    }
}
