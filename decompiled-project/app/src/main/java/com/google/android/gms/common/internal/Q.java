package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class Q implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S f15047a;

    public /* synthetic */ Q(S s3) {
        this.f15047a = s3;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            synchronized (this.f15047a.f15048d) {
                try {
                    O o10 = (O) message.obj;
                    P p10 = (P) this.f15047a.f15048d.get(o10);
                    if (p10 != null && p10.f15041a.isEmpty()) {
                        if (p10.f15043c) {
                            p10.g.f15050f.removeMessages(1, p10.f15045e);
                            S s3 = p10.g;
                            s3.g.c(s3.f15049e, p10);
                            p10.f15043c = false;
                            p10.f15042b = 2;
                        }
                        this.f15047a.f15048d.remove(o10);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        synchronized (this.f15047a.f15048d) {
            try {
                O o11 = (O) message.obj;
                P p11 = (P) this.f15047a.f15048d.get(o11);
                if (p11 != null && p11.f15042b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(o11)), new Exception());
                    ComponentName componentName = p11.f15046f;
                    if (componentName == null) {
                        o11.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = o11.f15039b;
                        G.g(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    p11.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
