package Ba;

import A9.C0109l2;
import A9.C0152w2;
import A9.H;
import A9.N1;
import Y5.A;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.kt.apps.core.base.leanback.SearchView;
import com.kt.apps.core.storage.local.RoomDataBase;
import com.kt.apps.core.utils.UtilsKt;
import ha.C1266b;
import ha.C1267c;
import java.util.ArrayList;
import ra.C1953a;
import tss.r.core.ads.ui.leanback.ShopeeProductDetailsActivity;
import y7.u0;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements H, N1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f2263a;

    public /* synthetic */ m(s sVar) {
        this.f2263a = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.atomic.AtomicReference, hb.b] */
    /* JADX WARN: Type inference failed for: r0v6, types: [gb.l, nb.h] */
    /* JADX WARN: Type inference failed for: r11v22, types: [ob.m, gb.p] */
    /* JADX WARN: Type inference failed for: r12v24, types: [gb.i, sb.g] */
    /* JADX WARN: Type inference failed for: r14v4, types: [y9.C, Ba.h] */
    /* JADX WARN: Type inference failed for: r1v21, types: [nb.e, gb.q] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.concurrent.atomic.AtomicReference, hb.b] */
    @Override // A9.InterfaceC0149w
    public void b(C0109l2 c0109l2, Object obj, C0152w2 c0152w2, Object obj2) {
        String str;
        String str2;
        ?? r02;
        qb.b bVar;
        SearchView.SearchAutoComplete searchEdtAutoComplete;
        boolean z8 = obj instanceof Jc.a;
        s sVar = this.f2263a;
        if (z8) {
            int i7 = ShopeeProductDetailsActivity.f24555R;
            Y6.b.x(sVar.i0(), (Jc.a) obj);
            return;
        }
        if (obj instanceof ha.e) {
            ?? H02 = sVar.H0();
            ha.e searchItem = (ha.e) obj;
            SearchView searchView = sVar.f2284Y0;
            String valueOf = String.valueOf((searchView == null || (searchEdtAutoComplete = searchView.getSearchEdtAutoComplete()) == null) ? null : searchEdtAutoComplete.getText());
            kotlin.jvm.internal.l.e(searchItem, "searchItem");
            String query = UtilsKt.removeAllSpecialChars(valueOf);
            Db.j[] jVarArr = new Db.j[0];
            O9.a aVar = H02.f2252c;
            kotlin.jvm.internal.l.e(aVar, "<this>");
            kotlin.jvm.internal.l.e(query, "query");
            O3.c cVar = new O3.c(5);
            cVar.a(new Db.j("SearchQuery", query));
            boolean z10 = searchItem instanceof ha.d;
            if (z10) {
                str = "TV";
            } else if (searchItem instanceof C1267c) {
                str = "History";
            } else {
                if (!(searchItem instanceof C1266b)) {
                    throw new Db.d(1);
                }
                str = "IPTV";
            }
            cVar.a(new Db.j("Type", str));
            if (z10) {
                str2 = ((ha.d) searchItem).f17903b.f();
            } else if (searchItem instanceof C1267c) {
                str2 = ((C1267c) searchItem).f17902b.f10860c;
            } else {
                if (!(searchItem instanceof C1266b)) {
                    throw new Db.d(1);
                }
                str2 = ((C1266b) searchItem).f17899b.f10235b;
            }
            cVar.a(new Db.j("SearchResultTitle", str2));
            cVar.a(new Db.j("SearchResultData", String.valueOf(searchItem)));
            cVar.b(jVarArr);
            ArrayList arrayList = cVar.f7466a;
            ((C1953a) aVar).a("SearchAndPerformClick", com.bumptech.glide.c.f((Db.j[]) arrayList.toArray(new Db.j[arrayList.size()])));
            ?? r22 = H02.j;
            if (r22 != 0) {
                r22.b();
            }
            A a9 = lb.b.f19614c;
            if (z10) {
                H02.c().l(new Object());
                ?? q10 = H02.f2253d.invoke(((ha.d) searchItem).f17903b.a()).q(Ab.e.f1561c);
                r02 = new nb.h(new e(H02, 0), new c(H02, 1), a9);
                q10.b(r02);
            } else {
                boolean z11 = searchItem instanceof C1266b;
                RoomDataBase roomDataBase = H02.f2250a;
                if (z11) {
                    H02.c().l(new Object());
                    U9.d y10 = roomDataBase.y();
                    V9.a aVar2 = ((C1266b) searchItem).f17899b;
                    y10.getClass();
                    String streamLink = aVar2.f10237d;
                    kotlin.jvm.internal.l.e(streamLink, "streamLink");
                    ?? f4 = android.support.v4.media.session.b.k(y10.f9854a, true, new U9.c(streamLink, y10, 0)).f(Ab.e.f1561c);
                    ?? eVar = new nb.e(1, new d(H02, 1), new e(H02, 1));
                    f4.d(eVar);
                    bVar = eVar;
                } else {
                    if (!(searchItem instanceof C1267c)) {
                        throw new Db.d(1);
                    }
                    H02.c().l(new Object());
                    W9.c cVar2 = ((C1267c) searchItem).f17902b;
                    W9.b bVar2 = cVar2.j;
                    W9.b bVar3 = W9.b.f10856b;
                    String itemId = cVar2.f10858a;
                    if (bVar2 == bVar3) {
                        U9.o oVar = (U9.o) roomDataBase.D();
                        oVar.getClass();
                        kotlin.jvm.internal.l.e(itemId, "channelID");
                        sb.g q11 = new sb.q(android.support.v4.media.session.b.j(oVar.f9904a, new String[]{"TVChannelUrl", "TVChannelDTO"}, new Aa.t(15, itemId, oVar)), f.f2249a, 1).q(Ab.e.f1561c);
                        nb.h hVar = new nb.h(new c(H02, 2), new d(H02, 2), a9);
                        q11.b(hVar);
                        r02 = hVar;
                    } else {
                        U9.d y11 = roomDataBase.y();
                        y11.getClass();
                        String category = cVar2.f10859b;
                        kotlin.jvm.internal.l.e(category, "category");
                        kotlin.jvm.internal.l.e(itemId, "itemId");
                        String displayName = cVar2.f10860c;
                        kotlin.jvm.internal.l.e(displayName, "displayName");
                        ob.m f10 = android.support.v4.media.session.b.k(y11.f9854a, true, new Ea.g(category, itemId, displayName, y11, 1)).f(Ab.e.f1561c);
                        qb.b bVar4 = new qb.b(new e(H02, 2), new c(H02, 3));
                        try {
                            f10.d(new qb.i(bVar4, 2));
                            bVar = bVar4;
                        } catch (NullPointerException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            u0.L(th);
                            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                            nullPointerException.initCause(th);
                            throw nullPointerException;
                        }
                    }
                }
                r02 = bVar;
            }
            H02.j = r02;
            H02.add(r02);
        }
    }

    @Override // A9.H
    public View c(View view, int i7) {
        String message = "Focus search: " + i7 + " " + view;
        s t5 = this.f2263a;
        kotlin.jvm.internal.l.e(t5, "t");
        kotlin.jvm.internal.l.e(message, "message");
        if (kotlin.jvm.internal.l.a(view, t5.f2287b1) && i7 == 130 && t5.f751n0.getChildCount() > 0) {
            return t5.f751n0;
        }
        if (kotlin.jvm.internal.l.a(view, t5.f2287b1) && i7 == 66) {
            return t5.f2290e1;
        }
        if (kotlin.jvm.internal.l.a(view, t5.f2286a1)) {
            return (i7 == 17 || i7 == 33) ? t5.f2290e1 : ((i7 == 66 || i7 == 130) && t5.f751n0.getChildCount() > 0) ? t5.f751n0 : view;
        }
        if ((view instanceof AutoCompleteTextView) && i7 == 130) {
            if (t5.f751n0.getChildCount() > 0) {
                return t5.f751n0;
            }
            SearchView searchView = t5.f2284Y0;
            if (searchView == null) {
                return view;
            }
            searchView.f();
            return view;
        }
        if (t5.f753p0 == 0 && i7 == 33) {
            return t5.f2286a1;
        }
        if (kotlin.jvm.internal.l.a(view, t5.f751n0) && i7 == 33) {
            return t5.f2286a1;
        }
        if (i7 == 17 && t5.f751n0.getSelectedSubPosition() == 0) {
            return null;
        }
        return view;
    }
}
