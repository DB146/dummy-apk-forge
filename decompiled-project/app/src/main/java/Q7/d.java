package Q7;

import O7.k;
import T7.l;
import T7.q;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f8678a;

    public d(i iVar) {
        this.f8678a = iVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        k.c((cVar.f8677d == null || cVar2.f8677d == null) ? false : true);
        return ((l) this.f8678a.f8699a).compare(new q(cVar.f8677d, cVar.f8675b.f9350a), new q(cVar2.f8677d, cVar2.f8675b.f9350a));
    }
}
