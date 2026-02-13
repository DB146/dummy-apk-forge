package Y5;

import A9.C0096i1;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzql;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: Y5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0633m extends D1 {

    /* renamed from: d, reason: collision with root package name */
    public final C0630l f11833d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.f f11834e;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f11826f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f11827u = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f11828v = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f11829w = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f11830x = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f11831y = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f11832z = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f11822A = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: B, reason: collision with root package name */
    public static final String[] f11823B = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: C, reason: collision with root package name */
    public static final String[] f11824C = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f11825D = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C0633m(I1 i12) {
        super(i12);
        this.f11834e = new A4.f(((C0646q0) this.f3094a).f11917y);
        ((C0646q0) this.f3094a).getClass();
        this.f11833d = new C0630l(this, ((C0646q0) this.f3094a).f11907a);
    }

    public static final String o0(ArrayList arrayList) {
        return arrayList.isEmpty() ? "" : y.S.b(" AND (upload_type IN (", TextUtils.join(", ", arrayList), "))");
    }

    public static final void w0(ContentValues contentValues, Object obj) {
        com.google.android.gms.common.internal.G.d("value");
        com.google.android.gms.common.internal.G.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final SQLiteDatabase A0() {
        J();
        try {
            return this.f11833d.getWritableDatabase();
        } catch (SQLiteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Error opening database");
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r2.moveToNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r2.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r1 = r2.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        r1 = j0("events", r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        k0("events_snapshot", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(String str) {
        l0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = A0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            } catch (SQLiteException e2) {
                W w10 = ((C0646q0) this.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11577f.c("Error creating snapshot. appId", W.R(str), e2);
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        k0("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0(String str) {
        boolean z8;
        C0645q j02;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        C0645q j03 = j0("events", str, "_f");
        C0645q j04 = j0("events", str, "_v");
        l0("events", str);
        Cursor cursor = null;
        boolean z10 = false;
        try {
            cursor = A0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e2) {
            e = e2;
            z8 = false;
        } catch (Throwable th) {
            th = th;
            z8 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (j03 == null) {
            }
            k0("events", j03);
            l0("events_snapshot", str);
        }
        boolean z11 = false;
        z8 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z11 = true;
                    } else if ("_v".equals(string)) {
                        z8 = true;
                    }
                }
                if (string != null && (j02 = j0("events_snapshot", str, string)) != null) {
                    k0("events", j02);
                }
            } catch (SQLiteException e10) {
                e = e10;
                z10 = z11;
                try {
                    W w10 = ((C0646q0) this.f3094a).f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.c("Error querying snapshot. appId", W.R(str), e);
                    z11 = z10;
                    if (cursor != null) {
                    }
                    if (!z11) {
                    }
                    if (!z8) {
                    }
                    l0("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z10 && j03 != null) {
                        k0("events", j03);
                    } else if (!z8 && j04 != null) {
                        k0("events", j04);
                    }
                    l0("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = z11;
                if (cursor != null) {
                }
                if (z10) {
                }
                if (!z8) {
                    k0("events", j04);
                }
                l0("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z11 || j03 == null) {
            if (!z8) {
            }
            l0("events_snapshot", str);
        }
        k0("events", j03);
        l0("events_snapshot", str);
    }

    public final void D0(String str, String str2) {
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.d(str2);
        J();
        K();
        try {
            A0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.d("Error deleting user property. appId", W.R(str), c0646q0.f11916x.c(str2), e2);
        }
    }

    public final boolean E0(L1 l12) {
        J();
        K();
        String str = l12.f11441a;
        String str2 = l12.f11443c;
        L1 F02 = F0(str, str2);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        String str3 = l12.f11442b;
        if (F02 == null) {
            if (M1.H0(str2)) {
                if (f0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(c0646q0.f11910d.R(str, F.f11294V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long f02 = f0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                c0646q0.getClass();
                if (f02 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(l12.f11444d));
        w0(contentValues, l12.f11445e);
        try {
            if (A0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.b(W.R(str), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e2) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.c("Error storing user property. appId", W.R(str), e2);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L1 F0(String str, String str2) {
        SQLiteException e2;
        Cursor cursor;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.d(str2);
        J();
        K();
        Cursor cursor2 = null;
        try {
            cursor = A0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j = cursor.getLong(0);
                        Object W10 = W(cursor, 1);
                        if (W10 != null) {
                            L1 l12 = new L1(str, cursor.getString(2), str2, j, W10);
                            if (cursor.moveToNext()) {
                                W w10 = c0646q0.f11912f;
                                C0646q0.l(w10);
                                w10.f11577f.b(W.R(str), "Got multiple records for user property, expected one. appId");
                            }
                            cursor.close();
                            return l12;
                        }
                    }
                } catch (SQLiteException e10) {
                    e2 = e10;
                    W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.d("Error querying user property. appId", W.R(str), c0646q0.f11916x.c(str2), e2);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e2 = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        r2 = r0.f11912f;
        Y5.C0646q0.l(r2);
        r2.f11577f.b(Y5.W.R(r13), "Read invalid user property value, ignoring it. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (r11.moveToNext() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r1.add(new Y5.L1(r13, r5, r6, r7, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003c, code lost:
    
        if (r11.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
    
        r6 = r11.getString(0);
        r2 = r11.getString(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        r5 = r2;
        r7 = r11.getLong(2);
        r9 = W(r11, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        if (r9 != null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List G0(String str) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.d(str);
        J();
        K();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                c0646q0.getClass();
                cursor = A0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
            } catch (SQLiteException e2) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11577f.c("Error querying user properties. appId", W.R(str), e2);
                arrayList = Collections.emptyList();
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        Y5.C0646q0.l(r7);
        r7.f11577f.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List H0(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.d(str);
        J();
        K();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(str);
            StringBuilder sb2 = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb2.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb3.append(str3);
                sb3.append("*");
                arrayList2.add(sb3.toString());
                sb2.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String sb4 = sb2.toString();
            c0646q0.getClass();
            cursor = A0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb4, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursor.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                int size = arrayList.size();
                                W w10 = c0646q0.f11912f;
                                if (size >= 1000) {
                                    break;
                                }
                                String string = cursor.getString(0);
                                long j = cursor.getLong(1);
                                Object W10 = W(cursor, 2);
                                str4 = cursor.getString(3);
                                if (W10 == null) {
                                    C0646q0.l(w10);
                                    w10.f11577f.d("(2)Read invalid user property value, ignoring it", W.R(str), str4, str3);
                                } else {
                                    arrayList.add(new L1(str, str4, string, j, W10));
                                }
                                if (!cursor.moveToNext()) {
                                    break;
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                W w11 = c0646q0.f11912f;
                                C0646q0.l(w11);
                                w11.f11577f.d("(2)Error querying user properties", W.R(str), str4, e);
                                arrayList = Collections.emptyList();
                                if (cursor != null) {
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    str4 = str2;
                }
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            str4 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    public final boolean I0(C0609e c0609e) {
        J();
        K();
        String str = c0609e.f11711a;
        com.google.android.gms.common.internal.G.g(str);
        L1 F02 = F0(str, c0609e.f11713c.f11429b);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (F02 == null) {
            long f02 = f0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            c0646q0.getClass();
            if (f02 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c0609e.f11712b);
        contentValues.put("name", c0609e.f11713c.f11429b);
        Object t5 = c0609e.f11713c.t();
        com.google.android.gms.common.internal.G.g(t5);
        w0(contentValues, t5);
        contentValues.put("active", Boolean.valueOf(c0609e.f11715e));
        contentValues.put("trigger_event_name", c0609e.f11716f);
        contentValues.put("trigger_timeout", Long.valueOf(c0609e.f11718v));
        M1 m12 = c0646q0.f11915w;
        W w10 = c0646q0.f11912f;
        C0646q0.j(m12);
        contentValues.put("timed_out_event", M1.n0(c0609e.f11717u));
        contentValues.put("creation_timestamp", Long.valueOf(c0609e.f11714d));
        C0646q0.j(c0646q0.f11915w);
        contentValues.put("triggered_event", M1.n0(c0609e.f11719w));
        contentValues.put("triggered_timestamp", Long.valueOf(c0609e.f11713c.f11430c));
        contentValues.put("time_to_live", Long.valueOf(c0609e.f11720x));
        contentValues.put("expired_event", M1.n0(c0609e.f11721y));
        try {
            if (A0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            C0646q0.l(w10);
            w10.f11577f.b(W.R(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e2) {
            C0646q0.l(w10);
            w10.f11577f.c("Error storing conditional user property", W.R(str), e2);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00f4: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:31:0x00f4 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0609e J0(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.d(str2);
        J();
        K();
        Cursor cursor3 = null;
        try {
            try {
                cursor = A0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.d("Error querying conditional property", W.R(str), c0646q0.f11916x.c(str2), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        String string = cursor.getString(0);
        if (string == null) {
            string = "";
        }
        String str3 = string;
        Object W10 = W(cursor, 1);
        boolean z8 = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j = cursor.getLong(4);
        C0598a0 c0598a0 = this.f12021b.f11409u;
        I1.S(c0598a0);
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<C0648s> creator = C0648s.CREATOR;
        C0648s c0648s = (C0648s) c0598a0.o0(blob, creator);
        long j10 = cursor.getLong(6);
        I1.S(c0598a0);
        C0648s c0648s2 = (C0648s) c0598a0.o0(cursor.getBlob(7), creator);
        long j11 = cursor.getLong(8);
        long j12 = cursor.getLong(9);
        I1.S(c0598a0);
        C0609e c0609e = new C0609e(str, str3, new K1(j11, W10, str2, str3), j10, z8, string2, c0648s, j, c0648s2, j12, (C0648s) c0598a0.o0(cursor.getBlob(10), creator));
        if (cursor.moveToNext()) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.c("Got multiple records for conditional property, expected one", W.R(str), c0646q0.f11916x.c(str2));
        }
        cursor.close();
        return c0609e;
    }

    public final void K0(String str, String str2) {
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.d(str2);
        J();
        K();
        try {
            A0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.d("Error deleting conditional property", W.R(str), c0646q0.f11916x.c(str2), e2);
        }
    }

    public final List L0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.G.d(str);
        J();
        K();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return M0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // Y5.D1
    public final void M() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        r20 = r12.getString(5);
        r22 = r12.getLong(6);
        r3 = r28.f12021b.f11409u;
        Y5.I1.S(r3);
        r4 = r12.getBlob(7);
        r5 = Y5.C0648s.CREATOR;
        r21 = (Y5.C0648s) r3.o0(r4, r5);
        r17 = r12.getLong(8);
        Y5.I1.S(r3);
        r24 = (Y5.C0648s) r3.o0(r12.getBlob(9), r5);
        r6 = r12.getLong(10);
        r25 = r12.getLong(11);
        Y5.I1.S(r3);
        r0.add(new Y5.C0609e(r14, r15, new Y5.K1(r6, r8, r9, r15), r17, r19, r20, r21, r22, r24, r25, (Y5.C0648s) r3.o0(r12.getBlob(12), r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f7, code lost:
    
        if (r12.moveToNext() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = r2.f11912f;
        Y5.C0646q0.l(r3);
        r3.f11577f.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004c, code lost:
    
        if (r12.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (r0.size() < 1000) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        r14 = r12.getString(0);
        r15 = r12.getString(1);
        r9 = r12.getString(2);
        r8 = W(r12, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if (r12.getInt(4) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List M0(String str, String[] strArr) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        J();
        K();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                c0646q0.getClass();
                cursor = A0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            } catch (SQLiteException e2) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11577f.b(e2, "Error querying conditional user property value");
                arrayList = Collections.emptyList();
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long N(String str, zzib zzibVar, String str2, Map map, Y0 y02, Long l10) {
        int delete;
        J();
        K();
        com.google.android.gms.common.internal.G.g(zzibVar);
        com.google.android.gms.common.internal.G.d(str);
        J();
        K();
        boolean u02 = u0();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (u02) {
            I1 i12 = this.f12021b;
            long f4 = i12.f11411w.f11852f.f();
            c0646q0.f11917y.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - f4) > ((Long) F.f11276M.a(null)).longValue()) {
                i12.f11411w.f11852f.g(elapsedRealtime);
                J();
                K();
                boolean u03 = u0();
                W w10 = c0646q0.f11912f;
                if (u03 && (delete = A0().delete("upload_queue", n0(), new String[0])) > 0) {
                    C0646q0.l(w10);
                    w10.f11573B.b(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                com.google.android.gms.common.internal.G.d(str);
                J();
                K();
                try {
                    int R10 = c0646q0.f11910d.R(str, F.f11254A);
                    if (R10 > 0) {
                        A0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(R10)});
                    }
                } catch (SQLiteException e2) {
                    C0646q0.l(w10);
                    w10.f11577f.c("Error deleting over the limit queued batches. appId", W.R(str), e2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] zzcc = zzibVar.zzcc();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", zzcc);
        contentValues.put("upload_uri", str2);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb3.toString());
        contentValues.put("upload_type", Integer.valueOf(y02.f11603a));
        M5.b bVar = c0646q0.f11917y;
        W w11 = c0646q0.f11912f;
        bVar.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long insert = A0().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            C0646q0.l(w11);
            w11.f11577f.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e10) {
            C0646q0.l(w11);
            w11.f11577f.c("Error storing MeasurementBatch to upload_queue. appId", str, e10);
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0601b0 N0(String str) {
        Throwable th;
        SQLiteException sQLiteException;
        Cursor cursor;
        Throwable th2;
        Boolean valueOf;
        String string;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.d(str);
        J();
        K();
        Cursor cursor2 = null;
        try {
            cursor = A0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e2) {
            sQLiteException = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 == null) {
            }
        }
        try {
        } catch (SQLiteException e10) {
            sQLiteException = e10;
            try {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11577f.c("Error querying app. appId", W.R(str), sQLiteException);
                if (cursor != null) {
                }
                return null;
            } catch (Throwable th4) {
                th2 = th4;
                th = th2;
                cursor2 = cursor;
                if (cursor2 == null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (Throwable th5) {
            th2 = th5;
            th = th2;
            cursor2 = cursor;
            if (cursor2 == null) {
            }
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        I1 i12 = this.f12021b;
        C0601b0 c0601b0 = new C0601b0(i12.f11414z, str);
        C0646q0 c0646q02 = c0601b0.f11653a;
        C0 a9 = i12.a(str);
        B0 b02 = B0.ANALYTICS_STORAGE;
        if (a9.i(b02)) {
            c0601b0.F(cursor.getString(0));
        }
        boolean z8 = true;
        c0601b0.H(cursor.getString(1));
        if (i12.a(str).i(B0.AD_STORAGE)) {
            c0601b0.I(cursor.getString(2));
        }
        c0601b0.e(cursor.getLong(3));
        c0601b0.L(cursor.getLong(4));
        c0601b0.M(cursor.getLong(5));
        c0601b0.O(cursor.getString(6));
        c0601b0.R(cursor.getString(7));
        c0601b0.S(cursor.getLong(8));
        c0601b0.a(cursor.getLong(9));
        c0601b0.d(cursor.isNull(10) || cursor.getInt(10) != 0);
        c0601b0.i(cursor.getLong(11));
        c0601b0.j(cursor.getLong(12));
        c0601b0.k(cursor.getLong(13));
        c0601b0.l(cursor.getLong(14));
        c0601b0.f(cursor.getLong(15));
        c0601b0.g(cursor.getLong(16));
        c0601b0.Q(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        c0601b0.K(cursor.getString(18));
        c0601b0.n(cursor.getLong(19));
        c0601b0.m(cursor.getLong(20));
        c0601b0.v(cursor.getString(21));
        boolean z10 = cursor.isNull(23) || cursor.getInt(23) != 0;
        C0640o0 c0640o0 = c0646q02.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        c0601b0.f11650Q |= c0601b0.f11665p != z10;
        c0601b0.f11665p = z10;
        c0601b0.c(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            c0601b0.x(Arrays.asList(cursor.getString(26).split(",", -1)));
        }
        if (i12.a(str).i(b02)) {
            String string2 = cursor.getString(28);
            C0640o0 c0640o02 = c0646q02.f11913u;
            C0646q0.l(c0640o02);
            c0640o02.J();
            c0601b0.f11650Q |= !Objects.equals(c0601b0.f11669t, string2);
            c0601b0.f11669t = string2;
        }
        boolean z11 = (cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true;
        C0640o0 c0640o03 = c0646q02.f11913u;
        C0646q0.l(c0640o03);
        c0640o03.J();
        c0601b0.f11650Q |= c0601b0.f11670u != z11;
        c0601b0.f11670u = z11;
        c0601b0.r(cursor.getLong(39));
        String string3 = cursor.getString(36);
        C0640o0 c0640o04 = c0646q02.f11913u;
        C0646q0.l(c0640o04);
        c0640o04.J();
        c0601b0.f11650Q |= c0601b0.f11637C != string3;
        c0601b0.f11637C = string3;
        c0601b0.z(cursor.getLong(30));
        c0601b0.A(cursor.getLong(31));
        zzql.zza();
        if (c0646q0.f11910d.T(str, F.f11283P0)) {
            int i7 = cursor.getInt(32);
            C0640o0 c0640o05 = c0646q02.f11913u;
            C0646q0.l(c0640o05);
            c0640o05.J();
            c0601b0.f11650Q |= c0601b0.f11673x != i7;
            c0601b0.f11673x = i7;
            c0601b0.B(cursor.getLong(35));
        }
        boolean z12 = (cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true;
        C0640o0 c0640o06 = c0646q02.f11913u;
        C0646q0.l(c0640o06);
        c0640o06.J();
        c0601b0.f11650Q |= c0601b0.f11674y != z12;
        c0601b0.f11674y = z12;
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        C0640o0 c0640o07 = c0646q02.f11913u;
        C0646q0.l(c0640o07);
        c0640o07.J();
        c0601b0.f11650Q |= !Objects.equals(c0601b0.f11666q, valueOf);
        c0601b0.f11666q = valueOf;
        c0601b0.p(cursor.getInt(37));
        c0601b0.q(cursor.getInt(38));
        if (cursor.isNull(40)) {
            string = "";
        } else {
            string = cursor.getString(40);
            com.google.android.gms.common.internal.G.g(string);
        }
        C0640o0 c0640o08 = c0646q02.f11913u;
        C0646q0.l(c0640o08);
        c0640o08.J();
        c0601b0.f11650Q |= c0601b0.f11641G != string;
        c0601b0.f11641G = string;
        if (!cursor.isNull(41)) {
            Long valueOf2 = Long.valueOf(cursor.getLong(41));
            C0640o0 c0640o09 = c0646q02.f11913u;
            C0646q0.l(c0640o09);
            c0640o09.J();
            c0601b0.f11650Q |= !Objects.equals(c0601b0.f11675z, valueOf2);
            c0601b0.f11675z = valueOf2;
        }
        if (!cursor.isNull(42)) {
            Long valueOf3 = Long.valueOf(cursor.getLong(42));
            C0640o0 c0640o010 = c0646q02.f11913u;
            C0646q0.l(c0640o010);
            c0640o010.J();
            c0601b0.f11650Q |= !Objects.equals(c0601b0.f11635A, valueOf3);
            c0601b0.f11635A = valueOf3;
        }
        byte[] blob = cursor.getBlob(43);
        C0640o0 c0640o011 = c0646q02.f11913u;
        C0646q0.l(c0640o011);
        c0640o011.J();
        c0601b0.f11650Q |= c0601b0.f11642H != blob;
        c0601b0.f11642H = blob;
        if (!cursor.isNull(44)) {
            int i10 = cursor.getInt(44);
            C0640o0 c0640o012 = c0646q02.f11913u;
            C0646q0.l(c0640o012);
            c0640o012.J();
            boolean z13 = c0601b0.f11650Q;
            if (c0601b0.f11643I == i10) {
                z8 = false;
            }
            c0601b0.f11650Q = z8 | z13;
            c0601b0.f11643I = i10;
        }
        C0640o0 c0640o013 = c0646q02.f11913u;
        C0646q0.l(c0640o013);
        c0640o013.J();
        c0601b0.f11650Q = false;
        if (cursor.moveToNext()) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.b(W.R(str), "Got multiple records for app, expected one. appId");
        }
        cursor.close();
        return c0601b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List O(String str, B1 b12, int i7) {
        List list;
        com.google.android.gms.common.internal.G.d(str);
        J();
        K();
        Cursor cursor = null;
        try {
            SQLiteDatabase A02 = A0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String o02 = o0(b12.f11228a);
            String n02 = n0();
            StringBuilder sb2 = new StringBuilder(o02.length() + 17 + n02.length());
            sb2.append("app_id=?");
            sb2.append(o02);
            sb2.append(" AND NOT ");
            sb2.append(n02);
            cursor = A02.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i7 > 0 ? String.valueOf(i7) : null);
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                J1 m02 = m0(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                if (m02 != null) {
                    arrayList.add(m02);
                }
            }
            list = arrayList;
        } catch (SQLiteException e2) {
            try {
                W w10 = ((C0646q0) this.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11577f.c("Error to querying MeasurementBatch from upload_queue. appId", str, e2);
                list = Collections.emptyList();
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public final void O0(C0601b0 c0601b0, boolean z8) {
        J();
        K();
        String D10 = c0601b0.D();
        com.google.android.gms.common.internal.G.g(D10);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", D10);
        B0 b02 = B0.ANALYTICS_STORAGE;
        I1 i12 = this.f12021b;
        if (z8) {
            contentValues.put("app_instance_id", (String) null);
        } else if (i12.a(D10).i(b02)) {
            contentValues.put("app_instance_id", c0601b0.E());
        }
        contentValues.put("gmp_app_id", c0601b0.G());
        boolean i7 = i12.a(D10).i(B0.AD_STORAGE);
        C0646q0 c0646q0 = c0601b0.f11653a;
        if (i7) {
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            c0640o0.J();
            contentValues.put("resettable_device_id_hash", c0601b0.f11657e);
        }
        C0640o0 c0640o02 = c0646q0.f11913u;
        C0646q0.l(c0640o02);
        c0640o02.J();
        contentValues.put("last_bundle_index", Long.valueOf(c0601b0.g));
        C0640o0 c0640o03 = c0646q0.f11913u;
        C0646q0.l(c0640o03);
        c0640o03.J();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c0601b0.f11659h));
        C0640o0 c0640o04 = c0646q0.f11913u;
        C0646q0.l(c0640o04);
        c0640o04.J();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c0601b0.f11660i));
        contentValues.put("app_version", c0601b0.N());
        C0640o0 c0640o05 = c0646q0.f11913u;
        C0646q0.l(c0640o05);
        c0640o05.J();
        contentValues.put("app_store", c0601b0.f11661l);
        C0640o0 c0640o06 = c0646q0.f11913u;
        C0646q0.l(c0640o06);
        c0640o06.J();
        contentValues.put("gmp_version", Long.valueOf(c0601b0.f11662m));
        C0640o0 c0640o07 = c0646q0.f11913u;
        C0646q0.l(c0640o07);
        c0640o07.J();
        contentValues.put("dev_cert_hash", Long.valueOf(c0601b0.f11663n));
        C0640o0 c0640o08 = c0646q0.f11913u;
        C0646q0.l(c0640o08);
        c0640o08.J();
        contentValues.put("measurement_enabled", Boolean.valueOf(c0601b0.f11664o));
        C0640o0 c0640o09 = c0646q0.f11913u;
        C0646q0.l(c0640o09);
        c0640o09.J();
        contentValues.put("day", Long.valueOf(c0601b0.f11644J));
        C0640o0 c0640o010 = c0646q0.f11913u;
        C0646q0.l(c0640o010);
        c0640o010.J();
        contentValues.put("daily_public_events_count", Long.valueOf(c0601b0.f11645K));
        C0646q0.l(c0640o010);
        c0640o010.J();
        contentValues.put("daily_events_count", Long.valueOf(c0601b0.L));
        C0646q0.l(c0640o010);
        c0640o010.J();
        contentValues.put("daily_conversions_count", Long.valueOf(c0601b0.f11646M));
        C0640o0 c0640o011 = c0646q0.f11913u;
        C0646q0.l(c0640o011);
        c0640o011.J();
        contentValues.put("config_fetched_time", Long.valueOf(c0601b0.f11651R));
        C0640o0 c0640o012 = c0646q0.f11913u;
        C0646q0.l(c0640o012);
        c0640o012.J();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c0601b0.f11652S));
        contentValues.put("app_version_int", Long.valueOf(c0601b0.P()));
        contentValues.put("firebase_instance_id", c0601b0.J());
        C0646q0.l(c0640o010);
        c0640o010.J();
        contentValues.put("daily_error_events_count", Long.valueOf(c0601b0.f11647N));
        C0646q0.l(c0640o010);
        c0640o010.J();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c0601b0.f11648O));
        C0646q0.l(c0640o010);
        c0640o010.J();
        contentValues.put("health_monitor_sample", c0601b0.f11649P);
        contentValues.put("android_id", (Long) 0L);
        C0640o0 c0640o013 = c0646q0.f11913u;
        C0646q0.l(c0640o013);
        c0640o013.J();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c0601b0.f11665p));
        contentValues.put("dynamite_version", Long.valueOf(c0601b0.b()));
        if (i12.a(D10).i(b02)) {
            C0640o0 c0640o014 = c0646q0.f11913u;
            C0646q0.l(c0640o014);
            c0640o014.J();
            contentValues.put("session_stitching_token", c0601b0.f11669t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c0601b0.y()));
        C0640o0 c0640o015 = c0646q0.f11913u;
        C0646q0.l(c0640o015);
        c0640o015.J();
        contentValues.put("target_os_version", Long.valueOf(c0601b0.f11671v));
        C0640o0 c0640o016 = c0646q0.f11913u;
        C0646q0.l(c0640o016);
        c0640o016.J();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c0601b0.f11672w));
        zzql.zza();
        C0646q0 c0646q02 = (C0646q0) this.f3094a;
        if (c0646q02.f11910d.T(D10, F.f11283P0)) {
            C0640o0 c0640o017 = c0646q0.f11913u;
            C0646q0.l(c0640o017);
            c0640o017.J();
            contentValues.put("ad_services_version", Integer.valueOf(c0601b0.f11673x));
            C0640o0 c0640o018 = c0646q0.f11913u;
            C0646q0.l(c0640o018);
            c0640o018.J();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c0601b0.f11636B));
        }
        C0640o0 c0640o019 = c0646q0.f11913u;
        C0646q0.l(c0640o019);
        c0640o019.J();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c0601b0.f11674y));
        contentValues.put("npa_metadata_value", c0601b0.w());
        C0640o0 c0640o020 = c0646q0.f11913u;
        C0646q0.l(c0640o020);
        c0640o020.J();
        contentValues.put("bundle_delivery_index", Long.valueOf(c0601b0.f11640F));
        contentValues.put("sgtm_preview_key", c0601b0.C());
        C0646q0.l(c0640o010);
        c0640o010.J();
        contentValues.put("dma_consent_state", Integer.valueOf(c0601b0.f11638D));
        C0646q0.l(c0640o010);
        c0640o010.J();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c0601b0.f11639E));
        contentValues.put("serialized_npa_metadata", c0601b0.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c0601b0.t()));
        C0640o0 c0640o021 = c0646q0.f11913u;
        C0646q0.l(c0640o021);
        c0640o021.J();
        ArrayList arrayList = c0601b0.f11668s;
        W w10 = c0646q02.f11912f;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C0646q0.l(w10);
                w10.f11580w.b(D10, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        zzpn.zza();
        if (c0646q02.f11910d.T(null, F.f11274K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C0640o0 c0640o022 = c0646q0.f11913u;
        C0646q0.l(c0640o022);
        c0640o022.J();
        contentValues.put("unmatched_pfo", c0601b0.f11675z);
        C0640o0 c0640o023 = c0646q0.f11913u;
        C0646q0.l(c0640o023);
        c0640o023.J();
        contentValues.put("unmatched_uwa", c0601b0.f11635A);
        C0640o0 c0640o024 = c0646q0.f11913u;
        C0646q0.l(c0640o024);
        c0640o024.J();
        contentValues.put("ad_campaign_info", c0601b0.f11642H);
        try {
            SQLiteDatabase A02 = A0();
            if (A02.update("apps", contentValues, "app_id = ?", new String[]{D10}) == 0 && A02.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                C0646q0.l(w10);
                w10.f11577f.b(W.R(D10), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e2) {
            C0646q0.l(w10);
            w10.f11577f.c("Error storing app. appId", W.R(D10), e2);
        }
    }

    public final boolean P(String str) {
        Y0[] y0Arr = {Y0.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(y0Arr[0].f11603a));
        String o02 = o0(arrayList);
        String n02 = n0();
        StringBuilder sb2 = new StringBuilder(o02.length() + 61 + n02.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(o02);
        sb2.append(" AND NOT ");
        sb2.append(n02);
        return f0(sb2.toString(), new String[]{str}) != 0;
    }

    public final C0624j P0(long j, String str, boolean z8, boolean z10, boolean z11, boolean z12) {
        return Q0(j, str, 1L, false, false, z8, false, z10, z11, z12);
    }

    public final void Q(Long l10) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        J();
        K();
        try {
            if (A0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11580w.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e2) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.b(e2, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Y5.j, java.lang.Object] */
    public final C0624j Q0(long j, String str, long j10, boolean z8, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.d(str);
        J();
        K();
        String[] strArr = {str};
        ?? obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase A02 = A0();
                cursor = A02.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j) {
                        obj.f11782b = cursor.getLong(1);
                        obj.f11781a = cursor.getLong(2);
                        obj.f11783c = cursor.getLong(3);
                        obj.f11784d = cursor.getLong(4);
                        obj.f11785e = cursor.getLong(5);
                        obj.f11786f = cursor.getLong(6);
                        obj.g = cursor.getLong(7);
                    }
                    if (z8) {
                        obj.f11782b += j10;
                    }
                    if (z10) {
                        obj.f11781a += j10;
                    }
                    if (z11) {
                        obj.f11783c += j10;
                    }
                    if (z12) {
                        obj.f11784d += j10;
                    }
                    if (z13) {
                        obj.f11785e += j10;
                    }
                    if (z14) {
                        obj.f11786f += j10;
                    }
                    if (z15) {
                        obj.g += j10;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(obj.f11781a));
                    contentValues.put("daily_events_count", Long.valueOf(obj.f11782b));
                    contentValues.put("daily_conversions_count", Long.valueOf(obj.f11783c));
                    contentValues.put("daily_error_events_count", Long.valueOf(obj.f11784d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(obj.f11785e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.f11786f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(obj.g));
                    A02.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11580w.b(W.R(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e2) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11577f.c("Error updating daily counts. appId", W.R(str), e2);
            }
            if (cursor != null) {
                cursor.close();
            }
            return obj;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String R() {
        SQLiteException e2;
        Cursor cursor;
        SQLiteDatabase A02 = A0();
        ?? r12 = 0;
        try {
            try {
                cursor = A02.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e10) {
                    e2 = e10;
                    W w10 = ((C0646q0) this.f3094a).f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.b(e2, "Database error getting next bundle app id");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                r12 = A02;
                th = th;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e2 = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r12 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q7.h R0(String str) {
        SQLiteException e2;
        Cursor cursor;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.d(str);
        J();
        K();
        Cursor cursor2 = null;
        try {
            cursor = A0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            W w10 = c0646q0.f11912f;
                            C0646q0.l(w10);
                            w10.f11577f.b(W.R(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            Q7.h hVar = new Q7.h(blob, string, string2, 11);
                            cursor.close();
                            return hVar;
                        }
                    }
                } catch (SQLiteException e10) {
                    e2 = e10;
                    W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.c("Error querying remote config. appId", W.R(str), e2);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e2 = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void S(long j) {
        J();
        K();
        try {
            if (A0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.b(e2, "Failed to delete a bundle in a queue table");
            throw e2;
        }
    }

    public final void S0(zzid zzidVar, boolean z8) {
        J();
        K();
        com.google.android.gms.common.internal.G.g(zzidVar);
        com.google.android.gms.common.internal.G.d(zzidVar.zzA());
        com.google.android.gms.common.internal.G.j(zzidVar.zzn());
        T();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        c0646q0.f11917y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long zzo = zzidVar.zzo();
        E e2 = F.f11286R;
        long longValue = currentTimeMillis - ((Long) e2.a(null)).longValue();
        W w10 = c0646q0.f11912f;
        if (zzo < longValue || zzidVar.zzo() > ((Long) e2.a(null)).longValue() + currentTimeMillis) {
            C0646q0.l(w10);
            w10.f11580w.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", W.R(zzidVar.zzA()), Long.valueOf(currentTimeMillis), Long.valueOf(zzidVar.zzo()));
        }
        byte[] zzcc = zzidVar.zzcc();
        try {
            C0598a0 c0598a0 = this.f12021b.f11409u;
            I1.S(c0598a0);
            byte[] v02 = c0598a0.v0(zzcc);
            C0646q0.l(w10);
            w10.f11573B.b(Integer.valueOf(v02.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzidVar.zzA());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.zzo()));
            contentValues.put("data", v02);
            contentValues.put("has_realtime", Integer.valueOf(z8 ? 1 : 0));
            if (zzidVar.zzaa()) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.zzab()));
            }
            try {
                if (A0().insert("queue", null, contentValues) == -1) {
                    C0646q0.l(w10);
                    w10.f11577f.b(W.R(zzidVar.zzA()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e10) {
                C0646q0.l(w10);
                w10.f11577f.c("Error storing bundle. appId", W.R(zzidVar.zzA()), e10);
            }
        } catch (IOException e11) {
            C0646q0.l(w10);
            w10.f11577f.c("Data loss. Failed to serialize bundle. appId", W.R(zzidVar.zzA()), e11);
        }
    }

    public final void T() {
        J();
        K();
        if (u0()) {
            I1 i12 = this.f12021b;
            long f4 = i12.f11411w.f11851e.f();
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            c0646q0.f11917y.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - f4) > ((Long) F.f11276M.a(null)).longValue()) {
                i12.f11411w.f11851e.g(elapsedRealtime);
                J();
                K();
                if (u0()) {
                    SQLiteDatabase A02 = A0();
                    c0646q0.f11917y.getClass();
                    int delete = A02.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) F.f11286R.a(null)).longValue())});
                    if (delete > 0) {
                        W w10 = c0646q0.f11912f;
                        C0646q0.l(w10);
                        w10.f11573B.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void U(ArrayList arrayList) {
        J();
        K();
        com.google.android.gms.common.internal.G.g(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (u0()) {
            String join = TextUtils.join(",", arrayList);
            String m10 = A3.c.m(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            long f02 = f0(A3.c.m(new StringBuilder(m10.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", m10, " AND retry_count =  2147483647 LIMIT 1"), null);
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            if (f02 > 0) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11580w.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase A02 = A0();
                StringBuilder sb2 = new StringBuilder(m10.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(m10);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                A02.execSQL(sb2.toString());
            } catch (SQLiteException e2) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11577f.b(e2, "Error incrementing retry count. error");
            }
        }
    }

    public final void V(Long l10) {
        J();
        K();
        if (u0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            long f02 = f0(sb2.toString(), null);
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            if (f02 > 0) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11580w.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase A02 = A0();
                c0646q0.f11917y.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(currentTimeMillis);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder(sb4.length() + 34 + l10.toString().length() + 29);
                sb5.append("UPDATE upload_queue");
                sb5.append(sb4);
                sb5.append(" WHERE rowid = ");
                sb5.append(l10);
                sb5.append(" AND retry_count < 2147483647");
                A02.execSQL(sb5.toString());
            } catch (SQLiteException e2) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11577f.b(e2, "Error incrementing retry count. error");
            }
        }
    }

    public final Object W(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (type == 0) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type == 4) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
        W w12 = c0646q0.f11912f;
        C0646q0.l(w12);
        w12.f11577f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.f11912f;
        Y5.C0646q0.l(r0);
        r0.f11577f.d("Error inserting column. appId", Y5.W.R(r14), "first_open_count", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long X(String str) {
        long j;
        long g02;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.d("first_open_count");
        J();
        K();
        SQLiteDatabase A02 = A0();
        A02.beginTransaction();
        long j10 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select first_open_count from app2 where app_id=?");
                j = -1;
                g02 = g0(sb2.toString(), new String[]{str}, -1L);
            } catch (SQLiteException e2) {
                e = e2;
            }
            if (g02 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (A02.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.c("Failed to insert column (got -1). appId", W.R(str), "first_open_count");
                    return j;
                }
                g02 = 0;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + g02));
            if (A02.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11577f.c("Failed to update column (got 0). appId", W.R(str), "first_open_count");
            } else {
                A02.setTransactionSuccessful();
                j = g02;
            }
            return j;
        } finally {
            A02.endTransaction();
        }
    }

    public final boolean Y(String str, String str2) {
        return f0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final void Z(ArrayList arrayList) {
        com.google.android.gms.common.internal.G.g(arrayList);
        J();
        K();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (i7 != 0) {
                sb2.append(",");
            }
            sb2.append(((Long) arrayList.get(i7)).longValue());
        }
        sb2.append(")");
        int delete = A0().delete("raw_events", sb2.toString(), null);
        if (delete != arrayList.size()) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(arrayList.size()));
        }
    }

    public final void a0(String str) {
        try {
            A0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.c("Failed to remove unused event metadata. appId", W.R(str), e2);
        }
    }

    public final long b0(String str) {
        com.google.android.gms.common.internal.G.d(str);
        return g0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void c0(String str, Long l10, long j, zzhs zzhsVar) {
        J();
        K();
        com.google.android.gms.common.internal.G.g(zzhsVar);
        com.google.android.gms.common.internal.G.d(str);
        byte[] zzcc = zzhsVar.zzcc();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        W w10 = c0646q0.f11912f;
        W w11 = c0646q0.f11912f;
        C0646q0.l(w10);
        w10.f11573B.c("Saving complex main event, appId, data size", c0646q0.f11916x.a(str), Integer.valueOf(zzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", zzcc);
        try {
            if (A0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                C0646q0.l(w11);
                w11.f11577f.b(W.R(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e2) {
            C0646q0.l(w11);
            w11.f11577f.c("Error storing complex main event. appId", W.R(str), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a4 A[Catch: SQLiteException -> 0x02be, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x02be, blocks: (B:67:0x0289, B:69:0x02a4), top: B:66:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(String str, Long l10, String str2, Bundle bundle) {
        Iterator it;
        String string;
        String zzd;
        Bundle bundle2;
        W w10;
        long update;
        Iterator it2;
        zzid zzidVar;
        Cursor query;
        C0633m c0633m = this;
        com.google.android.gms.common.internal.G.g(bundle);
        J();
        K();
        C0096i1 c0096i1 = l10 != null ? new C0096i1(c0633m, str, l10.longValue()) : new C0096i1(c0633m, str);
        List<C0627k> a9 = c0096i1.a();
        while (!a9.isEmpty()) {
            for (C0627k c0627k : a9) {
                boolean isEmpty = TextUtils.isEmpty(str2);
                C0646q0 c0646q0 = (C0646q0) c0633m.f3094a;
                if (!isEmpty) {
                    Cursor cursor = null;
                    zzid zzidVar2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = A0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str, Long.toString(c0627k.f11793b)}, null, null, "rowid", "2");
                        } catch (SQLiteException e2) {
                            e = e2;
                            zzidVar = null;
                        }
                        try {
                            try {
                            } catch (SQLiteException e10) {
                                e = e10;
                                zzidVar = null;
                            }
                            if (query.moveToFirst()) {
                                try {
                                    zzidVar = (zzid) ((zzic) C0598a0.w0(zzid.zzaE(), query.getBlob(0))).zzbc();
                                    try {
                                        if (query.moveToNext()) {
                                            W w11 = c0646q0.f11912f;
                                            C0646q0.l(w11);
                                            w11.f11580w.b(W.R(str), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        query.close();
                                        query.close();
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        cursor2 = query;
                                        W w12 = c0646q0.f11912f;
                                        C0646q0.l(w12);
                                        w12.f11577f.c("Data loss. Error selecting raw event. appId", W.R(str), e);
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        zzidVar2 = zzidVar;
                                        if (zzidVar2 != null) {
                                        }
                                        I1 i12 = c0633m.f12021b;
                                        C0598a0 c0598a0 = i12.f11409u;
                                        I1.S(c0598a0);
                                        zzhs zzhsVar = c0627k.f11795d;
                                        Bundle bundle3 = new Bundle();
                                        it = zzhsVar.zza().iterator();
                                        while (it.hasNext()) {
                                        }
                                        string = bundle3.getString("_o");
                                        bundle3.remove("_o");
                                        zzd = zzhsVar.zzd();
                                        if (string == null) {
                                        }
                                        zzhsVar.zzf();
                                        M1 m12 = c0646q0.f11915w;
                                        W w13 = c0646q0.f11912f;
                                        C0646q0.j(m12);
                                        if (zzd.equals("_cmp")) {
                                        }
                                        m12.U(bundle3, bundle2);
                                        S4.k kVar = new S4.k((C0646q0) c0633m.f3094a, string, str, zzhsVar.zzd(), zzhsVar.zzf(), zzhsVar.zzh(), bundle3);
                                        long j = c0627k.f11792a;
                                        J();
                                        K();
                                        String str3 = (String) kVar.f9132d;
                                        com.google.android.gms.common.internal.G.d(str3);
                                        C0598a0 c0598a02 = i12.f11409u;
                                        I1.S(c0598a02);
                                        byte[] zzcc = c0598a02.l0(kVar).zzcc();
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("app_id", str3);
                                        contentValues.put("name", (String) kVar.f9133e);
                                        contentValues.put("timestamp", Long.valueOf(kVar.f9130b));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(c0627k.f11793b));
                                        contentValues.put("data", zzcc);
                                        contentValues.put("realtime", Integer.valueOf(c0627k.f11794c ? 1 : 0));
                                        update = A0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                                        if (update != 1) {
                                        }
                                        c0633m = this;
                                    }
                                    zzidVar2 = zzidVar;
                                } catch (IOException e12) {
                                    W w14 = c0646q0.f11912f;
                                    C0646q0.l(w14);
                                    w14.f11577f.c("Data loss. Failed to merge raw event metadata. appId", W.R(str), e12);
                                }
                                if (zzidVar2 != null) {
                                    Iterator it3 = zzidVar2.zzf().iterator();
                                    while (it3.hasNext()) {
                                        if (((zziu) it3.next()).zzc().equals(str2)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                W w15 = c0646q0.f11912f;
                                C0646q0.l(w15);
                                w15.f11577f.b(W.R(str), "Raw event metadata record is missing. appId");
                            }
                            query.close();
                            if (zzidVar2 != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                I1 i122 = c0633m.f12021b;
                C0598a0 c0598a03 = i122.f11409u;
                I1.S(c0598a03);
                zzhs zzhsVar2 = c0627k.f11795d;
                Bundle bundle32 = new Bundle();
                it = zzhsVar2.zza().iterator();
                while (it.hasNext()) {
                    zzhw zzhwVar = (zzhw) it.next();
                    if (zzhwVar.zzi()) {
                        it2 = it;
                        bundle32.putDouble(zzhwVar.zzb(), zzhwVar.zzj());
                    } else {
                        it2 = it;
                        if (zzhwVar.zzg()) {
                            bundle32.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                        } else if (zzhwVar.zze()) {
                            bundle32.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                        } else if (zzhwVar.zzc()) {
                            bundle32.putString(zzhwVar.zzb(), zzhwVar.zzd());
                        } else if (zzhwVar.zzk().isEmpty()) {
                            W w16 = ((C0646q0) c0598a03.f3094a).f11912f;
                            C0646q0.l(w16);
                            w16.f11577f.b(zzhwVar, "Unexpected parameter type for parameter");
                        } else {
                            bundle32.putParcelableArray(zzhwVar.zzb(), C0598a0.y0(zzhwVar.zzk()));
                        }
                    }
                    it = it2;
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                zzd = zzhsVar2.zzd();
                if (string == null) {
                    string = "";
                }
                zzhsVar2.zzf();
                M1 m122 = c0646q0.f11915w;
                W w132 = c0646q0.f11912f;
                C0646q0.j(m122);
                if (zzd.equals("_cmp")) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    Iterator<String> it4 = bundle.keySet().iterator();
                    while (it4.hasNext()) {
                        String next = it4.next();
                        Iterator<String> it5 = it4;
                        if (next.startsWith("gad_")) {
                            bundle2.remove(next);
                        }
                        it4 = it5;
                    }
                }
                m122.U(bundle32, bundle2);
                S4.k kVar2 = new S4.k((C0646q0) c0633m.f3094a, string, str, zzhsVar2.zzd(), zzhsVar2.zzf(), zzhsVar2.zzh(), bundle32);
                long j10 = c0627k.f11792a;
                J();
                K();
                String str32 = (String) kVar2.f9132d;
                com.google.android.gms.common.internal.G.d(str32);
                C0598a0 c0598a022 = i122.f11409u;
                I1.S(c0598a022);
                byte[] zzcc2 = c0598a022.l0(kVar2).zzcc();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str32);
                contentValues2.put("name", (String) kVar2.f9133e);
                contentValues2.put("timestamp", Long.valueOf(kVar2.f9130b));
                contentValues2.put("metadata_fingerprint", Long.valueOf(c0627k.f11793b));
                contentValues2.put("data", zzcc2);
                contentValues2.put("realtime", Integer.valueOf(c0627k.f11794c ? 1 : 0));
                try {
                    update = A0().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j10)});
                    if (update != 1) {
                        C0646q0.l(w132);
                        w10 = w132;
                        try {
                            w10.f11577f.c("Failed to update raw event. appId, updatedRows", W.R(str32), Long.valueOf(update));
                        } catch (SQLiteException e13) {
                            e = e13;
                            C0646q0.l(w10);
                            w10.f11577f.c("Error updating raw event. appId", W.R(str32), e);
                            c0633m = this;
                        }
                    }
                } catch (SQLiteException e14) {
                    e = e14;
                    w10 = w132;
                }
                c0633m = this;
            }
            a9 = c0096i1.a();
            c0633m = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0 e0(String str) {
        Throwable th;
        SQLiteException e2;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.g(str);
        J();
        K();
        ?? r52 = {str};
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        C0 c02 = null;
        try {
            try {
                r52 = A0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", r52);
                try {
                    if (r52.moveToFirst()) {
                        c02 = C0.c(r52.getInt(1), r52.getString(0));
                    } else {
                        W w10 = c0646q0.f11912f;
                        C0646q0.l(w10);
                        w10.f11573B.a("No data found");
                    }
                } catch (SQLiteException e10) {
                    e2 = e10;
                    W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.b(e2, "Error querying database.");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = r52;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e2 = e11;
            r52 = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        r52.close();
        return c02 == null ? C0.f11229c : c02;
    }

    public final long f0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = A0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (SQLiteException e2) {
                W w10 = ((C0646q0) this.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11577f.c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long g0(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = A0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e2) {
                W w10 = ((C0646q0) this.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11577f.c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String h0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = A0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e2) {
                W w10 = ((C0646q0) this.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11577f.c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void i0(ContentValues contentValues) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        try {
            SQLiteDatabase A02 = A0();
            if (contentValues.getAsString("app_id") == null) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11579v.b(W.R("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (A02.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && A02.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11577f.c("Failed to insert/update table (got -1). key", W.R("consent_settings"), W.R("app_id"));
            }
        } catch (SQLiteException e2) {
            W w12 = c0646q0.f11912f;
            C0646q0.l(w12);
            w12.f11577f.d("Error storing into table. key", W.R("consent_settings"), W.R("app_id"), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0645q j0(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.d(str2);
        com.google.android.gms.common.internal.G.d(str3);
        J();
        K();
        Cursor cursor2 = null;
        try {
            cursor = A0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.d("Error querying events. appId", W.R(str2), c0646q0.f11916x.a(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        long j = cursor.getLong(0);
        long j10 = cursor.getLong(1);
        long j11 = cursor.getLong(2);
        long j12 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        C0645q c0645q = new C0645q(str2, str3, j, j10, cursor.isNull(8) ? 0L : cursor.getLong(8), j11, j12, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.b(W.R(str2), "Got multiple records for event aggregates, expected one. appId");
        }
        cursor.close();
        return c0645q;
    }

    public final void k0(String str, C0645q c0645q) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        com.google.android.gms.common.internal.G.g(c0645q);
        J();
        K();
        ContentValues contentValues = new ContentValues();
        String str2 = c0645q.f11881a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c0645q.f11882b);
        contentValues.put("lifetime_count", Long.valueOf(c0645q.f11883c));
        contentValues.put("current_bundle_count", Long.valueOf(c0645q.f11884d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c0645q.f11886f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c0645q.g));
        contentValues.put("last_bundled_day", c0645q.f11887h);
        contentValues.put("last_sampled_complex_event_id", c0645q.f11888i);
        contentValues.put("last_sampling_rate", c0645q.j);
        contentValues.put("current_session_count", Long.valueOf(c0645q.f11885e));
        Boolean bool = c0645q.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (A0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11577f.b(W.R(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e2) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.c("Error storing event aggregates. appId", W.R(str2), e2);
        }
    }

    public final void l0(String str, String str2) {
        com.google.android.gms.common.internal.G.d(str2);
        J();
        K();
        try {
            A0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.c("Error deleting snapshot. appId", W.R(str2), e2);
        }
    }

    public final J1 m0(String str, long j, byte[] bArr, String str2, String str3, int i7, int i10, long j10, long j11, long j12) {
        C0646q0 c0646q0;
        zzhz zzhzVar;
        Y0 y02;
        HashMap hashMap;
        boolean isEmpty = TextUtils.isEmpty(str2);
        C0646q0 c0646q02 = (C0646q0) this.f3094a;
        if (isEmpty) {
            W w10 = c0646q02.f11912f;
            C0646q0.l(w10);
            w10.f11572A.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            zzhzVar = (zzhz) C0598a0.w0(zzib.zzh(), bArr);
            Y0[] values = Y0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    y02 = Y0.UNKNOWN;
                    break;
                }
                y02 = values[i11];
                if (y02.f11603a == i7) {
                    break;
                }
                i11++;
            }
            if (y02 != Y0.GOOGLE_SIGNAL && y02 != Y0.GOOGLE_SIGNAL_PENDING && i10 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhzVar.zza().iterator();
                while (it.hasNext()) {
                    zzic zzicVar = (zzic) ((zzid) it.next()).zzcl();
                    zzicVar.zzao(i10);
                    arrayList.add((zzid) zzicVar.zzbc());
                }
                zzhzVar.zzg();
                zzhzVar.zzf(arrayList);
            }
            hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    String str4 = split[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        W w11 = c0646q02.f11912f;
                        C0646q0.l(w11);
                        w11.f11577f.b(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i12++;
                }
            }
            c0646q0 = c0646q02;
        } catch (IOException e2) {
            e = e2;
            c0646q0 = c0646q02;
        }
        try {
            return new J1(j, (zzib) zzhzVar.zzbc(), str2, hashMap, y02, j10, j11, j12, i10);
        } catch (IOException e10) {
            e = e10;
            W w12 = c0646q0.f11912f;
            C0646q0.l(w12);
            w12.f11577f.c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    public final String n0() {
        ((C0646q0) this.f3094a).f11917y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l10 = (Long) F.f11288S.a(null);
        l10.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l10 + ")";
        String f4 = X.c.f(((Long) F.f11286R.a(null)).longValue(), ")", X.c.l(currentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "));
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + f4.length() + 1);
        h3.o.v(sb2, "(", str, " OR ", f4);
        sb2.append(")");
        return sb2.toString();
    }

    public final void p0(String str, x1 x1Var) {
        J();
        K();
        com.google.android.gms.common.internal.G.d(str);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        c0646q0.f11917y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        E e2 = F.f11354v0;
        long longValue = currentTimeMillis - ((Long) e2.a(null)).longValue();
        long j = x1Var.f11994b;
        W w10 = c0646q0.f11912f;
        if (j < longValue || j > ((Long) e2.a(null)).longValue() + currentTimeMillis) {
            C0646q0.l(w10);
            w10.f11580w.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", W.R(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        C0646q0.l(w10);
        w10.f11573B.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", x1Var.f11993a);
        contentValues.put("source", Integer.valueOf(x1Var.f11995c));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (A0().insert("trigger_uris", null, contentValues) == -1) {
                C0646q0.l(w10);
                w10.f11577f.b(W.R(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e10) {
            C0646q0.l(w10);
            w10.f11577f.c("Error storing trigger URI. appId", W.R(str), e10);
        }
    }

    public final void q0(String str, C0 c02) {
        com.google.android.gms.common.internal.G.g(str);
        com.google.android.gms.common.internal.G.g(c02);
        J();
        K();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c02.g());
        contentValues.put("consent_source", Integer.valueOf(c02.f11231b));
        i0(contentValues);
    }

    public final void r0(String str, C0 c02) {
        com.google.android.gms.common.internal.G.g(str);
        J();
        K();
        q0(str, e0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c02.g());
        i0(contentValues);
    }

    public final C0 s0(String str) {
        com.google.android.gms.common.internal.G.g(str);
        J();
        K();
        return C0.c(100, h0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final C0645q t0(String str, zzhs zzhsVar, String str2) {
        C0645q j02 = j0("events", str, zzhsVar.zzd());
        if (j02 != null) {
            long j = j02.f11885e + 1;
            long j10 = j02.f11884d + 1;
            return new C0645q(j02.f11881a, j02.f11882b, j02.f11883c + 1, j10, j, j02.f11886f, j02.g, j02.f11887h, j02.f11888i, j02.j, j02.k);
        }
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        w10.f11580w.c("Event aggregate wasn't created during raw event logging. appId, event", W.R(str), c0646q0.f11916x.a(str2));
        return new C0645q(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
    }

    public final boolean u0() {
        return ((C0646q0) this.f3094a).f11907a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ec A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(String str, long j, long j10, E3.d dVar) {
        ?? r82;
        String str2;
        SQLiteDatabase A02;
        String[] strArr;
        String str3;
        String string;
        String str4;
        String[] strArr2;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        J();
        K();
        Cursor cursor = null;
        try {
            try {
                A02 = A0();
                r82 = TextUtils.isEmpty(str);
            } catch (SQLiteException e2) {
                e = e2;
                r82 = str;
            }
            if (r82 != 0) {
                String[] strArr3 = j10 != -1 ? new String[]{String.valueOf(j10), String.valueOf(j)} : new String[]{String.valueOf(j)};
                str3 = j10 != -1 ? "rowid <= ? and " : "";
                StringBuilder sb2 = new StringBuilder(str3.length() + 148);
                sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                sb2.append(str3);
                sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = A02.rawQuery(sb2.toString(), strArr3);
                try {
                } catch (SQLiteException e10) {
                    e = e10;
                    str2 = str;
                }
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = cursor.getString(0);
                try {
                    string = cursor.getString(1);
                    cursor.close();
                } catch (SQLiteException e11) {
                    e = e11;
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11577f.c("Data loss. Error selecting raw event. appId", W.R(str2), e);
                }
            } else {
                try {
                    if (j10 != -1) {
                        String str5 = str;
                        strArr = new String[]{str5, String.valueOf(j10)};
                        r82 = str5;
                    } else {
                        r82 = str;
                        strArr = new String[]{str};
                    }
                    str3 = j10 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb3 = new StringBuilder(str3.length() + 84);
                    sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb3.append(str3);
                    sb3.append(" order by rowid limit 1;");
                    cursor = A02.rawQuery(sb3.toString(), strArr);
                } catch (SQLiteException e12) {
                    e = e12;
                    str2 = r82;
                    W w102 = c0646q0.f11912f;
                    C0646q0.l(w102);
                    w102.f11577f.c("Data loss. Error selecting raw event. appId", W.R(str2), e);
                }
                if (cursor.moveToFirst()) {
                    string = cursor.getString(0);
                    cursor.close();
                    str2 = r82;
                }
            }
            cursor = A02.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, string}, null, null, "rowid", "2");
            if (cursor.moveToFirst()) {
                try {
                    zzid zzidVar = (zzid) ((zzic) C0598a0.w0(zzid.zzaE(), cursor.getBlob(0))).zzbc();
                    if (cursor.moveToNext()) {
                        W w11 = c0646q0.f11912f;
                        C0646q0.l(w11);
                        w11.f11580w.b(W.R(str2), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursor.close();
                    com.google.android.gms.common.internal.G.g(zzidVar);
                    dVar.f3525b = zzidVar;
                    if (j10 != -1) {
                        str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr2 = new String[]{str2, string, String.valueOf(j10)};
                    } else {
                        str4 = "app_id = ? and metadata_fingerprint = ?";
                        strArr2 = new String[]{str2, string};
                    }
                    cursor = A02.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str4, strArr2, null, null, "rowid", null);
                    if (!cursor.moveToFirst()) {
                        W w12 = c0646q0.f11912f;
                        C0646q0.l(w12);
                        w12.f11580w.b(W.R(str2), "Raw event data disappeared while in transaction. appId");
                    }
                    do {
                        long j11 = cursor.getLong(0);
                        try {
                            zzhr zzhrVar = (zzhr) C0598a0.w0(zzhs.zzk(), cursor.getBlob(3));
                            zzhrVar.zzl(cursor.getString(1));
                            zzhrVar.zzo(cursor.getLong(2));
                            if (!dVar.f(j11, (zzhs) zzhrVar.zzbc())) {
                                break;
                            }
                        } catch (IOException e13) {
                            W w13 = c0646q0.f11912f;
                            C0646q0.l(w13);
                            w13.f11577f.c("Data loss. Failed to merge raw event. appId", W.R(str2), e13);
                        }
                    } while (cursor.moveToNext());
                } catch (IOException e14) {
                    W w14 = c0646q0.f11912f;
                    C0646q0.l(w14);
                    w14.f11577f.c("Data loss. Failed to merge raw event metadata. appId", W.R(str2), e14);
                }
            } else {
                W w15 = c0646q0.f11912f;
                C0646q0.l(w15);
                w15.f11577f.b(W.R(str2), "Raw event metadata record is missing. appId");
            }
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public final void x0() {
        K();
        A0().beginTransaction();
    }

    public final void y0() {
        K();
        A0().setTransactionSuccessful();
    }

    public final void z0() {
        K();
        A0().endTransaction();
    }
}
