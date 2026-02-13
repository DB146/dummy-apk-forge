package a0;

import P4.C0463k;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686m implements Iterable, Sb.a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0686m f12397e = new C0686m(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f12398a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12399b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12400c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f12401d;

    public C0686m(long j, long j10, long j11, long[] jArr) {
        this.f12398a = j;
        this.f12399b = j10;
        this.f12400c = j11;
        this.f12401d = jArr;
    }

    public final C0686m b(C0686m c0686m) {
        C0686m c0686m2;
        long[] jArr;
        C0686m c0686m3 = f12397e;
        if (c0686m == c0686m3) {
            return this;
        }
        if (this == c0686m3) {
            return c0686m3;
        }
        long j = c0686m.f12400c;
        long j10 = this.f12400c;
        long[] jArr2 = c0686m.f12401d;
        long j11 = c0686m.f12399b;
        long j12 = c0686m.f12398a;
        if (j == j10 && jArr2 == (jArr = this.f12401d)) {
            return new C0686m(this.f12398a & (~j12), this.f12399b & (~j11), j10, jArr);
        }
        if (jArr2 != null) {
            c0686m2 = this;
            for (long j13 : jArr2) {
                c0686m2 = c0686m2.o(j13);
            }
        } else {
            c0686m2 = this;
        }
        long j14 = 0;
        long j15 = c0686m.f12400c;
        if (j11 != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                if ((j11 & (1 << i7)) != 0) {
                    c0686m2 = c0686m2.o(i7 + j15);
                }
            }
        }
        if (j12 != 0) {
            int i10 = 0;
            while (i10 < 64) {
                if (((1 << i10) & j12) != j14) {
                    c0686m2 = c0686m2.o(i10 + j15 + 64);
                }
                i10++;
                j14 = 0;
            }
        }
        return c0686m2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return O5.b.w(new C0685l(this, null));
    }

    public final C0686m o(long j) {
        long[] jArr;
        int b2;
        long[] jArr2;
        long j10 = this.f12400c;
        long j11 = j - j10;
        if (j11 >= 0 && j11 < 64) {
            long j12 = 1 << ((int) j11);
            long j13 = this.f12399b;
            if ((j13 & j12) != 0) {
                return new C0686m(this.f12398a, j13 & (~j12), j10, this.f12401d);
            }
        } else if (j11 >= 64 && j11 < 128) {
            long j14 = 1 << (((int) j11) - 64);
            long j15 = this.f12398a;
            if ((j15 & j14) != 0) {
                return new C0686m(j15 & (~j14), this.f12399b, j10, this.f12401d);
            }
        } else if (j11 < 0 && (jArr = this.f12401d) != null && (b2 = AbstractC0692s.b(jArr, j)) >= 0) {
            int length = jArr.length;
            int i7 = length - 1;
            if (i7 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i7];
                if (b2 > 0) {
                    Eb.n.O(jArr, jArr3, 0, 0, b2);
                }
                if (b2 < i7) {
                    Eb.n.O(jArr, jArr3, b2, b2 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C0686m(this.f12398a, this.f12399b, this.f12400c, jArr2);
        }
        return this;
    }

    public final boolean t(long j) {
        long[] jArr;
        long j10 = j - this.f12400c;
        if (j10 < 0 || j10 >= 64) {
            if (j10 < 64 || j10 >= 128) {
                if (j10 <= 0 && (jArr = this.f12401d) != null && AbstractC0692s.b(jArr, j) >= 0) {
                    return true;
                }
            } else if (((1 << (((int) j10) - 64)) & this.f12398a) != 0) {
                return true;
            }
        } else if (((1 << ((int) j10)) & this.f12399b) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(Eb.p.S(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            i7++;
            if (i7 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }

    public final C0686m y(C0686m c0686m) {
        C0686m c0686m2;
        long[] jArr;
        C0686m c0686m3 = c0686m;
        C0686m c0686m4 = f12397e;
        if (c0686m3 == c0686m4) {
            return this;
        }
        if (this == c0686m4) {
            return c0686m3;
        }
        long j = c0686m3.f12400c;
        long j10 = this.f12400c;
        long j11 = this.f12399b;
        long j12 = this.f12398a;
        long[] jArr2 = c0686m3.f12401d;
        long j13 = c0686m3.f12399b;
        long j14 = c0686m3.f12398a;
        if (j == j10 && jArr2 == (jArr = this.f12401d)) {
            return new C0686m(j12 | j14, j11 | j13, j10, jArr);
        }
        long j15 = 1;
        long[] jArr3 = this.f12401d;
        if (jArr3 == null) {
            if (jArr3 != null) {
                for (long j16 : jArr3) {
                    c0686m3 = c0686m3.z(j16);
                }
            }
            long j17 = this.f12400c;
            if (j11 != 0) {
                for (int i7 = 0; i7 < 64; i7++) {
                    if (((1 << i7) & j11) != 0) {
                        c0686m3 = c0686m3.z(i7 + j17);
                    }
                }
            }
            if (j12 == 0) {
                return c0686m3;
            }
            int i10 = 0;
            while (i10 < 64) {
                if (((j15 << i10) & j12) != 0) {
                    c0686m3 = c0686m3.z(i10 + j17 + 64);
                }
                i10++;
                j15 = 1;
            }
            return c0686m3;
        }
        if (jArr2 != null) {
            c0686m2 = this;
            for (long j18 : jArr2) {
                c0686m2 = c0686m2.z(j18);
            }
        } else {
            c0686m2 = this;
        }
        long j19 = c0686m3.f12400c;
        if (j13 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((j13 & (1 << i11)) != 0) {
                    c0686m2 = c0686m2.z(i11 + j19);
                }
            }
        }
        if (j14 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j14) != 0) {
                    c0686m2 = c0686m2.z(i12 + j19 + 64);
                }
            }
        }
        return c0686m2;
    }

    public final C0686m z(long j) {
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        long j12 = this.f12400c;
        long j13 = j - j12;
        long j14 = this.f12399b;
        if (j13 < 0 || j13 >= 64) {
            long j15 = this.f12398a;
            int i7 = 64;
            if (j13 < 64 || j13 >= 128) {
                long[] jArr3 = this.f12401d;
                if (j13 < 128) {
                    if (jArr3 == null) {
                        return new C0686m(j15, j14, j12, new long[]{j});
                    }
                    int b2 = AbstractC0692s.b(jArr3, j);
                    if (b2 < 0) {
                        int i10 = -(b2 + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        Eb.n.O(jArr3, jArr4, 0, 0, i10);
                        Eb.n.O(jArr3, jArr4, 1 + i10, i10, length);
                        jArr4[i10] = j;
                        return new C0686m(this.f12398a, this.f12399b, this.f12400c, jArr4);
                    }
                } else if (!t(j)) {
                    long j16 = 64;
                    long j17 = ((j + 1) / j16) * j16;
                    if (j17 < 0) {
                        j17 = 9223372036854775680L;
                    }
                    long j18 = j14;
                    long j19 = this.f12400c;
                    long j20 = j15;
                    C0463k c0463k = null;
                    while (true) {
                        if (j19 >= j17) {
                            j10 = j19;
                            j11 = j18;
                            break;
                        }
                        if (j18 != 0) {
                            if (c0463k == null) {
                                c0463k = new C0463k(jArr3);
                            }
                            int i11 = 0;
                            while (i11 < i7) {
                                long j21 = j16;
                                if ((j18 & (1 << i11)) != 0) {
                                    ((u.z) c0463k.f8074b).a(i11 + j19);
                                }
                                i11++;
                                j16 = j21;
                                i7 = 64;
                            }
                        }
                        long j22 = j16;
                        if (j20 == 0) {
                            j11 = 0;
                            j10 = j17;
                            break;
                        }
                        j19 += j22;
                        j18 = j20;
                        j16 = j22;
                        i7 = 64;
                        j20 = 0;
                    }
                    if (c0463k != null) {
                        u.z zVar = (u.z) c0463k.f8074b;
                        int i12 = zVar.f24736b;
                        if (i12 == 0) {
                            jArr2 = null;
                        } else {
                            jArr2 = new long[i12];
                            long[] jArr5 = zVar.f24735a;
                            for (int i13 = 0; i13 < i12; i13++) {
                                jArr2[i13] = jArr5[i13];
                            }
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new C0686m(j20, j11, j10, jArr).z(j);
                        }
                    }
                    jArr = jArr3;
                    return new C0686m(j20, j11, j10, jArr).z(j);
                }
            } else {
                long j23 = 1 << (((int) j13) - 64);
                if ((j15 & j23) == 0) {
                    return new C0686m(j15 | j23, j14, j12, this.f12401d);
                }
            }
        } else {
            long j24 = 1 << ((int) j13);
            if ((j14 & j24) == 0) {
                return new C0686m(this.f12398a, j14 | j24, j12, this.f12401d);
            }
        }
        return this;
    }
}
