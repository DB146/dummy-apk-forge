package Y5;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11363a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f11364b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11365c;

    /* renamed from: d, reason: collision with root package name */
    public final zzdd f11366d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11367e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f11368f;
    public final String g;

    public G0(Context context, zzdd zzddVar, Long l10) {
        this.f11367e = true;
        com.google.android.gms.common.internal.G.g(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.G.g(applicationContext);
        this.f11363a = applicationContext;
        this.f11368f = l10;
        if (zzddVar != null) {
            this.f11366d = zzddVar;
            this.f11367e = zzddVar.zzc;
            this.f11365c = zzddVar.zzb;
            this.g = zzddVar.zze;
            Bundle bundle = zzddVar.zzd;
            if (bundle != null) {
                this.f11364b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
