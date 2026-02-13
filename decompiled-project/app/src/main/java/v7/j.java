package v7;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ia.C1358d;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import o.Y0;

/* loaded from: classes.dex */
public final class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f25120b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f25121c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D7.d f25122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f25123e;

    public j(l lVar, long j, Throwable th, Thread thread, D7.d dVar) {
        this.f25123e = lVar;
        this.f25119a = j;
        this.f25120b = th;
        this.f25121c = thread;
        this.f25122d = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        B7.d dVar;
        String str;
        long j = this.f25119a;
        long j10 = j / 1000;
        l lVar = this.f25123e;
        String e2 = lVar.e();
        if (e2 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        lVar.f25130c.a();
        Y0 y02 = lVar.f25137m;
        y02.getClass();
        String concat = "Persisting fatal event for session ".concat(e2);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        y02.f(this.f25120b, this.f25121c, "crash", new x7.c(e2, j10, Eb.w.f3892a), true);
        try {
            dVar = lVar.g;
            str = ".ae" + j;
            dVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File((File) dVar.f2212c, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        D7.d dVar2 = this.f25122d;
        lVar.b(false, dVar2, false);
        lVar.c(new e().f25107a, Boolean.FALSE);
        return !lVar.f25129b.b() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) dVar2.f3276i).get()).getTask().onSuccessTask(lVar.f25132e.f25819a, new C1358d(this, e2));
    }
}
