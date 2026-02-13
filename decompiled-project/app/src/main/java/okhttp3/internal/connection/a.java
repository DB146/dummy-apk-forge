package okhttp3.internal.connection;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import h3.C1249k;
import h3.z;
import java.util.UUID;
import kotlin.jvm.internal.l;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import q3.b;
import q3.m;
import q3.n;
import r3.p;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22674d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i7) {
        this.f22671a = i7;
        this.f22672b = obj;
        this.f22673c = obj2;
        this.f22674d = obj3;
    }

    @Override // Rb.a
    public final Object invoke() {
        Object obj = this.f22674d;
        Object obj2 = this.f22673c;
        Object obj3 = this.f22672b;
        switch (this.f22671a) {
            case 0:
                int i7 = ConnectPlan.f22538M;
                CertificateChainCleaner certificateChainCleaner = ((CertificatePinner) obj3).f22264b;
                l.b(certificateChainCleaner);
                return certificateChainCleaner.a(((Address) obj).f22245h.f22338d, ((Handshake) obj2).a());
            default:
                p pVar = (p) obj3;
                pVar.getClass();
                UUID uuid = (UUID) obj2;
                String uuid2 = uuid.toString();
                z e2 = z.e();
                StringBuilder sb2 = new StringBuilder("Updating progress for ");
                sb2.append(uuid);
                sb2.append(" (");
                C1249k c1249k = (C1249k) obj;
                sb2.append(c1249k);
                sb2.append(")");
                String sb3 = sb2.toString();
                String str = p.f23688c;
                e2.a(str, sb3);
                WorkDatabase workDatabase = pVar.f23689a;
                workDatabase.c();
                try {
                    q3.p h10 = workDatabase.C().h(uuid2);
                    if (h10 == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (h10.f23404b == 2) {
                        m mVar = new m(uuid2, c1249k);
                        n B10 = workDatabase.B();
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) B10.f23396b;
                        workDatabase_Impl.b();
                        workDatabase_Impl.c();
                        try {
                            ((b) B10.f23397c).o(mVar);
                            workDatabase_Impl.v();
                            workDatabase_Impl.r();
                        } catch (Throwable th) {
                            workDatabase_Impl.r();
                            throw th;
                        }
                    } else {
                        z.e().h(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                    }
                    workDatabase.v();
                    workDatabase.r();
                    return null;
                } finally {
                }
        }
    }
}
