package T7;

import a.AbstractC0672a;

/* loaded from: classes.dex */
public final class d extends AbstractC0672a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f9332e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f9333f;
    public final /* synthetic */ f g;

    public d(f fVar, e eVar) {
        this.g = fVar;
        this.f9333f = eVar;
    }

    @Override // a.AbstractC0672a
    public final void w(Object obj, Object obj2) {
        c cVar = (c) obj;
        s sVar = (s) obj2;
        boolean z8 = this.f9332e;
        e eVar = this.f9333f;
        if (!z8) {
            c cVar2 = c.f9330d;
            if (cVar.compareTo(cVar2) > 0) {
                this.f9332e = true;
                eVar.y(cVar2, this.g.e());
            }
        }
        eVar.y(cVar, sVar);
    }
}
