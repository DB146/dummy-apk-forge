package T7;

import F.C0257a;
import L7.C0385e;
import java.util.ArrayList;
import java.util.Stack;
import v0.C2124a;
import v0.EnumC2125b;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9339a;

    /* renamed from: b, reason: collision with root package name */
    public int f9340b;

    /* renamed from: c, reason: collision with root package name */
    public int f9341c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9342d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9343e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9344f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f9345h;

    public /* synthetic */ h() {
        this(false, EnumC2125b.f24927a);
    }

    public h(int i7) {
        this(true, EnumC2125b.f24928b);
    }

    public h(C0257a c0257a) {
        this.f9342d = null;
        this.f9343e = new Stack();
        this.f9340b = -1;
        this.f9339a = true;
        this.f9344f = new ArrayList();
        this.g = new ArrayList();
        this.f9345h = c0257a;
    }

    public h(boolean z8, EnumC2125b enumC2125b) {
        int i7;
        this.f9339a = z8;
        this.f9342d = enumC2125b;
        if (z8 && enumC2125b.equals(EnumC2125b.f24927a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int ordinal = enumC2125b.ordinal();
        if (ordinal == 0) {
            i7 = 3;
        } else {
            if (ordinal != 1) {
                throw new Db.d(1);
            }
            i7 = 2;
        }
        this.f9340b = i7;
        this.f9343e = new C2124a[20];
        this.f9344f = new float[20];
        this.g = new float[20];
        this.f9345h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, v0.a] */
    public void a(long j, float f4) {
        int i7 = (this.f9341c + 1) % 20;
        this.f9341c = i7;
        C2124a[] c2124aArr = (C2124a[]) this.f9343e;
        C2124a c2124a = c2124aArr[i7];
        if (c2124a != 0) {
            c2124a.f24925a = j;
            c2124a.f24926b = f4;
        } else {
            ?? obj = new Object();
            obj.f24925a = j;
            obj.f24926b = f4;
            c2124aArr[i7] = obj;
        }
    }

    public float b(float f4) {
        EnumC2125b enumC2125b;
        float[] fArr;
        float[] fArr2;
        boolean z8;
        float f10;
        float f11;
        float f12 = f4;
        float f13 = 0.0f;
        if (f12 <= 0.0f) {
            AbstractC2256a.b("maximumVelocity should be a positive value. You specified=" + f12);
        }
        int i7 = this.f9341c;
        C2124a[] c2124aArr = (C2124a[]) this.f9343e;
        C2124a c2124a = c2124aArr[i7];
        if (c2124a == null) {
            f10 = 0.0f;
        } else {
            int i10 = 0;
            C2124a c2124a2 = c2124a;
            while (true) {
                C2124a c2124a3 = c2124aArr[i7];
                boolean z10 = this.f9339a;
                enumC2125b = (EnumC2125b) this.f9342d;
                fArr = (float[]) this.f9344f;
                fArr2 = (float[]) this.g;
                if (c2124a3 != null) {
                    long j = c2124a.f24925a;
                    int i11 = i7;
                    long j10 = c2124a3.f24925a;
                    float f14 = (float) (j - j10);
                    z8 = z10;
                    float abs = (float) Math.abs(j10 - c2124a2.f24925a);
                    c2124a2 = (enumC2125b == EnumC2125b.f24927a || z8) ? c2124a3 : c2124a;
                    if (f14 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i10] = c2124a3.f24926b;
                    fArr2[i10] = -f14;
                    i7 = (i11 == 0 ? 20 : i11) - 1;
                    i10++;
                    if (i10 >= 20) {
                        break;
                    }
                } else {
                    z8 = z10;
                    break;
                }
            }
            if (i10 >= this.f9340b) {
                int ordinal = enumC2125b.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = (float[]) this.f9345h;
                        q3.f.x(fArr2, fArr, i10, fArr3);
                        f11 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f11 = 0.0f;
                    }
                } else {
                    if (ordinal != 1) {
                        throw new Db.d(1);
                    }
                    int i12 = i10 - 1;
                    float f15 = fArr2[i12];
                    int i13 = i12;
                    float f16 = 0.0f;
                    while (i13 > 0) {
                        int i14 = i13 - 1;
                        float f17 = fArr2[i14];
                        if (f15 != f17) {
                            float f18 = (z8 ? -fArr[i14] : fArr[i13] - fArr[i14]) / (f15 - f17);
                            f16 += Math.abs(f18) * (f18 - (Math.signum(f16) * ((float) Math.sqrt(Math.abs(f16) * 2))));
                            if (i13 == i12) {
                                f16 *= 0.5f;
                            }
                        }
                        i13--;
                        f15 = f17;
                    }
                    f11 = Math.signum(f16) * ((float) Math.sqrt(Math.abs(f16) * 2));
                }
                f13 = f11 * 1000;
            } else {
                f13 = 0.0f;
            }
            f10 = 0.0f;
        }
        if (f13 == f10 || Float.isNaN(f13)) {
            return f10;
        }
        if (f13 <= f10) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }

    public C0385e c(int i7) {
        c[] cVarArr = new c[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            cVarArr[i10] = (c) ((Stack) this.f9343e).get(i10);
        }
        return new C0385e(cVarArr);
    }

    public void d() {
        O7.k.b("Can't end range without starting a range!", ((StringBuilder) this.f9342d) != null);
        for (int i7 = 0; i7 < this.f9341c; i7++) {
            ((StringBuilder) this.f9342d).append(")");
        }
        ((StringBuilder) this.f9342d).append(")");
        C0385e c10 = c(this.f9340b);
        ((ArrayList) this.g).add(O7.k.e(((StringBuilder) this.f9342d).toString()));
        ((ArrayList) this.f9344f).add(c10);
        this.f9342d = null;
    }

    public void e() {
        if (((StringBuilder) this.f9342d) != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f9342d = sb2;
        sb2.append("(");
        I7.l lVar = new I7.l(c(this.f9341c));
        while (lVar.hasNext()) {
            ((StringBuilder) this.f9342d).append(O7.k.f(((c) lVar.next()).f9331a));
            ((StringBuilder) this.f9342d).append(":(");
        }
        this.f9339a = false;
    }
}
