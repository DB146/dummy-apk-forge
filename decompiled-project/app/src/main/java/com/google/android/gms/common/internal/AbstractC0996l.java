package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0996l {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15089a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static S f15090b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f15091c;

    public static S a(Context context) {
        synchronized (f15089a) {
            try {
                if (f15090b == null) {
                    f15090b = new S(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15090b;
    }

    public abstract F5.b b(O o10, K k, String str, Executor executor);

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z8) {
        O o10 = new O(str, str2, z8);
        S s3 = (S) this;
        G.h(serviceConnection, "ServiceConnection must not be null");
        synchronized (s3.f15048d) {
            try {
                P p10 = (P) s3.f15048d.get(o10);
                if (p10 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(o10.toString()));
                }
                if (!p10.f15041a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(o10.toString()));
                }
                p10.f15041a.remove(serviceConnection);
                if (p10.f15041a.isEmpty()) {
                    s3.f15050f.sendMessageDelayed(s3.f15050f.obtainMessage(0, o10), s3.f15051h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
