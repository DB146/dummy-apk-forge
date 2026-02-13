package Y5;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Y5.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0614f1 extends zzbm implements M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0632l1 f11752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0614f1(C0632l1 c0632l1, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f11751a = atomicReference;
        this.f11752b = c0632l1;
    }

    @Override // Y5.M
    public final void o(C1 c12) {
        AtomicReference atomicReference = this.f11751a;
        synchronized (atomicReference) {
            W w10 = ((C0646q0) this.f11752b.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11573B.b(Integer.valueOf(c12.f11232a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(c12);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 != 2) {
            return false;
        }
        C1 c12 = (C1) zzbn.zzb(parcel, C1.CREATOR);
        zzbn.zzf(parcel);
        o(c12);
        return true;
    }
}
