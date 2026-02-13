package r7;

import Y5.A;
import android.os.Bundle;
import android.util.Log;
import c7.C0914c;
import c7.InterfaceC0913b;
import ha.g;
import i1.C1290a;
import j8.InterfaceC1386a;
import j8.InterfaceC1387b;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import o7.o;
import q3.n;
import t7.InterfaceC2030a;
import u7.C2116b;
import u7.InterfaceC2115a;

/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1945a implements InterfaceC2115a, InterfaceC2030a, InterfaceC1386a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1946b f23799a;

    @Override // j8.InterfaceC1386a
    public void f(InterfaceC1387b interfaceC1387b) {
        C1946b c1946b = this.f23799a;
        c1946b.getClass();
        s7.c cVar = s7.c.f24187a;
        cVar.c("AnalyticsConnector now available.");
        InterfaceC0913b interfaceC0913b = (InterfaceC0913b) interfaceC1387b.get();
        o oVar = new o(interfaceC0913b, 8);
        g gVar = new g(9, false);
        C0914c c0914c = (C0914c) interfaceC0913b;
        A b2 = c0914c.b("clx", gVar);
        if (b2 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            A b10 = c0914c.b("crash", gVar);
            if (b10 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            b2 = b10;
        }
        if (b2 == null) {
            cVar.g("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        cVar.c("Registered Firebase Analytics listener.");
        C1290a c1290a = new C1290a(22);
        n nVar = new n(oVar, TimeUnit.MILLISECONDS);
        synchronized (c1946b) {
            try {
                Iterator it = c1946b.f23802c.iterator();
                while (it.hasNext()) {
                    c1290a.h((v7.n) it.next());
                }
                gVar.f17916c = c1290a;
                gVar.f17915b = nVar;
                c1946b.f23801b = c1290a;
                c1946b.f23800a = nVar;
            } finally {
            }
        }
    }

    @Override // u7.InterfaceC2115a
    public void h(v7.n nVar) {
        C1946b c1946b = this.f23799a;
        synchronized (c1946b) {
            try {
                if (c1946b.f23801b instanceof C2116b) {
                    c1946b.f23802c.add(nVar);
                }
                c1946b.f23801b.h(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t7.InterfaceC2030a
    public void j(Bundle bundle) {
        this.f23799a.f23800a.j(bundle);
    }
}
