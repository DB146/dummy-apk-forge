package mc;

import hc.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class j extends u {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceArray f20858e;

    public j(long j, j jVar, int i7) {
        super(j, jVar, i7);
        this.f20858e = new AtomicReferenceArray(i.f20857f);
    }

    @Override // hc.u
    public final int f() {
        return i.f20857f;
    }

    @Override // hc.u
    public final void g(int i7, Hb.i iVar) {
        this.f20858e.set(i7, i.f20856e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f17971c + ", hashCode=" + hashCode() + ']';
    }
}
