package u;

/* loaded from: classes.dex */
public final class V extends Eb.z {

    /* renamed from: a, reason: collision with root package name */
    public int f24642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f24643b;

    public V(U u3) {
        this.f24643b = u3;
    }

    @Override // Eb.z
    public final int a() {
        int i7 = this.f24642a;
        this.f24642a = i7 + 1;
        return this.f24643b.d(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24642a < this.f24643b.f();
    }
}
