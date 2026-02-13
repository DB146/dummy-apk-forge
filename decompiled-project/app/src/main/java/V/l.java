package V;

import Q.AbstractC0495i0;
import Q.S;
import h3.H;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final l f9957e = new l(0, 0, new Object[0], null);

    /* renamed from: a, reason: collision with root package name */
    public int f9958a;

    /* renamed from: b, reason: collision with root package name */
    public int f9959b;

    /* renamed from: c, reason: collision with root package name */
    public final X.b f9960c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9961d;

    public l(int i7, int i10, Object[] objArr, X.b bVar) {
        this.f9958a = i7;
        this.f9959b = i10;
        this.f9960c = bVar;
        this.f9961d = objArr;
    }

    public static l j(int i7, Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11, X.b bVar) {
        if (i11 > 30) {
            return new l(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int u3 = O5.b.u(i7, i11);
        int u10 = O5.b.u(i10, i11);
        if (u3 != u10) {
            return new l((1 << u3) | (1 << u10), 0, u3 < u10 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new l(0, 1 << u3, new Object[]{j(i7, obj, obj2, i10, obj3, obj4, i11 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i7, int i10, int i11, Object obj, Object obj2, int i12, X.b bVar) {
        Object obj3 = this.f9961d[i7];
        l j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i7), i11, obj, obj2, i12 + 5, bVar);
        int t5 = t(i10);
        int i13 = t5 + 1;
        Object[] objArr = this.f9961d;
        Object[] objArr2 = new Object[objArr.length - 1];
        Eb.n.R(objArr, 0, objArr2, i7, 6);
        Eb.n.P(objArr, i7, objArr2, i7 + 2, i13);
        objArr2[t5 - 1] = j;
        Eb.n.P(objArr, t5, objArr2, i13, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f9959b == 0) {
            return this.f9961d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f9958a);
        int length = this.f9961d.length;
        for (int i7 = bitCount * 2; i7 < length; i7++) {
            bitCount += s(i7).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        Xb.e F10 = H.F(H.I(0, this.f9961d.length), 2);
        int i7 = F10.f11025a;
        int i10 = F10.f11026b;
        int i11 = F10.f11027c;
        if ((i11 > 0 && i7 <= i10) || (i11 < 0 && i10 <= i7)) {
            while (!kotlin.jvm.internal.l.a(obj, this.f9961d[i7])) {
                if (i7 != i10) {
                    i7 += i11;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(Object obj, int i7, int i10) {
        int u3 = 1 << O5.b.u(i7, i10);
        if (h(u3)) {
            return kotlin.jvm.internal.l.a(obj, this.f9961d[f(u3)]);
        }
        if (!i(u3)) {
            return false;
        }
        l s3 = s(t(u3));
        return i10 == 30 ? s3.c(obj) : s3.d(obj, i7, i10 + 5);
    }

    public final boolean e(l lVar) {
        if (this == lVar) {
            return true;
        }
        if (this.f9959b != lVar.f9959b || this.f9958a != lVar.f9958a) {
            return false;
        }
        int length = this.f9961d.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (this.f9961d[i7] != lVar.f9961d[i7]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i7) {
        return Integer.bitCount((i7 - 1) & this.f9958a) * 2;
    }

    public final Object g(Object obj, int i7, int i10) {
        int u3 = 1 << O5.b.u(i7, i10);
        if (h(u3)) {
            int f4 = f(u3);
            if (kotlin.jvm.internal.l.a(obj, this.f9961d[f4])) {
                return x(f4);
            }
            return null;
        }
        if (!i(u3)) {
            return null;
        }
        l s3 = s(t(u3));
        if (i10 != 30) {
            return s3.g(obj, i7, i10 + 5);
        }
        Xb.e F10 = H.F(H.I(0, s3.f9961d.length), 2);
        int i11 = F10.f11025a;
        int i12 = F10.f11026b;
        int i13 = F10.f11027c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return null;
        }
        while (!kotlin.jvm.internal.l.a(obj, s3.f9961d[i11])) {
            if (i11 == i12) {
                return null;
            }
            i11 += i13;
        }
        return s3.x(i11);
    }

    public final boolean h(int i7) {
        return (i7 & this.f9958a) != 0;
    }

    public final boolean i(int i7) {
        return (i7 & this.f9959b) != 0;
    }

    public final l k(int i7, Y.i iVar) {
        iVar.e(iVar.f11051e - 1);
        iVar.f11049c = x(i7);
        Object[] objArr = this.f9961d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f9960c != iVar.f11047a) {
            return new l(0, 0, O5.b.e(i7, objArr), iVar.f11047a);
        }
        this.f9961d = O5.b.e(i7, objArr);
        return this;
    }

    public final l l(int i7, Object obj, Object obj2, int i10, Y.i iVar) {
        l l10;
        int u3 = 1 << O5.b.u(i7, i10);
        boolean h10 = h(u3);
        X.b bVar = this.f9960c;
        if (h10) {
            int f4 = f(u3);
            if (!kotlin.jvm.internal.l.a(obj, this.f9961d[f4])) {
                iVar.e(iVar.f11051e + 1);
                X.b bVar2 = iVar.f11047a;
                if (bVar != bVar2) {
                    return new l(this.f9958a ^ u3, this.f9959b | u3, a(f4, u3, i7, obj, obj2, i10, bVar2), bVar2);
                }
                this.f9961d = a(f4, u3, i7, obj, obj2, i10, bVar2);
                this.f9958a ^= u3;
                this.f9959b |= u3;
                return this;
            }
            iVar.f11049c = x(f4);
            if (x(f4) == obj2) {
                return this;
            }
            if (bVar == iVar.f11047a) {
                this.f9961d[f4 + 1] = obj2;
                return this;
            }
            iVar.f11050d++;
            Object[] objArr = this.f9961d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            copyOf[f4 + 1] = obj2;
            return new l(this.f9958a, this.f9959b, copyOf, iVar.f11047a);
        }
        if (!i(u3)) {
            iVar.e(iVar.f11051e + 1);
            X.b bVar3 = iVar.f11047a;
            int f10 = f(u3);
            if (bVar != bVar3) {
                return new l(this.f9958a | u3, this.f9959b, O5.b.d(this.f9961d, f10, obj, obj2), bVar3);
            }
            this.f9961d = O5.b.d(this.f9961d, f10, obj, obj2);
            this.f9958a |= u3;
            return this;
        }
        int t5 = t(u3);
        l s3 = s(t5);
        if (i10 == 30) {
            Xb.e F10 = H.F(H.I(0, s3.f9961d.length), 2);
            int i11 = F10.f11025a;
            int i12 = F10.f11026b;
            int i13 = F10.f11027c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (!kotlin.jvm.internal.l.a(obj, s3.f9961d[i11])) {
                    if (i11 != i12) {
                        i11 += i13;
                    }
                }
                iVar.f11049c = s3.x(i11);
                if (s3.f9960c == iVar.f11047a) {
                    s3.f9961d[i11 + 1] = obj2;
                    l10 = s3;
                } else {
                    iVar.f11050d++;
                    Object[] objArr2 = s3.f9961d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
                    copyOf2[i11 + 1] = obj2;
                    l10 = new l(0, 0, copyOf2, iVar.f11047a);
                }
            }
            iVar.e(iVar.f11051e + 1);
            l10 = new l(0, 0, O5.b.d(s3.f9961d, 0, obj, obj2), iVar.f11047a);
            break;
        }
        l10 = s3.l(i7, obj, obj2, i10 + 5, iVar);
        return s3 == l10 ? this : r(t5, l10, iVar.f11047a);
    }

    public final l m(l lVar, int i7, X.a aVar, Y.i iVar) {
        Object[] objArr;
        int i10;
        int i11;
        l j;
        if (this == lVar) {
            aVar.f10900a += b();
            return this;
        }
        int i12 = 0;
        if (i7 > 30) {
            X.b bVar = iVar.f11047a;
            int i13 = lVar.f9959b;
            Object[] objArr2 = this.f9961d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + lVar.f9961d.length);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            int length = this.f9961d.length;
            Xb.e F10 = H.F(H.I(0, lVar.f9961d.length), 2);
            int i14 = F10.f11025a;
            int i15 = F10.f11026b;
            int i16 = F10.f11027c;
            if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                while (true) {
                    if (c(lVar.f9961d[i14])) {
                        aVar.f10900a++;
                    } else {
                        Object[] objArr3 = lVar.f9961d;
                        copyOf[length] = objArr3[i14];
                        copyOf[length + 1] = objArr3[i14 + 1];
                        length += 2;
                    }
                    if (i14 == i15) {
                        break;
                    }
                    i14 += i16;
                }
            }
            if (length == this.f9961d.length) {
                return this;
            }
            if (length == lVar.f9961d.length) {
                return lVar;
            }
            if (length == copyOf.length) {
                return new l(0, 0, copyOf, bVar);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
            return new l(0, 0, copyOf2, bVar);
        }
        int i17 = this.f9959b | lVar.f9959b;
        int i18 = this.f9958a;
        int i19 = lVar.f9958a;
        int i20 = (i18 ^ i19) & (~i17);
        int i21 = i18 & i19;
        int i22 = i20;
        while (i21 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i21);
            if (kotlin.jvm.internal.l.a(this.f9961d[f(lowestOneBit)], lVar.f9961d[lVar.f(lowestOneBit)])) {
                i22 |= lowestOneBit;
            } else {
                i17 |= lowestOneBit;
            }
            i21 ^= lowestOneBit;
        }
        if ((i17 & i22) != 0) {
            AbstractC0495i0.b("Check failed.");
        }
        l lVar2 = (kotlin.jvm.internal.l.a(this.f9960c, iVar.f11047a) && this.f9958a == i22 && this.f9959b == i17) ? this : new l(i22, i17, new Object[Integer.bitCount(i17) + (Integer.bitCount(i22) * 2)], null);
        int i23 = i17;
        int i24 = 0;
        while (i23 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i23);
            Object[] objArr4 = lVar2.f9961d;
            int length2 = (objArr4.length - 1) - i24;
            if (i(lowestOneBit2)) {
                j = s(t(lowestOneBit2));
                if (lVar.i(lowestOneBit2)) {
                    j = j.m(lVar.s(lVar.t(lowestOneBit2)), i7 + 5, aVar, iVar);
                } else if (lVar.h(lowestOneBit2)) {
                    int f4 = lVar.f(lowestOneBit2);
                    Object obj = lVar.f9961d[f4];
                    Object x2 = lVar.x(f4);
                    int i25 = iVar.f11051e;
                    objArr = objArr4;
                    i10 = i22;
                    i11 = lowestOneBit2;
                    j = j.l(obj != null ? obj.hashCode() : i12, obj, x2, i7 + 5, iVar);
                    if (iVar.f11051e == i25) {
                        aVar.f10900a++;
                    }
                }
                objArr = objArr4;
                i10 = i22;
                i11 = lowestOneBit2;
            } else {
                objArr = objArr4;
                i10 = i22;
                i11 = lowestOneBit2;
                if (lVar.i(i11)) {
                    j = lVar.s(lVar.t(i11));
                    if (h(i11)) {
                        int f10 = f(i11);
                        Object obj2 = this.f9961d[f10];
                        int i26 = i7 + 5;
                        if (j.d(obj2, obj2 != null ? obj2.hashCode() : 0, i26)) {
                            aVar.f10900a++;
                        } else {
                            j = j.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(f10), i26, iVar);
                        }
                    }
                } else {
                    int f11 = f(i11);
                    Object obj3 = this.f9961d[f11];
                    Object x10 = x(f11);
                    int f12 = lVar.f(i11);
                    Object obj4 = lVar.f9961d[f12];
                    j = j(obj3 != null ? obj3.hashCode() : 0, obj3, x10, obj4 != null ? obj4.hashCode() : 0, obj4, lVar.x(f12), i7 + 5, iVar.f11047a);
                }
            }
            objArr[length2] = j;
            i24++;
            i23 ^= i11;
            i22 = i10;
            i12 = 0;
        }
        int i27 = 0;
        while (i22 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i22);
            int i28 = i27 * 2;
            if (lVar.h(lowestOneBit3)) {
                int f13 = lVar.f(lowestOneBit3);
                Object[] objArr5 = lVar2.f9961d;
                objArr5[i28] = lVar.f9961d[f13];
                objArr5[i28 + 1] = lVar.x(f13);
                if (h(lowestOneBit3)) {
                    aVar.f10900a++;
                }
            } else {
                int f14 = f(lowestOneBit3);
                Object[] objArr6 = lVar2.f9961d;
                objArr6[i28] = this.f9961d[f14];
                objArr6[i28 + 1] = x(f14);
            }
            i27++;
            i22 ^= lowestOneBit3;
        }
        return e(lVar2) ? this : lVar.e(lVar2) ? lVar : lVar2;
    }

    public final l n(int i7, Object obj, int i10, Y.i iVar) {
        l n6;
        int u3 = 1 << O5.b.u(i7, i10);
        if (h(u3)) {
            int f4 = f(u3);
            return kotlin.jvm.internal.l.a(obj, this.f9961d[f4]) ? p(f4, u3, iVar) : this;
        }
        if (!i(u3)) {
            return this;
        }
        int t5 = t(u3);
        l s3 = s(t5);
        if (i10 == 30) {
            Xb.e F10 = H.F(H.I(0, s3.f9961d.length), 2);
            int i11 = F10.f11025a;
            int i12 = F10.f11026b;
            int i13 = F10.f11027c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (!kotlin.jvm.internal.l.a(obj, s3.f9961d[i11])) {
                    if (i11 != i12) {
                        i11 += i13;
                    }
                }
                n6 = s3.k(i11, iVar);
            }
            n6 = s3;
            break;
        }
        n6 = s3.n(i7, obj, i10 + 5, iVar);
        return q(s3, n6, t5, u3, iVar.f11047a);
    }

    public final l o(int i7, Object obj, Object obj2, int i10, Y.i iVar) {
        l o10;
        int u3 = 1 << O5.b.u(i7, i10);
        if (h(u3)) {
            int f4 = f(u3);
            return (kotlin.jvm.internal.l.a(obj, this.f9961d[f4]) && kotlin.jvm.internal.l.a(obj2, x(f4))) ? p(f4, u3, iVar) : this;
        }
        if (!i(u3)) {
            return this;
        }
        int t5 = t(u3);
        l s3 = s(t5);
        if (i10 == 30) {
            Xb.e F10 = H.F(H.I(0, s3.f9961d.length), 2);
            int i11 = F10.f11025a;
            int i12 = F10.f11026b;
            int i13 = F10.f11027c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (true) {
                    if (!kotlin.jvm.internal.l.a(obj, s3.f9961d[i11]) || !kotlin.jvm.internal.l.a(obj2, s3.x(i11))) {
                        if (i11 == i12) {
                            break;
                        }
                        i11 += i13;
                    } else {
                        o10 = s3.k(i11, iVar);
                        break;
                    }
                }
            }
            o10 = s3;
        } else {
            o10 = s3.o(i7, obj, obj2, i10 + 5, iVar);
        }
        return q(s3, o10, t5, u3, iVar.f11047a);
    }

    public final l p(int i7, int i10, Y.i iVar) {
        iVar.e(iVar.f11051e - 1);
        iVar.f11049c = x(i7);
        Object[] objArr = this.f9961d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f9960c != iVar.f11047a) {
            return new l(i10 ^ this.f9958a, this.f9959b, O5.b.e(i7, objArr), iVar.f11047a);
        }
        this.f9961d = O5.b.e(i7, objArr);
        this.f9958a ^= i10;
        return this;
    }

    public final l q(l lVar, l lVar2, int i7, int i10, X.b bVar) {
        X.b bVar2 = this.f9960c;
        if (lVar2 == null) {
            Object[] objArr = this.f9961d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 != bVar) {
                return new l(this.f9958a, i10 ^ this.f9959b, O5.b.f(i7, objArr), bVar);
            }
            this.f9961d = O5.b.f(i7, objArr);
            this.f9959b ^= i10;
        } else if (bVar2 == bVar || lVar != lVar2) {
            return r(i7, lVar2, bVar);
        }
        return this;
    }

    public final l r(int i7, l lVar, X.b bVar) {
        Object[] objArr = this.f9961d;
        if (objArr.length == 1 && lVar.f9961d.length == 2 && lVar.f9959b == 0) {
            lVar.f9958a = this.f9959b;
            return lVar;
        }
        if (this.f9960c == bVar) {
            objArr[i7] = lVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
        copyOf[i7] = lVar;
        return new l(this.f9958a, this.f9959b, copyOf, bVar);
    }

    public final l s(int i7) {
        Object obj = this.f9961d[i7];
        kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (l) obj;
    }

    public final int t(int i7) {
        return (this.f9961d.length - 1) - Integer.bitCount((i7 - 1) & this.f9959b);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final A7.a u(Object obj, int i7, int i10, Object obj2) {
        A7.a u3;
        int i11 = 1;
        int u10 = 1 << O5.b.u(i7, i10);
        int i12 = 0;
        if (h(u10)) {
            int f4 = f(u10);
            if (!kotlin.jvm.internal.l.a(obj, this.f9961d[f4])) {
                return new A7.a(new l(this.f9958a ^ u10, this.f9959b | u10, a(f4, u10, i7, obj, obj2, i10, null), null), i11);
            }
            if (x(f4) == obj2) {
                return null;
            }
            Object[] objArr = this.f9961d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            copyOf[f4 + 1] = obj2;
            return new A7.a(new l(this.f9958a, this.f9959b, copyOf, null), i12);
        }
        if (!i(u10)) {
            return new A7.a(new l(this.f9958a | u10, this.f9959b, O5.b.d(this.f9961d, f(u10), obj, obj2), null), i11);
        }
        int t5 = t(u10);
        l s3 = s(t5);
        if (i10 == 30) {
            Xb.e F10 = H.F(H.I(0, s3.f9961d.length), 2);
            int i13 = F10.f11025a;
            int i14 = F10.f11026b;
            int i15 = F10.f11027c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (!kotlin.jvm.internal.l.a(obj, s3.f9961d[i13])) {
                    if (i13 != i14) {
                        i13 += i15;
                    }
                }
                if (obj2 == s3.x(i13)) {
                    u3 = null;
                } else {
                    Object[] objArr2 = s3.f9961d;
                    Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
                    copyOf2[i13 + 1] = obj2;
                    u3 = new A7.a(new l(0, 0, copyOf2, null), i12);
                }
                if (u3 == null) {
                    return null;
                }
            }
            u3 = new A7.a(new l(0, 0, O5.b.d(s3.f9961d, 0, obj, obj2), null), i11);
            if (u3 == null) {
            }
        } else {
            u3 = s3.u(obj, i7, i10 + 5, obj2);
            if (u3 == null) {
                return null;
            }
        }
        u3.f532b = w(t5, u10, (l) u3.f532b);
        return u3;
    }

    public final l v(int i7, S s3, int i10) {
        l v10;
        int u3 = 1 << O5.b.u(i7, i10);
        if (h(u3)) {
            int f4 = f(u3);
            if (!kotlin.jvm.internal.l.a(s3, this.f9961d[f4])) {
                return this;
            }
            Object[] objArr = this.f9961d;
            if (objArr.length == 2) {
                return null;
            }
            return new l(this.f9958a ^ u3, this.f9959b, O5.b.e(f4, objArr), null);
        }
        if (!i(u3)) {
            return this;
        }
        int t5 = t(u3);
        l s10 = s(t5);
        if (i10 == 30) {
            Xb.e F10 = H.F(H.I(0, s10.f9961d.length), 2);
            int i11 = F10.f11025a;
            int i12 = F10.f11026b;
            int i13 = F10.f11027c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (!kotlin.jvm.internal.l.a(s3, s10.f9961d[i11])) {
                    if (i11 != i12) {
                        i11 += i13;
                    }
                }
                Object[] objArr2 = s10.f9961d;
                v10 = objArr2.length == 2 ? null : new l(0, 0, O5.b.e(i11, objArr2), null);
            }
            v10 = s10;
            break;
        }
        v10 = s10.v(i7, s3, i10 + 5);
        if (v10 != null) {
            return s10 != v10 ? w(t5, u3, v10) : this;
        }
        Object[] objArr3 = this.f9961d;
        if (objArr3.length == 1) {
            return null;
        }
        return new l(this.f9958a, u3 ^ this.f9959b, O5.b.f(t5, objArr3), null);
    }

    public final l w(int i7, int i10, l lVar) {
        Object[] objArr = lVar.f9961d;
        if (objArr.length != 2 || lVar.f9959b != 0) {
            Object[] objArr2 = this.f9961d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.l.d(copyOf, "copyOf(...)");
            copyOf[i7] = lVar;
            return new l(this.f9958a, this.f9959b, copyOf, null);
        }
        if (this.f9961d.length == 1) {
            lVar.f9958a = this.f9959b;
            return lVar;
        }
        int f4 = f(i10);
        Object[] objArr3 = this.f9961d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.l.d(copyOf2, "copyOf(...)");
        Eb.n.P(copyOf2, i7 + 2, copyOf2, i7 + 1, objArr3.length);
        Eb.n.P(copyOf2, f4 + 2, copyOf2, f4, i7);
        copyOf2[f4] = obj;
        copyOf2[f4 + 1] = obj2;
        return new l(this.f9958a ^ i10, i10 ^ this.f9959b, copyOf2, null);
    }

    public final Object x(int i7) {
        return this.f9961d[i7 + 1];
    }
}
