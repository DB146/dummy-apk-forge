package hb;

import ib.C1360b;
import java.util.ArrayList;
import java.util.Objects;
import u.C2054g;
import xb.AbstractC2275c;
import y7.u0;

/* renamed from: hb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1268a implements InterfaceC1269b, InterfaceC1270c {

    /* renamed from: a, reason: collision with root package name */
    public C2054g f17921a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f17922b;

    public static void f(C2054g c2054g) {
        if (c2054g == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c2054g.f24676d) {
            if (obj instanceof InterfaceC1269b) {
                try {
                    ((InterfaceC1269b) obj).b();
                } catch (Throwable th) {
                    u0.L(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new C1360b(arrayList);
            }
            throw AbstractC2275c.b((Throwable) arrayList.get(0));
        }
    }

    @Override // hb.InterfaceC1270c
    public final boolean a(InterfaceC1269b interfaceC1269b) {
        Object obj;
        Objects.requireNonNull(interfaceC1269b, "disposable is null");
        if (this.f17922b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f17922b) {
                    return false;
                }
                C2054g c2054g = this.f17921a;
                if (c2054g != null) {
                    Object[] objArr = c2054g.f24676d;
                    int i7 = c2054g.f24673a;
                    int hashCode = interfaceC1269b.hashCode() * (-1640531527);
                    int i10 = (hashCode ^ (hashCode >>> 16)) & i7;
                    Object obj2 = objArr[i10];
                    if (obj2 != null) {
                        if (obj2.equals(interfaceC1269b)) {
                            c2054g.e(objArr, i10, i7);
                            return true;
                        }
                        do {
                            i10 = (i10 + 1) & i7;
                            obj = objArr[i10];
                            if (obj == null) {
                            }
                        } while (!obj.equals(interfaceC1269b));
                        c2054g.e(objArr, i10, i7);
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        if (this.f17922b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f17922b) {
                    return;
                }
                this.f17922b = true;
                C2054g c2054g = this.f17921a;
                this.f17921a = null;
                f(c2054g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // hb.InterfaceC1270c
    public final boolean c(InterfaceC1269b interfaceC1269b) {
        if (!a(interfaceC1269b)) {
            return false;
        }
        interfaceC1269b.b();
        return true;
    }

    @Override // hb.InterfaceC1270c
    public final boolean d(InterfaceC1269b interfaceC1269b) {
        Objects.requireNonNull(interfaceC1269b, "disposable is null");
        if (!this.f17922b) {
            synchronized (this) {
                try {
                    if (!this.f17922b) {
                        C2054g c2054g = this.f17921a;
                        if (c2054g == null) {
                            c2054g = new C2054g();
                            this.f17921a = c2054g;
                        }
                        c2054g.a(interfaceC1269b);
                        return true;
                    }
                } finally {
                }
            }
        }
        interfaceC1269b.b();
        return false;
    }

    public final void e() {
        if (this.f17922b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f17922b) {
                    return;
                }
                C2054g c2054g = this.f17921a;
                this.f17921a = null;
                f(c2054g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f17922b;
    }
}
