package k3;

import A9.N2;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import h3.z;
import ia.C1358d;
import kotlin.jvm.internal.l;
import q3.i;
import q3.j;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1420a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18808a = z.g("Alarms");

    public static void a(Context context, j jVar, int i7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = b.f18809f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        b.d(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i7, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        z.e().a(f18808a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i7 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j jVar, long j) {
        i z8 = workDatabase.z();
        q3.g u3 = z8.u(jVar);
        if (u3 != null) {
            int i7 = u3.f23380c;
            a(context, jVar, i7);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = b.f18809f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            b.d(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i7, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        Object u10 = workDatabase.u(new N2(new D7.c(new C1358d(workDatabase), 2), 8));
        l.d(u10, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        int intValue = ((Number) u10).intValue();
        z8.v(new q3.g(jVar.f23386a, jVar.f23387b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = b.f18809f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        b.d(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
