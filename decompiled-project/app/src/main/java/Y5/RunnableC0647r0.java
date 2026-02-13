package Y5;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzpk;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: Y5.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0647r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1 f11924b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC0657w0 f11925c;

    public RunnableC0647r0(BinderC0657w0 binderC0657w0, O1 o12, int i7) {
        this.f11923a = i7;
        switch (i7) {
            case 1:
                this.f11924b = o12;
                Objects.requireNonNull(binderC0657w0);
                this.f11925c = binderC0657w0;
                return;
            case 2:
                this.f11924b = o12;
                Objects.requireNonNull(binderC0657w0);
                this.f11925c = binderC0657w0;
                return;
            case 3:
                this.f11924b = o12;
                Objects.requireNonNull(binderC0657w0);
                this.f11925c = binderC0657w0;
                return;
            case 4:
                this.f11924b = o12;
                Objects.requireNonNull(binderC0657w0);
                this.f11925c = binderC0657w0;
                return;
            default:
                this.f11924b = o12;
                Objects.requireNonNull(binderC0657w0);
                this.f11925c = binderC0657w0;
                return;
        }
    }

    public /* synthetic */ RunnableC0647r0(BinderC0657w0 binderC0657w0, O1 o12, int i7, boolean z8) {
        this.f11923a = i7;
        this.f11925c = binderC0657w0;
        this.f11924b = o12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11923a) {
            case 0:
                BinderC0657w0 binderC0657w0 = this.f11925c;
                binderC0657w0.f11980a.A();
                binderC0657w0.f11980a.W(this.f11924b);
                return;
            case 1:
                BinderC0657w0 binderC0657w02 = this.f11925c;
                binderC0657w02.f11980a.A();
                I1 i12 = binderC0657w02.f11980a;
                i12.c().J();
                i12.k0();
                O1 o12 = this.f11924b;
                com.google.android.gms.common.internal.G.g(o12);
                String str = o12.f11506a;
                com.google.android.gms.common.internal.G.d(str);
                int i7 = 0;
                if (i12.d0().T(null, F.f11362z0)) {
                    ((M5.b) i12.e()).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int R10 = i12.d0().R(null, F.f11328i0);
                    i12.d0();
                    long longValue = currentTimeMillis - ((Long) F.f11316e.a(null)).longValue();
                    while (i7 < R10 && i12.G(null, longValue)) {
                        i7++;
                    }
                } else {
                    i12.d0();
                    long intValue = ((Integer) F.f11333l.a(null)).intValue();
                    while (i7 < intValue && i12.G(str, 0L)) {
                        i7++;
                    }
                }
                if (i12.d0().T(null, F.f11255A0)) {
                    i12.c().J();
                    i12.F();
                }
                zzin zzb = zzin.zzb(o12.f11505S);
                F1 f12 = i12.f11412x;
                f12.J();
                if (zzb != zzin.CLIENT_UPLOAD_ELIGIBLE || F1.M(str)) {
                    return;
                }
                C0628k0 c0628k0 = f12.f12021b.f11403a;
                I1.S(c0628k0);
                zzgl V7 = c0628k0.V(str);
                if (V7 == null || !V7.zzp() || V7.zzq().zzd().isEmpty()) {
                    return;
                }
                i12.b().f11573B.b(str, "[sgtm] Going background, trigger client side upload. appId");
                ((M5.b) i12.e()).getClass();
                i12.r(str, System.currentTimeMillis());
                return;
            case 2:
                BinderC0657w0 binderC0657w03 = this.f11925c;
                binderC0657w03.f11980a.A();
                I1 i13 = binderC0657w03.f11980a;
                i13.c().J();
                i13.k0();
                O1 o13 = this.f11924b;
                com.google.android.gms.common.internal.G.d(o13.f11506a);
                i13.a0(o13);
                return;
            case 3:
                BinderC0657w0 binderC0657w04 = this.f11925c;
                binderC0657w04.f11980a.A();
                I1 i14 = binderC0657w04.f11980a;
                if (i14.f11391M != null) {
                    ArrayList arrayList = new ArrayList();
                    i14.f11392N = arrayList;
                    arrayList.addAll(i14.f11391M);
                }
                C0633m c0633m = i14.f11405c;
                I1.S(c0633m);
                C0646q0 c0646q0 = (C0646q0) c0633m.f3094a;
                O1 o14 = this.f11924b;
                String str2 = o14.f11506a;
                com.google.android.gms.common.internal.G.g(str2);
                com.google.android.gms.common.internal.G.d(str2);
                c0633m.J();
                c0633m.K();
                try {
                    SQLiteDatabase A02 = c0633m.A0();
                    String[] strArr = {str2};
                    int delete = A02.delete("apps", "app_id=?", strArr) + A02.delete("events", "app_id=?", strArr) + A02.delete("events_snapshot", "app_id=?", strArr) + A02.delete("user_attributes", "app_id=?", strArr) + A02.delete("conditional_properties", "app_id=?", strArr) + A02.delete("raw_events", "app_id=?", strArr) + A02.delete("raw_events_metadata", "app_id=?", strArr) + A02.delete("queue", "app_id=?", strArr) + A02.delete("audience_filter_values", "app_id=?", strArr) + A02.delete("main_event_params", "app_id=?", strArr) + A02.delete("default_event_params", "app_id=?", strArr) + A02.delete("trigger_uris", "app_id=?", strArr) + A02.delete("upload_queue", "app_id=?", strArr);
                    zzpk.zza();
                    if (c0646q0.f11910d.T(null, F.f11329i1)) {
                        delete += A02.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (delete > 0) {
                        W w10 = c0646q0.f11912f;
                        C0646q0.l(w10);
                        w10.f11573B.c("Reset analytics data. app, records", str2, Integer.valueOf(delete));
                    }
                } catch (SQLiteException e2) {
                    W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11577f.c("Error resetting analytics data. appId, error", W.R(str2), e2);
                }
                if (o14.f11513v) {
                    i14.W(o14);
                    return;
                }
                return;
            case 4:
                BinderC0657w0 binderC0657w05 = this.f11925c;
                binderC0657w05.f11980a.A();
                I1 i15 = binderC0657w05.f11980a;
                i15.c().J();
                i15.k0();
                O1 o15 = this.f11924b;
                com.google.android.gms.common.internal.G.d(o15.f11506a);
                i15.l0(o15);
                i15.m0(o15);
                return;
            case 5:
                I1 i16 = this.f11925c.f11980a;
                i16.A();
                i16.m0(this.f11924b);
                return;
            default:
                I1 i17 = this.f11925c.f11980a;
                i17.A();
                i17.l0(this.f11924b);
                return;
        }
    }
}
