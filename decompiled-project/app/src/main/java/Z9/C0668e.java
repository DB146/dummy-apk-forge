package Z9;

import W9.e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;

/* renamed from: Z9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0668e implements InterfaceC1394e, InterfaceC1393d {

    /* renamed from: b, reason: collision with root package name */
    public static final C0668e f12261b = new C0668e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0668e f12262c = new C0668e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0668e f12263d = new C0668e(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0668e f12264e = new C0668e(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0668e f12265f = new C0668e(4);

    /* renamed from: u, reason: collision with root package name */
    public static final C0668e f12266u = new C0668e(5);

    /* renamed from: v, reason: collision with root package name */
    public static final C0668e f12267v = new C0668e(6);

    /* renamed from: w, reason: collision with root package name */
    public static final C0668e f12268w = new C0668e(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12269a;

    public /* synthetic */ C0668e(int i7) {
        this.f12269a = i7;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f12269a) {
            case 1:
                List it = (List) obj;
                kotlin.jvm.internal.l.e(it, "it");
                Db.o oVar = X9.a.f11017a;
                ((FirebaseAnalytics) X9.a.f11017a.getValue()).a("GetListChannelFrom_".concat("HTV_BACKUP"), com.bumptech.glide.c.e());
                return;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                return;
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        Object obj2;
        String d10;
        switch (this.f12269a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.l.e(it, "it");
                FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) X9.a.f11017a.getValue();
                String concat = "Error_GetListChannelFrom_".concat("HTV_BACKUP");
                String message = it.getMessage();
                if (message == null) {
                    message = it.getClass().getName();
                }
                firebaseAnalytics.a(concat, com.bumptech.glide.c.f(new Db.j("reason", message)));
                return Eb.v.f3891a;
            case 1:
            default:
                List it2 = (List) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                Iterator it3 = it2.iterator();
                if (it3.hasNext()) {
                    throw h3.o.j(it3);
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 2:
                List it4 = (List) obj;
                kotlin.jvm.internal.l.e(it4, "it");
                if (it4.isEmpty()) {
                    throw new NullPointerException("Empty channel");
                }
                return it4;
            case 3:
                List it5 = (List) obj;
                kotlin.jvm.internal.l.e(it5, "it");
                return Eb.o.n0(new n(new Ba.i(6), 1), it5);
            case 4:
                List<W9.h> it6 = (List) obj;
                kotlin.jvm.internal.l.e(it6, "it");
                ArrayList arrayList = new ArrayList(Eb.p.S(it6, 10));
                for (W9.h hVar : it6) {
                    kotlin.jvm.internal.l.e(hVar, "<this>");
                    W9.e eVar = hVar.f10888a;
                    String g = eVar.g();
                    String f4 = eVar.f();
                    List<e.a> list = hVar.f10889b;
                    Iterator it7 = list.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj2 = it7.next();
                            if (kotlin.jvm.internal.l.a(((e.a) obj2).c(), MainTVDataSource$TVChannelUrlType.WEB_PAGE.getValue())) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    e.a aVar = (e.a) obj2;
                    if (aVar == null || (d10 = aVar.d()) == null) {
                        d10 = ((e.a) list.get(0)).d();
                    }
                    String str = d10;
                    ArrayList arrayList2 = new ArrayList(Eb.p.S(list, 10));
                    for (e.a aVar2 : list) {
                        arrayList2.add(new TVChannel.Url(aVar2.a(), aVar2.c(), aVar2.d(), null, null, null, null, 120, null));
                    }
                    arrayList.add(new TVChannel(g, eVar.c(), f4, str, "MAIN_SOURCE", eVar.a(), arrayList2, false, null, eVar.b(), 384, null));
                }
                return arrayList;
            case 5:
                if (obj != null) {
                    throw new ClassCastException();
                }
                kotlin.jvm.internal.l.e(null, "it");
                throw null;
            case 6:
                List listTVWithCategory = (List) obj;
                kotlin.jvm.internal.l.e(listTVWithCategory, "listTVWithCategory");
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = listTVWithCategory.iterator();
                if (it8.hasNext()) {
                    throw h3.o.j(it8);
                }
                return arrayList3;
        }
    }
}
