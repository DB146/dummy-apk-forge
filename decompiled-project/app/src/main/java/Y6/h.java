package Y6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import u.C2051d;

/* loaded from: classes.dex */
public final class h extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f12038b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f12039a;

    public h(Context context) {
        this.f12039a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (i.k) {
            try {
                Iterator it = ((C2051d) i.f12040l.values()).iterator();
                while (it.hasNext()) {
                    ((i) it.next()).h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12039a.unregisterReceiver(this);
    }
}
