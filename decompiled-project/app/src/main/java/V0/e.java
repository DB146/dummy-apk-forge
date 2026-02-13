package V0;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f9970a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9971b;

    /* renamed from: c, reason: collision with root package name */
    public final W0.a f9972c;

    public e(float f4, float f10, W0.a aVar) {
        this.f9970a = f4;
        this.f9971b = f10;
        this.f9972c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f9970a, eVar.f9970a) == 0 && Float.compare(this.f9971b, eVar.f9971b) == 0 && kotlin.jvm.internal.l.a(this.f9972c, eVar.f9972c);
    }

    @Override // V0.c
    public final float f() {
        return this.f9971b;
    }

    public final int hashCode() {
        return this.f9972c.hashCode() + h3.o.e(this.f9971b, Float.hashCode(this.f9970a) * 31, 31);
    }

    @Override // V0.c
    public final float k() {
        return this.f9970a;
    }

    @Override // V0.c
    public final long n(float f4) {
        return android.support.v4.media.session.b.B(4294967296L, this.f9972c.a(f4));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f9970a + ", fontScale=" + this.f9971b + ", converter=" + this.f9972c + ')';
    }

    @Override // V0.c
    public final float y(long j) {
        if (o.a(n.b(j), 4294967296L)) {
            return this.f9972c.b(n.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
