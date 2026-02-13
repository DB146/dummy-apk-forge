package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzie {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(byte[] bArr, String str) {
        byte[] zzg;
        Vector zzb2 = zzb(bArr, 255);
        if (zzb2 == null || zzb2.size() == 0) {
            zzg = zzg(zzf(4096).zzav(), str, true);
        } else {
            zzbo zza2 = zzbp.zza();
            int size = zzb2.size();
            for (int i7 = 0; i7 < size; i7++) {
                zza2.zza(zzadr.zzs(zzg((byte[]) zzb2.get(i7), str, false), 0, 256));
            }
            byte[] zze2 = zze(bArr);
            zzadr zzadrVar = zzadr.zzb;
            zza2.zzb(zzadr.zzs(zze2, 0, zze2.length));
            zzg = ((zzbp) zza2.zzak()).zzav();
        }
        return zzia.zza(zzg, true);
    }

    public static Vector zzb(byte[] bArr, int i7) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i10 = length + 254;
        Vector vector = new Vector();
        for (int i11 = 0; i11 < i10 / 255; i11++) {
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
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzid(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        r1.reset();
        r1.update(r6);
        r6 = com.google.ads.interactivemedia.v3.internal.zzie.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] zze(byte[] bArr) {
        byte[] digest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zzd();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
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

    public static zzbc zzf(int i7) {
        zzaf zza2 = zzbc.zza();
        zza2.zzD(4096L);
        return (zzbc) zza2.zzak();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z8) {
        byte[] array;
        int length = bArr.length;
        int i7 = true != z8 ? 255 : 239;
        if (length > i7) {
            bArr = zzf(4096).zzav();
        }
        int length2 = bArr.length;
        if (length2 < i7) {
            byte[] bArr2 = new byte[i7 - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i7 + 1).put((byte) length2).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i7 + 1).put((byte) length2).put(bArr).array();
        }
        if (z8) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzif[] zzifVarArr = new zzje().zzcG;
        int length3 = zzifVarArr.length;
        for (int i10 = 0; i10 < 12; i10++) {
            zzifVarArr[i10].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzacz(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
