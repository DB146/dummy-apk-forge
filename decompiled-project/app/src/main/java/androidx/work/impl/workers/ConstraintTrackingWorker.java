package androidx.work.impl.workers;

import A9.O0;
import E6.b;
import Ib.a;
import O3.c;
import Y5.J0;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cc.A;
import cc.F;
import h3.C1246h;
import h3.u;
import h3.x;
import h3.y;
import h3.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.l;
import q3.p;
import q3.q;
import t3.C2018a;
import t3.C2019b;
import t3.C2020c;
import t3.C2022e;
import t3.C2023f;
import t3.C2024g;
import t3.k;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        l.e(appContext, "appContext");
        l.e(workerParameters, "workerParameters");
        this.g = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(ConstraintTrackingWorker constraintTrackingWorker, y yVar, c cVar, p pVar, Jb.c cVar2) {
        C2020c c2020c;
        int i7;
        constraintTrackingWorker.getClass();
        if (cVar2 instanceof C2020c) {
            c2020c = (C2020c) cVar2;
            int i10 = c2020c.f24446c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2020c.f24446c = i10 - Integer.MIN_VALUE;
                Object obj = c2020c.f24444a;
                a aVar = a.f5345a;
                i7 = c2020c.f24446c;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    C2022e c2022e = new C2022e(yVar, cVar, pVar, null);
                    c2020c.f24446c = 1;
                    obj = F.k(c2022e, c2020c);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                l.d(obj, "delegate: ListenableWork….cancel()\n        }\n    }");
                return obj;
            }
        }
        c2020c = new C2020c(constraintTrackingWorker, cVar2);
        Object obj2 = c2020c.f24444a;
        a aVar2 = a.f5345a;
        i7 = c2020c.f24446c;
        if (i7 != 0) {
        }
        l.d(obj2, "delegate: ListenableWork….cancel()\n        }\n    }");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(ConstraintTrackingWorker constraintTrackingWorker, Jb.c cVar) {
        C2023f c2023f;
        int i7;
        y yVar;
        ConstraintTrackingWorker constraintTrackingWorker2;
        int i10;
        ConstraintTrackingWorker constraintTrackingWorker3 = constraintTrackingWorker;
        WorkerParameters workerParameters = constraintTrackingWorker3.g;
        if (cVar instanceof C2023f) {
            c2023f = (C2023f) cVar;
            int i11 = c2023f.f24463e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c2023f.f24463e = i11 - Integer.MIN_VALUE;
                C2023f c2023f2 = c2023f;
                Object obj = c2023f2.f24461c;
                a aVar = a.f5345a;
                i7 = c2023f2.f24463e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    WorkerParameters workerParameters2 = constraintTrackingWorker3.f17719b;
                    String b2 = workerParameters2.f13734b.b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                    if (b2 == null || b2.length() == 0) {
                        z.e().c(k.f24475a, "No worker to delegate to.");
                        return new u();
                    }
                    Context applicationContext = constraintTrackingWorker3.f17718a;
                    i3.p N10 = i3.p.N(applicationContext);
                    l.d(N10, "getInstance(applicationContext)");
                    q C2 = N10.f18380d.C();
                    String uuid = workerParameters2.f13733a.toString();
                    l.d(uuid, "id.toString()");
                    p h10 = C2.h(uuid);
                    if (h10 == null) {
                        return new u();
                    }
                    O0 o02 = N10.k;
                    l.d(o02, "workManagerImpl.trackers");
                    c cVar2 = new c(o02);
                    if (!cVar2.c(h10)) {
                        String str = k.f24475a;
                        z.e().a(str, "Constraints not met for delegate " + b2 + ". Requesting retry.");
                        return new Object();
                    }
                    z.e().a(k.f24475a, "Constraints met for delegate ".concat(b2));
                    try {
                        b bVar = workerParameters2.f13738f;
                        l.d(applicationContext, "applicationContext");
                        y j = bVar.j(applicationContext, b2, workerParameters);
                        J0 j02 = (J0) workerParameters.f13737e.f23385d;
                        l.d(j02, "workerParameters.taskExecutor.mainThreadExecutor");
                        try {
                            A o10 = F.o(j02);
                            C2024g c2024g = new C2024g(constraintTrackingWorker, j, cVar2, h10, null);
                            c2023f2.f24459a = constraintTrackingWorker3;
                            c2023f2.f24460b = j;
                            c2023f2.f24463e = 1;
                            obj = F.K(o10, c2024g, c2023f2);
                            if (obj == aVar) {
                                return aVar;
                            }
                            constraintTrackingWorker2 = constraintTrackingWorker3;
                            yVar = j;
                        } catch (CancellationException e2) {
                            e = e2;
                            yVar = j;
                            if (constraintTrackingWorker3.f17720c.get() == -256 || (e instanceof C2018a)) {
                                if (Build.VERSION.SDK_INT >= 31) {
                                    i10 = -512;
                                } else {
                                    AtomicInteger atomicInteger = constraintTrackingWorker3.f17720c;
                                    if (atomicInteger.get() != -256) {
                                        i10 = atomicInteger.get();
                                    } else {
                                        if (!(e instanceof C2018a)) {
                                            throw new IllegalStateException("Unreachable");
                                        }
                                        i10 = ((C2018a) e).f24441a;
                                    }
                                }
                                yVar.f17720c.compareAndSet(-256, i10);
                            }
                            if (e instanceof C2018a) {
                                throw e;
                            }
                            return new Object();
                        }
                    } catch (Throwable unused) {
                        z.e().a(k.f24475a, "No worker to delegate to.");
                        N10.f18379c.getClass();
                        return new u();
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = c2023f2.f24460b;
                    constraintTrackingWorker2 = c2023f2.f24459a;
                    try {
                        com.bumptech.glide.c.c0(obj);
                    } catch (CancellationException e10) {
                        e = e10;
                        constraintTrackingWorker3 = constraintTrackingWorker2;
                        if (constraintTrackingWorker3.f17720c.get() == -256) {
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                        }
                        yVar.f17720c.compareAndSet(-256, i10);
                        if (e instanceof C2018a) {
                        }
                    }
                }
                return (x) obj;
            }
        }
        c2023f = new C2023f(constraintTrackingWorker, cVar);
        C2023f c2023f22 = c2023f;
        Object obj2 = c2023f22.f24461c;
        a aVar2 = a.f5345a;
        i7 = c2023f22.f24463e;
        if (i7 != 0) {
        }
        return (x) obj2;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(C1246h c1246h) {
        ExecutorService backgroundExecutor = this.f17719b.f13735c;
        l.d(backgroundExecutor, "backgroundExecutor");
        return F.K(F.o(backgroundExecutor), new C2019b(this, null), c1246h);
    }
}
