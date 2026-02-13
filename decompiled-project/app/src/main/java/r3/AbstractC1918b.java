package r3;

import A9.N2;
import I2.AbstractC0315d;
import I2.H;
import P4.G;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import h3.C1243e;
import h3.C1247i;
import h3.C1249k;
import h3.I;
import h3.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

/* renamed from: r3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1918b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23654a = z.g("EnqueueRunnable");

    public static void a(i3.m mVar) {
        boolean z8;
        mVar.getClass();
        HashSet hashSet = new HashSet();
        hashSet.addAll(mVar.f18369f);
        HashSet T10 = i3.m.T(mVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(mVar.f18369f);
                z8 = false;
                break;
            } else if (T10.contains((String) it.next())) {
                z8 = true;
                break;
            }
        }
        if (z8) {
            throw new IllegalStateException("WorkContinuation has cycles (" + mVar + ")");
        }
        i3.p pVar = mVar.f18365b;
        WorkDatabase workDatabase = pVar.f18380d;
        workDatabase.c();
        try {
            f.b(workDatabase, pVar.f18379c, mVar);
            boolean b2 = b(mVar);
            workDatabase.v();
            if (b2) {
                i3.h.b(pVar.f18379c, pVar.f18380d, pVar.f18382f);
            }
        } finally {
            workDatabase.r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b1  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(i3.m mVar) {
        boolean z8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        mVar.getClass();
        String[] strArr = (String[]) i3.m.T(mVar).toArray(new String[0]);
        i3.p pVar = mVar.f18365b;
        pVar.f18379c.f17671d.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z15 = strArr != null && strArr.length > 0;
        WorkDatabase workDatabase = pVar.f18380d;
        if (z15) {
            int length = strArr.length;
            int i10 = 0;
            z10 = false;
            z11 = false;
            z8 = true;
            while (i10 < length) {
                String str = strArr[i10];
                q3.p h10 = workDatabase.C().h(str);
                if (h10 == null) {
                    z.e().c(f23654a, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    break;
                }
                int i11 = h10.f23404b;
                z8 &= i11 == 3;
                if (i11 == 4) {
                    i7 = 1;
                    z11 = true;
                } else if (i11 == 6) {
                    i7 = 1;
                    z10 = true;
                } else {
                    i7 = 1;
                }
                i10 += i7;
            }
        } else {
            z8 = true;
            z10 = false;
            z11 = false;
        }
        String str2 = mVar.f18366c;
        boolean isEmpty = TextUtils.isEmpty(str2);
        if (!isEmpty && !z15) {
            ArrayList i12 = workDatabase.C().i(str2);
            if (!i12.isEmpty()) {
                int i13 = mVar.f18367d;
                if (i13 != 3 && i13 != 4) {
                    if (i13 == 2) {
                        Iterator it = i12.iterator();
                        while (it.hasNext()) {
                            int i14 = ((q3.o) it.next()).f23401b;
                            if (i14 != 1 && i14 != 2) {
                            }
                            z14 = true;
                            z13 = false;
                        }
                    }
                    workDatabase.u(new N2(new G(workDatabase, str2, pVar, 10), 7));
                    q3.q C2 = workDatabase.C();
                    Iterator it2 = i12.iterator();
                    while (it2.hasNext()) {
                        C2.a(((q3.o) it2.next()).f23400a);
                    }
                    z12 = isEmpty;
                    z13 = true;
                    while (r9.hasNext()) {
                    }
                    z14 = true;
                    mVar.f18370h = z14;
                    return z13;
                }
                q3.c x2 = workDatabase.x();
                ArrayList arrayList = new ArrayList();
                Iterator it3 = i12.iterator();
                while (it3.hasNext()) {
                    q3.o oVar = (q3.o) it3.next();
                    String str3 = oVar.f23400a;
                    x2.getClass();
                    TreeMap treeMap = H.f5039w;
                    Iterator it4 = it3;
                    boolean z16 = isEmpty;
                    H a9 = AbstractC0315d.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                    a9.p(1, str3);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) x2.f23371b;
                    workDatabase_Impl.b();
                    Cursor n6 = P2.j.n(workDatabase_Impl, a9);
                    try {
                        if (!(n6.moveToFirst() && n6.getInt(0) != 0)) {
                            int i15 = oVar.f23401b;
                            boolean z17 = (i15 == 3) & z8;
                            if (i15 == 4) {
                                z11 = true;
                            } else if (i15 == 6) {
                                z10 = true;
                            }
                            arrayList.add(oVar.f23400a);
                            z8 = z17;
                        }
                        it3 = it4;
                        isEmpty = z16;
                    } finally {
                        n6.close();
                        a9.F();
                    }
                }
                z12 = isEmpty;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (i13 == 4 && (z10 || z11)) {
                    q3.q C10 = workDatabase.C();
                    Iterator it5 = C10.i(str2).iterator();
                    while (it5.hasNext()) {
                        C10.a(((q3.o) it5.next()).f23400a);
                    }
                    z10 = false;
                    z11 = false;
                    arrayList2 = Collections.emptyList();
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                z15 = strArr.length > 0;
                z13 = false;
                for (I i16 : mVar.f18368e) {
                    q3.p workSpec = i16.f17663b;
                    if (!z15 || z8) {
                        workSpec.f23413n = currentTimeMillis;
                    } else if (z11) {
                        workSpec.f23404b = 4;
                    } else if (z10) {
                        workSpec.f23404b = 6;
                    } else {
                        workSpec.f23404b = 5;
                    }
                    if (workSpec.f23404b == 1) {
                        z13 = true;
                    }
                    q3.q C11 = workDatabase.C();
                    List schedulers = pVar.f18382f;
                    boolean z18 = z13;
                    kotlin.jvm.internal.l.e(schedulers, "schedulers");
                    kotlin.jvm.internal.l.e(workSpec, "workSpec");
                    boolean c10 = workSpec.f23407e.c("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                    i3.p pVar2 = pVar;
                    long j = currentTimeMillis;
                    boolean c11 = workSpec.f23407e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                    boolean c12 = workSpec.f23407e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                    if (!c10 && c11 && c12) {
                        C1247i c1247i = new C1247i(0);
                        C1249k data = workSpec.f23407e;
                        kotlin.jvm.internal.l.e(data, "data");
                        c1247i.c(data.f17699a);
                        String str4 = workSpec.f23405c;
                        LinkedHashMap linkedHashMap = c1247i.f17696a;
                        linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str4);
                        C1249k c1249k = new C1249k(linkedHashMap);
                        c2.i.y(c1249k);
                        workSpec = q3.p.b(workSpec, null, 0, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", c1249k, 0, 0L, 0, 0, 0L, 0, 16777195);
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        String name = ConstraintTrackingWorker.class.getName();
                        String str5 = workSpec.f23405c;
                        if (!kotlin.jvm.internal.l.a(str5, name)) {
                            C1243e c1243e = workSpec.j;
                            if (c1243e.f17686e || c1243e.f17687f) {
                                C1247i c1247i2 = new C1247i(0);
                                C1249k data2 = workSpec.f23407e;
                                kotlin.jvm.internal.l.e(data2, "data");
                                c1247i2.c(data2.f17699a);
                                LinkedHashMap linkedHashMap2 = c1247i2.f17696a;
                                linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str5);
                                C1249k c1249k2 = new C1249k(linkedHashMap2);
                                c2.i.y(c1249k2);
                                workSpec = q3.p.b(workSpec, null, 0, ConstraintTrackingWorker.class.getName(), c1249k2, 0, 0L, 0, 0, 0L, 0, 16777195);
                            }
                        }
                    }
                    WorkDatabase_Impl workDatabase_Impl2 = C11.f23424a;
                    workDatabase_Impl2.b();
                    workDatabase_Impl2.c();
                    try {
                        C11.f23425b.o(workSpec);
                        workDatabase_Impl2.v();
                        workDatabase_Impl2.r();
                        UUID uuid = i16.f17662a;
                        if (z15) {
                            for (String str6 : strArr) {
                                String uuid2 = uuid.toString();
                                kotlin.jvm.internal.l.d(uuid2, "id.toString()");
                                q3.a aVar = new q3.a(uuid2, str6);
                                q3.c x10 = workDatabase.x();
                                WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) x10.f23371b;
                                workDatabase_Impl3.b();
                                workDatabase_Impl3.c();
                                try {
                                    ((q3.b) x10.f23372c).o(aVar);
                                    workDatabase_Impl3.v();
                                    workDatabase_Impl3.r();
                                } finally {
                                }
                            }
                        }
                        q3.s D10 = workDatabase.D();
                        String id = uuid.toString();
                        kotlin.jvm.internal.l.d(id, "id.toString()");
                        Set tags = i16.f17664c;
                        D10.getClass();
                        kotlin.jvm.internal.l.e(id, "id");
                        kotlin.jvm.internal.l.e(tags, "tags");
                        Iterator it6 = tags.iterator();
                        while (it6.hasNext()) {
                            q3.r rVar = new q3.r((String) it6.next(), id);
                            WorkDatabase_Impl workDatabase_Impl4 = (WorkDatabase_Impl) D10.f23438b;
                            workDatabase_Impl4.b();
                            workDatabase_Impl4.c();
                            try {
                                ((q3.b) D10.f23439c).o(rVar);
                                workDatabase_Impl4.v();
                            } finally {
                            }
                        }
                        if (!z12) {
                            q3.l A10 = workDatabase.A();
                            String uuid3 = uuid.toString();
                            kotlin.jvm.internal.l.d(uuid3, "id.toString()");
                            q3.k kVar = new q3.k(str2, uuid3);
                            WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) A10.f23391b;
                            workDatabase_Impl5.b();
                            workDatabase_Impl5.c();
                            try {
                                ((q3.b) A10.f23392c).o(kVar);
                                workDatabase_Impl5.v();
                            } finally {
                            }
                        }
                        z13 = z18;
                        pVar = pVar2;
                        currentTimeMillis = j;
                    } catch (Throwable th) {
                        workDatabase_Impl2.r();
                        throw th;
                    }
                }
                z14 = true;
                mVar.f18370h = z14;
                return z13;
            }
        }
        z12 = isEmpty;
        z13 = false;
        while (r9.hasNext()) {
        }
        z14 = true;
        mVar.f18370h = z14;
        return z13;
    }
}
