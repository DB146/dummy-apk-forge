package tb;

import gb.p;
import gb.q;
import java.util.concurrent.TimeUnit;
import kb.C1436a;
import l2.X;
import vb.C2170d;

/* loaded from: classes2.dex */
public final class c extends p {

    /* renamed from: a, reason: collision with root package name */
    public final b f24527a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24528b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f24529c;

    /* renamed from: d, reason: collision with root package name */
    public final C2170d f24530d;

    public c(b bVar, long j, TimeUnit timeUnit, C2170d c2170d) {
        this.f24527a = bVar;
        this.f24528b = j;
        this.f24529c = timeUnit;
        this.f24530d = c2170d;
    }

    @Override // gb.p
    public final void e(q qVar) {
        C1436a c1436a = new C1436a();
        qVar.c(c1436a);
        this.f24527a.d(new X(this, c1436a, qVar));
    }
}
