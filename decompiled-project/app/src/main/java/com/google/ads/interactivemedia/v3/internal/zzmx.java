package com.google.ads.interactivemedia.v3.internal;

import P1.g;
import P5.b;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;

/* loaded from: classes.dex */
public abstract class zzmx extends zzmr implements zzmy {
    public zzmx() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmr
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        switch (i7) {
            case 1:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzms.zzb(parcel);
                zzn(readString, readString2);
                parcel2.writeNoException();
                return true;
            case 3:
                P5.a h10 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                boolean zzp = zzp(h10);
                parcel2.writeNoException();
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 4:
                P5.a h11 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                boolean zzq = zzq(h11);
                parcel2.writeNoException();
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzms.zzb(parcel);
                zzo(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                P5.a h12 = b.h(parcel.readStrongBinder());
                P5.a h13 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                P5.a zzd = zzd(h12, h13);
                parcel2.writeNoException();
                zzms.zzd(parcel2, zzd);
                return true;
            case 7:
                P5.a h14 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                String zzf = zzf(h14);
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                P5.a h15 = b.h(parcel.readStrongBinder());
                String readString4 = parcel.readString();
                zzms.zzb(parcel);
                String zze = zze(h15, readString4);
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 9:
                P5.a h16 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                zzl(h16);
                parcel2.writeNoException();
                return true;
            case 10:
                P5.a h17 = b.h(parcel.readStrongBinder());
                P5.a h18 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                P5.a zzc = zzc(h17, h18);
                parcel2.writeNoException();
                zzms.zzd(parcel2, zzc);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                parcel.readString();
                int i11 = zzms.zza;
                parcel.readInt();
                zzms.zzb(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 12:
                P5.a h19 = b.h(parcel.readStrongBinder());
                byte[] createByteArray = parcel.createByteArray();
                zzms.zzb(parcel);
                String zzg = zzg(h19, createByteArray);
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 13:
                P5.a h20 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                String zzi = zzi(h20);
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 14:
                P5.a h21 = b.h(parcel.readStrongBinder());
                P5.a h22 = b.h(parcel.readStrongBinder());
                P5.a h23 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                String zzk = zzk(h21, h22, h23);
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 15:
                P5.a h24 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                zzm(h24);
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                P5.a h25 = b.h(parcel.readStrongBinder());
                P5.a h26 = b.h(parcel.readStrongBinder());
                P5.a h27 = b.h(parcel.readStrongBinder());
                P5.a h28 = b.h(parcel.readStrongBinder());
                zzms.zzb(parcel);
                String zzh = zzh(h25, h26, h27, h28);
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 18:
                boolean zzr = zzr();
                parcel2.writeNoException();
                int i12 = zzms.zza;
                parcel2.writeInt(zzr ? 1 : 0);
                return true;
            case 19:
                boolean zzs = zzs();
                parcel2.writeNoException();
                int i13 = zzms.zza;
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 20:
                int zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
        }
    }
}
