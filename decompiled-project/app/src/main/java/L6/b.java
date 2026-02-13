package L6;

import android.animation.AnimatorSet;
import c.AbstractC0876t;

/* loaded from: classes.dex */
public final class b extends AbstractC0876t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f6309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(AnimatorSet animatorSet, int i7) {
        super(true);
        this.f6308d = i7;
        this.f6309e = animatorSet;
    }

    @Override // c.AbstractC0876t
    public final void b() {
        switch (this.f6308d) {
            case 0:
                this.f6309e.start();
                return;
            default:
                this.f6309e.start();
                return;
        }
    }
}
