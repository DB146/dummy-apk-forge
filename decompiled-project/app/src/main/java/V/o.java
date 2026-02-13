package V;

/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: d, reason: collision with root package name */
    public final g f9966d;

    public o(g gVar) {
        this.f9966d = gVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f9964c;
        this.f9964c = i7 + 2;
        Object[] objArr = this.f9962a;
        return new b(this.f9966d, objArr[i7], objArr[i7 + 1]);
    }
}
