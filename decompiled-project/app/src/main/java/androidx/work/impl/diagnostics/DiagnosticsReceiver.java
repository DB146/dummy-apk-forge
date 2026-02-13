package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import h3.C1236B;
import h3.C1237C;
import h3.z;
import i3.p;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13756a = z.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        z e2 = z.e();
        String str = f13756a;
        e2.a(str, "Requesting diagnostics");
        try {
            l.e(context, "context");
            p N10 = p.N(context);
            l.d(N10, "getInstance(context)");
            N10.p((C1237C) new C1236B(DiagnosticsWorker.class).c());
        } catch (IllegalStateException e10) {
            z.e().d(str, "WorkManager is not initialized", e10);
        }
    }
}
