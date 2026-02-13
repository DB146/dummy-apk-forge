package N6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class y0 implements Map, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final y0 f7368u = new y0(null, new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public transient v0 f7369a;

    /* renamed from: b, reason: collision with root package name */
    public transient w0 f7370b;

    /* renamed from: c, reason: collision with root package name */
    public transient x0 f7371c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f7372d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f7373e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f7374f;

    public y0(Object obj, Object[] objArr, int i7) {
        this.f7372d = obj;
        this.f7373e = objArr;
        this.f7374f = i7;
    }

    public static A4.s a() {
        return new A4.s(4);
    }

    public static y0 b(Map map) {
        if ((map instanceof y0) && !(map instanceof SortedMap)) {
            y0 y0Var = (y0) map;
            y0Var.getClass();
            return y0Var;
        }
        Set entrySet = map.entrySet();
        A4.s sVar = new A4.s(entrySet instanceof Collection ? entrySet.size() : 4);
        sVar.C(entrySet);
        return sVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x017e  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y0 c(int i7, Object[] objArr, A4.s sVar) {
        short[] sArr;
        char c10;
        byte[] bArr;
        boolean z8;
        int i10 = i7;
        Object[] objArr2 = objArr;
        if (i10 == 0) {
            return f7368u;
        }
        int i11 = 1;
        Object obj = null;
        if (i10 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
            return new y0(null, objArr2, 1);
        }
        Q5.e.n(i10, objArr2.length >> 1);
        int D10 = L.D(i7);
        if (i10 == 1) {
            Objects.requireNonNull(objArr2[0]);
            Objects.requireNonNull(objArr2[1]);
        } else {
            int i12 = D10 - 1;
            char c11 = 65535;
            if (D10 <= 128) {
                bArr = new byte[D10];
                Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                int i14 = 0;
                while (i13 < i10) {
                    int i15 = i13 * 2;
                    int i16 = i14 * 2;
                    Object obj2 = objArr2[i15];
                    Objects.requireNonNull(obj2);
                    Object obj3 = objArr2[i15 ^ i11];
                    Objects.requireNonNull(obj3);
                    int s3 = r.s(obj2.hashCode());
                    while (true) {
                        int i17 = s3 & i12;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i16;
                            if (i14 < i13) {
                                objArr2[i16] = obj2;
                                objArr2[i16 ^ 1] = obj3;
                            }
                            i14++;
                        } else {
                            if (obj2.equals(objArr2[i18])) {
                                int i19 = i18 ^ 1;
                                Object obj4 = objArr2[i19];
                                Objects.requireNonNull(obj4);
                                J j = new J(obj2, obj3, obj4);
                                objArr2[i19] = obj3;
                                obj = j;
                                break;
                            }
                            s3 = i17 + 1;
                        }
                    }
                    i13++;
                    i11 = 1;
                }
                if (i14 != i10) {
                    sArr = new Object[]{bArr, Integer.valueOf(i14), obj};
                    obj = sArr;
                }
                obj = bArr;
            } else {
                if (D10 <= 32768) {
                    sArr = new short[D10];
                    Arrays.fill(sArr, (short) -1);
                    int i20 = 0;
                    for (int i21 = 0; i21 < i10; i21++) {
                        int i22 = i21 * 2;
                        int i23 = i20 * 2;
                        Object obj5 = objArr2[i22];
                        Objects.requireNonNull(obj5);
                        Object obj6 = objArr2[i22 ^ 1];
                        Objects.requireNonNull(obj6);
                        int s10 = r.s(obj5.hashCode());
                        while (true) {
                            int i24 = s10 & i12;
                            int i25 = sArr[i24] & 65535;
                            if (i25 == 65535) {
                                sArr[i24] = (short) i23;
                                if (i20 < i21) {
                                    objArr2[i23] = obj5;
                                    objArr2[i23 ^ 1] = obj6;
                                }
                                i20++;
                            } else {
                                if (obj5.equals(objArr2[i25])) {
                                    int i26 = i25 ^ 1;
                                    Object obj7 = objArr2[i26];
                                    Objects.requireNonNull(obj7);
                                    obj = new J(obj5, obj6, obj7);
                                    objArr2[i26] = obj6;
                                    break;
                                }
                                s10 = i24 + 1;
                            }
                        }
                    }
                    if (i20 != i10) {
                        bArr = new Object[]{sArr, Integer.valueOf(i20), obj};
                        obj = bArr;
                    }
                } else {
                    sArr = new int[D10];
                    Arrays.fill((int[]) sArr, -1);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < i10) {
                        int i29 = i27 * 2;
                        int i30 = i28 * 2;
                        Object obj8 = objArr2[i29];
                        Objects.requireNonNull(obj8);
                        Object obj9 = objArr2[i29 ^ 1];
                        Objects.requireNonNull(obj9);
                        int s11 = r.s(obj8.hashCode());
                        while (true) {
                            int i31 = s11 & i12;
                            ?? r15 = sArr[i31];
                            if (r15 == c11) {
                                sArr[i31] = i30;
                                if (i28 < i27) {
                                    objArr2[i30] = obj8;
                                    objArr2[i30 ^ 1] = obj9;
                                }
                                i28++;
                            } else {
                                if (obj8.equals(objArr2[r15])) {
                                    int i32 = r15 ^ 1;
                                    Object obj10 = objArr2[i32];
                                    Objects.requireNonNull(obj10);
                                    obj = new J(obj8, obj9, obj10);
                                    objArr2[i32] = obj9;
                                    break;
                                }
                                s11 = i31 + 1;
                                c11 = 65535;
                            }
                        }
                        i27++;
                        c11 = 65535;
                    }
                    if (i28 != i10) {
                        c10 = 2;
                        obj = new Object[]{sArr, Integer.valueOf(i28), obj};
                        z8 = obj instanceof Object[];
                        Object obj11 = obj;
                        if (z8) {
                            Object[] objArr3 = (Object[]) obj;
                            J j10 = (J) objArr3[c10];
                            if (sVar == null) {
                                throw j10.a();
                            }
                            sVar.f472c = j10;
                            Object obj12 = objArr3[0];
                            int intValue = ((Integer) objArr3[1]).intValue();
                            objArr2 = Arrays.copyOf(objArr2, intValue * 2);
                            obj11 = obj12;
                            i10 = intValue;
                        }
                        return new y0(obj11, objArr2, i10);
                    }
                }
                obj = sArr;
            }
        }
        c10 = 2;
        z8 = obj instanceof Object[];
        Object obj112 = obj;
        if (z8) {
        }
        return new y0(obj112, objArr2, i10);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final L entrySet() {
        v0 v0Var = this.f7369a;
        if (v0Var != null) {
            return v0Var;
        }
        v0 v0Var2 = new v0(this, this.f7373e, this.f7374f);
        this.f7369a = v0Var2;
        return v0Var2;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final L keySet() {
        w0 w0Var = this.f7370b;
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0(this, new x0(this.f7373e, 0, this.f7374f));
        this.f7370b = w0Var2;
        return w0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return r.h(obj, this);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C values() {
        x0 x0Var = this.f7371c;
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0(this.f7373e, 1, this.f7374f);
        this.f7371c = x0Var2;
        return x0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.f7373e;
            if (this.f7374f == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f7372d;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int s3 = r.s(obj.hashCode());
                        while (true) {
                            int i7 = s3 & length;
                            int i10 = bArr[i7] & 255;
                            if (i10 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i10])) {
                                obj2 = objArr[i10 ^ 1];
                                break;
                            }
                            s3 = i7 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int s10 = r.s(obj.hashCode());
                        while (true) {
                            int i11 = s10 & length2;
                            int i12 = sArr[i11] & 65535;
                            if (i12 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            s10 = i11 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int s11 = r.s(obj.hashCode());
                        while (true) {
                            int i13 = s11 & length3;
                            int i14 = iArr[i13];
                            if (i14 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i14])) {
                                obj2 = objArr[i14 ^ 1];
                                break;
                            }
                            s11 = i13 + 1;
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return r.m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7374f;
    }

    public final String toString() {
        int i7 = this.f7374f;
        r.e(i7, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i7 * 8, 1073741824L));
        sb2.append('{');
        H0 it = ((v0) entrySet()).iterator();
        boolean z8 = true;
        while (true) {
            F f4 = (F) it;
            if (!f4.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) f4.next();
            if (!z8) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z8 = false;
        }
    }
}
