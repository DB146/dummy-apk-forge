package Y0;

import A0.L;
import l2.InterfaceC1479x;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public static final l f11118b = new l(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f11119c = new l(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f11120d = new l(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final l f11121e = new l(2, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final l f11122f = new l(2, 4);

    /* renamed from: u, reason: collision with root package name */
    public static final l f11123u = new l(2, 5);

    /* renamed from: v, reason: collision with root package name */
    public static final l f11124v = new l(2, 6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i7, int i10) {
        super(i7);
        this.f11125a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        switch (this.f11125a) {
            case 0:
                androidx.compose.ui.viewinterop.a.c((L) obj).setUpdateBlock((Rb.c) obj2);
                return Db.q.f3365a;
            case 1:
                androidx.compose.ui.viewinterop.a.c((L) obj).setReleaseBlock((Rb.c) obj2);
                return Db.q.f3365a;
            case 2:
                androidx.compose.ui.viewinterop.a.c((L) obj).setModifier((c0.m) obj2);
                return Db.q.f3365a;
            case 3:
                androidx.compose.ui.viewinterop.a.c((L) obj).setDensity((V0.c) obj2);
                return Db.q.f3365a;
            case 4:
                androidx.compose.ui.viewinterop.a.c((L) obj).setLifecycleOwner((InterfaceC1479x) obj2);
                return Db.q.f3365a;
            case 5:
                androidx.compose.ui.viewinterop.a.c((L) obj).setSavedStateRegistryOwner((Q2.e) obj2);
                return Db.q.f3365a;
            default:
                q c10 = androidx.compose.ui.viewinterop.a.c((L) obj);
                int ordinal = ((V0.l) obj2).ordinal();
                if (ordinal != 0) {
                    i7 = 1;
                    if (ordinal != 1) {
                        throw new Db.d(1);
                    }
                } else {
                    i7 = 0;
                }
                c10.setLayoutDirection(i7);
                return Db.q.f3365a;
        }
    }
}
