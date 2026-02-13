package i3;

import androidx.work.impl.WorkDatabase;
import h3.C1235A;
import h3.C1240b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18356a = h3.z.g("Schedulers");

    public static void a(q3.q qVar, C1235A c1235a, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            c1235a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qVar.j(((q3.p) it.next()).f23403a, currentTimeMillis);
            }
        }
    }

    public static void b(C1240b c1240b, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q3.q C2 = workDatabase.C();
        workDatabase.c();
        try {
            ArrayList d10 = C2.d();
            a(C2, c1240b.f17671d, d10);
            ArrayList c10 = C2.c(c1240b.k);
            a(C2, c1240b.f17671d, c10);
            c10.addAll(d10);
            ArrayList b2 = C2.b();
            workDatabase.v();
            workDatabase.r();
            if (c10.size() > 0) {
                q3.p[] pVarArr = (q3.p[]) c10.toArray(new q3.p[c10.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar.d()) {
                        fVar.c(pVarArr);
                    }
                }
            }
            if (b2.size() > 0) {
                q3.p[] pVarArr2 = (q3.p[]) b2.toArray(new q3.p[b2.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    f fVar2 = (f) it2.next();
                    if (!fVar2.d()) {
                        fVar2.c(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.r();
            throw th;
        }
    }
}
