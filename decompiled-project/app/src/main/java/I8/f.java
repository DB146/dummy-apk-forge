package I8;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f implements ParameterizedType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f5272a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f5273b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f5274c;

    public f(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f5272a = type == null ? null : h.a(type);
        this.f5273b = h.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f5274c = typeArr2;
        int length = typeArr2.length;
        for (int i7 = 0; i7 < length; i7++) {
            Objects.requireNonNull(this.f5274c[i7]);
            h.c(this.f5274c[i7]);
            Type[] typeArr3 = this.f5274c;
            typeArr3[i7] = h.a(typeArr3[i7]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && h.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f5274c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f5272a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f5273b;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f5274c) ^ this.f5273b.hashCode();
        Type type = this.f5272a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f5274c;
        int length = typeArr.length;
        Type type = this.f5273b;
        if (length == 0) {
            return h.k(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(h.k(type));
        sb2.append("<");
        sb2.append(h.k(typeArr[0]));
        for (int i7 = 1; i7 < length; i7++) {
            sb2.append(", ");
            sb2.append(h.k(typeArr[i7]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
