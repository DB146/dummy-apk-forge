package q7;

import ia.C1358d;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: q7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1899c implements InterfaceC1902f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC1901e f23523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f23524c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f23526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f23527f;

    public /* synthetic */ C1899c(ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e, Runnable runnable, long j, long j10, TimeUnit timeUnit, int i7) {
        this.f23522a = i7;
        this.f23523b = scheduledExecutorServiceC1901e;
        this.f23524c = runnable;
        this.f23525d = j;
        this.f23526e = j10;
        this.f23527f = timeUnit;
    }

    @Override // q7.InterfaceC1902f
    public final ScheduledFuture a(C1358d c1358d) {
        switch (this.f23522a) {
            case 0:
                ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e = this.f23523b;
                return scheduledExecutorServiceC1901e.f23533b.scheduleAtFixedRate(new RunnableC1900d(scheduledExecutorServiceC1901e, this.f23524c, c1358d, 0), this.f23525d, this.f23526e, this.f23527f);
            default:
                ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e2 = this.f23523b;
                return scheduledExecutorServiceC1901e2.f23533b.scheduleWithFixedDelay(new RunnableC1900d(scheduledExecutorServiceC1901e2, this.f23524c, c1358d, 2), this.f23525d, this.f23526e, this.f23527f);
        }
    }
}
