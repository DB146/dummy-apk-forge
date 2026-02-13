package k3;

import Y5.J0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import ea.C1111f;
import h3.C1235A;
import h3.C1243e;
import h3.o;
import h3.z;
import i3.InterfaceC1342a;
import i3.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import q3.j;
import q3.p;
import y.S;

/* loaded from: classes.dex */
public final class b implements InterfaceC1342a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f18809f = z.g("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f18810a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18811b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f18812c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C1235A f18813d;

    /* renamed from: e, reason: collision with root package name */
    public final ha.g f18814e;

    public b(Context context, C1235A c1235a, ha.g gVar) {
        this.f18810a = context;
        this.f18813d = c1235a;
        this.f18814e = gVar;
    }

    public static j c(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f23386a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f23387b);
    }

    public final void a(Intent intent, int i7, h hVar) {
        List<i> list;
        String action = intent.getAction();
        int i10 = 1;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            z.e().a(f18809f, "Handling constraints changed " + intent);
            d dVar = new d(this.f18810a, this.f18813d, i7, hVar);
            ArrayList f4 = hVar.f18845e.f18380d.C().f();
            String str = c.f18815a;
            Iterator it = f4.iterator();
            boolean z8 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (it.hasNext()) {
                C1243e c1243e = ((p) it.next()).j;
                z8 |= c1243e.f17686e;
                z10 |= c1243e.f17684c;
                z11 |= c1243e.f17687f;
                z12 |= c1243e.f17682a != 1;
                if (z8 && z10 && z11 && z12) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f13746a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f18817a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(f4.size());
            dVar.f18818b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = f4.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                if (currentTimeMillis >= pVar.a() && (!pVar.c() || dVar.f18820d.c(pVar))) {
                    arrayList.add(pVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                p pVar2 = (p) it3.next();
                String str3 = pVar2.f23403a;
                j p10 = O5.b.p(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, p10);
                z.e().a(d.f18816e, S.b("Creating a delay_met command for workSpec with id (", str3, ")"));
                ((J0) hVar.f18842b.f23385d).execute(new i6.b(hVar, intent3, dVar.f18819c, i10));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            z.e().a(f18809f, "Handling reschedule " + intent + ", " + i7);
            hVar.f18845e.Q();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            z.e().c(f18809f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            j c10 = c(intent);
            String str4 = f18809f;
            z.e().a(str4, "Handling schedule work for " + c10);
            WorkDatabase workDatabase = hVar.f18845e.f18380d;
            workDatabase.c();
            try {
                p h10 = workDatabase.C().h(c10.f23386a);
                if (h10 == null) {
                    z.e().h(str4, "Skipping scheduling " + c10 + " because it's no longer in the DB");
                } else if (o.a(h10.f23404b)) {
                    z.e().h(str4, "Skipping scheduling " + c10 + "because it is finished.");
                } else {
                    long a9 = h10.a();
                    boolean c11 = h10.c();
                    Context context2 = this.f18810a;
                    if (c11) {
                        z.e().a(str4, "Opportunistically setting an alarm for " + c10 + "at " + a9);
                        AbstractC1420a.b(context2, workDatabase, c10, a9);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((J0) hVar.f18842b.f23385d).execute(new i6.b(hVar, intent4, i7, i10));
                    } else {
                        z.e().a(str4, "Setting up Alarms for " + c10 + "at " + a9);
                        AbstractC1420a.b(context2, workDatabase, c10, a9);
                    }
                    workDatabase.v();
                }
                return;
            } finally {
                workDatabase.r();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f18812c) {
                try {
                    j c12 = c(intent);
                    z e2 = z.e();
                    String str5 = f18809f;
                    e2.a(str5, "Handing delay met for " + c12);
                    if (this.f18811b.containsKey(c12)) {
                        z.e().a(str5, "WorkSpec " + c12 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        f fVar = new f(this.f18810a, i7, hVar, this.f18814e.s(c12));
                        this.f18811b.put(c12, fVar);
                        fVar.d();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                z.e().h(f18809f, "Ignoring intent " + intent);
                return;
            }
            j c13 = c(intent);
            boolean z13 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            z.e().a(f18809f, "Handling onExecutionCompleted " + intent + ", " + i7);
            b(c13, z13);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        ha.g gVar = this.f18814e;
        if (containsKey) {
            int i11 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            i p11 = gVar.p(new j(string, i11));
            list = arrayList2;
            if (p11 != null) {
                arrayList2.add(p11);
                list = arrayList2;
            }
        } else {
            list = gVar.q(string);
        }
        for (i workSpecId : list) {
            z.e().a(f18809f, X.c.t("Handing stopWork work for ", string));
            C1111f c1111f = hVar.f18850x;
            c1111f.getClass();
            l.e(workSpecId, "workSpecId");
            c1111f.K(workSpecId, -512);
            WorkDatabase workDatabase2 = hVar.f18845e.f18380d;
            String str6 = AbstractC1420a.f18808a;
            q3.i z14 = workDatabase2.z();
            j jVar = workSpecId.f18357a;
            q3.g u3 = z14.u(jVar);
            if (u3 != null) {
                AbstractC1420a.a(this.f18810a, jVar, u3.f23380c);
                z.e().a(AbstractC1420a.f18808a, "Removing SystemIdInfo for workSpecId (" + jVar + ")");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) z14.f23382a;
                workDatabase_Impl.b();
                q3.h hVar2 = (q3.h) z14.f23384c;
                V2.j a10 = hVar2.a();
                a10.p(1, jVar.f23386a);
                a10.f(2, jVar.f23387b);
                try {
                    workDatabase_Impl.c();
                    try {
                        a10.l();
                        workDatabase_Impl.v();
                        workDatabase_Impl.r();
                    } catch (Throwable th) {
                        workDatabase_Impl.r();
                        throw th;
                    }
                } finally {
                    hVar2.l(a10);
                }
            }
            hVar.b(jVar, false);
        }
    }

    @Override // i3.InterfaceC1342a
    public final void b(j jVar, boolean z8) {
        synchronized (this.f18812c) {
            try {
                f fVar = (f) this.f18811b.remove(jVar);
                this.f18814e.p(jVar);
                if (fVar != null) {
                    fVar.f(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
