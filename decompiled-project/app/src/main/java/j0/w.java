package j0;

/* loaded from: classes.dex */
public final class w extends AbstractC1362A {

    /* renamed from: e, reason: collision with root package name */
    public final i0.c f18560e;

    public w(i0.c cVar) {
        this.f18560e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return kotlin.jvm.internal.l.a(this.f18560e, ((w) obj).f18560e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18560e.hashCode();
    }

    @Override // j0.AbstractC1362A
    public final i0.c p() {
        return this.f18560e;
    }
}
