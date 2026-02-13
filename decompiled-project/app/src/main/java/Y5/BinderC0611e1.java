package Y5;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Y5.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0611e1 extends zzbm implements K {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11727a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0611e1(C0632l1 c0632l1, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f11727a = atomicReference;
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(x1.CREATOR);
        zzbn.zzf(parcel);
        zze(createTypedArrayList);
        return true;
    }

    @Override // Y5.K
    public final void zze(List list) {
        AtomicReference atomicReference = this.f11727a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
