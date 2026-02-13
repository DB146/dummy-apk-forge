package androidx.compose.foundation;

import A.i;
import C.S;
import E.A;
import android.view.KeyEvent;
import c0.h;
import c0.j;
import c0.m;
import c2.q;
import com.bumptech.glide.d;
import j0.D;
import s0.AbstractC1969a;
import y.AbstractC2311t;
import y.C2285G;
import y.C2305m;
import y.InterfaceC2286H;
import y.InterfaceC2291M;
import z.C2565l;
import z.V;

/* loaded from: classes.dex */
public abstract class a {
    public static final m a(m mVar, long j, D d10) {
        return mVar.c(new BackgroundElement(j, d10));
    }

    public static final m b(m mVar, i iVar, InterfaceC2286H interfaceC2286H, Rb.a aVar) {
        return mVar.c(interfaceC2286H instanceof InterfaceC2291M ? new ClickableElement(iVar, (InterfaceC2291M) interfaceC2286H, aVar) : interfaceC2286H == null ? new ClickableElement(iVar, null, aVar) : iVar != null ? c.a(iVar, interfaceC2286H).c(new ClickableElement(iVar, null, aVar)) : new h(new b(interfaceC2286H, aVar)));
    }

    public static m c(m mVar, Rb.a aVar) {
        return mVar.c(new h(new S(aVar, 3)));
    }

    public static final boolean d(KeyEvent keyEvent) {
        long a9 = q.a(keyEvent.getKeyCode());
        if (AbstractC1969a.a(a9, AbstractC1969a.f24014f) ? true : AbstractC1969a.a(a9, AbstractC1969a.f24016i) ? true : AbstractC1969a.a(a9, AbstractC1969a.f24018m)) {
            return true;
        }
        return AbstractC1969a.a(a9, AbstractC1969a.f24015h);
    }

    public static m e(m mVar, A a9, V v10, boolean z8, C2565l c2565l, i iVar, C2305m c2305m) {
        float f4 = AbstractC2311t.f26526a;
        V v11 = V.f27943a;
        j jVar = j.f14110a;
        return mVar.c(v10 == v11 ? d.c(jVar, C2285G.f26409d) : d.c(jVar, C2285G.f26407b)).c(new ScrollingContainerElement(iVar, a9, c2305m, c2565l, v10, z8));
    }
}
