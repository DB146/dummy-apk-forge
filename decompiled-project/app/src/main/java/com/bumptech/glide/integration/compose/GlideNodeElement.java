package com.bumptech.glide.integration.compose;

import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import A0.K;
import B0.D;
import W3.o;
import Y6.b;
import c0.e;
import com.bumptech.glide.k;
import j0.i;
import kotlin.jvm.internal.l;
import o0.AbstractC1775c;
import u.C2042E;
import y0.InterfaceC2342j;
import y3.C2378a;
import y3.p;
import z3.C2586a;
import z3.f;

/* loaded from: classes.dex */
public final class GlideNodeElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f14646a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2342j f14647b;

    /* renamed from: c, reason: collision with root package name */
    public final e f14648c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f14649d;

    /* renamed from: e, reason: collision with root package name */
    public final i f14650e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f14651f;
    public final C2378a g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC1775c f14652h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1775c f14653i;

    public GlideNodeElement(k requestBuilder, InterfaceC2342j interfaceC2342j, e eVar, Float f4, i iVar, vc.i iVar2, Boolean bool, C2378a c2378a, AbstractC1775c abstractC1775c, AbstractC1775c abstractC1775c2) {
        l.e(requestBuilder, "requestBuilder");
        this.f14646a = requestBuilder;
        this.f14647b = interfaceC2342j;
        this.f14648c = eVar;
        this.f14649d = f4;
        this.f14650e = iVar;
        this.f14651f = bool;
        this.g = c2378a;
        this.f14652h = abstractC1775c;
        this.f14653i = abstractC1775c2;
    }

    @Override // A0.AbstractC0012d0
    public final c0.l d() {
        p pVar = new p();
        e(pVar);
        return pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlideNodeElement)) {
            return false;
        }
        GlideNodeElement glideNodeElement = (GlideNodeElement) obj;
        return l.a(this.f14646a, glideNodeElement.f14646a) && l.a(this.f14647b, glideNodeElement.f14647b) && l.a(this.f14648c, glideNodeElement.f14648c) && l.a(this.f14649d, glideNodeElement.f14649d) && l.a(this.f14650e, glideNodeElement.f14650e) && l.a(null, null) && l.a(this.f14651f, glideNodeElement.f14651f) && l.a(this.g, glideNodeElement.g) && l.a(this.f14652h, glideNodeElement.f14652h) && l.a(this.f14653i, glideNodeElement.f14653i);
    }

    @Override // A0.AbstractC0012d0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void e(p node) {
        l.e(node, "node");
        InterfaceC2342j interfaceC2342j = this.f14647b;
        e eVar = this.f14648c;
        k requestBuilder = this.f14646a;
        l.e(requestBuilder, "requestBuilder");
        k kVar = node.f26824C;
        AbstractC1775c abstractC1775c = this.f14652h;
        AbstractC1775c abstractC1775c2 = this.f14653i;
        boolean z8 = (kVar != null && requestBuilder.equals(kVar) && l.a(abstractC1775c, node.f26833M) && l.a(abstractC1775c2, node.f26834N)) ? false : true;
        node.f26824C = requestBuilder;
        node.f26825D = interfaceC2342j;
        node.f26826E = eVar;
        Float f4 = this.f14649d;
        node.f26828G = f4 != null ? f4.floatValue() : 1.0f;
        node.f26829H = this.f14650e;
        Boolean bool = this.f14651f;
        node.f26831J = bool != null ? bool.booleanValue() : true;
        C2378a c2378a = this.g;
        if (c2378a == null) {
            c2378a = C2378a.f26793a;
        }
        node.f26830I = c2378a;
        node.f26833M = abstractC1775c;
        node.f26834N = abstractC1775c2;
        z3.i iVar = (o.i(requestBuilder.f9007x) && o.i(requestBuilder.f9006w)) ? new z3.i(requestBuilder.f9007x, requestBuilder.f9006w) : null;
        b fVar = iVar != null ? new f(iVar) : null;
        if (fVar == null) {
            z3.i iVar2 = node.f26840T;
            fVar = iVar2 != null ? new f(iVar2) : null;
            if (fVar == null) {
                fVar = new C2586a();
            }
        }
        node.f26827F = fVar;
        if (!z8) {
            AbstractC0017g.k(node);
            return;
        }
        node.p0();
        node.t0(null);
        if (node.f14112B) {
            K k = new K(18, node, requestBuilder);
            C2042E c2042e = ((D) AbstractC0017g.u(node)).f1591H0;
            if (c2042e.f(k) >= 0) {
                return;
            }
            c2042e.a(k);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f14648c.hashCode() + ((this.f14647b.hashCode() + (this.f14646a.hashCode() * 31)) * 31)) * 31;
        Float f4 = this.f14649d;
        int hashCode2 = (hashCode + (f4 == null ? 0 : f4.hashCode())) * 31;
        i iVar = this.f14650e;
        int hashCode3 = (((hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31) + 0) * 31;
        Boolean bool = this.f14651f;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C2378a c2378a = this.g;
        int hashCode5 = (hashCode4 + (c2378a == null ? 0 : c2378a.hashCode())) * 31;
        AbstractC1775c abstractC1775c = this.f14652h;
        int hashCode6 = (hashCode5 + (abstractC1775c == null ? 0 : abstractC1775c.hashCode())) * 31;
        AbstractC1775c abstractC1775c2 = this.f14653i;
        return hashCode6 + (abstractC1775c2 != null ? abstractC1775c2.hashCode() : 0);
    }

    public final String toString() {
        return "GlideNodeElement(requestBuilder=" + this.f14646a + ", contentScale=" + this.f14647b + ", alignment=" + this.f14648c + ", alpha=" + this.f14649d + ", colorFilter=" + this.f14650e + ", requestListener=" + ((Object) null) + ", draw=" + this.f14651f + ", transitionFactory=" + this.g + ", loadingPlaceholder=" + this.f14652h + ", errorPlaceholder=" + this.f14653i + ')';
    }
}
