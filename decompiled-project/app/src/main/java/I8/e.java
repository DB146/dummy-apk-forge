package I8;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e implements GenericArrayType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f5271a;

    public e(Type type) {
        Objects.requireNonNull(type);
        this.f5271a = h.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && h.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f5271a;
    }

    public final int hashCode() {
        return this.f5271a.hashCode();
    }

    public final String toString() {
        return h.k(this.f5271a) + "[]";
    }
}
