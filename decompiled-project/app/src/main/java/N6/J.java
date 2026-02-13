package N6;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7234a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7235b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7236c;

    public J(Object obj, Object obj2, Object obj3) {
        this.f7234a = obj;
        this.f7235b = obj2;
        this.f7236c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f7234a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f7235b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f7236c);
        return new IllegalArgumentException(sb2.toString());
    }
}
