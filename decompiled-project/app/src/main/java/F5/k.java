package F5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class k extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4112b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f4112b = eVar;
        this.f4111a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i7);
            return;
        }
        int i10 = f.f4099a;
        e eVar = this.f4112b;
        Context context = this.f4111a;
        int d10 = eVar.d(context, i10);
        int i11 = h.f4105e;
        if (d10 == 1 || d10 == 2 || d10 == 3 || d10 == 9) {
            Intent b2 = eVar.b(d10, context, "n");
            eVar.h(context, d10, b2 == null ? null : PendingIntent.getActivity(context, 0, b2, 201326592));
        }
    }
}
