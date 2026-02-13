package p9;

/* loaded from: classes2.dex */
public final class p extends j {

    /* renamed from: c, reason: collision with root package name */
    public boolean f23212c;

    @Override // p9.j
    public final P8.b b(P8.k kVar) {
        if (this.f23212c) {
            this.f23212c = false;
            return new P8.b(new V8.g(new P8.g(kVar)));
        }
        this.f23212c = true;
        return new P8.b(new V8.g(kVar));
    }
}
