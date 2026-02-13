package l2;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p.C1843a;
import q.C1867a;
import q.C1868b;
import q.C1869c;
import q.C1870d;

/* renamed from: l2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481z {

    /* renamed from: a, reason: collision with root package name */
    public c0 f19239a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19240b;

    /* renamed from: c, reason: collision with root package name */
    public C1867a f19241c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC1474s f19242d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f19243e;

    /* renamed from: f, reason: collision with root package name */
    public int f19244f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19245h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f19246i;
    public final fc.b0 j;

    public C1481z(InterfaceC1479x provider) {
        kotlin.jvm.internal.l.e(provider, "provider");
        this.f19239a = new c0();
        this.f19240b = true;
        this.f19241c = new C1867a();
        EnumC1474s enumC1474s = EnumC1474s.f19228b;
        this.f19242d = enumC1474s;
        this.f19246i = new ArrayList();
        this.f19243e = new WeakReference(provider);
        this.j = fc.Q.c(enumC1474s);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [l2.y, java.lang.Object] */
    public final void a(InterfaceC1478w observer) {
        InterfaceC1477v c1464h;
        InterfaceC1479x interfaceC1479x;
        ArrayList arrayList = this.f19246i;
        Object obj = null;
        kotlin.jvm.internal.l.e(observer, "observer");
        c("addObserver");
        EnumC1474s enumC1474s = this.f19242d;
        EnumC1474s enumC1474s2 = EnumC1474s.f19227a;
        if (enumC1474s != enumC1474s2) {
            enumC1474s2 = EnumC1474s.f19228b;
        }
        ?? obj2 = new Object();
        HashMap hashMap = AbstractC1451B.f19151a;
        boolean z8 = observer instanceof InterfaceC1477v;
        boolean z10 = observer instanceof InterfaceC1462f;
        if (z8 && z10) {
            c1464h = new C1464h((InterfaceC1462f) observer, (InterfaceC1477v) observer);
        } else if (z10) {
            c1464h = new C1464h((InterfaceC1462f) observer, (InterfaceC1477v) null);
        } else if (z8) {
            c1464h = (InterfaceC1477v) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (AbstractC1451B.b(cls) == 2) {
                Object obj3 = AbstractC1451B.f19152b.get(cls);
                kotlin.jvm.internal.l.b(obj3);
                List list = (List) obj3;
                if (list.size() == 1) {
                    AbstractC1451B.a((Constructor) list.get(0), observer);
                    throw null;
                }
                int size = list.size();
                InterfaceC1469m[] interfaceC1469mArr = new InterfaceC1469m[size];
                if (size > 0) {
                    AbstractC1451B.a((Constructor) list.get(0), observer);
                    throw null;
                }
                c1464h = new C1461e(interfaceC1469mArr, r2);
            } else {
                c1464h = new C1464h(observer);
            }
        }
        obj2.f19238b = c1464h;
        obj2.f19237a = enumC1474s2;
        C1867a c1867a = this.f19241c;
        C1869c b2 = c1867a.b(observer);
        if (b2 != null) {
            obj = b2.f23329b;
        } else {
            HashMap hashMap2 = c1867a.f23324e;
            C1869c c1869c = new C1869c(observer, obj2);
            c1867a.f23338d++;
            C1869c c1869c2 = c1867a.f23336b;
            if (c1869c2 == null) {
                c1867a.f23335a = c1869c;
                c1867a.f23336b = c1869c;
            } else {
                c1869c2.f23330c = c1869c;
                c1869c.f23331d = c1869c2;
                c1867a.f23336b = c1869c;
            }
            hashMap2.put(observer, c1869c);
        }
        if (((C1480y) obj) == null && (interfaceC1479x = (InterfaceC1479x) this.f19243e.get()) != null) {
            r2 = (this.f19244f != 0 || this.g) ? 1 : 0;
            EnumC1474s b10 = b(observer);
            this.f19244f++;
            while (obj2.f19237a.compareTo(b10) < 0 && this.f19241c.f23324e.containsKey(observer)) {
                arrayList.add(obj2.f19237a);
                C1472p c1472p = r.Companion;
                EnumC1474s enumC1474s3 = obj2.f19237a;
                c1472p.getClass();
                r a9 = C1472p.a(enumC1474s3);
                if (a9 == null) {
                    throw new IllegalStateException("no event up from " + obj2.f19237a);
                }
                obj2.a(interfaceC1479x, a9);
                arrayList.remove(arrayList.size() - 1);
                b10 = b(observer);
            }
            if (r2 == 0) {
                h();
            }
            this.f19244f--;
        }
    }

    public final EnumC1474s b(InterfaceC1478w interfaceC1478w) {
        HashMap hashMap = this.f19241c.f23324e;
        C1869c c1869c = hashMap.containsKey(interfaceC1478w) ? ((C1869c) hashMap.get(interfaceC1478w)).f23331d : null;
        EnumC1474s enumC1474s = c1869c != null ? ((C1480y) c1869c.f23329b).f19237a : null;
        ArrayList arrayList = this.f19246i;
        EnumC1474s enumC1474s2 = arrayList.isEmpty() ? null : (EnumC1474s) h3.o.k(1, arrayList);
        EnumC1474s state1 = this.f19242d;
        kotlin.jvm.internal.l.e(state1, "state1");
        if (enumC1474s == null || enumC1474s.compareTo(state1) >= 0) {
            enumC1474s = state1;
        }
        return (enumC1474s2 == null || enumC1474s2.compareTo(enumC1474s) >= 0) ? enumC1474s : enumC1474s2;
    }

    public final void c(String str) {
        if (this.f19240b) {
            C1843a.a0().f22964c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(y.S.b("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(r event) {
        kotlin.jvm.internal.l.e(event, "event");
        c("handleLifecycleEvent");
        e(event.a());
    }

    public final void e(EnumC1474s next) {
        if (this.f19242d == next) {
            return;
        }
        InterfaceC1479x interfaceC1479x = (InterfaceC1479x) this.f19243e.get();
        EnumC1474s current = this.f19242d;
        kotlin.jvm.internal.l.e(current, "current");
        kotlin.jvm.internal.l.e(next, "next");
        if (current == EnumC1474s.f19228b && next == EnumC1474s.f19227a) {
            throw new IllegalStateException(("State must be at least '" + EnumC1474s.f19229c + "' to be moved to '" + next + "' in component " + interfaceC1479x).toString());
        }
        EnumC1474s enumC1474s = EnumC1474s.f19227a;
        if (current == enumC1474s && current != next) {
            throw new IllegalStateException(("State is '" + enumC1474s + "' and cannot be moved to `" + next + "` in component " + interfaceC1479x).toString());
        }
        this.f19242d = next;
        if (this.g || this.f19244f != 0) {
            this.f19245h = true;
            return;
        }
        this.g = true;
        h();
        this.g = false;
        if (this.f19242d == enumC1474s) {
            this.f19241c = new C1867a();
        }
    }

    public final void f(InterfaceC1478w observer) {
        kotlin.jvm.internal.l.e(observer, "observer");
        c("removeObserver");
        this.f19241c.i(observer);
    }

    public final void g(EnumC1474s state) {
        kotlin.jvm.internal.l.e(state, "state");
        c("setCurrentState");
        e(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f19245h = false;
        r7.j.i(r7.f19242d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC1479x interfaceC1479x = (InterfaceC1479x) this.f19243e.get();
        if (interfaceC1479x == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1867a c1867a = this.f19241c;
            if (c1867a.f23338d != 0) {
                C1869c c1869c = c1867a.f23335a;
                kotlin.jvm.internal.l.b(c1869c);
                EnumC1474s enumC1474s = ((C1480y) c1869c.f23329b).f19237a;
                C1869c c1869c2 = this.f19241c.f23336b;
                kotlin.jvm.internal.l.b(c1869c2);
                EnumC1474s enumC1474s2 = ((C1480y) c1869c2.f23329b).f19237a;
                if (enumC1474s == enumC1474s2 && this.f19242d == enumC1474s2) {
                    break;
                }
                this.f19245h = false;
                EnumC1474s enumC1474s3 = this.f19242d;
                C1869c c1869c3 = this.f19241c.f23335a;
                kotlin.jvm.internal.l.b(c1869c3);
                if (enumC1474s3.compareTo(((C1480y) c1869c3.f23329b).f19237a) < 0) {
                    C1867a c1867a2 = this.f19241c;
                    C1868b c1868b = new C1868b(c1867a2.f23336b, c1867a2.f23335a, 1);
                    c1867a2.f23337c.put(c1868b, Boolean.FALSE);
                    while (c1868b.hasNext() && !this.f19245h) {
                        Map.Entry entry = (Map.Entry) c1868b.next();
                        kotlin.jvm.internal.l.b(entry);
                        InterfaceC1478w interfaceC1478w = (InterfaceC1478w) entry.getKey();
                        C1480y c1480y = (C1480y) entry.getValue();
                        while (c1480y.f19237a.compareTo(this.f19242d) > 0 && !this.f19245h && this.f19241c.f23324e.containsKey(interfaceC1478w)) {
                            C1472p c1472p = r.Companion;
                            EnumC1474s state = c1480y.f19237a;
                            c1472p.getClass();
                            kotlin.jvm.internal.l.e(state, "state");
                            int ordinal = state.ordinal();
                            r rVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : r.ON_PAUSE : r.ON_STOP : r.ON_DESTROY;
                            if (rVar == null) {
                                throw new IllegalStateException("no event down from " + c1480y.f19237a);
                            }
                            this.f19246i.add(rVar.a());
                            c1480y.a(interfaceC1479x, rVar);
                            this.f19246i.remove(r4.size() - 1);
                        }
                    }
                }
                C1869c c1869c4 = this.f19241c.f23336b;
                if (!this.f19245h && c1869c4 != null && this.f19242d.compareTo(((C1480y) c1869c4.f23329b).f19237a) > 0) {
                    C1867a c1867a3 = this.f19241c;
                    c1867a3.getClass();
                    C1870d c1870d = new C1870d(c1867a3);
                    c1867a3.f23337c.put(c1870d, Boolean.FALSE);
                    while (c1870d.hasNext() && !this.f19245h) {
                        Map.Entry entry2 = (Map.Entry) c1870d.next();
                        InterfaceC1478w interfaceC1478w2 = (InterfaceC1478w) entry2.getKey();
                        C1480y c1480y2 = (C1480y) entry2.getValue();
                        while (c1480y2.f19237a.compareTo(this.f19242d) < 0 && !this.f19245h && this.f19241c.f23324e.containsKey(interfaceC1478w2)) {
                            this.f19246i.add(c1480y2.f19237a);
                            C1472p c1472p2 = r.Companion;
                            EnumC1474s enumC1474s4 = c1480y2.f19237a;
                            c1472p2.getClass();
                            r a9 = C1472p.a(enumC1474s4);
                            if (a9 == null) {
                                throw new IllegalStateException("no event up from " + c1480y2.f19237a);
                            }
                            c1480y2.a(interfaceC1479x, a9);
                            this.f19246i.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
