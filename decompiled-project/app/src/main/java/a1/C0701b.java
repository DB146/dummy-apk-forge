package a1;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701b extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12451a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0701b(String str, int i7) {
        super(str);
        this.f12451a = i7;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i7 = this.f12451a;
        synchronized (this) {
            switch (i7) {
                case 0:
                    return this;
                default:
                    return this;
            }
        }
    }
}
