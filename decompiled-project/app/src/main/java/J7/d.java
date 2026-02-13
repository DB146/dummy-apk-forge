package J7;

import L7.AbstractC0382b;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b4.C0838i;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import e4.EnumC1087c;
import i3.CallableC1344c;
import ia.C1358d;
import j4.InterfaceC1376b;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q7.InterfaceC1902f;
import q7.RunnableC1900d;
import q7.ScheduledExecutorServiceC1901e;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements OnSuccessListener, InterfaceC1376b, InterfaceC1902f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5572e;

    public /* synthetic */ d(r rVar, long j, Task task, Task task2) {
        this.f5568a = 0;
        this.f5570c = rVar;
        this.f5569b = j;
        this.f5571d = task;
        this.f5572e = task2;
    }

    public /* synthetic */ d(h4.i iVar, Iterable iterable, C0838i c0838i, long j) {
        this.f5568a = 1;
        this.f5570c = iVar;
        this.f5571d = iterable;
        this.f5572e = c0838i;
        this.f5569b = j;
    }

    public /* synthetic */ d(ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e, Object obj, long j, TimeUnit timeUnit, int i7) {
        this.f5568a = i7;
        this.f5570c = scheduledExecutorServiceC1901e;
        this.f5571d = obj;
        this.f5569b = j;
        this.f5572e = timeUnit;
    }

    @Override // q7.InterfaceC1902f
    public ScheduledFuture a(C1358d c1358d) {
        switch (this.f5568a) {
            case 2:
                ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e = (ScheduledExecutorServiceC1901e) this.f5570c;
                return scheduledExecutorServiceC1901e.f23533b.schedule(new RunnableC1900d(scheduledExecutorServiceC1901e, (Runnable) this.f5571d, c1358d, 1), this.f5569b, (TimeUnit) this.f5572e);
            default:
                ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e2 = (ScheduledExecutorServiceC1901e) this.f5570c;
                return scheduledExecutorServiceC1901e2.f23533b.schedule(new CallableC1344c(scheduledExecutorServiceC1901e2, (Callable) this.f5571d, c1358d, 1), this.f5569b, (TimeUnit) this.f5572e);
        }
    }

    @Override // j4.InterfaceC1376b
    public Object e() {
        h4.i iVar = (h4.i) this.f5570c;
        i4.g gVar = (i4.g) iVar.f17750c;
        gVar.getClass();
        Iterable iterable = (Iterable) this.f5571d;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + i4.g.U(iterable);
            SQLiteDatabase l10 = gVar.l();
            l10.beginTransaction();
            try {
                l10.compileStatement(str).execute();
                Cursor rawQuery = l10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        gVar.P(rawQuery.getInt(0), EnumC1087c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                l10.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                l10.setTransactionSuccessful();
            } finally {
                l10.endTransaction();
            }
        }
        gVar.F(new e(iVar.g.b() + this.f5569b, (C0838i) this.f5572e));
        return null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        r rVar = (r) this.f5570c;
        long j = rVar.f5611B;
        long j10 = this.f5569b;
        Q7.h hVar = rVar.f5637y;
        if (j10 != j) {
            hVar.p("Ignoring getToken result, because this was not the latest attempt.", null, new Object[0]);
            return;
        }
        m mVar = rVar.f5622h;
        m mVar2 = m.f5591b;
        if (mVar != mVar2) {
            if (mVar == m.f5590a) {
                hVar.p("Not opening connection after token refresh, because connection was set to disconnected", null, new Object[0]);
                return;
            }
            return;
        }
        hVar.p("Successfully fetched token, opening connection", null, new Object[0]);
        String str = (String) ((Task) this.f5571d).getResult();
        String str2 = (String) ((Task) this.f5572e).getResult();
        m mVar3 = rVar.f5622h;
        tc.b.z(mVar3 == mVar2, "Trying to open network connection while in the wrong state: %s", mVar3);
        if (str == null) {
            L7.j jVar = rVar.f5616a;
            jVar.getClass();
            jVar.j(AbstractC0382b.f6324c, Boolean.FALSE);
        }
        rVar.f5629q = str;
        rVar.f5631s = str2;
        rVar.f5622h = m.f5592c;
        B4.j jVar2 = new B4.j(rVar.f5633u, rVar.f5617b, rVar.f5618c, rVar, rVar.f5610A, str2);
        rVar.g = jVar2;
        Q7.h hVar2 = (Q7.h) jVar2.f2093f;
        if (hVar2.H()) {
            hVar2.p("Opening a connection", null, new Object[0]);
        }
        w wVar = (w) jVar2.f2091d;
        q3.c cVar = wVar.f5646a;
        U7.d dVar = (U7.d) cVar.f23371b;
        try {
            dVar.c();
        } catch (U7.e e2) {
            w wVar2 = (w) cVar.f23372c;
            boolean H10 = wVar2.j.H();
            Q7.h hVar3 = wVar2.j;
            if (H10) {
                hVar3.p("Error connecting", e2, new Object[0]);
            }
            dVar.a();
            try {
                U7.g gVar = dVar.g;
                if (gVar.g.getState() != Thread.State.NEW) {
                    gVar.g.join();
                }
                dVar.k.join();
            } catch (InterruptedException e10) {
                hVar3.u("Interrupted while shutting down websocket threads", e10);
            }
        }
        wVar.f5652h = wVar.f5653i.schedule(new u(wVar, 0), 30000L, TimeUnit.MILLISECONDS);
    }
}
