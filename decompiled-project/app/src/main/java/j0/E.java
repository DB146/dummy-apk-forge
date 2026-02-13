package j0;

import A0.C0005a;
import A0.InterfaceC0035y;
import A0.T;
import B0.C0170c0;
import y.S;
import y0.AbstractC2323H;
import y0.InterfaceC2317B;

/* loaded from: classes.dex */
public final class E extends c0.l implements InterfaceC0035y {

    /* renamed from: C, reason: collision with root package name */
    public float f18515C;

    /* renamed from: D, reason: collision with root package name */
    public float f18516D;

    /* renamed from: E, reason: collision with root package name */
    public float f18517E;

    /* renamed from: F, reason: collision with root package name */
    public float f18518F;

    /* renamed from: G, reason: collision with root package name */
    public float f18519G;

    /* renamed from: H, reason: collision with root package name */
    public long f18520H;

    /* renamed from: I, reason: collision with root package name */
    public D f18521I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f18522J;

    /* renamed from: K, reason: collision with root package name */
    public long f18523K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public C0005a f18524M;

    @Override // A0.InterfaceC0035y
    public final InterfaceC2317B e(T t5, y0.z zVar, long j) {
        AbstractC2323H b2 = zVar.b(j);
        return t5.Q(b2.f26554a, b2.f26555b, Eb.w.f3892a, new C0170c0(23, b2, this));
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f18515C);
        sb2.append(", scaleY=");
        sb2.append(this.f18516D);
        sb2.append(", alpha = ");
        sb2.append(this.f18517E);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f18518F);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb2.append(this.f18519G);
        sb2.append(", transformOrigin=");
        sb2.append((Object) G.d(this.f18520H));
        sb2.append(", shape=");
        sb2.append(this.f18521I);
        sb2.append(", clip=");
        sb2.append(this.f18522J);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        S.d(this.f18523K, ", spotShadowColor=", sb2);
        sb2.append((Object) n.i(this.L));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb2.toString();
    }
}
