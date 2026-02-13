package com.google.android.gms.measurement;

import R7.a;
import Y5.C0646q0;
import Y5.W;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import k2.AbstractC1419a;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC1419a {

    /* renamed from: c, reason: collision with root package name */
    public a f15152c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f15152c == null) {
            this.f15152c = new a(this, 14);
        }
        a aVar = this.f15152c;
        aVar.getClass();
        W w10 = C0646q0.r(context, null, null).f11912f;
        C0646q0.l(w10);
        if (intent == null) {
            w10.f11580w.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        w10.f11573B.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                w10.f11580w.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        w10.f11573B.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) aVar.f8927b).getClass();
        SparseArray sparseArray = AbstractC1419a.f18806a;
        synchronized (sparseArray) {
            try {
                int i7 = AbstractC1419a.f18807b;
                int i10 = i7 + 1;
                AbstractC1419a.f18807b = i10;
                if (i10 <= 0) {
                    AbstractC1419a.f18807b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i7);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i7, newWakeLock);
            } finally {
            }
        }
    }
}
