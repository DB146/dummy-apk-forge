package p7;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p f23135a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23136b;

    public g(p pVar, boolean z8) {
        this.f23135a = pVar;
        this.f23136b = z8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f23135a.equals(this.f23135a) && gVar.f23136b == this.f23136b;
    }

    public final int hashCode() {
        return ((this.f23135a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f23136b).hashCode();
    }
}
