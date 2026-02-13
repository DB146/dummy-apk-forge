package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f15616a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            try {
                if (f15616a == null) {
                    u uVar = new u(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    uVar.a(context);
                    f15616a = uVar.b();
                }
                awVar = f15616a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return awVar;
    }
}
