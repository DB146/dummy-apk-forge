package Ea;

import Db.q;
import Eb.o;
import Eb.v;
import M1.C0405u;
import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import Q.W;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import fc.C1156c;
import fc.J;
import fc.Q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l2.C1468l;
import l2.H;

/* loaded from: classes2.dex */
public final class j implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MobileMainActivity f3848a;

    public j(MobileMainActivity mobileMainActivity) {
        this.f3848a = mobileMainActivity;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [fc.Y, java.lang.Object] */
    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C0506o c0506o = (C0506o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0506o.x()) {
            c0506o.N();
        } else {
            int i7 = MobileMainActivity.f16227S;
            MobileMainActivity mobileMainActivity = this.f3848a;
            ta.c l10 = mobileMainActivity.l();
            H h10 = l10.get_listTvChannelLiveData();
            kotlin.jvm.internal.l.e(h10, "<this>");
            W j = C0480b.j(Q.m(new C0405u(Q.f(new C1156c(new C1468l(h10, null), Hb.j.f4919a, -2, 1), -1), 5), l2.Q.h(l10), new Object(), v.f3891a), c0506o);
            W j10 = C0480b.j(mobileMainActivity.l().i(), c0506o);
            List list = (List) j.getValue();
            c0506o.S(5004770);
            boolean g = c0506o.g(list);
            Object H10 = c0506o.H();
            if (g || H10 == C0498k.f8409a) {
                List list2 = (List) j.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list2) {
                    String tvGroup = ((TVChannel) obj3).getTvGroup();
                    Object obj4 = linkedHashMap.get(tvGroup);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(tvGroup, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(new Db.j(entry.getKey(), entry.getValue()));
                }
                H10 = o.s0(arrayList);
                c0506o.d0(H10);
            }
            c0506o.p(false);
            Ha.b.a(false, Y.f.d(518475243, new i(j10, C0480b.j((J) mobileMainActivity.f16232Q.getValue(), c0506o), mobileMainActivity, (List) H10), c0506o), c0506o, 384);
        }
        return q.f3365a;
    }
}
