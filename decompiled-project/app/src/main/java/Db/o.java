package Db;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Rb.a f3361a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3362b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3363c;

    public o(Rb.a initializer) {
        kotlin.jvm.internal.l.e(initializer, "initializer");
        this.f3361a = initializer;
        this.f3362b = p.f3364a;
        this.f3363c = this;
    }

    @Override // Db.g
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f3362b;
        p pVar = p.f3364a;
        if (obj2 != pVar) {
            return obj2;
        }
        synchronized (this.f3363c) {
            obj = this.f3362b;
            if (obj == pVar) {
                Rb.a aVar = this.f3361a;
                kotlin.jvm.internal.l.b(aVar);
                obj = aVar.invoke();
                this.f3362b = obj;
                this.f3361a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f3362b != p.f3364a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
