package B0;

import Q.C0506o;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class N extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public static final N f1751b = new N(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final N f1752c = new N(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final N f1753d = new N(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final N f1754e = new N(2, 3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(int i7, int i10) {
        super(i7);
        this.f1755a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1755a) {
            case 0:
                H0.n nVar = (H0.n) obj2;
                H0.i iVar = ((H0.n) obj).f4505d;
                H0.t tVar = H0.q.f4553r;
                Object g = iVar.f4494a.g(tVar);
                if (g == null) {
                    g = Float.valueOf(0.0f);
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = nVar.f4505d.f4494a.g(tVar);
                if (g2 == null) {
                    g2 = Float.valueOf(0.0f);
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) g2).floatValue()));
            case 1:
                C0506o c0506o = (C0506o) obj;
                int intValue = ((Number) obj2).intValue();
                if (!c0506o.K(intValue & 1, (intValue & 3) != 2)) {
                    c0506o.N();
                }
                return Db.q.f3365a;
            case 2:
                ((InterfaceC0211x0) obj).I((Matrix) obj2);
                return Db.q.f3365a;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                return Db.q.f3365a;
        }
    }
}
