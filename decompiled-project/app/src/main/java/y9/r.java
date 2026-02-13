package y9;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f27529c;

    public /* synthetic */ r(View view, AbstractC2456A abstractC2456A) {
        this.f27527a = 0;
        this.f27529c = view;
        this.f27528b = abstractC2456A;
    }

    public /* synthetic */ r(AbstractC2456A abstractC2456A, View view, int i7) {
        this.f27527a = i7;
        this.f27528b = abstractC2456A;
        this.f27529c = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r1 != null) goto L8;
     */
    @Override // Rb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Db.q qVar = Db.q.f3365a;
        View view = this.f27529c;
        AbstractC2456A abstractC2456A = this.f27528b;
        switch (this.f27527a) {
            case 0:
                Db.o oVar = AbstractC2456A.g2;
                if (view == null) {
                    abstractC2456A.F0(null);
                }
                abstractC2456A.f27459d2 = t.f27534a;
                return qVar;
            case 1:
                if (view == null) {
                    view = abstractC2456A.f27472q1;
                    break;
                } else {
                    Db.o oVar2 = AbstractC2456A.g2;
                    abstractC2456A.getClass();
                }
                view.requestFocus();
                FrameLayout frameLayout = abstractC2456A.p1;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(abstractC2456A.f27471o1);
                }
                return qVar;
            default:
                Db.o oVar3 = AbstractC2456A.g2;
                abstractC2456A.F0(view);
                return qVar;
        }
    }
}
