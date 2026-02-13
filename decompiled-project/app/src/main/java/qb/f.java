package qb;

import java.util.concurrent.TimeUnit;
import vb.C2170d;

/* loaded from: classes2.dex */
public final class f extends AbstractC1909a {

    /* renamed from: b, reason: collision with root package name */
    public final long f23606b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f23607c;

    /* renamed from: d, reason: collision with root package name */
    public final C2170d f23608d;

    public f(r rVar, long j, TimeUnit timeUnit, C2170d c2170d) {
        super(rVar);
        this.f23606b = j;
        this.f23607c = timeUnit;
        this.f23608d = c2170d;
    }

    @Override // gb.f
    public final void c(gb.g gVar) {
        this.f23591a.b(new e(gVar, this.f23606b, this.f23607c, this.f23608d));
    }
}
