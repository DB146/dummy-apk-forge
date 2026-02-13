package com.google.ads.interactivemedia.v3.internal;

import X.c;
import android.util.Pair;
import h3.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import y.S;

/* loaded from: classes.dex */
public final class zzi {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static X509Certificate[][] zza(String str) {
        ?? r22;
        String str2 = "end > capacity: ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzj.zzc(randomAccessFile);
            try {
                if (zzc == null) {
                    throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j = longValue - 20;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzf("ZIP64 APK not supported");
                    }
                }
                long zza = zzj.zza(byteBuffer);
                if (zza >= longValue) {
                    throw new zzf("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                }
                if (zzj.zzb(byteBuffer) + zza != longValue) {
                    throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (zza < 32) {
                    throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                randomAccessFile.seek(zza - allocate.capacity());
                randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) == 2334950737559900225L) {
                    if (allocate.getLong(16) == 3617552046287187010L) {
                        try {
                            long j10 = allocate.getLong(0);
                            if (j10 < allocate.capacity() || j10 > 2147483639) {
                                throw new zzf("APK Signing Block size out of range: " + j10);
                            }
                            int i7 = (int) (8 + j10);
                            long j11 = zza - i7;
                            ?? r12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                            try {
                                if (r12 < 0) {
                                    throw new zzf("APK Signing Block offset out of range: " + j11);
                                }
                                try {
                                    ByteBuffer allocate2 = ByteBuffer.allocate(i7);
                                    allocate2.order(byteOrder);
                                    r12 = randomAccessFile;
                                    r12.seek(j11);
                                    r12.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                    long j12 = allocate2.getLong(0);
                                    if (j12 != j10) {
                                        throw new zzf("APK Signing Block sizes in header and footer do not match: " + j12 + " vs " + j10);
                                    }
                                    Pair create = Pair.create(allocate2, Long.valueOf(j11));
                                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                    long longValue2 = ((Long) create.second).longValue();
                                    if (byteBuffer2.order() != byteOrder) {
                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                    }
                                    int capacity = byteBuffer2.capacity() - 24;
                                    if (capacity < 8) {
                                        throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                    }
                                    int capacity2 = byteBuffer2.capacity();
                                    if (capacity > byteBuffer2.capacity()) {
                                        throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                    }
                                    int limit = byteBuffer2.limit();
                                    int position = byteBuffer2.position();
                                    try {
                                        byteBuffer2.position(0);
                                        byteBuffer2.limit(capacity);
                                        byteBuffer2.position(8);
                                        ByteBuffer slice = byteBuffer2.slice();
                                        slice.order(byteBuffer2.order());
                                        byteBuffer2.position(0);
                                        byteBuffer2.limit(limit);
                                        byteBuffer2.position(position);
                                        int i10 = 0;
                                        while (slice.hasRemaining()) {
                                            i10++;
                                            if (slice.remaining() < 8) {
                                                throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i10);
                                            }
                                            long j13 = slice.getLong();
                                            if (j13 < 4 || j13 > 2147483647L) {
                                                throw new zzf("APK Signing Block entry #" + i10 + " size out of range: " + j13);
                                            }
                                            int i11 = (int) j13;
                                            int position2 = slice.position() + i11;
                                            if (i11 > slice.remaining()) {
                                                throw new zzf("APK Signing Block entry #" + i10 + " size out of range: " + i11 + ", available: " + slice.remaining());
                                            }
                                            if (slice.getInt() == 1896449818) {
                                                X509Certificate[][] zzl = zzl(r12.getChannel(), new zze(zze(slice, i11 - 4), longValue2, zza, longValue, byteBuffer, null));
                                                r12.close();
                                                try {
                                                    r12.close();
                                                } catch (IOException unused) {
                                                }
                                                return zzl;
                                            }
                                            long j14 = zza;
                                            long j15 = longValue;
                                            slice.position(position2);
                                            longValue = j15;
                                            zza = j14;
                                        }
                                        throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
                                    } catch (Throwable th) {
                                        byteBuffer2.position(0);
                                        byteBuffer2.limit(limit);
                                        byteBuffer2.position(position);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = randomAccessFile;
                                    r22 = r12;
                                    try {
                                        r22.close();
                                    } catch (IOException unused2) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r22 = r12;
                                r22.close();
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r22 = randomAccessFile;
                        }
                    }
                }
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            } catch (Throwable th5) {
                th = th5;
                r22 = str2;
            }
        } catch (Throwable th6) {
            th = th6;
            r22 = randomAccessFile;
        }
    }

    private static int zzb(int i7) {
        if (i7 == 1) {
            return 32;
        }
        if (i7 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(o.l(i7, "Unknown content digest algorthm: "));
    }

    private static int zzc(int i7) {
        if (i7 == 513) {
            return 1;
        }
        if (i7 == 514) {
            return 2;
        }
        if (i7 == 769) {
            return 1;
        }
        switch (i7) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
        }
    }

    private static String zzd(int i7) {
        if (i7 == 1) {
            return "SHA-256";
        }
        if (i7 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(o.l(i7, "Unknown content digest algorthm: "));
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i7) {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i10 = i7 + position;
        if (i10 < position || i10 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i10);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i10);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(o.l(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i7 <= byteBuffer.remaining()) {
            return zze(byteBuffer, i7);
        }
        throw new IOException(c.e(i7, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    private static void zzg(int i7, byte[] bArr, int i10) {
        bArr[1] = (byte) (i7 & 255);
        bArr[2] = (byte) ((i7 >>> 8) & 255);
        bArr[3] = (byte) ((i7 >>> 16) & 255);
        bArr[4] = (byte) (i7 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j10, long j11, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzc zzcVar = new zzc(fileChannel, 0L, j);
        zzc zzcVar2 = new zzc(fileChannel, j10, j11 - j10);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzj.zzd(duplicate, j);
        zza zzaVar = new zza(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Integer) it.next()).intValue();
            i7++;
        }
        try {
            byte[][] zzk = zzk(iArr, new zzb[]{zzcVar, zzcVar2, zzaVar});
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = iArr[i10];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i11)), zzk[i10])) {
                    throw new SecurityException(zzd(i11).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e2) {
            throw new SecurityException("Failed to compute digest(s) of contents", e2);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) {
        int i7 = byteBuffer.getInt();
        if (i7 < 0) {
            throw new IOException("Negative length");
        }
        if (i7 > byteBuffer.remaining()) {
            throw new IOException(c.e(i7, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i7];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = zzc(r6);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r11 == 1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r12 == 1) goto L141;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) {
        String str;
        Pair create;
        ByteBuffer zzf = zzf(byteBuffer);
        ByteBuffer zzf2 = zzf(byteBuffer);
        byte[] zzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i7 = -1;
        int i10 = 0;
        while (zzf2.hasRemaining()) {
            i10++;
            try {
                ByteBuffer zzf3 = zzf(zzf2);
                if (zzf3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i11 = zzf3.getInt();
                arrayList.add(Integer.valueOf(i11));
                if (i11 != 513 && i11 != 514 && i11 != 769) {
                    switch (i11) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                bArr2 = zzi(zzf3);
                i7 = i11;
            } catch (IOException e2) {
                e = e2;
                throw new SecurityException(o.l(i10, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e10) {
                e = e10;
                throw new SecurityException(o.l(i10, "Failed to parse signature record #"), e);
            }
        }
        if (i7 == -1) {
            if (i10 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i7 == 513 || i7 == 514) {
            str = "EC";
        } else if (i7 != 769) {
            switch (i7) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
            }
        } else {
            str = "DSA";
        }
        if (i7 == 513) {
            create = Pair.create("SHA256withECDSA", null);
        } else if (i7 == 514) {
            create = Pair.create("SHA512withECDSA", null);
        } else if (i7 != 769) {
            switch (i7) {
                case 257:
                    create = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    create = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    create = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    create = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i7))));
            }
        } else {
            create = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) create.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) create.second;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(zzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(generatePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(zzf);
            if (!signature.verify(bArr2)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            zzf.clear();
            ByteBuffer zzf4 = zzf(zzf);
            ArrayList arrayList2 = new ArrayList();
            int i12 = 0;
            while (zzf4.hasRemaining()) {
                i12++;
                try {
                    ByteBuffer zzf5 = zzf(zzf4);
                    if (zzf5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i13 = zzf5.getInt();
                    arrayList2.add(Integer.valueOf(i13));
                    if (i13 == i7) {
                        bArr = zzi(zzf5);
                    }
                } catch (IOException e11) {
                    e = e11;
                    throw new IOException(o.l(i12, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e12) {
                    e = e12;
                    throw new IOException(o.l(i12, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int zzc = zzc(i7);
            byte[] bArr3 = (byte[]) map.put(Integer.valueOf(zzc), bArr);
            if (bArr3 != null && !MessageDigest.isEqual(bArr3, bArr)) {
                throw new SecurityException(zzd(zzc).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer zzf6 = zzf(zzf);
            ArrayList arrayList3 = new ArrayList();
            int i14 = 0;
            while (zzf6.hasRemaining()) {
                i14++;
                byte[] zzi2 = zzi(zzf6);
                try {
                    arrayList3.add(new zzg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)), zzi2));
                } catch (CertificateException e13) {
                    throw new SecurityException(o.l(i14, "Failed to decode certificate #"), e13);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(zzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e14) {
            e = e14;
            throw new SecurityException(S.b("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e15) {
            e = e15;
            throw new SecurityException(S.b("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e16) {
            e = e16;
            throw new SecurityException(S.b("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e17) {
            e = e17;
            throw new SecurityException(S.b("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e18) {
            e = e18;
            throw new SecurityException(S.b("Failed to verify ", str2, " signature"), e);
        }
    }

    private static byte[][] zzk(int[] iArr, zzb[] zzbVarArr) {
        long j;
        int i7;
        int length;
        int i10 = 0;
        long j10 = 0;
        int i11 = 0;
        long j11 = 0;
        while (true) {
            j = 1048576;
            if (i11 >= 3) {
                break;
            }
            j11 += (zzbVarArr[i11].zza() + 1048575) / 1048576;
            i11++;
        }
        if (j11 >= 2097151) {
            throw new DigestException(A3.c.h("Too many chunks: ", j11));
        }
        byte[][] bArr = new byte[iArr.length];
        int i12 = 0;
        while (true) {
            length = iArr.length;
            if (i12 >= length) {
                break;
            }
            int i13 = (int) j11;
            byte[] bArr2 = new byte[(zzb(iArr[i12]) * i13) + 5];
            bArr2[0] = 90;
            zzg(i13, bArr2, 1);
            bArr[i12] = bArr2;
            i12++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            String zzd = zzd(iArr[i14]);
            try {
                messageDigestArr[i14] = MessageDigest.getInstance(zzd);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(zzd.concat(" digest not supported"), e2);
            }
        }
        int i15 = 0;
        int i16 = 0;
        for (i7 = 3; i15 < i7; i7 = 3) {
            zzb zzbVar = zzbVarArr[i15];
            long j12 = j10;
            long zza = zzbVar.zza();
            while (zza > j10) {
                int min = (int) Math.min(zza, j);
                zzg(min, bArr3, 1);
                for (int i17 = 0; i17 < length; i17++) {
                    messageDigestArr[i17].update(bArr3);
                }
                long j13 = j12;
                try {
                    zzbVar.zzb(messageDigestArr, j13, min);
                    byte[] bArr4 = bArr3;
                    int i18 = 0;
                    while (i18 < iArr.length) {
                        int i19 = iArr[i18];
                        zzb zzbVar2 = zzbVar;
                        byte[] bArr5 = bArr[i18];
                        int zzb = zzb(i19);
                        int i20 = length;
                        MessageDigest messageDigest = messageDigestArr[i18];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i16 * zzb) + 5, zzb);
                        if (digest != zzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i18++;
                        zzbVar = zzbVar2;
                        length = i20;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j14 = min;
                    long j15 = j13 + j14;
                    zza -= j14;
                    i16++;
                    j10 = 0;
                    j = 1048576;
                    bArr3 = bArr4;
                    j12 = j15;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e10) {
                    throw new DigestException(c.e(i16, i10, "Failed to digest chunk #", " of section #"), e10);
                }
            }
            i10++;
            i15++;
            j10 = 0;
            j = 1048576;
        }
        byte[][] bArr6 = new byte[iArr.length];
        for (int i21 = 0; i21 < iArr.length; i21++) {
            int i22 = iArr[i21];
            byte[] bArr7 = bArr[i21];
            String zzd2 = zzd(i22);
            try {
                bArr6[i21] = MessageDigest.getInstance(zzd2).digest(bArr7);
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(zzd2.concat(" digest not supported"), e11);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zze zzeVar) {
        ByteBuffer byteBuffer;
        long j;
        long j10;
        long j11;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzeVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i7 = 0;
                while (zzf.hasRemaining()) {
                    i7++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e2) {
                        throw new SecurityException(A3.c.f(i7, "Failed to parse/verify signer #", " block"), e2);
                    }
                }
                if (i7 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                j = zzeVar.zzb;
                j10 = zzeVar.zzc;
                j11 = zzeVar.zzd;
                byteBuffer2 = zzeVar.zze;
                zzh(hashMap, fileChannel, j, j10, j11, byteBuffer2);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
            } catch (IOException e10) {
                throw new SecurityException("Failed to read list of signers", e10);
            }
        } catch (CertificateException e11) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e11);
        }
    }
}
