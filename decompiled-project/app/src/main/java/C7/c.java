package C7;

import A4.s;
import E5.h;
import E5.i;
import E5.n;
import E5.o;
import P4.C0463k;
import Y5.B0;
import Y5.BinderC0657w0;
import Y5.C0598a0;
import Y5.C0606d;
import Y5.C0609e;
import Y5.C0613f0;
import Y5.C0628k0;
import Y5.C0632l1;
import Y5.C0633m;
import Y5.C0646q0;
import Y5.C0648s;
import Y5.D0;
import Y5.H1;
import Y5.I;
import Y5.I1;
import Y5.InterfaceC0641o1;
import Y5.J1;
import Y5.K1;
import Y5.M1;
import Y5.O1;
import Y5.S0;
import Y5.W;
import Y5.r;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.gms.common.api.internal.AbstractC0971l;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import h3.z;
import hb.InterfaceC1269b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kb.C1436a;
import kb.EnumC1437b;
import r3.g;
import v1.e;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3047a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3048b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3049c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3050d;

    public /* synthetic */ c() {
        this.f3047a = 13;
    }

    public c(C0632l1 c0632l1, AtomicReference atomicReference, O1 o12) {
        this.f3047a = 7;
        this.f3048b = atomicReference;
        this.f3049c = o12;
        Objects.requireNonNull(c0632l1);
        this.f3050d = c0632l1;
    }

    public c(BinderC0657w0 binderC0657w0, K1 k12, O1 o12) {
        this.f3047a = 5;
        this.f3048b = k12;
        this.f3049c = o12;
        Objects.requireNonNull(binderC0657w0);
        this.f3050d = binderC0657w0;
    }

    public c(BinderC0657w0 binderC0657w0, C0609e c0609e, O1 o12) {
        this.f3047a = 2;
        this.f3048b = c0609e;
        this.f3049c = o12;
        Objects.requireNonNull(binderC0657w0);
        this.f3050d = binderC0657w0;
    }

    public c(BinderC0657w0 binderC0657w0, C0648s c0648s, O1 o12) {
        this.f3047a = 3;
        this.f3048b = c0648s;
        this.f3049c = o12;
        Objects.requireNonNull(binderC0657w0);
        this.f3050d = binderC0657w0;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i7) {
        this.f3047a = i7;
        this.f3050d = obj;
        this.f3048b = obj2;
        this.f3049c = obj3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i7, boolean z8) {
        this.f3047a = i7;
        this.f3048b = obj;
        this.f3049c = obj2;
        this.f3050d = obj3;
    }

    private final void a() {
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f3050d;
        Context context = (Context) this.f3049c;
        Intent intent = (Intent) this.f3048b;
        try {
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            z.e().a(ConstraintProxyUpdateReceiver.f13746a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
            g.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            g.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            g.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            g.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            pendingResult.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0474  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        int i7;
        Task k;
        r rVar;
        long j;
        C0606d c0606d;
        int i10;
        C0633m c0633m;
        Cursor cursor;
        J1 j12;
        Cursor cursor2;
        AtomicReference atomicReference;
        C0632l1 c0632l1;
        C0646q0 c0646q0;
        C0613f0 c0613f0;
        M1 m12;
        C0646q0 c0646q02;
        boolean i11;
        C0646q0 c0646q03;
        C0613f0 c0613f02;
        W w10;
        switch (this.f3047a) {
            case 0:
                d dVar = (d) this.f3050d;
                v7.a aVar = (v7.a) this.f3048b;
                dVar.b(aVar, (TaskCompletionSource) this.f3049c);
                ((AtomicInteger) dVar.f3058i.f17916c).set(0);
                double min = Math.min(3600000.0d, Math.pow(dVar.f3052b, dVar.a()) * (60000.0d / dVar.f3051a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + aVar.f25097b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 1:
                E5.a aVar2 = (E5.a) this.f3049c;
                Intent intent = aVar2.f3670a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    k = Tasks.forResult(null);
                } else {
                    Bundle bundle = new Bundle();
                    Intent intent2 = aVar2.f3670a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar2.f3670a;
                    Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf != null) {
                        bundle.putInt("google.product_id", valueOf.intValue());
                    }
                    bundle.putBoolean("supports_message_handled", true);
                    o j10 = o.j((Context) this.f3048b);
                    synchronized (j10) {
                        i7 = j10.f3712a;
                        j10.f3712a = i7 + 1;
                    }
                    k = j10.k(new n(i7, 2, bundle, 0));
                }
                k.addOnCompleteListener(h.f3686b, new i((CountDownLatch) this.f3050d));
                return;
            case 2:
                BinderC0657w0 binderC0657w0 = (BinderC0657w0) this.f3050d;
                binderC0657w0.f11980a.A();
                C0609e c0609e = (C0609e) this.f3048b;
                Object t5 = c0609e.f11713c.t();
                O1 o12 = (O1) this.f3049c;
                I1 i12 = binderC0657w0.f11980a;
                if (t5 == null) {
                    i12.Y(c0609e, o12);
                    return;
                } else {
                    i12.X(c0609e, o12);
                    return;
                }
            case 3:
                BinderC0657w0 binderC0657w02 = (BinderC0657w0) this.f3050d;
                binderC0657w02.getClass();
                C0648s c0648s = (C0648s) this.f3048b;
                boolean equals = "_cmp".equals(c0648s.f11929a);
                I1 i13 = binderC0657w02.f11980a;
                if (equals && (rVar = c0648s.f11930b) != null) {
                    Bundle bundle2 = rVar.f11922a;
                    if (bundle2.size() != 0) {
                        String string = bundle2.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            i13.b().f11583z.b(c0648s.toString(), "Event has been filtered ");
                            c0648s = new C0648s("_cmpx", rVar, c0648s.f11931c, c0648s.f11932d);
                        }
                    }
                }
                String str2 = c0648s.f11929a;
                C0628k0 c0628k0 = i13.f11403a;
                C0598a0 c0598a0 = i13.f11409u;
                I1.S(c0628k0);
                O1 o13 = (O1) this.f3049c;
                String str3 = o13.f11506a;
                zzc zzcVar = TextUtils.isEmpty(str3) ? null : (zzc) c0628k0.f11804x.get(str3);
                if (zzcVar == null) {
                    i13.b().f11573B.b(o13.f11506a, "EES not loaded for");
                    i13.A();
                    i13.j(c0648s, o13);
                    return;
                }
                try {
                    I1.S(c0598a0);
                    HashMap z02 = C0598a0.z0(c0648s.f11930b.D(), true);
                    String g = D0.g(str2, D0.f11237c, D0.f11235a);
                    if (g == null) {
                        g = str2;
                    }
                    if (zzcVar.zzb(new zzaa(g, c0648s.f11932d, z02))) {
                        if (zzcVar.zzc()) {
                            i13.b().f11573B.b(str2, "EES edited event");
                            I1.S(c0598a0);
                            C0648s N10 = C0598a0.N(zzcVar.zze().zzc());
                            i13.A();
                            i13.j(N10, o13);
                        } else {
                            i13.A();
                            i13.j(c0648s, o13);
                        }
                        if (zzcVar.zzd()) {
                            for (zzaa zzaaVar : zzcVar.zze().zzf()) {
                                i13.b().f11573B.b(zzaaVar.zzb(), "EES logging created event");
                                I1.S(c0598a0);
                                C0648s N11 = C0598a0.N(zzaaVar);
                                i13.A();
                                i13.j(N11, o13);
                            }
                            return;
                        }
                        return;
                    }
                } catch (zzd unused2) {
                    i13.b().f11577f.c("EES error. appId, eventName", o13.f11507b, str2);
                }
                i13.b().f11573B.b(str2, "EES was not applied to event");
                i13.A();
                i13.j(c0648s, o13);
                return;
            case 4:
                BinderC0657w0 binderC0657w03 = (BinderC0657w0) this.f3050d;
                binderC0657w03.f11980a.A();
                binderC0657w03.f11980a.h((C0648s) this.f3048b, (String) this.f3049c);
                return;
            case 5:
                BinderC0657w0 binderC0657w04 = (BinderC0657w0) this.f3050d;
                binderC0657w04.f11980a.A();
                K1 k12 = (K1) this.f3048b;
                Object t10 = k12.t();
                O1 o14 = (O1) this.f3049c;
                I1 i14 = binderC0657w04.f11980a;
                if (t10 == null) {
                    i14.V(k12.f11429b, o14);
                    return;
                } else {
                    i14.U(k12, o14);
                    return;
                }
            case 6:
                I1 i15 = ((BinderC0657w0) this.f3048b).f11980a;
                i15.A();
                String str4 = ((O1) this.f3049c).f11506a;
                G.g(str4);
                i15.c().J();
                i15.k0();
                C0633m c0633m2 = i15.f11405c;
                I1.S(c0633m2);
                C0606d c0606d2 = (C0606d) this.f3050d;
                long j11 = c0606d2.f11696a;
                c0633m2.J();
                c0633m2.K();
                Cursor cursor3 = null;
                r19 = null;
                J1 j13 = null;
                try {
                    cursor = c0633m2.A0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j11)}, null, null, null, "1");
                    try {
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor2 = cursor;
                        j = j11;
                        c0606d = c0606d2;
                        i10 = 4;
                        c0633m = c0633m2;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    j = j11;
                    c0606d = c0606d2;
                    i10 = 4;
                    c0633m = c0633m2;
                    cursor = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (!cursor.moveToFirst()) {
                    j = j11;
                    c0606d = c0606d2;
                    i10 = 4;
                    if (cursor != null) {
                        cursor.close();
                    }
                    j12 = j13;
                    if (j12 == null) {
                        i15.b().f11580w.c("[sgtm] Queued batch doesn't exist. appId, rowId", str4, Long.valueOf(j));
                        return;
                    }
                    HashMap hashMap = i15.f11397S;
                    String str5 = j12.f11419c;
                    C0606d c0606d3 = c0606d;
                    int i16 = c0606d3.f11697b;
                    if (i16 != 1) {
                        if (i16 == 3) {
                            H1 h12 = (H1) hashMap.get(str5);
                            if (h12 == null) {
                                h12 = new H1(i15);
                                hashMap.put(str5, h12);
                            } else {
                                h12.f11375b++;
                                h12.f11376c = h12.a();
                            }
                            ((M5.b) i15.e()).getClass();
                            i15.b().f11573B.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str5, Long.valueOf((h12.f11376c - System.currentTimeMillis()) / 1000));
                        }
                        C0633m c0633m3 = i15.f11405c;
                        I1.S(c0633m3);
                        Long valueOf2 = Long.valueOf(c0606d3.f11696a);
                        c0633m3.V(valueOf2);
                        i15.b().f11573B.c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str4, valueOf2);
                        return;
                    }
                    if (hashMap.containsKey(str5)) {
                        hashMap.remove(str5);
                    }
                    C0633m c0633m4 = i15.f11405c;
                    I1.S(c0633m4);
                    Long valueOf3 = Long.valueOf(j);
                    c0633m4.Q(valueOf3);
                    i15.b().f11573B.c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str4, valueOf3);
                    long j14 = c0606d3.f11698c;
                    if (j14 > 0) {
                        C0633m c0633m5 = i15.f11405c;
                        I1.S(c0633m5);
                        c0633m5.J();
                        c0633m5.K();
                        Long valueOf4 = Long.valueOf(j14);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("upload_type", (Integer) 1);
                        C0646q0 c0646q04 = (C0646q0) c0633m5.f3094a;
                        M5.b bVar = c0646q04.f11917y;
                        W w11 = c0646q04.f11912f;
                        bVar.getClass();
                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                        try {
                            if (c0633m5.A0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j14), str4, String.valueOf(i10)}) != 1) {
                                C0646q0.l(w11);
                                w11.f11580w.c("Google Signal pending batch not updated. appId, rowId", str4, valueOf4);
                            }
                            i15.b().f11573B.c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str4, Long.valueOf(j14));
                            i15.t(str4);
                            return;
                        } catch (SQLiteException e11) {
                            C0646q0.l(w11);
                            w11.f11577f.d("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j14), e11);
                            throw e11;
                        }
                    }
                    return;
                }
                String string2 = cursor.getString(1);
                G.g(string2);
                cursor2 = cursor;
                j = j11;
                i10 = 4;
                c0606d = c0606d2;
                c0633m = c0633m2;
                try {
                    j13 = c0633m2.m0(string2, j11, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    cursor2.close();
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor = cursor2;
                    try {
                        W w12 = ((C0646q0) c0633m.f3094a).f11912f;
                        C0646q0.l(w12);
                        w12.f11577f.c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j), e);
                        if (cursor != null) {
                        }
                        j12 = j13;
                        if (j12 == null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
                j12 = j13;
                if (j12 == null) {
                }
            case 7:
                AtomicReference atomicReference2 = (AtomicReference) this.f3048b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            c0632l1 = (C0632l1) this.f3050d;
                            c0646q0 = (C0646q0) c0632l1.f3094a;
                            c0613f0 = c0646q0.f11911e;
                            C0646q0.j(c0613f0);
                        } catch (RemoteException e13) {
                            W w13 = ((C0646q0) ((C0632l1) this.f3050d).f3094a).f11912f;
                            C0646q0.l(w13);
                            w13.f11577f.b(e13, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.f3048b;
                        }
                        if (c0613f0.Q().i(B0.ANALYTICS_STORAGE)) {
                            I i17 = c0632l1.f11815d;
                            if (i17 != null) {
                                atomicReference2.set(i17.p((O1) this.f3049c));
                                String str6 = (String) atomicReference2.get();
                                if (str6 != null) {
                                    S0 s02 = ((C0646q0) c0632l1.f3094a).f11890A;
                                    C0646q0.k(s02);
                                    s02.f11554u.set(str6);
                                    C0613f0 c0613f03 = c0646q0.f11911e;
                                    C0646q0.j(c0613f03);
                                    c0613f03.f11745u.u(str6);
                                }
                                c0632l1.W();
                                atomicReference = (AtomicReference) this.f3048b;
                                atomicReference.notify();
                                return;
                            }
                            W w14 = c0646q0.f11912f;
                            C0646q0.l(w14);
                            w14.f11577f.a("Failed to get app instance id");
                            atomicReference2.notify();
                        } else {
                            W w15 = c0646q0.f11912f;
                            C0646q0.l(w15);
                            w15.f11582y.a("Analytics storage consent denied; will not get app instance id");
                            S0 s03 = ((C0646q0) c0632l1.f3094a).f11890A;
                            C0646q0.k(s03);
                            s03.f11554u.set(null);
                            C0613f0 c0613f04 = c0646q0.f11911e;
                            C0646q0.j(c0613f04);
                            c0613f04.f11745u.u(null);
                            atomicReference2.set(null);
                            atomicReference2.notify();
                        }
                        return;
                    } catch (Throwable th5) {
                        ((AtomicReference) this.f3048b).notify();
                        throw th5;
                    }
                }
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                zzcu zzcuVar = (zzcu) this.f3049c;
                C0632l1 c0632l12 = (C0632l1) this.f3050d;
                String str7 = null;
                try {
                    try {
                        c0646q02 = (C0646q0) c0632l12.f3094a;
                        C0613f0 c0613f05 = c0646q02.f11911e;
                        C0646q0.j(c0613f05);
                        i11 = c0613f05.Q().i(B0.ANALYTICS_STORAGE);
                        c0646q03 = (C0646q0) c0632l12.f3094a;
                        c0613f02 = c0646q02.f11911e;
                        w10 = c0646q02.f11912f;
                    } catch (RemoteException e14) {
                        W w16 = ((C0646q0) c0632l12.f3094a).f11912f;
                        C0646q0.l(w16);
                        w16.f11577f.b(e14, "Failed to get app instance id");
                    }
                    if (i11) {
                        I i18 = c0632l12.f11815d;
                        if (i18 != null) {
                            str7 = i18.p((O1) this.f3048b);
                            if (str7 != null) {
                                S0 s04 = c0646q03.f11890A;
                                C0646q0.k(s04);
                                s04.f11554u.set(str7);
                                C0646q0.j(c0613f02);
                                c0613f02.f11745u.u(str7);
                            }
                            c0632l12.W();
                            m12 = ((C0646q0) c0632l12.f3094a).f11915w;
                            C0646q0.j(m12);
                            m12.r0(str7, zzcuVar);
                            return;
                        }
                        C0646q0.l(w10);
                        w10.f11577f.a("Failed to get app instance id");
                    } else {
                        C0646q0.l(w10);
                        w10.f11582y.a("Analytics storage consent denied; will not get app instance id");
                        S0 s05 = c0646q03.f11890A;
                        C0646q0.k(s05);
                        s05.f11554u.set(null);
                        C0646q0.j(c0613f02);
                        c0613f02.f11745u.u(null);
                    }
                    m12 = c0646q02.f11915w;
                    C0646q0.j(m12);
                    m12.r0(str7, zzcuVar);
                    return;
                } catch (Throwable th6) {
                    M1 m13 = ((C0646q0) c0632l12.f3094a).f11915w;
                    C0646q0.j(m13);
                    m13.r0(null, zzcuVar);
                    throw th6;
                }
            case 9:
                O1 o15 = (O1) this.f3049c;
                C0606d c0606d4 = (C0606d) this.f3050d;
                C0632l1 c0632l13 = (C0632l1) this.f3048b;
                I i19 = c0632l13.f11815d;
                C0646q0 c0646q05 = (C0646q0) c0632l13.f3094a;
                if (i19 == null) {
                    W w17 = c0646q05.f11912f;
                    C0646q0.l(w17);
                    w17.f11577f.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    i19.s(o15, c0606d4);
                    c0632l13.W();
                    return;
                } catch (RemoteException e15) {
                    W w18 = c0646q05.f11912f;
                    C0646q0.l(w18);
                    w18.f11577f.c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c0606d4.f11696a), e15);
                    return;
                }
            case 10:
                C0463k c0463k = (C0463k) this.f3048b;
                ((W) this.f3049c).f11573B.a("AppMeasurementJobService processed last upload request.");
                ((InterfaceC0641o1) ((Service) c0463k.f8074b)).b((JobParameters) this.f3050d);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                s sVar = (s) this.f3050d;
                int i20 = sVar.f470a;
                AbstractC0971l abstractC0971l = (AbstractC0971l) this.f3048b;
                if (i20 > 0) {
                    Bundle bundle3 = (Bundle) sVar.f472c;
                    abstractC0971l.onCreate(bundle3 != null ? bundle3.getBundle((String) this.f3049c) : null);
                }
                if (sVar.f470a >= 2) {
                    abstractC0971l.onStart();
                }
                if (sVar.f470a >= 3) {
                    abstractC0971l.onResume();
                }
                if (sVar.f470a >= 4) {
                    abstractC0971l.onStop();
                }
                if (sVar.f470a >= 5) {
                    abstractC0971l.onDestroy();
                    return;
                }
                return;
            case 12:
                a();
                return;
            case 13:
                try {
                    obj = ((v1.d) this.f3048b).call();
                } catch (Exception unused3) {
                    obj = null;
                }
                ((Handler) this.f3050d).post(new hc.i(16, (e) this.f3049c, obj, false));
                return;
            default:
                InterfaceC1269b a9 = ((vb.i) this.f3050d).a((Runnable) this.f3049c);
                C1436a c1436a = (C1436a) this.f3048b;
                c1436a.getClass();
                EnumC1437b.f(c1436a, a9);
                return;
        }
    }
}
