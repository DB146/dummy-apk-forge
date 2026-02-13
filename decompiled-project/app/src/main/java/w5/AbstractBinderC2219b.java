package w5;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

/* renamed from: w5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2219b extends zzb implements InterfaceC2220c {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            int i11 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzb(parcel);
            zzc(readInt != 0);
        } else {
            Account account = (Account) zzc.zza(parcel, Account.CREATOR);
            zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }
}
