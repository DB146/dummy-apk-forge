package N6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: N6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448v extends AbstractMap implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f7348x = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f7349a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f7350b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f7351c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f7352d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f7353e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f7354f;

    /* renamed from: u, reason: collision with root package name */
    public transient C0446t f7355u;

    /* renamed from: v, reason: collision with root package name */
    public transient C0446t f7356v;

    /* renamed from: w, reason: collision with root package name */
    public transient C0442o f7357w;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, N6.v] */
    public static C0448v a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f7353e = h3.H.n(3, 1);
        return abstractMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, N6.v] */
    public static C0448v b() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f7353e = h3.H.n(8, 1);
        return abstractMap;
    }

    public final Map c() {
        Object obj = this.f7349a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f7353e += 32;
        Map c10 = c();
        if (c10 != null) {
            this.f7353e = h3.H.n(size(), 3);
            c10.clear();
            this.f7349a = null;
            this.f7354f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f7354f, (Object) null);
        Arrays.fill(l(), 0, this.f7354f, (Object) null);
        Object obj = this.f7349a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f7354f, 0);
        this.f7354f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c10 = c();
        return c10 != null ? c10.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f7354f; i7++) {
            if (O5.b.o(obj, l()[i7])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f7353e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int t5 = r.t(obj);
        int d10 = d();
        Object obj2 = this.f7349a;
        Objects.requireNonNull(obj2);
        int u3 = r.u(t5 & d10, obj2);
        if (u3 == 0) {
            return -1;
        }
        int i7 = ~d10;
        int i10 = t5 & i7;
        do {
            int i11 = u3 - 1;
            int i12 = j()[i11];
            if ((i12 & i7) == i10 && O5.b.o(obj, k()[i11])) {
                return i11;
            }
            u3 = i12 & d10;
        } while (u3 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0446t c0446t = this.f7356v;
        if (c0446t != null) {
            return c0446t;
        }
        C0446t c0446t2 = new C0446t(this, 0);
        this.f7356v = c0446t2;
        return c0446t2;
    }

    public final void f(int i7, int i10) {
        Object obj = this.f7349a;
        Objects.requireNonNull(obj);
        int[] j = j();
        Object[] k = k();
        Object[] l10 = l();
        int size = size();
        int i11 = size - 1;
        if (i7 >= i11) {
            k[i7] = null;
            l10[i7] = null;
            j[i7] = 0;
            return;
        }
        Object obj2 = k[i11];
        k[i7] = obj2;
        l10[i7] = l10[i11];
        k[i11] = null;
        l10[i11] = null;
        j[i7] = j[i11];
        j[i11] = 0;
        int t5 = r.t(obj2) & i10;
        int u3 = r.u(t5, obj);
        if (u3 == size) {
            r.v(obj, t5, i7 + 1);
            return;
        }
        while (true) {
            int i12 = u3 - 1;
            int i13 = j[i12];
            int i14 = i13 & i10;
            if (i14 == size) {
                j[i12] = r.o(i13, i7 + 1, i10);
                return;
            }
            u3 = i14;
        }
    }

    public final boolean g() {
        return this.f7349a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.get(obj);
        }
        int e2 = e(obj);
        if (e2 == -1) {
            return null;
        }
        return l()[e2];
    }

    public final Object h(Object obj) {
        boolean g = g();
        Object obj2 = f7348x;
        if (g) {
            return obj2;
        }
        int d10 = d();
        Object obj3 = this.f7349a;
        Objects.requireNonNull(obj3);
        int q10 = r.q(obj, null, d10, obj3, j(), k(), null);
        if (q10 == -1) {
            return obj2;
        }
        Object obj4 = l()[q10];
        f(q10, d10);
        this.f7354f--;
        this.f7353e += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.f7350b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f7351c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0446t c0446t = this.f7355u;
        if (c0446t != null) {
            return c0446t;
        }
        C0446t c0446t2 = new C0446t(this, 1);
        this.f7355u = c0446t2;
        return c0446t2;
    }

    public final Object[] l() {
        Object[] objArr = this.f7352d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i7, int i10, int i11, int i12) {
        Object g = r.g(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            r.v(g, i11 & i13, i12 + 1);
        }
        Object obj = this.f7349a;
        Objects.requireNonNull(obj);
        int[] j = j();
        for (int i14 = 0; i14 <= i7; i14++) {
            int u3 = r.u(i14, obj);
            while (u3 != 0) {
                int i15 = u3 - 1;
                int i16 = j[i15];
                int i17 = ((~i7) & i16) | i14;
                int i18 = i17 & i13;
                int u10 = r.u(i18, g);
                r.v(g, i18, u3);
                j[i15] = r.o(i17, u10, i13);
                u3 = i16 & i7;
            }
        }
        this.f7349a = g;
        this.f7353e = r.o(this.f7353e, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fc -> B:43:0x00e2). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int i7;
        int min;
        if (g()) {
            Q5.e.p("Arrays already allocated", g());
            int i10 = this.f7353e;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (1.0d * highestOneBit))) {
                int i11 = highestOneBit << 1;
                if (i11 <= 0) {
                    i11 = 1073741824;
                }
                highestOneBit = i11;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f7349a = r.g(max2);
            this.f7353e = r.o(this.f7353e, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
            this.f7350b = new int[i10];
            this.f7351c = new Object[i10];
            this.f7352d = new Object[i10];
        }
        Map c10 = c();
        if (c10 != null) {
            return c10.put(obj, obj2);
        }
        int[] j = j();
        Object[] k = k();
        Object[] l10 = l();
        int i12 = this.f7354f;
        int i13 = i12 + 1;
        int t5 = r.t(obj);
        int d10 = d();
        int i14 = t5 & d10;
        Object obj3 = this.f7349a;
        Objects.requireNonNull(obj3);
        int u3 = r.u(i14, obj3);
        if (u3 != 0) {
            int i15 = ~d10;
            int i16 = t5 & i15;
            int i17 = 0;
            while (true) {
                int i18 = u3 - 1;
                int i19 = j[i18];
                if ((i19 & i15) == i16 && O5.b.o(obj, k[i18])) {
                    Object obj4 = l10[i18];
                    l10[i18] = obj2;
                    return obj4;
                }
                int i20 = i19 & d10;
                int i21 = i16;
                int i22 = i17 + 1;
                if (i20 != 0) {
                    i17 = i22;
                    u3 = i20;
                    i16 = i21;
                } else {
                    if (i22 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                        if (!isEmpty()) {
                            i7 = 0;
                            while (i7 >= 0) {
                                linkedHashMap.put(k()[i7], l()[i7]);
                                int i23 = i7 + 1;
                                if (i23 < this.f7354f) {
                                    i7 = i23;
                                }
                            }
                            this.f7349a = linkedHashMap;
                            this.f7350b = null;
                            this.f7351c = null;
                            this.f7352d = null;
                            this.f7353e += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i7 = -1;
                        while (i7 >= 0) {
                        }
                        this.f7349a = linkedHashMap;
                        this.f7350b = null;
                        this.f7351c = null;
                        this.f7352d = null;
                        this.f7353e += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > d10) {
                        d10 = m(d10, (d10 + 1) * (d10 < 32 ? 4 : 2), t5, i12);
                    } else {
                        j[i18] = r.o(i19, i13, d10);
                    }
                }
            }
        } else if (i13 > d10) {
            d10 = m(d10, (d10 + 1) * (d10 < 32 ? 4 : 2), t5, i12);
        } else {
            Object obj5 = this.f7349a;
            Objects.requireNonNull(obj5);
            r.v(obj5, i14, i13);
        }
        int length = j().length;
        if (i13 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f7350b = Arrays.copyOf(j(), min);
            this.f7351c = Arrays.copyOf(k(), min);
            this.f7352d = Arrays.copyOf(l(), min);
        }
        j()[i12] = r.o(t5, 0, d10);
        k()[i12] = obj;
        l()[i12] = obj2;
        this.f7354f = i13;
        this.f7353e += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c10 = c();
        if (c10 != null) {
            return c10.remove(obj);
        }
        Object h10 = h(obj);
        if (h10 == f7348x) {
            return null;
        }
        return h10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c10 = c();
        return c10 != null ? c10.size() : this.f7354f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0442o c0442o = this.f7357w;
        if (c0442o != null) {
            return c0442o;
        }
        C0442o c0442o2 = new C0442o(1, this);
        this.f7357w = c0442o2;
        return c0442o2;
    }
}
