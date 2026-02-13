package A8;

/* loaded from: classes.dex */
public enum C implements c8.f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f538a;

    C(int i7) {
        this.f538a = i7;
    }

    @Override // c8.f
    public final int a() {
        return this.f538a;
    }
}
