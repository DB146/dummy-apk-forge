package Z9;

import sb.C2010d;

/* renamed from: Z9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0666c implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2010d f12257b;

    public /* synthetic */ C0666c(C2010d c2010d, int i7) {
        this.f12256a = i7;
        this.f12257b = c2010d;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        switch (this.f12256a) {
            case 0:
                kotlin.jvm.internal.l.e(it, "it");
                this.f12257b.onError(it);
                return Db.q.f3365a;
            case 1:
                kotlin.jvm.internal.l.e(it, "it");
                this.f12257b.onError(it);
                return Db.q.f3365a;
            default:
                kotlin.jvm.internal.l.e(it, "it");
                this.f12257b.onError(it);
                return Db.q.f3365a;
        }
    }
}
