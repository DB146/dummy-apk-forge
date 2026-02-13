package okhttp3.internal.connection;

import Eb.o;
import a.AbstractC0672a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.l;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.EventListener$Companion$NONE$1;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import rc.C1961e;

/* loaded from: classes2.dex */
public final class RealCall implements Call, Cloneable, Lockable {

    /* renamed from: A, reason: collision with root package name */
    public boolean f22591A;

    /* renamed from: B, reason: collision with root package name */
    public volatile boolean f22592B;

    /* renamed from: C, reason: collision with root package name */
    public volatile Exchange f22593C;

    /* renamed from: D, reason: collision with root package name */
    public final CopyOnWriteArrayList f22594D;

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f22595a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f22596b;

    /* renamed from: c, reason: collision with root package name */
    public final RealConnectionPool f22597c;

    /* renamed from: d, reason: collision with root package name */
    public final EventListener f22598d;

    /* renamed from: e, reason: collision with root package name */
    public final RealCall$timeout$1 f22599e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f22600f;

    /* renamed from: u, reason: collision with root package name */
    public Object f22601u;

    /* renamed from: v, reason: collision with root package name */
    public ExchangeFinder f22602v;

    /* renamed from: w, reason: collision with root package name */
    public RealConnection f22603w;

    /* renamed from: x, reason: collision with root package name */
    public Exchange f22604x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22605y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22606z;

    /* loaded from: classes2.dex */
    public final class AsyncCall implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Callback f22607a;

        /* renamed from: b, reason: collision with root package name */
        public volatile AtomicInteger f22608b = new AtomicInteger(0);

