package ob;

import gb.AbstractC1204a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ob.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1835c extends AbstractC1204a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22209a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1204a[] f22210b;

    public /* synthetic */ C1835c(AbstractC1204a[] abstractC1204aArr, int i7) {
        this.f22209a = i7;
        this.f22210b = abstractC1204aArr;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hb.a] */
    @Override // gb.AbstractC1204a
    public final void d(gb.b bVar) {
        switch (this.f22209a) {
            case 0:
                C1834b c1834b = new C1834b(bVar, this.f22210b);
                bVar.c(c1834b.f22208d);
                c1834b.b();
                return;
            default:
                ?? obj = new Object();
                C1840h c1840h = new C1840h(bVar, new AtomicBoolean(), obj, this.f22210b.length + 1);
                bVar.c(c1840h);
                for (AbstractC1204a abstractC1204a : this.f22210b) {
                    if (obj.f17922b) {
                        return;
                    }
                    if (abstractC1204a == null) {
                        obj.b();
                        c1840h.onError(new NullPointerException("A completable source is null"));
                        return;
                    }
                    abstractC1204a.c(c1840h);
                }
                c1840h.a();
                return;
        }
    }
}
