package H0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f4466b = new e(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final Xb.d f4467a;

    public e(Xb.d dVar) {
        this.f4467a = dVar;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final Xb.d a() {
        return this.f4467a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        return this.f4467a.equals(eVar.f4467a);
    }

    public final int hashCode() {
        return (this.f4467a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f4467a + ", steps=0)";
    }
}
