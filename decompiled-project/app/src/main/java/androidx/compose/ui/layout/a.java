package androidx.compose.ui.layout;

import Rb.f;
import Y0.c;
import c0.m;

/* loaded from: classes.dex */
public abstract class a {
    public static final m a(f fVar) {
        return new LayoutElement(fVar);
    }

    public static final m b(m mVar, c cVar) {
        return mVar.c(new OnGloballyPositionedElement(cVar));
    }
}
