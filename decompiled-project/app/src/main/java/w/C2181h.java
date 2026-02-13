package w;

import java.util.List;
import java.util.NoSuchElementException;
import y0.AbstractC2323H;
import y0.InterfaceC2316A;
import y0.InterfaceC2317B;

/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2181h implements InterfaceC2316A {

    /* renamed from: a, reason: collision with root package name */
    public final C2187n f25578a;

    public C2181h(C2187n c2187n) {
        this.f25578a = c2187n;
    }

    @Override // y0.InterfaceC2316A
    public final InterfaceC2317B c(A0.T t5, List list, long j) {
        AbstractC2323H abstractC2323H;
        int i7;
        int i10;
        int i11;
        AbstractC2323H abstractC2323H2;
        int i12;
        int i13;
        int size = list.size();
        AbstractC2323H[] abstractC2323HArr = new AbstractC2323H[size];
        int size2 = list.size();
        long j10 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                break;
            }
            y0.z zVar = (y0.z) list.get(i14);
            Object d10 = zVar.d();
            C2183j c2183j = d10 instanceof C2183j ? (C2183j) d10 : null;
            if (c2183j != null && ((Boolean) c2183j.f25579a.getValue()).booleanValue()) {
                abstractC2323HArr[i14] = zVar.b(j);
                j10 = (r7.f26555b & 4294967295L) | (r7.f26554a << 32);
            }
            i14++;
        }
        int size3 = list.size();
        for (int i15 = 0; i15 < size3; i15++) {
            y0.z zVar2 = (y0.z) list.get(i15);
            if (abstractC2323HArr[i15] == null) {
                abstractC2323HArr[i15] = zVar2.b(j);
            }
        }
        if (t5.m()) {
            i10 = (int) (j10 >> 32);
        } else {
            if (size == 0) {
                abstractC2323H = null;
            } else {
                abstractC2323H = abstractC2323HArr[0];
                int i16 = size - 1;
                if (i16 != 0) {
                    int i17 = abstractC2323H != null ? abstractC2323H.f26554a : 0;
                    Xb.e eVar = new Xb.e(1, i16, 1);
                    int i18 = eVar.f11027c;
                    int i19 = eVar.f11026b;
                    boolean z8 = i18 <= 0 ? 1 >= i19 : 1 <= i19;
                    int i20 = z8 ? 1 : i19;
                    while (z8) {
                        if (i20 != i19) {
                            i7 = i20 + i18;
                        } else {
                            if (!z8) {
                                throw new NoSuchElementException();
                            }
                            i7 = i20;
                            z8 = false;
                        }
                        AbstractC2323H abstractC2323H3 = abstractC2323HArr[i20];
                        int i21 = abstractC2323H3 != null ? abstractC2323H3.f26554a : 0;
                        if (i17 < i21) {
                            abstractC2323H = abstractC2323H3;
                            i20 = i7;
                            i17 = i21;
                        } else {
                            i20 = i7;
                        }
                    }
                }
            }
            i10 = abstractC2323H != null ? abstractC2323H.f26554a : 0;
        }
        if (t5.m()) {
            i13 = (int) (j10 & 4294967295L);
        } else {
            if (size == 0) {
                i11 = 0;
                abstractC2323H2 = null;
            } else {
                i11 = 0;
                abstractC2323H2 = abstractC2323HArr[0];
                int i22 = size - 1;
                if (i22 != 0) {
                    int i23 = abstractC2323H2 != null ? abstractC2323H2.f26555b : 0;
                    Xb.e eVar2 = new Xb.e(1, i22, 1);
                    int i24 = eVar2.f11027c;
                    int i25 = eVar2.f11026b;
                    boolean z10 = i24 <= 0 ? 1 >= i25 : 1 <= i25;
                    int i26 = z10 ? 1 : i25;
                    while (z10) {
                        if (i26 != i25) {
                            i12 = i26 + i24;
                        } else {
                            if (!z10) {
                                throw new NoSuchElementException();
                            }
                            z10 = false;
                            i12 = i26;
                        }
                        AbstractC2323H abstractC2323H4 = abstractC2323HArr[i26];
                        int i27 = abstractC2323H4 != null ? abstractC2323H4.f26555b : 0;
                        i26 = i12;
                        if (i23 < i27) {
                            abstractC2323H2 = abstractC2323H4;
                            i23 = i27;
                        }
                    }
                }
            }
            i13 = abstractC2323H2 != null ? abstractC2323H2.f26555b : i11;
        }
        if (!t5.m()) {
            this.f25578a.f25592c.setValue(new V0.k((i10 << 32) | (i13 & 4294967295L)));
        }
        return t5.Q(i10, i13, Eb.w.f3892a, new F.P(abstractC2323HArr, this, i10, i13));
    }
}
