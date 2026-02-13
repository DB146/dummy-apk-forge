package r3;

import A9.M2;
import I2.AbstractC0315d;
import I2.H;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import h3.C1240b;
import h3.z;
import i1.C1290a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import l3.AbstractC1482a;
import l3.C1484c;

/* renamed from: r3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1919c implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f23655e = z.g("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    public static final long f23656f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f23657a;

    /* renamed from: b, reason: collision with root package name */
    public final i3.p f23658b;

    /* renamed from: c, reason: collision with root package name */
    public final C1290a f23659c;

    /* renamed from: d, reason: collision with root package name */
    public int f23660d = 0;

    public RunnableC1919c(Context context, i3.p pVar) {
        this.f23657a = context.getApplicationContext();
        this.f23658b = pVar;
        this.f23659c = pVar.f18383h;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i7 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
        long currentTimeMillis = System.currentTimeMillis() + f23656f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z8;
        int i7;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        C1290a c1290a = this.f23659c;
        i3.p pVar = this.f23658b;
        WorkDatabase workDatabase = pVar.f18380d;
        String str = C1484c.f19252f;
        Context context = this.f23657a;
        JobScheduler b2 = AbstractC1482a.b(context);
        ArrayList e2 = C1484c.e(context, b2);
        q3.i z10 = workDatabase.z();
        z10.getClass();
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) z10.f23382a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            ArrayList arrayList = new ArrayList(n6.getCount());
            while (n6.moveToNext()) {
                arrayList.add(n6.getString(0));
            }
            HashSet hashSet = new HashSet(e2 != null ? e2.size() : 0);
            if (e2 != null && !e2.isEmpty()) {
                Iterator it = e2.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    q3.j f4 = C1484c.f(jobInfo);
                    if (f4 != null) {
                        hashSet.add(f4.f23386a);
                    } else {
                        C1484c.b(b2, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        z.e().a(C1484c.f19252f, "Reconciling jobs");
                        z8 = true;
                        break;
                    }
                } else {
                    z8 = false;
                    break;
                }
            }
            if (z8) {
                workDatabase.c();
                try {
                    q3.q C2 = workDatabase.C();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C2.j((String) it3.next(), -1L);
                    }
                    workDatabase.v();
                    workDatabase.r();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = pVar.f18380d;
            q3.q C10 = workDatabase.C();
            q3.n B10 = workDatabase.B();
            workDatabase.c();
            try {
                ArrayList e10 = C10.e();
                boolean isEmpty = e10.isEmpty();
                if (!isEmpty) {
                    Iterator it4 = e10.iterator();
                    while (it4.hasNext()) {
                        String str2 = ((q3.p) it4.next()).f23403a;
                        C10.n(1, str2);
                        C10.o(-512, str2);
                        C10.j(str2, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) B10.f23396b;
                workDatabase_Impl2.b();
                q3.h hVar = (q3.h) B10.f23399e;
                V2.j a10 = hVar.a();
                try {
                    workDatabase_Impl2.c();
                    try {
                        a10.l();
                        workDatabase_Impl2.v();
                        hVar.l(a10);
                        workDatabase.v();
                        workDatabase.r();
                        boolean z11 = !isEmpty || z8;
                        Long o10 = ((WorkDatabase) pVar.f18383h.f18187b).y().o("reschedule_needed");
                        String str3 = f23655e;
                        if (o10 != null && o10.longValue() == 1) {
                            z.e().a(str3, "Rescheduling Workers.");
                            pVar.Q();
                            C1290a c1290a2 = pVar.f18383h;
                            c1290a2.getClass();
                            ((WorkDatabase) c1290a2.f18187b).y().p(new q3.d("reschedule_needed", 0L));
                            return;
                        }
                        try {
                            i7 = Build.VERSION.SDK_INT;
                            int i10 = i7 >= 31 ? 570425344 : 536870912;
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                            intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                            broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
                        } catch (IllegalArgumentException e11) {
                            e = e11;
                            if (z.e().f17724a <= 5) {
                                Log.w(str3, "Ignoring exception", e);
                            }
                            z.e().a(str3, "Application was force-stopped, rescheduling.");
                            pVar.Q();
                            pVar.f18379c.f17671d.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            c1290a.getClass();
                            ((WorkDatabase) c1290a.f18187b).y().p(new q3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                            return;
                        } catch (SecurityException e12) {
                            e = e12;
                            if (z.e().f17724a <= 5) {
                            }
                            z.e().a(str3, "Application was force-stopped, rescheduling.");
                            pVar.Q();
                            pVar.f18379c.f17671d.getClass();
                            long currentTimeMillis2 = System.currentTimeMillis();
                            c1290a.getClass();
                            ((WorkDatabase) c1290a.f18187b).y().p(new q3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                            return;
                        }
                        if (i7 >= 30) {
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                Long o11 = ((WorkDatabase) c1290a.f18187b).y().o("last_force_stop_ms");
                                long longValue = o11 != null ? o11.longValue() : 0L;
                                for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                                    ApplicationExitInfo e13 = M2.e(historicalProcessExitReasons.get(i11));
                                    reason = e13.getReason();
                                    if (reason == 10) {
                                        timestamp = e13.getTimestamp();
                                        if (timestamp >= longValue) {
                                            z.e().a(str3, "Application was force-stopped, rescheduling.");
                                            pVar.Q();
                                            pVar.f18379c.f17671d.getClass();
                                            long currentTimeMillis22 = System.currentTimeMillis();
                                            c1290a.getClass();
                                            ((WorkDatabase) c1290a.f18187b).y().p(new q3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                            return;
                                        }
                                    }
                                }
                            }
                            if (z11) {
                                return;
                            }
                            z.e().a(str3, "Found unfinished work, scheduling it.");
                            i3.h.b(pVar.f18379c, pVar.f18380d, pVar.f18382f);
                            return;
                        }
                        if (broadcast == null) {
                            c(context);
                            z.e().a(str3, "Application was force-stopped, rescheduling.");
                            pVar.Q();
                            pVar.f18379c.f17671d.getClass();
                            long currentTimeMillis222 = System.currentTimeMillis();
                            c1290a.getClass();
                            ((WorkDatabase) c1290a.f18187b).y().p(new q3.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                            return;
                        }
                        if (z11) {
                        }
                    } finally {
                        workDatabase_Impl2.r();
                    }
                } catch (Throwable th2) {
                    hVar.l(a10);
                    throw th2;
                }
            } finally {
                workDatabase.r();
            }
        } finally {
            n6.close();
            a9.F();
        }
    }

    public final boolean b() {
        C1240b c1240b = this.f23658b.f18379c;
        c1240b.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f23655e;
        if (isEmpty) {
            z.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a9 = h.a(this.f23657a, c1240b);
        z.e().a(str, "Is default app process = " + a9);
        return a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f23657a;
        String str = f23655e;
        i3.p pVar = this.f23658b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    q3.f.v(context);
                    z.e().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i7 = this.f23660d + 1;
                        this.f23660d = i7;
                        if (i7 >= 3) {
                            String str2 = h3.H.z(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            z.e().d(str, str2, e2);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e2);
                            pVar.f18379c.getClass();
                            throw illegalStateException;
                        }
                        z.e().b(str, "Retrying after " + (i7 * 300), e2);
                        try {
                            Thread.sleep(this.f23660d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e10) {
                    z.e().c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                    pVar.f18379c.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            pVar.P();
        }
    }
}
