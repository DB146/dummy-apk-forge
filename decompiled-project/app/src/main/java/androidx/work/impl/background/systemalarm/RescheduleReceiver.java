package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h3.z;
import i3.p;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13747a = z.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z.e().a(f13747a, "Received intent " + intent);
        try {
            p N10 = p.N(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            N10.getClass();
            synchronized (p.f18377n) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = N10.j;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    N10.j = goAsync;
                    if (N10.f18384i) {
                        goAsync.finish();
                        N10.j = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e2) {
            z.e().d(f13747a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
