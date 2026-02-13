package I7;

/* loaded from: classes.dex */
public final class g extends k {

    /* renamed from: e, reason: collision with root package name */
    public int f5244e;

    public g(Object obj, Object obj2, i iVar, i iVar2) {
        super(obj, obj2, iVar, iVar2);
        this.f5244e = -1;
    }

    @Override // I7.i
    public final boolean d() {
        return false;
    }

    @Override // I7.k
    public final k k(Object obj, Object obj2, i iVar, i iVar2) {
        if (obj == null) {
            obj = this.f5246a;
        }
        if (obj2 == null) {
            obj2 = this.f5247b;
        }
        if (iVar == null) {
            iVar = this.f5248c;
        }
        if (iVar2 == null) {
            iVar2 = this.f5249d;
        }
        return new g(obj, obj2, iVar, iVar2);
    }

    @Override // I7.k
    public final int n() {
        return 2;
    }

    @Override // I7.k
    public final void r(k kVar) {
        if (this.f5244e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f5248c = kVar;
    }

    @Override // I7.i
    public final int size() {
        if (this.f5244e == -1) {
            this.f5244e = this.f5249d.size() + this.f5248c.size() + 1;
        }
        return this.f5244e;
    }
}
