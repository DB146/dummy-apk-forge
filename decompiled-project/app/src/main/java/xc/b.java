package xc;

import androidx.datastore.preferences.protobuf.C0801d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import yc.D;

/* loaded from: classes2.dex */
public final class b implements Iterable, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f26332a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String[] f26333b = new String[3];

    /* renamed from: c, reason: collision with root package name */
    public Object[] f26334c = new Object[3];

    public static boolean G(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    public final String C(String str) {
        Object obj;
        int F10 = F(str);
        return (F10 == -1 || (obj = this.f26334c[F10]) == null) ? "" : (String) obj;
    }

    public final void D(wc.c cVar, f fVar) {
        String a9;
        int i7 = this.f26332a;
        for (int i10 = 0; i10 < i7; i10++) {
            String str = this.f26333b[i10];
            if (!G(str) && (a9 = a.a(fVar.f26340f, str)) != null) {
                a.b(a9, (String) this.f26334c[i10], cVar.a(' '), fVar);
            }
        }
    }

    public final int E(String str) {
        vc.i.D(str);
        for (int i7 = 0; i7 < this.f26332a; i7++) {
            if (str.equals(this.f26333b[i7])) {
                return i7;
            }
        }
        return -1;
    }

    public final int F(String str) {
        vc.i.D(str);
        for (int i7 = 0; i7 < this.f26332a; i7++) {
            if (str.equalsIgnoreCase(this.f26333b[i7])) {
                return i7;
            }
        }
        return -1;
    }

    public final void H(String str, String str2) {
        vc.i.D(str);
        int E10 = E(str);
        if (E10 != -1) {
            this.f26334c[E10] = str2;
        } else {
            i(str, str2);
        }
    }

    public final void I(int i7) {
        int i10 = this.f26332a;
        if (i7 >= i10) {
            throw new IllegalArgumentException("Must be false");
        }
        int i11 = (i10 - i7) - 1;
        if (i11 > 0) {
            String[] strArr = this.f26333b;
            int i12 = i7 + 1;
            System.arraycopy(strArr, i12, strArr, i7, i11);
            Object[] objArr = this.f26334c;
            System.arraycopy(objArr, i12, objArr, i7, i11);
        }
        int i13 = this.f26332a - 1;
        this.f26332a = i13;
        this.f26333b[i13] = null;
        this.f26334c[i13] = null;
    }

    public final Map J() {
        int E10 = E("/jsoup.userdata");
        if (E10 != -1) {
            return (Map) this.f26334c[E10];
        }
        HashMap hashMap = new HashMap();
        i("/jsoup.userdata", hashMap);
        return hashMap;
    }

    public final void b(b bVar) {
        int i7 = bVar.f26332a;
        if (i7 == 0) {
            return;
        }
        o(this.f26332a + i7);
        boolean z8 = this.f26332a != 0;
        C0801d c0801d = new C0801d(bVar);
        while (c0801d.hasNext()) {
            a aVar = (a) c0801d.next();
            if (z8) {
                String str = aVar.f26330b;
                H(aVar.f26329a, str != null ? str : "");
                aVar.f26331c = this;
            } else {
                String str2 = aVar.f26329a;
                String str3 = aVar.f26330b;
                i(str2, str3 != null ? str3 : "");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f26332a != bVar.f26332a) {
            return false;
        }
        for (int i7 = 0; i7 < this.f26332a; i7++) {
            int E10 = bVar.E(this.f26333b[i7]);
            if (E10 == -1 || !Objects.equals(this.f26334c[i7], bVar.f26334c[E10])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26334c) + (((this.f26332a * 31) + Arrays.hashCode(this.f26333b)) * 31);
    }

    public final void i(String str, Serializable serializable) {
        o(this.f26332a + 1);
        String[] strArr = this.f26333b;
        int i7 = this.f26332a;
        strArr[i7] = str;
        this.f26334c[i7] = serializable;
        this.f26332a = i7 + 1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0801d(this);
    }

    public final void o(int i7) {
        vc.i.y(i7 >= this.f26332a);
        String[] strArr = this.f26333b;
        int length = strArr.length;
        if (length >= i7) {
            return;
        }
        int i10 = length >= 3 ? this.f26332a * 2 : 3;
        if (i7 <= i10) {
            i7 = i10;
        }
        this.f26333b = (String[]) Arrays.copyOf(strArr, i7);
        this.f26334c = Arrays.copyOf(this.f26334c, i7);
    }

    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f26332a = this.f26332a;
            bVar.f26333b = (String[]) Arrays.copyOf(this.f26333b, this.f26332a);
            bVar.f26334c = Arrays.copyOf(this.f26334c, this.f26332a);
            int E10 = E("/jsoup.userdata");
            if (E10 != -1) {
                this.f26334c[E10] = new HashMap((Map) this.f26334c[E10]);
            }
            return bVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String toString() {
        StringBuilder b2 = wc.l.b();
        D(wc.c.e(b2), new f());
        return wc.l.l(b2);
    }

    public final int y(D d10) {
        int i7 = 0;
        if (this.f26332a == 0) {
            return 0;
        }
        boolean z8 = d10.f27650b;
        int i10 = 0;
        while (i7 < this.f26332a) {
            String str = this.f26333b[i7];
            i7++;
            int i11 = i7;
            while (i11 < this.f26332a) {
                if ((z8 && str.equals(this.f26333b[i11])) || (!z8 && str.equalsIgnoreCase(this.f26333b[i11]))) {
                    i10++;
                    I(i11);
                    i11--;
                }
                i11++;
            }
        }
        return i10;
    }

    public final String z(String str) {
        Object obj;
        int E10 = E(str);
        return (E10 == -1 || (obj = this.f26334c[E10]) == null) ? "" : (String) obj;
    }
}
