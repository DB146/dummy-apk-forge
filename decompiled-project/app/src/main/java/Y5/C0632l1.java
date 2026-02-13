package Y5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC0990f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Y5.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632l1 extends H {

    /* renamed from: c, reason: collision with root package name */
    public final ServiceConnectionC0629k1 f11814c;

    /* renamed from: d, reason: collision with root package name */
    public I f11815d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f11816e;

    /* renamed from: f, reason: collision with root package name */
    public final C0620h1 f11817f;

    /* renamed from: u, reason: collision with root package name */
    public ScheduledExecutorService f11818u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.f f11819v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f11820w;

    /* renamed from: x, reason: collision with root package name */
    public final C0620h1 f11821x;

    public C0632l1(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11820w = new ArrayList();
        this.f11819v = new A4.f(c0646q0.f11917y);
        this.f11814c = new ServiceConnectionC0629k1(this);
        this.f11817f = new C0620h1(this, c0646q0, 0);
        this.f11821x = new C0620h1(this, c0646q0, 1);
    }

    @Override // Y5.H
    public final boolean M() {
        return false;
    }

    public final void N(AtomicReference atomicReference) {
        J();
        K();
        X(new C7.c(this, atomicReference, Z(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(Bundle bundle) {
        boolean z8;
        boolean Q3;
        J();
        K();
        r rVar = new r(bundle);
        V();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (c0646q0.f11910d.T(null, F.f11312c1)) {
            P n6 = c0646q0.n();
            C0646q0 c0646q02 = (C0646q0) n6.f3094a;
            C0646q0.j(c0646q02.f11915w);
            byte[] n02 = M1.n0(rVar);
            W w10 = c0646q02.f11912f;
            if (n02 == null) {
                C0646q0.l(w10);
                w10.f11578u.a("Null default event parameters; not writing to database");
            } else if (n02.length > 131072) {
                C0646q0.l(w10);
                w10.f11578u.a("Default event parameters too long for local database. Sending directly to service");
            } else {
                Q3 = n6.Q(4, n02);
                if (Q3) {
                    z8 = true;
                    X(new L0(this, Z(false), z8, rVar, bundle));
                }
            }
            Q3 = false;
            if (Q3) {
            }
        }
        z8 = false;
        X(new L0(this, Z(false), z8, rVar, bundle));
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.common.internal.f, Y5.S] */
    public final void P() {
        J();
        K();
        if (a0()) {
            return;
        }
        if (Q()) {
            ServiceConnectionC0629k1 serviceConnectionC0629k1 = this.f11814c;
            C0632l1 c0632l1 = serviceConnectionC0629k1.f11809c;
            c0632l1.J();
            Context context = ((C0646q0) c0632l1.f3094a).f11907a;
            synchronized (serviceConnectionC0629k1) {
                try {
                    if (serviceConnectionC0629k1.f11807a) {
                        W w10 = ((C0646q0) serviceConnectionC0629k1.f11809c.f3094a).f11912f;
                        C0646q0.l(w10);
                        w10.f11573B.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (serviceConnectionC0629k1.f11808b != null && (serviceConnectionC0629k1.f11808b.isConnecting() || serviceConnectionC0629k1.f11808b.isConnected())) {
                            W w11 = ((C0646q0) serviceConnectionC0629k1.f11809c.f3094a).f11912f;
                            C0646q0.l(w11);
                            w11.f11573B.a("Already awaiting connection attempt");
                            return;
                        }
                        serviceConnectionC0629k1.f11808b = new AbstractC0990f(context, Looper.getMainLooper(), serviceConnectionC0629k1, serviceConnectionC0629k1, 93);
                        W w12 = ((C0646q0) serviceConnectionC0629k1.f11809c.f3094a).f11912f;
                        C0646q0.l(w12);
                        w12.f11573B.a("Connecting to remote service");
                        serviceConnectionC0629k1.f11807a = true;
                        com.google.android.gms.common.internal.G.g(serviceConnectionC0629k1.f11808b);
                        serviceConnectionC0629k1.f11808b.checkAvailabilityAndConnect();
                        return;
                    }
                } finally {
                }
            }
        }
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (c0646q0.f11910d.M()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = c0646q0.f11907a.getPackageManager().queryIntentServices(new Intent().setClassName(c0646q0.f11907a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            W w13 = c0646q0.f11912f;
            C0646q0.l(w13);
            w13.f11577f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(c0646q0.f11907a, "com.google.android.gms.measurement.AppMeasurementService"));
        ServiceConnectionC0629k1 serviceConnectionC0629k12 = this.f11814c;
        C0632l1 c0632l12 = serviceConnectionC0629k12.f11809c;
        c0632l12.J();
        Context context2 = ((C0646q0) c0632l12.f3094a).f11907a;
        L5.a b2 = L5.a.b();
        synchronized (serviceConnectionC0629k12) {
            try {
                if (serviceConnectionC0629k12.f11807a) {
                    W w14 = ((C0646q0) serviceConnectionC0629k12.f11809c.f3094a).f11912f;
                    C0646q0.l(w14);
                    w14.f11573B.a("Connection attempt already in progress");
                } else {
                    C0632l1 c0632l13 = serviceConnectionC0629k12.f11809c;
                    W w15 = ((C0646q0) c0632l13.f3094a).f11912f;
                    C0646q0.l(w15);
                    w15.f11573B.a("Using local app measurement service");
                    serviceConnectionC0629k12.f11807a = true;
                    b2.a(context2, intent, c0632l13.f11814c, 129);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q() {
        J();
        K();
        if (this.f11816e == null) {
            J();
            K();
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            C0613f0 c0613f0 = c0646q0.f11911e;
            C0646q0.j(c0613f0);
            c0613f0.J();
            boolean z8 = false;
            Boolean valueOf = !c0613f0.N().contains("use_service") ? null : Boolean.valueOf(c0613f0.N().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                N q10 = ((C0646q0) this.f3094a).q();
                q10.K();
                if (q10.f11462A != 1) {
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11573B.a("Checking service availability");
                    M1 m12 = c0646q0.f11915w;
                    C0646q0.j(m12);
                    int d10 = F5.f.f4100b.d(((C0646q0) m12.f3094a).f11907a, 12451000);
                    if (d10 != 0) {
                        if (d10 == 1) {
                            W w11 = c0646q0.f11912f;
                            C0646q0.l(w11);
                            w11.f11573B.a("Service missing");
                        } else if (d10 != 2) {
                            if (d10 == 3) {
                                W w12 = c0646q0.f11912f;
                                C0646q0.l(w12);
                                w12.f11580w.a("Service disabled");
                            } else if (d10 == 9) {
                                W w13 = c0646q0.f11912f;
                                C0646q0.l(w13);
                                w13.f11580w.a("Service invalid");
                            } else if (d10 != 18) {
                                W w14 = c0646q0.f11912f;
                                C0646q0.l(w14);
                                w14.f11580w.b(Integer.valueOf(d10), "Unexpected service status");
                            } else {
                                W w15 = c0646q0.f11912f;
                                C0646q0.l(w15);
                                w15.f11580w.a("Service updating");
                            }
                            r2 = false;
                        } else {
                            W w16 = c0646q0.f11912f;
                            C0646q0.l(w16);
                            w16.f11572A.a("Service container out of date");
                            M1 m13 = c0646q0.f11915w;
                            C0646q0.j(m13);
                            if (m13.p0() >= 17443) {
                                z8 = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z8 && c0646q0.f11910d.M()) {
                            W w17 = c0646q0.f11912f;
                            C0646q0.l(w17);
                            w17.f11577f.a("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            C0613f0 c0613f02 = c0646q0.f11911e;
                            C0646q0.j(c0613f02);
                            c0613f02.J();
                            SharedPreferences.Editor edit = c0613f02.N().edit();
                            edit.putBoolean("use_service", z8);
                            edit.apply();
                        }
                        r2 = z8;
                    } else {
                        W w18 = c0646q0.f11912f;
                        C0646q0.l(w18);
                        w18.f11573B.a("Service available");
                    }
                }
                z8 = true;
                if (z8) {
                }
                if (r2) {
                }
                r2 = z8;
            }
            this.f11816e = Boolean.valueOf(r2);
        }
        return this.f11816e.booleanValue();
    }

    public final void R() {
        J();
        K();
        ServiceConnectionC0629k1 serviceConnectionC0629k1 = this.f11814c;
        if (serviceConnectionC0629k1.f11808b != null && (serviceConnectionC0629k1.f11808b.isConnected() || serviceConnectionC0629k1.f11808b.isConnecting())) {
            serviceConnectionC0629k1.f11808b.disconnect();
        }
        serviceConnectionC0629k1.f11808b = null;
        try {
            L5.a.b().c(((C0646q0) this.f3094a).f11907a, serviceConnectionC0629k1);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f11815d = null;
    }

    public final boolean S() {
        J();
        K();
        if (!Q()) {
            return true;
        }
        M1 m12 = ((C0646q0) this.f3094a).f11915w;
        C0646q0.j(m12);
        return m12.p0() >= ((Integer) F.f11272J0.a(null)).intValue();
    }

    public final boolean T() {
        J();
        K();
        if (!Q()) {
            return true;
        }
        M1 m12 = ((C0646q0) this.f3094a).f11915w;
        C0646q0.j(m12);
        return m12.p0() >= 241200;
    }

    public final void U(ComponentName componentName) {
        J();
        if (this.f11815d != null) {
            this.f11815d = null;
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11573B.b(componentName, "Disconnected from device MeasurementService");
            J();
            P();
        }
    }

    public final void V() {
        ((C0646q0) this.f3094a).getClass();
    }

    public final void W() {
        J();
        A4.f fVar = this.f11819v;
        ((M5.b) fVar.f383c).getClass();
        fVar.f382b = SystemClock.elapsedRealtime();
        ((C0646q0) this.f3094a).getClass();
        this.f11817f.b(((Long) F.f11300Y.a(null)).longValue());
    }

    public final void X(Runnable runnable) {
        J();
        if (a0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f11820w;
        long size = arrayList.size();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        c0646q0.getClass();
        if (size >= 1000) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f11821x.b(60000L);
            P();
        }
    }

    public final void Y() {
        J();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        ArrayList arrayList = this.f11820w;
        w10.f11573B.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e2) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11577f.b(e2, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f11821x.c();
    }

    public final O1 Z(boolean z8) {
        long abs;
        Pair pair;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        c0646q0.getClass();
        N q10 = c0646q0.q();
        String str = null;
        if (z8) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            C0646q0 c0646q02 = (C0646q0) w10.f3094a;
            C0613f0 c0613f0 = c0646q02.f11911e;
            C0646q0.j(c0613f0);
            if (c0613f0.f11743e != null) {
                C0613f0 c0613f02 = c0646q02.f11911e;
                C0646q0.j(c0613f02);
                E3.d dVar = c0613f02.f11743e;
                C0613f0 c0613f03 = (C0613f0) dVar.f3528e;
                c0613f03.J();
                c0613f03.J();
                long j = ((C0613f0) dVar.f3528e).N().getLong((String) dVar.f3525b, 0L);
                if (j == 0) {
                    dVar.g();
                    abs = 0;
                } else {
                    ((C0646q0) c0613f03.f3094a).f11917y.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j10 = dVar.f3524a;
                if (abs >= j10) {
                    if (abs > j10 + j10) {
                        dVar.g();
                    } else {
                        String string = c0613f03.N().getString((String) dVar.f3527d, null);
                        long j11 = c0613f03.N().getLong((String) dVar.f3526c, 0L);
                        dVar.g();
                        pair = (string == null || j11 <= 0) ? C0613f0.f11728N : new Pair(string, Long.valueOf(j11));
                        if (pair != null && pair != C0613f0.f11728N) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = A3.c.m(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = A3.c.m(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, ":", str22);
                }
            }
        }
        return q10.N(str);
    }

    public final boolean a0() {
        J();
        K();
        return this.f11815d != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x049d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x049d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x049d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0436 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x02c8 A[Catch: all -> 0x01b0, SQLiteException -> 0x02ac, SQLiteFullException -> 0x02af, SQLiteDatabaseLockedException -> 0x039c, TryCatch #10 {all -> 0x01b0, blocks: (B:155:0x0436, B:157:0x043c, B:149:0x043f, B:124:0x0466, B:138:0x0488, B:197:0x017c, B:202:0x0187, B:205:0x018c, B:208:0x0193, B:211:0x019c, B:213:0x01a2, B:218:0x01cf, B:226:0x01e5, B:228:0x01ea, B:245:0x0210, B:246:0x0213, B:243:0x020c, B:262:0x021f, B:265:0x0233, B:267:0x0249, B:270:0x0252, B:271:0x0255, B:273:0x0243, B:276:0x0259, B:279:0x026d, B:281:0x0283, B:284:0x028d, B:285:0x0290, B:287:0x027d, B:290:0x0294, B:298:0x02a8, B:300:0x02c8, B:307:0x02d2, B:308:0x02d5, B:313:0x02c2, B:320:0x02da, B:322:0x02e5, B:356:0x0349, B:358:0x0369, B:359:0x0373), top: B:154:0x0436 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(I i7, G5.a aVar, O1 o12) {
        ArrayList arrayList;
        C0646q0 c0646q0;
        O1 o13;
        int i10;
        ArrayList arrayList2;
        int i11;
        SQLiteDatabase sQLiteDatabase;
        ArrayList arrayList3;
        String str;
        String str2;
        String str3;
        int i12;
        int i13;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        String str4;
        String[] strArr;
        String[] strArr2;
        C0615g c0615g;
        E e2;
        int i14;
        W w10;
        int i15;
        long j10;
        String str5;
        E e10;
        Parcel obtain;
        r rVar;
        C0609e c0609e;
        K1 k12;
        ArrayList arrayList4;
        G5.a aVar2;
        int i16;
        O1 o14;
        int size;
        int i17;
        O1 o15;
        boolean z8;
        String str6;
        long j11;
        long j12;
        long j13;
        J();
        K();
        V();
        C0646q0 c0646q02 = (C0646q0) this.f3094a;
        c0646q02.getClass();
        int i18 = 100;
        O1 o16 = o12;
        int i19 = 100;
        int i20 = 0;
        loop0: while (i20 < 1001 && i19 == i18) {
            ArrayList arrayList5 = new ArrayList();
            P n6 = c0646q02.n();
            String str7 = "entry";
            String str8 = "type";
            String str9 = "rowid";
            n6.J();
            if (n6.f11520d) {
                c0646q0 = c0646q02;
                o13 = o16;
                i10 = i20;
            } else {
                arrayList = new ArrayList();
                C0646q0 c0646q03 = (C0646q0) n6.f3094a;
                if (c0646q03.f11907a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i21 = 5;
                    i10 = i20;
                    int i22 = 0;
                    int i23 = 5;
                    while (i22 < i21) {
                        try {
                            sQLiteDatabase = n6.P();
                            if (sQLiteDatabase == null) {
                                try {
                                    try {
                                        n6.f11520d = true;
                                        c0646q0 = c0646q02;
                                        o13 = o16;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    c0646q0 = c0646q02;
                                    o13 = o16;
                                    arrayList3 = arrayList5;
                                    str = str7;
                                    str2 = str8;
                                    str3 = str9;
                                    i12 = 5;
                                    i13 = i22;
                                    cursor = null;
                                    SystemClock.sleep(i23);
                                    i23 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i22 = i13 + 1;
                                    i21 = i12;
                                    str7 = str;
                                    str8 = str2;
                                    str9 = str3;
                                    arrayList5 = arrayList3;
                                    c0646q02 = c0646q0;
                                    o16 = o13;
                                } catch (SQLiteFullException e11) {
                                    e = e11;
                                    c0646q0 = c0646q02;
                                    o13 = o16;
                                    arrayList3 = arrayList5;
                                    str = str7;
                                    str2 = str8;
                                    str3 = str9;
                                    i12 = 5;
                                    i13 = i22;
                                    cursor = null;
                                    W w11 = c0646q03.f11912f;
                                    C0646q0.l(w11);
                                    w11.f11577f.b(e, "Error reading entries from local database");
                                    n6.f11520d = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i22 = i13 + 1;
                                    i21 = i12;
                                    str7 = str;
                                    str8 = str2;
                                    str9 = str3;
                                    arrayList5 = arrayList3;
                                    c0646q02 = c0646q0;
                                    o16 = o13;
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    c0646q0 = c0646q02;
                                    o13 = o16;
                                    arrayList3 = arrayList5;
                                    str = str7;
                                    str2 = str8;
                                    str3 = str9;
                                    i12 = 5;
                                    i13 = i22;
                                    cursor = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    W w12 = c0646q03.f11912f;
                                    C0646q0.l(w12);
                                    w12.f11577f.b(e, "Error reading entries from local database");
                                    n6.f11520d = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i22 = i13 + 1;
                                    i21 = i12;
                                    str7 = str;
                                    str8 = str2;
                                    str9 = str3;
                                    arrayList5 = arrayList3;
                                    c0646q02 = c0646q0;
                                    o16 = o13;
                                }
                            } else {
                                sQLiteDatabase.beginTransaction();
                                try {
                                    cursor3 = sQLiteDatabase.query("messages", new String[]{str9}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j14 = -1;
                                        if (cursor3.moveToFirst()) {
                                            c0646q0 = c0646q02;
                                            try {
                                                j = cursor3.getLong(0);
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    o13 = o16;
                                                    arrayList3 = arrayList5;
                                                    str = str7;
                                                    str2 = str8;
                                                    str3 = str9;
                                                    i12 = 5;
                                                    i13 = i22;
                                                    cursor = null;
                                                    SystemClock.sleep(i23);
                                                    i23 += 20;
                                                    if (cursor != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i22 = i13 + 1;
                                                    i21 = i12;
                                                    str7 = str;
                                                    str8 = str2;
                                                    str9 = str3;
                                                    arrayList5 = arrayList3;
                                                    c0646q02 = c0646q0;
                                                    o16 = o13;
                                                } catch (SQLiteFullException e13) {
                                                    e = e13;
                                                    o13 = o16;
                                                    arrayList3 = arrayList5;
                                                    str = str7;
                                                    str2 = str8;
                                                    str3 = str9;
                                                    i12 = 5;
                                                    i13 = i22;
                                                    cursor = null;
                                                    W w112 = c0646q03.f11912f;
                                                    C0646q0.l(w112);
                                                    w112.f11577f.b(e, "Error reading entries from local database");
                                                    n6.f11520d = true;
                                                    if (cursor != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i22 = i13 + 1;
                                                    i21 = i12;
                                                    str7 = str;
                                                    str8 = str2;
                                                    str9 = str3;
                                                    arrayList5 = arrayList3;
                                                    c0646q02 = c0646q0;
                                                    o16 = o13;
                                                } catch (SQLiteException e14) {
                                                    e = e14;
                                                    o13 = o16;
                                                    arrayList3 = arrayList5;
                                                    str = str7;
                                                    str2 = str8;
                                                    str3 = str9;
                                                    i12 = 5;
                                                    i13 = i22;
                                                    cursor = null;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    W w122 = c0646q03.f11912f;
                                                    C0646q0.l(w122);
                                                    w122.f11577f.b(e, "Error reading entries from local database");
                                                    n6.f11520d = true;
                                                    if (cursor != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i22 = i13 + 1;
                                                    i21 = i12;
                                                    str7 = str;
                                                    str8 = str2;
                                                    str9 = str3;
                                                    arrayList5 = arrayList3;
                                                    c0646q02 = c0646q0;
                                                    o16 = o13;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                o13 = o16;
                                                arrayList3 = arrayList5;
                                                str = str7;
                                                str2 = str8;
                                                str3 = str9;
                                                i12 = 5;
                                                i13 = i22;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        cursor = null;
                                                        SystemClock.sleep(i23);
                                                        i23 += 20;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i22 = i13 + 1;
                                                        i21 = i12;
                                                        str7 = str;
                                                        str8 = str2;
                                                        str9 = str3;
                                                        arrayList5 = arrayList3;
                                                        c0646q02 = c0646q0;
                                                        o16 = o13;
                                                    } catch (SQLiteFullException e15) {
                                                        e = e15;
                                                        cursor = null;
                                                        W w1122 = c0646q03.f11912f;
                                                        C0646q0.l(w1122);
                                                        w1122.f11577f.b(e, "Error reading entries from local database");
                                                        n6.f11520d = true;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                            i22 = i13 + 1;
                                                            i21 = i12;
                                                            str7 = str;
                                                            str8 = str2;
                                                            str9 = str3;
                                                            arrayList5 = arrayList3;
                                                            c0646q02 = c0646q0;
                                                            o16 = o13;
                                                        }
                                                        sQLiteDatabase.close();
                                                        i22 = i13 + 1;
                                                        i21 = i12;
                                                        str7 = str;
                                                        str8 = str2;
                                                        str9 = str3;
                                                        arrayList5 = arrayList3;
                                                        c0646q02 = c0646q0;
                                                        o16 = o13;
                                                    } catch (SQLiteException e16) {
                                                        e = e16;
                                                        cursor = null;
                                                        if (sQLiteDatabase != null) {
                                                            try {
                                                                if (sQLiteDatabase.inTransaction()) {
                                                                    sQLiteDatabase.endTransaction();
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                cursor2 = cursor;
                                                            }
                                                        }
                                                        W w1222 = c0646q03.f11912f;
                                                        C0646q0.l(w1222);
                                                        w1222.f11577f.b(e, "Error reading entries from local database");
                                                        n6.f11520d = true;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                            i22 = i13 + 1;
                                                            i21 = i12;
                                                            str7 = str;
                                                            str8 = str2;
                                                            str9 = str3;
                                                            arrayList5 = arrayList3;
                                                            c0646q02 = c0646q0;
                                                            o16 = o13;
                                                        }
                                                        sQLiteDatabase.close();
                                                        i22 = i13 + 1;
                                                        i21 = i12;
                                                        str7 = str;
                                                        str8 = str2;
                                                        str9 = str3;
                                                        arrayList5 = arrayList3;
                                                        c0646q02 = c0646q0;
                                                        o16 = o13;
                                                    }
                                                }
                                                throw th;
                                                break loop0;
                                            }
                                        } else {
                                            c0646q0 = c0646q02;
                                            cursor3.close();
                                            j = -1;
                                        }
                                        if (j != -1) {
                                            str4 = "rowid<?";
                                            strArr = new String[]{String.valueOf(j)};
                                        } else {
                                            str4 = null;
                                            strArr = null;
                                        }
                                        try {
                                            try {
                                                strArr2 = new String[]{str9, str8, str7};
                                                try {
                                                    c0615g = c0646q03.f11910d;
                                                    e2 = F.f11312c1;
                                                    o13 = o16;
                                                } catch (SQLiteFullException e17) {
                                                    e = e17;
                                                    o13 = o16;
                                                } catch (SQLiteException e18) {
                                                    e = e18;
                                                    o13 = o16;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                o13 = o16;
                                            }
                                        } catch (SQLiteFullException e19) {
                                            e = e19;
                                            o13 = o16;
                                        } catch (SQLiteException e20) {
                                            e = e20;
                                            o13 = o16;
                                        }
                                        try {
                                            try {
                                                if (c0615g.T(null, e2)) {
                                                    i14 = 5;
                                                    try {
                                                        strArr2 = new String[]{str9, str8, str7, "app_version", "app_version_int"};
                                                    } catch (SQLiteDatabaseLockedException unused5) {
                                                        i12 = 5;
                                                        arrayList3 = arrayList5;
                                                        str = str7;
                                                        str2 = str8;
                                                        str3 = str9;
                                                        i13 = i22;
                                                        cursor = null;
                                                        SystemClock.sleep(i23);
                                                        i23 += 20;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i22 = i13 + 1;
                                                        i21 = i12;
                                                        str7 = str;
                                                        str8 = str2;
                                                        str9 = str3;
                                                        arrayList5 = arrayList3;
                                                        c0646q02 = c0646q0;
                                                        o16 = o13;
                                                    } catch (SQLiteFullException e21) {
                                                        e = e21;
                                                        i12 = 5;
                                                        arrayList3 = arrayList5;
                                                        str = str7;
                                                        str2 = str8;
                                                        str3 = str9;
                                                        i13 = i22;
                                                        cursor = null;
                                                        W w11222 = c0646q03.f11912f;
                                                        C0646q0.l(w11222);
                                                        w11222.f11577f.b(e, "Error reading entries from local database");
                                                        n6.f11520d = true;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i22 = i13 + 1;
                                                        i21 = i12;
                                                        str7 = str;
                                                        str8 = str2;
                                                        str9 = str3;
                                                        arrayList5 = arrayList3;
                                                        c0646q02 = c0646q0;
                                                        o16 = o13;
                                                    } catch (SQLiteException e22) {
                                                        e = e22;
                                                        i12 = 5;
                                                        arrayList3 = arrayList5;
                                                        str = str7;
                                                        str2 = str8;
                                                        str3 = str9;
                                                        i13 = i22;
                                                        cursor = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        W w12222 = c0646q03.f11912f;
                                                        C0646q0.l(w12222);
                                                        w12222.f11577f.b(e, "Error reading entries from local database");
                                                        n6.f11520d = true;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i22 = i13 + 1;
                                                        i21 = i12;
                                                        str7 = str;
                                                        str8 = str2;
                                                        str9 = str3;
                                                        arrayList5 = arrayList3;
                                                        c0646q02 = c0646q0;
                                                        o16 = o13;
                                                    }
                                                } else {
                                                    i14 = 5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused6) {
                                                arrayList3 = arrayList5;
                                                str = str7;
                                                str2 = str8;
                                                str3 = str9;
                                                i13 = i22;
                                                i12 = 5;
                                                cursor = null;
                                                SystemClock.sleep(i23);
                                                i23 += 20;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase == null) {
                                                    i22 = i13 + 1;
                                                    i21 = i12;
                                                    str7 = str;
                                                    str8 = str2;
                                                    str9 = str3;
                                                    arrayList5 = arrayList3;
                                                    c0646q02 = c0646q0;
                                                    o16 = o13;
                                                }
                                                sQLiteDatabase.close();
                                                i22 = i13 + 1;
                                                i21 = i12;
                                                str7 = str;
                                                str8 = str2;
                                                str9 = str3;
                                                arrayList5 = arrayList3;
                                                c0646q02 = c0646q0;
                                                o16 = o13;
                                            }
                                            try {
                                                cursor = sQLiteDatabase.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(100));
                                                while (true) {
                                                    try {
                                                        boolean moveToNext = cursor.moveToNext();
                                                        w10 = c0646q03.f11912f;
                                                        if (!moveToNext) {
                                                            break;
                                                        }
                                                        str = str7;
                                                        try {
                                                            j14 = cursor.getLong(0);
                                                            try {
                                                                i15 = cursor.getInt(1);
                                                                str2 = str8;
                                                            } catch (SQLiteDatabaseLockedException unused7) {
                                                                i13 = i22;
                                                                arrayList3 = arrayList5;
                                                                str2 = str8;
                                                            } catch (SQLiteFullException e23) {
                                                                e = e23;
                                                                i13 = i22;
                                                                arrayList3 = arrayList5;
                                                                str2 = str8;
                                                            } catch (SQLiteException e24) {
                                                                e = e24;
                                                                i13 = i22;
                                                                arrayList3 = arrayList5;
                                                                str2 = str8;
                                                            }
                                                            try {
                                                                byte[] blob = cursor.getBlob(2);
                                                                str3 = str9;
                                                                try {
                                                                    if (c0646q03.f11910d.T(null, e2)) {
                                                                        str5 = cursor.getString(3);
                                                                        i13 = i22;
                                                                        j10 = cursor.getLong(4);
                                                                    } else {
                                                                        i13 = i22;
                                                                        j10 = 0;
                                                                        str5 = null;
                                                                    }
                                                                    if (i15 == 0) {
                                                                        e10 = e2;
                                                                        try {
                                                                            obtain = Parcel.obtain();
                                                                            try {
                                                                                arrayList3 = arrayList5;
                                                                                try {
                                                                                    try {
                                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                                        obtain.setDataPosition(0);
                                                                                        C0648s createFromParcel = C0648s.CREATOR.createFromParcel(obtain);
                                                                                        try {
                                                                                            if (createFromParcel != null) {
                                                                                                arrayList.add(new O(createFromParcel, str5, j10));
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused8) {
                                                                                            i12 = 5;
                                                                                            SystemClock.sleep(i23);
                                                                                            i23 += 20;
                                                                                            if (cursor != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i22 = i13 + 1;
                                                                                            i21 = i12;
                                                                                            str7 = str;
                                                                                            str8 = str2;
                                                                                            str9 = str3;
                                                                                            arrayList5 = arrayList3;
                                                                                            c0646q02 = c0646q0;
                                                                                            o16 = o13;
                                                                                        } catch (SQLiteFullException e25) {
                                                                                            e = e25;
                                                                                            i12 = 5;
                                                                                            W w112222 = c0646q03.f11912f;
                                                                                            C0646q0.l(w112222);
                                                                                            w112222.f11577f.b(e, "Error reading entries from local database");
                                                                                            n6.f11520d = true;
                                                                                            if (cursor != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i22 = i13 + 1;
                                                                                            i21 = i12;
                                                                                            str7 = str;
                                                                                            str8 = str2;
                                                                                            str9 = str3;
                                                                                            arrayList5 = arrayList3;
                                                                                            c0646q02 = c0646q0;
                                                                                            o16 = o13;
                                                                                        } catch (SQLiteException e26) {
                                                                                            e = e26;
                                                                                            i12 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            W w122222 = c0646q03.f11912f;
                                                                                            C0646q0.l(w122222);
                                                                                            w122222.f11577f.b(e, "Error reading entries from local database");
                                                                                            n6.f11520d = true;
                                                                                            if (cursor != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i22 = i13 + 1;
                                                                                            i21 = i12;
                                                                                            str7 = str;
                                                                                            str8 = str2;
                                                                                            str9 = str3;
                                                                                            arrayList5 = arrayList3;
                                                                                            c0646q02 = c0646q0;
                                                                                            o16 = o13;
                                                                                        }
                                                                                    } catch (G5.b unused9) {
                                                                                        C0646q0.l(w10);
                                                                                        w10.f11577f.a("Failed to load event from local database");
                                                                                        obtain.recycle();
                                                                                        i22 = i13;
                                                                                        str7 = str;
                                                                                        str8 = str2;
                                                                                        str9 = str3;
                                                                                        e2 = e10;
                                                                                        arrayList5 = arrayList3;
                                                                                    }
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    throw th;
                                                                                }
                                                                            } catch (G5.b unused10) {
                                                                                arrayList3 = arrayList5;
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused11) {
                                                                            arrayList3 = arrayList5;
                                                                            i12 = 5;
                                                                            SystemClock.sleep(i23);
                                                                            i23 += 20;
                                                                            if (cursor != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i22 = i13 + 1;
                                                                            i21 = i12;
                                                                            str7 = str;
                                                                            str8 = str2;
                                                                            str9 = str3;
                                                                            arrayList5 = arrayList3;
                                                                            c0646q02 = c0646q0;
                                                                            o16 = o13;
                                                                        } catch (SQLiteFullException e27) {
                                                                            e = e27;
                                                                            arrayList3 = arrayList5;
                                                                            i12 = 5;
                                                                            W w1122222 = c0646q03.f11912f;
                                                                            C0646q0.l(w1122222);
                                                                            w1122222.f11577f.b(e, "Error reading entries from local database");
                                                                            n6.f11520d = true;
                                                                            if (cursor != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i22 = i13 + 1;
                                                                            i21 = i12;
                                                                            str7 = str;
                                                                            str8 = str2;
                                                                            str9 = str3;
                                                                            arrayList5 = arrayList3;
                                                                            c0646q02 = c0646q0;
                                                                            o16 = o13;
                                                                        } catch (SQLiteException e28) {
                                                                            e = e28;
                                                                            arrayList3 = arrayList5;
                                                                            i12 = 5;
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            W w1222222 = c0646q03.f11912f;
                                                                            C0646q0.l(w1222222);
                                                                            w1222222.f11577f.b(e, "Error reading entries from local database");
                                                                            n6.f11520d = true;
                                                                            if (cursor != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i22 = i13 + 1;
                                                                            i21 = i12;
                                                                            str7 = str;
                                                                            str8 = str2;
                                                                            str9 = str3;
                                                                            arrayList5 = arrayList3;
                                                                            c0646q02 = c0646q0;
                                                                            o16 = o13;
                                                                        }
                                                                    } else {
                                                                        e10 = e2;
                                                                        arrayList3 = arrayList5;
                                                                        if (i15 == 1) {
                                                                            obtain = Parcel.obtain();
                                                                            try {
                                                                                try {
                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                    obtain.setDataPosition(0);
                                                                                    k12 = K1.CREATOR.createFromParcel(obtain);
                                                                                } finally {
                                                                                }
                                                                            } catch (G5.b unused12) {
                                                                                C0646q0.l(w10);
                                                                                w10.f11577f.a("Failed to load user property from local database");
                                                                                obtain.recycle();
                                                                                k12 = null;
                                                                            }
                                                                            if (k12 != null) {
                                                                                arrayList.add(new O(k12, str5, j10));
                                                                            }
                                                                        } else if (i15 == 2) {
                                                                            obtain = Parcel.obtain();
                                                                            try {
                                                                                try {
                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                    obtain.setDataPosition(0);
                                                                                    c0609e = C0609e.CREATOR.createFromParcel(obtain);
                                                                                } finally {
                                                                                }
                                                                            } catch (G5.b unused13) {
                                                                                C0646q0.l(w10);
                                                                                w10.f11577f.a("Failed to load conditional user property from local database");
                                                                                obtain.recycle();
                                                                                c0609e = null;
                                                                            }
                                                                            if (c0609e != null) {
                                                                                arrayList.add(new O(c0609e, str5, j10));
                                                                            }
                                                                        } else {
                                                                            if (i15 == 4) {
                                                                                obtain = Parcel.obtain();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            obtain.unmarshall(blob, 0, blob.length);
                                                                                            obtain.setDataPosition(0);
                                                                                            rVar = r.CREATOR.createFromParcel(obtain);
                                                                                        } catch (Throwable th6) {
                                                                                            th = th6;
                                                                                            throw th;
                                                                                            break loop0;
                                                                                        }
                                                                                    } catch (G5.b unused14) {
                                                                                        C0646q0.l(w10);
                                                                                        w10.f11577f.a("Failed to load default event parameters from local database");
                                                                                        obtain.recycle();
                                                                                        rVar = null;
                                                                                        if (rVar != null) {
                                                                                        }
                                                                                        i22 = i13;
                                                                                        str7 = str;
                                                                                        str8 = str2;
                                                                                        str9 = str3;
                                                                                        e2 = e10;
                                                                                        arrayList5 = arrayList3;
                                                                                    }
                                                                                } catch (G5.b unused15) {
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                }
                                                                                try {
                                                                                    if (rVar != null) {
                                                                                        arrayList.add(new O(rVar, str5, j10));
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused16) {
                                                                                    i12 = 5;
                                                                                    SystemClock.sleep(i23);
                                                                                    i23 += 20;
                                                                                    if (cursor != null) {
                                                                                    }
                                                                                    if (sQLiteDatabase == null) {
                                                                                    }
                                                                                    sQLiteDatabase.close();
                                                                                    i22 = i13 + 1;
                                                                                    i21 = i12;
                                                                                    str7 = str;
                                                                                    str8 = str2;
                                                                                    str9 = str3;
                                                                                    arrayList5 = arrayList3;
                                                                                    c0646q02 = c0646q0;
                                                                                    o16 = o13;
                                                                                } catch (SQLiteFullException e29) {
                                                                                    e = e29;
                                                                                    i12 = 5;
                                                                                    W w11222222 = c0646q03.f11912f;
                                                                                    C0646q0.l(w11222222);
                                                                                    w11222222.f11577f.b(e, "Error reading entries from local database");
                                                                                    n6.f11520d = true;
                                                                                    if (cursor != null) {
                                                                                    }
                                                                                    if (sQLiteDatabase == null) {
                                                                                    }
                                                                                    sQLiteDatabase.close();
                                                                                    i22 = i13 + 1;
                                                                                    i21 = i12;
                                                                                    str7 = str;
                                                                                    str8 = str2;
                                                                                    str9 = str3;
                                                                                    arrayList5 = arrayList3;
                                                                                    c0646q02 = c0646q0;
                                                                                    o16 = o13;
                                                                                } catch (SQLiteException e30) {
                                                                                    e = e30;
                                                                                    i12 = 5;
                                                                                    if (sQLiteDatabase != null) {
                                                                                    }
                                                                                    W w12222222 = c0646q03.f11912f;
                                                                                    C0646q0.l(w12222222);
                                                                                    w12222222.f11577f.b(e, "Error reading entries from local database");
                                                                                    n6.f11520d = true;
                                                                                    if (cursor != null) {
                                                                                    }
                                                                                    if (sQLiteDatabase == null) {
                                                                                    }
                                                                                    sQLiteDatabase.close();
                                                                                    i22 = i13 + 1;
                                                                                    i21 = i12;
                                                                                    str7 = str;
                                                                                    str8 = str2;
                                                                                    str9 = str3;
                                                                                    arrayList5 = arrayList3;
                                                                                    c0646q02 = c0646q0;
                                                                                    o16 = o13;
                                                                                }
                                                                            } else if (i15 == 3) {
                                                                                C0646q0.l(w10);
                                                                                w10.f11573B.a("Skipping app launch break");
                                                                            } else {
                                                                                C0646q0.l(w10);
                                                                                w10.f11577f.a("Unknown record type in local database");
                                                                            }
                                                                            i22 = i13;
                                                                            str7 = str;
                                                                            str8 = str2;
                                                                            str9 = str3;
                                                                            e2 = e10;
                                                                            arrayList5 = arrayList3;
                                                                        }
                                                                    }
                                                                    i22 = i13;
                                                                    str7 = str;
                                                                    str8 = str2;
                                                                    str9 = str3;
                                                                    e2 = e10;
                                                                    arrayList5 = arrayList3;
                                                                } catch (SQLiteDatabaseLockedException unused17) {
                                                                    i13 = i22;
                                                                } catch (SQLiteFullException e31) {
                                                                    e = e31;
                                                                    i13 = i22;
                                                                } catch (SQLiteException e32) {
                                                                    e = e32;
                                                                    i13 = i22;
                                                                }
                                                            } catch (SQLiteDatabaseLockedException unused18) {
                                                                i13 = i22;
                                                                arrayList3 = arrayList5;
                                                                str3 = str9;
                                                                i12 = 5;
                                                                SystemClock.sleep(i23);
                                                                i23 += 20;
                                                                if (cursor != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i22 = i13 + 1;
                                                                i21 = i12;
                                                                str7 = str;
                                                                str8 = str2;
                                                                str9 = str3;
                                                                arrayList5 = arrayList3;
                                                                c0646q02 = c0646q0;
                                                                o16 = o13;
                                                            } catch (SQLiteFullException e33) {
                                                                e = e33;
                                                                i13 = i22;
                                                                arrayList3 = arrayList5;
                                                                str3 = str9;
                                                                i12 = 5;
                                                                W w112222222 = c0646q03.f11912f;
                                                                C0646q0.l(w112222222);
                                                                w112222222.f11577f.b(e, "Error reading entries from local database");
                                                                n6.f11520d = true;
                                                                if (cursor != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i22 = i13 + 1;
                                                                i21 = i12;
                                                                str7 = str;
                                                                str8 = str2;
                                                                str9 = str3;
                                                                arrayList5 = arrayList3;
                                                                c0646q02 = c0646q0;
                                                                o16 = o13;
                                                            } catch (SQLiteException e34) {
                                                                e = e34;
                                                                i13 = i22;
                                                                arrayList3 = arrayList5;
                                                                str3 = str9;
                                                                i12 = 5;
                                                                if (sQLiteDatabase != null) {
                                                                }
                                                                W w122222222 = c0646q03.f11912f;
                                                                C0646q0.l(w122222222);
                                                                w122222222.f11577f.b(e, "Error reading entries from local database");
                                                                n6.f11520d = true;
                                                                if (cursor != null) {
                                                                }
                                                                if (sQLiteDatabase == null) {
                                                                }
                                                                sQLiteDatabase.close();
                                                                i22 = i13 + 1;
                                                                i21 = i12;
                                                                str7 = str;
                                                                str8 = str2;
                                                                str9 = str3;
                                                                arrayList5 = arrayList3;
                                                                c0646q02 = c0646q0;
                                                                o16 = o13;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused19) {
                                                            arrayList3 = arrayList5;
                                                            str2 = str8;
                                                            str3 = str9;
                                                            i13 = i22;
                                                            i12 = 5;
                                                            SystemClock.sleep(i23);
                                                            i23 += 20;
                                                            if (cursor != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i22 = i13 + 1;
                                                            i21 = i12;
                                                            str7 = str;
                                                            str8 = str2;
                                                            str9 = str3;
                                                            arrayList5 = arrayList3;
                                                            c0646q02 = c0646q0;
                                                            o16 = o13;
                                                        } catch (SQLiteFullException e35) {
                                                            e = e35;
                                                            arrayList3 = arrayList5;
                                                            str2 = str8;
                                                            str3 = str9;
                                                            i13 = i22;
                                                            i12 = 5;
                                                            W w1122222222 = c0646q03.f11912f;
                                                            C0646q0.l(w1122222222);
                                                            w1122222222.f11577f.b(e, "Error reading entries from local database");
                                                            n6.f11520d = true;
                                                            if (cursor != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i22 = i13 + 1;
                                                            i21 = i12;
                                                            str7 = str;
                                                            str8 = str2;
                                                            str9 = str3;
                                                            arrayList5 = arrayList3;
                                                            c0646q02 = c0646q0;
                                                            o16 = o13;
                                                        } catch (SQLiteException e36) {
                                                            e = e36;
                                                            arrayList3 = arrayList5;
                                                            str2 = str8;
                                                            str3 = str9;
                                                            i13 = i22;
                                                            i12 = 5;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            W w1222222222 = c0646q03.f11912f;
                                                            C0646q0.l(w1222222222);
                                                            w1222222222.f11577f.b(e, "Error reading entries from local database");
                                                            n6.f11520d = true;
                                                            if (cursor != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i22 = i13 + 1;
                                                            i21 = i12;
                                                            str7 = str;
                                                            str8 = str2;
                                                            str9 = str3;
                                                            arrayList5 = arrayList3;
                                                            c0646q02 = c0646q0;
                                                            o16 = o13;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused20) {
                                                        arrayList3 = arrayList5;
                                                        str = str7;
                                                        str2 = str8;
                                                        str3 = str9;
                                                    } catch (SQLiteFullException e37) {
                                                        e = e37;
                                                        arrayList3 = arrayList5;
                                                        str = str7;
                                                        str2 = str8;
                                                        str3 = str9;
                                                    } catch (SQLiteException e38) {
                                                        e = e38;
                                                        arrayList3 = arrayList5;
                                                        str = str7;
                                                        str2 = str8;
                                                        str3 = str9;
                                                    }
                                                }
                                                arrayList2 = arrayList5;
                                                i11 = 0;
                                                if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j14)}) < arrayList.size()) {
                                                    C0646q0.l(w10);
                                                    w10.f11577f.a("Fewer entries removed from local database than expected");
                                                }
                                                sQLiteDatabase.setTransactionSuccessful();
                                                sQLiteDatabase.endTransaction();
                                                cursor.close();
                                                sQLiteDatabase.close();
                                            } catch (SQLiteDatabaseLockedException unused21) {
                                                arrayList3 = arrayList5;
                                                str = str7;
                                                str2 = str8;
                                                str3 = str9;
                                                i13 = i22;
                                                i12 = i14;
                                                cursor = null;
                                                SystemClock.sleep(i23);
                                                i23 += 20;
                                                if (cursor != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i22 = i13 + 1;
                                                i21 = i12;
                                                str7 = str;
                                                str8 = str2;
                                                str9 = str3;
                                                arrayList5 = arrayList3;
                                                c0646q02 = c0646q0;
                                                o16 = o13;
                                            }
                                        } catch (SQLiteFullException e39) {
                                            e = e39;
                                            arrayList3 = arrayList5;
                                            str = str7;
                                            str2 = str8;
                                            str3 = str9;
                                            i13 = i22;
                                            i12 = 5;
                                            cursor = null;
                                            W w11222222222 = c0646q03.f11912f;
                                            C0646q0.l(w11222222222);
                                            w11222222222.f11577f.b(e, "Error reading entries from local database");
                                            n6.f11520d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i22 = i13 + 1;
                                            i21 = i12;
                                            str7 = str;
                                            str8 = str2;
                                            str9 = str3;
                                            arrayList5 = arrayList3;
                                            c0646q02 = c0646q0;
                                            o16 = o13;
                                        } catch (SQLiteException e40) {
                                            e = e40;
                                            arrayList3 = arrayList5;
                                            str = str7;
                                            str2 = str8;
                                            str3 = str9;
                                            i13 = i22;
                                            i12 = 5;
                                            cursor = null;
                                            if (sQLiteDatabase != null) {
                                            }
                                            W w12222222222 = c0646q03.f11912f;
                                            C0646q0.l(w12222222222);
                                            w12222222222.f11577f.b(e, "Error reading entries from local database");
                                            n6.f11520d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                            i22 = i13 + 1;
                                            i21 = i12;
                                            str7 = str;
                                            str8 = str2;
                                            str9 = str3;
                                            arrayList5 = arrayList3;
                                            c0646q02 = c0646q0;
                                            o16 = o13;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        c0646q0 = c0646q02;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    c0646q0 = c0646q02;
                                    o13 = o16;
                                    arrayList3 = arrayList5;
                                    str = str7;
                                    str2 = str8;
                                    str3 = str9;
                                    i12 = 5;
                                    i13 = i22;
                                    cursor3 = null;
                                }
                            }
                            th = th;
                        } catch (SQLiteDatabaseLockedException unused22) {
                            c0646q0 = c0646q02;
                            o13 = o16;
                            arrayList3 = arrayList5;
                            str = str7;
                            str2 = str8;
                            str3 = str9;
                            i12 = 5;
                            i13 = i22;
                            cursor = null;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e41) {
                            e = e41;
                            c0646q0 = c0646q02;
                            o13 = o16;
                            arrayList3 = arrayList5;
                            str = str7;
                            str2 = str8;
                            str3 = str9;
                            i12 = 5;
                            i13 = i22;
                            cursor = null;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e42) {
                            e = e42;
                            c0646q0 = c0646q02;
                            o13 = o16;
                            arrayList3 = arrayList5;
                            str = str7;
                            str2 = str8;
                            str3 = str9;
                            i12 = 5;
                            i13 = i22;
                            cursor = null;
                            sQLiteDatabase = null;
                        } catch (Throwable th10) {
                            th = th10;
                            sQLiteDatabase = null;
                        }
                        cursor2 = null;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                    c0646q0 = c0646q02;
                    o13 = o16;
                    arrayList2 = arrayList5;
                    i11 = 0;
                    W w13 = c0646q03.f11912f;
                    C0646q0.l(w13);
                    w13.f11580w.a("Failed to read events from database in reasonable time");
                    arrayList = null;
                } else {
                    c0646q0 = c0646q02;
                    o13 = o16;
                    i10 = i20;
                    arrayList2 = arrayList5;
                    i11 = 0;
                }
                if (arrayList == null) {
                    arrayList4 = arrayList2;
                    arrayList4.addAll(arrayList);
                    aVar2 = aVar;
                    i16 = arrayList.size();
                } else {
                    arrayList4 = arrayList2;
                    aVar2 = aVar;
                    i16 = i11;
                }
                if (aVar2 == null) {
                    o14 = o13;
                    if (i16 < 100) {
                        arrayList4.add(new O(aVar2, o14.f11508c, o14.f11515x));
                    }
                } else {
                    o14 = o13;
                }
                E e43 = F.f11281O0;
                C0646q0 c0646q04 = c0646q0;
                C0615g c0615g2 = c0646q04.f11910d;
                String str10 = null;
                boolean T10 = c0615g2.T(null, e43);
                size = arrayList4.size();
                O1 o17 = o14;
                i17 = i11;
                while (i17 < size) {
                    O o10 = (O) arrayList4.get(i17);
                    G5.a aVar3 = o10.f11482a;
                    E e44 = F.f11312c1;
                    if (c0615g2.T(str10, e44)) {
                        String str11 = o10.f11483b;
                        if (!TextUtils.isEmpty(str11)) {
                            o15 = new O1(o17.f11506a, o17.f11507b, str11, o10.f11484c, o17.f11509d, o17.f11510e, o17.f11511f, o17.f11512u, o17.f11513v, o17.f11514w, o17.f11516y, o17.f11517z, o17.f11488A, o17.f11489B, o17.f11490C, o17.f11491D, o17.f11492E, o17.f11493F, o17.f11494G, o17.f11495H, o17.f11496I, o17.f11497J, o17.f11498K, o17.L, o17.f11499M, o17.f11500N, o17.f11501O, o17.f11502P, o17.f11503Q, o17.f11504R, o17.f11505S);
                            z8 = aVar3 instanceof C0648s;
                            W w14 = c0646q04.f11912f;
                            if (!z8) {
                                Context context = c0646q04.f11907a;
                                M5.b bVar = c0646q04.f11917y;
                                if (T10) {
                                    try {
                                        bVar.getClass();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        try {
                                            bVar.getClass();
                                            j13 = currentTimeMillis;
                                            j12 = SystemClock.elapsedRealtime();
                                        } catch (RemoteException e45) {
                                            e = e45;
                                            j12 = 0;
                                            j11 = currentTimeMillis;
                                            C0646q0.l(w14);
                                            w14.f11577f.b(e, "Failed to send event to the service");
                                            if (T10) {
                                                if (Q7.h.f8692e == null) {
                                                }
                                                Q7.h hVar = Q7.h.f8692e;
                                                bVar.getClass();
                                                long currentTimeMillis2 = System.currentTimeMillis();
                                                bVar.getClass();
                                                hVar.c0(13, (int) (SystemClock.elapsedRealtime() - j12), j11, currentTimeMillis2);
                                            }
                                            str6 = null;
                                            i17++;
                                            str10 = str6;
                                            o17 = o15;
                                        }
                                    } catch (RemoteException e46) {
                                        e = e46;
                                        j11 = 0;
                                        j12 = 0;
                                    }
                                } else {
                                    j13 = 0;
                                    j12 = 0;
                                }
                                try {
                                } catch (RemoteException e47) {
                                    e = e47;
                                }
                                try {
                                    i7.z((C0648s) aVar3, o15);
                                    if (T10) {
                                        C0646q0.l(w14);
                                        w14.f11573B.a("Logging telemetry for logEvent from database");
                                        if (Q7.h.f8692e == null) {
                                            Q7.h.f8692e = new Q7.h(context, c0646q04);
                                        }
                                        Q7.h hVar2 = Q7.h.f8692e;
                                        bVar.getClass();
                                        long currentTimeMillis3 = System.currentTimeMillis();
                                        bVar.getClass();
                                        hVar2.c0(0, (int) (SystemClock.elapsedRealtime() - j12), j13, currentTimeMillis3);
                                    }
                                } catch (RemoteException e48) {
                                    e = e48;
                                    j11 = j13;
                                    C0646q0.l(w14);
                                    w14.f11577f.b(e, "Failed to send event to the service");
                                    if (T10 && j11 != 0) {
                                        if (Q7.h.f8692e == null) {
                                            Q7.h.f8692e = new Q7.h(context, c0646q04);
                                        }
                                        Q7.h hVar3 = Q7.h.f8692e;
                                        bVar.getClass();
                                        long currentTimeMillis22 = System.currentTimeMillis();
                                        bVar.getClass();
                                        hVar3.c0(13, (int) (SystemClock.elapsedRealtime() - j12), j11, currentTimeMillis22);
                                    }
                                    str6 = null;
                                    i17++;
                                    str10 = str6;
                                    o17 = o15;
                                }
                            } else if (aVar3 instanceof K1) {
                                try {
                                    i7.f((K1) aVar3, o15);
                                } catch (RemoteException e49) {
                                    C0646q0.l(w14);
                                    w14.f11577f.b(e49, "Failed to send user property to the service");
                                }
                            } else if (aVar3 instanceof C0609e) {
                                try {
                                    i7.v((C0609e) aVar3, o15);
                                } catch (RemoteException e50) {
                                    C0646q0.l(w14);
                                    w14.f11577f.b(e50, "Failed to send conditional user property to the service");
                                }
                            } else {
                                str6 = null;
                                if (c0615g2.T(null, e44) && (aVar3 instanceof r)) {
                                    try {
                                        i7.l(o15, ((r) aVar3).D());
                                    } catch (RemoteException e51) {
                                        C0646q0.l(w14);
                                        w14.f11577f.b(e51, "Failed to send default event parameters to the service");
                                    }
                                } else {
                                    C0646q0.l(w14);
                                    w14.f11577f.a("Discarding data. Unrecognized parcel type.");
                                }
                                i17++;
                                str10 = str6;
                                o17 = o15;
                            }
                            str6 = null;
                            i17++;
                            str10 = str6;
                            o17 = o15;
                        }
                    }
                    o15 = o17;
                    z8 = aVar3 instanceof C0648s;
                    W w142 = c0646q04.f11912f;
                    if (!z8) {
                    }
                    str6 = null;
                    i17++;
                    str10 = str6;
                    o17 = o15;
                }
                i20 = i10 + 1;
                c0646q02 = c0646q04;
                i18 = 100;
                o16 = o17;
                i19 = i16;
            }
            arrayList2 = arrayList5;
            i11 = 0;
            arrayList = null;
            if (arrayList == null) {
            }
            if (aVar2 == null) {
            }
            E e432 = F.f11281O0;
            C0646q0 c0646q042 = c0646q0;
            C0615g c0615g22 = c0646q042.f11910d;
            String str102 = null;
            boolean T102 = c0615g22.T(null, e432);
            size = arrayList4.size();
            O1 o172 = o14;
            i17 = i11;
            while (i17 < size) {
            }
            i20 = i10 + 1;
            c0646q02 = c0646q042;
            i18 = 100;
            o16 = o172;
            i19 = i16;
        }
    }

    public final void c0(C0609e c0609e) {
        boolean Q3;
        J();
        K();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        c0646q0.getClass();
        P n6 = c0646q0.n();
        C0646q0 c0646q02 = (C0646q0) n6.f3094a;
        C0646q0.j(c0646q02.f11915w);
        byte[] n02 = M1.n0(c0609e);
        if (n02.length > 131072) {
            W w10 = c0646q02.f11912f;
            C0646q0.l(w10);
            w10.f11578u.a("Conditional user property too long for local database. Sending directly to service");
            Q3 = false;
        } else {
            Q3 = n6.Q(2, n02);
        }
        X(new E5.j(this, Z(true), Q3, new C0609e(c0609e)));
    }
}
