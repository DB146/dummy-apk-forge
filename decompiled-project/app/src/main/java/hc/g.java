package hc;

/* loaded from: classes2.dex */
public final class g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient Hb.i f17941a;

    public g(Hb.i iVar) {
        this.f17941a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f17941a.toString();
    }
}
