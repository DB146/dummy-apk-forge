package B0;

import android.os.SystemClock;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f1567b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(D d10, int i7) {
        super(0);
        this.f1566a = i7;
        this.f1567b = d10;
    }

    @Override // Rb.a
    public final Object invoke() {
        int actionMasked;
        C0195p c0195p;
        switch (this.f1566a) {
            case 0:
                D d10 = this.f1567b;
                MotionEvent motionEvent = d10.f1585E0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    d10.f1587F0 = SystemClock.uptimeMillis();
                    d10.post(d10.f1593I0);
                }
                return Db.q.f3365a;
            default:
                c0195p = this.f1567b.get_viewTreeOwners();
                return c0195p;
        }
    }
}
