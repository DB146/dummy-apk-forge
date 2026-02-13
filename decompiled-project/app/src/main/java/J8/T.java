package J8;

/* loaded from: classes.dex */
public final class T implements G8.A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f5655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G8.z f5656c;

    public /* synthetic */ T(Class cls, G8.z zVar, int i7) {
        this.f5654a = i7;
        this.f5655b = cls;
        this.f5656c = zVar;
    }

    @Override // G8.A
    public final G8.z a(G8.m mVar, N8.a aVar) {
        switch (this.f5654a) {
            case 0:
                if (aVar.f7386a == this.f5655b) {
                    return this.f5656c;
                }
                return null;
            default:
                Class cls = this.f5655b;
                Class<?> cls2 = aVar.f7386a;
                if (cls.isAssignableFrom(cls2)) {
                    return new C0348c(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f5654a) {
            case 0:
                return "Factory[type=" + this.f5655b.getName() + ",adapter=" + this.f5656c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f5655b.getName() + ",adapter=" + this.f5656c + "]";
        }
    }
}
