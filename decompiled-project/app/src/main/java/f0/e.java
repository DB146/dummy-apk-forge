package f0;

import A0.D0;
import A0.E0;
import P4.C0463k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.r;
import x0.AbstractC2256a;
import z.C2544a0;

/* loaded from: classes.dex */
public final class e extends m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16929a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f16930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C0463k c0463k, f fVar, r rVar) {
        super(1);
        this.f16930b = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar) {
        super(1);
        this.f16930b = rVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        boolean z8;
        switch (this.f16929a) {
            case 0:
                f fVar = (f) obj;
                if (!fVar.f14112B) {
                    return D0.f17b;
                }
                if (fVar.f16932D != null) {
                    AbstractC2256a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                fVar.f16932D = null;
                r rVar = this.f16930b;
                rVar.f19130a = rVar.f19130a;
                return D0.f16a;
            default:
                E0 e02 = (E0) obj;
                r rVar2 = this.f16930b;
                if (!rVar2.f19130a) {
                    l.c(e02, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (!((C2544a0) e02).f27959C) {
                        z8 = false;
                        rVar2.f19130a = z8;
                        return Boolean.valueOf(!z8);
                    }
                }
                z8 = true;
                rVar2.f19130a = z8;
                return Boolean.valueOf(!z8);
        }
    }
}
