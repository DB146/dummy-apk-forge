package Aa;

import A9.C0096i1;
import A9.C0098j;
import A9.C0139t1;
import B0.C0168b0;
import Eb.B;
import Eb.C0252c;
import Q.R0;
import Z9.z;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.base.leanback.SearchView;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.core.tv.model.DataFromFirebase;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVChannelGroup;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.core.utils.AnimationUtilsKt;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.beta.R;
import g3.C1191j;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import l2.C1481z;
import l2.InterfaceC1479x;
import org.json.JSONArray;
import org.json.JSONObject;
import sb.C2010d;
import u.T;
import v2.y;
import y7.u0;
import y9.D;
import y9.E;
import y9.G;
import y9.I;
import za.C2606e;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1542c;

    public /* synthetic */ t(int i7, Object obj, Object obj2) {
        this.f1540a = i7;
        this.f1541b = obj;
        this.f1542c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Map, u.T, u.e] */
    private final Object b(Object obj) {
        W9.h hVar;
        String str = (String) this.f1541b;
        U9.o oVar = (U9.o) this.f1542c;
        T2.a _connection = (T2.a) obj;
        kotlin.jvm.internal.l.e(_connection, "_connection");
        T2.c R10 = _connection.R("SELECT * FROM TVChannelDTO WHERE channelId=?");
        try {
            R10.y(1, str);
            int h10 = P2.j.h(R10, "tvGroup");
            int h11 = P2.j.h(R10, "logoChannel");
            int h12 = P2.j.h(R10, "tvChannelName");
            int h13 = P2.j.h(R10, "sourceFrom");
            int h14 = P2.j.h(R10, "channelId");
            int h15 = P2.j.h(R10, "searchKey");
            int h16 = P2.j.h(R10, "channelNumber");
            ?? t5 = new T(0);
            while (R10.J()) {
                String j = R10.j(h14);
                if (!t5.containsKey(j)) {
                    t5.put(j, new ArrayList());
                }
            }
            R10.reset();
            oVar.a(_connection, t5);
            if (R10.J()) {
                W9.e eVar = new W9.e(R10.j(h10), R10.j(h11), R10.j(h12), R10.j(h13), R10.j(h14), R10.j(h15), (int) R10.x(h16));
                Object E10 = B.E(R10.j(h14), t5);
                kotlin.jvm.internal.l.d(E10, "getValue(...)");
                hVar = new W9.h(eVar, (List) E10);
            } else {
                hVar = null;
            }
            R10.close();
            return hVar;
        } catch (Throwable th) {
            R10.close();
            throw th;
        }
    }

    private final Object c(Object obj) {
        W9.f fVar;
        String str = (String) this.f1541b;
        U9.p pVar = (U9.p) this.f1542c;
        T2.a _connection = (T2.a) obj;
        kotlin.jvm.internal.l.e(_connection, "_connection");
        T2.c R10 = _connection.R("SELECT * from TVChannelEntity WHERE channelId=? LIMIT 1");
        try {
            R10.y(1, str);
            int h10 = P2.j.h(R10, "tvGroup");
            int h11 = P2.j.h(R10, "logoChannel");
            int h12 = P2.j.h(R10, "tvChannelName");
            int h13 = P2.j.h(R10, "tvChannelWebDetailPage");
            int h14 = P2.j.h(R10, "sourceFrom");
            int h15 = P2.j.h(R10, "channelId");
            int h16 = P2.j.h(R10, "channelPreviewProviderId");
            if (R10.J()) {
                String j = R10.j(h10);
                String str2 = R10.j(h11);
                pVar.f9908c.getClass();
                kotlin.jvm.internal.l.e(str2, "str");
                Uri parse = Uri.parse(str2);
                kotlin.jvm.internal.l.d(parse, "parse(...)");
                fVar = new W9.f(j, parse, R10.j(h12), R10.j(h13), R10.j(h14), R10.j(h15), R10.x(h16));
            } else {
                fVar = null;
            }
            return fVar;
        } finally {
            R10.close();
        }
    }

    private final Object d(Object obj) {
        G7.a aVar = (G7.a) obj;
        kotlin.jvm.internal.l.b(aVar);
        new G7.h();
        Object value = aVar.f4353a.f9350a.getValue();
        ConcurrentHashMap concurrentHashMap = P7.b.f8173a;
        Type genericSuperclass = z.class.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            throw new RuntimeException("Not a direct subclass of GenericTypeIndicator: " + genericSuperclass);
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        if (!parameterizedType.getRawType().equals(G7.h.class)) {
            throw new RuntimeException("Not a direct subclass of GenericTypeIndicator: " + genericSuperclass);
        }
        List list = (List) P7.b.b(parameterizedType.getActualTypeArguments()[0], value);
        if (list != null) {
            ArrayList X10 = Eb.o.X(list);
            ArrayList arrayList = new ArrayList(Eb.p.S(X10, 10));
            Iterator it = X10.iterator();
            while (it.hasNext()) {
                DataFromFirebase dataFromFirebase = (DataFromFirebase) it.next();
                String name = dataFromFirebase.getName();
                String url = dataFromFirebase.getUrl();
                String logo = dataFromFirebase.getLogo();
                List y10 = u0.y("VOV", "VOH");
                String str = (String) this.f1542c;
                arrayList.add(new TVChannel(str, logo, name, url, "V", y10.contains(str) ? UtilsKt.removeAllSpecialChars(dataFromFirebase.getName()) : (String) Eb.o.e0(ac.g.r0(ac.g.o0(ac.g.v0(dataFromFirebase.getUrl()).toString(), "/"), new String[]{"/"})), null, false, null, 0, 960, null));
            }
            ((Z9.w) this.f1541b).invoke(arrayList);
        }
        return Db.q.f3365a;
    }

    private final Object e(Object obj) {
        y navOptions = (y) obj;
        kotlin.jvm.internal.l.e(navOptions, "$this$navOptions");
        v2.w wVar = navOptions.f25043a;
        wVar.f25036f = 0;
        wVar.g = 0;
        v2.q qVar = (v2.q) this.f1541b;
        if (qVar instanceof v2.r) {
            int i7 = v2.q.f25015e;
            Iterator it = u0.r(qVar).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                v2.u uVar = (v2.u) this.f1542c;
                if (hasNext) {
                    v2.q qVar2 = (v2.q) it.next();
                    v2.q f4 = uVar.f25026b.f();
                    if (kotlin.jvm.internal.l.a(qVar2, f4 != null ? f4.f25018c : null)) {
                        break;
                    }
                } else {
                    int i10 = v2.r.f25020u;
                    Iterator it2 = Zb.i.N(uVar.f25026b.g(), new Ba.i(17)).iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException("Sequence is empty.");
                    }
                    Object next = it2.next();
                    while (it2.hasNext()) {
                        next = it2.next();
                    }
                    navOptions.f25045c = ((v2.q) next).f25017b.f4638a;
                    navOptions.f25046d = true;
                }
            }
        }
        return Db.q.f3365a;
    }

    private final Object g(Object obj) {
        C1481z w10;
        v2.u uVar = (v2.u) this.f1541b;
        uVar.getClass();
        InterfaceC1479x owner = (InterfaceC1479x) this.f1542c;
        kotlin.jvm.internal.l.e(owner, "owner");
        y2.f fVar = uVar.f25026b;
        fVar.getClass();
        if (!owner.equals(fVar.f26775n)) {
            InterfaceC1479x interfaceC1479x = fVar.f26775n;
            S2.a aVar = fVar.f26779r;
            if (interfaceC1479x != null && (w10 = interfaceC1479x.w()) != null) {
                w10.f(aVar);
            }
            fVar.f26775n = owner;
            owner.w().a(aVar);
        }
        return new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:500:0x096e, code lost:
    
        if (kotlin.jvm.internal.l.a(r9, r14.H0().g) != false) goto L451;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0991  */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v71 */
    @Override // Rb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        TVChannel channel;
        ArrayList arrayList;
        Editable text;
        SearchView searchView;
        SearchView.SearchAutoComplete searchEdtAutoComplete;
        C0096i1 c0096i1;
        SearchView searchView2;
        SearchView.SearchAutoComplete searchEdtAutoComplete2;
        Editable text2;
        SearchView.SearchAutoComplete searchEdtAutoComplete3;
        String replaceVNCharsToLatinChars;
        Editable text3;
        Editable text4;
        B6.j g;
        B6.m mVar;
        boolean z8;
        ?? r22;
        B6.j g2;
        B6.m mVar2;
        B6.j g10;
        B6.m mVar3;
        boolean a9;
        ?? r23;
        B6.j g11;
        B6.m mVar4;
        JSONArray jSONArray;
        M9.c cVar;
        C0096i1 c0096i12;
        String str;
        View findViewById;
        View findViewById2;
        int i7 = -1;
        M9.d dVar = null;
        r9 = null;
        r9 = null;
        String str2 = null;
        Db.q qVar = Db.q.f3365a;
        Object obj2 = this.f1541b;
        Object obj3 = this.f1542c;
        switch (this.f1540a) {
            case 0:
                I i10 = (I) obj;
                SimpleDateFormat simpleDateFormat = w.f1546v2;
                TVChannelLinkStream tVChannelLinkStream = (TVChannelLinkStream) obj2;
                boolean isRadio = (tVChannelLinkStream == null || (channel = tVChannelLinkStream.getChannel()) == null) ? false : channel.isRadio();
                kotlin.jvm.internal.l.b(i10);
                w wVar = (w) obj3;
                wVar.getClass();
                if (i10 instanceof G) {
                    if (isRadio) {
                        Iterable iterable = (Iterable) ((G) i10).f27483a;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : iterable) {
                            if (((TVChannel) obj4).isRadio()) {
                                arrayList2.add(obj4);
                            }
                        }
                        wVar.t1(arrayList2);
                    } else {
                        Iterable iterable2 = (Iterable) ((G) i10).f27483a;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : iterable2) {
                            if (!((TVChannel) obj5).isRadio()) {
                                arrayList3.add(obj5);
                            }
                        }
                        wVar.t1(arrayList3);
                    }
                    if (wVar.f1554u2 <= 0 && wVar.f1553t2 != null) {
                        List list = (List) ((G) i10).f27483a;
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                String channelId = ((TVChannel) listIterator.previous()).getChannelId();
                                TVChannel tVChannel = wVar.f1553t2;
                                kotlin.jvm.internal.l.b(tVChannel);
                                if (kotlin.jvm.internal.l.a(channelId, tVChannel.getChannelId())) {
                                    i7 = listIterator.nextIndex();
                                }
                            }
                        }
                        Integer valueOf = i7 >= 0 ? Integer.valueOf(i7) : null;
                        wVar.f1554u2 = valueOf != null ? valueOf.intValue() : 0;
                    }
                } else if (!(i10 instanceof D)) {
                    boolean z10 = i10 instanceof E;
                }
                return qVar;
            case 1:
                I it = (I) obj;
                kotlin.jvm.internal.l.e(it, "it");
                SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) obj2;
                Ba.s sVar = (Ba.s) obj3;
                if (it instanceof E) {
                    CharSequence v02 = (searchAutoComplete == null || (text4 = searchAutoComplete.getText()) == null) ? null : ac.g.v0(text4);
                    if (v02 != null && !ac.g.h0(v02)) {
                        ProgressBar progressBar = sVar.f2288c1;
                        if (progressBar != null) {
                            AnimationUtilsKt.visible(progressBar);
                        }
                        ProgressBar progressBar2 = sVar.f2288c1;
                        if (progressBar2 != null) {
                            progressBar2.setIndeterminate(true);
                        }
                        ImageView imageView = sVar.f2289d1;
                        if (imageView != null) {
                            AnimationUtilsKt.gone(imageView);
                        }
                        if (it instanceof G) {
                            Map map = (Map) ((G) it).f27483a;
                            if (map.isEmpty()) {
                                ImageView imageView2 = sVar.f2289d1;
                                if (imageView2 != null) {
                                    AnimationUtilsKt.visible(imageView2);
                                }
                            } else {
                                ImageView imageView3 = sVar.f2289d1;
                                if (imageView3 != null) {
                                    AnimationUtilsKt.gone(imageView3);
                                }
                            }
                            VerticalGridView verticalGridView = sVar.f751n0;
                            if (verticalGridView != null) {
                                AnimationUtilsKt.visible(verticalGridView);
                            }
                            Db.o oVar = sVar.f2281V0;
                            ((C0098j) oVar.getValue()).i();
                            sa.g gVar = new sa.g();
                            String obj6 = (searchAutoComplete == null || (text3 = searchAutoComplete.getText()) == null) ? null : text3.toString();
                            if (obj6 != null) {
                                String lowerCase = obj6.toLowerCase(Locale.ROOT);
                                kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
                                String obj7 = ac.g.v0(lowerCase).toString();
                                if (obj7 != null && (replaceVNCharsToLatinChars = StringUtilsKt.replaceVNCharsToLatinChars(obj7)) != null) {
                                    List r02 = ac.g.r0(replaceVNCharsToLatinChars, new String[]{" "});
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj8 : r02) {
                                        String str3 = (String) obj8;
                                        if (!ac.g.h0(str3) && str3.length() > 0) {
                                            arrayList4.add(obj8);
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    Iterator it2 = arrayList4.iterator();
                                    while (it2.hasNext()) {
                                        String str4 = (String) it2.next();
                                        String removeAllSpecialChars = UtilsKt.removeAllSpecialChars(str4);
                                        Eb.o.U(arrayList, !kotlin.jvm.internal.l.a(str4, removeAllSpecialChars) ? u0.y(str4, removeAllSpecialChars) : u0.x(str4));
                                    }
                                    gVar.f24228d = arrayList;
                                    SearchView searchView3 = sVar.f2284Y0;
                                    text = (searchView3 != null || (searchEdtAutoComplete3 = searchView3.getSearchEdtAutoComplete()) == null) ? null : searchEdtAutoComplete3.getText();
                                    if (text != null && text.length() != 0) {
                                        searchView2 = sVar.f2284Y0;
                                        if (searchView2 != null && (searchEdtAutoComplete2 = searchView2.getSearchEdtAutoComplete()) != null && (text2 = searchEdtAutoComplete2.getText()) != null) {
                                            str2 = text2.toString();
                                        }
                                        break;
                                    }
                                    searchView = sVar.f2284Y0;
                                    if (searchView != null && (searchEdtAutoComplete = searchView.getSearchEdtAutoComplete()) != null) {
                                        searchEdtAutoComplete.setText(sVar.H0().g);
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        String str5 = (String) entry.getKey();
                                        List list2 = (List) entry.getValue();
                                        try {
                                            c0096i1 = new C0096i1(TVChannelGroup.valueOf(str5).getValue());
                                        } catch (Exception unused) {
                                            c0096i1 = new C0096i1(str5);
                                        }
                                        Db.o oVar2 = ha.i.f17917e;
                                        String str6 = (String) c0096i1.f1227a;
                                        kotlin.jvm.internal.l.d(str6, "getName(...)");
                                        c0096i1.f1229c = ha.f.b(str6, gVar.f24228d);
                                        C0098j c0098j = new C0098j(gVar);
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            c0098j.g((ha.e) it3.next());
                                        }
                                        ((C0098j) oVar.getValue()).g(new C0139t1(c0096i1, c0098j));
                                    }
                                }
                            }
                            arrayList = null;
                            gVar.f24228d = arrayList;
                            SearchView searchView32 = sVar.f2284Y0;
                            if (searchView32 != null) {
                            }
                            if (text != null) {
                                searchView2 = sVar.f2284Y0;
                                if (searchView2 != null) {
                                    str2 = text2.toString();
                                }
                            }
                            searchView = sVar.f2284Y0;
                            if (searchView != null) {
                                searchEdtAutoComplete.setText(sVar.H0().g);
                            }
                            while (r0.hasNext()) {
                            }
                        }
                        return qVar;
                    }
                }
                ProgressBar progressBar3 = sVar.f2288c1;
                if (progressBar3 != null) {
                    progressBar3.setIndeterminate(false);
                }
                ProgressBar progressBar4 = sVar.f2288c1;
                if (progressBar4 != null) {
                    AnimationUtilsKt.gone(progressBar4);
                }
                if (it instanceof G) {
                }
                return qVar;
            case 2:
                I i11 = (I) obj;
                B6.o oVar3 = (B6.o) obj2;
                Ca.m mVar5 = (Ca.m) obj3;
                if (i11 instanceof G) {
                    if (oVar3 != 0) {
                        B6.b bVar = new B6.b(mVar5.i0());
                        bVar.setFocusable(false);
                        bVar.setFocusableInTouchMode(false);
                        new ViewGroup.LayoutParams(UtilsKt.dpToPx(75), 0);
                        oVar3.b(bVar);
                    }
                    Iterable iterable3 = (Iterable) ((G) i11).f27483a;
                    mVar5.getClass();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj9 : iterable3) {
                        TVChannel channel2 = (TVChannel) obj9;
                        kotlin.jvm.internal.l.e(channel2, "channel");
                        if (mVar5.f3122S0 == l.f1523a ? !channel2.isRadio() : channel2.isRadio()) {
                            arrayList5.add(obj9);
                        }
                    }
                    Db.o oVar4 = mVar5.f3123T0;
                    Ca.k kVar = (Ca.k) oVar4.getValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        String tvGroup = ((TVChannel) next).getTvGroup();
                        Object obj10 = linkedHashMap.get(tvGroup);
                        if (obj10 == null) {
                            obj10 = new ArrayList();
                            linkedHashMap.put(tvGroup, obj10);
                        }
                        ((List) obj10).add(next);
                    }
                    List s02 = Eb.o.s0(linkedHashMap.keySet());
                    kVar.getClass();
                    if (kVar.m().isEmpty() || s02.isEmpty()) {
                        z8 = false;
                    } else {
                        Iterator it5 = kVar.m().iterator();
                        if (!it5.hasNext()) {
                            throw new UnsupportedOperationException("Empty collection can't be reduced.");
                        }
                        Object next2 = it5.next();
                        while (it5.hasNext()) {
                            next2 = X.c.h((String) next2, (String) it5.next());
                        }
                        Iterator it6 = s02.iterator();
                        if (!it6.hasNext()) {
                            throw new UnsupportedOperationException("Empty collection can't be reduced.");
                        }
                        Object next3 = it6.next();
                        while (it6.hasNext()) {
                            next3 = X.c.h((String) next3, (String) it6.next());
                        }
                        z8 = kotlin.jvm.internal.l.a(next2, next3);
                    }
                    if (!z8) {
                        Ca.k kVar2 = (Ca.k) oVar4.getValue();
                        kVar2.getClass();
                        kVar2.k = false;
                        kVar2.m().clear();
                        kVar2.m().add("Tất cả");
                        List m10 = kVar2.m();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator it7 = arrayList5.iterator();
                        while (it7.hasNext()) {
                            Object next4 = it7.next();
                            String tvGroup2 = ((TVChannel) next4).getTvGroup();
                            Object obj11 = linkedHashMap2.get(tvGroup2);
                            if (obj11 == null) {
                                obj11 = new ArrayList();
                                linkedHashMap2.put(tvGroup2, obj11);
                            }
                            ((List) obj11).add(next4);
                        }
                        m10.addAll(linkedHashMap2.keySet());
                        kVar2.f();
                        if (oVar3 != 0) {
                            r22 = 0;
                            oVar3.m(mVar5.I0(), false);
                            if (C2606e.f28342J1) {
                                if (oVar3 != 0 && (g2 = oVar3.g(r22)) != null && (mVar2 = g2.g) != null) {
                                    mVar2.requestFocus();
                                }
                                C2606e.f28342J1 = r22;
                            }
                        }
                    }
                    r22 = 0;
                    if (C2606e.f28342J1) {
                    }
                } else if (i11 instanceof E) {
                    Ca.k kVar3 = (Ca.k) mVar5.f3123T0.getValue();
                    kVar3.getClass();
                    Kb.a entries = TVChannelGroup.getEntries();
                    ArrayList arrayList6 = new ArrayList(Eb.p.S(entries, 10));
                    Iterator<E> it8 = entries.iterator();
                    while (it8.hasNext()) {
                        arrayList6.add(((TVChannelGroup) it8.next()).getValue());
                    }
                    if (kVar3.m().isEmpty()) {
                        kVar3.k = true;
                        kVar3.m().addAll(arrayList6);
                        kVar3.f();
                    }
                    if (C2606e.f28342J1) {
                        if (oVar3 != 0 && (g = oVar3.g(0)) != null && (mVar = g.g) != null) {
                            mVar.requestFocus();
                        } else if (oVar3 != 0) {
                            oVar3.requestFocus();
                        }
                    }
                }
                return qVar;
            case 3:
                I i12 = (I) obj;
                Da.f fVar = (Da.f) obj2;
                B6.o oVar5 = (B6.o) obj3;
                if (i12 instanceof G) {
                    Iterable iterable4 = (Iterable) ((G) i12).f27483a;
                    fVar.getClass();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj12 : iterable4) {
                        TVChannel channel3 = (TVChannel) obj12;
                        kotlin.jvm.internal.l.e(channel3, "channel");
                        if (fVar.f3316S0 == l.f1523a ? !channel3.isRadio() : channel3.isRadio()) {
                            arrayList7.add(obj12);
                        }
                    }
                    Db.o oVar6 = fVar.f3317T0;
                    Da.d dVar2 = (Da.d) oVar6.getValue();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it9 = arrayList7.iterator();
                    while (it9.hasNext()) {
                        Object next5 = it9.next();
                        String tvGroup3 = ((TVChannel) next5).getTvGroup();
                        Object obj13 = linkedHashMap3.get(tvGroup3);
                        if (obj13 == null) {
                            obj13 = new ArrayList();
                            linkedHashMap3.put(tvGroup3, obj13);
                        }
                        ((List) obj13).add(next5);
                    }
                    List s03 = Eb.o.s0(linkedHashMap3.keySet());
                    dVar2.getClass();
                    if (dVar2.m().isEmpty()) {
                        a9 = false;
                    } else {
                        Iterator it10 = dVar2.m().iterator();
                        if (!it10.hasNext()) {
                            throw new UnsupportedOperationException("Empty collection can't be reduced.");
                        }
                        Object next6 = it10.next();
                        while (it10.hasNext()) {
                            next6 = X.c.h((String) next6, (String) it10.next());
                        }
                        Iterator it11 = s03.iterator();
                        if (!it11.hasNext()) {
                            throw new UnsupportedOperationException("Empty collection can't be reduced.");
                        }
                        Object next7 = it11.next();
                        while (it11.hasNext()) {
                            next7 = X.c.h((String) next7, (String) it11.next());
                        }
                        a9 = kotlin.jvm.internal.l.a(next6, next7);
                    }
                    if (!a9) {
                        Da.d dVar3 = (Da.d) oVar6.getValue();
                        dVar3.getClass();
                        dVar3.k = false;
                        dVar3.m().clear();
                        List m11 = dVar3.m();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        Iterator it12 = arrayList7.iterator();
                        while (it12.hasNext()) {
                            Object next8 = it12.next();
                            String tvGroup4 = ((TVChannel) next8).getTvGroup();
                            Object obj14 = linkedHashMap4.get(tvGroup4);
                            if (obj14 == null) {
                                obj14 = new ArrayList();
                                linkedHashMap4.put(tvGroup4, obj14);
                            }
                            ((List) obj14).add(next8);
                        }
                        m11.addAll(linkedHashMap4.keySet());
                        dVar3.f();
                        if (oVar5 != 0) {
                            r23 = 0;
                            oVar5.m(fVar.I0(), false);
                            if (C2606e.f28342J1) {
                                if (oVar5 != 0 && (g11 = oVar5.g(r23)) != null && (mVar4 = g11.g) != null) {
                                    mVar4.requestFocus();
                                }
                                C2606e.f28342J1 = r23;
                            }
                        }
                    }
                    r23 = 0;
                    if (C2606e.f28342J1) {
                    }
                } else if (i12 instanceof E) {
                    Da.d dVar4 = (Da.d) fVar.f3317T0.getValue();
                    dVar4.getClass();
                    TVChannelGroup[] values = TVChannelGroup.values();
                    ArrayList arrayList8 = new ArrayList(values.length);
                    for (TVChannelGroup tVChannelGroup : values) {
                        arrayList8.add(tVChannelGroup.getValue());
                    }
                    if (dVar4.m().isEmpty()) {
                        dVar4.k = true;
                        dVar4.m().addAll(arrayList8);
                        dVar4.f();
                    }
                    if (C2606e.f28342J1) {
                        if (oVar5 != 0 && (g10 = oVar5.g(0)) != null && (mVar3 = g10.g) != null) {
                            mVar3.requestFocus();
                        } else if (oVar5 != 0) {
                            oVar5.requestFocus();
                        }
                    }
                }
                return qVar;
            case 4:
                T2.a _connection = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection, "_connection");
                ((Hc.b) obj2).f4924b.h(_connection, (Ic.a) obj3);
                return qVar;
            case 5:
                T2.a _connection2 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection2, "_connection");
                ((Hc.d) obj2).f4928b.g(_connection2, (ArrayList) obj3);
                return qVar;
            case 6:
                C2010d c2010d = (C2010d) obj3;
                M9.t tVar = (M9.t) obj2;
                String message = "Default data version from remote: " + tVar.f6918e.f("default_iptv_version");
                kotlin.jvm.internal.l.e(message, "message");
                Class cls = Long.TYPE;
                R9.b bVar2 = (R9.b) tVar.f6915b;
                String message2 = "Cache version: " + bVar2.a(cls, "default_iptv_version");
                kotlin.jvm.internal.l.e(message2, "message");
                u8.c cVar2 = tVar.f6918e;
                cVar2.g("default_iptv_channel");
                long f4 = cVar2.f("default_iptv_version");
                if (f4 > ((Number) bVar2.a(cls, "default_iptv_version")).longValue()) {
                    bVar2.b(Boolean.FALSE, "beta_insert_default_source");
                }
                if (!((Boolean) bVar2.a(Boolean.TYPE, "beta_insert_default_source")).booleanValue()) {
                    try {
                        JSONArray jSONArray2 = new JSONArray(cVar2.g("default_iptv_channel"));
                        ArrayList arrayList9 = new ArrayList();
                        if (jSONArray2.length() > 0) {
                            int length = jSONArray2.length();
                            int i13 = 0;
                            while (i13 < length) {
                                JSONObject optJSONObject = jSONArray2.optJSONObject(i13);
                                String optString = optJSONObject.optString("sourceName");
                                String optString2 = optJSONObject.optString("sourceUrl");
                                try {
                                    String optString3 = optJSONObject.optString("type");
                                    jSONArray = jSONArray2;
                                    try {
                                        kotlin.jvm.internal.l.d(optString3, "optString(...)");
                                        cVar = M9.c.valueOf(optString3);
                                    } catch (Exception unused2) {
                                        cVar = M9.c.f6846a;
                                        kotlin.jvm.internal.l.b(optString2);
                                        kotlin.jvm.internal.l.b(optString);
                                        arrayList9.add(new M9.d(optString, optString2, cVar));
                                        i13++;
                                        jSONArray2 = jSONArray;
                                    }
                                } catch (Exception unused3) {
                                    jSONArray = jSONArray2;
                                }
                                kotlin.jvm.internal.l.b(optString2);
                                kotlin.jvm.internal.l.b(optString);
                                arrayList9.add(new M9.d(optString, optString2, cVar));
                                i13++;
                                jSONArray2 = jSONArray;
                            }
                            if (!c2010d.g()) {
                                c2010d.d(arrayList9);
                                bVar2.b(Long.valueOf(f4), "default_iptv_version");
                                c2010d.a();
                            }
                        }
                    } catch (Exception e2) {
                        if (!c2010d.g()) {
                            c2010d.onError(e2);
                        }
                    }
                }
                return qVar;
            case 7:
                T2.a _connection3 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection3, "_connection");
                ((U9.a) obj2).f9848b.g(_connection3, (ArrayList) obj3);
                return qVar;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                T2.a _connection4 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection4, "_connection");
                ((U9.d) obj2).f9855b.g(_connection4, (List) obj3);
                return qVar;
            case 9:
                C1191j c1191j = (C1191j) obj3;
                T2.a _connection5 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection5, "_connection");
                T2.c R10 = _connection5.R((String) obj2);
                try {
                    ((Ba.o) c1191j.f17441b).invoke(R10);
                    int g12 = P2.j.g(R10, "configSourceUrl");
                    int a10 = P2.j.a(R10, "categoryName");
                    int a11 = P2.j.a(R10, "tvChannelName");
                    int a12 = P2.j.a(R10, "logoChannel");
                    int a13 = P2.j.a(R10, "tvStreamLink");
                    int a14 = P2.j.a(R10, "sourceFrom");
                    ArrayList arrayList10 = new ArrayList();
                    while (R10.J()) {
                        if (g12 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'configSourceUrl', found NULL value instead.");
                        }
                        String j = R10.j(g12);
                        if (a10 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'categoryName', found NULL value instead.");
                        }
                        String j10 = R10.j(a10);
                        if (a11 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'tvChannelName', found NULL value instead.");
                        }
                        String j11 = R10.j(a11);
                        if (a12 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'logoChannel', found NULL value instead.");
                        }
                        String j12 = R10.j(a12);
                        if (a13 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'tvStreamLink', found NULL value instead.");
                        }
                        String j13 = R10.j(a13);
                        if (a14 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'sourceFrom', found NULL value instead.");
                        }
                        arrayList10.add(new V9.a(j, j10, j11, j12, j13, R10.j(a14)));
                    }
                    return arrayList10;
                } catch (Throwable th) {
                    throw th;
                }
            case 10:
                String str7 = (String) obj2;
                U9.h hVar = (U9.h) obj3;
                T2.a _connection6 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection6, "_connection");
                T2.c R11 = _connection6.R("SELECT * FROM ExtensionsConfig WHERE sourceUrl = ?");
                try {
                    R11.y(1, str7);
                    int h10 = P2.j.h(R11, "sourceName");
                    int h11 = P2.j.h(R11, "sourceUrl");
                    int h12 = P2.j.h(R11, "type");
                    if (R11.J()) {
                        String j14 = R11.j(h10);
                        String j15 = R11.j(h11);
                        String j16 = R11.j(h12);
                        hVar.f9864c.getClass();
                        dVar = new M9.d(j14, j15, T9.a.a(j16));
                    }
                    return dVar;
                } finally {
                }
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                T2.a _connection7 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection7, "_connection");
                Hc.c cVar3 = ((U9.h) obj2).f9863b;
                cVar3.getClass();
                M9.d[] dVarArr = (M9.d[]) obj3;
                T2.c R12 = _connection7.R("INSERT OR REPLACE INTO `ExtensionsConfig` (`sourceName`,`sourceUrl`,`type`) VALUES (?,?,?)");
                try {
                    C0252c h13 = kotlin.jvm.internal.l.h(dVarArr);
                    while (h13.hasNext()) {
                        Object next9 = h13.next();
                        if (next9 != null) {
                            cVar3.b(R12, next9);
                            R12.J();
                            R12.reset();
                        }
                    }
                    Tb.a.g(R12, null);
                    return qVar;
                } finally {
                }
            case 12:
                T2.a _connection8 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection8, "_connection");
                ((U9.l) obj2).f9900b.h(_connection8, (W9.c) obj3);
                return qVar;
            case 13:
                T2.a _connection9 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection9, "_connection");
                ((U9.m) obj2).f9903b.g(_connection9, (ArrayList) obj3);
                return qVar;
            case 14:
                T2.a _connection10 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection10, "_connection");
                ((U9.o) obj2).f9905b.g(_connection10, (ArrayList) obj3);
                return qVar;
            case 15:
                return b(obj);
            case 16:
                T2.a _connection11 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection11, "_connection");
                ((U9.o) obj2).f9905b.h(_connection11, (W9.e) obj3);
                return qVar;
            case 17:
                return c(obj);
            case 18:
                T2.a _connection12 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection12, "_connection");
                ((U9.p) obj2).f9907b.g(_connection12, (ArrayList) obj3);
                return qVar;
            case 19:
                T2.a _connection13 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection13, "_connection");
                ((U9.s) obj2).f9910b.g(_connection13, (ArrayList) obj3);
                return qVar;
            case 20:
                String str8 = (String) obj2;
                String str9 = (String) obj3;
                T2.a _connection14 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection14, "_connection");
                T2.c R13 = _connection14.R("DELETE FROM programme WHERE extensionsConfigId=? AND extensionEpgUrl=?");
                try {
                    R13.y(1, str8);
                    R13.y(2, str9);
                    R13.J();
                    return qVar;
                } finally {
                }
            case 21:
                T2.a _connection15 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection15, "_connection");
                ((U9.t) obj2).f9912b.g(_connection15, (List) obj3);
                return qVar;
            case 22:
                T2.a _connection16 = (T2.a) obj;
                kotlin.jvm.internal.l.e(_connection16, "_connection");
                ((U9.u) obj2).f9914b.h(_connection16, (N9.b) obj3);
                return qVar;
            case 23:
                return d(obj);
            case 24:
                return e(obj);
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new C0168b0(5, (R0) obj2, (w2.i) obj3);
            case 26:
                return g(obj);
            default:
                I i14 = (I) obj;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj3;
                wa.c cVar4 = (wa.c) obj2;
                if (i14 instanceof G) {
                    G g13 = (G) i14;
                    if (((List) g13.f27483a).isEmpty()) {
                        ((C0098j) cVar4.f25833S0.getValue()).i();
                        View view = cVar4.f10277U;
                        if (view != null && (findViewById2 = view.findViewById(R.id.ic_empty_search)) != null) {
                            AnimationUtilsKt.visible(findViewById2);
                        }
                    } else {
                        View view2 = cVar4.f10277U;
                        if (view2 != null && (findViewById = view2.findViewById(R.id.ic_empty_search)) != null) {
                            AnimationUtilsKt.gone(findViewById);
                        }
                        Object obj15 = g13.f27483a;
                        String F02 = wa.c.F0((List) obj15);
                        List list3 = (List) vVar.f19134a;
                        if (!kotlin.jvm.internal.l.a(F02, list3 != null ? wa.c.F0(list3) : null)) {
                            Db.o oVar7 = cVar4.f25833S0;
                            ((C0098j) oVar7.getValue()).i();
                            sa.e eVar = new sa.e();
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            for (Object obj16 : (Iterable) obj15) {
                                W9.i iVar = ((W9.j) obj16).g;
                                Object obj17 = linkedHashMap5.get(iVar);
                                if (obj17 == null) {
                                    obj17 = new ArrayList();
                                    linkedHashMap5.put(iVar, obj17);
                                }
                                ((List) obj17).add(obj16);
                            }
                            for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                                W9.i iVar2 = (W9.i) entry2.getKey();
                                List list4 = (List) entry2.getValue();
                                try {
                                    int ordinal = iVar2.ordinal();
                                    if (ordinal == 0) {
                                        str = "Truyền hình";
                                    } else if (ordinal == 1) {
                                        str = "Phát thanh";
                                    } else if (ordinal != 2) {
                                        throw new Db.d(1);
                                        break;
                                    } else {
                                        str = "IPTV";
                                    }
                                    c0096i12 = new C0096i1(str);
                                } catch (Exception unused4) {
                                    c0096i12 = new C0096i1("Truyền hình");
                                }
                                C0098j c0098j2 = new C0098j(eVar);
                                Iterator it13 = list4.iterator();
                                while (it13.hasNext()) {
                                    c0098j2.g((W9.j) it13.next());
                                }
                                ((C0098j) oVar7.getValue()).g(new C0139t1(c0096i12, c0098j2));
                            }
                            vVar.f19134a = obj15;
                        }
                    }
                } else if (i14 instanceof E) {
                    Collection collection = (Collection) vVar.f19134a;
                    if (collection == null || collection.isEmpty()) {
                        android.support.v4.media.session.b.d((C0098j) cVar4.f25833S0.getValue());
                    }
                } else {
                    boolean z11 = i14 instanceof D;
                }
                return qVar;
        }
    }
}
