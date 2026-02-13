package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class P extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f14954a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q10, Looper looper) {
        super(looper);
        this.f14954a = q10;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i7);
            return;
        }
        com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) message.obj;
        synchronized (this.f14954a.f14956b) {
            try {
                Q q10 = this.f14954a.f14955a;
                com.google.android.gms.common.internal.G.g(q10);
                if (qVar == null) {
                    q10.a(new Status(13, "Transform returned null", null, null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
