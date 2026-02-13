package ab;

import android.app.Activity;
import android.app.Application;
import c.AbstractActivityC0867k;
import cb.InterfaceC0919a;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l2.c0;
import oa.C1827b;
import oa.C1829d;

/* renamed from: ab.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0792b implements cb.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12800a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12801b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Activity f12802c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12803d;

    /* renamed from: e, reason: collision with root package name */
    public volatile InterfaceC0919a f12804e;

    public C0792b(Activity activity) {
        this.f12802c = activity;
        this.f12803d = new C0792b((AbstractActivityC0867k) activity);
    }

    public C0792b(AbstractActivityC0867k abstractActivityC0867k) {
        this.f12802c = abstractActivityC0867k;
        this.f12803d = abstractActivityC0867k;
    }

    public static c0 c(AbstractActivityC0867k owner, AbstractActivityC0867k abstractActivityC0867k) {
        Za.d dVar = new Za.d(abstractActivityC0867k, 1);
        l.e(owner, "owner");
        return new c0(owner.s(), dVar, owner.o());
    }

    public C1827b a() {
        String str;
        Activity activity = this.f12802c;
        if (activity.getApplication() instanceof cb.b) {
            C1829d c1829d = (C1829d) ((InterfaceC0791a) c2.i.p(InterfaceC0791a.class, (C0792b) this.f12803d));
            return new C1827b(c1829d.f22148a, c1829d.f22149b);
        }
        StringBuilder sb2 = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(activity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + activity.getApplication().getClass();
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    public R7.a b() {
        C0792b c0792b = (C0792b) this.f12803d;
        return ((C0794d) c((AbstractActivityC0867k) c0792b.f12802c, (AbstractActivityC0867k) c0792b.f12803d).a(w.a(C0794d.class))).f12806b;
    }

    @Override // cb.b
    public final Object e() {
        switch (this.f12800a) {
            case 0:
                if (((C1827b) this.f12804e) == null) {
                    synchronized (this.f12801b) {
                        try {
                            if (((C1827b) this.f12804e) == null) {
                                this.f12804e = a();
                            }
                        } finally {
                        }
                    }
                }
                return (C1827b) this.f12804e;
            default:
                if (((C1829d) this.f12804e) == null) {
                    synchronized (this.f12801b) {
                        if (((C1829d) this.f12804e) == null) {
                            this.f12804e = ((C0794d) c((AbstractActivityC0867k) this.f12802c, (AbstractActivityC0867k) this.f12803d).a(w.a(C0794d.class))).f12805a;
                        }
                    }
                }
                return (C1829d) this.f12804e;
        }
    }
}
