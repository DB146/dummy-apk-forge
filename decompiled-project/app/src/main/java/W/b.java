package W;

import Eb.j;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends j implements T.b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f10243d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10244a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10245b;

    /* renamed from: c, reason: collision with root package name */
    public final V.c f10246c;

    static {
        X.b bVar = X.b.f10901a;
        f10243d = new b(bVar, bVar, V.c.f9939c);
    }

    public b(Object obj, Object obj2, V.c cVar) {
        this.f10244a = obj;
        this.f10245b = obj2;
        this.f10246c = cVar;
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        V.c cVar = this.f10246c;
        cVar.getClass();
        return cVar.f9941b;
    }

    @Override // Eb.AbstractC0250a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f10246c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f10244a, this.f10246c);
    }
}
