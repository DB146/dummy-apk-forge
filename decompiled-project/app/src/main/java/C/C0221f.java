package C;

import y0.InterfaceC2318C;

/* renamed from: C.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221f implements InterfaceC0220e, InterfaceC0222g {

    /* renamed from: a, reason: collision with root package name */
    public final float f2399a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2400b;

    public C0221f(float f4) {
        this.f2399a = f4;
        this.f2400b = f4;
    }

    @Override // C.InterfaceC0220e, C.InterfaceC0222g
    public final float a() {
        return this.f2400b;
    }

    @Override // C.InterfaceC0220e
    public final void b(InterfaceC2318C interfaceC2318C, int i7, int[] iArr, V0.l lVar, int[] iArr2) {
        int i10;
        int i11;
        if (iArr.length == 0) {
            return;
        }
        int B10 = interfaceC2318C.B(this.f2399a);
        boolean z8 = lVar == V0.l.f9983b;
        C0219d c0219d = AbstractC0224i.f2402a;
        if (z8) {
            i10 = 0;
            i11 = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i12 = iArr[length];
                int min = Math.min(i10, i7 - i12);
                iArr2[length] = min;
                i11 = Math.min(B10, (i7 - min) - i12);
                i10 = iArr2[length] + i12 + i11;
            }
        } else {
            int length2 = iArr.length;
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            int i14 = 0;
            while (i13 < length2) {
                int i15 = iArr[i13];
                int min2 = Math.min(i10, i7 - i15);
                iArr2[i14] = min2;
                int min3 = Math.min(B10, (i7 - min2) - i15);
                int i16 = iArr2[i14] + i15 + min3;
                i13++;
                i14++;
                i11 = min3;
                i10 = i16;
            }
        }
        if (i10 - i11 < i7) {
            int round = Math.round((1 + (lVar != V0.l.f9982a ? (-1.0f) * (-1) : -1.0f)) * ((i7 - r11) / 2.0f));
            int length3 = iArr2.length;
            for (int i17 = 0; i17 < length3; i17++) {
                iArr2[i17] = iArr2[i17] + round;
            }
        }
    }

    @Override // C.InterfaceC0222g
    public final void c(InterfaceC2318C interfaceC2318C, int i7, int[] iArr, int[] iArr2) {
        b(interfaceC2318C, i7, iArr, V0.l.f9982a, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0221f)) {
            return false;
        }
        if (!V0.f.a(this.f2399a, ((C0221f) obj).f2399a)) {
            return false;
        }
        Object obj2 = C0223h.f2401a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C0223h.f2401a.hashCode() + h3.o.g(true, Float.hashCode(this.f2399a) * 31, 31);
    }

    public final String toString() {
        StringBuilder n6 = A3.c.n("", "Arrangement#spacedAligned(");
        n6.append((Object) V0.f.b(this.f2399a));
        n6.append(", ");
        n6.append(C0223h.f2401a);
        n6.append(')');
        return n6.toString();
    }
}
