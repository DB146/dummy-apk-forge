package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import h3.z;
import java.util.LinkedHashMap;
import java.util.Map;
import k3.h;
import l2.AbstractServiceC1450A;
import r3.j;
import r3.k;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC1450A {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13748d = z.g("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public h f13749b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13750c;

    public final void c() {
        this.f13750c = true;
        z.e().a(f13748d, "All commands completed in dispatcher");
        String str = j.f23672a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (k.f23673a) {
            linkedHashMap.putAll(k.f23674b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                z.e().h(j.f23672a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // l2.AbstractServiceC1450A, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f13749b = hVar;
        if (hVar.f18849w != null) {
            z.e().c(h.f18840y, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            hVar.f18849w = this;
        }
        this.f13750c = false;
    }

    @Override // l2.AbstractServiceC1450A, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f13750c = true;
        h hVar = this.f13749b;
        hVar.getClass();
        z.e().a(h.f18840y, "Destroying SystemAlarmDispatcher");
        hVar.f18844d.f(hVar);
        hVar.f18849w = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        super.onStartCommand(intent, i7, i10);
        if (this.f13750c) {
            z.e().f(f13748d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            h hVar = this.f13749b;
            hVar.getClass();
            z e2 = z.e();
            String str = h.f18840y;
            e2.a(str, "Destroying SystemAlarmDispatcher");
            hVar.f18844d.f(hVar);
            hVar.f18849w = null;
            h hVar2 = new h(this);
            this.f13749b = hVar2;
            if (hVar2.f18849w != null) {
                z.e().c(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                hVar2.f18849w = this;
            }
            this.f13750c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f13749b.a(i10, intent);
        return 3;
    }
}
