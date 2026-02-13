package u;

import A0.C0005a;
import java.util.List;
import v.AbstractC2121a;

/* renamed from: u.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2042E {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f24584a;

    /* renamed from: b, reason: collision with root package name */
    public int f24585b;

    public /* synthetic */ C2042E() {
        this(16);
    }

    public C2042E(int i7) {
        this.f24584a = i7 == 0 ? O.f24630a : new Object[i7];
    }

    public final void a(Object obj) {
        int i7 = this.f24585b + 1;
        Object[] objArr = this.f24584a;
        if (objArr.length < i7) {
            k(i7, objArr);
        }
        Object[] objArr2 = this.f24584a;
        int i10 = this.f24585b;
        objArr2[i10] = obj;
        this.f24585b = i10 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i7 = this.f24585b;
        int size = list.size() + i7;
        Object[] objArr = this.f24584a;
        if (objArr.length < size) {
            k(size, objArr);
        }
        Object[] objArr2 = this.f24584a;
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            objArr2[i10 + i7] = list.get(i10);
        }
        this.f24585b = list.size() + this.f24585b;
    }

    public final void c() {
        Eb.n.U(this.f24584a, null, 0, this.f24585b);
        this.f24585b = 0;
    }

    public final Object d() {
        if (!g()) {
            return this.f24584a[0];
        }
        AbstractC2121a.e("ObjectList is empty.");
        throw null;
    }

    public final Object e(int i7) {
        if (i7 >= 0 && i7 < this.f24585b) {
            return this.f24584a[i7];
        }
        l(i7);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2042E) {
            C2042E c2042e = (C2042E) obj;
            int i7 = c2042e.f24585b;
            int i10 = this.f24585b;
            if (i7 == i10) {
                Object[] objArr = this.f24584a;
                Object[] objArr2 = c2042e.f24584a;
                Xb.g I6 = h3.H.I(0, i10);
                int i11 = I6.f11025a;
                int i12 = I6.f11026b;
                if (i11 > i12) {
                    return true;
                }
                while (kotlin.jvm.internal.l.a(objArr[i11], objArr2[i11])) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(Object obj) {
        int i7 = 0;
        if (obj == null) {
            Object[] objArr = this.f24584a;
            int i10 = this.f24585b;
            while (i7 < i10) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        Object[] objArr2 = this.f24584a;
        int i11 = this.f24585b;
        while (i7 < i11) {
            if (obj.equals(objArr2[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public final boolean g() {
        return this.f24585b == 0;
    }

    public final boolean h() {
        return this.f24585b != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f24584a;
        int i7 = this.f24585b;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj = objArr[i11];
            i10 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i10;
    }

    public final Object i(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f24585b)) {
            l(i7);
            throw null;
        }
        Object[] objArr = this.f24584a;
        Object obj = objArr[i7];
        if (i7 != i10 - 1) {
            Eb.n.P(objArr, i7, objArr, i7 + 1, i10);
        }
        int i11 = this.f24585b - 1;
        this.f24585b = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void j(int i7, int i10) {
        int i11;
        if (i7 < 0 || i7 > (i11 = this.f24585b) || i10 < 0 || i10 > i11) {
            StringBuilder q10 = h3.o.q(i7, i10, "Start (", ") and end (", ") must be in 0..");
            q10.append(this.f24585b);
            AbstractC2121a.d(q10.toString());
            throw null;
        }
        if (i10 < i7) {
            AbstractC2121a.c("Start (" + i7 + ") is more than end (" + i10 + ')');
            throw null;
        }
        if (i10 != i7) {
            if (i10 < i11) {
                Object[] objArr = this.f24584a;
                Eb.n.P(objArr, i7, objArr, i10, i11);
            }
            int i12 = this.f24585b;
            int i13 = i12 - (i10 - i7);
            Eb.n.U(this.f24584a, null, i13, i12);
            this.f24585b = i13;
        }
    }

    public final void k(int i7, Object[] oldContent) {
        kotlin.jvm.internal.l.e(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i7, (length * 3) / 2)];
        Eb.n.P(oldContent, 0, objArr, 0, length);
        this.f24584a = objArr;
    }

    public final void l(int i7) {
        StringBuilder r10 = h3.o.r(i7, "Index ", " must be in 0..");
        r10.append(this.f24585b - 1);
        AbstractC2121a.d(r10.toString());
        throw null;
    }

    public final String toString() {
        C0005a c0005a = new C0005a(this, 28);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f24584a;
        int i7 = this.f24585b;
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) c0005a.invoke(obj));
            i10++;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
