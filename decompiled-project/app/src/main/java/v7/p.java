package v7;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.C1108c;
import ia.C1358d;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import r7.C1945a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25150a;

    /* renamed from: b, reason: collision with root package name */
    public final G f25151b;

    /* renamed from: c, reason: collision with root package name */
    public final ha.g f25152c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25153d;

    /* renamed from: e, reason: collision with root package name */
    public C1108c f25154e;

    /* renamed from: f, reason: collision with root package name */
    public C1108c f25155f;
    public l g;

    /* renamed from: h, reason: collision with root package name */
    public final v f25156h;

    /* renamed from: i, reason: collision with root package name */
    public final B7.d f25157i;
    public final C1945a j;
    public final C1945a k;

    /* renamed from: l, reason: collision with root package name */
    public final i f25158l;

    /* renamed from: m, reason: collision with root package name */
    public final s7.a f25159m;

    /* renamed from: n, reason: collision with root package name */
    public final C1358d f25160n;

    /* renamed from: o, reason: collision with root package name */
    public final w7.d f25161o;

    public p(Y6.i iVar, v vVar, s7.a aVar, G g, C1945a c1945a, C1945a c1945a2, B7.d dVar, i iVar2, C1358d c1358d, w7.d dVar2) {
        this.f25151b = g;
        iVar.b();
        this.f25150a = iVar.f12041a;
        this.f25156h = vVar;
        this.f25159m = aVar;
        this.j = c1945a;
        this.k = c1945a2;
        this.f25157i = dVar;
        this.f25158l = iVar2;
        this.f25160n = c1358d;
        this.f25161o = dVar2;
        this.f25153d = System.currentTimeMillis();
        this.f25152c = new ha.g(13);
    }

    public final void a(D7.d dVar) {
        w7.d.a();
        w7.d.a();
        this.f25154e.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.h(new n(this));
                this.g.g();
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e2);
            }
            if (!dVar.b().f3262b.f2540a) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.g.d(dVar)) {
                Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
            }
            this.g.h(((TaskCompletionSource) ((AtomicReference) dVar.f3276i).get()).getTask());
            c();
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(D7.d dVar) {
        Future<?> submit = this.f25161o.f25819a.f25815a.submit(new m(this, dVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }

    public final void c() {
        w7.d.a();
        try {
            C1108c c1108c = this.f25154e;
            String str = (String) c1108c.f16831c;
            B7.d dVar = (B7.d) c1108c.f16830b;
            dVar.getClass();
            if (new File((File) dVar.f2212c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e2) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e2);
        }
    }
}
