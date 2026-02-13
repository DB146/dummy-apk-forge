package v2;

import fc.b0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: v2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2136h implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24977a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2137i f24978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2133e f24979c;

    public /* synthetic */ C2136h(C2137i c2137i, C2133e c2133e) {
        this.f24978b = c2137i;
        this.f24979c = c2133e;
    }

    public /* synthetic */ C2136h(C2137i c2137i, C2133e c2133e, boolean z8) {
        this.f24978b = c2137i;
        this.f24979c = c2133e;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f24977a) {
            case 0:
                C2137i c2137i = this.f24978b;
                C2133e entry = this.f24979c;
                kotlin.jvm.internal.l.e(entry, "entry");
                b0 b0Var = c2137i.f24982c;
                Set set = (Set) b0Var.getValue();
                kotlin.jvm.internal.l.e(set, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(Eb.B.F(set.size()));
                boolean z8 = false;
                for (Object obj : set) {
                    boolean z10 = true;
                    if (!z8 && kotlin.jvm.internal.l.a(obj, entry)) {
                        z8 = true;
                        z10 = false;
                    }
                    if (z10) {
                        linkedHashSet.add(obj);
                    }
                }
                b0Var.j(null, linkedHashSet);
                return Db.q.f3365a;
            default:
                C2137i c2137i2 = this.f24978b;
                C2133e c2133e = this.f24979c;
                synchronized (c2137i2.f24980a) {
                    try {
                        b0 b0Var2 = c2137i2.f24981b;
                        Iterable iterable = (Iterable) b0Var2.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (kotlin.jvm.internal.l.a((C2133e) obj2, c2133e)) {
                                b0Var2.getClass();
                                b0Var2.j(null, arrayList);
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        b0Var2.getClass();
                        b0Var2.j(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Db.q.f3365a;
        }
    }
}
