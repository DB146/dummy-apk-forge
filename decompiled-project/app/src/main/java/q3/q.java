package q3;

import I2.AbstractC0315d;
import I2.H;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import h3.C1243e;
import h3.C1249k;
import java.util.ArrayList;
import java.util.TreeMap;
import r3.C1921e;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f23424a;

    /* renamed from: b, reason: collision with root package name */
    public final b f23425b;

    /* renamed from: c, reason: collision with root package name */
    public final h f23426c;

    /* renamed from: d, reason: collision with root package name */
    public final h f23427d;

    /* renamed from: e, reason: collision with root package name */
    public final h f23428e;

    /* renamed from: f, reason: collision with root package name */
    public final h f23429f;
    public final h g;

    /* renamed from: h, reason: collision with root package name */
    public final h f23430h;

    /* renamed from: i, reason: collision with root package name */
    public final h f23431i;
    public final h j;
    public final h k;

    /* renamed from: l, reason: collision with root package name */
    public final h f23432l;

    /* renamed from: m, reason: collision with root package name */
    public final h f23433m;

    /* renamed from: n, reason: collision with root package name */
    public final h f23434n;

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f23424a = workDatabase_Impl;
        this.f23425b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 12);
        this.f23426c = new h(workDatabase_Impl, 13);
        this.f23427d = new h(workDatabase_Impl, 14);
        this.f23428e = new h(workDatabase_Impl, 15);
        this.f23429f = new h(workDatabase_Impl, 16);
        this.g = new h(workDatabase_Impl, 17);
        this.f23430h = new h(workDatabase_Impl, 18);
        this.f23431i = new h(workDatabase_Impl, 19);
        this.j = new h(workDatabase_Impl, 4);
        new h(workDatabase_Impl, 5);
        this.k = new h(workDatabase_Impl, 6);
        this.f23432l = new h(workDatabase_Impl, 7);
        this.f23433m = new h(workDatabase_Impl, 8);
        new h(workDatabase_Impl, 9);
        new h(workDatabase_Impl, 10);
        this.f23434n = new h(workDatabase_Impl, 11);
    }

    public final void a(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        h hVar = this.f23426c;
        V2.j a9 = hVar.a();
        a9.p(1, str);
        try {
            workDatabase_Impl.c();
            try {
                a9.l();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.r();
            }
        } finally {
            hVar.l(a9);
        }
    }

    public final ArrayList b() {
        H h10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z8;
        int i24;
        boolean z10;
        int i25;
        boolean z11;
        int i26;
        boolean z12;
        int i27;
        boolean z13;
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        a9.f(1, 200);
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            i7 = P2.j.i(n6, "id");
            i10 = P2.j.i(n6, "state");
            i11 = P2.j.i(n6, "worker_class_name");
            i12 = P2.j.i(n6, "input_merger_class_name");
            i13 = P2.j.i(n6, "input");
            i14 = P2.j.i(n6, "output");
            i15 = P2.j.i(n6, "initial_delay");
            i16 = P2.j.i(n6, "interval_duration");
            i17 = P2.j.i(n6, "flex_duration");
            i18 = P2.j.i(n6, "run_attempt_count");
            i19 = P2.j.i(n6, "backoff_policy");
            i20 = P2.j.i(n6, "backoff_delay_duration");
            i21 = P2.j.i(n6, "last_enqueue_time");
            i22 = P2.j.i(n6, "minimum_retention_duration");
            h10 = a9;
        } catch (Throwable th) {
            th = th;
            h10 = a9;
        }
        try {
            int i28 = P2.j.i(n6, "schedule_requested_at");
            int i29 = P2.j.i(n6, "run_in_foreground");
            int i30 = P2.j.i(n6, "out_of_quota_policy");
            int i31 = P2.j.i(n6, "period_count");
            int i32 = P2.j.i(n6, "generation");
            int i33 = P2.j.i(n6, "next_schedule_time_override");
            int i34 = P2.j.i(n6, "next_schedule_time_override_generation");
            int i35 = P2.j.i(n6, "stop_reason");
            int i36 = P2.j.i(n6, "trace_tag");
            int i37 = P2.j.i(n6, "required_network_type");
            int i38 = P2.j.i(n6, "required_network_request");
            int i39 = P2.j.i(n6, "requires_charging");
            int i40 = P2.j.i(n6, "requires_device_idle");
            int i41 = P2.j.i(n6, "requires_battery_not_low");
            int i42 = P2.j.i(n6, "requires_storage_not_low");
            int i43 = P2.j.i(n6, "trigger_content_update_delay");
            int i44 = P2.j.i(n6, "trigger_max_content_delay");
            int i45 = P2.j.i(n6, "content_uri_triggers");
            int i46 = i22;
            ArrayList arrayList = new ArrayList(n6.getCount());
            while (n6.moveToNext()) {
                String string = n6.getString(i7);
                int B10 = Q5.e.B(n6.getInt(i10));
                String string2 = n6.getString(i11);
                String string3 = n6.getString(i12);
                C1249k a10 = C1249k.a(n6.getBlob(i13));
                C1249k a11 = C1249k.a(n6.getBlob(i14));
                long j = n6.getLong(i15);
                long j10 = n6.getLong(i16);
                long j11 = n6.getLong(i17);
                int i47 = n6.getInt(i18);
                int y10 = Q5.e.y(n6.getInt(i19));
                long j12 = n6.getLong(i20);
                long j13 = n6.getLong(i21);
                int i48 = i46;
                long j14 = n6.getLong(i48);
                int i49 = i7;
                int i50 = i28;
                long j15 = n6.getLong(i50);
                i28 = i50;
                int i51 = i29;
                if (n6.getInt(i51) != 0) {
                    i29 = i51;
                    i23 = i30;
                    z8 = true;
                } else {
                    i29 = i51;
                    i23 = i30;
                    z8 = false;
                }
                int A10 = Q5.e.A(n6.getInt(i23));
                i30 = i23;
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
                int z14 = Q5.e.z(n6.getInt(i62));
                i37 = i62;
                int i63 = i38;
                C1921e S7 = Q5.e.S(n6.getBlob(i63));
                i38 = i63;
                int i64 = i39;
                if (n6.getInt(i64) != 0) {
                    i39 = i64;
                    i24 = i40;
                    z10 = true;
                } else {
                    i39 = i64;
                    i24 = i40;
                    z10 = false;
                }
                if (n6.getInt(i24) != 0) {
                    i40 = i24;
                    i25 = i41;
                    z11 = true;
                } else {
                    i40 = i24;
                    i25 = i41;
                    z11 = false;
                }
                if (n6.getInt(i25) != 0) {
                    i41 = i25;
                    i26 = i42;
                    z12 = true;
                } else {
                    i41 = i25;
                    i26 = i42;
                    z12 = false;
                }
                if (n6.getInt(i26) != 0) {
                    i42 = i26;
                    i27 = i43;
                    z13 = true;
                } else {
                    i42 = i26;
                    i27 = i43;
                    z13 = false;
                }
                long j17 = n6.getLong(i27);
                i43 = i27;
                int i65 = i44;
                long j18 = n6.getLong(i65);
                i44 = i65;
                int i66 = i45;
                i45 = i66;
                arrayList.add(new p(string, B10, string2, string3, a10, a11, j, j10, j11, new C1243e(S7, z14, z10, z11, z12, z13, j17, j18, Q5.e.e(n6.getBlob(i66))), i47, y10, j12, j13, j14, j15, z8, A10, i53, i55, j16, i58, i60, string4));
                i7 = i49;
                i46 = i48;
            }
            n6.close();
            h10.F();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            n6.close();
            h10.F();
            throw th;
        }
    }

    public final ArrayList c(int i7) {
        H h10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z8;
        int i25;
        boolean z10;
        int i26;
        boolean z11;
        int i27;
        boolean z12;
        int i28;
        boolean z13;
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        a9.f(1, i7);
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            i10 = P2.j.i(n6, "id");
            i11 = P2.j.i(n6, "state");
            i12 = P2.j.i(n6, "worker_class_name");
            i13 = P2.j.i(n6, "input_merger_class_name");
            i14 = P2.j.i(n6, "input");
            i15 = P2.j.i(n6, "output");
            i16 = P2.j.i(n6, "initial_delay");
            i17 = P2.j.i(n6, "interval_duration");
            i18 = P2.j.i(n6, "flex_duration");
            i19 = P2.j.i(n6, "run_attempt_count");
            i20 = P2.j.i(n6, "backoff_policy");
            i21 = P2.j.i(n6, "backoff_delay_duration");
            i22 = P2.j.i(n6, "last_enqueue_time");
            i23 = P2.j.i(n6, "minimum_retention_duration");
            h10 = a9;
        } catch (Throwable th) {
            th = th;
            h10 = a9;
        }
        try {
            int i29 = P2.j.i(n6, "schedule_requested_at");
            int i30 = P2.j.i(n6, "run_in_foreground");
            int i31 = P2.j.i(n6, "out_of_quota_policy");
            int i32 = P2.j.i(n6, "period_count");
            int i33 = P2.j.i(n6, "generation");
            int i34 = P2.j.i(n6, "next_schedule_time_override");
            int i35 = P2.j.i(n6, "next_schedule_time_override_generation");
            int i36 = P2.j.i(n6, "stop_reason");
            int i37 = P2.j.i(n6, "trace_tag");
            int i38 = P2.j.i(n6, "required_network_type");
            int i39 = P2.j.i(n6, "required_network_request");
            int i40 = P2.j.i(n6, "requires_charging");
            int i41 = P2.j.i(n6, "requires_device_idle");
            int i42 = P2.j.i(n6, "requires_battery_not_low");
            int i43 = P2.j.i(n6, "requires_storage_not_low");
            int i44 = P2.j.i(n6, "trigger_content_update_delay");
            int i45 = P2.j.i(n6, "trigger_max_content_delay");
            int i46 = P2.j.i(n6, "content_uri_triggers");
            int i47 = i23;
            ArrayList arrayList = new ArrayList(n6.getCount());
            while (n6.moveToNext()) {
                String string = n6.getString(i10);
                int B10 = Q5.e.B(n6.getInt(i11));
                String string2 = n6.getString(i12);
                String string3 = n6.getString(i13);
                C1249k a10 = C1249k.a(n6.getBlob(i14));
                C1249k a11 = C1249k.a(n6.getBlob(i15));
                long j = n6.getLong(i16);
                long j10 = n6.getLong(i17);
                long j11 = n6.getLong(i18);
                int i48 = n6.getInt(i19);
                int y10 = Q5.e.y(n6.getInt(i20));
                long j12 = n6.getLong(i21);
                long j13 = n6.getLong(i22);
                int i49 = i47;
                long j14 = n6.getLong(i49);
                int i50 = i10;
                int i51 = i29;
                long j15 = n6.getLong(i51);
                i29 = i51;
                int i52 = i30;
                if (n6.getInt(i52) != 0) {
                    i30 = i52;
                    i24 = i31;
                    z8 = true;
                } else {
                    i30 = i52;
                    i24 = i31;
                    z8 = false;
                }
                int A10 = Q5.e.A(n6.getInt(i24));
                i31 = i24;
                int i53 = i32;
                int i54 = n6.getInt(i53);
                i32 = i53;
                int i55 = i33;
                int i56 = n6.getInt(i55);
                i33 = i55;
                int i57 = i34;
                long j16 = n6.getLong(i57);
                i34 = i57;
                int i58 = i35;
                int i59 = n6.getInt(i58);
                i35 = i58;
                int i60 = i36;
                int i61 = n6.getInt(i60);
                i36 = i60;
                int i62 = i37;
                String string4 = n6.isNull(i62) ? null : n6.getString(i62);
                i37 = i62;
                int i63 = i38;
                int z14 = Q5.e.z(n6.getInt(i63));
                i38 = i63;
                int i64 = i39;
                C1921e S7 = Q5.e.S(n6.getBlob(i64));
                i39 = i64;
                int i65 = i40;
                if (n6.getInt(i65) != 0) {
                    i40 = i65;
                    i25 = i41;
                    z10 = true;
                } else {
                    i40 = i65;
                    i25 = i41;
                    z10 = false;
                }
                if (n6.getInt(i25) != 0) {
                    i41 = i25;
                    i26 = i42;
                    z11 = true;
                } else {
                    i41 = i25;
                    i26 = i42;
                    z11 = false;
                }
                if (n6.getInt(i26) != 0) {
                    i42 = i26;
                    i27 = i43;
                    z12 = true;
                } else {
                    i42 = i26;
                    i27 = i43;
                    z12 = false;
                }
                if (n6.getInt(i27) != 0) {
                    i43 = i27;
                    i28 = i44;
                    z13 = true;
                } else {
                    i43 = i27;
                    i28 = i44;
                    z13 = false;
                }
                long j17 = n6.getLong(i28);
                i44 = i28;
                int i66 = i45;
                long j18 = n6.getLong(i66);
                i45 = i66;
                int i67 = i46;
                i46 = i67;
                arrayList.add(new p(string, B10, string2, string3, a10, a11, j, j10, j11, new C1243e(S7, z14, z10, z11, z12, z13, j17, j18, Q5.e.e(n6.getBlob(i67))), i48, y10, j12, j13, j14, j15, z8, A10, i54, i56, j16, i59, i61, string4));
                i10 = i50;
                i47 = i49;
            }
            n6.close();
            h10.F();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            n6.close();
            h10.F();
            throw th;
        }
    }

    public final ArrayList d() {
        H h10;
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
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            int i14 = P2.j.i(n6, "id");
            int i15 = P2.j.i(n6, "state");
            int i16 = P2.j.i(n6, "worker_class_name");
            int i17 = P2.j.i(n6, "input_merger_class_name");
            int i18 = P2.j.i(n6, "input");
            int i19 = P2.j.i(n6, "output");
            int i20 = P2.j.i(n6, "initial_delay");
            int i21 = P2.j.i(n6, "interval_duration");
            int i22 = P2.j.i(n6, "flex_duration");
            int i23 = P2.j.i(n6, "run_attempt_count");
            int i24 = P2.j.i(n6, "backoff_policy");
            int i25 = P2.j.i(n6, "backoff_delay_duration");
            int i26 = P2.j.i(n6, "last_enqueue_time");
            int i27 = P2.j.i(n6, "minimum_retention_duration");
            h10 = a9;
            try {
                int i28 = P2.j.i(n6, "schedule_requested_at");
                int i29 = P2.j.i(n6, "run_in_foreground");
                int i30 = P2.j.i(n6, "out_of_quota_policy");
                int i31 = P2.j.i(n6, "period_count");
                int i32 = P2.j.i(n6, "generation");
                int i33 = P2.j.i(n6, "next_schedule_time_override");
                int i34 = P2.j.i(n6, "next_schedule_time_override_generation");
                int i35 = P2.j.i(n6, "stop_reason");
                int i36 = P2.j.i(n6, "trace_tag");
                int i37 = P2.j.i(n6, "required_network_type");
                int i38 = P2.j.i(n6, "required_network_request");
                int i39 = P2.j.i(n6, "requires_charging");
                int i40 = P2.j.i(n6, "requires_device_idle");
                int i41 = P2.j.i(n6, "requires_battery_not_low");
                int i42 = P2.j.i(n6, "requires_storage_not_low");
                int i43 = P2.j.i(n6, "trigger_content_update_delay");
                int i44 = P2.j.i(n6, "trigger_max_content_delay");
                int i45 = P2.j.i(n6, "content_uri_triggers");
                int i46 = i27;
                ArrayList arrayList = new ArrayList(n6.getCount());
                while (n6.moveToNext()) {
                    String string = n6.getString(i14);
                    int B10 = Q5.e.B(n6.getInt(i15));
                    String string2 = n6.getString(i16);
                    String string3 = n6.getString(i17);
                    C1249k a10 = C1249k.a(n6.getBlob(i18));
                    C1249k a11 = C1249k.a(n6.getBlob(i19));
                    long j = n6.getLong(i20);
                    long j10 = n6.getLong(i21);
                    long j11 = n6.getLong(i22);
                    int i47 = n6.getInt(i23);
                    int y10 = Q5.e.y(n6.getInt(i24));
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
                    int A10 = Q5.e.A(n6.getInt(i7));
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
                    int z14 = Q5.e.z(n6.getInt(i62));
                    i37 = i62;
                    int i63 = i38;
                    C1921e S7 = Q5.e.S(n6.getBlob(i63));
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
                    arrayList.add(new p(string, B10, string2, string3, a10, a11, j, j10, j11, new C1243e(S7, z14, z10, z11, z12, z13, j17, j18, Q5.e.e(n6.getBlob(i66))), i47, y10, j12, j13, j14, j15, z8, A10, i53, i55, j16, i58, i60, string4));
                    i14 = i49;
                    i46 = i48;
                }
                n6.close();
                h10.F();
                return arrayList;
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

    public final ArrayList e() {
        H h10;
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
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            int i14 = P2.j.i(n6, "id");
            int i15 = P2.j.i(n6, "state");
            int i16 = P2.j.i(n6, "worker_class_name");
            int i17 = P2.j.i(n6, "input_merger_class_name");
            int i18 = P2.j.i(n6, "input");
            int i19 = P2.j.i(n6, "output");
            int i20 = P2.j.i(n6, "initial_delay");
            int i21 = P2.j.i(n6, "interval_duration");
            int i22 = P2.j.i(n6, "flex_duration");
            int i23 = P2.j.i(n6, "run_attempt_count");
            int i24 = P2.j.i(n6, "backoff_policy");
            int i25 = P2.j.i(n6, "backoff_delay_duration");
            int i26 = P2.j.i(n6, "last_enqueue_time");
            int i27 = P2.j.i(n6, "minimum_retention_duration");
            h10 = a9;
            try {
                int i28 = P2.j.i(n6, "schedule_requested_at");
                int i29 = P2.j.i(n6, "run_in_foreground");
                int i30 = P2.j.i(n6, "out_of_quota_policy");
                int i31 = P2.j.i(n6, "period_count");
                int i32 = P2.j.i(n6, "generation");
                int i33 = P2.j.i(n6, "next_schedule_time_override");
                int i34 = P2.j.i(n6, "next_schedule_time_override_generation");
                int i35 = P2.j.i(n6, "stop_reason");
                int i36 = P2.j.i(n6, "trace_tag");
                int i37 = P2.j.i(n6, "required_network_type");
                int i38 = P2.j.i(n6, "required_network_request");
                int i39 = P2.j.i(n6, "requires_charging");
                int i40 = P2.j.i(n6, "requires_device_idle");
                int i41 = P2.j.i(n6, "requires_battery_not_low");
                int i42 = P2.j.i(n6, "requires_storage_not_low");
                int i43 = P2.j.i(n6, "trigger_content_update_delay");
                int i44 = P2.j.i(n6, "trigger_max_content_delay");
                int i45 = P2.j.i(n6, "content_uri_triggers");
                int i46 = i27;
                ArrayList arrayList = new ArrayList(n6.getCount());
                while (n6.moveToNext()) {
                    String string = n6.getString(i14);
                    int B10 = Q5.e.B(n6.getInt(i15));
                    String string2 = n6.getString(i16);
                    String string3 = n6.getString(i17);
                    C1249k a10 = C1249k.a(n6.getBlob(i18));
                    C1249k a11 = C1249k.a(n6.getBlob(i19));
                    long j = n6.getLong(i20);
                    long j10 = n6.getLong(i21);
                    long j11 = n6.getLong(i22);
                    int i47 = n6.getInt(i23);
                    int y10 = Q5.e.y(n6.getInt(i24));
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
                    int A10 = Q5.e.A(n6.getInt(i7));
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
                    int z14 = Q5.e.z(n6.getInt(i62));
                    i37 = i62;
                    int i63 = i38;
                    C1921e S7 = Q5.e.S(n6.getBlob(i63));
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
                    arrayList.add(new p(string, B10, string2, string3, a10, a11, j, j10, j11, new C1243e(S7, z14, z10, z11, z12, z13, j17, j18, Q5.e.e(n6.getBlob(i66))), i47, y10, j12, j13, j14, j15, z8, A10, i53, i55, j16, i58, i60, string4));
                    i14 = i49;
                    i46 = i48;
                }
                n6.close();
                h10.F();
                return arrayList;
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

    public final ArrayList f() {
        H h10;
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
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            int i14 = P2.j.i(n6, "id");
            int i15 = P2.j.i(n6, "state");
            int i16 = P2.j.i(n6, "worker_class_name");
            int i17 = P2.j.i(n6, "input_merger_class_name");
            int i18 = P2.j.i(n6, "input");
            int i19 = P2.j.i(n6, "output");
            int i20 = P2.j.i(n6, "initial_delay");
            int i21 = P2.j.i(n6, "interval_duration");
            int i22 = P2.j.i(n6, "flex_duration");
            int i23 = P2.j.i(n6, "run_attempt_count");
            int i24 = P2.j.i(n6, "backoff_policy");
            int i25 = P2.j.i(n6, "backoff_delay_duration");
            int i26 = P2.j.i(n6, "last_enqueue_time");
            int i27 = P2.j.i(n6, "minimum_retention_duration");
            h10 = a9;
            try {
                int i28 = P2.j.i(n6, "schedule_requested_at");
                int i29 = P2.j.i(n6, "run_in_foreground");
                int i30 = P2.j.i(n6, "out_of_quota_policy");
                int i31 = P2.j.i(n6, "period_count");
                int i32 = P2.j.i(n6, "generation");
                int i33 = P2.j.i(n6, "next_schedule_time_override");
                int i34 = P2.j.i(n6, "next_schedule_time_override_generation");
                int i35 = P2.j.i(n6, "stop_reason");
                int i36 = P2.j.i(n6, "trace_tag");
                int i37 = P2.j.i(n6, "required_network_type");
                int i38 = P2.j.i(n6, "required_network_request");
                int i39 = P2.j.i(n6, "requires_charging");
                int i40 = P2.j.i(n6, "requires_device_idle");
                int i41 = P2.j.i(n6, "requires_battery_not_low");
                int i42 = P2.j.i(n6, "requires_storage_not_low");
                int i43 = P2.j.i(n6, "trigger_content_update_delay");
                int i44 = P2.j.i(n6, "trigger_max_content_delay");
                int i45 = P2.j.i(n6, "content_uri_triggers");
                int i46 = i27;
                ArrayList arrayList = new ArrayList(n6.getCount());
                while (n6.moveToNext()) {
                    String string = n6.getString(i14);
                    int B10 = Q5.e.B(n6.getInt(i15));
                    String string2 = n6.getString(i16);
                    String string3 = n6.getString(i17);
                    C1249k a10 = C1249k.a(n6.getBlob(i18));
                    C1249k a11 = C1249k.a(n6.getBlob(i19));
                    long j = n6.getLong(i20);
                    long j10 = n6.getLong(i21);
                    long j11 = n6.getLong(i22);
                    int i47 = n6.getInt(i23);
                    int y10 = Q5.e.y(n6.getInt(i24));
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
                    int A10 = Q5.e.A(n6.getInt(i7));
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
                    int z14 = Q5.e.z(n6.getInt(i62));
                    i37 = i62;
                    int i63 = i38;
                    C1921e S7 = Q5.e.S(n6.getBlob(i63));
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
                    arrayList.add(new p(string, B10, string2, string3, a10, a11, j, j10, j11, new C1243e(S7, z14, z10, z11, z12, z13, j17, j18, Q5.e.e(n6.getBlob(i66))), i47, y10, j12, j13, j14, j15, z8, A10, i53, i55, j16, i58, i60, string4));
                    i14 = i49;
                    i46 = i48;
                }
                n6.close();
                h10.F();
                return arrayList;
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

    public final int g(String str) {
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(1, "SELECT state FROM workspec WHERE id=?");
        a9.p(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            int i7 = 0;
            if (n6.moveToFirst()) {
                Integer valueOf = n6.isNull(0) ? null : Integer.valueOf(n6.getInt(0));
                if (valueOf != null) {
                    i7 = Q5.e.B(valueOf.intValue());
                }
            }
            return i7;
        } finally {
            n6.close();
            a9.F();
        }
    }

    public final p h(String str) {
        H h10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z8;
        int i23;
        boolean z10;
        int i24;
        boolean z11;
        int i25;
        boolean z12;
        int i26;
        boolean z13;
        int i27;
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(1, "SELECT * FROM workspec WHERE id=?");
        a9.p(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            i7 = P2.j.i(n6, "id");
            i10 = P2.j.i(n6, "state");
            i11 = P2.j.i(n6, "worker_class_name");
            i12 = P2.j.i(n6, "input_merger_class_name");
            i13 = P2.j.i(n6, "input");
            i14 = P2.j.i(n6, "output");
            i15 = P2.j.i(n6, "initial_delay");
            i16 = P2.j.i(n6, "interval_duration");
            i17 = P2.j.i(n6, "flex_duration");
            i18 = P2.j.i(n6, "run_attempt_count");
            i19 = P2.j.i(n6, "backoff_policy");
            i20 = P2.j.i(n6, "backoff_delay_duration");
            i21 = P2.j.i(n6, "last_enqueue_time");
            i22 = P2.j.i(n6, "minimum_retention_duration");
            h10 = a9;
        } catch (Throwable th) {
            th = th;
            h10 = a9;
        }
        try {
            int i28 = P2.j.i(n6, "schedule_requested_at");
            int i29 = P2.j.i(n6, "run_in_foreground");
            int i30 = P2.j.i(n6, "out_of_quota_policy");
            int i31 = P2.j.i(n6, "period_count");
            int i32 = P2.j.i(n6, "generation");
            int i33 = P2.j.i(n6, "next_schedule_time_override");
            int i34 = P2.j.i(n6, "next_schedule_time_override_generation");
            int i35 = P2.j.i(n6, "stop_reason");
            int i36 = P2.j.i(n6, "trace_tag");
            int i37 = P2.j.i(n6, "required_network_type");
            int i38 = P2.j.i(n6, "required_network_request");
            int i39 = P2.j.i(n6, "requires_charging");
            int i40 = P2.j.i(n6, "requires_device_idle");
            int i41 = P2.j.i(n6, "requires_battery_not_low");
            int i42 = P2.j.i(n6, "requires_storage_not_low");
            int i43 = P2.j.i(n6, "trigger_content_update_delay");
            int i44 = P2.j.i(n6, "trigger_max_content_delay");
            int i45 = P2.j.i(n6, "content_uri_triggers");
            p pVar = null;
            if (n6.moveToFirst()) {
                String string = n6.getString(i7);
                int B10 = Q5.e.B(n6.getInt(i10));
                String string2 = n6.getString(i11);
                String string3 = n6.getString(i12);
                C1249k a10 = C1249k.a(n6.getBlob(i13));
                C1249k a11 = C1249k.a(n6.getBlob(i14));
                long j = n6.getLong(i15);
                long j10 = n6.getLong(i16);
                long j11 = n6.getLong(i17);
                int i46 = n6.getInt(i18);
                int y10 = Q5.e.y(n6.getInt(i19));
                long j12 = n6.getLong(i20);
                long j13 = n6.getLong(i21);
                long j14 = n6.getLong(i22);
                long j15 = n6.getLong(i28);
                if (n6.getInt(i29) != 0) {
                    i23 = i30;
                    z8 = true;
                } else {
                    z8 = false;
                    i23 = i30;
                }
                int A10 = Q5.e.A(n6.getInt(i23));
                int i47 = n6.getInt(i31);
                int i48 = n6.getInt(i32);
                long j16 = n6.getLong(i33);
                int i49 = n6.getInt(i34);
                int i50 = n6.getInt(i35);
                String string4 = n6.isNull(i36) ? null : n6.getString(i36);
                int z14 = Q5.e.z(n6.getInt(i37));
                C1921e S7 = Q5.e.S(n6.getBlob(i38));
                if (n6.getInt(i39) != 0) {
                    i24 = i40;
                    z10 = true;
                } else {
                    z10 = false;
                    i24 = i40;
                }
                if (n6.getInt(i24) != 0) {
                    i25 = i41;
                    z11 = true;
                } else {
                    z11 = false;
                    i25 = i41;
                }
                if (n6.getInt(i25) != 0) {
                    i26 = i42;
                    z12 = true;
                } else {
                    z12 = false;
                    i26 = i42;
                }
                if (n6.getInt(i26) != 0) {
                    i27 = i43;
                    z13 = true;
                } else {
                    z13 = false;
                    i27 = i43;
                }
                pVar = new p(string, B10, string2, string3, a10, a11, j, j10, j11, new C1243e(S7, z14, z10, z11, z12, z13, n6.getLong(i27), n6.getLong(i44), Q5.e.e(n6.getBlob(i45))), i46, y10, j12, j13, j14, j15, z8, A10, i47, i48, j16, i49, i50, string4);
            }
            n6.close();
            h10.F();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            n6.close();
            h10.F();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [q3.o, java.lang.Object] */
    public final ArrayList i(String str) {
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        a9.p(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            ArrayList arrayList = new ArrayList(n6.getCount());
            while (n6.moveToNext()) {
                String id = n6.getString(0);
                int B10 = Q5.e.B(n6.getInt(1));
                kotlin.jvm.internal.l.e(id, "id");
                ?? obj = new Object();
                obj.f23400a = id;
                obj.f23401b = B10;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            n6.close();
            a9.F();
        }
    }

    public final void j(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        h hVar = this.f23432l;
        V2.j a9 = hVar.a();
        a9.f(1, j);
        a9.p(2, str);
        try {
            workDatabase_Impl.c();
            try {
                a9.l();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.r();
            }
        } finally {
            hVar.l(a9);
        }
    }

    public final void k(int i7, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        h hVar = this.k;
        V2.j a9 = hVar.a();
        a9.p(1, str);
        a9.f(2, i7);
        try {
            workDatabase_Impl.c();
            try {
                a9.l();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.r();
            }
        } finally {
            hVar.l(a9);
        }
    }

    public final void l(String str, long j) {
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        h hVar = this.f23430h;
        V2.j a9 = hVar.a();
        a9.f(1, j);
        a9.p(2, str);
        try {
            workDatabase_Impl.c();
            try {
                a9.l();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.r();
            }
        } finally {
            hVar.l(a9);
        }
    }

    public final void m(String str, C1249k c1249k) {
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        h hVar = this.g;
        V2.j a9 = hVar.a();
        C1249k c1249k2 = C1249k.f17698b;
        a9.g(1, c2.i.y(c1249k));
        a9.p(2, str);
        try {
            workDatabase_Impl.c();
            try {
                a9.l();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.r();
            }
        } finally {
            hVar.l(a9);
        }
    }

    public final void n(int i7, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        h hVar = this.f23427d;
        V2.j a9 = hVar.a();
        a9.f(1, Q5.e.R(i7));
        a9.p(2, str);
        try {
            workDatabase_Impl.c();
            try {
                a9.l();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.r();
            }
        } finally {
            hVar.l(a9);
        }
    }

    public final void o(int i7, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f23424a;
        workDatabase_Impl.b();
        h hVar = this.f23434n;
        V2.j a9 = hVar.a();
        a9.f(1, i7);
        a9.p(2, str);
        try {
            workDatabase_Impl.c();
            try {
                a9.l();
                workDatabase_Impl.v();
            } finally {
                workDatabase_Impl.r();
            }
        } finally {
            hVar.l(a9);
        }
    }
}
