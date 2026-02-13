package u;

import hb.InterfaceC1269b;
import v.AbstractC2121a;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2054g {

    /* renamed from: a, reason: collision with root package name */
    public int f24673a;

    /* renamed from: b, reason: collision with root package name */
    public int f24674b;

    /* renamed from: c, reason: collision with root package name */
    public int f24675c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f24676d;

    public C2054g() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.f24673a = numberOfLeadingZeros - 1;
        this.f24675c = (int) (0.75f * numberOfLeadingZeros);
        this.f24676d = new Object[numberOfLeadingZeros];
    }

    public C2054g(int i7) {
        if (!(i7 >= 1)) {
            AbstractC2121a.c("capacity must be >= 1");
            throw null;
        }
        if (!(i7 <= 1073741824)) {
            AbstractC2121a.c("capacity must be <= 2^30");
            throw null;
        }
        i7 = Integer.bitCount(i7) != 1 ? Integer.highestOneBit(i7 - 1) << 1 : i7;
        this.f24675c = i7 - 1;
        this.f24676d = new Object[i7];
    }

    public void a(InterfaceC1269b interfaceC1269b) {
        Object obj;
        Object obj2;
        Object[] objArr = this.f24676d;
        int i7 = this.f24673a;
        int hashCode = interfaceC1269b.hashCode() * (-1640531527);
        int i10 = (hashCode ^ (hashCode >>> 16)) & i7;
        Object obj3 = objArr[i10];
        if (obj3 != null) {
            if (obj3.equals(interfaceC1269b)) {
                return;
            }
            do {
                i10 = (i10 + 1) & i7;
                obj2 = objArr[i10];
                if (obj2 == null) {
                }
            } while (!obj2.equals(interfaceC1269b));
            return;
        }
        objArr[i10] = interfaceC1269b;
        int i11 = this.f24674b + 1;
        this.f24674b = i11;
        if (i11 < this.f24675c) {
            return;
        }
        Object[] objArr2 = this.f24676d;
        int length = objArr2.length;
        int i12 = length << 1;
        int i13 = i12 - 1;
        Object[] objArr3 = new Object[i12];
        while (true) {
            int i14 = i11 - 1;
            if (i11 == 0) {
                this.f24673a = i13;
                this.f24675c = (int) (i12 * 0.75f);
                this.f24676d = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int hashCode2 = obj.hashCode() * (-1640531527);
            int i15 = (hashCode2 ^ (hashCode2 >>> 16)) & i13;
            if (objArr3[i15] == null) {
                objArr3[i15] = objArr2[length];
                i11 = i14;
            }
            do {
                i15 = (i15 + 1) & i13;
            } while (objArr3[i15] != null);
            objArr3[i15] = objArr2[length];
            i11 = i14;
        }
    }

    public void b(Object obj) {
        Object[] objArr = this.f24676d;
        int i7 = this.f24674b;
        objArr[i7] = obj;
        int i10 = this.f24675c & (i7 + 1);
        this.f24674b = i10;
        if (i10 == this.f24673a) {
            c();
        }
    }

    public void c() {
        Object[] objArr = this.f24676d;
        int length = objArr.length;
        int i7 = this.f24673a;
        int i10 = length - i7;
        int i11 = length << 1;
        if (i11 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        Object[] objArr2 = new Object[i11];
        Eb.n.P(objArr, 0, objArr2, i7, length);
        Eb.n.P(this.f24676d, i10, objArr2, 0, this.f24673a);
        this.f24676d = objArr2;
        this.f24673a = 0;
        this.f24674b = length;
        this.f24675c = i11 - 1;
    }

    public Object d(int i7) {
        if (i7 < 0 || i7 >= h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = this.f24676d[this.f24675c & (this.f24673a + i7)];
        kotlin.jvm.internal.l.b(obj);
        return obj;
    }

    public void e(Object[] objArr, int i7, int i10) {
        int i11;
        Object obj;
        this.f24674b--;
        while (true) {
            int i12 = i7 + 1;
            while (true) {
                i11 = i12 & i10;
                obj = objArr[i11];
                if (obj == null) {
                    objArr[i7] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i13 = (hashCode ^ (hashCode >>> 16)) & i10;
                if (i7 > i11) {
                    if (i7 >= i13 && i13 > i11) {
                        break;
                    }
                    i12 = i11 + 1;
                } else if (i7 < i13 && i13 <= i11) {
                    i12 = i11 + 1;
                }
            }
            objArr[i7] = obj;
            i7 = i11;
        }
    }

    public void f(int i7) {
        if (i7 <= 0) {
            return;
        }
        if (i7 > h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i10 = this.f24674b;
        int i11 = i7 < i10 ? i10 - i7 : 0;
        for (int i12 = i11; i12 < i10; i12++) {
            this.f24676d[i12] = null;
        }
        int i13 = this.f24674b;
        int i14 = i13 - i11;
        int i15 = i7 - i14;
        this.f24674b = i13 - i14;
        if (i15 > 0) {
            int length = this.f24676d.length;
            this.f24674b = length;
            int i16 = length - i15;
            for (int i17 = i16; i17 < length; i17++) {
                this.f24676d[i17] = null;
            }
            this.f24674b = i16;
        }
    }

    public void g(int i7) {
        if (i7 <= 0) {
            return;
        }
        if (i7 > h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f24676d.length;
        int i10 = this.f24673a;
        if (i7 < length - i10) {
            length = i10 + i7;
        }
        while (i10 < length) {
            this.f24676d[i10] = null;
            i10++;
        }
        int i11 = this.f24673a;
        int i12 = length - i11;
        int i13 = i7 - i12;
        this.f24673a = this.f24675c & (i11 + i12);
        if (i13 > 0) {
            for (int i14 = 0; i14 < i13; i14++) {
                this.f24676d[i14] = null;
            }
            this.f24673a = i13;
        }
    }

    public int h() {
        return (this.f24674b - this.f24673a) & this.f24675c;
    }
}
