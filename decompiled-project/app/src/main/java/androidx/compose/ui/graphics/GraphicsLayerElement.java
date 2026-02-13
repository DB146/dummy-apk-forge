package androidx.compose.ui.graphics;

import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import A0.C0005a;
import A0.n0;
import c0.l;
import h3.o;
import j0.AbstractC1362A;
import j0.D;
import j0.E;
import j0.G;
import j0.n;
import y.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GraphicsLayerElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f13192a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13193b;

    /* renamed from: c, reason: collision with root package name */
    public final D f13194c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13195d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13196e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13197f;

    public GraphicsLayerElement(float f4, long j, D d10, boolean z8, long j10, long j11) {
        this.f13192a = f4;
        this.f13193b = j;
        this.f13194c = d10;
        this.f13195d = z8;
        this.f13196e = j10;
        this.f13197f = j11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, java.lang.Object, j0.E] */
    @Override // A0.AbstractC0012d0
    public final l d() {
        ?? lVar = new l();
        lVar.f18515C = 1.0f;
        lVar.f18516D = 1.0f;
        lVar.f18517E = 1.0f;
        lVar.f18518F = this.f13192a;
        lVar.f18519G = 8.0f;
        lVar.f18520H = this.f13193b;
        lVar.f18521I = this.f13194c;
        lVar.f18522J = this.f13195d;
        lVar.f18523K = this.f13196e;
        lVar.L = this.f13197f;
        lVar.f18524M = new C0005a(lVar, 24);
        return lVar;
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        E e2 = (E) lVar;
        e2.f18515C = 1.0f;
        e2.f18516D = 1.0f;
        e2.f18517E = 1.0f;
        e2.f18518F = this.f13192a;
        e2.f18519G = 8.0f;
        e2.f18520H = this.f13193b;
        e2.f18521I = this.f13194c;
        e2.f18522J = this.f13195d;
        e2.f18523K = this.f13196e;
        e2.L = this.f13197f;
        n0 n0Var = AbstractC0017g.r(e2, 2).f274A;
        if (n0Var != null) {
            n0Var.M0(e2.f18524M, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        graphicsLayerElement.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f13192a, graphicsLayerElement.f13192a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && G.a(this.f13193b, graphicsLayerElement.f13193b) && kotlin.jvm.internal.l.a(this.f13194c, graphicsLayerElement.f13194c) && this.f13195d == graphicsLayerElement.f13195d && kotlin.jvm.internal.l.a(null, null) && n.c(this.f13196e, graphicsLayerElement.f13196e) && n.c(this.f13197f, graphicsLayerElement.f13197f) && AbstractC1362A.i(0);
    }

    public final int hashCode() {
        int e2 = o.e(8.0f, o.e(0.0f, o.e(0.0f, o.e(0.0f, o.e(this.f13192a, o.e(0.0f, o.e(0.0f, o.e(1.0f, o.e(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i7 = G.f18527c;
        int g = o.g(this.f13195d, (this.f13194c.hashCode() + o.f(e2, 31, this.f13193b)) * 31, 961);
        int i10 = n.f18553h;
        return Integer.hashCode(0) + o.f(o.f(g, 31, this.f13196e), 31, this.f13197f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=1.0, translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f13192a);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb2.append((Object) G.d(this.f13193b));
        sb2.append(", shape=");
        sb2.append(this.f13194c);
        sb2.append(", clip=");
        sb2.append(this.f13195d);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        S.d(this.f13196e, ", spotShadowColor=", sb2);
        sb2.append((Object) n.i(this.f13197f));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb2.toString();
    }
}
