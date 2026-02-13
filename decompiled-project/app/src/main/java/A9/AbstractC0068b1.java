package A9;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import android.view.autofill.AutofillId;

/* renamed from: A9.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0068b1 {
    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ AudioFocusRequest.Builder g() {
        return new AudioFocusRequest.Builder(1);
    }

    public static /* bridge */ /* synthetic */ AutofillId i(Object obj) {
        return (AutofillId) obj;
    }
}
