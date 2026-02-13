package Y0;

import A0.K;
import A0.t0;
import B0.D;
import android.view.MotionEvent;
import u.C2042E;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f11077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(q qVar, int i7) {
        super(1);
        this.f11076a = i7;
        this.f11077b = qVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        switch (this.f11076a) {
            case 0:
                t0 t0Var = (t0) obj;
                D d10 = t0Var instanceof D ? (D) t0Var : null;
                q qVar = this.f11077b;
                if (d10 != null) {
                    K k = new K(5, d10, qVar);
                    C2042E c2042e = d10.f1591H0;
                    if (c2042e.f(k) < 0) {
                        c2042e.a(k);
                    }
                }
                qVar.removeAllViewsInLayout();
                return Db.q.f3365a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                q qVar2 = this.f11077b;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = qVar2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = qVar2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
