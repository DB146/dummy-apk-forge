package n5;

import A9.O;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21178a;

    /* renamed from: b, reason: collision with root package name */
    public O f21179b = new O(6);

    /* renamed from: c, reason: collision with root package name */
    public boolean f21180c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21181d;

    public k(Object obj) {
        this.f21178a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return this.f21178a.equals(((k) obj).f21178a);
    }

    public final int hashCode() {
        return this.f21178a.hashCode();
    }
}
