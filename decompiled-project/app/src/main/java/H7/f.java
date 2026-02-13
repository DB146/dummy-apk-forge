package H7;

import J7.r;

/* loaded from: classes.dex */
public final class f implements Y6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f4907a;

    public f(r rVar) {
        this.f4907a = rVar;
    }

    @Override // Y6.f
    public final void a(boolean z8) {
        r rVar = this.f4907a;
        if (z8) {
            rVar.c("app_in_background");
        } else {
            rVar.h("app_in_background");
        }
    }
}
