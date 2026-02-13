package M6;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class r implements q, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final q f6815a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient boolean f6816b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object f6817c;

    public r(q qVar) {
        this.f6815a = qVar;
    }

    @Override // M6.q
    public final Object get() {
        if (!this.f6816b) {
            synchronized (this) {
                try {
                    if (!this.f6816b) {
                        Object obj = this.f6815a.get();
                        this.f6817c = obj;
                        this.f6816b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f6817c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f6816b) {
            obj = "<supplier that returned " + this.f6817c + ">";
        } else {
            obj = this.f6815a;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
