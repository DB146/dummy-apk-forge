package va;

import W1.C0558a;
import W1.U;

/* renamed from: va.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2157a implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2159c f25304b;

    public /* synthetic */ C2157a(C2159c c2159c, int i7) {
        this.f25303a = i7;
        this.f25304b = c2159c;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f25303a) {
            case 0:
                this.f25304b.f25310F0.invoke();
                return Db.q.f3365a;
            case 1:
                C2159c c2159c = this.f25304b;
                U j = c2159c.g0().j();
                j.getClass();
                C0558a c0558a = new C0558a(j);
                c0558a.i(c2159c);
                c0558a.e(false);
                return Db.q.f3365a;
            default:
                C2159c c2159c2 = this.f25304b;
                U j10 = c2159c2.g0().j();
                j10.getClass();
                C0558a c0558a2 = new C0558a(j10);
                c0558a2.i(c2159c2);
                c0558a2.e(false);
                return Db.q.f3365a;
        }
    }
}
