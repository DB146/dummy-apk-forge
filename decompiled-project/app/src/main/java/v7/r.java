package v7;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final o7.o f25168a;

    /* renamed from: b, reason: collision with root package name */
    public final D7.d f25169b;

    /* renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f25170c;

    /* renamed from: d, reason: collision with root package name */
    public final s7.a f25171d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25172e = new AtomicBoolean(false);

    public r(o7.o oVar, D7.d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, s7.a aVar) {
        this.f25168a = oVar;
        this.f25169b = dVar;
        this.f25170c = uncaughtExceptionHandler;
        this.f25171d = aVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.f25171d.b()) {
            return true;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f25170c;
        AtomicBoolean atomicBoolean = this.f25172e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.f25168a.p(this.f25169b, thread, th);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
            } catch (Exception e2) {
                s7.c cVar = s7.c.f24187a;
                if (cVar.b(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e2);
                }
                if (uncaughtExceptionHandler != null) {
                    cVar.c("Completed exception processing. Invoking default exception handler.");
                } else {
                    cVar.c("Completed exception processing, but no default exception handler.");
                }
            }
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
                atomicBoolean.set(false);
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
            }
            System.exit(1);
            atomicBoolean.set(false);
        } catch (Throwable th2) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th2;
        }
    }
}
