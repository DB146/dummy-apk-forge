package N;

import A0.C0020i;
import A0.C0021j;
import A0.InterfaceC0022k;
import B0.AbstractC0207v0;
import C.AbstractC0230o;
import Q.C0480b;
import Q.C0506o;
import Q.InterfaceC0493h0;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import u0.AbstractC2090t;
import u0.C2075e;
import u0.C2089s;
import y0.InterfaceC2316A;

/* loaded from: classes.dex */
public final class D extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0.m f6952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0.D f6953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6954c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f6955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f6956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y.e f6957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(c0.m mVar, j0.D d10, long j, float f4, float f10, Y.e eVar) {
        super(2);
        this.f6952a = mVar;
        this.f6953b = d10;
        this.f6954c = j;
        this.f6955d = f4;
        this.f6956e = f10;
        this.f6957f = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Type inference failed for: r4v11, types: [Jb.i, N.C] */
    @Override // Rb.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long max;
        C0506o c0506o = (C0506o) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        Db.q qVar = Db.q.f3365a;
        if (intValue == 2 && c0506o.x()) {
            c0506o.N();
        } else {
            C0411a c0411a = (C0411a) c0506o.k(AbstractC0413c.f7031a);
            boolean booleanValue = ((Boolean) c0506o.k(AbstractC0413c.f7032b)).booleanValue();
            long j = c0411a.f7009p;
            long j10 = this.f6954c;
            if (j0.n.c(j10, j) && booleanValue) {
                boolean a9 = V0.f.a(this.f6955d, 0);
                j10 = c0411a.f7009p;
                if (!a9) {
                    long a10 = j0.n.a(j0.n.b(c0411a.f7013t, ((((float) Math.log(r8 + 1)) * 4.5f) + 2.0f) / 100.0f), j0.n.f(j10));
                    float d10 = j0.n.d(j10);
                    float d11 = j0.n.d(a10);
                    float f4 = 1.0f - d11;
                    float f10 = (d10 * f4) + d11;
                    float h10 = f10 == 0.0f ? 0.0f : (((j0.n.h(j10) * d10) * f4) + (j0.n.h(a10) * d11)) / f10;
                    float g = f10 == 0.0f ? 0.0f : (((j0.n.g(j10) * d10) * f4) + (j0.n.g(a10) * d11)) / f10;
                    float e2 = f10 == 0.0f ? 0.0f : (((j0.n.e(j10) * d10) * f4) + (j0.n.e(a10) * d11)) / f10;
                    if (j0.n.f(j10).c()) {
                        max = (((int) ((e2 * 255.0f) + 0.5f)) | (((((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((h10 * 255.0f) + 0.5f)) << 16)) | (((int) ((g * 255.0f) + 0.5f)) << 8))) << 32;
                    } else {
                        int floatToRawIntBits = Float.floatToRawIntBits(h10);
                        int i20 = floatToRawIntBits >>> 31;
                        int i21 = (floatToRawIntBits >>> 23) & 255;
                        int i22 = floatToRawIntBits & 8388607;
                        if (i21 == 255) {
                            i10 = i22 != 0 ? 512 : 0;
                            i7 = 31;
                        } else {
                            i7 = i21 - 112;
                            if (i7 >= 31) {
                                i7 = 49;
                                i10 = 0;
                            } else if (i7 <= 0) {
                                if (i7 >= -10) {
                                    int i23 = (i22 | 8388608) >> (1 - i7);
                                    if ((i23 & 4096) != 0) {
                                        i23 += 8192;
                                    }
                                    i10 = i23 >> 13;
                                } else {
                                    i10 = 0;
                                }
                                i7 = 0;
                            } else {
                                int i24 = i22 >> 13;
                                if ((floatToRawIntBits & 4096) != 0) {
                                    i11 = (((i7 << 10) | i24) + 1) | (i20 << 15);
                                    short s3 = (short) i11;
                                    int floatToRawIntBits2 = Float.floatToRawIntBits(g);
                                    int i25 = floatToRawIntBits2 >>> 31;
                                    i12 = (floatToRawIntBits2 >>> 23) & 255;
                                    int i26 = floatToRawIntBits2 & 8388607;
                                    if (i12 != 255) {
                                        i14 = i26 != 0 ? 512 : 0;
                                        i13 = 31;
                                    } else {
                                        i13 = i12 - 112;
                                        if (i13 >= 31) {
                                            i13 = 49;
                                        } else if (i13 > 0) {
                                            i14 = i26 >> 13;
                                            if ((floatToRawIntBits2 & 4096) != 0) {
                                                i15 = (((i13 << 10) | i14) + 1) | (i25 << 15);
                                                short s10 = (short) i15;
                                                int floatToRawIntBits3 = Float.floatToRawIntBits(e2);
                                                int i27 = floatToRawIntBits3 >>> 31;
                                                i16 = (floatToRawIntBits3 >>> 23) & 255;
                                                int i28 = floatToRawIntBits3 & 8388607;
                                                if (i16 == 255) {
                                                    i17 = 31;
                                                    i18 = i28 == 0 ? 0 : 512;
                                                } else {
                                                    i17 = i16 - 112;
                                                    if (i17 >= 31) {
                                                        i17 = 49;
                                                        i18 = 0;
                                                    } else if (i17 <= 0) {
                                                        if (i17 >= -10) {
                                                            int i29 = (i28 | 8388608) >> (1 - i17);
                                                            if ((i29 & 4096) != 0) {
                                                                i29 += 8192;
                                                            }
                                                            i18 = i29 >> 13;
                                                        } else {
                                                            i18 = 0;
                                                        }
                                                        i17 = 0;
                                                    } else {
                                                        i18 = i28 >> 13;
                                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                                            i19 = ((i18 | (i17 << 10)) + 1) | (i27 << 15);
                                                            max = ((s3 & 65535) << 48) | ((s10 & 65535) << 32) | ((((short) i19) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f10, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r4.f18691c & 63);
                                                        }
                                                    }
                                                }
                                                i19 = i18 | (i27 << 15) | (i17 << 10);
                                                max = ((s3 & 65535) << 48) | ((s10 & 65535) << 32) | ((((short) i19) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f10, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r4.f18691c & 63);
                                            }
                                        } else if (i13 >= -10) {
                                            int i30 = (i26 | 8388608) >> (1 - i13);
                                            if ((i30 & 4096) != 0) {
                                                i30 += 8192;
                                            }
                                            i14 = i30 >> 13;
                                            i13 = 0;
                                        } else {
                                            i13 = 0;
                                        }
                                        i14 = 0;
                                    }
                                    i15 = (i13 << 10) | (i25 << 15) | i14;
                                    short s102 = (short) i15;
                                    int floatToRawIntBits32 = Float.floatToRawIntBits(e2);
                                    int i272 = floatToRawIntBits32 >>> 31;
                                    i16 = (floatToRawIntBits32 >>> 23) & 255;
                                    int i282 = floatToRawIntBits32 & 8388607;
                                    if (i16 == 255) {
                                    }
                                    i19 = i18 | (i272 << 15) | (i17 << 10);
                                    max = ((s3 & 65535) << 48) | ((s102 & 65535) << 32) | ((((short) i19) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f10, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r4.f18691c & 63);
                                } else {
                                    i10 = i24;
                                }
                            }
                        }
                        i11 = i10 | (i20 << 15) | (i7 << 10);
                        short s32 = (short) i11;
                        int floatToRawIntBits22 = Float.floatToRawIntBits(g);
                        int i252 = floatToRawIntBits22 >>> 31;
                        i12 = (floatToRawIntBits22 >>> 23) & 255;
                        int i262 = floatToRawIntBits22 & 8388607;
                        if (i12 != 255) {
                        }
                        i15 = (i13 << 10) | (i252 << 15) | i14;
                        short s1022 = (short) i15;
                        int floatToRawIntBits322 = Float.floatToRawIntBits(e2);
                        int i2722 = floatToRawIntBits322 >>> 31;
                        i16 = (floatToRawIntBits322 >>> 23) & 255;
                        int i2822 = floatToRawIntBits322 & 8388607;
                        if (i16 == 255) {
                        }
                        i19 = i18 | (i2722 << 15) | (i17 << 10);
                        max = ((s32 & 65535) << 48) | ((s1022 & 65535) << 32) | ((((short) i19) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f10, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r4.f18691c & 63);
                    }
                    j10 = max;
                }
            }
            float p10 = ((V0.c) c0506o.k(AbstractC0207v0.f1993h)).p(this.f6956e);
            c0.j jVar = c0.j.f14110a;
            j0.D d12 = this.f6953b;
            c0.m c10 = com.bumptech.glide.d.c(androidx.compose.foundation.a.a(this.f6952a.c(p10 > 0.0f ? androidx.compose.ui.graphics.a.b(jVar, p10, d12, false, 124895) : jVar).c(jVar), j10, d12), d12);
            B b2 = B.f6950b;
            AtomicInteger atomicInteger = H0.j.f4498a;
            c0.m c11 = c10.c(new AppendedSemanticsElement(b2, false));
            ?? iVar = new Jb.i(2, null);
            C2075e c2075e = AbstractC2090t.f24799a;
            c0.m c12 = c11.c(new SuspendPointerInputElement(qVar, null, new C2089s(iVar), 6));
            InterfaceC2316A d13 = AbstractC0230o.d(true);
            int i31 = c0506o.f8449P;
            InterfaceC0493h0 m10 = c0506o.m();
            c0.m c13 = c0.o.c(c0506o, c12);
            InterfaceC0022k.g.getClass();
            A0.C c14 = C0021j.f241b;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(c14);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, C0021j.f244e, d13);
            C0480b.s(c0506o, C0021j.f243d, m10);
            C0020i c0020i = C0021j.f245f;
            if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i31))) {
                c0506o.d0(Integer.valueOf(i31));
                c0506o.c(Integer.valueOf(i31), c0020i);
            }
            C0480b.s(c0506o, C0021j.f242c, c13);
            this.f6957f.invoke(c0506o, 0);
            c0506o.p(true);
        }
        return qVar;
    }
}
