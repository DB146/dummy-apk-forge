package G7;

import java.util.HashMap;
import p7.n;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4365a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Y6.i f4366b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.e f4367c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.c f4368d;

    public g(Y6.i iVar, n nVar, n nVar2) {
        this.f4366b = iVar;
        this.f4367c = new q3.e(nVar);
        this.f4368d = new q3.c(nVar2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [L7.d, java.lang.Object] */
    public final synchronized f a(L7.k kVar) {
        f fVar;
        try {
            fVar = (f) this.f4365a.get(kVar);
            if (fVar == null) {
                ?? obj = new Object();
                obj.f6335h = 2;
                obj.j = false;
                Y6.i iVar = this.f4366b;
                iVar.b();
                if (!"[DEFAULT]".equals(iVar.f12042b)) {
                    Y6.i iVar2 = this.f4366b;
                    iVar2.b();
                    obj.e(iVar2.f12042b);
                }
                Y6.i iVar3 = this.f4366b;
                synchronized (obj) {
                    obj.f6336i = iVar3;
                }
                obj.f6331c = this.f4367c;
                obj.f6332d = this.f4368d;
                f fVar2 = new f(obj, kVar);
                this.f4365a.put(kVar, fVar2);
                fVar = fVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return fVar;
    }
}
