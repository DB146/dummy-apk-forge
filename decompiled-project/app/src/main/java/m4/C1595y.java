package m4;

import n4.C1703a;

/* renamed from: m4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1595y implements n5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20523a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o5.w f20524b;

    public /* synthetic */ C1595y(C1703a c1703a, o5.w wVar) {
        this.f20524b = wVar;
    }

    public /* synthetic */ C1595y(o5.w wVar) {
        this.f20524b = wVar;
    }

    @Override // n5.i
    public final void invoke(Object obj) {
        switch (this.f20523a) {
            case 0:
                ((v0) obj).J(this.f20524b);
                return;
            default:
                n4.j jVar = (n4.j) obj;
                A4.s sVar = jVar.f21121o;
                o5.w wVar = this.f20524b;
                if (sVar != null) {
                    L l10 = (L) sVar.f471b;
                    if (l10.f20069F == -1) {
                        K a9 = l10.a();
                        a9.f19988p = wVar.f22048a;
                        a9.f19989q = wVar.f22049b;
                        jVar.f21121o = new A4.s(new L(a9), sVar.f470a, (String) sVar.f472c);
                    }
                }
                int i7 = wVar.f22048a;
                return;
        }
    }
}
