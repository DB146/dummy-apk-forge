package cc;

/* renamed from: cc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0926d extends AbstractC0940k {

    /* renamed from: a, reason: collision with root package name */
    public final C0924c[] f14525a;

    public C0926d(C0924c[] c0924cArr) {
        this.f14525a = c0924cArr;
    }

    @Override // cc.AbstractC0940k
    public final void b(Throwable th) {
        c();
    }

    public final void c() {
        for (C0924c c0924c : this.f14525a) {
            S s3 = c0924c.f14522f;
            if (s3 == null) {
                kotlin.jvm.internal.l.j("handle");
                throw null;
            }
            s3.b();
        }
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        c();
        return Db.q.f3365a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f14525a + ']';
    }
}
