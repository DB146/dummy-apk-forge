package okhttp3;

import com.google.android.gms.common.api.f;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes2.dex */
public final class Dispatcher {

    /* renamed from: c, reason: collision with root package name */
    public AbstractExecutorService f22314c;

    /* renamed from: a, reason: collision with root package name */
    public final int f22312a = 64;

    /* renamed from: b, reason: collision with root package name */
    public final int f22313b = 5;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f22315d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f22316e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f22317f = new ArrayDeque();

    public final synchronized ExecutorService a() {
        AbstractExecutorService abstractExecutorService;
        try {
            if (this.f22314c == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = _UtilJvmKt.f22498b + " Dispatcher";
                l.e(name, "name");
                this.f22314c = new ThreadPoolExecutor(0, f.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new oc.a(name, false));
            }
            abstractExecutorService = this.f22314c;
            l.b(abstractExecutorService);
        } catch (Throwable th) {
            throw th;
        }
        return abstractExecutorService;
    }

    public final RealCall.AsyncCall b(String str) {
        Iterator it = this.f22316e.iterator();
        l.d(it, "iterator(...)");
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (l.a(RealCall.this.f22596b.f22424a.f22338d, str)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.f22315d.iterator();
        l.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (l.a(RealCall.this.f22596b.f22424a.f22338d, str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    public final void c(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        e();
    }

    public final void d(RealCall.AsyncCall asyncCall) {
        asyncCall.f22608b.decrementAndGet();
        c(this.f22316e, asyncCall);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        TimeZone timeZone = _UtilJvmKt.f22497a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f22315d.iterator();
                l.d(it, "iterator(...)");
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
                    if (this.f22316e.size() >= this.f22312a) {
                        break;
                    }
                    if (asyncCall.f22608b.get() < this.f22313b) {
                        it.remove();
                        asyncCall.f22608b.incrementAndGet();
                        arrayList.add(asyncCall);
                        this.f22316e.add(asyncCall);
                    }
                }
                synchronized (this) {
                    this.f22316e.size();
                    this.f22317f.size();
                }
                int i7 = 0;
                if (!a().isShutdown()) {
                    int size = arrayList.size();
                    while (i7 < size) {
                        RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) arrayList.get(i7);
                        asyncCall2.f22608b.decrementAndGet();
                        synchronized (this) {
                            this.f22316e.remove(asyncCall2);
                        }
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(null);
                        RealCall realCall = RealCall.this;
                        realCall.i(interruptedIOException);
                        asyncCall2.f22607a.i(realCall, interruptedIOException);
                        i7++;
                    }
                    return;
                }
                int size2 = arrayList.size();
                while (i7 < size2) {
                    RealCall.AsyncCall asyncCall3 = (RealCall.AsyncCall) arrayList.get(i7);
                    ExecutorService a9 = a();
                    asyncCall3.getClass();
                    RealCall realCall2 = RealCall.this;
                    l.e(realCall2.f22595a.f22364a, "<this>");
                    try {
                        try {
                            a9.execute(asyncCall3);
                        } catch (Throwable th) {
                            realCall2.f22595a.f22364a.d(asyncCall3);
                            throw th;
                        }
                    } catch (RejectedExecutionException e2) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e2);
                        RealCall realCall3 = RealCall.this;
                        realCall3.i(interruptedIOException2);
                        asyncCall3.f22607a.i(realCall3, interruptedIOException2);
                        realCall2.f22595a.f22364a.d(asyncCall3);
                    }
                    i7++;
                }
                return;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i72 = 0;
        if (!a().isShutdown()) {
        }
    }
}
