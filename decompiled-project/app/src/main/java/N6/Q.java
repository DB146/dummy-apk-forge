package N6;

/* loaded from: classes.dex */
public abstract class Q implements U {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7247b;

    public Q(Object obj, int i7) {
        this.f7246a = obj;
        this.f7247b = i7;
    }

    @Override // N6.U
    public final int c() {
        return this.f7247b;
    }

    @Override // N6.U
    public U d() {
        return null;
    }

    @Override // N6.U
    public final Object getKey() {
        return this.f7246a;
    }
}
