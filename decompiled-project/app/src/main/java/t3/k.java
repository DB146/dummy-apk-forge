package t3;

import M1.C0405u;
import fc.C1173u;
import fc.Q;
import h3.z;
import q3.p;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24475a;

    static {
        String g = z.g("ConstraintTrkngWrkr");
        kotlin.jvm.internal.l.d(g, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        f24475a = g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(O3.c cVar, p pVar, Jb.c cVar2) {
        C2026i c2026i;
        int i7;
        if (cVar2 instanceof C2026i) {
            C2026i c2026i2 = (C2026i) cVar2;
            int i10 = c2026i2.f24473b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2026i2.f24473b = i10 - Integer.MIN_VALUE;
                c2026i = c2026i2;
                Object obj = c2026i.f24472a;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c2026i.f24473b;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    C0405u c0405u = new C0405u(new C1173u(cVar.e(pVar), new C2027j(pVar, null), 1), 4);
                    c2026i.f24473b = 1;
                    obj = Q.j(c0405u, c2026i);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                return new Integer(((m3.b) obj).f19778a);
            }
        }
        c2026i = new Jb.c(cVar2);
        Object obj2 = c2026i.f24472a;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c2026i.f24473b;
        if (i7 != 0) {
        }
        return new Integer(((m3.b) obj2).f19778a);
    }
}
