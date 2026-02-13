package A0;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;

/* renamed from: A0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015f extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0015f f204b = new C0015f(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0015f f205c = new C0015f(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0015f f206d = new C0015f(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0015f f207e = new C0015f(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0015f f208f = new C0015f(1, 4);

    /* renamed from: u, reason: collision with root package name */
    public static final C0015f f209u = new C0015f(1, 5);

    /* renamed from: v, reason: collision with root package name */
    public static final C0015f f210v = new C0015f(1, 6);

    /* renamed from: w, reason: collision with root package name */
    public static final C0015f f211w = new C0015f(1, 7);

    /* renamed from: x, reason: collision with root package name */
    public static final C0015f f212x = new C0015f(1, 8);

    /* renamed from: y, reason: collision with root package name */
    public static final C0015f f213y = new C0015f(1, 9);

    /* renamed from: z, reason: collision with root package name */
    public static final C0015f f214z = new C0015f(1, 10);

    /* renamed from: A, reason: collision with root package name */
    public static final C0015f f202A = new C0015f(1, 11);

    /* renamed from: B, reason: collision with root package name */
    public static final C0015f f203B = new C0015f(1, 12);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0015f(int i7, int i10) {
        super(i7);
        this.f215a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f215a) {
            case 0:
                ((C0011d) obj).s0();
                return Db.q.f3365a;
            case 1:
                x0 x0Var = (x0) obj;
                if (x0Var.r()) {
                    x0Var.f326b.S(x0Var);
                }
                return Db.q.f3365a;
            case 2:
                s0 s0Var = ((n0) obj).f292T;
                if (s0Var != null) {
                    s0Var.invalidate();
                }
                return Db.q.f3365a;
            case 3:
                n0 n0Var = (n0) obj;
                if (n0Var.r() && n0Var.N0(true)) {
                    L l10 = n0Var.f293z;
                    P p10 = l10.f61T;
                    if (p10.f101l > 0) {
                        if (p10.k || p10.j) {
                            l10.R(false);
                        }
                        p10.f105p.U();
                    }
                    B0.D d10 = (B0.D) O.a(l10);
                    d10.getRectManager().e(l10);
                    ((S.e) d10.f1621d0.f161e.f23391b).b(l10);
                    l10.f71b0 = true;
                    d10.F(null);
                }
                return Db.q.f3365a;
            case 4:
                q0 q0Var = (q0) obj;
                if (q0Var.r()) {
                    q0Var.f300a.z();
                }
                return Db.q.f3365a;
            case 5:
                kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((u0) obj).r());
            case 6:
                L l11 = (L) obj;
                if (l11.F()) {
                    l11.R(false);
                }
                return Db.q.f3365a;
            case 7:
                L l12 = (L) obj;
                if (l12.F()) {
                    l12.R(false);
                }
                return Db.q.f3365a;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                L l13 = (L) obj;
                if (l13.F()) {
                    l13.P(false);
                }
                return Db.q.f3365a;
            case 9:
                L l14 = (L) obj;
                if (l14.F()) {
                    l14.P(false);
                }
                return Db.q.f3365a;
            case 10:
                L l15 = (L) obj;
                if (l15.F()) {
                    L.Q(l15, false, 7);
                }
                return Db.q.f3365a;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                L l16 = (L) obj;
                if (l16.F()) {
                    L.S(l16, false, 7);
                }
                return Db.q.f3365a;
            default:
                L l17 = (L) obj;
                if (l17.F()) {
                    l17.D();
                }
                return Db.q.f3365a;
        }
    }
}
