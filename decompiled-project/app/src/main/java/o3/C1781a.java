package o3;

import F6.j;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h3.z;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1781a extends e {

    /* renamed from: f, reason: collision with root package name */
    public final j f21666f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1781a(Context context, q3.i iVar, int i7) {
        super(context, iVar);
        this.g = i7;
        this.f21666f = new j(this, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // o3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c() {
        switch (this.g) {
            case 0:
                Intent registerReceiver = ((Context) this.f21671b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    z.e().c(AbstractC1782b.f21667a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent registerReceiver2 = ((Context) this.f21671b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 == null) {
                    z.e().c(AbstractC1783c.f21668a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = registerReceiver2.getIntExtra("status", -1);
                float intExtra3 = registerReceiver2.getIntExtra("level", -1) / registerReceiver2.getIntExtra("scale", -1);
                boolean z8 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                Intent registerReceiver3 = ((Context) this.f21671b).registerReceiver(null, g());
                boolean z10 = true;
                if (registerReceiver3 != null && registerReceiver3.getAction() != null) {
                    String action = registerReceiver3.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (hashCode == -730838620) {
                            break;
                        }
                    }
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // o3.e
    public final void e() {
        z.e().a(AbstractC1784d.f21669a, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.f21671b).registerReceiver(this.f21666f, g());
    }

    @Override // o3.e
    public final void f() {
        z.e().a(AbstractC1784d.f21669a, getClass().getSimpleName().concat(": unregistering receiver"));
        ((Context) this.f21671b).unregisterReceiver(this.f21666f);
    }

    public final IntentFilter g() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
