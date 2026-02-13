package androidx.compose.foundation.lazy.layout;

import E.C0249d;
import E.e;
import F.C0267k;
import Yb.g;
import c0.m;
import z.V;

/* loaded from: classes.dex */
public abstract class a {
    public static final m a(e eVar, C0267k c0267k, V v10) {
        return new LazyLayoutBeyondBoundsModifierElement(eVar, c0267k, v10);
    }

    public static final m b(m mVar, g gVar, C0249d c0249d, V v10, boolean z8) {
        return mVar.c(new LazyLayoutSemanticsModifier(gVar, c0249d, v10, z8));
    }
}
