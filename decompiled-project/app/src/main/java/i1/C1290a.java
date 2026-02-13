package i1;

import A9.O;
import I2.F;
import P2.k;
import P2.l;
import P2.m;
import P2.n;
import W1.C;
import Y5.C0660y;
import Y5.C0662z;
import a1.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.rxjava3.RxWorker;
import cc.C0944m;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.core.workers.AutoRefreshExtensionsChannelWorker;
import com.kt.apps.core.workers.TVEpgWorkers;
import com.kt.apps.media.xemtv.App;
import ea.C1108c;
import ea.C1112g;
import gb.q;
import h3.o;
import h3.x;
import h7.C1257c;
import hb.InterfaceC1269b;
import i2.C1332t;
import j6.InterfaceC1381a;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import jb.InterfaceC1393d;
import jb.InterfaceC1395f;
import kb.EnumC1437b;
import l1.AbstractC1449a;
import m6.InterfaceC1633i;
import n5.AbstractC1705a;
import o.T;
import o4.RunnableC1803q;
import o7.u;
import oa.j;
import org.json.JSONException;
import org.json.JSONObject;
import r4.InterfaceC1926E;
import r4.w;
import s6.InterfaceC1996f;
import t7.InterfaceC2031b;
import u7.InterfaceC2115a;
import v7.p;
import va.C2159c;
import w.L;
import w.U;
import x.AbstractC2232b;
import x.InterfaceC2244n;
import x.InterfaceC2250u;
import y1.InterfaceC2366n;
import y1.K;
import y1.m0;
import y1.p0;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1290a implements InterfaceC2366n, InterfaceC1395f, InterfaceC1393d, InterfaceC1381a, InterfaceC1633i, OnCompleteListener, T, Continuation, gb.g, InterfaceC1926E, InterfaceC1996f, InterfaceC2031b, InterfaceC2115a, q, SuccessContinuation, InterfaceC2244n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18186a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18187b;

    public C1290a() {
        this.f18186a = 7;
        this.f18187b = new O(6);
    }

    public /* synthetic */ C1290a(int i7) {
        this.f18186a = i7;
    }

    public C1290a(int i7, float f4, float f10, float f11, float f12, float f13, float f14) {
        this.f18186a = 27;
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        if (i7 == 1 || i7 != 4) {
        }
        this.f18187b = new float[101];
        if (i7 == 3 || Math.abs(f15) < 0.001f || Math.abs(f16) < 0.001f) {
            Math.hypot(f16, f15);
            return;
        }
        float f17 = f12 - f14;
        float[] fArr = AbstractC2232b.f26052i;
        int i10 = 90;
        float f18 = 90;
        float f19 = f17;
        int i11 = 1;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double radians = (float) Math.toRadians((i11 * 90.0d) / i10);
            float sin = ((float) Math.sin(radians)) * f15;
            float cos = ((float) Math.cos(radians)) * f17;
            f20 += (float) Math.hypot(sin - f21, cos - f19);
            fArr[i11] = f20;
            if (i11 == 90) {
                break;
            }
            i11++;
            i10 = 90;
            f19 = cos;
            f21 = sin;
        }
        int i12 = 1;
        while (true) {
            fArr[i12] = fArr[i12] / f20;
            if (i12 == 90) {
                break;
            } else {
                i12++;
            }
        }
        float[] fArr2 = (float[]) this.f18187b;
        int length = fArr2.length;
        for (int i13 = 0; i13 < length; i13++) {
            float f22 = i13 / 100.0f;
            int binarySearch = Arrays.binarySearch(fArr, 0, 91, f22);
            if (binarySearch >= 0) {
                fArr2[i13] = binarySearch / f18;
            } else if (binarySearch == -1) {
                fArr2[i13] = 0.0f;
            } else {
                int i14 = -binarySearch;
                int i15 = i14 - 2;
                float f23 = i15;
                float f24 = fArr[i15];
                fArr2[i13] = (((f22 - f24) / (fArr[i14 - 1] - f24)) + f23) / f18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R1.d, java.lang.Object] */
    public C1290a(V0.c cVar) {
        this.f18186a = 26;
        float f4 = U.f25539a;
        ?? obj = new Object();
        obj.f8814a = f4;
        float k = cVar.k();
        float f10 = L.f25518a;
        obj.f8815b = k * 386.0878f * 160.0f * 0.84f;
        this.f18187b = obj;
    }

    public C1290a(Context context) {
        boolean isEmpty;
        this.f18186a = 20;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f18187b = sharedPreferences;
        File file = new File(AbstractC1449a.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e2.getMessage());
            }
        }
    }

    public /* synthetic */ C1290a(Object obj, int i7) {
        this.f18186a = i7;
        this.f18187b = obj;
    }

    public static void k(V2.c cVar) {
        cVar.o("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.o("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cVar.o("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cVar.o("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        cVar.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cVar.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        cVar.o("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.o("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cVar.o("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.o("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.o("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cVar.o("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cVar.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    public static F o(V2.c cVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new k(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new k(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new l("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new l("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new m("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new m("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        n nVar = new n("Dependency", hashMap, hashSet, hashSet2);
        n a9 = n.a(cVar, "Dependency");
        if (!nVar.equals(a9)) {
            return new F(o.m("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", nVar, "\n Found:\n", a9), false);
        }
        HashMap hashMap2 = new HashMap(32);
        hashMap2.put("id", new k(1, 1, "id", "TEXT", null, true));
        hashMap2.put("state", new k(0, 1, "state", "INTEGER", null, true));
        hashMap2.put("worker_class_name", new k(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new k(0, 1, "input_merger_class_name", "TEXT", null, true));
        hashMap2.put("input", new k(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new k(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new k(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new k(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new k(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new k(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new k(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new k(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("last_enqueue_time", new k(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        hashMap2.put("minimum_retention_duration", new k(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new k(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new k(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new k(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("period_count", new k(0, 1, "period_count", "INTEGER", "0", true));
        hashMap2.put("generation", new k(0, 1, "generation", "INTEGER", "0", true));
        hashMap2.put("next_schedule_time_override", new k(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        hashMap2.put("next_schedule_time_override_generation", new k(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
        hashMap2.put("stop_reason", new k(0, 1, "stop_reason", "INTEGER", "-256", true));
        hashMap2.put("trace_tag", new k(0, 1, "trace_tag", "TEXT", null, false));
        hashMap2.put("required_network_type", new k(0, 1, "required_network_type", "INTEGER", null, true));
        hashMap2.put("required_network_request", new k(0, 1, "required_network_request", "BLOB", "x''", true));
        hashMap2.put("requires_charging", new k(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new k(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new k(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new k(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new k(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new k(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new k(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new m("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new m("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        n nVar2 = new n("WorkSpec", hashMap2, hashSet3, hashSet4);
        n a10 = n.a(cVar, "WorkSpec");
        if (!nVar2.equals(a10)) {
            return new F(o.m("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", nVar2, "\n Found:\n", a10), false);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new k(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new k(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new l("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new m("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        n nVar3 = new n("WorkTag", hashMap3, hashSet5, hashSet6);
        n a11 = n.a(cVar, "WorkTag");
        if (!nVar3.equals(a11)) {
            return new F(o.m("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", nVar3, "\n Found:\n", a11), false);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new k(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("generation", new k(2, 1, "generation", "INTEGER", "0", true));
        hashMap4.put("system_id", new k(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new l("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        n nVar4 = new n("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        n a12 = n.a(cVar, "SystemIdInfo");
        if (!nVar4.equals(a12)) {
            return new F(o.m("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", nVar4, "\n Found:\n", a12), false);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new k(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new k(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new l("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new m("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        n nVar5 = new n("WorkName", hashMap5, hashSet8, hashSet9);
        n a13 = n.a(cVar, "WorkName");
        if (!nVar5.equals(a13)) {
            return new F(o.m("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", nVar5, "\n Found:\n", a13), false);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new k(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put("progress", new k(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new l("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        n nVar6 = new n("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        n a14 = n.a(cVar, "WorkProgress");
        if (!nVar6.equals(a14)) {
            return new F(o.m("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", nVar6, "\n Found:\n", a14), false);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new k(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new k(0, 1, "long_value", "INTEGER", null, false));
        n nVar7 = new n("Preference", hashMap7, new HashSet(0), new HashSet(0));
        n a15 = n.a(cVar, "Preference");
        return !nVar7.equals(a15) ? new F(o.m("Preference(androidx.work.impl.model.Preference).\n Expected:\n", nVar7, "\n Found:\n", a15), false) : new F(null, true);
    }

    public static String p(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // gb.g
    public void a() {
        ((gb.g) ((qb.b) this.f18187b).f23593b).a();
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f18186a) {
            case 3:
                x it = (x) obj;
                kotlin.jvm.internal.l.e(it, "it");
                ((R9.b) ((TVEpgWorkers) this.f18187b).f16181f).b(Long.valueOf(System.currentTimeMillis()), "extra:last_update_epg");
                return;
            case 5:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                kotlin.jvm.internal.l.e((ka.c) this.f18187b, "t");
                return;
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it3, "it");
                C2159c t5 = (C2159c) this.f18187b;
                kotlin.jvm.internal.l.e(t5, "t");
                t5.C0.a();
                ActivityUtilsKt.showSuccessDialog$default((C) this.f18187b, (Rb.a) null, "Xoá nguồn kênh thất bại", (Integer) null, false, 13, (Object) null);
                return;
            default:
                List bannerAds = (List) obj;
                kotlin.jvm.internal.l.e(bannerAds, "bannerAds");
                if (bannerAds.isEmpty()) {
                    return;
                }
                xa.d dVar = (xa.d) this.f18187b;
                Mc.a aVar = dVar.f26289S0;
                if (aVar == null) {
                    kotlin.jvm.internal.l.j("adsRowHelper");
                    throw null;
                }
                dVar.H0().f(0, aVar.a("🏆 Sản phẩm thể thao hot", bannerAds));
                return;
        }
    }

    @Override // o.T
    public void b(int i7) {
    }

    @Override // gb.g, gb.q
    public void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f18186a) {
            case 17:
                EnumC1437b.j((qb.b) this.f18187b, interfaceC1269b);
                return;
            default:
                Objects.requireNonNull(interfaceC1269b);
                k1.a aVar = new k1.a(interfaceC1269b, 13);
                W3.f fVar = RxWorker.f13762e;
                a1.n nVar = ((i) this.f18187b).f12473c;
                if (nVar != null) {
                    nVar.a(aVar, fVar);
                    return;
                }
                return;
        }
    }

    @Override // r4.InterfaceC1926E
    public byte[] d(UUID uuid, w wVar) {
        return (byte[]) this.f18187b;
    }

    @Override // o.T
    public void e(int i7) {
    }

    @Override // r4.InterfaceC1926E
    public byte[] f(r4.x xVar) {
        throw new UnsupportedOperationException();
    }

    @Override // o.T
    public void g(int i7, float f4) {
    }

    @Override // x.InterfaceC2244n
    public InterfaceC2250u get(int i7) {
        return (InterfaceC2250u) this.f18187b;
    }

    @Override // u7.InterfaceC2115a
    public void h(v7.n nVar) {
        this.f18187b = nVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // t7.InterfaceC2031b
    public void i(String str, Bundle bundle) {
        v7.n nVar = (v7.n) this.f18187b;
        if (nVar != null) {
            try {
                String str2 = "$A$:" + p(str, bundle);
                p pVar = nVar.f25145a;
                pVar.getClass();
                pVar.f25161o.f25819a.a(new v7.o(pVar, System.currentTimeMillis() - pVar.f25153d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public void j(int i7, boolean z8) {
        O o10 = (O) this.f18187b;
        if (z8) {
            o10.c(i7);
        } else {
            o10.getClass();
        }
    }

    @Override // y1.InterfaceC2366n
    public p0 l(View view, p0 p0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f18187b;
        if (!Objects.equals(coordinatorLayout.f13240B, p0Var)) {
            coordinatorLayout.f13240B = p0Var;
            boolean z8 = p0Var.d() > 0;
            coordinatorLayout.f13241C = z8;
            coordinatorLayout.setWillNotDraw(!z8 && coordinatorLayout.getBackground() == null);
            m0 m0Var = p0Var.f26731a;
            if (!m0Var.o()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = coordinatorLayout.getChildAt(i7);
                    WeakHashMap weakHashMap = K.f26642a;
                    if (childAt.getFitsSystemWindows() && ((e) childAt.getLayoutParams()).f18189a != null && m0Var.o()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return p0Var;
    }

    public j m() {
        return new j(new E6.e((App) this.f18187b, 7), new h8.e(8), new C0662z(13), new C0660y(16), new K9.b(), new C1332t(8), new C0662z(7), new C1332t(10));
    }

    public void n(Exception exc) {
        AbstractC1705a.u("MediaCodecAudioRenderer", "Audio sink error", exc);
        C1108c c1108c = ((o4.L) this.f18187b).f21753T0;
        Handler handler = (Handler) c1108c.f16831c;
        if (handler != null) {
            handler.post(new RunnableC1803q(c1108c, exc, 5));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        C0944m c0944m = (C0944m) this.f18187b;
        if (exception != null) {
            c0944m.resumeWith(com.bumptech.glide.c.n(exception));
        } else if (task.isCanceled()) {
            c0944m.d(null);
        } else {
            c0944m.resumeWith(task.getResult());
        }
    }

    @Override // gb.g, gb.q
    public void onError(Throwable th) {
        switch (this.f18186a) {
            case 17:
                ((gb.g) ((qb.b) this.f18187b).f23593b).onError(th);
                return;
            default:
                ((i) this.f18187b).b(th);
                return;
        }
    }

    @Override // gb.g, gb.q
    public void onSuccess(Object obj) {
        switch (this.f18186a) {
            case 17:
                ((gb.g) ((qb.b) this.f18187b).f23593b).onSuccess(obj);
                return;
            default:
                ((i) this.f18187b).a(obj);
                return;
        }
    }

    @Override // jb.InterfaceC1395f
    public boolean test(Object obj) {
        M9.d it = (M9.d) obj;
        kotlin.jvm.internal.l.e(it, "it");
        long currentTimeMillis = System.currentTimeMillis();
        AutoRefreshExtensionsChannelWorker autoRefreshExtensionsChannelWorker = (AutoRefreshExtensionsChannelWorker) this.f18187b;
        return currentTimeMillis - O5.b.r(autoRefreshExtensionsChannelWorker.f16175f, it) >= autoRefreshExtensionsChannelWorker.g.c(it.f6852c);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        if (((D7.b) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        C1112g c1112g = (C1112g) this.f18187b;
        v7.l.a((v7.l) c1112g.f16841c);
        v7.l lVar = (v7.l) c1112g.f16841c;
        lVar.f25137m.g(lVar.f25132e.f25819a, null);
        lVar.f25141q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        u uVar = RecaptchaActivity.f15850P;
        Uri.Builder buildUpon = ((Uri) this.f18187b).buildUpon();
        if (task.isSuccessful()) {
            C1257c c1257c = (C1257c) task.getResult();
            Y6.k kVar = c1257c.f17833b;
            if (kVar != null) {
                Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(kVar)));
            }
            buildUpon.fragment("fac=" + c1257c.f17832a);
        } else {
            Log.e("RecaptchaActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return buildUpon.build();
    }
}
