package c2;

import A0.C0016f0;
import A9.B;
import A9.o3;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.Window;
import h2.C1233a;

/* loaded from: classes.dex */
public final class j extends C1233a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14160h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f14161i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, int i7) {
        super("ENTRANCE_ON_PREPARED", true, false);
        this.f14160h = i7;
        switch (i7) {
            case 1:
                this.f14161i = pVar;
                super("ENTRANCE_ON_PREPARED_ON_CREATEVIEW");
                return;
            case 2:
                this.f14161i = pVar;
                super("STATE_ENTRANCE_PERFORM");
                return;
            case 3:
                this.f14161i = pVar;
                super("ENTRANCE_ON_ENDED");
                return;
            case 4:
                this.f14161i = pVar;
                super("STATE_SWITCH_TO_VIDEO_IN_ON_CREATE", false, false);
                return;
            case 5:
                this.f14161i = pVar;
                super("STATE_ENTER_TRANSITION_CANCEL", false, false);
                return;
            case 6:
            case 7:
            default:
                this.f14161i = pVar;
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                this.f14161i = pVar;
                super("STATE_ON_SAFE_START");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(p pVar, int i7, boolean z8) {
        super("STATE_ENTER_TRANSITION_PENDING");
        this.f14160h = i7;
        this.f14161i = pVar;
    }

    @Override // h2.C1233a
    public final void c() {
        switch (this.f14160h) {
            case 0:
                this.f14161i.f14172D0.b();
                return;
            case 1:
                this.f14161i.getClass();
                throw null;
            case 2:
                p pVar = this.f14161i;
                pVar.f14172D0.a();
                View view = pVar.f10277U;
                if (view == null) {
                    return;
                }
                view.getViewTreeObserver().addOnPreDrawListener(new B(pVar, view, 1));
                view.invalidate();
                return;
            case 3:
                this.f14161i.getClass();
                throw null;
            case 4:
                p pVar2 = this.f14161i;
                ((C0016f0) pVar2.f14191W0.f3501d).b(true, true);
                if (pVar2.f14162m0) {
                    pVar2.f14162m0 = false;
                    o3 o3Var = pVar2.f14164o0;
                    if (o3Var != null) {
                        TransitionManager.go(o3Var.f1338e, o3Var.f1335b);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                p pVar3 = this.f14161i;
                if (pVar3.A() != null) {
                    Window window = pVar3.A().getWindow();
                    Transition returnTransition = window.getReturnTransition();
                    Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
                    window.setEnterTransition(null);
                    window.setSharedElementEnterTransition(null);
                    window.setReturnTransition(returnTransition);
                    window.setSharedElementReturnTransition(sharedElementReturnTransition);
                    return;
                }
                return;
            case 6:
                p pVar4 = this.f14161i;
                E6.b.c(pVar4.A().getWindow().getEnterTransition(), pVar4.f14186R0);
                return;
            case 7:
                new o(this.f14161i);
                return;
            default:
                E.u uVar = this.f14161i.f14191W0;
                if (uVar == null || uVar.f3498a) {
                    return;
                }
                uVar.f3498a = true;
                return;
        }
    }
}