        public AsyncCall(Callback callback) {
            this.f22607a = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Dispatcher dispatcher;
            String str = "OkHttp " + RealCall.this.f22596b.f22424a.g();
            RealCall realCall = RealCall.this;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                realCall.f22599e.h();
                boolean z8 = false;
                try {
                    try {
                        try {
                            this.f22607a.g(realCall, realCall.g());
                            dispatcher = realCall.f22595a.f22364a;
                        } catch (IOException e2) {
                            e = e2;
                            z8 = true;
                            if (z8) {
                                Platform.f22897a.getClass();
                                Platform.f22898b.h(4, "Callback failure for " + RealCall.a(realCall), e);
                            } else {
                                this.f22607a.i(realCall, e);
                            }
                            dispatcher = realCall.f22595a.f22364a;
                            dispatcher.d(this);
                        } catch (Throwable th) {
                            th = th;
                            z8 = true;
                            realCall.c();
                            if (!z8) {
                                IOException iOException = new IOException("canceled due to " + th);
                                AbstractC0672a.c(iOException, th);
                                this.f22607a.i(realCall, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        realCall.f22595a.f22364a.d(this);
                        throw th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th3) {
                    th = th3;
                }
                dispatcher.d(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class CallReference extends WeakReference<RealCall> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f22610a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall referent, Object obj) {
            super(referent);
            l.e(referent, "referent");
            this.f22610a = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [rc.J, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient client, Request originalRequest) {
        l.e(client, "client");
        l.e(originalRequest, "originalRequest");
        this.f22595a = client;
        this.f22596b = originalRequest;
        this.f22597c = client.f22363D.f22285a;
        Q9.a aVar = client.f22367d;
        aVar.getClass();
        TimeZone timeZone = _UtilJvmKt.f22497a;
        this.f22598d = (EventListener$Companion$NONE$1) aVar.f8707b;
        ?? r42 = new C1961e() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // rc.C1961e
            public final void j() {
                RealCall.this.c();
            }
        };
        r42.g(client.f22382v, TimeUnit.MILLISECONDS);
        this.f22599e = r42;
        this.f22600f = new AtomicBoolean();
        this.f22591A = true;
        this.f22594D = new CopyOnWriteArrayList();
    }

    public static final String a(RealCall realCall) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(realCall.f22592B ? "canceled " : "");
        sb2.append("call");
        sb2.append(" to ");
        sb2.append(realCall.f22596b.f22424a.g());
        return sb2.toString();
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket j;
        TimeZone timeZone = _UtilJvmKt.f22497a;
        RealConnection realConnection = this.f22603w;
        if (realConnection != null) {
            synchronized (realConnection) {
                j = j();
            }
            if (this.f22603w == null) {
                if (j != null) {
                    _UtilJvmKt.c(j);
                }
                this.f22598d.k(this, realConnection);
                realConnection.f22631z.getClass();
                if (j != null) {
                    realConnection.f22631z.getClass();
                }
            } else if (j != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            EventListener eventListener = this.f22598d;
            l.b(interruptedIOException);
            eventListener.d(this, interruptedIOException);
        } else {
            this.f22598d.c(this);
        }
        return interruptedIOException;
    }

    public final void c() {
        if (this.f22592B) {
            return;
        }
        this.f22592B = true;
        Exchange exchange = this.f22593C;
        if (exchange != null) {
            exchange.f22568d.cancel();
        }
        Iterator it = this.f22594D.iterator();
        l.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((RoutePlanner.Plan) it.next()).cancel();
        }
        this.f22598d.f(this);
    }

    public final Object clone() {
        return new RealCall(this.f22595a, this.f22596b);
    }

    public final void d(Callback callback) {
        if (!this.f22600f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        Platform.f22897a.getClass();
        this.f22601u = Platform.f22898b.f();
        this.f22598d.e(this);
        Dispatcher dispatcher = this.f22595a.f22364a;
        AsyncCall asyncCall = new AsyncCall(callback);
        dispatcher.getClass();
        synchronized (dispatcher) {
            dispatcher.f22315d.add(asyncCall);
            AsyncCall b2 = dispatcher.b(this.f22596b.f22424a.f22338d);
            if (b2 != null) {
                asyncCall.f22608b = b2.f22608b;
            }
        }
        dispatcher.e();
    }

    public final Response e() {
        if (!this.f22600f.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        h();
        Platform.f22897a.getClass();
        this.f22601u = Platform.f22898b.f();
        this.f22598d.e(this);
        try {
            Dispatcher dispatcher = this.f22595a.f22364a;
            synchronized (dispatcher) {
                dispatcher.f22317f.add(this);
            }
            return g();
        } finally {
            Dispatcher dispatcher2 = this.f22595a.f22364a;
            dispatcher2.getClass();
            dispatcher2.c(dispatcher2.f22317f, this);
        }
    }

    public final void f(boolean z8) {
        Exchange exchange;
        synchronized (this) {
            if (!this.f22591A) {
                throw new IllegalStateException("released");
            }
        }
        if (z8 && (exchange = this.f22593C) != null) {
            exchange.f22568d.cancel();
            exchange.f22565a.h(exchange, true, true, null);
        }
        this.f22604x = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response g() {
        ArrayList arrayList = new ArrayList();
        o.U(arrayList, this.f22595a.f22365b);
        arrayList.add(new RetryAndFollowUpInterceptor(this.f22595a));
        arrayList.add(new BridgeInterceptor(this.f22595a.j));
        this.f22595a.getClass();
        arrayList.add(new Object());
        arrayList.add(ConnectInterceptor.f22537a);
        o.U(arrayList, this.f22595a.f22366c);
        arrayList.add(new Object());
        Request request = this.f22596b;
        OkHttpClient okHttpClient = this.f22595a;
        boolean z8 = false;
        try {
            Response a9 = new RealInterceptorChain(this, arrayList, 0, null, request, okHttpClient.f22383w, okHttpClient.f22384x, okHttpClient.f22385y).a(this.f22596b);
            if (this.f22592B) {
                _UtilCommonKt.a(a9);
                throw new IOException("Canceled");
            }
            i(null);
            return a9;
        } catch (IOException e2) {
            try {
                IOException i7 = i(e2);
                l.c(i7, "null cannot be cast to non-null type kotlin.Throwable");
                throw i7;
            } catch (Throwable th) {
                th = th;
                z8 = true;
                if (!z8) {
                    i(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z8) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException h(Exchange exchange, boolean z8, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        boolean z13;
        l.e(exchange, "exchange");
        if (!exchange.equals(this.f22593C)) {
            return iOException;
        }
        synchronized (this) {
            z11 = false;
            if (z8) {
                try {
                    if (!this.f22605y) {
                    }
                    if (z8) {
                        this.f22605y = false;
                    }
                    if (z10) {
                        this.f22606z = false;
                    }
                    z13 = this.f22605y;
                    boolean z14 = z13 && !this.f22606z;
                    if (!z13 && !this.f22606z) {
                        if (!this.f22591A) {
                            z11 = true;
                        }
                    }
                    z12 = z11;
                    z11 = z14;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z10 || !this.f22606z) {
                z12 = false;
            }
            if (z8) {
            }
            if (z10) {
            }
            z13 = this.f22605y;
            if (z13) {
            }
            if (!z13) {
                if (!this.f22591A) {
                }
            }
            z12 = z11;
            z11 = z14;
        }
        if (z11) {
            this.f22593C = null;
            RealConnection realConnection = this.f22603w;
            if (realConnection != null) {
                synchronized (realConnection) {
                    realConnection.f22616E++;
                }
            }
        }
        return z12 ? b(iOException) : iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z8;
        synchronized (this) {
            z8 = false;
            if (this.f22591A) {
                this.f22591A = false;
                if (!this.f22605y) {
                    if (!this.f22606z) {
                        z8 = true;
                    }
                }
            }
        }
        return z8 ? b(iOException) : iOException;
    }

    public final Socket j() {
        RealConnection realConnection = this.f22603w;
        l.b(realConnection);
        TimeZone timeZone = _UtilJvmKt.f22497a;
        ArrayList arrayList = realConnection.f22619H;
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (l.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i7);
        this.f22603w = null;
        if (arrayList.isEmpty()) {
            realConnection.f22620I = System.nanoTime();
            RealConnectionPool realConnectionPool = this.f22597c;
            realConnectionPool.getClass();
            TimeZone timeZone2 = _UtilJvmKt.f22497a;
            if (realConnection.f22613B || realConnectionPool.f22633a == 0) {
                realConnection.f22613B = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = realConnectionPool.g;
                concurrentLinkedQueue.remove(realConnection);
                if (concurrentLinkedQueue.isEmpty()) {
                    TaskQueue taskQueue = realConnectionPool.f22637e;
                    synchronized (taskQueue.f22511a) {
                        if (taskQueue.a()) {
                            taskQueue.f22511a.c(taskQueue);
                        }
                    }
                }
                Address address = realConnection.f22623d.f22470a;
                l.e(address, "address");
                RealConnectionPool.AddressState addressState = (RealConnectionPool.AddressState) realConnectionPool.f22636d.get(address);
                if (addressState == null) {
                    return realConnection.f22625f;
                }
                realConnectionPool.b(addressState);
                throw null;
            }
            realConnectionPool.f22637e.c(realConnectionPool.f22638f, 0L);
        }
        return null;
    }
}
