package A9;

import android.view.View;

/* loaded from: classes2.dex */
public final class A extends D9.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f730h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ D f731i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d10, int i7) {
        super("ENTRANCE_ON_PREPARED", true, false);
        this.f730h = i7;
        switch (i7) {
            case 1:
                this.f731i = d10;
                super("ENTRANCE_ON_PREPARED_ON_CREATEVIEW");
                return;
            case 2:
                this.f731i = d10;
                super("STATE_ENTRANCE_PERFORM");
                return;
            case 3:
                this.f731i = d10;
                super("ENTRANCE_ON_ENDED");
                return;
            default:
                this.f731i = d10;
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(W w10) {
        super("SET_ENTRANCE_START_STATE");
        this.f730h = 4;
        this.f731i = w10;
    }

    @Override // D9.b
    public final void c() {
        switch (this.f730h) {
            case 0:
                this.f731i.f787G0.b();
                return;
            case 1:
                this.f731i.w0();
                return;
            case 2:
                D d10 = this.f731i;
                d10.f787G0.a();
                View view = d10.f10277U;
                if (view == null) {
                    return;
                }
                view.getViewTreeObserver().addOnPreDrawListener(new B(d10, view, 0));
                view.invalidate();
                return;
            case 3:
                this.f731i.v0();
                return;
            default:
                ((W) this.f731i).J0(false);
                return;
        }
    }
}
