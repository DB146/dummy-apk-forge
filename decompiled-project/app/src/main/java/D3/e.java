package D3;

/* loaded from: classes.dex */
public final class e extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3172b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7) {
        super(1);
        this.f3172b = i7;
    }

    public final h K() {
        switch (this.f3172b) {
            case 0:
                return new d(this);
            default:
                return new j(this);
        }
    }
}
