package V2;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final f f10002a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f10003b;

    public e(f fVar, Throwable th) {
        super(th);
        this.f10002a = fVar;
        this.f10003b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f10003b;
    }
}
