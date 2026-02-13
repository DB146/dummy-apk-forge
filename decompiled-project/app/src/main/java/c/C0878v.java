package c;

/* renamed from: c.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878v extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0853A f14074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0878v(C0853A c0853a, int i7) {
        super(0);
        this.f14073a = i7;
        this.f14074b = c0853a;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f14073a) {
            case 0:
                this.f14074b.c();
                return Db.q.f3365a;
            case 1:
                this.f14074b.b();
                return Db.q.f3365a;
            default:
                this.f14074b.c();
                return Db.q.f3365a;
        }
    }
}
