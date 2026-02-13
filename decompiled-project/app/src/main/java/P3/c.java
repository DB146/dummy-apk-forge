package P3;

import I2.C0330t;
import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7820a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.m f7821b;

    public c(Context context, com.bumptech.glide.m mVar) {
        this.f7820a = context.getApplicationContext();
        this.f7821b = mVar;
    }

    @Override // P3.i
    public final void c() {
        p h10 = p.h(this.f7820a);
        com.bumptech.glide.m mVar = this.f7821b;
        synchronized (h10) {
            ((HashSet) h10.f7843d).remove(mVar);
            if (h10.f7841b && ((HashSet) h10.f7843d).isEmpty()) {
                C0330t c0330t = (C0330t) h10.f7842c;
                ((ConnectivityManager) ((F5.i) c0330t.f5201c).get()).unregisterNetworkCallback((o) c0330t.f5202d);
                h10.f7841b = false;
            }
        }
    }

    @Override // P3.i
    public final void j() {
        p h10 = p.h(this.f7820a);
        com.bumptech.glide.m mVar = this.f7821b;
        synchronized (h10) {
            ((HashSet) h10.f7843d).add(mVar);
            h10.i();
        }
    }

    @Override // P3.i
    public final void k() {
    }
}
