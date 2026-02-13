package okhttp3.internal.concurrent;

import com.google.android.gms.common.api.f;
import h3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import oc.a;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;

/* loaded from: classes2.dex */
public final class TaskRunner implements Lockable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f22520y;

    /* renamed from: z, reason: collision with root package name */
    public static final TaskRunner f22521z;

    /* renamed from: a, reason: collision with root package name */
    public final RealBackend f22522a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f22523b;

    /* renamed from: c, reason: collision with root package name */
    public int f22524c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22525d;

    /* renamed from: e, reason: collision with root package name */
    public long f22526e;

    /* renamed from: f, reason: collision with root package name */
    public int f22527f;

    /* renamed from: u, reason: collision with root package name */
    public int f22528u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f22529v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f22530w;

    /* renamed from: x, reason: collision with root package name */
    public final TaskRunner$runnable$1 f22531x;

    /* loaded from: classes2.dex */
    public interface Backend {
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class RealBackend implements Backend {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f22532a;

        public RealBackend(a aVar) {
            this.f22532a = new ThreadPoolExecutor(0, f.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        }
    }

    static {
        new Companion(0);
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        l.d(logger, "getLogger(...)");
        f22520y = logger;
        String name = _UtilJvmKt.f22498b + " TaskRunner";
        l.e(name, "name");
        f22521z = new TaskRunner(new RealBackend(new a(name, true)));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        Logger logger = f22520y;
        l.e(logger, "logger");
        this.f22522a = realBackend;
        this.f22523b = logger;
        this.f22524c = 10000;
        this.f22529v = new ArrayList();
        this.f22530w = new ArrayList();
        this.f22531x = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Task b2;
                long j;
                Task b10;
                TaskRunner taskRunner = TaskRunner.this;
                synchronized (taskRunner) {
                    taskRunner.f22528u++;
                    b2 = taskRunner.b();
                }
                if (b2 == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                while (true) {
                    try {
                        currentThread.setName(b2.f22507a);
                        Logger logger2 = TaskRunner.this.f22523b;
                        TaskQueue taskQueue = b2.f22509c;
                        l.b(taskQueue);
                        boolean isLoggable = logger2.isLoggable(Level.FINE);
                        if (isLoggable) {
                            TaskRunner.RealBackend realBackend2 = taskQueue.f22511a.f22522a;
                            j = System.nanoTime();
                            TaskLoggerKt.a(logger2, b2, taskQueue, "starting");
                        } else {
                            j = -1;
                        }
                        try {
                            long a9 = b2.a();
                            if (isLoggable) {
                                TaskRunner.RealBackend realBackend3 = taskQueue.f22511a.f22522a;
                                TaskLoggerKt.a(logger2, b2, taskQueue, "finished run in " + TaskLoggerKt.b(System.nanoTime() - j));
                            }
                            TaskRunner taskRunner2 = TaskRunner.this;
                            synchronized (taskRunner2) {
                                TaskRunner.a(taskRunner2, b2, a9, true);
                                b10 = taskRunner2.b();
                            }
                            if (b10 == null) {
                                currentThread.setName(name);
                                return;
                            }
                            b2 = b10;
                        } catch (Throwable th) {
                            if (isLoggable) {
                                TaskRunner.RealBackend realBackend4 = taskQueue.f22511a.f22522a;
                                TaskLoggerKt.a(logger2, b2, taskQueue, "failed a run in " + TaskLoggerKt.b(System.nanoTime() - j));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            TaskRunner taskRunner3 = TaskRunner.this;
                            synchronized (taskRunner3) {
                                TaskRunner.a(taskRunner3, b2, -1L, false);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            currentThread.setName(name);
                            throw th3;
                        }
                    }
                }
            }
        };
    }

    public static final void a(TaskRunner taskRunner, Task task, long j, boolean z8) {
        taskRunner.getClass();
        TimeZone timeZone = _UtilJvmKt.f22497a;
        TaskQueue taskQueue = task.f22509c;
        l.b(taskQueue);
        if (taskQueue.f22514d != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z10 = taskQueue.f22516f;
        taskQueue.f22516f = false;
        taskQueue.f22514d = null;
        taskRunner.f22529v.remove(taskQueue);
        if (j != -1 && !z10 && !taskQueue.f22513c) {
            taskQueue.e(task, j, true);
        }
        if (taskQueue.f22515e.isEmpty()) {
            return;
        }
        taskRunner.f22530w.add(taskQueue);
        if (z8) {
            return;
        }
        taskRunner.e();
    }

    public final Task b() {
        boolean z8;
        TimeZone timeZone = _UtilJvmKt.f22497a;
        while (true) {
            ArrayList arrayList = this.f22530w;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z8 = false;
                    break;
                }
                Task task2 = (Task) ((TaskQueue) it.next()).f22515e.get(0);
                long max = Math.max(0L, task2.f22510d - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else {
                    if (task != null) {
                        z8 = true;
                        break;
                    }
                    task = task2;
                }
            }
            ArrayList arrayList2 = this.f22529v;
            if (task != null) {
                TimeZone timeZone2 = _UtilJvmKt.f22497a;
                task.f22510d = -1L;
                TaskQueue taskQueue = task.f22509c;
                l.b(taskQueue);
                taskQueue.f22515e.remove(task);
                arrayList.remove(taskQueue);
                taskQueue.f22514d = task;
                arrayList2.add(taskQueue);
                if (z8 || (!this.f22525d && !arrayList.isEmpty())) {
                    e();
                }
                return task;
            }
            if (this.f22525d) {
                if (j < this.f22526e - nanoTime) {
                    notify();
                }
                return null;
            }
            this.f22525d = true;
            this.f22526e = nanoTime + j;
            try {
                try {
                    TimeZone timeZone3 = _UtilJvmKt.f22497a;
                    if (j > 0) {
                        long j10 = j / 1000000;
                        long j11 = j - (1000000 * j10);
                        if (j10 > 0 || j > 0) {
                            wait(j10, (int) j11);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = _UtilJvmKt.f22497a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((TaskQueue) arrayList2.get(size)).a();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size2);
                        taskQueue2.a();
                        if (taskQueue2.f22515e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f22525d = false;
            }
        }
    }

    public final void c(TaskQueue taskQueue) {
        l.e(taskQueue, "taskQueue");
        TimeZone timeZone = _UtilJvmKt.f22497a;
        if (taskQueue.f22514d == null) {
            boolean isEmpty = taskQueue.f22515e.isEmpty();
            ArrayList arrayList = this.f22530w;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = _UtilCommonKt.f22495a;
                l.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f22525d) {
            notify();
        } else {
            e();
        }
    }

    public final TaskQueue d() {
        int i7;
        synchronized (this) {
            i7 = this.f22524c;
            this.f22524c = i7 + 1;
        }
        return new TaskQueue(this, o.l(i7, "Q"));
    }

    public final void e() {
        TimeZone timeZone = _UtilJvmKt.f22497a;
        int i7 = this.f22527f;
        if (i7 > this.f22528u) {
            return;
        }
        this.f22527f = i7 + 1;
        RealBackend realBackend = this.f22522a;
        TaskRunner$runnable$1 runnable = this.f22531x;
        l.e(runnable, "runnable");
        realBackend.f22532a.execute(runnable);
    }
}
