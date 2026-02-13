package Y5;

import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: Y5.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0643p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcu f11875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f11876c;

    public /* synthetic */ RunnableC0643p0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcu zzcuVar, int i7) {
        this.f11874a = i7;
        this.f11875b = zzcuVar;
        this.f11876c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11874a) {
            case 0:
                C0632l1 o10 = this.f11876c.f15154a.o();
                o10.J();
                o10.K();
                o10.X(new C7.c(o10, o10.Z(false), this.f11875b, 8));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f11876c;
                M1 m12 = appMeasurementDynamiteService.f15154a.f11915w;
                C0646q0.j(m12);
                C0646q0 c0646q0 = appMeasurementDynamiteService.f15154a;
                m12.v0(this.f11875b, c0646q0.f11901M != null && c0646q0.f11901M.booleanValue());
                return;
        }
    }
}
