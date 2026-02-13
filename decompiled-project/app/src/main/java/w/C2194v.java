package w;

/* renamed from: w.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2194v {

    /* renamed from: a, reason: collision with root package name */
    public final c0.e f25618a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.m f25619b;

    /* renamed from: c, reason: collision with root package name */
    public final x.Q f25620c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2194v(c0.e eVar, Rb.c cVar, x.Q q10) {
        this.f25618a = eVar;
        this.f25619b = (kotlin.jvm.internal.m) cVar;
        this.f25620c = q10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2194v)) {
            return false;
        }
        C2194v c2194v = (C2194v) obj;
        return this.f25618a.equals(c2194v.f25618a) && this.f25619b.equals(c2194v.f25619b) && this.f25620c.equals(c2194v.f25620c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f25620c.hashCode() + ((this.f25619b.hashCode() + (this.f25618a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f25618a + ", size=" + this.f25619b + ", animationSpec=" + this.f25620c + ", clip=true)";
    }
}
