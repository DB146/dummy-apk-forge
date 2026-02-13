package a3;

import C.C0218c;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: a, reason: collision with root package name */
    public long f12559a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12560b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12561c;

    /* renamed from: d, reason: collision with root package name */
    public R1.e f12562d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.s f12563e;

    /* renamed from: f, reason: collision with root package name */
    public Aa.j f12564f;
    public final /* synthetic */ C0709A g;

    /* JADX WARN: Type inference failed for: r5v1, types: [A4.s, java.lang.Object] */
    public r(C0709A c0709a) {
        this.g = c0709a;
        ?? obj = new Object();
        long[] jArr = new long[20];
        obj.f471b = jArr;
        obj.f472c = new float[20];
        obj.f470a = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f12563e = obj;
    }

    @Override // a3.v, a3.s
    public final void f(u uVar) {
        this.f12561c = true;
    }

    public final void g() {
        float sqrt;
        int i7;
        if (this.f12562d != null) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f4 = (float) this.f12559a;
        A4.s sVar = this.f12563e;
        int i10 = (sVar.f470a + 1) % 20;
        sVar.f470a = i10;
        ((long[]) sVar.f471b)[i10] = currentAnimationTimeMillis;
        ((float[]) sVar.f472c)[i10] = f4;
        C0218c c0218c = new C0218c(4);
        float f10 = 0.0f;
        c0218c.f2397b = 0.0f;
        this.f12562d = new R1.e(c0218c);
        R1.f fVar = new R1.f();
        fVar.f8827b = 1.0f;
        int i11 = 0;
        fVar.f8828c = false;
        fVar.f8826a = Math.sqrt(200.0f);
        fVar.f8828c = false;
        R1.e eVar = this.f12562d;
        eVar.f8824l = fVar;
        eVar.f8817b = (float) this.f12559a;
        eVar.f8818c = true;
        if (eVar.f8820e) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = eVar.k;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        R1.e eVar2 = this.f12562d;
        int i12 = sVar.f470a;
        long[] jArr = (long[]) sVar.f471b;
        long j = Long.MIN_VALUE;
        if (i12 != 0 || jArr[i12] != Long.MIN_VALUE) {
            long j10 = jArr[i12];
            long j11 = j10;
            while (true) {
                long j12 = jArr[i12];
                if (j12 != j) {
                    float f11 = (float) (j10 - j12);
                    float abs = (float) Math.abs(j12 - j11);
                    if (f11 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    if (i12 == 0) {
                        i12 = 20;
                    }
                    i12--;
                    i11++;
                    if (i11 >= 20) {
                        break;
                    }
                    j11 = j12;
                    j = Long.MIN_VALUE;
                } else {
                    break;
                }
            }
            if (i11 >= 2) {
                float[] fArr = (float[]) sVar.f472c;
                if (i11 == 2) {
                    int i13 = sVar.f470a;
                    int i14 = i13 == 0 ? 19 : i13 - 1;
                    float f12 = (float) (jArr[i13] - jArr[i14]);
                    if (f12 != 0.0f) {
                        sqrt = (fArr[i13] - fArr[i14]) / f12;
                    }
                } else {
                    int i15 = sVar.f470a;
                    int i16 = ((i15 - i11) + 21) % 20;
                    int i17 = (i15 + 21) % 20;
                    long j13 = jArr[i16];
                    float f13 = fArr[i16];
                    int i18 = i16 + 1;
                    int i19 = i18 % 20;
                    float f14 = 0.0f;
                    while (i19 != i17) {
                        long j14 = jArr[i19];
                        long[] jArr2 = jArr;
                        float f15 = (float) (j14 - j13);
                        if (f15 == f10) {
                            i7 = i17;
                        } else {
                            float f16 = fArr[i19];
                            i7 = i17;
                            float f17 = (f16 - f13) / f15;
                            float abs2 = (Math.abs(f17) * (f17 - ((float) (Math.sqrt(2.0f * Math.abs(f14)) * Math.signum(f14))))) + f14;
                            if (i19 == i18) {
                                abs2 *= 0.5f;
                            }
                            f14 = abs2;
                            f13 = f16;
                            j13 = j14;
                        }
                        i19 = (i19 + 1) % 20;
                        jArr = jArr2;
                        i17 = i7;
                        f10 = 0.0f;
                    }
                    sqrt = (float) (Math.sqrt(Math.abs(f14) * 2.0f) * Math.signum(f14));
                }
                f10 = sqrt * 1000.0f;
            }
        }
        eVar2.f8816a = f10;
        R1.e eVar3 = this.f12562d;
        eVar3.f8821f = (float) (this.g.L + 1);
        eVar3.g = -1.0f;
        eVar3.f8823i = 4.0f;
        q qVar = new q(this);
        ArrayList arrayList2 = eVar3.j;
        if (arrayList2.contains(qVar)) {
            return;
        }
        arrayList2.add(qVar);
    }
}
