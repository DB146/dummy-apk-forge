package j0;

/* loaded from: classes.dex */
public final class x extends AbstractC1362A {

    /* renamed from: e, reason: collision with root package name */
    public final i0.d f18561e;

    /* renamed from: f, reason: collision with root package name */
    public final C1368f f18562f;

    public x(i0.d dVar) {
        C1368f c1368f;
        this.f18561e = dVar;
        if (com.bumptech.glide.c.H(dVar)) {
            c1368f = null;
        } else {
            c1368f = h.a();
            z.a(c1368f, dVar);
        }
        this.f18562f = c1368f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return kotlin.jvm.internal.l.a(this.f18561e, ((x) obj).f18561e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18561e.hashCode();
    }

    @Override // j0.AbstractC1362A
    public final i0.c p() {
        i0.d dVar = this.f18561e;
        return new i0.c(dVar.f18178a, dVar.f18179b, dVar.f18180c, dVar.f18181d);
    }
}
