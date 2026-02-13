package F6;

import B0.AbstractC0169c;
import B0.C;
import Y5.C0640o0;
import Y5.C0646q0;
import Y5.F;
import Y5.W;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.TelephonyManager;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.play.core.install.zza;
import h3.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import n5.D;
import n5.s;
import n5.t;
import n5.u;
import o3.AbstractC1782b;
import o3.AbstractC1783c;
import o3.C1781a;
import o4.C1794h;
import o4.C1798l;
import y9.C2459b;

/* loaded from: classes.dex */
public final class j extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4155a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4156b;

    public j(C0646q0 c0646q0) {
        this.f4155a = 2;
        this.f4156b = c0646q0;
    }

    public /* synthetic */ j(Object obj, int i7) {
        this.f4155a = i7;
        this.f4156b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c10;
        Executor mainExecutor;
        switch (this.f4155a) {
            case 0:
                E6.c cVar = (E6.c) this.f4156b;
                cVar.getClass();
                if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
                    cVar.f3725a.b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                cVar.f3725a.b("List of extras in received intent:", new Object[0]);
                for (String str : intent.getExtras().keySet()) {
                    cVar.f3725a.b("Key: %s; value: %s", str, intent.getExtras().get(str));
                }
                D9.a aVar = cVar.f3725a;
                aVar.b("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                aVar.b("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                aVar.b("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                cVar.f3725a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name")));
                synchronized (cVar) {
                    Iterator it = new HashSet(cVar.f3728d).iterator();
                    while (it.hasNext()) {
                        ((C2459b) it.next()).getClass();
                    }
                }
                return;
            case 1:
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    ((Handler) ((T8.g) this.f4156b).f9378e).post(new T8.a(1, this, intent.getIntExtra("plugged", -1) <= 0));
                    return;
                }
                return;
            case 2:
                C0646q0 c0646q0 = (C0646q0) this.f4156b;
                if (intent == null) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11580w.a("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11580w.a("App receiver called with null action");
                    return;
                }
                int hashCode = action.hashCode();
                if (hashCode != -1928239649) {
                    if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        c10 = 1;
                    }
                    c10 = 65535;
                } else {
                    if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                        c10 = 0;
                    }
                    c10 = 65535;
                }
                if (c10 == 0) {
                    zzql.zza();
                    if (c0646q0.f11910d.T(null, F.f11285Q0)) {
                        W w12 = c0646q0.f11912f;
                        C0646q0.l(w12);
                        w12.f11573B.a("App receiver notified triggers are available");
                        C0640o0 c0640o0 = c0646q0.f11913u;
                        C0646q0.l(c0640o0);
                        c0640o0.S(new C(c0646q0, 22));
                        return;
                    }
                    return;
                }
                if (c10 != 1) {
                    W w13 = c0646q0.f11912f;
                    C0646q0.l(w13);
                    w13.f11580w.a("App receiver called with unknown action");
                    return;
                } else {
                    W w14 = c0646q0.f11912f;
                    C0646q0.l(w14);
                    w14.f11573B.a("[sgtm] App Receiver notified batches are available");
                    C0640o0 c0640o02 = c0646q0.f11913u;
                    C0646q0.l(c0640o02);
                    c0640o02.S(new C(this, 21));
                    return;
                }
            case 3:
                ((AbstractC0169c) this.f4156b).j();
                return;
            case 4:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i7 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i7 = type != 9 ? 8 : 7;
                                        }
                                        i7 = 5;
                                    }
                                }
                                i7 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i7 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                case 9:
                                case 10:
                                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i7 = 4;
                                    break;
                                case 13:
                                    i7 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i7 = 6;
                                    break;
                                case 18:
                                    i7 = 2;
                                    break;
                                case 20:
                                    if (D.f21141a >= 29) {
                                        i7 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i7 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i10 = D.f21141a;
                u uVar = (u) this.f4156b;
                if (i10 < 31 || i7 != 5) {
                    u.a(uVar, i7);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    telephonyManager.getClass();
                    t tVar = new t(uVar);
                    mainExecutor = context.getMainExecutor();
                    n4.i.t(telephonyManager, mainExecutor, tVar);
                    s.l(telephonyManager, tVar);
                    return;
                } catch (RuntimeException unused2) {
                    u.a(uVar, 5);
                    return;
                }
            case 5:
                kotlin.jvm.internal.l.e(context, "context");
                kotlin.jvm.internal.l.e(intent, "intent");
                C1781a c1781a = (C1781a) this.f4156b;
                switch (c1781a.g) {
                    case 0:
                        String action2 = intent.getAction();
                        if (action2 == null) {
                            return;
                        }
                        z.e().a(AbstractC1782b.f21667a, "Received ".concat(action2));
                        switch (action2.hashCode()) {
                            case -1886648615:
                                if (action2.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                    c1781a.d(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case -54942926:
                                if (action2.equals("android.os.action.DISCHARGING")) {
                                    c1781a.d(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case 948344062:
                                if (action2.equals("android.os.action.CHARGING")) {
                                    c1781a.d(Boolean.TRUE);
                                    return;
                                }
                                return;
                            case 1019184907:
                                if (action2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    c1781a.d(Boolean.TRUE);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    case 1:
                        if (intent.getAction() == null) {
                            return;
                        }
                        z.e().a(AbstractC1783c.f21668a, "Received " + intent.getAction());
                        String action3 = intent.getAction();
                        if (action3 != null) {
                            int hashCode2 = action3.hashCode();
                            if (hashCode2 == -1980154005) {
                                if (action3.equals("android.intent.action.BATTERY_OKAY")) {
                                    c1781a.d(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode2 == 490310653 && action3.equals("android.intent.action.BATTERY_LOW")) {
                                    c1781a.d(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        if (intent.getAction() == null) {
                            return;
                        }
                        z.e().a(o3.i.f21678a, "Received " + intent.getAction());
                        String action4 = intent.getAction();
                        if (action4 != null) {
                            int hashCode3 = action4.hashCode();
                            if (hashCode3 == -1181163412) {
                                if (action4.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    c1781a.d(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else {
                                if (hashCode3 == -730838620 && action4.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    c1781a.d(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            default:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                C1798l.a((C1798l) this.f4156b, C1794h.c(context, intent));
                return;
        }
    }
}
