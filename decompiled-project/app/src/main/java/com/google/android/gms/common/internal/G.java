package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15023a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f15024b;

    /* renamed from: c, reason: collision with root package name */
    public static int f15025c;

    public static void a(String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw new IllegalStateException(h3.o.n("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void f(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(String str, boolean z8) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void j(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static com.google.android.gms.common.api.j l(Status status) {
        return status.f14899c != null ? new com.google.android.gms.common.api.j(status) : new com.google.android.gms.common.api.j(status);
    }
}
