package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* renamed from: com.google.android.gms.common.api.internal.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0965f extends zau {
    public final void a(com.google.android.gms.common.api.s sVar, com.google.android.gms.common.api.r rVar) {
        int i7 = BasePendingResult.zad;
        com.google.android.gms.common.internal.G.g(sVar);
        sendMessage(obtainMessage(1, new Pair(sVar, rVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            if (i7 != 2) {
                Log.wtf("BasePendingResult", h3.o.l(i7, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f14895v);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        com.google.android.gms.common.api.s sVar = (com.google.android.gms.common.api.s) pair.first;
        com.google.android.gms.common.api.r rVar = (com.google.android.gms.common.api.r) pair.second;
        try {
            Q q10 = (Q) sVar;
            synchronized (q10.f14956b) {
                if (rVar.getStatus().t()) {
                } else {
                    q10.a(rVar.getStatus());
                }
            }
        } catch (RuntimeException e2) {
            BasePendingResult.zal(rVar);
            throw e2;
        }
    }
}
