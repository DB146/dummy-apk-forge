package m4;

import A9.C0146v0;
import P4.C0466n;
import android.content.Context;
import ea.C1112g;
import java.util.HashMap;
import m5.C1621s;

/* renamed from: m4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1583n implements M6.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f20441b;

    public /* synthetic */ C1583n(Context context, int i7) {
        this.f20440a = i7;
        this.f20441b = context;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, s4.h] */
    @Override // M6.q
    public final Object get() {
        C1621s c1621s;
        switch (this.f20440a) {
            case 0:
                return new C1577k(this.f20441b);
            case 1:
                return new C0466n(new C1112g(this.f20441b), new Object());
            case 2:
                return new k5.q(this.f20441b);
            default:
                Context context = this.f20441b;
                N6.t0 t0Var = C1621s.f20642n;
                synchronized (C1621s.class) {
                    try {
                        if (C1621s.f20648t == null) {
                            C0146v0 c0146v0 = new C0146v0(context);
                            C1621s.f20648t = new C1621s((Context) c0146v0.f1430c, (HashMap) c0146v0.f1431d, c0146v0.f1429b, (n5.x) c0146v0.f1432e, c0146v0.f1428a);
                        }
                        c1621s = C1621s.f20648t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1621s;
        }
    }
}
