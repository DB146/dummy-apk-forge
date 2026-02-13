package L6;

import android.animation.AnimatorSet;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f6307b;

    public /* synthetic */ a(AnimatorSet animatorSet, int i7) {
        this.f6306a = i7;
        this.f6307b = animatorSet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6306a) {
            case 0:
                this.f6307b.start();
                return;
            default:
                this.f6307b.start();
                return;
        }
    }
}
