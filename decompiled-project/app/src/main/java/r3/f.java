package r3;

import I2.AbstractC0315d;
import I2.H;
import android.database.Cursor;
import android.net.NetworkRequest;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import h3.C1240b;
import h3.I;
import h3.z;
import i3.C1340B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import y7.u0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f23665a = {13, 15, 14};

    public static final void a(i3.p pVar, String str) {
        C1340B b2;
        WorkDatabase workDatabase = pVar.f18380d;
        kotlin.jvm.internal.l.d(workDatabase, "workManagerImpl.workDatabase");
        q3.q C2 = workDatabase.C();
        q3.c x2 = workDatabase.x();
        ArrayList B10 = u0.B(str);
        while (!B10.isEmpty()) {
            String str2 = (String) Eb.o.k0(B10);
            int g = C2.g(str2);
            if (g != 3 && g != 4) {
                WorkDatabase_Impl workDatabase_Impl = C2.f23424a;
                workDatabase_Impl.b();
                q3.h hVar = C2.f23428e;
                V2.j a9 = hVar.a();
                a9.p(1, str2);
                try {
                    workDatabase_Impl.c();
                    try {
                        a9.l();
                        workDatabase_Impl.v();
                    } finally {
                    }
                } finally {
                    hVar.l(a9);
                }
            }
            B10.addAll(x2.n(str2));
        }
        i3.d dVar = pVar.g;
        kotlin.jvm.internal.l.d(dVar, "workManagerImpl.processor");
        synchronized (dVar.k) {
            z.e().a(i3.d.f18341l, "Processor cancelling " + str);
            dVar.f18349i.add(str);
            b2 = dVar.b(str);
        }
        i3.d.d(str, b2, 1);
        Iterator it = pVar.f18382f.iterator();
        while (it.hasNext()) {
            ((i3.f) it.next()).a(str);
        }
    }

    public static final void b(WorkDatabase workDatabase, C1240b configuration, i3.m continuation) {
        int i7;
        kotlin.jvm.internal.l.e(workDatabase, "workDatabase");
        kotlin.jvm.internal.l.e(configuration, "configuration");
        kotlin.jvm.internal.l.e(continuation, "continuation");
        ArrayList B10 = u0.B(continuation);
        int i10 = 0;
        while (!B10.isEmpty()) {
            List list = ((i3.m) Eb.o.k0(B10)).f18368e;
            kotlin.jvm.internal.l.d(list, "current.work");
            if (list.isEmpty()) {
                i7 = 0;
            } else {
                Iterator it = list.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    if (!((I) it.next()).f17663b.j.f17689i.isEmpty() && (i7 = i7 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i10 += i7;
        }
        if (i10 == 0) {
            return;
        }
        q3.q C2 = workDatabase.C();
        C2.getClass();
        TreeMap treeMap = H.f5039w;
        H a9 = AbstractC0315d.a(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = C2.f23424a;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            int i11 = n6.moveToFirst() ? n6.getInt(0) : 0;
            n6.close();
            a9.F();
            int i12 = i11 + i10;
            int i13 = configuration.j;
            if (i12 > i13) {
                throw new IllegalArgumentException(A3.c.k(h3.o.q(i13, i11, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i10, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
            }
        } catch (Throwable th) {
            n6.close();
            a9.F();
            throw th;
        }
    }

    public static C1921e c(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i7 : iArr) {
            try {
                builder.addCapability(i7);
            } catch (IllegalArgumentException e2) {
                z e10 = z.e();
                String str = C1921e.f23663b;
                String str2 = C1921e.f23663b;
                String str3 = "Ignoring adding capability '" + i7 + '\'';
                if (e10.f17724a <= 5) {
                    Log.w(str2, str3, e2);
                }
            }
        }
        int[] iArr3 = f23665a;
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr3[i10];
            int length = iArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                }
                if (i11 == iArr[i12]) {
                    break;
                }
                i12++;
            }
            if (!(i12 >= 0)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e11) {
                    z e12 = z.e();
                    String str4 = C1921e.f23663b;
                    String str5 = C1921e.f23663b;
                    String str6 = "Ignoring removing default capability '" + i11 + '\'';
                    if (e12.f17724a <= 5) {
                        Log.w(str5, str6, e11);
                    }
                }
            }
        }
        for (int i13 : iArr2) {
            builder.addTransportType(i13);
        }
        NetworkRequest build = builder.build();
        kotlin.jvm.internal.l.d(build, "networkRequest.build()");
        return new C1921e(build);
    }
}
