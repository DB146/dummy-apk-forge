package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzjz implements zzkn {
    private static final Charset zza = Charset.forName("UTF-8");
    private final InputStream zzb;

    private zzjz(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzkn zza(InputStream inputStream) {
        return new zzjz(inputStream);
    }

    @Override // com.google.android.gms.internal.pal.zzkn
    public final zzwb zzb() {
        char c10;
        int i7;
        char c11;
        int i10;
        char c12;
        zzvn zzvnVar;
        String str = "status";
        try {
            try {
                zzzb zzf = zzzs.zza(new zzabc(new StringReader(new String(zzlh.zzc(this.zzb), zza)))).zzf();
                if (!zzf.zzi("key") || zzf.zzb("key").zzb() == 0) {
                    throw new zzzc("invalid keyset");
                }
                zzvy zzd = zzwb.zzd();
                if (zzf.zzi("primaryKeyId")) {
                    zzd.zzb(zzf.zzc("primaryKeyId").zza());
                }
                zzyx zzb = zzf.zzb("key");
                int i11 = 0;
                while (i11 < zzb.zzb()) {
                    zzzb zzf2 = zzb.zzc(i11).zzf();
                    if (!zzf2.zzi("keyData") || !zzf2.zzi(str) || !zzf2.zzi("keyId") || !zzf2.zzi("outputPrefixType")) {
                        throw new zzzc("invalid key");
                    }
                    zzvz zzd2 = zzwa.zzd();
                    String zzd3 = zzf2.zzc(str).zzd();
                    int hashCode = zzd3.hashCode();
                    String str2 = str;
                    if (hashCode == -891611359) {
                        if (zzd3.equals("ENABLED")) {
                            c10 = 0;
                        }
                        c10 = 65535;
                    } else if (hashCode != 478389753) {
                        if (hashCode == 1053567612 && zzd3.equals("DISABLED")) {
                            c10 = 1;
                        }
                        c10 = 65535;
                    } else {
                        if (zzd3.equals("DESTROYED")) {
                            c10 = 2;
                        }
                        c10 = 65535;
                    }
                    if (c10 == 0) {
                        i7 = 3;
                    } else if (c10 == 1) {
                        i7 = 4;
                    } else {
                        if (c10 != 2) {
                            throw new zzzc("unknown status: ".concat(zzd3));
                        }
                        i7 = 5;
                    }
                    zzd2.zzd(i7);
                    zzd2.zzb(zzf2.zzc("keyId").zza());
                    String zzd4 = zzf2.zzc("outputPrefixType").zzd();
                    switch (zzd4.hashCode()) {
                        case -2053249079:
                            if (zzd4.equals("LEGACY")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case 80904:
                            if (zzd4.equals("RAW")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case 2575090:
                            if (zzd4.equals("TINK")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case 1761684556:
                            if (zzd4.equals("CRUNCHY")) {
                                c11 = 3;
                                break;
                            }
                            break;
                    }
                    c11 = 65535;
                    if (c11 == 0) {
                        i10 = 3;
                    } else if (c11 == 1) {
                        i10 = 5;
                    } else if (c11 == 2) {
                        i10 = 4;
                    } else {
                        if (c11 != 3) {
                            throw new zzzc("unknown output prefix type: ".concat(zzd4));
                        }
                        i10 = 6;
                    }
                    zzd2.zzc(i10);
                    zzzb zze = zzf2.zze("keyData");
                    if (!zze.zzi("typeUrl") || !zze.zzi("value") || !zze.zzi("keyMaterialType")) {
                        throw new zzzc("invalid keyData");
                    }
                    byte[] zza2 = zzxn.zza(zze.zzc("value").zzd(), 2);
                    zzvl zza3 = zzvo.zza();
                    zza3.zzb(zze.zzc("typeUrl").zzd());
                    zza3.zzc(zzaby.zzn(zza2));
                    String zzd5 = zze.zzc("keyMaterialType").zzd();
                    switch (zzd5.hashCode()) {
                        case -1881281466:
                            if (zzd5.equals("REMOTE")) {
                                c12 = 3;
                                break;
                            }
                            break;
                        case -1609477353:
                            if (zzd5.equals("SYMMETRIC")) {
                                c12 = 0;
                                break;
                            }
                            break;
                        case 249237018:
                            if (zzd5.equals("ASYMMETRIC_PRIVATE")) {
                                c12 = 1;
                                break;
                            }
                            break;
                        case 1534613202:
                            if (zzd5.equals("ASYMMETRIC_PUBLIC")) {
                                c12 = 2;
                                break;
                            }
                            break;
                    }
                    c12 = 65535;
                    if (c12 == 0) {
                        zzvnVar = zzvn.SYMMETRIC;
                    } else if (c12 == 1) {
                        zzvnVar = zzvn.ASYMMETRIC_PRIVATE;
                    } else if (c12 == 2) {
                        zzvnVar = zzvn.ASYMMETRIC_PUBLIC;
                    } else {
                        if (c12 != 3) {
                            throw new zzzc("unknown key material type: ".concat(zzd5));
                        }
                        zzvnVar = zzvn.REMOTE;
                    }
                    zza3.zza(zzvnVar);
                    zzd2.zza((zzvo) zza3.zzan());
                    zzd.zza((zzwa) zzd2.zzan());
                    i11++;
                    str = str2;
                }
                zzwb zzwbVar = (zzwb) zzd.zzan();
                InputStream inputStream = this.zzb;
                if (inputStream != null) {
                    inputStream.close();
                }
                return zzwbVar;
            } catch (Throwable th) {
                InputStream inputStream2 = this.zzb;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (zzzc e2) {
            e = e2;
            throw new IOException(e);
        } catch (IllegalStateException e10) {
            e = e10;
            throw new IOException(e);
        }
    }
}
