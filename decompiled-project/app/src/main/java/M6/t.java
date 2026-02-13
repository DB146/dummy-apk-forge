package M6;

/* loaded from: classes.dex */
public final class t implements q {

    /* renamed from: c, reason: collision with root package name */
    public static final s f6819c = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public volatile q f6820a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6821b;

    @Override // M6.q
    public final Object get() {
        q qVar = this.f6820a;
        s sVar = f6819c;
        if (qVar != sVar) {
            synchronized (this) {
                try {
                    if (this.f6820a != sVar) {
                        Object obj = this.f6820a.get();
                        this.f6821b = obj;
                        this.f6820a = sVar;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f6821b;
    }

    public final String toString() {
        Object obj = this.f6820a;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == f6819c) {
            obj = "<supplier that returned " + this.f6821b + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
