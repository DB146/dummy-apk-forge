package i3;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class e extends M2.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18350c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f18351d;

    public e(Context context) {
        super(9, 10);
        this.f18351d = context;
    }

    public e(Context context, int i7, int i10) {
        super(i7, i10);
        this.f18351d = context;
    }

    @Override // M2.a
    public final void a(U2.a db2) {
        switch (this.f18350c) {
            case 0:
                kotlin.jvm.internal.l.e(db2, "db");
                if (this.f6744b >= 10) {
                    db2.B(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f18351d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                kotlin.jvm.internal.l.e(db2, "db");
                db2.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f18351d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    db2.i();
                    try {
                        db2.B(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        db2.B(new Object[]{"reschedule_needed", Long.valueOf(j10)});
                        sharedPreferences.edit().clear().apply();
                        db2.C();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i7 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i10 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    db2.i();
                    try {
                        db2.B(new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                        db2.B(new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                        sharedPreferences2.edit().clear().apply();
                        db2.C();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }
}
