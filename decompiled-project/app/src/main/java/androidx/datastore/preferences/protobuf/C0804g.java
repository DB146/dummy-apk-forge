package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0804g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C0804g f13396c = new C0804g(AbstractC0819w.f13468b);

    /* renamed from: d, reason: collision with root package name */
    public static final C0802e f13397d;

    /* renamed from: a, reason: collision with root package name */
    public int f13398a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13399b;

    static {
        f13397d = AbstractC0800c.a() ? new C0802e(1) : new C0802e(0);
    }

    public C0804g(byte[] bArr) {
        bArr.getClass();
        this.f13399b = bArr;
    }

    public static int i(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(A3.c.f(i7, "Beginning index: ", " < 0"));
        }
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(X.c.e(i7, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(X.c.e(i10, i11, "End index: ", " >= "));
    }

    public static C0804g o(int i7, byte[] bArr, int i10) {
        byte[] copyOfRange;
        i(i7, i7 + i10, bArr.length);
        switch (f13397d.f13393a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i10 + i7);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i7, copyOfRange, 0, i10);
                break;
        }
        return new C0804g(copyOfRange);
    }

    public byte b(int i7) {
        return this.f13399b[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0804g) || size() != ((C0804g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0804g)) {
            return obj.equals(this);
        }
        C0804g c0804g = (C0804g) obj;
        int i7 = this.f13398a;
        int i10 = c0804g.f13398a;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int size = size();
        if (size > c0804g.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0804g.size()) {
            StringBuilder r10 = h3.o.r(size, "Ran off end of other: 0, ", ", ");
            r10.append(c0804g.size());
            throw new IllegalArgumentException(r10.toString());
        }
        int y10 = y() + size;
        int y11 = y();
        int y12 = c0804g.y();
        while (y11 < y10) {
            if (this.f13399b[y11] != c0804g.f13399b[y12]) {
                return false;
            }
            y11++;
            y12++;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f13398a;
        if (i7 == 0) {
            int size = size();
            int y10 = y();
            int i10 = size;
            for (int i11 = y10; i11 < y10 + size; i11++) {
                i10 = (i10 * 31) + this.f13399b[i11];
            }
            i7 = i10 == 0 ? 1 : i10;
            this.f13398a = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0801d(this);
    }

    public int size() {
        return this.f13399b.length;
    }

    public void t(int i7, byte[] bArr) {
        System.arraycopy(this.f13399b, 0, bArr, 0, i7);
    }

    public final String toString() {
        C0804g c0803f;
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = c2.q.j(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            int i7 = i(0, 47, size());
            if (i7 == 0) {
                c0803f = f13396c;
            } else {
                c0803f = new C0803f(this.f13399b, y(), i7);
            }
            sb3.append(c2.q.j(c0803f));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder("<ByteString@");
        sb4.append(hexString);
        sb4.append(" size=");
        sb4.append(size);
        sb4.append(" contents=\"");
        return h3.o.p(sb4, sb2, "\">");
    }

    public int y() {
        return 0;
    }

    public byte z(int i7) {
        return this.f13399b[i7];
    }
}
