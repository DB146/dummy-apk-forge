package androidx.compose.foundation;

import A.i;
import A0.AbstractC0012d0;
import A0.AbstractC0017g;
import A0.InterfaceC0024m;
import c0.l;
import h3.o;
import y.C2281C;
import y.InterfaceC2291M;
import y.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ClickableElement extends AbstractC0012d0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f13128a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2291M f13129b;

    /* renamed from: c, reason: collision with root package name */
    public final Rb.a f13130c;

    public ClickableElement(i iVar, InterfaceC2291M interfaceC2291M, Rb.a aVar) {
        this.f13128a = iVar;
        this.f13129b = interfaceC2291M;
        this.f13130c = aVar;
    }

    @Override // A0.AbstractC0012d0
    public final l d() {
        return new r(this.f13128a, this.f13129b, this.f13130c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r9.f26517K == null) goto L35;
     */
    @Override // A0.AbstractC0012d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(l lVar) {
        boolean z8;
        InterfaceC0024m interfaceC0024m;
        r rVar = (r) lVar;
        i iVar = rVar.f26521P;
        i iVar2 = this.f13128a;
        boolean z10 = false;
        boolean z11 = true;
        if (kotlin.jvm.internal.l.a(iVar, iVar2)) {
            z8 = false;
        } else {
            rVar.s0();
            rVar.f26521P = iVar2;
            rVar.f26511E = iVar2;
            z8 = true;
        }
        InterfaceC2291M interfaceC2291M = rVar.f26512F;
        InterfaceC2291M interfaceC2291M2 = this.f13129b;
        if (!kotlin.jvm.internal.l.a(interfaceC2291M, interfaceC2291M2)) {
            rVar.f26512F = interfaceC2291M2;
            z8 = true;
        }
        boolean z12 = rVar.f26513G;
        C2281C c2281c = rVar.f26515I;
        if (!z12) {
            rVar.p0(c2281c);
            AbstractC0017g.m(rVar);
            rVar.f26513G = true;
        }
        if (!kotlin.jvm.internal.l.a(null, null)) {
            AbstractC0017g.m(rVar);
        }
        if (!kotlin.jvm.internal.l.a(null, null)) {
            AbstractC0017g.m(rVar);
        }
        rVar.f26514H = this.f13130c;
        boolean z13 = rVar.f26522Q;
        i iVar3 = rVar.f26521P;
        if (z13 != (iVar3 == null && rVar.f26512F != null)) {
            if (iVar3 == null && rVar.f26512F != null) {
                z10 = true;
            }
            rVar.f26522Q = z10;
            if (!z10) {
            }
        }
        z11 = z8;
        if (z11 && ((interfaceC0024m = rVar.f26517K) != null || !rVar.f26522Q)) {
            if (interfaceC0024m != null) {
                rVar.q0(interfaceC0024m);
            }
            rVar.f26517K = null;
            rVar.t0();
        }
        c2281c.u0(rVar.f26511E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return kotlin.jvm.internal.l.a(this.f13128a, clickableElement.f13128a) && kotlin.jvm.internal.l.a(this.f13129b, clickableElement.f13129b) && kotlin.jvm.internal.l.a(null, null) && kotlin.jvm.internal.l.a(null, null) && this.f13130c == clickableElement.f13130c;
    }

    public final int hashCode() {
        i iVar = this.f13128a;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        InterfaceC2291M interfaceC2291M = this.f13129b;
        return this.f13130c.hashCode() + o.g(true, (hashCode + (interfaceC2291M != null ? interfaceC2291M.hashCode() : 0)) * 31, 29791);
    }
}
