package v8;

import L7.o;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: v8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2149c {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f25198d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final E2.d f25199e = new E2.d(0);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f25200a;

    /* renamed from: b, reason: collision with root package name */
    public final l f25201b;

    /* renamed from: c, reason: collision with root package name */
    public Task f25202c = null;

    public C2149c(Executor executor, l lVar) {
        this.f25200a = executor;
        this.f25201b = lVar;
    }

    public static Object a(Task task, TimeUnit timeUnit) {
        E5.i iVar = new E5.i();
        Executor executor = f25199e;
        task.addOnSuccessListener(executor, iVar);
        task.addOnFailureListener(executor, iVar);
        task.addOnCanceledListener(executor, iVar);
        if (!iVar.f3689a.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.f25202c;
            if (task != null) {
                if (task.isComplete() && !this.f25202c.isSuccessful()) {
                }
            }
            this.f25202c = Tasks.call(this.f25200a, new D7.c(this.f25201b, 5));
        } catch (Throwable th) {
            throw th;
        }
        return this.f25202c;
    }

    public final C2151e c() {
        synchronized (this) {
            try {
                Task task = this.f25202c;
                if (task != null && task.isSuccessful()) {
                    return (C2151e) this.f25202c.getResult();
                }
                try {
                    return (C2151e) a(b(), TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } finally {
            }
        }
    }

    public final Task d(C2151e c2151e) {
        o oVar = new o(4, this, c2151e);
        Executor executor = this.f25200a;
        return Tasks.call(executor, oVar).onSuccessTask(executor, new n4.b(7, this, c2151e));
    }
}
