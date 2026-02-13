package androidx.compose.animation;

import A0.AbstractC0012d0;
import c0.l;
import w.G;
import w.H;
import w.I;
import w.y;
import x.b0;
import x.i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class EnterExitTransitionElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f13115a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f13116b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f13117c;

    /* renamed from: d, reason: collision with root package name */
    public final H f13118d;

    /* renamed from: e, reason: collision with root package name */
    public final I f13119e;

    /* renamed from: f, reason: collision with root package name */
    public final Rb.a f13120f;
    public final y g;

    public EnterExitTransitionElement(i0 i0Var, b0 b0Var, b0 b0Var2, H h10, I i7, Rb.a aVar, y yVar) {
        this.f13115a = i0Var;
        this.f13116b = b0Var;
        this.f13117c = b0Var2;
        this.f13118d = h10;
        this.f13119e = i7;
        this.f13120f = aVar;
        this.g = yVar;
    }

    @Override // A0.AbstractC0012d0
    public final l d() {
        return new G(this.f13115a, this.f13116b, this.f13117c, this.f13118d, this.f13119e, this.f13120f, this.g);
    }

    @Override // A0.AbstractC0012d0
    public final void e(l lVar) {
        G g = (G) lVar;
        g.f25500C = this.f13115a;
        g.f25501D = this.f13116b;
        g.f25502E = this.f13117c;
        g.f25503F = this.f13118d;
        g.f25504G = this.f13119e;
        g.f25505H = this.f13120f;
        g.f25506I = this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.f13115a.equals(enterExitTransitionElement.f13115a) && kotlin.jvm.internal.l.a(this.f13116b, enterExitTransitionElement.f13116b) && kotlin.jvm.internal.l.a(this.f13117c, enterExitTransitionElement.f13117c) && kotlin.jvm.internal.l.a(null, null) && this.f13118d.equals(enterExitTransitionElement.f13118d) && kotlin.jvm.internal.l.a(this.f13119e, enterExitTransitionElement.f13119e) && kotlin.jvm.internal.l.a(this.f13120f, enterExitTransitionElement.f13120f) && kotlin.jvm.internal.l.a(this.g, enterExitTransitionElement.g);
    }

    public final int hashCode() {
        int hashCode = this.f13115a.hashCode() * 31;
        b0 b0Var = this.f13116b;
        int hashCode2 = (hashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        b0 b0Var2 = this.f13117c;
        return this.g.hashCode() + ((this.f13120f.hashCode() + ((this.f13119e.f25513a.hashCode() + ((this.f13118d.f25510a.hashCode() + ((hashCode2 + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f13115a + ", sizeAnimation=" + this.f13116b + ", offsetAnimation=" + this.f13117c + ", slideAnimation=null, enter=" + this.f13118d + ", exit=" + this.f13119e + ", isEnabled=" + this.f13120f + ", graphicsLayerBlock=" + this.g + ')';
    }
}
