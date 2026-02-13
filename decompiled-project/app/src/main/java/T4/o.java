package T4;

import java.util.List;

/* loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        super(jVar, j, j10, j11, j12, list, j13, j14, j15);
        this.j = list2;
    }

    @Override // T4.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // T4.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.f9297d));
    }

    @Override // T4.n
    public final boolean i() {
        return true;
    }
}
