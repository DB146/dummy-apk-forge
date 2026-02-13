package okhttp3.internal.concurrent;

import Rb.a;
import h3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;

/* loaded from: classes2.dex */
public final class TaskQueue {

    /* renamed from: a, reason: collision with root package name */
    public final TaskRunner f22511a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22512b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22513c;

    /* renamed from: d, reason: collision with root package name */
    public Task f22514d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f22515e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22516f;

    /* loaded from: classes2.dex */
    public static final class AwaitIdleTask extends Task {

        /* renamed from: e, reason: collision with root package name */
        public final CountDownLatch f22517e;

        public AwaitIdleTask() {
            super(o.p(new StringBuilder(), _UtilJvmKt.f22498b, " awaitIdle"), false);
            this.f22517e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            this.f22517e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        l.e(taskRunner, "taskRunner");
        l.e(name, "name");
        this.f22511a = taskRunner;
        this.f22512b = name;
        this.f22515e = new ArrayList();
    }

    public static void b(TaskQueue taskQueue, final String name, final a block, int i7) {
        final boolean z8 = (i7 & 4) != 0;
        taskQueue.getClass();
        l.e(name, "name");
        l.e(block, "block");
        taskQueue.c(new Task(name, z8) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                block.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final boolean a() {
        Task task = this.f22514d;
        if (task != null && task.f22508b) {
            this.f22516f = true;
        }
        ArrayList arrayList = this.f22515e;
        boolean z8 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).f22508b) {
                Logger logger = this.f22511a.f22523b;
                Task task2 = (Task) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task2, this, "canceled");
                }
                arrayList.remove(size);
                z8 = true;
            }
        }
        return z8;
    }

    public final void c(Task task, long j) {
        l.e(task, "task");
        synchronized (this.f22511a) {
            if (!this.f22513c) {
                if (e(task, j, false)) {
                    this.f22511a.c(this);
                }
            } else if (task.f22508b) {
                Logger logger = this.f22511a.f22523b;
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f22511a.f22523b;
                if (logger2.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean e(Task task, long j, boolean z8) {
        l.e(task, "task");
        TaskQueue taskQueue = task.f22509c;
        if (taskQueue != this) {
            if (taskQueue != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.f22509c = this;
        }
        TaskRunner taskRunner = this.f22511a;
        TaskRunner.RealBackend realBackend = taskRunner.f22522a;
        long nanoTime = System.nanoTime();
        long j10 = nanoTime + j;
        ArrayList arrayList = this.f22515e;
        int indexOf = arrayList.indexOf(task);
        Logger logger = taskRunner.f22523b;
        if (indexOf != -1) {
            if (task.f22510d <= j10) {
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        task.f22510d = j10;
        if (logger.isLoggable(Level.FINE)) {
            TaskLoggerKt.a(logger, task, this, z8 ? "run again after ".concat(TaskLoggerKt.b(j10 - nanoTime)) : "scheduled after ".concat(TaskLoggerKt.b(j10 - nanoTime)));
        }
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (((Task) it.next()).f22510d - nanoTime > j) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            i7 = arrayList.size();
        }
        arrayList.add(i7, task);
        return i7 == 0;
    }

    public final void f() {
        TaskRunner taskRunner = this.f22511a;
        TimeZone timeZone = _UtilJvmKt.f22497a;
        synchronized (taskRunner) {
            this.f22513c = true;
            if (a()) {
                this.f22511a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f22512b;
    }
}
