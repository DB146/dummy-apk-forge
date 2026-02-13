package A9;

import A0.C0016f0;
import android.transition.Transition;
import android.view.Window;

/* renamed from: A9.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0130r0 extends D9.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1352h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0142u0 f1353i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130r0(C0142u0 c0142u0, int i7) {
        super("STATE_SET_ENTRANCE_START_STATE");
        this.f1352h = i7;
        switch (i7) {
            case 1:
                this.f1353i = c0142u0;
                super("STATE_SWITCH_TO_VIDEO_IN_ON_CREATE", false, false);
                return;
            case 2:
                this.f1353i = c0142u0;
                super("STATE_ENTER_TRANSITION_CANCEL", false, false);
                return;
            case 3:
            case 4:
            default:
                this.f1353i = c0142u0;
                return;
            case 5:
                this.f1353i = c0142u0;
                super("STATE_ON_SAFE_START");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0130r0(C0142u0 c0142u0, int i7, boolean z8) {
        super("STATE_ENTER_TRANSITION_PENDING");
        this.f1352h = i7;
        this.f1353i = c0142u0;
    }

    @Override // D9.b
    public final void c() {
        switch (this.f1352h) {
            case 0:
                this.f1353i.f1398b1.w0(false);
                return;
            case 1:
                C0142u0 c0142u0 = this.f1353i;
                ((C0016f0) c0142u0.f1402f1.f1431d).b(true, true);
                c0142u0.r0(false);
                c0142u0.f1403g1 = true;
                c0142u0.A0();
                return;
            case 2:
                C0142u0 c0142u02 = this.f1353i;
                if (c0142u02.A() != null) {
                    Window window = c0142u02.A().getWindow();
                    Transition returnTransition = window.getReturnTransition();
                    Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
                    window.setEnterTransition(null);
                    window.setSharedElementEnterTransition(null);
                    window.setReturnTransition(returnTransition);
                    window.setSharedElementReturnTransition(sharedElementReturnTransition);
                    return;
                }
                return;
            case 3:
                C0142u0 c0142u03 = this.f1353i;
                E6.b.c(c0142u03.A().getWindow().getEnterTransition(), c0142u03.f1391U0);
                return;
            case 4:
                new RunnableC0102k(this.f1353i);
                return;
            default:
                C0146v0 c0146v0 = this.f1353i.f1402f1;
                if (c0146v0 == null || c0146v0.f1428a) {
                    return;
                }
                c0146v0.f1428a = true;
                return;
        }
    }
}
