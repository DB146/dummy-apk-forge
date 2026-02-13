package L9;

/* loaded from: classes2.dex */
public final class d extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6427a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i7) {
        super("NetworkExceptions with error code: 1001");
        this.f6427a = i7;
        switch (i7) {
            case 1:
                super("Gặp sự cố khi tải trang");
                this.f6428b = "Gặp sự cố khi tải trang";
                return;
            default:
                this.f6428b = "NetworkExceptions with error code: 1001";
                return;
        }
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f6427a) {
            case 0:
                return null;
            default:
                return super.getCause();
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f6427a) {
            case 0:
                return this.f6428b;
            default:
                return this.f6428b;
        }
    }
}
