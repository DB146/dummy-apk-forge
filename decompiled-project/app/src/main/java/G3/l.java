package G3;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f4316a;

    public l(String str) {
        this.f4316a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f4316a.equals(((l) obj).f4316a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4316a.hashCode();
    }

    public final String toString() {
        return h3.o.p(new StringBuilder("StringHeaderFactory{value='"), this.f4316a, "'}");
    }
}
