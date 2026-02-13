package L7;

/* renamed from: L7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0383c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J7.a f6327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6328c;

    public /* synthetic */ RunnableC0383c(J7.a aVar, String str, int i7) {
        this.f6326a = i7;
        this.f6327b = aVar;
        this.f6328c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6326a) {
            case 0:
                this.f6327b.onSuccess(this.f6328c);
                return;
            default:
                this.f6327b.q(this.f6328c);
                return;
        }
    }
}
