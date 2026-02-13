package p5;

import java.nio.ByteBuffer;
import m4.AbstractC1565e;
import m4.L;
import n5.D;
import n5.v;

/* renamed from: p5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1851b extends AbstractC1565e {

    /* renamed from: C, reason: collision with root package name */
    public final q4.g f23048C;

    /* renamed from: D, reason: collision with root package name */
    public final v f23049D;

    /* renamed from: E, reason: collision with root package name */
    public long f23050E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC1850a f23051F;

    /* renamed from: G, reason: collision with root package name */
    public long f23052G;

    public C1851b() {
        super(6);
        this.f23048C = new q4.g(1);
        this.f23049D = new v();
    }

    @Override // m4.AbstractC1565e
    public final int A(L l10) {
        return "application/x-camera-motion".equals(l10.f20096z) ? AbstractC1565e.e(4, 0, 0) : AbstractC1565e.e(0, 0, 0);
    }

    @Override // m4.AbstractC1565e, m4.y0
    public final void c(int i7, Object obj) {
        if (i7 == 8) {
            this.f23051F = (InterfaceC1850a) obj;
        }
    }

    @Override // m4.AbstractC1565e
    public final String j() {
        return "CameraMotionRenderer";
    }

    @Override // m4.AbstractC1565e
    public final boolean l() {
        return k();
    }

    @Override // m4.AbstractC1565e
    public final boolean m() {
        return true;
    }

    @Override // m4.AbstractC1565e
    public final void n() {
        InterfaceC1850a interfaceC1850a = this.f23051F;
        if (interfaceC1850a != null) {
            interfaceC1850a.d();
        }
    }

    @Override // m4.AbstractC1565e
    public final void p(long j, boolean z8) {
        this.f23052G = Long.MIN_VALUE;
        InterfaceC1850a interfaceC1850a = this.f23051F;
        if (interfaceC1850a != null) {
            interfaceC1850a.d();
        }
    }

    @Override // m4.AbstractC1565e
    public final void u(L[] lArr, long j, long j10) {
        this.f23050E = j10;
    }

    @Override // m4.AbstractC1565e
    public final void w(long j, long j10) {
        float[] fArr;
        while (!k() && this.f23052G < 100000 + j) {
            q4.g gVar = this.f23048C;
            gVar.G();
            ha.g gVar2 = this.f20354c;
            gVar2.clear();
            if (v(gVar2, gVar, 0) != -4 || gVar.i(4)) {
                return;
            }
            this.f23052G = gVar.f23460f;
            if (this.f23051F != null && !gVar.i(Integer.MIN_VALUE)) {
                gVar.J();
                ByteBuffer byteBuffer = gVar.f23458d;
                int i7 = D.f21141a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    v vVar = this.f23049D;
                    vVar.E(limit, array);
                    vVar.G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(vVar.j());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f23051F.a(this.f23052G - this.f23050E, fArr);
                }
            }
        }
    }
}
