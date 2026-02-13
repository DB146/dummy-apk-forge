package L7;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class m extends T7.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q3.e f6370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HashMap f6371f;
    public final /* synthetic */ D5.i g;

    public m(q3.e eVar, HashMap hashMap, D5.i iVar) {
        this.f6370e = eVar;
        this.f6371f = hashMap;
        this.g = iVar;
    }

    @Override // T7.e
    public final void y(T7.c cVar, T7.s sVar) {
        T7.s Z7 = com.bumptech.glide.c.Z(sVar, this.f6370e.n(cVar), this.f6371f);
        if (Z7 != sVar) {
            C0385e c0385e = new C0385e(cVar.f9331a);
            D5.i iVar = this.g;
            iVar.f3256b = ((T7.s) iVar.f3256b).l(c0385e, Z7);
        }
    }
}
