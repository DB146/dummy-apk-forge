package m4;

import n4.C1703a;

/* renamed from: m4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1591u implements n5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20506a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20507b;

    public /* synthetic */ C1591u(int i7) {
        this.f20507b = i7;
    }

    public /* synthetic */ C1591u(C1703a c1703a, int i7, w0 w0Var, w0 w0Var2) {
        this.f20507b = i7;
    }

    @Override // n5.i
    public final void invoke(Object obj) {
        switch (this.f20506a) {
            case 0:
                ((v0) obj).l(this.f20507b);
                return;
            default:
                n4.j jVar = (n4.j) obj;
                jVar.getClass();
                int i7 = this.f20507b;
                if (i7 == 1) {
                    jVar.f21127u = true;
                }
                jVar.k = i7;
                return;
        }
    }
}
