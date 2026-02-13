package okhttp3.internal.connection;

import a.AbstractC0672a;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;

/* loaded from: classes2.dex */
public final class FastFallbackExchangeFinder implements ExchangeFinder {

    /* renamed from: a, reason: collision with root package name */
    public final RoutePlanner f22582a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskRunner f22583b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22584c;

    /* renamed from: d, reason: collision with root package name */
    public long f22585d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f22586e;

    /* renamed from: f, reason: collision with root package name */
    public final BlockingQueue f22587f;

    public FastFallbackExchangeFinder(RoutePlanner routePlanner, TaskRunner taskRunner) {
        l.e(taskRunner, "taskRunner");
        this.f22582a = routePlanner;
        this.f22583b = taskRunner;
        this.f22584c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f22585d = Long.MIN_VALUE;
        this.f22586e = new CopyOnWriteArrayList();
        this.f22587f = new LinkedBlockingDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[SYNTHETIC] */
    @Override // okhttp3.internal.connection.ExchangeFinder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RealConnection a() {
        RoutePlanner.ConnectResult d10;
        Throwable th;
        RoutePlanner.Plan plan;
        IOException iOException = null;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f22586e;
            try {
                boolean isEmpty = copyOnWriteArrayList.isEmpty();
                RoutePlanner routePlanner = this.f22582a;
                if (isEmpty && !routePlanner.d(null)) {
                    c();
                    l.b(iOException);
                    throw iOException;
                }
                if (routePlanner.a()) {
                    throw new IOException("Canceled");
                }
                TaskRunner.RealBackend realBackend = this.f22583b.f22522a;
                long nanoTime = System.nanoTime();
                long j = this.f22585d - nanoTime;
                if (!copyOnWriteArrayList.isEmpty() && j > 0) {
                    d10 = null;
                    if (d10 != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (!copyOnWriteArrayList.isEmpty() && (d10 = (RoutePlanner.ConnectResult) this.f22587f.poll(j, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(d10.f22657a);
                            if (d10 != null) {
                            }
                        }
                        d10 = null;
                        if (d10 != null) {
                        }
                    }
                    RoutePlanner.Plan plan2 = d10.f22657a;
                    boolean z8 = false;
                    if (d10.f22658b != null && d10.f22659c == null) {
                        c();
                        if (!plan2.b()) {
                            d10 = plan2.d();
                        }
                        if (d10.f22658b == null && d10.f22659c == null) {
                            z8 = true;
                        }
                        if (z8) {
                            RealConnection e2 = d10.f22657a.e();
                            c();
                            return e2;
                        }
                    }
                    th = d10.f22659c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            AbstractC0672a.c(iOException, th);
                        }
                    }
                    plan = d10.f22658b;
                    if (plan == null) {
                        routePlanner.b().addFirst(plan);
                    }
                }
                d10 = d();
                j = this.f22584c;
                this.f22585d = nanoTime + j;
                if (d10 != null) {
                }
                RoutePlanner.Plan plan22 = d10.f22657a;
                boolean z82 = false;
                if (d10.f22658b != null && d10.f22659c == null) {
                }
                th = d10.f22659c;
                if (th != null) {
                }
                plan = d10.f22658b;
                if (plan == null) {
                }
            } catch (Throwable th2) {
                c();
                throw th2;
            }
        }
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.f22582a;
    }

    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22586e;
        Iterator it = copyOnWriteArrayList.iterator();
        l.d(it, "iterator(...)");
        while (it.hasNext()) {
            RoutePlanner.Plan plan = (RoutePlanner.Plan) it.next();
            plan.cancel();
            RoutePlanner.Plan a9 = plan.a();
            if (a9 != null) {
                this.f22582a.b().addLast(a9);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final RoutePlanner.ConnectResult d() {
        final RoutePlanner.Plan failedPlan;
        RoutePlanner routePlanner = this.f22582a;
        if (routePlanner.d(null)) {
            try {
                failedPlan = routePlanner.c();
            } catch (Throwable th) {
                failedPlan = new FailedPlan(th);
            }
            if (failedPlan.b()) {
                return new RoutePlanner.ConnectResult(failedPlan, null, null, 6);
            }
            if (failedPlan instanceof FailedPlan) {
                return ((FailedPlan) failedPlan).f22581a;
            }
            this.f22586e.add(failedPlan);
            final String str = _UtilJvmKt.f22498b + " connect " + routePlanner.e().f22245h.g();
            this.f22583b.d().c(new Task(str) { // from class: okhttp3.internal.connection.FastFallbackExchangeFinder$launchTcpConnect$1
                @Override // okhttp3.internal.concurrent.Task
                public final long a() {
                    RoutePlanner.ConnectResult connectResult;
                    RoutePlanner.Plan plan = failedPlan;
                    try {
                        connectResult = plan.g();
                    } catch (Throwable th2) {
                        connectResult = new RoutePlanner.ConnectResult(plan, null, th2, 2);
                    }
                    FastFallbackExchangeFinder fastFallbackExchangeFinder = this;
                    if (!fastFallbackExchangeFinder.f22586e.contains(plan)) {
                        return -1L;
                    }
                    fastFallbackExchangeFinder.f22587f.put(connectResult);
                    return -1L;
                }
            }, 0L);
        }
        return null;
    }
}
