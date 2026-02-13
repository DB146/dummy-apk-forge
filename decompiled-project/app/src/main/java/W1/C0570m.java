package W1;

import android.util.Log;
import android.view.ViewGroup;
import java.io.Serializable;

/* renamed from: W1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570m extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10510c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f10512e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0570m(Object obj, Object obj2, Object obj3, Serializable serializable, int i7) {
        super(0);
        this.f10508a = i7;
        this.f10509b = obj;
        this.f10510c = obj2;
        this.f10511d = obj3;
        this.f10512e = serializable;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f10508a) {
            case 0:
                C0571n c0571n = (C0571n) this.f10509b;
                k0 k0Var = c0571n.f10518f;
                ViewGroup viewGroup = (ViewGroup) this.f10510c;
                Object obj = this.f10511d;
                Object i7 = k0Var.i(viewGroup, obj);
                c0571n.f10525p = i7;
                if (i7 == null) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                ((kotlin.jvm.internal.v) this.f10512e).f19134a = new A0.K(11, c0571n, viewGroup);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Started executing operations from " + c0571n.f10516d + " to " + c0571n.f10517e);
                }
                return Db.q.f3365a;
            default:
                ((Z0.k) this.f10509b).g((Rb.a) this.f10510c, (Z0.j) this.f10511d, (V0.l) this.f10512e);
                return Db.q.f3365a;
        }
    }
}
