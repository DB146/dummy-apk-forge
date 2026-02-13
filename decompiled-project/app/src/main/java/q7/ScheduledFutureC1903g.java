package q7;

import a1.AbstractC0707h;
import a1.C0700a;
import ia.C1358d;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: q7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledFutureC1903g extends AbstractC0707h implements ScheduledFuture {

    /* renamed from: v, reason: collision with root package name */
    public final ScheduledFuture f23534v;

    public ScheduledFutureC1903g(InterfaceC1902f interfaceC1902f) {
        this.f23534v = interfaceC1902f.a(new C1358d(this, 12));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f23534v.compareTo(delayed);
    }

    @Override // a1.AbstractC0707h
    public final void d() {
        ScheduledFuture scheduledFuture = this.f23534v;
        Object obj = this.f12468a;
        scheduledFuture.cancel((obj instanceof C0700a) && ((C0700a) obj).f12449a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f23534v.getDelay(timeUnit);
    }
}
