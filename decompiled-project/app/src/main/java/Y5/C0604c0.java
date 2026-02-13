package Y5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: Y5.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0604c0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f11683a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11684b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11685c;

    public C0604c0(I1 i12) {
        com.google.android.gms.common.internal.G.g(i12);
        this.f11683a = i12;
    }

    public final void a() {
        I1 i12 = this.f11683a;
        i12.k0();
        i12.c().J();
        i12.c().J();
        if (this.f11684b) {
            i12.b().f11573B.a("Unregistering connectivity change receiver");
            this.f11684b = false;
            this.f11685c = false;
            try {
                i12.f11414z.f11907a.unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                i12.b().f11577f.b(e2, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        I1 i12 = this.f11683a;
        i12.k0();
        String action = intent.getAction();
        i12.b().f11573B.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            i12.b().f11580w.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        C0598a0 c0598a0 = i12.f11404b;
        I1.S(c0598a0);
        boolean d02 = c0598a0.d0();
        if (this.f11685c != d02) {
            this.f11685c = d02;
            i12.c().S(new B0.C(this, d02));
        }
    }
}
