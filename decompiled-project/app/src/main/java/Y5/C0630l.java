package Y5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzpk;
import com.google.android.gms.internal.measurement.zzql;
import java.util.Objects;

/* renamed from: Y5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630l extends zzby {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11810a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C9.h f11811b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630l(P p10, Context context) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(p10);
        this.f11811b = p10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630l(C0633m c0633m, Context context) {
        super(context, "google_app_measurement.db", null, 1);
        Objects.requireNonNull(c0633m);
        this.f11811b = c0633m;
    }

    private final void F(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
    }

    private final void K(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
    }

    private final void l(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
    }

    private final void n(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f11810a) {
            case 0:
                C0633m c0633m = (C0633m) this.f11811b;
                ((C0646q0) c0633m.f3094a).getClass();
                A4.f fVar = c0633m.f11834e;
                if (fVar.f382b != 0) {
                    ((M5.b) fVar.f383c).getClass();
                    if (SystemClock.elapsedRealtime() - fVar.f382b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((M5.b) fVar.f383c).getClass();
                    fVar.f382b = SystemClock.elapsedRealtime();
                    C0646q0 c0646q0 = (C0646q0) c0633m.f3094a;
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.a("Opening the database failed, dropping and recreating it");
                    if (!c0646q0.f11907a.getDatabasePath("google_app_measurement.db").delete()) {
                        W w11 = c0646q0.f11912f;
                        C0646q0.l(w11);
                        w11.f11577f.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        fVar.f382b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e2) {
                        W w12 = c0646q0.f11912f;
                        C0646q0.l(w12);
                        w12.f11577f.b(e2, "Failed to open freshly created database");
                        throw e2;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e10) {
                    throw e10;
                } catch (SQLiteException unused2) {
                    P p10 = (P) this.f11811b;
                    C0646q0 c0646q02 = (C0646q0) p10.f3094a;
                    W w13 = c0646q02.f11912f;
                    C0646q0.l(w13);
                    w13.f11577f.a("Opening the local database failed, dropping and recreating it");
                    if (!c0646q02.f11907a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        W w14 = c0646q02.f11912f;
                        C0646q0.l(w14);
                        w14.f11577f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e11) {
                        W w15 = ((C0646q0) p10.f3094a).f11912f;
                        C0646q0.l(w15);
                        w15.f11577f.b(e11, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f11810a) {
            case 0:
                W w10 = ((C0646q0) ((C0633m) this.f11811b).f3094a).f11912f;
                C0646q0.l(w10);
                D0.f(w10, sQLiteDatabase);
                return;
            default:
                W w11 = ((C0646q0) ((P) this.f11811b).f3094a).f11912f;
                C0646q0.l(w11);
                D0.f(w11, sQLiteDatabase);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
        int i11 = this.f11810a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f11810a) {
            case 0:
                String[] strArr = C0633m.f11826f;
                C0646q0 c0646q0 = (C0646q0) ((C0633m) this.f11811b).f3094a;
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                D0.c(w10, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                String[] strArr2 = C0633m.f11828v;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
                String[] strArr3 = C0633m.f11829w;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
                String[] strArr4 = C0633m.f11831y;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                String[] strArr5 = C0633m.f11830x;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
                String[] strArr6 = C0633m.f11832z;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", strArr6);
                String[] strArr7 = C0633m.f11822A;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", strArr7);
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                String[] strArr8 = C0633m.f11823B;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr8);
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                String[] strArr9 = C0633m.f11824C;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", strArr9);
                zzql.zza();
                String[] strArr10 = C0633m.f11825D;
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", strArr10);
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C0633m.f11827u);
                zzpk.zza();
                C0646q0.l(w11);
                D0.c(w11, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                return;
            default:
                String[] strArr11 = P.f11518e;
                W w12 = ((C0646q0) ((P) this.f11811b).f3094a).f11912f;
                C0646q0.l(w12);
                D0.c(w12, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", strArr11);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
        int i11 = this.f11810a;
    }
}
