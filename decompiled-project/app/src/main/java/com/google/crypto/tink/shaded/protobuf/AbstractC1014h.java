package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0801d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1014h implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C1013g f15775b = new C1013g(A.f15706b);

    /* renamed from: c, reason: collision with root package name */
    public static final C1011e f15776c;

    /* renamed from: a, reason: collision with root package name */
    public int f15777a;

    static {
        f15776c = AbstractC1009c.a() ? new C1011e(1) : new C1011e(0);
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

    public static C1013g o(int i7, byte[] bArr, int i10) {
        byte[] copyOfRange;
        i(i7, i7 + i10, bArr.length);
        switch (f15776c.f15768a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i10 + i7);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i7, copyOfRange, 0, i10);
                break;
        }
        return new C1013g(copyOfRange);
    }

    public abstract byte b(int i7);

    public final int hashCode() {
        int i7 = this.f15777a;
        if (i7 == 0) {
            int size = size();
            C1013g c1013g = (C1013g) this;
            int z8 = c1013g.z();
            int i10 = size;
            for (int i11 = z8; i11 < z8 + size; i11++) {
                i10 = (i10 * 31) + c1013g.f15773d[i11];
            }
            i7 = i10 == 0 ? 1 : i10;
            this.f15777a = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0801d(this);
    }

    public abstract int size();

    public abstract void t(int i7, byte[] bArr);

    public final String toString() {
        C1013g c1012f;
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = P.R(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            C1013g c1013g = (C1013g) this;
            int i7 = i(0, 47, c1013g.size());
            if (i7 == 0) {
                c1012f = f15775b;
            } else {
                c1012f = new C1012f(c1013g.f15773d, c1013g.z(), i7);
            }
            sb3.append(P.R(c1012f));
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

    public abstract byte y(int i7);
}
