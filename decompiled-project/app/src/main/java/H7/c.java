package H7;

import L7.RunnableC0383c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import h7.C1257c;
import n7.m;
import p8.C1859a;
import q3.l;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f4903b;

    public /* synthetic */ c(l lVar, int i7) {
        this.f4902a = i7;
        this.f4903b = lVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f4902a) {
            case 1:
                String message = exc.getMessage();
                l lVar = this.f4903b;
                ((O7.b) lVar.f23391b).execute(new RunnableC0383c((J7.a) lVar.f23392c, message, 1));
                return;
            default:
                boolean z8 = exc instanceof Y6.c;
                l lVar2 = this.f4903b;
                if (z8 || (exc instanceof C1859a)) {
                    lVar2.E(null);
                    return;
                }
                ((O7.b) lVar2.f23391b).execute(new RunnableC0383c((J7.a) lVar2.f23392c, exc.getMessage(), 1));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f4902a) {
            case 0:
                this.f4903b.E(((C1257c) obj).f17832a);
                return;
            default:
                this.f4903b.E(((m) obj).f21291a);
                return;
        }
    }
}
