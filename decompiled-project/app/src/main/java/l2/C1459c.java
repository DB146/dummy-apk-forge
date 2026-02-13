package l2;

import java.lang.reflect.Method;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459c {

    /* renamed from: a, reason: collision with root package name */
    public final int f19203a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f19204b;

    public C1459c(Method method, int i7) {
        this.f19203a = i7;
        this.f19204b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1459c)) {
            return false;
        }
        C1459c c1459c = (C1459c) obj;
        return this.f19203a == c1459c.f19203a && this.f19204b.getName().equals(c1459c.f19204b.getName());
    }

    public final int hashCode() {
        return this.f19204b.getName().hashCode() + (this.f19203a * 31);
    }
}
