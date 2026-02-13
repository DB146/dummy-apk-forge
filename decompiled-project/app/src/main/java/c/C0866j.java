package c;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import l2.U;

/* renamed from: c.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0866j extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0867k f14039b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0866j(AbstractActivityC0867k abstractActivityC0867k, int i7) {
        super(0);
        this.f14038a = i7;
        this.f14039b = abstractActivityC0867k;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f14038a) {
            case 0:
                AbstractActivityC0867k abstractActivityC0867k = this.f14039b;
                return new U(abstractActivityC0867k.getApplication(), abstractActivityC0867k, abstractActivityC0867k.getIntent() != null ? abstractActivityC0867k.getIntent().getExtras() : null);
            case 1:
                this.f14039b.reportFullyDrawn();
                return Db.q.f3365a;
            case 2:
                AbstractActivityC0867k abstractActivityC0867k2 = this.f14039b;
                return new C0875s(abstractActivityC0867k2.f14052f, new C0866j(abstractActivityC0867k2, 1));
            default:
                AbstractActivityC0867k abstractActivityC0867k3 = this.f14039b;
                C0853A c0853a = new C0853A(new RunnableC0859c(abstractActivityC0867k3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0867k3.f18773a.a(new C0861e(c0853a, abstractActivityC0867k3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Aa.j(12, abstractActivityC0867k3, c0853a));
                    }
                }
                return c0853a;
        }
    }
}
