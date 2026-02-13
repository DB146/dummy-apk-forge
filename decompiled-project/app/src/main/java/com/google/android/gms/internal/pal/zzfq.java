package com.google.android.gms.internal.pal;

import P1.g;
import P5.a;
import P5.b;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;

/* loaded from: classes.dex */
public abstract class zzfq extends zzfk implements zzfr {
    public zzfq() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // com.google.android.gms.internal.pal.zzfk
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        switch (i7) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(zzj());
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzfl.zzb(parcel);
                zzn(readString, readString2);
                parcel2.writeNoException();
                return true;
            case 3:
                a h10 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                boolean zzp = zzp(h10);
                parcel2.writeNoException();
                zzfl.zzc(parcel2, zzp);
                return true;
            case 4:
                a h11 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                boolean zzq = zzq(h11);
                parcel2.writeNoException();
                zzfl.zzc(parcel2, zzq);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzfl.zzb(parcel);
                zzo(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                a h12 = b.h(parcel.readStrongBinder());
                a h13 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                a zzd = zzd(h12, h13);
                parcel2.writeNoException();
                zzfl.zze(parcel2, zzd);
                return true;
            case 7:
                a h14 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                String zzf = zzf(h14);
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                a h15 = b.h(parcel.readStrongBinder());
                String readString4 = parcel.readString();
                zzfl.zzb(parcel);
                String zze = zze(h15, readString4);
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 9:
                a h16 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                zzl(h16);
                parcel2.writeNoException();
                return true;
            case 10:
                a h17 = b.h(parcel.readStrongBinder());
                a h18 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                a zzc = zzc(h17, h18);
                parcel2.writeNoException();
                zzfl.zze(parcel2, zzc);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                String readString5 = parcel.readString();
                boolean zzf2 = zzfl.zzf(parcel);
                zzfl.zzb(parcel);
                boolean zzr = zzr(readString5, zzf2);
                parcel2.writeNoException();
                zzfl.zzc(parcel2, zzr);
                return true;
            case 12:
                a h19 = b.h(parcel.readStrongBinder());
                byte[] createByteArray = parcel.createByteArray();
                zzfl.zzb(parcel);
                String zzg = zzg(h19, createByteArray);
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 13:
                a h20 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                String zzi = zzi(h20);
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 14:
                a h21 = b.h(parcel.readStrongBinder());
                a h22 = b.h(parcel.readStrongBinder());
                a h23 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                String zzk = zzk(h21, h22, h23);
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 15:
                a h24 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                zzm(h24);
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                a h25 = b.h(parcel.readStrongBinder());
                a h26 = b.h(parcel.readStrongBinder());
                a h27 = b.h(parcel.readStrongBinder());
                a h28 = b.h(parcel.readStrongBinder());
                zzfl.zzb(parcel);
                String zzh = zzh(h25, h26, h27, h28);
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 18:
                parcel2.writeNoException();
                zzfl.zzc(parcel2, true);
                return true;
            case 19:
                parcel2.writeNoException();
                zzfl.zzc(parcel2, true);
                return true;
            case 20:
                int zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
        }
    }
}
