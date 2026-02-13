package p5;

import I2.C0330t;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import n5.v;
import o5.o;

/* loaded from: classes.dex */
public final class i implements o, InterfaceC1850a {

    /* renamed from: A, reason: collision with root package name */
    public byte[] f23073A;

    /* renamed from: w, reason: collision with root package name */
    public int f23082w;

    /* renamed from: x, reason: collision with root package name */
    public SurfaceTexture f23083x;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23074a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f23075b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f23076c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C0330t f23077d = new C0330t(8, false);

    /* renamed from: e, reason: collision with root package name */
    public final C6.l f23078e = new C6.l();

    /* renamed from: f, reason: collision with root package name */
    public final C6.l f23079f = new C6.l();

    /* renamed from: u, reason: collision with root package name */
    public final float[] f23080u = new float[16];

    /* renamed from: v, reason: collision with root package name */
    public final float[] f23081v = new float[16];

    /* renamed from: y, reason: collision with root package name */
    public volatile int f23084y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f23085z = -1;

    @Override // p5.InterfaceC1850a
    public final void a(long j, float[] fArr) {
        ((C6.l) this.f23077d.f5202d).a(fArr, j);
    }

    @Override // o5.o
    public final void b(long j, long j10, L l10, MediaFormat mediaFormat) {
        int i7;
        float[] fArr;
        int i10;
        ArrayList arrayList;
        int h10;
        this.f23078e.a(Long.valueOf(j), j10);
        byte[] bArr = l10.f20073J;
        int i11 = l10.f20074K;
        byte[] bArr2 = this.f23073A;
        int i12 = this.f23085z;
        this.f23073A = bArr;
        if (i11 == -1) {
            i11 = this.f23084y;
        }
        this.f23085z = i11;
        if (i12 == i11 && Arrays.equals(bArr2, this.f23073A)) {
            return;
        }
        byte[] bArr3 = this.f23073A;
        f fVar = null;
        if (bArr3 != null) {
            int i13 = this.f23085z;
            v vVar = new v(bArr3);
            try {
                vVar.H(4);
                h10 = vVar.h();
                vVar.G(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (h10 == 1886547818) {
                vVar.H(8);
                int i14 = vVar.f21230b;
                int i15 = vVar.f21231c;
                while (i14 < i15) {
                    int h11 = vVar.h() + i14;
                    if (h11 <= i14 || h11 > i15) {
                        break;
                    }
                    int h12 = vVar.h();
                    if (h12 != 2037673328 && h12 != 1836279920) {
                        vVar.G(h11);
                        i14 = h11;
                    }
                    vVar.F(h11);
                    arrayList = com.bumptech.glide.d.v(vVar);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = com.bumptech.glide.d.v(vVar);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    C1854e c1854e = (C1854e) arrayList.get(0);
                    fVar = new f(c1854e, c1854e, i13);
                } else if (size == 2) {
                    fVar = new f((C1854e) arrayList.get(0), (C1854e) arrayList.get(1), i13);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i16 = this.f23085z;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f4 = radians / 36;
            float f10 = radians2 / 72;
            float[] fArr2 = new float[15984];
            float[] fArr3 = new float[10656];
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 36; i17 < i20; i20 = 36) {
                float f11 = radians / 2.0f;
                float f12 = (i17 * f4) - f11;
                int i21 = i17 + 1;
                float f13 = (i21 * f4) - f11;
                int i22 = 0;
                while (i22 < 73) {
                    float f14 = f13;
                    int i23 = i21;
                    float f15 = f12;
                    int i24 = i18;
                    int i25 = i19;
                    int i26 = 2;
                    int i27 = 0;
                    while (i27 < i26) {
                        float f16 = i22 * f10;
                        float f17 = f10;
                        int i28 = i22;
                        double d10 = 50.0f;
                        int i29 = i16;
                        double d11 = (3.1415927f + f16) - (radians2 / 2.0f);
                        float f18 = radians;
                        double d12 = i27 == 0 ? f15 : f14;
                        int i30 = i27;
                        float f19 = f4;
                        fArr2[i24] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                        float[] fArr4 = fArr3;
                        int i31 = i17;
                        fArr2[i24 + 1] = (float) (Math.sin(d12) * d10);
                        int i32 = i24 + 3;
                        fArr2[i24 + 2] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                        fArr4[i25] = f16 / radians2;
                        int i33 = i25 + 2;
                        fArr4[i25 + 1] = ((i31 + i30) * f19) / f18;
                        if (i28 == 0 && i30 == 0) {
                            i10 = i30;
                            i7 = i28;
                        } else {
                            i7 = i28;
                            if (i7 == 72) {
                                i10 = i30;
                                if (i10 != 1) {
                                    fArr = fArr4;
                                }
                            } else {
                                fArr = fArr4;
                                i10 = i30;
                            }
                            i26 = 2;
                            i25 = i33;
                            i24 = i32;
                            int i34 = i10 + 1;
                            i22 = i7;
                            fArr3 = fArr;
                            f10 = f17;
                            i16 = i29;
                            radians = f18;
                            i17 = i31;
                            f4 = f19;
                            i27 = i34;
                        }
                        System.arraycopy(fArr2, i24, fArr2, i32, 3);
                        i24 += 6;
                        fArr = fArr4;
                        i26 = 2;
                        System.arraycopy(fArr, i25, fArr, i33, 2);
                        i25 += 4;
                        int i342 = i10 + 1;
                        i22 = i7;
                        fArr3 = fArr;
                        f10 = f17;
                        i16 = i29;
                        radians = f18;
                        i17 = i31;
                        f4 = f19;
                        i27 = i342;
                    }
                    i22++;
                    i18 = i24;
                    i19 = i25;
                    f13 = f14;
                    i21 = i23;
                    f12 = f15;
                    i16 = i16;
                }
                i17 = i21;
            }
            C1854e c1854e2 = new C1854e(new C6.l(0, 1, fArr2, fArr3));
            fVar = new f(c1854e2, c1854e2, i16);
        }
        this.f23079f.a(fVar, j10);
    }

    public final SurfaceTexture c() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC1705a.i();
            this.f23076c.a();
            AbstractC1705a.i();
            AbstractC1705a.j("No current context", !D.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC1705a.i();
            int i7 = iArr[0];
            AbstractC1705a.d(36197, i7);
            this.f23082w = i7;
        } catch (n5.g e2) {
            AbstractC1705a.u("SceneRenderer", "Failed to initialize the renderer", e2);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f23082w);
        this.f23083x = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: p5.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f23074a.set(true);
            }
        });
        return this.f23083x;
    }

    @Override // p5.InterfaceC1850a
    public final void d() {
        this.f23078e.b();
        C0330t c0330t = this.f23077d;
        ((C6.l) c0330t.f5202d).b();
        c0330t.f5199a = false;
        this.f23075b.set(true);
    }
}
