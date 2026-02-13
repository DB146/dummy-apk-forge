package Y5;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: Y5.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634m0 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f11835a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11836b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0640o0 f11838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634m0(C0640o0 c0640o0, Runnable runnable, boolean z8, String str) {
        super(runnable, null);
        Objects.requireNonNull(c0640o0);
        this.f11838d = c0640o0;
        long andIncrement = C0640o0.f11863y.getAndIncrement();
        this.f11835a = andIncrement;
        this.f11837c = str;
        this.f11836b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            W w10 = ((C0646q0) c0640o0.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634m0(C0640o0 c0640o0, Callable callable, boolean z8) {
        super(callable);
        Objects.requireNonNull(c0640o0);
        this.f11838d = c0640o0;
        long andIncrement = C0640o0.f11863y.getAndIncrement();
        this.f11835a = andIncrement;
        this.f11837c = "Task exception on worker thread";
        this.f11836b = z8;
        if (andIncrement == Long.MAX_VALUE) {
            W w10 = ((C0646q0) c0640o0.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0634m0 c0634m0 = (C0634m0) obj;
        boolean z8 = c0634m0.f11836b;
        boolean z10 = this.f11836b;
        if (z10 == z8) {
            long j = this.f11835a;
            long j10 = c0634m0.f11835a;
            if (j < j10) {
                return -1;
            }
            if (j <= j10) {
                W w10 = ((C0646q0) this.f11838d.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11578u.b(Long.valueOf(j), "Two tasks share the same index. index");
                return 0;
            }
        } else if (z10) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        W w10 = ((C0646q0) this.f11838d.f3094a).f11912f;
        C0646q0.l(w10);
        w10.f11577f.b(th, this.f11837c);
        super.setException(th);
    }
}
