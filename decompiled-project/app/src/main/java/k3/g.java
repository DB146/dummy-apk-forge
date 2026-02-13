package k3;

import I2.K;
import Y5.J0;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import h3.z;
import r3.j;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18838a;

    /* renamed from: b, reason: collision with root package name */
    public final h f18839b;

    public /* synthetic */ g(h hVar, int i7) {
        this.f18838a = i7;
        this.f18839b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J0 j02;
        g gVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f18838a) {
            case 0:
                synchronized (this.f18839b.f18847u) {
                    h hVar = this.f18839b;
                    hVar.f18848v = (Intent) hVar.f18847u.get(0);
                }
                Intent intent = this.f18839b.f18848v;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f18839b.f18848v.getIntExtra("KEY_START_ID", 0);
                    z e2 = z.e();
                    String str = h.f18840y;
                    e2.a(str, "Processing command " + this.f18839b.f18848v + ", " + intExtra);
                    PowerManager.WakeLock a9 = j.a(this.f18839b.f18841a, action + " (" + intExtra + ")");
                    try {
                        z.e().a(str, "Acquiring operation wake lock (" + action + ") " + a9);
                        a9.acquire();
                        h hVar2 = this.f18839b;
                        hVar2.f18846f.a(hVar2.f18848v, intExtra, hVar2);
                        z.e().a(str, "Releasing operation wake lock (" + action + ") " + a9);
                        a9.release();
                        h hVar3 = this.f18839b;
                        j02 = (J0) hVar3.f18842b.f23385d;
                        gVar = new g(hVar3, 1);
                    } catch (Throwable th) {
                        try {
                            z e10 = z.e();
                            String str2 = h.f18840y;
                            e10.d(str2, "Unexpected error in onHandleIntent", th);
                            z.e().a(str2, "Releasing operation wake lock (" + action + ") " + a9);
                            a9.release();
                            h hVar4 = this.f18839b;
                            j02 = (J0) hVar4.f18842b.f23385d;
                            gVar = new g(hVar4, 1);
                        } catch (Throwable th2) {
                            z.e().a(h.f18840y, "Releasing operation wake lock (" + action + ") " + a9);
                            a9.release();
                            h hVar5 = this.f18839b;
                            ((J0) hVar5.f18842b.f23385d).execute(new g(hVar5, 1));
                            throw th2;
                        }
                    }
                    j02.execute(gVar);
                    return;
                }
                return;
            default:
                h hVar6 = this.f18839b;
                hVar6.getClass();
                z e11 = z.e();
                String str3 = h.f18840y;
                e11.a(str3, "Checking if commands are complete.");
                h.c();
                synchronized (hVar6.f18847u) {
                    try {
                        if (hVar6.f18848v != null) {
                            z.e().a(str3, "Removing command " + hVar6.f18848v);
                            if (!((Intent) hVar6.f18847u.remove(0)).equals(hVar6.f18848v)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            hVar6.f18848v = null;
                        }
                        K k = (K) hVar6.f18842b.f23382a;
                        b bVar = hVar6.f18846f;
                        synchronized (bVar.f18812c) {
                            isEmpty = bVar.f18811b.isEmpty();
                        }
                        if (isEmpty && hVar6.f18847u.isEmpty()) {
                            synchronized (k.f5053b) {
                                isEmpty2 = k.f5054c.isEmpty();
                            }
                            if (isEmpty2) {
                                z.e().a(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = hVar6.f18849w;
                                if (systemAlarmService != null) {
                                    systemAlarmService.c();
                                }
                            }
                        }
                        if (!hVar6.f18847u.isEmpty()) {
                            hVar6.d();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
