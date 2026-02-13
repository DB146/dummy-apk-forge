package androidx.work.impl.background.systemalarm;

import C7.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h3.z;
import i3.p;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13746a = z.g("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            p.N(context).f18381e.r(new c(intent, context, goAsync(), 12, false));
        } else {
            z.e().a(f13746a, X.c.t("Ignoring unknown action ", action));
        }
    }
}
