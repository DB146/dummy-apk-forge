package okhttp3.internal.connection;

import A3.c;
import Eb.w;
import h3.o;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class RealConnectionPool {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f22632h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f22633a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectionListener f22634b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22635c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Map f22636d = w.f3892a;

    /* renamed from: e, reason: collision with root package name */
    public final TaskQueue f22637e;

    /* renamed from: f, reason: collision with root package name */
    public final RealConnectionPool$cleanupTask$1 f22638f;
    public final ConcurrentLinkedQueue g;

    /* loaded from: classes2.dex */
    public static final class AddressState {
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        new Companion(0);
        AtomicReferenceFieldUpdater.newUpdater(RealConnectionPool.class, Map.class, "d");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i7, long j, TimeUnit timeUnit, ConnectionListener connectionListener, okhttp3.a aVar) {
        this.f22633a = i7;
        this.f22634b = connectionListener;
        this.f22635c = timeUnit.toNanos(j);
        this.f22637e = taskRunner.d();
        final String p10 = o.p(new StringBuilder(), _UtilJvmKt.f22498b, " ConnectionPool connection closer");
        this.f22638f = new Task(p10) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                RealConnectionPool realConnectionPool = RealConnectionPool.this;
                long nanoTime = System.nanoTime();
                Map map = realConnectionPool.f22636d;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((RealConnectionPool.AddressState) it.next()).getClass();
                }
                Iterator it2 = realConnectionPool.g.iterator();
                l.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    RealConnection realConnection = (RealConnection) it2.next();
                    if (((RealConnectionPool.AddressState) map.get(realConnection.f22623d.f22470a)) != null) {
                        synchronized (realConnection) {
                        }
                    }
                }
                long j10 = (nanoTime - realConnectionPool.f22635c) + 1;
                Iterator it3 = realConnectionPool.g.iterator();
                l.d(it3, "iterator(...)");
                int i10 = 0;
                long j11 = Long.MAX_VALUE;
                RealConnection realConnection2 = null;
                RealConnection realConnection3 = null;
                int i11 = 0;
                while (it3.hasNext()) {
                    RealConnection realConnection4 = (RealConnection) it3.next();
                    l.b(realConnection4);
                    synchronized (realConnection4) {
                        if (realConnectionPool.a(realConnection4, nanoTime) > 0) {
                            i11++;
                        } else {
                            int i12 = i10;
                            long j12 = realConnection4.f22620I;
                            if (j12 < j10) {
                                j10 = j12;
                                realConnection2 = realConnection4;
                            }
                            if (((RealConnectionPool.AddressState) map.get(realConnection4.f22623d.f22470a)) != null) {
                                throw null;
                            }
                            int i13 = i12 + 1;
                            if (j12 < j11) {
                                j11 = j12;
                                realConnection3 = realConnection4;
                            }
                            i10 = i13;
                        }
                    }
                }
                int i14 = i10;
                if (realConnection2 == null) {
                    if (i14 > realConnectionPool.f22633a) {
                        j10 = j11;
                        realConnection2 = realConnection3;
                    } else {
                        j10 = -1;
                        realConnection2 = null;
                    }
                }
                if (realConnection2 == null) {
                    if (realConnection3 != null) {
                        return (j11 + realConnectionPool.f22635c) - nanoTime;
                    }
                    if (i11 > 0) {
                        return realConnectionPool.f22635c;
                    }
                    return -1L;
                }
                synchronized (realConnection2) {
                    if (!realConnection2.f22619H.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection2.f22620I != j10) {
                        return 0L;
                    }
                    realConnection2.f22613B = true;
                    realConnectionPool.g.remove(realConnection2);
                    RealConnectionPool.AddressState addressState = (RealConnectionPool.AddressState) map.get(realConnection2.f22623d.f22470a);
                    if (addressState != null) {
                        realConnectionPool.b(addressState);
                        throw null;
                    }
                    _UtilJvmKt.c(realConnection2.f22625f);
                    if (!realConnectionPool.g.isEmpty()) {
                        return 0L;
                    }
                    TaskQueue taskQueue = realConnectionPool.f22637e;
                    synchronized (taskQueue.f22511a) {
                        if (taskQueue.a()) {
                            taskQueue.f22511a.c(taskQueue);
                        }
                    }
                    return 0L;
                }
            }
        };
        this.g = new ConcurrentLinkedQueue();
        if (j <= 0) {
            throw new IllegalArgumentException(c.h("keepAliveDuration <= 0: ", j).toString());
        }
    }

    public final int a(RealConnection realConnection, long j) {
        TimeZone timeZone = _UtilJvmKt.f22497a;
        ArrayList arrayList = realConnection.f22619H;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                String str = "A connection to " + realConnection.f22623d.f22470a.f22245h + " was leaked. Did you forget to close a response body?";
                Platform.f22897a.getClass();
                Platform.f22898b.i(((RealCall.CallReference) reference).f22610a, str);
                arrayList.remove(i7);
                if (arrayList.isEmpty()) {
                    realConnection.f22620I = j - this.f22635c;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public final void b(final AddressState addressState) {
        final String p10 = o.p(new StringBuilder(), _UtilJvmKt.f22498b, " ConnectionPool connection opener");
        new Task(p10) { // from class: okhttp3.internal.connection.RealConnectionPool$scheduleOpener$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                int i7 = RealConnectionPool.f22632h;
                RealConnectionPool.this.getClass();
                addressState.getClass();
                throw null;
            }
        };
        throw null;
    }
}
