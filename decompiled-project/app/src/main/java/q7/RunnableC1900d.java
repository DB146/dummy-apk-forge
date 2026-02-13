package q7;

import ia.C1358d;

/* renamed from: q7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1900d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC1901e f23529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f23530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1358d f23531d;

    public /* synthetic */ RunnableC1900d(ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e, Runnable runnable, C1358d c1358d, int i7) {
        this.f23528a = i7;
        this.f23529b = scheduledExecutorServiceC1901e;
        this.f23530c = runnable;
        this.f23531d = c1358d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23528a) {
            case 0:
                ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e = this.f23529b;
                final C1358d c1358d = this.f23531d;
                final Runnable runnable = this.f23530c;
                final int i7 = 0;
                scheduledExecutorServiceC1901e.f23532a.execute(new Runnable() { // from class: q7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC1903g) c1358d.f18487b).u(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC1903g) c1358d.f18487b).u(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC1903g scheduledFutureC1903g = (ScheduledFutureC1903g) c1358d.f18487b;
                                try {
                                    runnable2.run();
                                    scheduledFutureC1903g.t(null);
                                    return;
                                } catch (Exception e11) {
                                    scheduledFutureC1903g.u(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e2 = this.f23529b;
                final C1358d c1358d2 = this.f23531d;
                final Runnable runnable2 = this.f23530c;
                final int i10 = 2;
                scheduledExecutorServiceC1901e2.f23532a.execute(new Runnable() { // from class: q7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC1903g) c1358d2.f18487b).u(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC1903g) c1358d2.f18487b).u(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ScheduledFutureC1903g scheduledFutureC1903g = (ScheduledFutureC1903g) c1358d2.f18487b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC1903g.t(null);
                                    return;
                                } catch (Exception e11) {
                                    scheduledFutureC1903g.u(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e3 = this.f23529b;
                final C1358d c1358d3 = this.f23531d;
                final Runnable runnable3 = this.f23530c;
                final int i11 = 1;
                scheduledExecutorServiceC1901e3.f23532a.execute(new Runnable() { // from class: q7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC1903g) c1358d3.f18487b).u(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((ScheduledFutureC1903g) c1358d3.f18487b).u(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ScheduledFutureC1903g scheduledFutureC1903g = (ScheduledFutureC1903g) c1358d3.f18487b;
                                try {
                                    runnable22.run();
                                    scheduledFutureC1903g.t(null);
                                    return;
                                } catch (Exception e11) {
                                    scheduledFutureC1903g.u(e11);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
