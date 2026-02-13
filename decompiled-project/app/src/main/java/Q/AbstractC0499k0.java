package Q;

/* renamed from: Q.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0499k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Q f8410a;

    public AbstractC0499k0(Rb.a aVar) {
        this.f8410a = new Q(aVar);
    }

    public abstract C0501l0 a(Object obj);

    public U0 b() {
        return this.f8410a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final U0 c(C0501l0 c0501l0, U0 u02) {
        U0 t02;
        G g = null;
        if (u02 instanceof G) {
            if (c0501l0.f8415d) {
                g = (G) u02;
                g.f8303a.setValue(c0501l0.a());
            }
        } else if (u02 instanceof T0) {
            if ((c0501l0.f8413b || c0501l0.f8416e != null) && !c0501l0.f8415d) {
                T0 t03 = (T0) u02;
                if (kotlin.jvm.internal.l.a(c0501l0.a(), t03.f8370a)) {
                    g = t03;
                }
            }
        } else if (u02 instanceof A) {
            c0501l0.getClass();
            kotlin.jvm.internal.m mVar = ((A) u02).f8265a;
        }
        if (g != null) {
            return g;
        }
        if (c0501l0.f8415d) {
            H0 h02 = c0501l0.f8414c;
            if (h02 == null) {
                h02 = S.f8368f;
            }
            t02 = new G(new C0487e0(c0501l0.f8416e, h02));
        } else {
            t02 = new T0(c0501l0.a());
        }
        return t02;
    }
}
