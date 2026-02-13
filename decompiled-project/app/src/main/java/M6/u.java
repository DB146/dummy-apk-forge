package M6;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u implements q, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6822a;

    public u(Object obj) {
        this.f6822a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return O5.b.o(this.f6822a, ((u) obj).f6822a);
        }
        return false;
    }

    @Override // M6.q
    public final Object get() {
        return this.f6822a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6822a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f6822a + ")";
    }
}
