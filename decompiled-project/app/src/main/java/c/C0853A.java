package c;

import B0.C0200s;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;
import l2.C1481z;
import l2.EnumC1474s;
import l2.InterfaceC1479x;

/* renamed from: c.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853A {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f14007a;

    /* renamed from: b, reason: collision with root package name */
    public final Eb.l f14008b = new Eb.l();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0876t f14009c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f14010d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f14011e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14012f;
    public boolean g;

    public C0853A(Runnable runnable) {
        this.f14007a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            this.f14010d = i7 >= 34 ? new C0880x(new C0877u(this, 0), new C0877u(this, 1), new C0878v(this, 0), new C0878v(this, 1)) : new C0879w(new C0878v(this, 2), 0);
        }
    }

    public final void a(InterfaceC1479x owner, AbstractC0876t onBackPressedCallback) {
        kotlin.jvm.internal.l.e(owner, "owner");
        kotlin.jvm.internal.l.e(onBackPressedCallback, "onBackPressedCallback");
        C1481z w10 = owner.w();
        if (w10.f19242d == EnumC1474s.f19227a) {
            return;
        }
        onBackPressedCallback.f14069b.add(new C0881y(this, w10, onBackPressedCallback));
        e();
        onBackPressedCallback.f14070c = new C0200s(0, this, C0853A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        AbstractC0876t abstractC0876t;
        AbstractC0876t abstractC0876t2 = this.f14009c;
        if (abstractC0876t2 == null) {
            Eb.l lVar = this.f14008b;
            ListIterator listIterator = lVar.listIterator(lVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0876t = 0;
                    break;
                } else {
                    abstractC0876t = listIterator.previous();
                    if (((AbstractC0876t) abstractC0876t).f14068a) {
                        break;
                    }
                }
            }
            abstractC0876t2 = abstractC0876t;
        }
        this.f14009c = null;
        if (abstractC0876t2 != null) {
            abstractC0876t2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        AbstractC0876t abstractC0876t;
        AbstractC0876t abstractC0876t2 = this.f14009c;
        if (abstractC0876t2 == null) {
            Eb.l lVar = this.f14008b;
            ListIterator listIterator = lVar.listIterator(lVar.b());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0876t = 0;
                    break;
                } else {
                    abstractC0876t = listIterator.previous();
                    if (((AbstractC0876t) abstractC0876t).f14068a) {
                        break;
                    }
                }
            }
            abstractC0876t2 = abstractC0876t;
        }
        this.f14009c = null;
        if (abstractC0876t2 != null) {
            abstractC0876t2.b();
        } else {
            this.f14007a.run();
        }
    }

    public final void d(boolean z8) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f14011e;
        OnBackInvokedCallback onBackInvokedCallback = this.f14010d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z8 && !this.f14012f) {
            AbstractC0862f.f(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f14012f = true;
        } else {
            if (z8 || !this.f14012f) {
                return;
            }
            AbstractC0862f.h(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f14012f = false;
        }
    }

    public final void e() {
        boolean z8 = this.g;
        boolean z10 = false;
        Eb.l lVar = this.f14008b;
        if (lVar == null || !lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0876t) it.next()).f14068a) {
                    z10 = true;
                    break;
                }
            }
        }
        this.g = z10;
        if (z10 == z8 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z10);
    }
}
