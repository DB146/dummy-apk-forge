package m3;

import B0.C0170c0;
import B0.c1;
import Db.q;
import P3.o;
import ac.n;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import cc.F;
import ec.r;
import h3.C1243e;
import h3.z;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class e extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f19782a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1243e f19784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f19785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C1243e c1243e, f fVar, Hb.d dVar) {
        super(2, dVar);
        this.f19784c = c1243e;
        this.f19785d = fVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        e eVar = new e(this.f19784c, this.f19785d, dVar);
        eVar.f19783b = obj;
        return eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((r) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.r, java.lang.Object] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        c1 c1Var;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f19782a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            r rVar = (r) this.f19783b;
            NetworkRequest networkRequest = this.f19784c.f17683b.f23664a;
            if (networkRequest == null) {
                ec.q qVar = (ec.q) rVar;
                qVar.getClass();
                qVar.f16900d.k(false, null);
                return q.f3365a;
            }
            C0170c0 c0170c0 = new C0170c0(24, F.B(rVar, null, 0, new d(this.f19785d, rVar, null), 3), rVar);
            if (Build.VERSION.SDK_INT >= 30) {
                i iVar = i.f19791a;
                ConnectivityManager connectivityManager = this.f19785d.f19786a;
                iVar.getClass();
                synchronized (i.f19792b) {
                    LinkedHashMap linkedHashMap = i.f19793c;
                    boolean isEmpty = linkedHashMap.isEmpty();
                    linkedHashMap.put(c0170c0, networkRequest);
                    if (isEmpty) {
                        z.e().a(l.f19799a, "NetworkRequestConstraintController register shared callback");
                        connectivityManager.registerDefaultNetworkCallback(iVar);
                    }
                }
                c1Var = new c1(c0170c0, connectivityManager, iVar, 6);
            } else {
                int i10 = o.f7836c;
                ConnectivityManager connectivityManager2 = this.f19785d.f19786a;
                o oVar = new o(c0170c0);
                ?? obj2 = new Object();
                try {
                    z.e().a(l.f19799a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequest, oVar);
                    obj2.f19130a = true;
                } catch (RuntimeException e2) {
                    if (!n.S(e2.getClass().getName(), "TooManyRequestsException", false)) {
                        throw e2;
                    }
                    z.e().b(l.f19799a, "NetworkRequestConstraintController couldn't register callback", e2);
                    c0170c0.invoke(new b(7));
                }
                c1Var = new c1((Object) obj2, connectivityManager2, oVar, 5);
            }
            Q1.e eVar = new Q1.e(1, c1Var);
            this.f19782a = 1;
            if (Tb.a.c(rVar, eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return q.f3365a;
    }
}
