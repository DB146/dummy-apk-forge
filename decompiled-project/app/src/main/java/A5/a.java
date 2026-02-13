package A5;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;

/* loaded from: classes.dex */
public abstract class a extends l {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        b bVar = new b(0);
        zzb = bVar;
        zzc = new i("SmsRetriever.API", bVar, obj);
    }

    public a(Activity activity) {
        super(activity, activity, zzc, e.f14901q, k.f15009c);
    }

    public a(Context context) {
        super(context, null, zzc, e.f14901q, k.f15009c);
    }
}
