package k3;

import A9.O0;
import I2.K;
import Y5.J0;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import cc.A;
import cc.D0;
import h3.z;
import i3.i;
import m3.l;
import q3.j;
import q3.p;
import r3.q;
import r3.r;
import r3.s;

/* loaded from: classes.dex */
public final class f implements m3.h, q {

    /* renamed from: C, reason: collision with root package name */
    public static final String f18823C = z.g("DelayMetCommandHandler");

    /* renamed from: A, reason: collision with root package name */
    public final A f18824A;

    /* renamed from: B, reason: collision with root package name */
    public volatile D0 f18825B;

    /* renamed from: a, reason: collision with root package name */
    public final Context f18826a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18827b;

    /* renamed from: c, reason: collision with root package name */
    public final j f18828c;

    /* renamed from: d, reason: collision with root package name */
    public final h f18829d;

    /* renamed from: e, reason: collision with root package name */
    public final O3.c f18830e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f18831f;

    /* renamed from: u, reason: collision with root package name */
    public int f18832u;

    /* renamed from: v, reason: collision with root package name */
    public final K f18833v;

    /* renamed from: w, reason: collision with root package name */
    public final J0 f18834w;

    /* renamed from: x, reason: collision with root package name */
    public PowerManager.WakeLock f18835x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18836y;

    /* renamed from: z, reason: collision with root package name */
    public final i f18837z;

    public f(Context context, int i7, h hVar, i iVar) {
        this.f18826a = context;
        this.f18827b = i7;
        this.f18829d = hVar;
        this.f18828c = iVar.f18357a;
        this.f18837z = iVar;
        O0 o02 = hVar.f18845e.k;
        q3.i iVar2 = hVar.f18842b;
        this.f18833v = (K) iVar2.f23382a;
        this.f18834w = (J0) iVar2.f23385d;
        this.f18824A = (A) iVar2.f23383b;
        this.f18830e = new O3.c(o02);
        this.f18836y = false;
        this.f18832u = 0;
        this.f18831f = new Object();
    }

    public static void a(f fVar) {
        j jVar = fVar.f18828c;
        String str = jVar.f23386a;
        int i7 = fVar.f18832u;
        String str2 = f18823C;
        if (i7 >= 2) {
            z.e().a(str2, "Already stopped work for " + str);
            return;
        }
        fVar.f18832u = 2;
        z.e().a(str2, "Stopping work for WorkSpec " + str);
        Context context = fVar.f18826a;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        b.d(intent, jVar);
        h hVar = fVar.f18829d;
        int i10 = fVar.f18827b;
        i6.b bVar = new i6.b(hVar, intent, i10, 1);
        J0 j02 = fVar.f18834w;
        j02.execute(bVar);
        if (!hVar.f18844d.e(jVar.f23386a)) {
            z.e().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        z.e().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        b.d(intent2, jVar);
        j02.execute(new i6.b(hVar, intent2, i10, 1));
    }

    public static void b(f fVar) {
        if (fVar.f18832u != 0) {
            z.e().a(f18823C, "Already started work for " + fVar.f18828c);
            return;
        }
        fVar.f18832u = 1;
        z.e().a(f18823C, "onAllConstraintsMet for " + fVar.f18828c);
        if (!fVar.f18829d.f18844d.g(fVar.f18837z, null)) {
            fVar.c();
            return;
        }
        s sVar = fVar.f18829d.f18843c;
        j jVar = fVar.f18828c;
        synchronized (sVar.f23697d) {
            z.e().a(s.f23693e, "Starting timer for " + jVar);
            sVar.a(jVar);
            r rVar = new r(sVar, jVar);
            sVar.f23695b.put(jVar, rVar);
            sVar.f23696c.put(jVar, fVar);
            sVar.f23694a.f4906a.postDelayed(rVar, 600000L);
        }
    }

    public final void c() {
        synchronized (this.f18831f) {
            try {
                if (this.f18825B != null) {
                    this.f18825B.cancel(null);
                }
                this.f18829d.f18843c.a(this.f18828c);
                PowerManager.WakeLock wakeLock = this.f18835x;
                if (wakeLock != null && wakeLock.isHeld()) {
                    z.e().a(f18823C, "Releasing wakelock " + this.f18835x + "for WorkSpec " + this.f18828c);
                    this.f18835x.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str = this.f18828c.f23386a;
        Context context = this.f18826a;
        StringBuilder n6 = A3.c.n(str, " (");
        n6.append(this.f18827b);
        n6.append(")");
        this.f18835x = r3.j.a(context, n6.toString());
        z e2 = z.e();
        String str2 = f18823C;
        e2.a(str2, "Acquiring wakelock " + this.f18835x + "for WorkSpec " + str);
        this.f18835x.acquire();
        p h10 = this.f18829d.f18845e.f18380d.C().h(str);
        if (h10 == null) {
            this.f18833v.execute(new e(this, 0));
            return;
        }
        boolean c10 = h10.c();
        this.f18836y = c10;
        if (c10) {
            this.f18825B = l.a(this.f18830e, h10, this.f18824A, this);
        } else {
            z.e().a(str2, "No constraints for ".concat(str));
            this.f18833v.execute(new e(this, 1));
        }
    }

    @Override // m3.h
    public final void e(p pVar, m3.c cVar) {
        boolean z8 = cVar instanceof m3.a;
        K k = this.f18833v;
        if (z8) {
            k.execute(new e(this, 1));
        } else {
            k.execute(new e(this, 0));
        }
    }

    public final void f(boolean z8) {
        z e2 = z.e();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        j jVar = this.f18828c;
        sb2.append(jVar);
        sb2.append(", ");
        sb2.append(z8);
        e2.a(f18823C, sb2.toString());
        c();
        int i7 = this.f18827b;
        h hVar = this.f18829d;
        J0 j02 = this.f18834w;
        Context context = this.f18826a;
        if (z8) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            b.d(intent, jVar);
            j02.execute(new i6.b(hVar, intent, i7, 1));
        }
        if (this.f18836y) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            j02.execute(new i6.b(hVar, intent2, i7, 1));
        }
    }
}
