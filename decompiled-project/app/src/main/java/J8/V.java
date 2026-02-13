package J8;

/* loaded from: classes.dex */
public final class V implements G8.A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f5657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f5658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G8.z f5659c;

    public V(Class cls, Class cls2, G8.z zVar) {
        this.f5657a = cls;
        this.f5658b = cls2;
        this.f5659c = zVar;
    }

    @Override // G8.A
    public final G8.z a(G8.m mVar, N8.a aVar) {
        Class cls = this.f5657a;
        Class cls2 = aVar.f7386a;
        if (cls2 == cls || cls2 == this.f5658b) {
            return this.f5659c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f5658b.getName() + "+" + this.f5657a.getName() + ",adapter=" + this.f5659c + "]";
    }
}
