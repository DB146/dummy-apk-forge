package L7;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final long f6312a;

    /* renamed from: b, reason: collision with root package name */
    public final C0385e f6313b;

    /* renamed from: c, reason: collision with root package name */
    public final T7.s f6314c;

    /* renamed from: d, reason: collision with root package name */
    public final C0381a f6315d;

    public D(long j, C0385e c0385e, C0381a c0381a) {
        this.f6312a = j;
        this.f6313b = c0385e;
        this.f6314c = null;
        this.f6315d = c0381a;
    }

    public D(long j, C0385e c0385e, T7.s sVar) {
        this.f6312a = j;
        this.f6313b = c0385e;
        this.f6314c = sVar;
        this.f6315d = null;
    }

    public final C0381a a() {
        C0381a c0381a = this.f6315d;
        if (c0381a != null) {
            return c0381a;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public final T7.s b() {
        T7.s sVar = this.f6314c;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public final boolean c() {
        return this.f6314c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d10 = (D) obj;
        if (this.f6312a != d10.f6312a || !this.f6313b.equals(d10.f6313b)) {
            return false;
        }
        T7.s sVar = d10.f6314c;
        T7.s sVar2 = this.f6314c;
        if (sVar2 == null ? sVar != null : !sVar2.equals(sVar)) {
            return false;
        }
        C0381a c0381a = d10.f6315d;
        C0381a c0381a2 = this.f6315d;
        return c0381a2 == null ? c0381a == null : c0381a2.equals(c0381a);
    }

    public final int hashCode() {
        int hashCode = (this.f6313b.hashCode() + ((Boolean.TRUE.hashCode() + (Long.valueOf(this.f6312a).hashCode() * 31)) * 31)) * 31;
        T7.s sVar = this.f6314c;
        int hashCode2 = (hashCode + (sVar != null ? sVar.hashCode() : 0)) * 31;
        C0381a c0381a = this.f6315d;
        return hashCode2 + (c0381a != null ? c0381a.hashCode() : 0);
    }

    public final String toString() {
        return "UserWriteRecord{id=" + this.f6312a + " path=" + this.f6313b + " visible=true overwrite=" + this.f6314c + " merge=" + this.f6315d + "}";
    }
}
