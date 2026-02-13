package m4;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final n5.f f20508a;

    public u0(n5.f fVar) {
        this.f20508a = fVar;
    }

    public final boolean a(int... iArr) {
        n5.f fVar = this.f20508a;
        for (int i7 : iArr) {
            if (fVar.f21175a.get(i7)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            return this.f20508a.equals(((u0) obj).f20508a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20508a.hashCode();
    }
}
