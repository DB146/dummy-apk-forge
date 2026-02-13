package Y5;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* loaded from: classes.dex */
public final class J extends zzbl implements K {
    @Override // Y5.K
    public final void zze(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzd(2, zza);
    }
}
