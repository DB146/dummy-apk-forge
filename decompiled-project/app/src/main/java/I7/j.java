package I7;

/* loaded from: classes.dex */
public final class j extends k {
    @Override // I7.i
    public final boolean d() {
        return true;
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
        return new k(obj, obj2, iVar, iVar2);
    }

    @Override // I7.k
    public final int n() {
        return 1;
    }

    @Override // I7.i
    public final int size() {
        return this.f5249d.size() + this.f5248c.size() + 1;
    }
}
