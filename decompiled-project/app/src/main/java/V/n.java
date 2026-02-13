package V;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9965d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9965d) {
            case 0:
                int i7 = this.f9964c;
                this.f9964c = i7 + 2;
                Object[] objArr = this.f9962a;
                return new a(0, objArr[i7], objArr[i7 + 1]);
            case 1:
                int i10 = this.f9964c;
                this.f9964c = i10 + 2;
                return this.f9962a[i10];
            default:
                int i11 = this.f9964c;
                this.f9964c = i11 + 2;
                return this.f9962a[i11 + 1];
        }
    }
}
