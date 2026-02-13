package com.google.ads.interactivemedia.v3.internal;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
final class zzabe extends zzxi {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        zzacvVar.zzk();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (zzacvVar.zzt() != 4) {
            String zzh = zzacvVar.zzh();
            int zzc = zzacvVar.zzc();
            if ("year".equals(zzh)) {
                i7 = zzc;
            } else if ("month".equals(zzh)) {
                i10 = zzc;
            } else if ("dayOfMonth".equals(zzh)) {
                i11 = zzc;
            } else if ("hourOfDay".equals(zzh)) {
                i12 = zzc;
            } else if ("minute".equals(zzh)) {
                i13 = zzc;
            } else if ("second".equals(zzh)) {
                i14 = zzc;
            }
        }
        zzacvVar.zzm();
        return new GregorianCalendar(i7, i10, i11, i12, i13, i14);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) {
        if (((Calendar) obj) == null) {
            zzacxVar.zzf();
            return;
        }
        zzacxVar.zzb();
        zzacxVar.zze("year");
        zzacxVar.zzh(r4.get(1));
        zzacxVar.zze("month");
        zzacxVar.zzh(r4.get(2));
        zzacxVar.zze("dayOfMonth");
        zzacxVar.zzh(r4.get(5));
        zzacxVar.zze("hourOfDay");
        zzacxVar.zzh(r4.get(11));
        zzacxVar.zze("minute");
        zzacxVar.zzh(r4.get(12));
        zzacxVar.zze("second");
        zzacxVar.zzh(r4.get(13));
        zzacxVar.zzd();
    }
}
