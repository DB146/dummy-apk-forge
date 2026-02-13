package U9;

import I2.E;
import W9.e;
import java.util.Iterator;
import java.util.List;
import u.C2048a;
import u.C2049b;
import u.C2052e;
import u.T;

/* loaded from: classes2.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final E f9904a;

    /* renamed from: b, reason: collision with root package name */
    public final Hc.a f9905b = new Hc.a(3);

    public o(E e2) {
        this.f9904a = e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [u.T, u.e] */
    public final void a(T2.a aVar, C2052e c2052e) {
        C2049b c2049b = (C2049b) c2052e.keySet();
        C2052e c2052e2 = c2049b.f24661a;
        if (c2052e2.isEmpty()) {
            return;
        }
        if (c2052e.f24637c > 999) {
            ?? t5 = new T(999);
            int i7 = c2052e.f24637c;
            int i10 = 0;
            int i11 = 0;
            while (i10 < i7) {
                t5.put(c2052e.f(i10), c2052e.k(i10));
                i10++;
                i11++;
                if (i11 == 999) {
                    a(aVar, t5);
                    t5.clear();
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                a(aVar, t5);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("SELECT `src`,`type`,`url`,`tvChannelId` FROM `TVChannelUrl` WHERE `tvChannelId` IN (");
        int i12 = c2052e2.f24637c;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append("?");
            if (i13 < i12 - 1) {
                sb2.append(",");
            }
        }
        sb2.append(")");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        T2.c R10 = aVar.R(sb3);
        Iterator it = c2049b.iterator();
        int i14 = 1;
        while (true) {
            C2048a c2048a = (C2048a) it;
            if (!c2048a.hasNext()) {
                try {
                    break;
                } finally {
                    R10.close();
                }
            } else {
                R10.y(i14, (String) c2048a.next());
                i14++;
            }
        }
        int g = P2.j.g(R10, "tvChannelId");
        if (g == -1) {
            return;
        }
        while (R10.J()) {
            List list = (List) c2052e.get(R10.j(g));
            if (list != null) {
                list.add(new e.a(R10.E(0) ? null : R10.j(0), R10.j(1), R10.j(2), R10.j(3)));
            }
        }
    }
}
