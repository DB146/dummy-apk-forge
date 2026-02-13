package Ba;

import java.util.ArrayList;
import ra.C1953a;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public String f2240a;

    /* renamed from: b, reason: collision with root package name */
    public int f2241b;

    /* renamed from: c, reason: collision with root package name */
    public final O9.a f2242c;

    public b(O9.a logger) {
        kotlin.jvm.internal.l.e(logger, "logger");
        this.f2240a = "";
        this.f2241b = -1;
        this.f2242c = logger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        if (ac.g.h0(this.f2240a) || (i7 = this.f2241b) <= -1) {
            return;
        }
        String query = this.f2240a;
        O9.a aVar = this.f2242c;
        kotlin.jvm.internal.l.e(aVar, "<this>");
        kotlin.jvm.internal.l.e(query, "query");
        O3.c cVar = new O3.c(3);
        cVar.a(new Db.j("SearchQuery", query));
        cVar.a(new Db.j("SearchResultCount", Integer.valueOf(i7)));
        cVar.b(new Db.j[0]);
        ArrayList arrayList = cVar.f7466a;
        ((C1953a) aVar).a("Search", com.bumptech.glide.c.f((Db.j[]) arrayList.toArray(new Db.j[arrayList.size()])));
        this.f2240a = "";
        this.f2241b = -1;
    }
}
