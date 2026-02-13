package zc;

/* loaded from: classes2.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final Class f28396a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28397b;

    public s(Class cls, String str) {
        this.f28396a = cls;
        this.f28397b = "::".concat(str);
    }

    @Override // zc.p
    public final int a() {
        return 1;
    }

    @Override // zc.t
    public final boolean g(xc.q qVar) {
        return this.f28396a.isInstance(qVar);
    }

    public final String toString() {
        return this.f28397b;
    }
}
