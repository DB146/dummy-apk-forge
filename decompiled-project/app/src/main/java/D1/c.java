package D1;

import Db.q;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import z5.g;

/* loaded from: classes.dex */
public final class c extends m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f3152b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(HiddenActivity hiddenActivity, int i7, int i10) {
        super(1);
        this.f3151a = i10;
        this.f3152b = hiddenActivity;
        this.f3153c = i7;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f3151a) {
            case 0:
                HiddenActivity hiddenActivity = this.f3152b;
                g gVar = (g) obj;
                try {
                    hiddenActivity.f13316b = true;
                    hiddenActivity.startIntentSenderForResult(gVar.f28302a.getIntentSender(), this.f3153c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e2) {
                    ResultReceiver resultReceiver = hiddenActivity.f13315a;
                    l.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e2.getMessage());
                }
                return q.f3365a;
            case 1:
                HiddenActivity hiddenActivity2 = this.f3152b;
                z5.m mVar = (z5.m) obj;
                try {
                    hiddenActivity2.f13316b = true;
                    hiddenActivity2.startIntentSenderForResult(mVar.f28314a.getIntentSender(), this.f3153c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e10) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f13315a;
                    l.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e10.getMessage());
                }
                return q.f3365a;
            case 2:
                HiddenActivity hiddenActivity3 = this.f3152b;
                PendingIntent result = (PendingIntent) obj;
                l.e(result, "result");
                try {
                    hiddenActivity3.f13316b = true;
                    hiddenActivity3.startIntentSenderForResult(result.getIntentSender(), this.f3153c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e11) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f13315a;
                    l.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e11.getMessage());
                }
                return q.f3365a;
            default:
                HiddenActivity hiddenActivity4 = this.f3152b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                try {
                    hiddenActivity4.f13316b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3153c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e12) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f13315a;
                    l.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e12.getMessage());
                }
                return q.f3365a;
        }
    }
}
