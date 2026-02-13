package Q5;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public final class i extends zza {
    public final P5.a F(P5.b bVar, String str, int i7, P5.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i7);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(3, zza);
        P5.a h10 = P5.b.h(zzB.readStrongBinder());
        zzB.recycle();
        return h10;
    }

    public final P5.a h(P5.b bVar, String str, int i7, P5.b bVar2) {
        Parcel zza = zza();
        zzc.zze(zza, bVar);
        zza.writeString(str);
        zza.writeInt(i7);
        zzc.zze(zza, bVar2);
        Parcel zzB = zzB(2, zza);
        P5.a h10 = P5.b.h(zzB.readStrongBinder());
        zzB.recycle();
        return h10;
    }
}
