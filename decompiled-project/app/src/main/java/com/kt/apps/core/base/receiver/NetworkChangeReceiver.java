package com.kt.apps.core.base.receiver;

import A9.C0163z1;
import Db.o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.b;
import c2.q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import y9.C2460c;

/* loaded from: classes2.dex */
public final class NetworkChangeReceiver extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f16114b;

    /* renamed from: a, reason: collision with root package name */
    public final o f16115a = b.z(new C0163z1(23));

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C2460c c2460c;
        if (context == null || intent == null || (c2460c = (C2460c) ((HashMap) this.f16115a.getValue()).get(context.getClass().getName())) == null) {
            return;
        }
        c2460c.f27488a.u(q.n(context));
    }
}
