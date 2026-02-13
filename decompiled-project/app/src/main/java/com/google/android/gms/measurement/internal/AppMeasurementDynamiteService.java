package com.google.android.gms.measurement.internal;

import A9.J;
import E5.k;
import L7.i;
import La.f;
import P5.a;
import P5.b;
import Q7.h;
import Y5.A1;
import Y5.C0605c1;
import Y5.C0640o0;
import Y5.C0646q0;
import Y5.C0648s;
import Y5.C0654v;
import Y5.C1;
import Y5.D0;
import Y5.E0;
import Y5.F0;
import Y5.K0;
import Y5.L0;
import Y5.M1;
import Y5.N;
import Y5.N0;
import Y5.N1;
import Y5.O0;
import Y5.RunnableC0643p0;
import Y5.S0;
import Y5.U;
import Y5.V0;
import Y5.W;
import Y5.X0;
import Y5.Z;
import Y5.Z0;
import Y5.r;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcx;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import i2.C1332t;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import q3.l;
import u.C2052e;
import u.T;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends zzcq {

    /* renamed from: a, reason: collision with root package name */
    public C0646q0 f15154a = null;

    /* renamed from: b, reason: collision with root package name */
    public final C2052e f15155b = new T(0);

    public final void F(String str, zzcu zzcuVar) {
        h();
        M1 m12 = this.f15154a.f11915w;
        C0646q0.j(m12);
        m12.r0(str, zzcuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void beginAdUnitExposure(String str, long j) {
        h();
        C0654v c0654v = this.f15154a.f11891B;
        C0646q0.i(c0654v);
        c0654v.K(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.X(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearMeasurementEnabled(long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.K();
        C0640o0 c0640o0 = ((C0646q0) s02.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new k(s02, (Boolean) null));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void endAdUnitExposure(String str, long j) {
        h();
        C0654v c0654v = this.f15154a.f11891B;
        C0646q0.i(c0654v);
        c0654v.L(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void generateEventId(zzcu zzcuVar) {
        h();
        M1 m12 = this.f15154a.f11915w;
        C0646q0.j(m12);
        long F02 = m12.F0();
        h();
        M1 m13 = this.f15154a.f11915w;
        C0646q0.j(m13);
        m13.s0(zzcuVar, F02);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getAppInstanceId(zzcu zzcuVar) {
        h();
        C0640o0 c0640o0 = this.f15154a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new RunnableC0643p0(this, zzcuVar, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCachedAppInstanceId(zzcu zzcuVar) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        F((String) s02.f11554u.get(), zzcuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) {
        h();
        C0640o0 c0640o0 = this.f15154a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new i(this, zzcuVar, str, str2, 5));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenClass(zzcu zzcuVar) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        C0605c1 c0605c1 = ((C0646q0) s02.f3094a).f11918z;
        C0646q0.k(c0605c1);
        Z0 z02 = c0605c1.f11686c;
        F(z02 != null ? z02.f11612b : null, zzcuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenName(zzcu zzcuVar) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        C0605c1 c0605c1 = ((C0646q0) s02.f3094a).f11918z;
        C0646q0.k(c0605c1);
        Z0 z02 = c0605c1.f11686c;
        F(z02 != null ? z02.f11611a : null, zzcuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getGmpAppId(zzcu zzcuVar) {
        String str;
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        C0646q0 c0646q0 = (C0646q0) s02.f3094a;
        try {
            str = D0.b(c0646q0.f11907a, c0646q0.f11893D);
        } catch (IllegalStateException e2) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.b(e2, "getGoogleAppId failed with exception");
            str = null;
        }
        F(str, zzcuVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getMaxUserProperties(String str, zzcu zzcuVar) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        G.d(str);
        ((C0646q0) s02.f3094a).getClass();
        h();
        M1 m12 = this.f15154a.f11915w;
        C0646q0.j(m12);
        m12.t0(zzcuVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getSessionId(zzcu zzcuVar) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        C0640o0 c0640o0 = ((C0646q0) s02.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new k(s02, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getTestFlag(zzcu zzcuVar, int i7) {
        h();
        if (i7 == 0) {
            M1 m12 = this.f15154a.f11915w;
            C0646q0.j(m12);
            S0 s02 = this.f15154a.f11890A;
            C0646q0.k(s02);
            AtomicReference atomicReference = new AtomicReference();
            C0640o0 c0640o0 = ((C0646q0) s02.f3094a).f11913u;
            C0646q0.l(c0640o0);
            m12.r0((String) c0640o0.T(atomicReference, 15000L, "String test flag value", new N0(s02, atomicReference, 1)), zzcuVar);
            return;
        }
        if (i7 == 1) {
            M1 m13 = this.f15154a.f11915w;
            C0646q0.j(m13);
            S0 s03 = this.f15154a.f11890A;
            C0646q0.k(s03);
            AtomicReference atomicReference2 = new AtomicReference();
            C0640o0 c0640o02 = ((C0646q0) s03.f3094a).f11913u;
            C0646q0.l(c0640o02);
            m13.s0(zzcuVar, ((Long) c0640o02.T(atomicReference2, 15000L, "long test flag value", new N0(s03, atomicReference2, 2))).longValue());
            return;
        }
        if (i7 == 2) {
            M1 m14 = this.f15154a.f11915w;
            C0646q0.j(m14);
            S0 s04 = this.f15154a.f11890A;
            C0646q0.k(s04);
            AtomicReference atomicReference3 = new AtomicReference();
            C0640o0 c0640o03 = ((C0646q0) s04.f3094a).f11913u;
            C0646q0.l(c0640o03);
            double doubleValue = ((Double) c0640o03.T(atomicReference3, 15000L, "double test flag value", new N0(s04, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcuVar.zzb(bundle);
                return;
            } catch (RemoteException e2) {
                W w10 = ((C0646q0) m14.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11580w.b(e2, "Error returning double value to wrapper");
                return;
            }
        }
        if (i7 == 3) {
            M1 m15 = this.f15154a.f11915w;
            C0646q0.j(m15);
            S0 s05 = this.f15154a.f11890A;
            C0646q0.k(s05);
            AtomicReference atomicReference4 = new AtomicReference();
            C0640o0 c0640o04 = ((C0646q0) s05.f3094a).f11913u;
            C0646q0.l(c0640o04);
            m15.t0(zzcuVar, ((Integer) c0640o04.T(atomicReference4, 15000L, "int test flag value", new N0(s05, atomicReference4, 3))).intValue());
            return;
        }
        if (i7 != 4) {
            return;
        }
        M1 m16 = this.f15154a.f11915w;
        C0646q0.j(m16);
        S0 s06 = this.f15154a.f11890A;
        C0646q0.k(s06);
        AtomicReference atomicReference5 = new AtomicReference();
        C0640o0 c0640o05 = ((C0646q0) s06.f3094a).f11913u;
        C0646q0.l(c0640o05);
        m16.v0(zzcuVar, ((Boolean) c0640o05.T(atomicReference5, 15000L, "boolean test flag value", new N0(s06, atomicReference5, 0))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getUserProperties(String str, String str2, boolean z8, zzcu zzcuVar) {
        h();
        C0640o0 c0640o0 = this.f15154a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new L0(this, zzcuVar, str, str2, z8));
    }

    public final void h() {
        if (this.f15154a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initForTests(Map map) {
        h();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initialize(a aVar, zzdd zzddVar, long j) {
        C0646q0 c0646q0 = this.f15154a;
        if (c0646q0 == null) {
            Context context = (Context) b.F(aVar);
            G.g(context);
            this.f15154a = C0646q0.r(context, zzddVar, Long.valueOf(j));
        } else {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11580w.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void isDataCollectionEnabled(zzcu zzcuVar) {
        h();
        C0640o0 c0640o0 = this.f15154a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new RunnableC0643p0(this, zzcuVar, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z10, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.O(str, str2, bundle, z8, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j) {
        h();
        G.d(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C0648s c0648s = new C0648s(str2, new r(bundle), "app", j);
        C0640o0 c0640o0 = this.f15154a.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new i(this, zzcuVar, c0648s, str, 2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logHealthData(int i7, String str, a aVar, a aVar2, a aVar3) {
        h();
        Object F10 = aVar == null ? null : b.F(aVar);
        Object F11 = aVar2 == null ? null : b.F(aVar2);
        Object F12 = aVar3 != null ? b.F(aVar3) : null;
        W w10 = this.f15154a.f11912f;
        C0646q0.l(w10);
        w10.S(i7, true, false, str, F10, F11, F12);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreated(a aVar, Bundle bundle, long j) {
        h();
        Activity activity = (Activity) b.F(aVar);
        G.g(activity);
        onActivityCreatedByScionActivityInfo(zzdf.zza(activity), bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        f fVar = s02.f11550c;
        if (fVar != null) {
            S0 s03 = this.f15154a.f11890A;
            C0646q0.k(s03);
            s03.b0();
            fVar.j(zzdfVar, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyed(a aVar, long j) {
        h();
        Activity activity = (Activity) b.F(aVar);
        G.g(activity);
        onActivityDestroyedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        f fVar = s02.f11550c;
        if (fVar != null) {
            S0 s03 = this.f15154a.f11890A;
            C0646q0.k(s03);
            s03.b0();
            fVar.k(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPaused(a aVar, long j) {
        h();
        Activity activity = (Activity) b.F(aVar);
        G.g(activity);
        onActivityPausedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        f fVar = s02.f11550c;
        if (fVar != null) {
            S0 s03 = this.f15154a.f11890A;
            C0646q0.k(s03);
            s03.b0();
            fVar.l(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumed(a aVar, long j) {
        h();
        Activity activity = (Activity) b.F(aVar);
        G.g(activity);
        onActivityResumedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        f fVar = s02.f11550c;
        if (fVar != null) {
            S0 s03 = this.f15154a.f11890A;
            C0646q0.k(s03);
            s03.b0();
            fVar.m(zzdfVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceState(a aVar, zzcu zzcuVar, long j) {
        h();
        Activity activity = (Activity) b.F(aVar);
        G.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza(activity), zzcuVar, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        f fVar = s02.f11550c;
        Bundle bundle = new Bundle();
        if (fVar != null) {
            S0 s03 = this.f15154a.f11890A;
            C0646q0.k(s03);
            s03.b0();
            fVar.n(zzdfVar, bundle);
        }
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            W w10 = this.f15154a.f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStarted(a aVar, long j) {
        h();
        Activity activity = (Activity) b.F(aVar);
        G.g(activity);
        onActivityStartedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        if (s02.f11550c != null) {
            S0 s03 = this.f15154a.f11890A;
            C0646q0.k(s03);
            s03.b0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStopped(a aVar, long j) {
        h();
        Activity activity = (Activity) b.F(aVar);
        G.g(activity);
        onActivityStoppedByScionActivityInfo(zzdf.zza(activity), j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        if (s02.f11550c != null) {
            S0 s03 = this.f15154a.f11890A;
            C0646q0.k(s03);
            s03.b0();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void performAction(Bundle bundle, zzcu zzcuVar, long j) {
        h();
        zzcuVar.zzb(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void registerOnMeasurementEventListener(zzda zzdaVar) {
        Object obj;
        h();
        C2052e c2052e = this.f15155b;
        synchronized (c2052e) {
            try {
                obj = (F0) c2052e.get(Integer.valueOf(zzdaVar.zzf()));
                if (obj == null) {
                    obj = new N1(this, zzdaVar);
                    c2052e.put(Integer.valueOf(zzdaVar.zzf()), obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.K();
        if (s02.f11552e.add(obj)) {
            return;
        }
        W w10 = ((C0646q0) s02.f3094a).f11912f;
        C0646q0.l(w10);
        w10.f11580w.a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void resetAnalyticsData(long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.f11554u.set(null);
        C0640o0 c0640o0 = ((C0646q0) s02.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new K0(s02, j, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void retrieveAndUploadBatches(zzcx zzcxVar) {
        X0 x02;
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.K();
        C0646q0 c0646q0 = (C0646q0) s02.f3094a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        if (c0640o0.P()) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        C0640o0 c0640o02 = c0646q0.f11913u;
        C0646q0.l(c0640o02);
        if (Thread.currentThread() == c0640o02.f11865d) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (C1332t.e()) {
            W w12 = c0646q0.f11912f;
            C0646q0.l(w12);
            w12.f11577f.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        W w13 = c0646q0.f11912f;
        C0646q0.l(w13);
        w13.f11573B.a("[sgtm] Started client-side batch upload work.");
        boolean z8 = false;
        int i7 = 0;
        int i10 = 0;
        loop0: while (!z8) {
            W w14 = c0646q0.f11912f;
            C0646q0.l(w14);
            w14.f11573B.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C0640o0 c0640o03 = c0646q0.f11913u;
            C0646q0.l(c0640o03);
            c0640o03.T(atomicReference, 10000L, "[sgtm] Getting upload batches", new N0(s02, atomicReference, 6, false));
            C1 c12 = (C1) atomicReference.get();
            if (c12 == null) {
                break;
            }
            ArrayList arrayList = c12.f11232a;
            if (arrayList.isEmpty()) {
                break;
            }
            W w15 = c0646q0.f11912f;
            C0646q0.l(w15);
            w15.f11573B.b(Integer.valueOf(arrayList.size()), "[sgtm] Retrieved upload batches. count");
            i7 += arrayList.size();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z8 = false;
                    break;
                }
                A1 a12 = (A1) it.next();
                try {
                    URL url = new URI(a12.f11207c).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    N q10 = ((C0646q0) s02.f3094a).q();
                    q10.K();
                    G.g(q10.f11471u);
                    String str = q10.f11471u;
                    C0646q0 c0646q02 = (C0646q0) s02.f3094a;
                    W w16 = c0646q02.f11912f;
                    C0646q0.l(w16);
                    U u3 = w16.f11573B;
                    Long valueOf = Long.valueOf(a12.f11205a);
                    u3.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, a12.f11207c, Integer.valueOf(a12.f11206b.length));
                    if (!TextUtils.isEmpty(a12.f11211u)) {
                        W w17 = c0646q02.f11912f;
                        C0646q0.l(w17);
                        w17.f11573B.c("[sgtm] Uploading data from app. row_id", valueOf, a12.f11211u);
                    }
                    HashMap hashMap = new HashMap();
                    Bundle bundle = a12.f11208d;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str2, string);
                        }
                    }
                    V0 v02 = c0646q02.f11892C;
                    C0646q0.l(v02);
                    byte[] bArr = a12.f11206b;
                    h hVar = new h(s02, atomicReference2, a12, 13);
                    v02.L();
                    G.g(url);
                    G.g(bArr);
                    C0640o0 c0640o04 = ((C0646q0) v02.f3094a).f11913u;
                    C0646q0.l(c0640o04);
                    c0640o04.V(new Z(v02, str, url, bArr, hashMap, hVar));
                    try {
                        M1 m12 = c0646q02.f11915w;
                        C0646q0.j(m12);
                        C0646q0 c0646q03 = (C0646q0) m12.f3094a;
                        c0646q03.f11917y.getClass();
                        long currentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long j = 60000; atomicReference2.get() == null && j > 0; j = currentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(j);
                                    c0646q03.f11917y.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                    break loop0;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        W w18 = ((C0646q0) s02.f3094a).f11912f;
                        C0646q0.l(w18);
                        w18.f11580w.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    x02 = atomicReference2.get() == null ? X0.UNKNOWN : (X0) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e2) {
                    W w19 = ((C0646q0) s02.f3094a).f11912f;
                    C0646q0.l(w19);
                    w19.f11577f.d("[sgtm] Bad upload url for row_id", a12.f11207c, Long.valueOf(a12.f11205a), e2);
                    x02 = X0.FAILURE;
                }
                if (x02 != X0.SUCCESS) {
                    if (x02 == X0.BACKOFF) {
                        z8 = true;
                        break;
                    }
                } else {
                    i10++;
                }
            }
        }
        W w20 = c0646q0.f11912f;
        C0646q0.l(w20);
        w20.f11573B.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i7), Integer.valueOf(i10));
        try {
            zzcxVar.zze();
        } catch (RemoteException e10) {
            C0646q0 c0646q04 = this.f15154a;
            G.g(c0646q04);
            W w21 = c0646q04.f11912f;
            C0646q0.l(w21);
            w21.f11580w.b(e10, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConditionalUserProperty(Bundle bundle, long j) {
        h();
        if (bundle == null) {
            W w10 = this.f15154a.f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Conditional user property must not be null");
        } else {
            S0 s02 = this.f15154a.f11890A;
            C0646q0.k(s02);
            s02.W(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsent(Bundle bundle, long j) {
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsentThirdParty(Bundle bundle, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.c0(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreen(a aVar, String str, String str2, long j) {
        h();
        Activity activity = (Activity) b.F(aVar);
        G.g(activity);
        setCurrentScreenByScionActivityInfo(zzdf.zza(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        if (r3 <= 500) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (r3 <= 500) goto L33;
     */
    @Override // com.google.android.gms.internal.measurement.zzcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) {
        h();
        C0605c1 c0605c1 = this.f15154a.f11918z;
        C0646q0.k(c0605c1);
        C0646q0 c0646q0 = (C0646q0) c0605c1.f3094a;
        if (!c0646q0.f11910d.X()) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11582y.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        Z0 z02 = c0605c1.f11686c;
        if (z02 == null) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11582y.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = c0605c1.f11689f;
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        if (concurrentHashMap.get(valueOf) == null) {
            W w12 = c0646q0.f11912f;
            C0646q0.l(w12);
            w12.f11582y.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = c0605c1.Q(zzdfVar.zzb);
        }
        String str3 = z02.f11612b;
        String str4 = z02.f11611a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            W w13 = c0646q0.f11912f;
            C0646q0.l(w13);
            w13.f11582y.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                c0646q0.f11910d.getClass();
            }
            W w14 = c0646q0.f11912f;
            C0646q0.l(w14);
            w14.f11582y.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                c0646q0.f11910d.getClass();
            }
            W w15 = c0646q0.f11912f;
            C0646q0.l(w15);
            w15.f11582y.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        W w16 = c0646q0.f11912f;
        C0646q0.l(w16);
        w16.f11573B.c("Setting current screen to name, class", str == null ? "null" : str, str2);
        M1 m12 = c0646q0.f11915w;
        C0646q0.j(m12);
        Z0 z03 = new Z0(m12.F0(), str, str2);
        concurrentHashMap.put(valueOf, z03);
        c0605c1.S(zzdfVar.zzb, z03, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDataCollectionEnabled(boolean z8) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.K();
        C0640o0 c0640o0 = ((C0646q0) s02.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new J(s02, z8));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDefaultEventParameters(Bundle bundle) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C0640o0 c0640o0 = ((C0646q0) s02.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new O0(s02, bundle2, 2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setEventInterceptor(zzda zzdaVar) {
        h();
        l lVar = new l(24, this, zzdaVar);
        C0640o0 c0640o0 = this.f15154a.f11913u;
        C0646q0.l(c0640o0);
        if (!c0640o0.P()) {
            C0640o0 c0640o02 = this.f15154a.f11913u;
            C0646q0.l(c0640o02);
            c0640o02.S(new k(18, this, lVar, false));
            return;
        }
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.J();
        s02.K();
        E0 e02 = s02.f11551d;
        if (lVar != e02) {
            G.i("EventInterceptor already set.", e02 == null);
        }
        s02.f11551d = lVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setInstanceIdProvider(zzdc zzdcVar) {
        h();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMeasurementEnabled(boolean z8, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        Boolean valueOf = Boolean.valueOf(z8);
        s02.K();
        C0640o0 c0640o0 = ((C0646q0) s02.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new k(s02, valueOf));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMinimumSessionDuration(long j) {
        h();
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSessionTimeoutDuration(long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        C0640o0 c0640o0 = ((C0646q0) s02.f3094a).f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new K0(s02, j, 0));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSgtmDebugInfo(Intent intent) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        Uri data = intent.getData();
        C0646q0 c0646q0 = (C0646q0) s02.f3094a;
        if (data == null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11583z.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11583z.a("[sgtm] Preview Mode was not enabled.");
            c0646q0.f11910d.f11754c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        W w12 = c0646q0.f11912f;
        C0646q0.l(w12);
        w12.f11583z.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        c0646q0.f11910d.f11754c = queryParameter2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserId(String str, long j) {
        h();
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        C0646q0 c0646q0 = (C0646q0) s02.f3094a;
        if (str != null && TextUtils.isEmpty(str)) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11580w.a("User ID must be non-empty or null");
        } else {
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            c0640o0.S(new k(20, s02, str));
            s02.T(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserProperty(String str, String str2, a aVar, boolean z8, long j) {
        h();
        Object F10 = b.F(aVar);
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.T(str, str2, F10, z8, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void unregisterOnMeasurementEventListener(zzda zzdaVar) {
        Object obj;
        h();
        C2052e c2052e = this.f15155b;
        synchronized (c2052e) {
            obj = (F0) c2052e.remove(Integer.valueOf(zzdaVar.zzf()));
        }
        if (obj == null) {
            obj = new N1(this, zzdaVar);
        }
        S0 s02 = this.f15154a.f11890A;
        C0646q0.k(s02);
        s02.K();
        if (s02.f11552e.remove(obj)) {
            return;
        }
        W w10 = ((C0646q0) s02.f3094a).f11912f;
        C0646q0.l(w10);
        w10.f11580w.a("OnEventListener had not been registered");
    }
}
