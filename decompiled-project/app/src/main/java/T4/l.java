package T4;

import N6.H;
import android.net.Uri;
import java.util.ArrayList;
import m4.L;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: f, reason: collision with root package name */
    public final j f9290f;

    /* renamed from: u, reason: collision with root package name */
    public final R7.a f9291u;

    public l(L l10, H h10, r rVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(l10, h10, rVar, arrayList, arrayList2, arrayList3);
        Uri.parse(((b) h10.get(0)).f9243a);
        long j = rVar.f9306e;
        j jVar = j <= 0 ? null : new j(rVar.f9305d, j, null);
        this.f9290f = jVar;
        this.f9291u = jVar == null ? new R7.a(new j(0L, -1L, null), 3) : null;
    }

    @Override // T4.m
    public final String a() {
        return null;
    }

    @Override // T4.m
    public final S4.i d() {
        return this.f9291u;
    }

    @Override // T4.m
    public final j e() {
        return this.f9290f;
    }
}
