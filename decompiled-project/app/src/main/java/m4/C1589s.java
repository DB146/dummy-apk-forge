package m4;

import yc.InterfaceC2478a;

/* renamed from: m4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1589s implements n5.i, InterfaceC2478a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f20499b;

    public /* synthetic */ C1589s(int i7, boolean z8) {
        this.f20498a = i7;
        this.f20499b = z8;
    }

    @Override // yc.InterfaceC2478a
    public boolean b(char c10) {
        return (c10 == 0 || c10 == '&' || (!this.f20499b ? c10 != '\"' : c10 != '\'')) ? false : true;
    }

    @Override // n5.i
    public void invoke(Object obj) {
        v0 v0Var = (v0) obj;
        switch (this.f20498a) {
            case 0:
                v0Var.z(this.f20499b);
                return;
            default:
                v0Var.p(this.f20499b);
                return;
        }
    }
}
