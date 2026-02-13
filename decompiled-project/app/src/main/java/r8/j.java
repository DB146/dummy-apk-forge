package r8;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import i1.C1290a;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f23845b;

    public /* synthetic */ j(FirebaseMessaging firebaseMessaging, int i7) {
        this.f23844a = i7;
        this.f23845b = firebaseMessaging;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z8;
        switch (this.f23844a) {
            case 0:
                u uVar = (u) obj;
                if (!this.f23845b.f15868e.m() || uVar.f23888h.a() == null) {
                    return;
                }
                synchronized (uVar) {
                    z8 = uVar.g;
                }
                if (z8) {
                    return;
                }
                uVar.f(0L);
                return;
            default:
                E5.a aVar = (E5.a) obj;
                C1290a c1290a = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging = this.f23845b;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    Z9.x.F(aVar.f3670a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
