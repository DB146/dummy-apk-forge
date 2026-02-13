package a4;

/* renamed from: a4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763n extends AbstractC0774y {

    /* renamed from: a, reason: collision with root package name */
    public final C0761l f12667a;

    public C0763n(C0761l c0761l) {
        this.f12667a = c0761l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0774y)) {
            return false;
        }
        AbstractC0774y abstractC0774y = (AbstractC0774y) obj;
        Object obj2 = EnumC0773x.f12690a;
        ((C0763n) abstractC0774y).getClass();
        return obj2.equals(obj2) && this.f12667a.equals(((C0763n) abstractC0774y).f12667a);
    }

    public final int hashCode() {
        return ((EnumC0773x.f12690a.hashCode() ^ 1000003) * 1000003) ^ this.f12667a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC0773x.f12690a + ", androidClientInfo=" + this.f12667a + "}";
    }
}
