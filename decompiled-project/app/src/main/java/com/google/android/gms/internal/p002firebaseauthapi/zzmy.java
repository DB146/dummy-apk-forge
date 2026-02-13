package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import y.S;

/* loaded from: classes.dex */
public final class zzmy {
    private static final Object zza = new Object();
    private static final String zzb = "zzmy";
    private zzbv zzc;

    /* loaded from: classes.dex */
    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzbe zze = null;
        private boolean zzf = true;
        private zzbn zzg = null;
        private zzww zzh = null;
        private zzbv zzi;

        private static zzbv zza(byte[] bArr) {
            return zzbv.zza(zzcc.zza(zzbd.zza(bArr), zzbj.zza()));
        }

        private final zzbe zzb() {
            zzmy.zzd();
            zznd zzndVar = new zznd();
            try {
                boolean zzc = zznd.zzc(this.zzd);
                try {
                    return zzndVar.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e2) {
                    if (!zzc) {
                        throw new KeyStoreException(S.b("the master key ", this.zzd, " exists but is unusable"), e2);
                    }
                    Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e10) {
                Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e10);
                return null;
            }
        }

        private final zzbv zzb(byte[] bArr) {
            try {
                this.zze = new zznd().zza(this.zzd);
                try {
                    return zzbv.zza(zzbq.zza(zzbd.zza(bArr), this.zze, new byte[0]));
                } catch (IOException | GeneralSecurityException e2) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e2;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e10) {
                try {
                    zzbv zza = zza(bArr);
                    Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e10);
                    return zza;
                } catch (IOException unused2) {
                    throw e10;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return zzzr.zza(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(S.b("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        }

        public final zza zza(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            this.zza = context;
            this.zzb = str;
            this.zzc = str2;
            return this;
        }

        public final zza zza(zzww zzwwVar) {
            this.zzh = zzwwVar;
            return this;
        }

        public final zza zza(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.zzf) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.zzd = str;
            return this;
        }

        public final synchronized zzmy zza() {
            zzmy zzmyVar;
            try {
                if (this.zzb == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                zzww zzwwVar = this.zzh;
                if (zzwwVar != null && this.zzg == null) {
                    this.zzg = zzbn.zza(zzcm.zza(zzwwVar.zzk()));
                }
                synchronized (zzmy.zza) {
                    try {
                        byte[] zzb = zzb(this.zza, this.zzb, this.zzc);
                        if (zzb == null) {
                            if (this.zzd != null) {
                                this.zze = zzb();
                            }
                            zzbn zzbnVar = this.zzg;
                            if (zzbnVar == null) {
                                throw new GeneralSecurityException("cannot read or generate keyset");
                            }
                            zzbq zza = zzbq.zza(zzbnVar);
                            zzmy.zza(zza, new zznf(this.zza, this.zzb, this.zzc), this.zze);
                            this.zzi = zzbv.zza(zza);
                        } else if (this.zzd != null) {
                            zzmy.zzd();
                            this.zzi = zzb(zzb);
                        } else {
                            this.zzi = zza(zzb);
                        }
                        zzmyVar = new zzmy(this);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return zzmyVar;
        }
    }

    private zzmy(zza zzaVar) {
        new zznf(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzc = zzaVar.zzi;
    }

    public static /* synthetic */ void zza(zzbq zzbqVar, zzbx zzbxVar, zzbe zzbeVar) {
        try {
            if (zzbeVar != null) {
                zzbqVar.zza(zzbxVar, zzbeVar, new byte[0]);
            } else {
                zzcc.zza(zzbqVar, zzbxVar, zzbj.zza());
            }
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbq zza() {
        return this.zzc.zza();
    }
}
