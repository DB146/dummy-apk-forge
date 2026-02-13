package J7;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f5584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f5586c;

    public i(r rVar, Long l10, n nVar) {
        this.f5586c = rVar;
        this.f5584a = l10;
        this.f5585b = nVar;
    }

    @Override // J7.l
    public final void a(Map map) {
        r rVar = this.f5586c;
        ConcurrentHashMap concurrentHashMap = rVar.f5627o;
        Long l10 = this.f5584a;
        n nVar = (n) concurrentHashMap.get(l10);
        n nVar2 = this.f5585b;
        if (nVar == nVar2) {
            rVar.f5627o.remove(l10);
            nVar2.f5597b.a(map);
            return;
        }
        Q7.h hVar = rVar.f5637y;
        if (hVar.H()) {
            hVar.p("Ignoring on complete for get " + l10 + " because it was removed already.", null, new Object[0]);
        }
    }
}
