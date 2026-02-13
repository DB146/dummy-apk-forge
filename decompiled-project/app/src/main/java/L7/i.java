package L7;

import Y5.A1;
import Y5.B1;
import Y5.BinderC0611e1;
import Y5.BinderC0614f1;
import Y5.BinderC0657w0;
import Y5.C0598a0;
import Y5.C0632l1;
import Y5.C0633m;
import Y5.C0646q0;
import Y5.C0648s;
import Y5.C1;
import Y5.F;
import Y5.I;
import Y5.I1;
import Y5.J1;
import Y5.M;
import Y5.M1;
import Y5.O1;
import Y5.RunnableC0655v0;
import Y5.S0;
import Y5.W;
import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.C1108c;
import ia.C1358d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import n.C1671e;
import n.C1680n;
import n.MenuC1678l;
import n.ViewOnKeyListenerC1672f;
import y1.a0;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6352c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6354e;

    public i(R7.b bVar, String str, String str2, Bundle bundle) {
        this.f6350a = 9;
        this.f6351b = str;
        this.f6352c = str2;
        this.f6353d = bundle;
        Objects.requireNonNull(bVar);
        this.f6354e = bVar;
    }

    public i(S0 s02, AtomicReference atomicReference, String str, String str2) {
        this.f6350a = 4;
        this.f6351b = atomicReference;
        this.f6352c = str;
        this.f6353d = str2;
        Objects.requireNonNull(s02);
        this.f6354e = s02;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f6350a = i7;
        this.f6354e = obj;
        this.f6351b = obj2;
        this.f6352c = obj3;
        this.f6353d = obj4;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i7, boolean z8) {
        this.f6350a = i7;
        this.f6351b = obj;
        this.f6352c = obj2;
        this.f6353d = obj3;
        this.f6354e = obj4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:116|117|(1:119)(5:141|(1:143)|145|136|137)|120|(2:123|121)|124|125|126|127|(2:130|128)|131|132|(1:134)|135|136|137) */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04db, code lost:
    
        r1.b().f11580w.b(r6, "Failed to parse queued batch. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0424, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r4 + r12)) goto L118;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        J1 j12;
        I i7;
        I i10;
        I i11;
        switch (this.f6350a) {
            case 0:
                j jVar = (j) this.f6354e;
                z zVar = (z) jVar.f6364m;
                G7.d dVar = (G7.d) this.f6351b;
                Q7.f a9 = dVar.a();
                zVar.getClass();
                T7.s sVar = (T7.s) zVar.g.c(new o(0, zVar, a9));
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6352c;
                j jVar2 = dVar.f4359a;
                C0385e c0385e = dVar.f4360b;
                if (sVar != null) {
                    taskCompletionSource.setResult(new G7.a(new G7.d(jVar2, c0385e), new T7.m(sVar, T7.t.f9361a)));
                    return;
                }
                z zVar2 = (z) jVar.f6364m;
                Q7.f a10 = dVar.a();
                zVar2.getClass();
                zVar2.g.c(new q(zVar2, a10));
                z zVar3 = (z) jVar.f6364m;
                zVar3.getClass();
                G7.d dVar2 = new G7.d(jVar2, c0385e);
                T7.m mVar = (T7.m) zVar3.g.d(dVar.a()).f8671c;
                G7.a aVar = new G7.a(dVar2, mVar);
                boolean isEmpty = mVar.f9350a.isEmpty();
                C0384d c0384d = (C0384d) jVar.f6362i;
                if (!isEmpty) {
                    ((O7.b) c0384d.f6333e.f27b).schedule(new Aa.j(5, taskCompletionSource, aVar), 3000L, TimeUnit.MILLISECONDS);
                }
                J7.r rVar = (J7.r) jVar.f6358d;
                ArrayList b2 = c0385e.b();
                HashMap a11 = dVar.a().f8686b.a();
                rVar.getClass();
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                long j = rVar.j;
                rVar.j = 1 + j;
                HashMap hashMap = new HashMap();
                hashMap.put("p", tc.b.E(b2));
                hashMap.put("q", a11);
                rVar.f5627o.put(Long.valueOf(j), new J7.n(hashMap, new J7.c(taskCompletionSource2)));
                if (rVar.f5622h == J7.m.f5594e) {
                    rVar.k(Long.valueOf(j));
                }
                rVar.b();
                taskCompletionSource2.getTask().addOnCompleteListener((O7.b) c0384d.f6333e.f27b, new h(this, taskCompletionSource, aVar, dVar, (j) this.f6353d));
                return;
            case 1:
                M m10 = (M) this.f6354e;
                I1 i12 = ((BinderC0657w0) this.f6351b).f11980a;
                i12.A();
                i12.c().J();
                i12.k0();
                C0633m c0633m = i12.f11405c;
                I1.S(c0633m);
                Object obj = null;
                int intValue = ((Integer) F.f11256B.a(null)).intValue();
                B1 b12 = (B1) this.f6353d;
                String str = (String) this.f6352c;
                List<J1> O10 = c0633m.O(str, b12, intValue);
                ArrayList arrayList = new ArrayList();
                for (J1 j13 : O10) {
                    boolean s3 = i12.s(str, j13.f11419c);
                    long j10 = j13.f11417a;
                    if (s3) {
                        int i13 = j13.f11424i;
                        if (i13 <= 0) {
                            j12 = j13;
                        } else {
                            int intValue2 = ((Integer) F.f11361z.a(obj)).intValue();
                            long j11 = j13.f11423h;
                            if (i13 <= intValue2) {
                                j12 = j13;
                                long min = Math.min(((Long) F.f11357x.a(obj)).longValue() * (1 << (i13 - 1)), ((Long) F.f11359y.a(obj)).longValue());
                                ((M5.b) i12.e()).getClass();
                                break;
                            }
                            i12.b().f11573B.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j10), Long.valueOf(j11));
                            obj = null;
                        }
                        Bundle bundle = new Bundle();
                        J1 j14 = j12;
                        for (Map.Entry entry : j14.f11420d.entrySet()) {
                            bundle.putString((String) entry.getKey(), (String) entry.getValue());
                        }
                        A1 a12 = new A1(j14.f11417a, j14.f11418b.zzcc(), j14.f11419c, bundle, j14.f11421e.f11603a, j14.g, "");
                        zzhz zzhzVar = (zzhz) C0598a0.w0(zzib.zzh(), a12.f11206b);
                        for (int i14 = 0; i14 < zzhzVar.zzb(); i14++) {
                            zzic zzicVar = (zzic) zzhzVar.zzc(i14).zzcl();
                            ((M5.b) i12.e()).getClass();
                            zzicVar.zzs(System.currentTimeMillis());
                            zzhzVar.zzd(i14, zzicVar);
                        }
                        a12.f11206b = ((zzib) zzhzVar.zzbc()).zzcc();
                        if (Log.isLoggable(i12.b().T(), 2)) {
                            C0598a0 c0598a0 = i12.f11409u;
                            I1.S(c0598a0);
                            a12.f11211u = c0598a0.m0((zzib) zzhzVar.zzbc());
                        }
                        arrayList.add(a12);
                        obj = null;
                    } else {
                        i12.b().f11573B.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j10), j13.f11419c);
                    }
                }
                try {
                    m10.o(new C1(arrayList));
                    i12.b().f11573B.c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(arrayList.size()));
                    return;
                } catch (RemoteException e2) {
                    i12.b().f11577f.c("[sgtm] Failed to return upload batches for app", str, e2);
                    return;
                }
            case 2:
                C0632l1 o10 = ((AppMeasurementDynamiteService) this.f6354e).f15154a.o();
                o10.J();
                o10.K();
                C0646q0 c0646q0 = (C0646q0) o10.f3094a;
                M1 m12 = c0646q0.f11915w;
                C0646q0.j(m12);
                int d10 = F5.f.f4100b.d(((C0646q0) m12.f3094a).f11907a, 12451000);
                zzcu zzcuVar = (zzcu) this.f6351b;
                if (d10 == 0) {
                    o10.X(new i(o10, (C0648s) this.f6352c, (String) this.f6353d, zzcuVar, 6));
                    return;
                }
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11580w.a("Not bundling data. Service unavailable or out of date");
                M1 m13 = c0646q0.f11915w;
                C0646q0.j(m13);
                m13.u0(zzcuVar, new byte[0]);
                return;
            case 3:
                I1 i15 = ((BinderC0657w0) this.f6351b).f11980a;
                boolean T10 = i15.d0().T(null, F.f11295V0);
                Bundle bundle2 = (Bundle) this.f6352c;
                boolean isEmpty2 = bundle2.isEmpty();
                String str2 = (String) this.f6353d;
                if (isEmpty2 && T10) {
                    C0633m c0633m2 = i15.f11405c;
                    I1.S(c0633m2);
                    c0633m2.J();
                    c0633m2.K();
                    try {
                        c0633m2.A0().execSQL("delete from default_event_params where app_id=?", new String[]{str2});
                        return;
                    } catch (SQLiteException e10) {
                        W w11 = ((C0646q0) c0633m2.f3094a).f11912f;
                        C0646q0.l(w11);
                        w11.f11577f.b(e10, "Error clearing default event params");
                        return;
                    }
                }
                C0633m c0633m3 = i15.f11405c;
                I1.S(c0633m3);
                c0633m3.J();
                c0633m3.K();
                S4.k kVar = new S4.k((C0646q0) c0633m3.f3094a, "", str2, "dep", 0L, 0L, bundle2);
                C0598a0 c0598a02 = c0633m3.f12021b.f11409u;
                I1.S(c0598a02);
                byte[] zzcc = c0598a02.l0(kVar).zzcc();
                W w12 = ((C0646q0) c0633m3.f3094a).f11912f;
                C0646q0.l(w12);
                w12.f11573B.c("Saving default event parameters, appId, data size", str2, Integer.valueOf(zzcc.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", zzcc);
                try {
                    if (c0633m3.A0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        C0646q0.l(w12);
                        w12.f11577f.b(W.R(str2), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e11) {
                    C0646q0.l(w12);
                    w12.f11577f.c("Error storing default event parameters. appId", W.R(str2), e11);
                }
                C0633m c0633m4 = i15.f11405c;
                I1.S(c0633m4);
                long j15 = ((O1) this.f6354e).f11504R;
                try {
                    if (c0633m4.g0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j15)}, 0L) > 0) {
                        return;
                    }
                    if (c0633m4.g0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str2, String.valueOf(j15)}, 0L) > 0) {
                        C0633m c0633m5 = i15.f11405c;
                        I1.S(c0633m5);
                        c0633m5.d0(str2, Long.valueOf(j15), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e12) {
                    W w13 = ((C0646q0) c0633m4.f3094a).f11912f;
                    C0646q0.l(w13);
                    w13.f11577f.b(e12, "Error checking backfill conditions");
                    return;
                }
            case 4:
                C0632l1 o11 = ((C0646q0) ((S0) this.f6354e).f3094a).o();
                o11.J();
                o11.K();
                o11.X(new RunnableC0655v0(o11, (AtomicReference) this.f6351b, (String) this.f6352c, (String) this.f6353d, o11.Z(false)));
                return;
            case 5:
                C0632l1 o12 = ((AppMeasurementDynamiteService) this.f6354e).f15154a.o();
                o12.J();
                o12.K();
                o12.X(new RunnableC0655v0(o12, (String) this.f6352c, (String) this.f6353d, o12.Z(false), (zzcu) this.f6351b));
                return;
            case 6:
                zzcu zzcuVar2 = (zzcu) this.f6353d;
                C0632l1 c0632l1 = (C0632l1) this.f6354e;
                byte[] bArr = null;
                try {
                    try {
                        i7 = c0632l1.f11815d;
                    } finally {
                        M1 m14 = ((C0646q0) c0632l1.f3094a).f11915w;
                        C0646q0.j(m14);
                        m14.u0(zzcuVar2, null);
                    }
                } catch (RemoteException e13) {
                    W w14 = ((C0646q0) c0632l1.f3094a).f11912f;
                    C0646q0.l(w14);
                    w14.f11577f.b(e13, "Failed to send event to the service to bundle");
                }
                if (i7 != null) {
                    bArr = i7.m((C0648s) this.f6351b, (String) this.f6352c);
                    c0632l1.W();
                    return;
                }
                C0646q0 c0646q02 = (C0646q0) c0632l1.f3094a;
                W w15 = c0646q02.f11912f;
                C0646q0.l(w15);
                w15.f11577f.a("Discarding data. Failed to send event to service to bundle");
                M1 m15 = c0646q02.f11915w;
                C0646q0.j(m15);
                m15.u0(zzcuVar2, null);
                return;
            case 7:
                C0632l1 c0632l12 = (C0632l1) this.f6351b;
                AtomicReference atomicReference = (AtomicReference) this.f6352c;
                O1 o13 = (O1) this.f6353d;
                Bundle bundle3 = (Bundle) this.f6354e;
                synchronized (atomicReference) {
                    try {
                        i10 = c0632l12.f11815d;
                    } catch (RemoteException e14) {
                        W w16 = ((C0646q0) c0632l12.f3094a).f11912f;
                        C0646q0.l(w16);
                        w16.f11577f.b(e14, "Failed to request trigger URIs; remote exception");
                        atomicReference.notifyAll();
                    }
                    if (i10 != null) {
                        i10.x(o13, bundle3, new BinderC0611e1(c0632l12, atomicReference));
                        c0632l12.W();
                        return;
                    } else {
                        W w17 = ((C0646q0) c0632l12.f3094a).f11912f;
                        C0646q0.l(w17);
                        w17.f11577f.a("Failed to request trigger URIs; not connected to service");
                        return;
                    }
                }
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                C0632l1 c0632l13 = (C0632l1) this.f6351b;
                AtomicReference atomicReference2 = (AtomicReference) this.f6352c;
                O1 o14 = (O1) this.f6353d;
                B1 b13 = (B1) this.f6354e;
                synchronized (atomicReference2) {
                    try {
                        i11 = c0632l13.f11815d;
                    } catch (RemoteException e15) {
                        W w18 = ((C0646q0) c0632l13.f3094a).f11912f;
                        C0646q0.l(w18);
                        w18.f11577f.b(e15, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference2.notifyAll();
                    }
                    if (i11 != null) {
                        i11.D(o14, b13, new BinderC0614f1(c0632l13, atomicReference2));
                        c0632l13.W();
                        return;
                    } else {
                        W w19 = ((C0646q0) c0632l13.f3094a).f11912f;
                        C0646q0.l(w19);
                        w19.f11577f.a("[sgtm] Failed to get upload batches; not connected to service");
                        return;
                    }
                }
            case 9:
                I1 i16 = (I1) ((R7.b) this.f6354e).f8929b;
                M1 j02 = i16.j0();
                ((M5.b) i16.e()).getClass();
                C0648s l02 = j02.l0((String) this.f6352c, (Bundle) this.f6353d, "auto", System.currentTimeMillis(), false);
                G.g(l02);
                i16.h(l02, (String) this.f6351b);
                return;
            case 10:
                C1671e c1671e = (C1671e) this.f6351b;
                if (c1671e != null) {
                    C1358d c1358d = (C1358d) this.f6354e;
                    ((ViewOnKeyListenerC1672f) c1358d.f18487b).f20916N = true;
                    c1671e.f20902b.c(false);
                    ((ViewOnKeyListenerC1672f) c1358d.f18487b).f20916N = false;
                }
                C1680n c1680n = (C1680n) this.f6352c;
                if (c1680n.isEnabled() && c1680n.hasSubMenu()) {
                    ((MenuC1678l) this.f6353d).q(c1680n, null, 4);
                    return;
                }
                return;
            default:
                y1.W.h((View) this.f6351b, (a0) this.f6352c, (C1108c) this.f6353d);
                ((ValueAnimator) this.f6354e).start();
                return;
        }
    }
}
