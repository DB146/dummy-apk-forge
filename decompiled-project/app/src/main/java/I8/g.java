package I8;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g implements WildcardType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f5275a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f5276b;

    public g(Type[] typeArr, Type[] typeArr2) {
        h.b(typeArr2.length <= 1);
        h.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            h.c(typeArr[0]);
            this.f5276b = null;
            this.f5275a = h.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        h.c(typeArr2[0]);
        h.b(typeArr[0] == Object.class);
        this.f5276b = h.a(typeArr2[0]);
        this.f5275a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && h.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f5276b;
        return type != null ? new Type[]{type} : h.f5277a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f5275a};
    }

    public final int hashCode() {
        Type type = this.f5276b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f5275a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f5276b;
        if (type != null) {
            return "? super " + h.k(type);
        }
        Type type2 = this.f5275a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + h.k(type2);
    }
}
