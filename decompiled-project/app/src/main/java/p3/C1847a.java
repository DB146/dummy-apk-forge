package p3;

import D0.b;
import O3.c;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import cc.InterfaceC0937i0;
import h3.o;
import h3.z;
import i3.InterfaceC1342a;
import i3.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m3.h;
import q3.i;
import q3.j;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1847a implements h, InterfaceC1342a {

    /* renamed from: x, reason: collision with root package name */
    public static final String f23035x = z.g("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final p f23036a;

    /* renamed from: b, reason: collision with root package name */
    public final i f23037b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23038c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public j f23039d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f23040e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f23041f;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f23042u;

    /* renamed from: v, reason: collision with root package name */
    public final c f23043v;

    /* renamed from: w, reason: collision with root package name */
    public SystemForegroundService f23044w;

    public C1847a(Context context) {
        p N10 = p.N(context);
        this.f23036a = N10;
        this.f23037b = N10.f18381e;
        this.f23039d = null;
        this.f23040e = new LinkedHashMap();
        this.f23042u = new HashMap();
        this.f23041f = new HashMap();
        this.f23043v = new c(N10.k);
        N10.g.a(this);
    }

    public static Intent a(Context context, j jVar, h3.p pVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f23386a);
        intent.putExtra("KEY_GENERATION", jVar.f23387b);
        intent.putExtra("KEY_NOTIFICATION_ID", pVar.f17703a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pVar.f17704b);
        intent.putExtra("KEY_NOTIFICATION", pVar.f17705c);
        return intent;
    }

    @Override // i3.InterfaceC1342a
    public final void b(j jVar, boolean z8) {
        Map.Entry entry;
        synchronized (this.f23038c) {
            try {
                InterfaceC0937i0 interfaceC0937i0 = ((q3.p) this.f23041f.remove(jVar)) != null ? (InterfaceC0937i0) this.f23042u.remove(jVar) : null;
                if (interfaceC0937i0 != null) {
                    interfaceC0937i0.cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h3.p pVar = (h3.p) this.f23040e.remove(jVar);
        if (jVar.equals(this.f23039d)) {
            if (this.f23040e.size() > 0) {
                Iterator it = this.f23040e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f23039d = (j) entry.getKey();
                if (this.f23044w != null) {
                    h3.p pVar2 = (h3.p) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f23044w;
                    int i7 = pVar2.f17703a;
                    int i10 = pVar2.f17704b;
                    Notification notification = pVar2.f17705c;
                    systemForegroundService.getClass();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 31) {
                        b.j(systemForegroundService, i7, notification, i10);
                    } else if (i11 >= 29) {
                        b.i(systemForegroundService, i7, notification, i10);
                    } else {
                        systemForegroundService.startForeground(i7, notification);
                    }
                    this.f23044w.f13760d.cancel(pVar2.f17703a);
                }
            } else {
                this.f23039d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f23044w;
        if (pVar == null || systemForegroundService2 == null) {
            return;
        }
        z.e().a(f23035x, "Removing Notification (id: " + pVar.f17703a + ", workSpecId: " + jVar + ", notificationType: " + pVar.f17704b);
        systemForegroundService2.f13760d.cancel(pVar.f17703a);
    }

    public final void c(Intent intent) {
        if (this.f23044w == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i7 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        z e2 = z.e();
        StringBuilder sb2 = new StringBuilder("Notifying with (id:");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType :");
        e2.a(f23035x, A3.c.k(sb2, intExtra2, ")"));
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        h3.p pVar = new h3.p(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f23040e;
        linkedHashMap.put(jVar, pVar);
        h3.p pVar2 = (h3.p) linkedHashMap.get(this.f23039d);
        if (pVar2 == null) {
            this.f23039d = jVar;
        } else {
            this.f23044w.f13760d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i7 |= ((h3.p) ((Map.Entry) it.next()).getValue()).f17704b;
                }
                pVar = new h3.p(pVar2.f17703a, pVar2.f17705c, i7);
            } else {
                pVar = pVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.f23044w;
        Notification notification2 = pVar.f17705c;
        systemForegroundService.getClass();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = pVar.f17703a;
        int i12 = pVar.f17704b;
        if (i10 >= 31) {
            b.j(systemForegroundService, i11, notification2, i12);
        } else if (i10 >= 29) {
            b.i(systemForegroundService, i11, notification2, i12);
        } else {
            systemForegroundService.startForeground(i11, notification2);
        }
    }

    public final void d() {
        this.f23044w = null;
        synchronized (this.f23038c) {
            try {
                Iterator it = this.f23042u.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC0937i0) it.next()).cancel(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f23036a.g.f(this);
    }

    @Override // m3.h
    public final void e(q3.p pVar, m3.c cVar) {
        if (cVar instanceof m3.b) {
            z.e().a(f23035x, "Constraints unmet for WorkSpec " + pVar.f23403a);
            j p10 = O5.b.p(pVar);
            int i7 = ((m3.b) cVar).f19778a;
            p pVar2 = this.f23036a;
            pVar2.getClass();
            pVar2.f18381e.r(new r3.i(pVar2.g, new i3.i(p10), true, i7));
        }
    }

    public final void f(int i7) {
        z.e().f(f23035x, o.l(i7, "Foreground service timed out, FGS type: "));
        for (Map.Entry entry : this.f23040e.entrySet()) {
            if (((h3.p) entry.getValue()).f17704b == i7) {
                j jVar = (j) entry.getKey();
                p pVar = this.f23036a;
                pVar.getClass();
                pVar.f18381e.r(new r3.i(pVar.g, new i3.i(jVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f23044w;
        if (systemForegroundService != null) {
            systemForegroundService.f13758b = true;
            z.e().a(SystemForegroundService.f13757e, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
        }
    }
}
