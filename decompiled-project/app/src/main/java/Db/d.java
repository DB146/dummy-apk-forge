package Db;

/* loaded from: classes2.dex */
public class d extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f3349a = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, String str, Throwable th) {
        super(str, th);
        this.f3349a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, Throwable th) {
        super(th);
        this.f3349a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, int i7) {
        super(str);
        this.f3349a = i7;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f3349a) {
            case 10:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
