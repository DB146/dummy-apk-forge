package M9;

/* loaded from: classes2.dex */
public final class f extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6857a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i7) {
        super("Cannot retry");
        this.f6857a = i7;
        this.f6858b = "Cannot retry";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f6857a) {
            case 0:
                return this.f6858b;
            default:
                return this.f6858b;
        }
    }
}
