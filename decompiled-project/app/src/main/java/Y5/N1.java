package Y5;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class N1 implements F0 {

    /* renamed from: a, reason: collision with root package name */
    public final zzda f11480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f11481b;

    public N1(AppMeasurementDynamiteService appMeasurementDynamiteService, zzda zzdaVar) {
        this.f11481b = appMeasurementDynamiteService;
        this.f11480a = zzdaVar;
    }

    @Override // Y5.F0
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f11480a.zze(str, str2, bundle, j);
        } catch (RemoteException e2) {
            C0646q0 c0646q0 = this.f11481b.f15154a;
            if (c0646q0 != null) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11580w.b(e2, "Event listener threw exception");
            }
        }
    }
}
