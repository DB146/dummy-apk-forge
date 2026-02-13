package U;

import Eb.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final i f9409b = new i(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9410a;

    public i(Object[] objArr) {
        this.f9410a = objArr;
    }

    @Override // U.c
    public final c C(b bVar) {
        Object[] objArr = this.f9410a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z8 = false;
        for (int i7 = 0; i7 < length2; i7++) {
            Object obj = objArr[i7];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z8) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    l.d(objArr2, "copyOf(...)");
                    z8 = true;
                    length = i7;
                }
            } else if (z8) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f9409b : new i(n.T(objArr2, 0, length));
    }

    @Override // U.c
    public final c D(int i7) {
        Object[] objArr = this.f9410a;
        Tb.a.d(i7, objArr.length);
        if (objArr.length == 1) {
            return f9409b;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        l.d(copyOf, "copyOf(...)");
        n.P(objArr, i7, copyOf, i7 + 1, objArr.length);
        return new i(copyOf);
    }

    @Override // U.c
    public final c E(int i7, Object obj) {
        Object[] objArr = this.f9410a;
        Tb.a.d(i7, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l.d(copyOf, "copyOf(...)");
        copyOf[i7] = obj;
        return new i(copyOf);
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        return this.f9410a.length;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Tb.a.d(i7, b());
        return this.f9410a[i7];
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final int indexOf(Object obj) {
        return n.a0(this.f9410a, obj);
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f9410a;
        l.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i7 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i7 < 0) {
                    return -1;
                }
                length = i7;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i10 = length2 - 1;
                if (obj.equals(objArr[length2])) {
                    return length2;
                }
                if (i10 < 0) {
                    return -1;
                }
                length2 = i10;
            }
        }
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final ListIterator listIterator(int i7) {
        Object[] objArr = this.f9410a;
        Tb.a.e(i7, objArr.length);
        return new d(objArr, i7, objArr.length);
    }

    @Override // U.c
    public final c o(int i7, Object obj) {
        Object[] objArr = this.f9410a;
        Tb.a.e(i7, objArr.length);
        if (i7 == objArr.length) {
            return t(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            n.R(objArr, 0, objArr2, i7, 6);
            n.P(objArr, i7 + 1, objArr2, i7, objArr.length);
            objArr2[i7] = obj;
            return new i(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l.d(copyOf, "copyOf(...)");
        n.P(objArr, i7 + 1, copyOf, i7, objArr.length - 1);
        copyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // U.c
    public final c t(Object obj) {
        Object[] objArr = this.f9410a;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        l.d(copyOf, "copyOf(...)");
        copyOf[objArr.length] = obj;
        return new i(copyOf);
    }

    @Override // U.c
    public final c y(Collection collection) {
        Object[] objArr = this.f9410a;
        if (collection.size() + objArr.length > 32) {
            f z8 = z();
            z8.addAll(collection);
            return z8.t();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        l.d(copyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new i(copyOf);
    }

    @Override // U.c
    public final f z() {
        return new f(this, null, this.f9410a, 0);
    }
}
