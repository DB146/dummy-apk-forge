package M9;

import Y5.B;
import com.kt.apps.core.extensions.ExtensionsChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import ob.C1833a;
import ob.C1837e;
import rb.C1954a;
import sb.C2012f;

/* loaded from: classes2.dex */
public final class p implements InterfaceC1394e, InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f6895c;

    public /* synthetic */ p(t tVar, d dVar, int i7) {
        this.f6893a = i7;
        this.f6894b = tVar;
        this.f6895c = dVar;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        Throwable it = (Throwable) obj;
        kotlin.jvm.internal.l.e(it, "it");
        d dVar = this.f6895c;
        String message = X.c.h(dVar.f6851b, " Error");
        t t5 = this.f6894b;
        kotlin.jvm.internal.l.e(t5, "t");
        kotlin.jvm.internal.l.e(message, "message");
        t5.h().remove(dVar.f6851b);
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        switch (this.f6893a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.l.e(it, "it");
                return this.f6894b.f(this.f6895c);
            default:
                List list = (List) obj;
                kotlin.jvm.internal.l.e(list, "list");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    String tvGroup = ((ExtensionsChannel) obj2).getTvGroup();
                    Object obj3 = linkedHashMap.get(tvGroup);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(tvGroup, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                Set keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(Eb.p.S(keySet, 10));
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new W9.a(this.f6895c.f6851b, (String) it2.next()));
                }
                t tVar = this.f6894b;
                U9.a x2 = tVar.f6916c.x();
                x2.getClass();
                C1837e g = android.support.v4.media.session.b.g(x2.f9847a, new Aa.t(7, x2, arrayList));
                U9.d dVar = (U9.d) tVar.f6919f.getValue();
                dVar.getClass();
                Aa.t tVar2 = new Aa.t(8, dVar, list);
                C1954a c1954a = new C1954a(0, new C1833a(0, android.support.v4.media.session.b.g(dVar.f9854a, tVar2), g), gb.i.l(list));
                m mVar = new m(tVar, 3);
                B b2 = lb.b.f19615d;
                return new C2012f(c1954a, b2, b2, mVar).h(new D5.i(tVar, 25));
        }
    }
}
