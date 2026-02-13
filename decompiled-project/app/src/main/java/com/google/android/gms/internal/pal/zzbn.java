package com.google.android.gms.internal.pal;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbn {
    static boolean zza = false;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(zzaf zzafVar, String str) {
        byte[] zzh;
        byte[] zzas = zzafVar.zzas();
        if (((Boolean) zzfv.zzc().zzb(zzgk.zzcw)).booleanValue()) {
            Vector zzb2 = zzb(zzas, 255);
            if (zzb2 == null || zzb2.size() == 0) {
                zzh = zzh(zzg(4096).zzas(), str, true);
            } else {
                zzat zza2 = zzau.zza();
                int size = zzb2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    zza2.zza(zzaby.zzn(zzh((byte[]) zzb2.get(i7), str, false)));
                }
                zza2.zzb(zzaby.zzn(zzf(zzas)));
                zzh = ((zzau) zza2.zzan()).zzas();
            }
        } else {
            if (zzdv.zza == null) {
                throw new GeneralSecurityException();
            }
            byte[] zza3 = zzdv.zza.zza(zzas, str != null ? str.getBytes() : new byte[0]);
            zzat zza4 = zzau.zza();
            zza4.zza(zzaby.zzn(zza3));
            zza4.zzc(3);
            zzh = ((zzau) zza4.zzan()).zzas();
        }
        return zzbj.zza(zzh, true);
    }

    public static Vector zzb(byte[] bArr, int i7) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i10 = (length + 254) / 255;
        Vector vector = new Vector();
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i12 > 255) {
                    length2 = i12 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i12, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zze) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzbm(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] zze(String str, String str2, boolean z8) {
        zzai zza2 = zzaj.zza();
        try {
            zza2.zzb(zzaby.zzn(str.length() < 3 ? str.getBytes("ISO-8859-1") : zzbj.zzb(str, true)));
            zza2.zza(zzaby.zzn(str2.length() < 3 ? str2.getBytes("ISO-8859-1") : zzbj.zzb(str2, true)));
            return ((zzaj) zza2.zzan()).zzas();
        } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.pal.zzbn.zzc.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] zzf(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (zzd) {
            try {
                zzd();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzc) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                throw new NoSuchAlgorithmException("Cannot compute hash");
            } finally {
            }
        }
        return digest;
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    public static zzaf zzg(int i7) {
        zzr zza2 = zzaf.zza();
        zza2.zzD(4096L);
        return (zzaf) zza2.zzan();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z8) {
        byte[] array;
        int i7 = true != z8 ? 255 : 239;
        if (bArr.length > i7) {
            bArr = zzg(4096).zzas();
        }
        int length = bArr.length;
        if (length < i7) {
            byte[] bArr2 = new byte[i7 - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i7 + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i7 + 1).put((byte) length).put(bArr).array();
        }
        if (z8) {
            array = ByteBuffer.allocate(256).put(zzf(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzbo[] zzboVarArr = new zzcn().zzcG;
        int length2 = zzboVarArr.length;
        for (int i10 = 0; i10 < 12; i10++) {
            zzboVarArr[i10].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzabg(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
