package androidx.compose.ui.graphics;

import Rb.c;
import c0.m;
import j0.AbstractC1362A;
import j0.D;
import j0.G;
import j0.t;

/* loaded from: classes.dex */
public abstract class a {
    public static final m a(c cVar) {
        return new BlockGraphicsLayerElement(cVar);
    }

    public static m b(m mVar, float f4, D d10, boolean z8, int i7) {
        if ((i7 & 32) != 0) {
            f4 = 0.0f;
        }
        float f10 = f4;
        long j = G.f18526b;
        if ((i7 & 2048) != 0) {
            d10 = AbstractC1362A.f18492a;
        }
        D d11 = d10;
        if ((i7 & 4096) != 0) {
            z8 = false;
        }
        long j10 = t.f18558a;
        return mVar.c(new GraphicsLayerElement(f10, j, d11, z8, j10, j10));
    }
}
