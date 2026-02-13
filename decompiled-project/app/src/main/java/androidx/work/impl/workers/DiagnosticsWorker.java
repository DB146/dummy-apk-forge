package androidx.work.impl.workers;

import I2.AbstractC0315d;
import I2.H;
import P2.j;
import Q5.e;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import h3.C1243e;
import h3.C1249k;
import h3.w;
import h3.x;
import h3.z;
import i3.p;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import q3.i;
import q3.q;
import q3.s;
import r3.C1921e;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        l.e(context, "context");
        l.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final w c() {
        H h10;
        i iVar;
        q3.l lVar;
        s sVar;
        int i7;
        boolean z8;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        p N10 = p.N(this.f17718a);
        l.d(N10, "getInstance(applicationContext)");
        WorkDatabase workDatabase = N10.f18380d;
        l.d(workDatabase, "workManager.workDatabase");
        q C2 = workDatabase.C();
        q3.l A10 = workDatabase.A();
        s D10 = workDatabase.D();
        i z14 = workDatabase.z();
        N10.f18379c.f17671d.getClass();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        C2.getClass();
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        a9.f(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = C2.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = j.n(workDatabase_Impl, a9);
        try {
            int i14 = j.i(n6, "id");
            int i15 = j.i(n6, "state");
            int i16 = j.i(n6, "worker_class_name");
            int i17 = j.i(n6, "input_merger_class_name");
            int i18 = j.i(n6, "input");
            int i19 = j.i(n6, "output");
            int i20 = j.i(n6, "initial_delay");
            int i21 = j.i(n6, "interval_duration");
            int i22 = j.i(n6, "flex_duration");
            int i23 = j.i(n6, "run_attempt_count");
            int i24 = j.i(n6, "backoff_policy");
            int i25 = j.i(n6, "backoff_delay_duration");
            int i26 = j.i(n6, "last_enqueue_time");
            int i27 = j.i(n6, "minimum_retention_duration");
            h10 = a9;
            try {
                int i28 = j.i(n6, "schedule_requested_at");
                int i29 = j.i(n6, "run_in_foreground");
                int i30 = j.i(n6, "out_of_quota_policy");
                int i31 = j.i(n6, "period_count");
                int i32 = j.i(n6, "generation");
                int i33 = j.i(n6, "next_schedule_time_override");
                int i34 = j.i(n6, "next_schedule_time_override_generation");
                int i35 = j.i(n6, "stop_reason");
                int i36 = j.i(n6, "trace_tag");
                int i37 = j.i(n6, "required_network_type");
                int i38 = j.i(n6, "required_network_request");
                int i39 = j.i(n6, "requires_charging");
                int i40 = j.i(n6, "requires_device_idle");
                int i41 = j.i(n6, "requires_battery_not_low");
                int i42 = j.i(n6, "requires_storage_not_low");
                int i43 = j.i(n6, "trigger_content_update_delay");
                int i44 = j.i(n6, "trigger_max_content_delay");
                int i45 = j.i(n6, "content_uri_triggers");
                int i46 = i27;
                ArrayList arrayList = new ArrayList(n6.getCount());
                while (n6.moveToNext()) {
                    String string = n6.getString(i14);
                    int B10 = e.B(n6.getInt(i15));
                    String string2 = n6.getString(i16);
                    String string3 = n6.getString(i17);
                    C1249k a10 = C1249k.a(n6.getBlob(i18));
                    C1249k a11 = C1249k.a(n6.getBlob(i19));
                    long j = n6.getLong(i20);
                    long j10 = n6.getLong(i21);
                    long j11 = n6.getLong(i22);
                    int i47 = n6.getInt(i23);
                    int y10 = e.y(n6.getInt(i24));
                    long j12 = n6.getLong(i25);
                    long j13 = n6.getLong(i26);
                    int i48 = i46;
                    long j14 = n6.getLong(i48);
                    int i49 = i14;
                    int i50 = i28;
                    long j15 = n6.getLong(i50);
                    i28 = i50;
                    int i51 = i29;
                    if (n6.getInt(i51) != 0) {
                        i29 = i51;
                        i7 = i30;
                        z8 = true;
                    } else {
                        i29 = i51;
                        i7 = i30;
                        z8 = false;
                    }
                    int A11 = e.A(n6.getInt(i7));
                    i30 = i7;
                    int i52 = i31;
                    int i53 = n6.getInt(i52);
                    i31 = i52;
                    int i54 = i32;
                    int i55 = n6.getInt(i54);
                    i32 = i54;
                    int i56 = i33;
                    long j16 = n6.getLong(i56);
                    i33 = i56;
                    int i57 = i34;
                    int i58 = n6.getInt(i57);
                    i34 = i57;
                    int i59 = i35;
                    int i60 = n6.getInt(i59);
                    i35 = i59;
                    int i61 = i36;
                    String string4 = n6.isNull(i61) ? null : n6.getString(i61);
                    i36 = i61;
                    int i62 = i37;
                    int z15 = e.z(n6.getInt(i62));
                    i37 = i62;
                    int i63 = i38;
                    C1921e S7 = e.S(n6.getBlob(i63));
                    i38 = i63;
                    int i64 = i39;
                    if (n6.getInt(i64) != 0) {
                        i39 = i64;
                        i10 = i40;
                        z10 = true;
                    } else {
                        i39 = i64;
                        i10 = i40;
                        z10 = false;
                    }
                    if (n6.getInt(i10) != 0) {
                        i40 = i10;
                        i11 = i41;
                        z11 = true;
                    } else {
                        i40 = i10;
                        i11 = i41;
                        z11 = false;
                    }
                    if (n6.getInt(i11) != 0) {
                        i41 = i11;
                        i12 = i42;
                        z12 = true;
                    } else {
                        i41 = i11;
                        i12 = i42;
                        z12 = false;
                    }
                    if (n6.getInt(i12) != 0) {
                        i42 = i12;
                        i13 = i43;
                        z13 = true;
                    } else {
                        i42 = i12;
                        i13 = i43;
                        z13 = false;
                    }
                    long j17 = n6.getLong(i13);
                    i43 = i13;
                    int i65 = i44;
                    long j18 = n6.getLong(i65);
                    i44 = i65;
                    int i66 = i45;
                    i45 = i66;
                    arrayList.add(new q3.p(string, B10, string2, string3, a10, a11, j, j10, j11, new C1243e(S7, z15, z10, z11, z12, z13, j17, j18, e.e(n6.getBlob(i66))), i47, y10, j12, j13, j14, j15, z8, A11, i53, i55, j16, i58, i60, string4));
                    i14 = i49;
                    i46 = i48;
                }
                n6.close();
                h10.F();
                ArrayList e2 = C2.e();
                ArrayList b2 = C2.b();
                if (arrayList.isEmpty()) {
                    iVar = z14;
                    lVar = A10;
                    sVar = D10;
                } else {
                    z e10 = z.e();
                    String str = t3.l.f24476a;
                    e10.f(str, "Recently completed work:\n\n");
                    iVar = z14;
                    lVar = A10;
                    sVar = D10;
                    z.e().f(str, t3.l.a(lVar, sVar, iVar, arrayList));
                }
                if (!e2.isEmpty()) {
                    z e11 = z.e();
                    String str2 = t3.l.f24476a;
                    e11.f(str2, "Running work:\n\n");
                    z.e().f(str2, t3.l.a(lVar, sVar, iVar, e2));
                }
                if (!b2.isEmpty()) {
                    z e12 = z.e();
                    String str3 = t3.l.f24476a;
                    e12.f(str3, "Enqueued work:\n\n");
                    z.e().f(str3, t3.l.a(lVar, sVar, iVar, b2));
                }
                return x.a();
            } catch (Throwable th) {
                th = th;
                n6.close();
                h10.F();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            h10 = a9;
        }
    }
}
