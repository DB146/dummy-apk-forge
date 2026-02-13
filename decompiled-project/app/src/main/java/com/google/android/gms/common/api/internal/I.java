package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final class I extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14937a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Context f14938b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14939c;

    public /* synthetic */ I() {
    }

    public I(A a9) {
        this.f14939c = a9;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        r8.q qVar = (r8.q) this.f14939c;
        if (qVar != null) {
            Context context = qVar.f23867c.f15865b;
            this.f14938b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f14937a) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    A a9 = (A) this.f14939c;
                    B b2 = (B) ((Y) a9.f14906b).f14968c;
                    b2.f14908b.set(null);
                    zau zauVar = b2.f14912f.f14987B;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) a9.f14905a;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = this.f14938b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f14938b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            default:
                r8.q qVar = (r8.q) this.f14939c;
                if (qVar != null && qVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    r8.q qVar2 = (r8.q) this.f14939c;
                    qVar2.f23867c.getClass();
                    FirebaseMessaging.b(qVar2, 0L);
                    Context context3 = this.f14938b;
                    if (context3 != null) {
                        context3.unregisterReceiver(this);
                    }
                    this.f14939c = null;
                    return;
                }
                return;
        }
    }
}
