package E;

import F.C0278w;
import java.util.ArrayList;
import java.util.List;
import u.C2070x;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final j f3440a;

    /* renamed from: b, reason: collision with root package name */
    public final C0278w f3441b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3442c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0278w f3444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3445f;
    public final /* synthetic */ int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.c f3446h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0.d f3447i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f3448l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A f3449m;

    public o(long j, boolean z8, j jVar, C0278w c0278w, int i7, int i10, c0.c cVar, c0.d dVar, int i11, int i12, long j10, A a9) {
        this.f3443d = z8;
        this.f3444e = c0278w;
        this.f3445f = i7;
        this.g = i10;
        this.f3446h = cVar;
        this.f3447i = dVar;
        this.j = i11;
        this.k = i12;
        this.f3448l = j10;
        this.f3449m = a9;
        this.f3440a = jVar;
        this.f3441b = c0278w;
        this.f3442c = V0.b.b(z8 ? V0.a.h(j) : Integer.MAX_VALUE, z8 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : V0.a.g(j), 5);
    }

    public final t a(int i7, long j) {
        List list;
        j jVar = this.f3440a;
        Object c10 = jVar.c(i7);
        Object a9 = jVar.a(i7);
        C0278w c0278w = this.f3441b;
        C2070x c2070x = c0278w.f4021d;
        List list2 = (List) c2070x.b(i7);
        if (list2 != null) {
            list = list2;
        } else {
            j jVar2 = c0278w.f4020c;
            Object c11 = jVar2.c(i7);
            List K10 = c0278w.f4019b.K(c11, c0278w.f4018a.a(i7, c11, jVar2.a(i7)));
            int size = K10.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((y0.z) K10.get(i10)).b(j));
            }
            c2070x.g(i7, arrayList);
            list = arrayList;
        }
        return new t(i7, list, this.f3443d, this.f3446h, this.f3447i, this.f3444e.f4019b.getLayoutDirection(), this.j, this.k, i7 == this.f3445f + (-1) ? 0 : this.g, this.f3448l, c10, a9, this.f3449m.f3378m, j);
    }
}
