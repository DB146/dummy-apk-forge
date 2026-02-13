package Ca;

import A9.AbstractC0132r2;
import A9.C0096i1;
import A9.C0109l2;
import A9.C0152w2;
import A9.O1;
import A9.t3;
import W1.C;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.core.tv.model.TVChannel;
import java.util.Timer;
import y9.AbstractC2467j;
import za.C2606e;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements O1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f3096b;

    public /* synthetic */ c(int i7, C c10) {
        this.f3095a = i7;
        this.f3096b = c10;
    }

    @Override // A9.InterfaceC0153x
    public final void a(C0109l2 c0109l2, Object obj, C0152w2 c0152w2, Object obj2) {
        VerticalGridView verticalGridView;
        C c10 = this.f3096b;
        AbstractC0132r2 abstractC0132r2 = (AbstractC0132r2) obj2;
        switch (this.f3095a) {
            case 0:
                if (obj instanceof TVChannel) {
                    i iVar = (i) c10;
                    iVar.f3109W0 = ((TVChannel) obj).getLogoChannel();
                    Timer timer = iVar.f3110X0;
                    if (timer != null) {
                        timer.cancel();
                    }
                    Timer timer2 = new Timer();
                    iVar.f3110X0 = timer2;
                    timer2.schedule(new d(iVar), 300L);
                    return;
                }
                return;
            case 1:
                AbstractC2467j abstractC2467j = (AbstractC2467j) c10;
                t3 t3Var = abstractC2467j.f27508o0;
                int selectedPosition = (t3Var == null || (verticalGridView = t3Var.f1376c) == null) ? -1 : verticalGridView.getSelectedPosition();
                String message = "Selected position: " + selectedPosition;
                kotlin.jvm.internal.l.e(message, "message");
                if (selectedPosition != abstractC2467j.f27511r0) {
                    abstractC2467j.f27511r0 = selectedPosition;
                    abstractC2467j.w0();
                }
                O1 o12 = abstractC2467j.f27510q0;
                if (o12 != null) {
                    o12.a(c0109l2, obj, c0152w2, abstractC0132r2);
                    return;
                }
                return;
            default:
                boolean z8 = C2606e.f28342J1;
                String message2 = abstractC0132r2.toString();
                C2606e t5 = (C2606e) c10;
                kotlin.jvm.internal.l.e(t5, "t");
                kotlin.jvm.internal.l.e(message2, "message");
                C0096i1 c0096i1 = abstractC0132r2.f1358a;
                t5.B1 = c0096i1 != null ? c0096i1.f1228b : -1L;
                return;
        }
    }
}
