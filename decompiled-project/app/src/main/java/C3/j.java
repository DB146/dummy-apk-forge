package C3;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2540a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2541b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2542c;

    public j(boolean z8, boolean z10, boolean z11) {
        this.f2540a = z8;
        this.f2541b = z10;
        this.f2542c = z11;
    }

    public boolean a() {
        return (this.f2542c || this.f2541b) && this.f2540a;
    }
}
