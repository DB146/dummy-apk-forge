package k3;

import P4.C0463k;
import Y5.J0;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import ea.C1111f;
import h3.z;
import i3.InterfaceC1342a;
import i3.p;
import java.util.ArrayList;
import java.util.Iterator;
import q3.i;
import q3.j;
import r3.s;

/* loaded from: classes.dex */
public final class h implements InterfaceC1342a {

    /* renamed from: y, reason: collision with root package name */
    public static final String f18840y = z.g("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f18841a;

    /* renamed from: b, reason: collision with root package name */
    public final i f18842b;

    /* renamed from: c, reason: collision with root package name */
    public final s f18843c;

    /* renamed from: d, reason: collision with root package name */
    public final i3.d f18844d;

    /* renamed from: e, reason: collision with root package name */
    public final p f18845e;

    /* renamed from: f, reason: collision with root package name */
    public final b f18846f;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f18847u;

    /* renamed from: v, reason: collision with root package name */
    public Intent f18848v;

    /* renamed from: w, reason: collision with root package name */
    public SystemAlarmService f18849w;

    /* renamed from: x, reason: collision with root package name */
    public final C1111f f18850x;

    public h(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f18841a = applicationContext;
        ha.g gVar = new ha.g(new C0463k(29));
        p N10 = p.N(systemAlarmService);
        this.f18845e = N10;
        this.f18846f = new b(applicationContext, N10.f18379c.f17671d, gVar);
        this.f18843c = new s(N10.f18379c.g);
        i3.d dVar = N10.g;
        this.f18844d = dVar;
        i iVar = N10.f18381e;
        this.f18842b = iVar;
        this.f18850x = new C1111f(dVar, iVar);
        dVar.a(this);
        this.f18847u = new ArrayList();
        this.f18848v = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i7, Intent intent) {
        z e2 = z.e();
        String str = f18840y;
        e2.a(str, "Adding command " + intent + " (" + i7 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            z.e().h(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f18847u) {
                try {
                    Iterator it = this.f18847u.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f18847u) {
            try {
                boolean isEmpty = this.f18847u.isEmpty();
                this.f18847u.add(intent);
                if (isEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // i3.InterfaceC1342a
    public final void b(j jVar, boolean z8) {
        J0 j02 = (J0) this.f18842b.f23385d;
        String str = b.f18809f;
        Intent intent = new Intent(this.f18841a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z8);
        b.d(intent, jVar);
        j02.execute(new i6.b(this, intent, 0, 1));
    }

    public final void d() {
        c();
        PowerManager.WakeLock a9 = r3.j.a(this.f18841a, "ProcessCommand");
        try {
            a9.acquire();
            this.f18845e.f18381e.r(new g(this, 0));
        } finally {
            a9.release();
        }
    }
}
