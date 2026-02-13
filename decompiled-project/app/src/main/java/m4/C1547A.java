package m4;

import android.media.MediaFormat;
import p5.InterfaceC1850a;

/* renamed from: m4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547A implements o5.o, InterfaceC1850a, y0 {

    /* renamed from: a, reason: collision with root package name */
    public o5.o f19800a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1850a f19801b;

    /* renamed from: c, reason: collision with root package name */
    public o5.o f19802c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1850a f19803d;

    @Override // p5.InterfaceC1850a
    public final void a(long j, float[] fArr) {
        InterfaceC1850a interfaceC1850a = this.f19803d;
        if (interfaceC1850a != null) {
            interfaceC1850a.a(j, fArr);
        }
        InterfaceC1850a interfaceC1850a2 = this.f19801b;
        if (interfaceC1850a2 != null) {
            interfaceC1850a2.a(j, fArr);
        }
    }

    @Override // o5.o
    public final void b(long j, long j10, L l10, MediaFormat mediaFormat) {
        o5.o oVar = this.f19802c;
        if (oVar != null) {
            oVar.b(j, j10, l10, mediaFormat);
        }
        o5.o oVar2 = this.f19800a;
        if (oVar2 != null) {
            oVar2.b(j, j10, l10, mediaFormat);
        }
    }

    @Override // m4.y0
    public final void c(int i7, Object obj) {
        if (i7 == 7) {
            this.f19800a = (o5.o) obj;
            return;
        }
        if (i7 == 8) {
            this.f19801b = (InterfaceC1850a) obj;
            return;
        }
        if (i7 != 10000) {
            return;
        }
        p5.l lVar = (p5.l) obj;
        if (lVar == null) {
            this.f19802c = null;
            this.f19803d = null;
        } else {
            this.f19802c = lVar.getVideoFrameMetadataListener();
            this.f19803d = lVar.getCameraMotionListener();
        }
    }

    @Override // p5.InterfaceC1850a
    public final void d() {
        InterfaceC1850a interfaceC1850a = this.f19803d;
        if (interfaceC1850a != null) {
            interfaceC1850a.d();
        }
        InterfaceC1850a interfaceC1850a2 = this.f19801b;
        if (interfaceC1850a2 != null) {
            interfaceC1850a2.d();
        }
    }
}
