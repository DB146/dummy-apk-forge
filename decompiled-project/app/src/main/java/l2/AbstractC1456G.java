package l2;

import android.os.Looper;
import java.util.Iterator;
import java.util.Map;
import p.C1843a;
import q.C1868b;
import q.C1869c;
import q.C1870d;
import q.C1872f;

/* renamed from: l2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1456G {
    public static final Object k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f19160a;

    /* renamed from: b, reason: collision with root package name */
    public final C1872f f19161b;

    /* renamed from: c, reason: collision with root package name */
    public int f19162c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19163d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f19164e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f19165f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19166h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19167i;
    public final RunnableC1452C j;

    public AbstractC1456G() {
        this.f19160a = new Object();
        this.f19161b = new C1872f();
        this.f19162c = 0;
        Object obj = k;
        this.f19165f = obj;
        this.j = new RunnableC1452C(this);
        this.f19164e = obj;
        this.g = -1;
    }

    public AbstractC1456G(Object obj) {
        this.f19160a = new Object();
        this.f19161b = new C1872f();
        this.f19162c = 0;
        this.f19165f = k;
        this.j = new RunnableC1452C(this);
        this.f19164e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        C1843a.a0().f22964c.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(y.S.b("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(AbstractC1455F abstractC1455F) {
        if (abstractC1455F.f19157b) {
            if (!abstractC1455F.d()) {
                abstractC1455F.a(false);
                return;
            }
            int i7 = abstractC1455F.f19158c;
            int i10 = this.g;
            if (i7 >= i10) {
                return;
            }
            abstractC1455F.f19158c = i10;
            abstractC1455F.f19156a.b(this.f19164e);
        }
    }

    public final void c(AbstractC1455F abstractC1455F) {
        if (this.f19166h) {
            this.f19167i = true;
            return;
        }
        this.f19166h = true;
        do {
            this.f19167i = false;
            if (abstractC1455F != null) {
                b(abstractC1455F);
                abstractC1455F = null;
            } else {
                C1872f c1872f = this.f19161b;
                c1872f.getClass();
                C1870d c1870d = new C1870d(c1872f);
                c1872f.f23337c.put(c1870d, Boolean.FALSE);
                while (c1870d.hasNext()) {
                    b((AbstractC1455F) ((Map.Entry) c1870d.next()).getValue());
                    if (this.f19167i) {
                        break;
                    }
                }
            }
        } while (this.f19167i);
        this.f19166h = false;
    }

    public final Object d() {
        Object obj = this.f19164e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(InterfaceC1479x interfaceC1479x, I i7) {
        Object obj;
        a("observe");
        if (interfaceC1479x.w().f19242d == EnumC1474s.f19227a) {
            return;
        }
        C1454E c1454e = new C1454E(this, interfaceC1479x, i7);
        C1872f c1872f = this.f19161b;
        C1869c b2 = c1872f.b(i7);
        if (b2 != null) {
            obj = b2.f23329b;
        } else {
            C1869c c1869c = new C1869c(i7, c1454e);
            c1872f.f23338d++;
            C1869c c1869c2 = c1872f.f23336b;
            if (c1869c2 == null) {
                c1872f.f23335a = c1869c;
                c1872f.f23336b = c1869c;
            } else {
                c1869c2.f23330c = c1869c;
                c1869c.f23331d = c1869c2;
                c1872f.f23336b = c1869c;
            }
            obj = null;
        }
        AbstractC1455F abstractC1455F = (AbstractC1455F) obj;
        if (abstractC1455F != null && !abstractC1455F.c(interfaceC1479x)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1455F != null) {
            return;
        }
        interfaceC1479x.w().a(c1454e);
    }

    public final void f(I i7) {
        Object obj;
        a("observeForever");
        AbstractC1455F abstractC1455F = new AbstractC1455F(this, i7);
        C1872f c1872f = this.f19161b;
        C1869c b2 = c1872f.b(i7);
        if (b2 != null) {
            obj = b2.f23329b;
        } else {
            C1869c c1869c = new C1869c(i7, abstractC1455F);
            c1872f.f23338d++;
            C1869c c1869c2 = c1872f.f23336b;
            if (c1869c2 == null) {
                c1872f.f23335a = c1869c;
                c1872f.f23336b = c1869c;
            } else {
                c1869c2.f23330c = c1869c;
                c1869c.f23331d = c1869c2;
                c1872f.f23336b = c1869c;
            }
            obj = null;
        }
        AbstractC1455F abstractC1455F2 = (AbstractC1455F) obj;
        if (abstractC1455F2 instanceof C1454E) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1455F2 != null) {
            return;
        }
        abstractC1455F.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(I i7) {
        a("removeObserver");
        AbstractC1455F abstractC1455F = (AbstractC1455F) this.f19161b.i(i7);
        if (abstractC1455F == null) {
            return;
        }
        abstractC1455F.b();
        abstractC1455F.a(false);
    }

    public final void j(InterfaceC1479x interfaceC1479x) {
        a("removeObservers");
        Iterator it = this.f19161b.iterator();
        while (true) {
            C1868b c1868b = (C1868b) it;
            if (!c1868b.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) c1868b.next();
            if (((AbstractC1455F) entry.getValue()).c(interfaceC1479x)) {
                i((I) entry.getKey());
            }
        }
    }

    public abstract void k(Object obj);
}
