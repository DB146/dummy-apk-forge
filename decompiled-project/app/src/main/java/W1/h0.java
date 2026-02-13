package W1;

import android.transition.Transition;

/* loaded from: classes.dex */
public final class h0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10488b;

    public /* synthetic */ h0(Object obj, int i7) {
        this.f10487a = i7;
        this.f10488b = obj;
    }

    private final void a(Transition transition) {
    }

    private final void b(Transition transition) {
    }

    private final void c(Transition transition) {
    }

    private final void d(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        switch (this.f10487a) {
            case 0:
                return;
            default:
                ((O5.b) this.f10488b).z();
                return;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        switch (this.f10487a) {
            case 0:
                ((RunnableC0569l) this.f10488b).run();
                return;
            default:
                ((O5.b) this.f10488b).A(transition);
                return;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        switch (this.f10487a) {
            case 0:
                return;
            default:
                ((O5.b) this.f10488b).getClass();
                return;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        switch (this.f10487a) {
            case 0:
                return;
            default:
                ((O5.b) this.f10488b).getClass();
                return;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        switch (this.f10487a) {
            case 0:
                return;
            default:
                ((O5.b) this.f10488b).B();
                return;
        }
    }
}
