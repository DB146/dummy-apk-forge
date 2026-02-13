package h4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import b4.C0838i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import l4.AbstractC1485a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17731a;

    /* renamed from: b, reason: collision with root package name */
    public final i4.d f17732b;

    /* renamed from: c, reason: collision with root package name */
    public final b f17733c;

    public d(Context context, i4.d dVar, b bVar) {
        this.f17731a = context;
        this.f17732b = dVar;
        this.f17733c = bVar;
    }

    public final void a(C0838i c0838i, int i7, boolean z8) {
        Context context = this.f17731a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c0838i.f13859a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        Y3.d dVar = c0838i.f13861c;
        adler32.update(allocate.putInt(AbstractC1485a.a(dVar)).array());
        byte[] bArr = c0838i.f13860b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z8) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i10 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i10 >= i7) {
                        android.support.v4.media.session.b.l(c0838i, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        SQLiteDatabase l10 = ((i4.g) this.f17732b).l();
        String valueOf = String.valueOf(AbstractC1485a.a(dVar));
        String str = c0838i.f13859a;
        Cursor rawQuery = l10.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            Long valueOf2 = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf2.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar = this.f17733c;
            builder.setMinimumLatency(bVar.a(dVar, longValue, i7));
            Set set = ((c) bVar.f17727b.get(dVar)).f17730c;
            if (set.contains(e.f17734a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.f17736c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.f17735b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i7);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC1485a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c0838i, Integer.valueOf(value), Long.valueOf(bVar.a(dVar, longValue, i7)), valueOf2, Integer.valueOf(i7)};
            String w10 = android.support.v4.media.session.b.w("JobInfoScheduler");
            if (Log.isLoggable(w10, 3)) {
                Log.d(w10, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
