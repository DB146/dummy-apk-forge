package N6;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import t8.C2034c;

/* loaded from: classes.dex */
public final class l0 extends AbstractMap implements ConcurrentMap, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public static final P f7306x = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final transient int f7307a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f7308b;

    /* renamed from: c, reason: collision with root package name */
    public final transient X[] f7309c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7310d = Math.min(4, 65536);

    /* renamed from: e, reason: collision with root package name */
    public final M6.h f7311e = (M6.h) E6.b.k(null, M6.f.f6803a);

    /* renamed from: f, reason: collision with root package name */
    public final transient V f7312f;

    /* renamed from: u, reason: collision with root package name */
    public transient T f7313u;

    /* renamed from: v, reason: collision with root package name */
    public transient C0442o f7314v;

    /* renamed from: w, reason: collision with root package name */
    public transient T f7315w;

    public l0(C2034c c2034c, V v10) {
        this.f7312f = v10;
        int min = Math.min(16, 1073741824);
        int i7 = 1;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i11 < this.f7310d) {
            i12++;
            i11 <<= 1;
        }
        this.f7308b = 32 - i12;
        this.f7307a = i11 - 1;
        this.f7309c = new X[i11];
        int i13 = min / i11;
        while (i7 < (i11 * i13 < min ? i13 + 1 : i13)) {
            i7 <<= 1;
        }
        while (true) {
            X[] xArr = this.f7309c;
            if (i10 >= xArr.length) {
                return;
            }
            xArr[i10] = this.f7312f.b(this, i7);
            i10++;
        }
    }

    public static ArrayList a(AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList(abstractCollection.size());
        Iterator it = abstractCollection.iterator();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final int b(Object obj) {
        int b2 = this.f7311e.b(obj);
        int i7 = b2 + ((b2 << 15) ^ (-12931));
        int i10 = i7 ^ (i7 >>> 10);
        int i11 = i10 + (i10 << 3);
        int i12 = i11 ^ (i11 >>> 6);
        int i13 = (i12 << 2) + (i12 << 14) + i12;
        return (i13 >>> 16) ^ i13;
    }

    public final X c(int i7) {
        return this.f7309c[(i7 >>> this.f7308b) & this.f7307a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (X x2 : this.f7309c) {
            if (x2.f7262b != 0) {
                x2.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = x2.f7265e;
                    for (int i7 = 0; i7 < atomicReferenceArray.length(); i7++) {
                        atomicReferenceArray.set(i7, null);
                    }
                    x2.c();
                    x2.f7266f.set(0);
                    x2.f7263c++;
                    x2.f7262b = 0;
                    x2.unlock();
                } catch (Throwable th) {
                    x2.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        U b2;
        boolean z8 = false;
        if (obj == null) {
            return false;
        }
        int b10 = b(obj);
        X c10 = c(b10);
        c10.getClass();
        try {
            if (c10.f7262b != 0 && (b2 = c10.b(b10, obj)) != null) {
                if (b2.getValue() != null) {
                    z8 = true;
                }
            }
            return z8;
        } finally {
            c10.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        boolean z8 = false;
        if (obj == null) {
            return false;
        }
        X[] xArr = this.f7309c;
        long j = -1;
        int i7 = 0;
        while (i7 < 3) {
            int length = xArr.length;
            long j10 = 0;
            for (?? r10 = z8; r10 < length; r10++) {
                X x2 = xArr[r10];
                int i10 = x2.f7262b;
                ?? r12 = x2.f7265e;
                for (?? r13 = z8; r13 < r12.length(); r13++) {
                    for (U u3 = (U) r12.get(r13); u3 != null; u3 = u3.d()) {
                        if (u3.getKey() == null) {
                            x2.k();
                        } else {
                            value = u3.getValue();
                            if (value == null) {
                                x2.k();
                            }
                            if (value == null && this.f7312f.c().a().c(obj, value)) {
                                return true;
                            }
                        }
                        value = null;
                        if (value == null) {
                        }
                    }
                }
                j10 += x2.f7263c;
                z8 = false;
            }
            if (j10 == j) {
                return false;
            }
            i7++;
            j = j10;
            z8 = false;
        }
        return z8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        T t5 = this.f7315w;
        if (t5 != null) {
            return t5;
        }
        T t10 = new T(this, 0);
        this.f7315w = t10;
        return t10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        int b2 = b(obj);
        X c10 = c(b2);
        c10.getClass();
        try {
            U b10 = c10.b(b2, obj);
            if (b10 != null && (obj2 = b10.getValue()) == null) {
                c10.k();
            }
            return obj2;
        } finally {
            c10.e();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        X[] xArr = this.f7309c;
        long j = 0;
        for (int i7 = 0; i7 < xArr.length; i7++) {
            if (xArr[i7].f7262b != 0) {
                return false;
            }
            j += xArr[i7].f7263c;
        }
        if (j == 0) {
            return true;
        }
        for (int i10 = 0; i10 < xArr.length; i10++) {
            if (xArr[i10].f7262b != 0) {
                return false;
            }
            j -= xArr[i10].f7263c;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        T t5 = this.f7313u;
        if (t5 != null) {
            return t5;
        }
        T t10 = new T(this, 1);
        this.f7313u = t10;
        return t10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int b2 = b(obj);
        return c(b2).f(b2, obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int b2 = b(obj);
        return c(b2).f(b2, obj, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r10 = r6.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r2.f7263c++;
        r0 = r2.g(r5, r6);
        r1 = r2.f7262b - 1;
        r3.set(r4, r0);
        r2.f7262b = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r6.getValue() != null) goto L22;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int b2 = b(obj);
        X c10 = c(b2);
        c10.lock();
        try {
            c10.h();
            AtomicReferenceArray atomicReferenceArray = c10.f7265e;
            int length = (atomicReferenceArray.length() - 1) & b2;
            U u3 = (U) atomicReferenceArray.get(length);
            U u10 = u3;
            while (true) {
                if (u10 == null) {
                    break;
                }
                Object key = u10.getKey();
                if (u10.c() == b2 && key != null && c10.f7261a.f7311e.c(obj, key)) {
                    break;
                }
                u10 = u10.d();
            }
            return null;
        } finally {
            c10.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r2.f7261a.f7312f.c().a().c(r12, r7.getValue()) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        r2.f7263c++;
        r11 = r2.g(r6, r7);
        r12 = r2.f7262b - 1;
        r3.set(r4, r11);
        r2.f7262b = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r7.getValue() != null) goto L20;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj, Object obj2) {
        boolean z8 = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int b2 = b(obj);
        X c10 = c(b2);
        c10.lock();
        try {
            c10.h();
            AtomicReferenceArray atomicReferenceArray = c10.f7265e;
            int length = (atomicReferenceArray.length() - 1) & b2;
            U u3 = (U) atomicReferenceArray.get(length);
            U u10 = u3;
            while (true) {
                if (u10 == null) {
                    break;
                }
                Object key = u10.getKey();
                if (u10.c() == b2 && key != null && c10.f7261a.f7311e.c(obj, key)) {
                    break;
                }
                u10 = u10.d();
            }
            return z8;
        } finally {
            c10.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        return null;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int b2 = b(obj);
        X c10 = c(b2);
        c10.lock();
        try {
            c10.h();
            AtomicReferenceArray atomicReferenceArray = c10.f7265e;
            int length = (atomicReferenceArray.length() - 1) & b2;
            U u3 = (U) atomicReferenceArray.get(length);
            U u10 = u3;
            while (true) {
                if (u10 == null) {
                    break;
                }
                Object key = u10.getKey();
                if (u10.c() == b2 && key != null && c10.f7261a.f7311e.c(obj, key)) {
                    Object value = u10.getValue();
                    if (value != null) {
                        c10.f7263c++;
                        c10.j(u10, obj2);
                        return value;
                    }
                    if (u10.getValue() == null) {
                        c10.f7263c++;
                        U g = c10.g(u3, u10);
                        int i7 = c10.f7262b - 1;
                        atomicReferenceArray.set(length, g);
                        c10.f7262b = i7;
                    }
                } else {
                    u10 = u10.d();
                }
            }
        } finally {
            c10.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int b2 = b(obj);
        X c10 = c(b2);
        c10.lock();
        try {
            c10.h();
            AtomicReferenceArray atomicReferenceArray = c10.f7265e;
            int length = (atomicReferenceArray.length() - 1) & b2;
            U u3 = (U) atomicReferenceArray.get(length);
            U u10 = u3;
            while (true) {
                if (u10 == null) {
                    break;
                }
                Object key = u10.getKey();
                if (u10.c() == b2 && key != null && c10.f7261a.f7311e.c(obj, key)) {
                    Object value = u10.getValue();
                    if (value == null) {
                        if (u10.getValue() == null) {
                            c10.f7263c++;
                            U g = c10.g(u3, u10);
                            int i7 = c10.f7262b - 1;
                            atomicReferenceArray.set(length, g);
                            c10.f7262b = i7;
                        }
                    } else if (c10.f7261a.f7312f.c().a().c(obj2, value)) {
                        c10.f7263c++;
                        c10.j(u10, obj3);
                        return true;
                    }
                } else {
                    u10 = u10.d();
                }
            }
            return false;
        } finally {
            c10.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (int i7 = 0; i7 < this.f7309c.length; i7++) {
            j += r0[i7].f7262b;
        }
        return h3.H.C(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0442o c0442o = this.f7314v;
        if (c0442o != null) {
            return c0442o;
        }
        C0442o c0442o2 = new C0442o(2, this);
        this.f7314v = c0442o2;
        return c0442o2;
    }
}
