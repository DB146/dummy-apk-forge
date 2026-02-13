package Db;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class r implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Rb.a f3366a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3367b;

    @Override // Db.g
    public final Object getValue() {
        if (this.f3367b == p.f3364a) {
            Rb.a aVar = this.f3366a;
            kotlin.jvm.internal.l.b(aVar);
            this.f3367b = aVar.invoke();
            this.f3366a = null;
        }
        return this.f3367b;
    }

    public final String toString() {
        return this.f3367b != p.f3364a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
