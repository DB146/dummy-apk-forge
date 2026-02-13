package Fb;

import Z9.x;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class f implements Map, Serializable, Sb.d {

    /* renamed from: B, reason: collision with root package name */
    public static final f f4197B;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4198A;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f4199a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4200b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f4201c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4202d;

    /* renamed from: e, reason: collision with root package name */
    public int f4203e;

    /* renamed from: f, reason: collision with root package name */
    public int f4204f;

    /* renamed from: u, reason: collision with root package name */
    public int f4205u;

    /* renamed from: v, reason: collision with root package name */
    public int f4206v;

    /* renamed from: w, reason: collision with root package name */
    public int f4207w;

    /* renamed from: x, reason: collision with root package name */
    public g f4208x;

    /* renamed from: y, reason: collision with root package name */
    public h f4209y;

    /* renamed from: z, reason: collision with root package name */
    public g f4210z;

    static {
        f fVar = new f(0);
        fVar.f4198A = true;
        f4197B = fVar;
    }

    public f() {
        this(8);
    }

    public f(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i7];
        int[] iArr = new int[i7];
        int highestOneBit = Integer.highestOneBit((i7 < 1 ? 1 : i7) * 3);
        this.f4199a = objArr;
        this.f4200b = null;
        this.f4201c = iArr;
        this.f4202d = new int[highestOneBit];
        this.f4203e = 2;
        this.f4204f = 0;
        this.f4205u = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int k = k(obj);
            int i7 = this.f4203e * 2;
            int length = this.f4202d.length / 2;
            if (i7 > length) {
                i7 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f4202d;
                int i11 = iArr[k];
                if (i11 <= 0) {
                    int i12 = this.f4204f;
                    Object[] objArr = this.f4199a;
                    if (i12 < objArr.length) {
                        int i13 = i12 + 1;
                        this.f4204f = i13;
                        objArr[i12] = obj;
                        this.f4201c[i12] = k;
                        iArr[k] = i13;
                        this.f4207w++;
                        this.f4206v++;
                        if (i10 > this.f4203e) {
                            this.f4203e = i10;
                        }
                        return i12;
                    }
                    g(1);
                } else {
                    if (l.a(this.f4199a[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i7) {
                        l(this.f4202d.length * 2);
                        break;
                    }
                    k = k == 0 ? this.f4202d.length - 1 : k - 1;
                }
            }
        }
    }

    public final f b() {
        c();
        this.f4198A = true;
        if (this.f4207w > 0) {
            return this;
        }
        f fVar = f4197B;
        l.c(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (this.f4198A) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i7 = this.f4204f - 1;
        if (i7 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f4201c;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f4202d[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i7) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        x.N(this.f4199a, 0, this.f4204f);
        Object[] objArr = this.f4200b;
        if (objArr != null) {
            x.N(objArr, 0, this.f4204f);
        }
        this.f4207w = 0;
        this.f4204f = 0;
        this.f4206v++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return j(obj) >= 0;
    }

    public final void d(boolean z8) {
        int i7;
        Object[] objArr = this.f4200b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i7 = this.f4204f;
            if (i10 >= i7) {
                break;
            }
            int[] iArr = this.f4201c;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f4199a;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z8) {
                    iArr[i11] = i12;
                    this.f4202d[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        x.N(this.f4199a, i11, i7);
        if (objArr != null) {
            x.N(objArr, i11, this.f4204f);
        }
        this.f4204f = i11;
    }

    public final boolean e(Collection m10) {
        l.e(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f4210z;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f4210z = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f4207w != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        l.e(entry, "entry");
        int h10 = h(entry.getKey());
        if (h10 < 0) {
            return false;
        }
        Object[] objArr = this.f4200b;
        l.b(objArr);
        return l.a(objArr[h10], entry.getValue());
    }

    public final void g(int i7) {
        Object[] objArr;
        Object[] objArr2 = this.f4199a;
        int length = objArr2.length;
        int i10 = this.f4204f;
        int i11 = length - i10;
        int i12 = i10 - this.f4207w;
        if (i11 < i7 && i11 + i12 >= i7 && i12 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i13 = i10 + i7;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr2.length) {
            int length2 = objArr2.length;
            int i14 = length2 + (length2 >> 1);
            if (i14 - i13 < 0) {
                i14 = i13;
            }
            if (i14 - 2147483639 > 0) {
                i14 = i13 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i14);
            l.d(copyOf, "copyOf(...)");
            this.f4199a = copyOf;
            Object[] objArr3 = this.f4200b;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i14);
                l.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f4200b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f4201c, i14);
            l.d(copyOf2, "copyOf(...)");
            this.f4201c = copyOf2;
            int highestOneBit = Integer.highestOneBit((i14 >= 1 ? i14 : 1) * 3);
            if (highestOneBit > this.f4202d.length) {
                l(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h10 = h(obj);
        if (h10 < 0) {
            return null;
        }
        Object[] objArr = this.f4200b;
        l.b(objArr);
        return objArr[h10];
    }

    public final int h(Object obj) {
        int k = k(obj);
        int i7 = this.f4203e;
        while (true) {
            int i10 = this.f4202d[k];
            if (i10 == 0) {
                return -1;
            }
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (l.a(this.f4199a[i11], obj)) {
                    return i11;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            k = k == 0 ? this.f4202d.length - 1 : k - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i7 = 0;
        while (cVar.hasNext()) {
            int i10 = cVar.f4193a;
            f fVar = (f) cVar.f4196d;
            if (i10 >= fVar.f4204f) {
                throw new NoSuchElementException();
            }
            cVar.f4193a = i10 + 1;
            cVar.f4194b = i10;
            Object obj = fVar.f4199a[i10];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f4200b;
            l.b(objArr);
            Object obj2 = objArr[cVar.f4194b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.d();
            i7 += hashCode ^ hashCode2;
        }
        return i7;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f4207w == 0;
    }

    public final int j(Object obj) {
        int i7 = this.f4204f;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f4201c[i7] >= 0) {
                Object[] objArr = this.f4200b;
                l.b(objArr);
                if (l.a(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    public final int k(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f4205u;
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f4208x;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f4208x = gVar2;
        return gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f4201c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i7) {
        this.f4206v++;
        int i10 = 0;
        if (this.f4204f > this.f4207w) {
            d(false);
        }
        this.f4202d = new int[i7];
        this.f4205u = Integer.numberOfLeadingZeros(i7) + 1;
        while (i10 < this.f4204f) {
            int i11 = i10 + 1;
            int k = k(this.f4199a[i10]);
            int i12 = this.f4203e;
            while (true) {
                int[] iArr = this.f4202d;
                if (iArr[k] == 0) {
                    break;
                }
                i12--;
                if (i12 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                k = k == 0 ? iArr.length - 1 : k - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i7) {
        Object[] objArr = this.f4199a;
        l.e(objArr, "<this>");
        objArr[i7] = null;
        Object[] objArr2 = this.f4200b;
        if (objArr2 != null) {
            objArr2[i7] = null;
        }
        int i10 = this.f4201c[i7];
        int i11 = this.f4203e * 2;
        int length = this.f4202d.length / 2;
        if (i11 > length) {
            i11 = length;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = i10;
        while (true) {
            i10 = i10 == 0 ? this.f4202d.length - 1 : i10 - 1;
            i13++;
            if (i13 > this.f4203e) {
                this.f4202d[i14] = 0;
                break;
            }
            int[] iArr = this.f4202d;
            int i15 = iArr[i10];
            if (i15 == 0) {
                iArr[i14] = 0;
                break;
            }
            if (i15 < 0) {
                iArr[i14] = -1;
            } else {
                int i16 = i15 - 1;
                int k = k(this.f4199a[i16]) - i10;
                int[] iArr2 = this.f4202d;
                if ((k & (iArr2.length - 1)) >= i13) {
                    iArr2[i14] = i15;
                    this.f4201c[i16] = i14;
                }
                i12--;
                if (i12 >= 0) {
                    this.f4202d[i14] = -1;
                    break;
                }
            }
            i14 = i10;
            i13 = 0;
            i12--;
            if (i12 >= 0) {
            }
        }
        this.f4201c[i7] = -1;
        this.f4207w--;
        this.f4206v++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a9 = a(obj);
        Object[] objArr = this.f4200b;
        if (objArr == null) {
            int length = this.f4199a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f4200b = objArr;
        }
        if (a9 >= 0) {
            objArr[a9] = obj2;
            return null;
        }
        int i7 = (-a9) - 1;
        Object obj3 = objArr[i7];
        objArr[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        l.e(from, "from");
        c();
        Set<Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a9 = a(entry.getKey());
            Object[] objArr = this.f4200b;
            if (objArr == null) {
                int length = this.f4199a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f4200b = objArr;
            }
            if (a9 >= 0) {
                objArr[a9] = entry.getValue();
            } else {
                int i7 = (-a9) - 1;
                if (!l.a(entry.getValue(), objArr[i7])) {
                    objArr[i7] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h10 = h(obj);
        if (h10 < 0) {
            return null;
        }
        Object[] objArr = this.f4200b;
        l.b(objArr);
        Object obj2 = objArr[h10];
        m(h10);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f4207w;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f4207w * 3) + 2);
        sb2.append("{");
        c cVar = new c(this, 0);
        int i7 = 0;
        while (cVar.hasNext()) {
            if (i7 > 0) {
                sb2.append(", ");
            }
            int i10 = cVar.f4193a;
            f fVar = (f) cVar.f4196d;
            if (i10 >= fVar.f4204f) {
                throw new NoSuchElementException();
            }
            cVar.f4193a = i10 + 1;
            cVar.f4194b = i10;
            Object obj = fVar.f4199a[i10];
            if (obj == fVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = fVar.f4200b;
            l.b(objArr);
            Object obj2 = objArr[cVar.f4194b];
            if (obj2 == fVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            cVar.d();
            i7++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        l.d(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f4209y;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.f4209y = hVar2;
        return hVar2;
    }
}
