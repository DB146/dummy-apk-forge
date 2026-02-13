package v2;

import H2.C0288b;
import java.util.ArrayList;
import java.util.Iterator;
import u.U;

/* loaded from: classes.dex */
public final class s extends o3.e {

    /* renamed from: f, reason: collision with root package name */
    public final C2128B f25022f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f25023h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C2128B provider) {
        super(provider.b(O5.b.s(t.class)), (String) null);
        kotlin.jvm.internal.l.e(provider, "provider");
        this.f25023h = new ArrayList();
        this.f25022f = provider;
        this.g = "Home";
    }

    public final r g() {
        int hashCode;
        r rVar = (r) super.a();
        ArrayList nodes = this.f25023h;
        kotlin.jvm.internal.l.e(nodes, "nodes");
        B4.j jVar = rVar.f25021f;
        jVar.getClass();
        Iterator it = nodes.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar != null) {
                C0288b c0288b = qVar.f25017b;
                int i7 = c0288b.f4638a;
                String str = (String) c0288b.f4642e;
                if (i7 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                r rVar2 = (r) jVar.f2090c;
                String str2 = (String) rVar2.f25017b.f4642e;
                if (str2 != null && kotlin.jvm.internal.l.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + qVar + " cannot have the same route as graph " + rVar2).toString());
                }
                if (i7 == rVar2.f25017b.f4638a) {
                    throw new IllegalArgumentException(("Destination " + qVar + " cannot have the same id as graph " + rVar2).toString());
                }
                U u3 = (U) jVar.f2091d;
                q qVar2 = (q) u3.c(i7);
                if (qVar2 == qVar) {
                    continue;
                } else {
                    if (qVar.f25018c != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (qVar2 != null) {
                        qVar2.f25018c = null;
                    }
                    qVar.f25018c = rVar2;
                    u3.e(c0288b.f4638a, qVar);
                }
            }
        }
        String str3 = this.g;
        if (str3 == null) {
            if (((String) this.f21671b) != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        if (str3 == null) {
            hashCode = 0;
        } else {
            r rVar3 = (r) jVar.f2090c;
            if (str3.equals((String) rVar3.f25017b.f4642e)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + rVar3).toString());
            }
            if (ac.g.h0(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i10 = q.f25015e;
            hashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        jVar.f2089b = hashCode;
        jVar.f2093f = str3;
        return rVar;
    }
}
