package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzakg extends zzajm {
    private static final Logger zza = Logger.getLogger(zzakg.class.getName());
    private static final boolean zzb = zzanp.zzc();
    zzakj zze;

    /* loaded from: classes.dex */
    public static abstract class zza extends zzakg {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        public zza(int i7) {
            super();
            if (i7 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i7, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zza(byte b2) {
            int i7 = this.zzc;
            this.zza[i7] = b2;
            this.zzc = i7 + 1;
            this.zzd++;
        }

        public final void zza(int i7) {
            int i10 = this.zzc;
            byte[] bArr = this.zza;
            bArr[i10] = (byte) i7;
            bArr[i10 + 1] = (byte) (i7 >> 8);
            bArr[i10 + 2] = (byte) (i7 >> 16);
            bArr[i10 + 3] = i7 >> 24;
            this.zzc = i10 + 4;
            this.zzd += 4;
        }

        public final void zza(int i7, int i10) {
            zzb((i7 << 3) | i10);
        }

        public final void zza(long j) {
            int i7 = this.zzc;
            byte[] bArr = this.zza;
            bArr[i7] = (byte) j;
            bArr[i7 + 1] = (byte) (j >> 8);
            bArr[i7 + 2] = (byte) (j >> 16);
            bArr[i7 + 3] = (byte) (j >> 24);
            bArr[i7 + 4] = (byte) (j >> 32);
            bArr[i7 + 5] = (byte) (j >> 40);
            bArr[i7 + 6] = (byte) (j >> 48);
            bArr[i7 + 7] = (byte) (j >> 56);
            this.zzc = i7 + 8;
            this.zzd += 8;
        }

        public final void zzb(int i7) {
            if (!zzakg.zzb) {
                while ((i7 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    bArr[i10] = (byte) (i7 | 128);
                    this.zzd++;
                    i7 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr2[i11] = (byte) i7;
                this.zzd++;
                return;
            }
            long j = this.zzc;
            while ((i7 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzanp.zza(bArr3, i12, (byte) (i7 | 128));
                i7 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            zzanp.zza(bArr4, i13, (byte) i7);
            this.zzd += (int) (this.zzc - j);
        }

        public final void zzb(long j) {
            if (!zzakg.zzb) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i7 = this.zzc;
                    this.zzc = i7 + 1;
                    bArr[i7] = (byte) (((int) j) | 128);
                    this.zzd++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                bArr2[i10] = (byte) j;
                this.zzd++;
                return;
            }
            long j10 = this.zzc;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzanp.zza(bArr3, i11, (byte) (((int) j) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            zzanp.zza(bArr4, i12, (byte) j);
            this.zzd += (int) (this.zzc - j10);
        }
    }

    /* loaded from: classes.dex */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(int i7, int i10, int i11, Throwable th) {
            this(i7, i10, i11, th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private zzb(long j, long j10, int i7, Throwable th) {
            this(r3.toString(), th);
            Locale locale = Locale.US;
            StringBuilder l10 = c.l(j, "Pos: ", ", limit: ");
            l10.append(j10);
            l10.append(", len: ");
            l10.append(i7);
        }

        private zzb(String str, Throwable th) {
            super(c.t("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* loaded from: classes.dex */
    public static class zzc extends zzakg {
        private final byte[] zza;
        private final int zzb;
        private int zzc;

        public zzc(byte[] bArr, int i7, int i10) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i10) | i10) < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(c.e(bArr.length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            }
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i10;
        }

        private final void zzc(byte[] bArr, int i7, int i10) {
            try {
                System.arraycopy(bArr, i7, this.zza, this.zzc, i10);
                this.zzc += i10;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(this.zzc, this.zzb, i10, (Throwable) e2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final int zza() {
            return this.zzb - this.zzc;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
        public final void zza(byte[] bArr, int i7, int i10) {
            zzc(bArr, i7, i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte b2) {
            int i7 = this.zzc;
            try {
                int i10 = i7 + 1;
                try {
                    this.zza[i7] = b2;
                    this.zzc = i10;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i7 = i10;
                    throw new zzb(i7, this.zzb, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i7, zzamc zzamcVar) {
            zzk(1, 3);
            zzl(2, i7);
            zzk(3, 2);
            zzc(zzamcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i7, String str) {
            zzk(i7, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i7, boolean z8) {
            zzk(i7, 0);
            zzb(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzajp zzajpVar) {
            zzn(zzajpVar.zzb());
            zzajpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzamc zzamcVar, zzamv zzamvVar) {
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza((zzamv) zzamcVar, (zzaof) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(String str) {
            int i7 = this.zzc;
            try {
                int zzj = zzakg.zzj(str.length() * 3);
                int zzj2 = zzakg.zzj(str.length());
                if (zzj2 != zzj) {
                    zzn(zzant.zza(str));
                    this.zzc = zzant.zza(str, this.zza, this.zzc, zza());
                    return;
                }
                int i10 = i7 + zzj2;
                this.zzc = i10;
                int zza = zzant.zza(str, this.zza, i10, zza());
                this.zzc = i7;
                zzn((zza - i7) - zzj2);
                this.zzc = zza;
            } catch (zzanx e2) {
                this.zzc = i7;
                zza(str, e2);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte[] bArr, int i7, int i10) {
            zzn(i10);
            zzc(bArr, 0, i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i7, zzajp zzajpVar) {
            zzk(i7, 2);
            zzb(zzajpVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i7, zzamc zzamcVar, zzamv zzamvVar) {
            zzk(i7, 2);
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza((zzamv) zzamcVar, (zzaof) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(zzamc zzamcVar) {
            zzn(zzamcVar.zzl());
            zzamcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzd(int i7, zzajp zzajpVar) {
            zzk(1, 3);
            zzl(2, i7);
            zzc(3, zzajpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzf(int i7, long j) {
            zzk(i7, 1);
            zzh(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i7, int i10) {
            zzk(i7, 5);
            zzk(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i7, long j) {
            zzk(i7, 0);
            zzj(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(long j) {
            int i7 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i7] = (byte) j;
                bArr[i7 + 1] = (byte) (j >> 8);
                bArr[i7 + 2] = (byte) (j >> 16);
                bArr[i7 + 3] = (byte) (j >> 24);
                bArr[i7 + 4] = (byte) (j >> 32);
                bArr[i7 + 5] = (byte) (j >> 40);
                bArr[i7 + 6] = (byte) (j >> 48);
                bArr[i7 + 7] = (byte) (j >> 56);
                this.zzc = i7 + 8;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(i7, this.zzb, 8, (Throwable) e2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzi(int i7, int i10) {
            zzk(i7, 0);
            zzl(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzj(long j) {
            int i7;
            int i10;
            int i11 = this.zzc;
            if (!zzakg.zzb || zza() < 10) {
                while ((j & (-128)) != 0) {
                    try {
                        i10 = i11 + 1;
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                    }
                    try {
                        this.zza[i11] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i11 = i10;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        i11 = i10;
                        throw new zzb(i11, this.zzb, 1, (Throwable) e);
                    }
                }
                i7 = i11 + 1;
                try {
                    this.zza[i11] = (byte) j;
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    i11 = i7;
                    throw new zzb(i11, this.zzb, 1, (Throwable) e);
                }
            } else {
                while ((j & (-128)) != 0) {
                    zzanp.zza(this.zza, i11, (byte) (((int) j) | 128));
                    j >>>= 7;
                    i11++;
                }
                i7 = i11 + 1;
                zzanp.zza(this.zza, i11, (byte) j);
            }
            this.zzc = i7;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i7) {
            int i10 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i10] = (byte) i7;
                bArr[i10 + 1] = (byte) (i7 >> 8);
                bArr[i10 + 2] = (byte) (i7 >> 16);
                bArr[i10 + 3] = i7 >> 24;
                this.zzc = i10 + 4;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(i10, this.zzb, 4, (Throwable) e2);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i7, int i10) {
            zzn((i7 << 3) | i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i7) {
            if (i7 >= 0) {
                zzn(i7);
            } else {
                zzj(i7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i7, int i10) {
            zzk(i7, 0);
            zzn(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzn(int i7) {
            int i10;
            int i11 = this.zzc;
            while ((i7 & (-128)) != 0) {
                try {
                    i10 = i11 + 1;
                    try {
                        this.zza[i11] = (byte) (i7 | 128);
                        i7 >>>= 7;
                        i11 = i10;
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                        i11 = i10;
                        throw new zzb(i11, this.zzb, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    throw new zzb(i11, this.zzb, 1, (Throwable) e);
                }
            }
            i10 = i11 + 1;
            this.zza[i11] = (byte) i7;
            this.zzc = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class zzd extends zza {
        private final OutputStream zzf;

        public zzd(OutputStream outputStream, int i7) {
            super(i7);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zzc(byte[] bArr, int i7, int i10) {
            int i11 = this.zzb;
            int i12 = this.zzc;
            if (i11 - i12 >= i10) {
                System.arraycopy(bArr, i7, this.zza, i12, i10);
                this.zzc += i10;
            } else {
                int i13 = i11 - i12;
                System.arraycopy(bArr, i7, this.zza, i12, i13);
                int i14 = i7 + i13;
                i10 -= i13;
                this.zzc = this.zzb;
                this.zzd += i13;
                zze();
                if (i10 <= this.zzb) {
                    System.arraycopy(bArr, i14, this.zza, 0, i10);
                    this.zzc = i10;
                } else {
                    this.zzf.write(bArr, i14, i10);
                }
            }
            this.zzd += i10;
        }

        private final void zze() {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i7) {
            if (this.zzb - this.zzc < i7) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
        public final void zza(byte[] bArr, int i7, int i10) {
            zzc(bArr, i7, i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte b2) {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i7, zzamc zzamcVar) {
            zzk(1, 3);
            zzl(2, i7);
            zzk(3, 2);
            zzc(zzamcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i7, String str) {
            zzk(i7, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i7, boolean z8) {
            zzo(11);
            zza(i7, 0);
            zza(z8 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzajp zzajpVar) {
            zzn(zzajpVar.zzb());
            zzajpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzamc zzamcVar, zzamv zzamvVar) {
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza((zzamv) zzamcVar, (zzaof) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(String str) {
            int zza;
            try {
                int length = str.length() * 3;
                int zzj = zzakg.zzj(length);
                int i7 = zzj + length;
                int i10 = this.zzb;
                if (i7 > i10) {
                    byte[] bArr = new byte[length];
                    int zza2 = zzant.zza(str, bArr, 0, length);
                    zzn(zza2);
                    zza(bArr, 0, zza2);
                    return;
                }
                if (i7 > i10 - this.zzc) {
                    zze();
                }
                int zzj2 = zzakg.zzj(str.length());
                int i11 = this.zzc;
                try {
                    if (zzj2 == zzj) {
                        int i12 = i11 + zzj2;
                        this.zzc = i12;
                        int zza3 = zzant.zza(str, this.zza, i12, this.zzb - i12);
                        this.zzc = i11;
                        zza = (zza3 - i11) - zzj2;
                        zzb(zza);
                        this.zzc = zza3;
                    } else {
                        zza = zzant.zza(str);
                        zzb(zza);
                        this.zzc = zzant.zza(str, this.zza, this.zzc, zza);
                    }
                    this.zzd += zza;
                } catch (zzanx e2) {
                    this.zzd -= this.zzc - i11;
                    this.zzc = i11;
                    throw e2;
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new zzb(e10);
                }
            } catch (zzanx e11) {
                zza(str, e11);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte[] bArr, int i7, int i10) {
            zzn(i10);
            zzc(bArr, 0, i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc() {
            if (this.zzc > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i7, zzajp zzajpVar) {
            zzk(i7, 2);
            zzb(zzajpVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i7, zzamc zzamcVar, zzamv zzamvVar) {
            zzk(i7, 2);
            zzb(zzamcVar, zzamvVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(zzamc zzamcVar) {
            zzn(zzamcVar.zzl());
            zzamcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzd(int i7, zzajp zzajpVar) {
            zzk(1, 3);
            zzl(2, i7);
            zzc(3, zzajpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzf(int i7, long j) {
            zzo(18);
            zza(i7, 1);
            zza(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i7, int i10) {
            zzo(14);
            zza(i7, 5);
            zza(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i7, long j) {
            zzo(20);
            zza(i7, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(long j) {
            zzo(8);
            zza(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzi(int i7, int i10) {
            zzo(20);
            zza(i7, 0);
            if (i10 >= 0) {
                zzb(i10);
            } else {
                zzb(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzj(long j) {
            zzo(10);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i7) {
            zzo(4);
            zza(i7);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i7, int i10) {
            zzn((i7 << 3) | i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i7) {
            if (i7 >= 0) {
                zzn(i7);
            } else {
                zzj(i7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i7, int i10) {
            zzo(20);
            zza(i7, 0);
            zzb(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzn(int i7) {
            zzo(5);
            zzb(i7);
        }
    }

    private zzakg() {
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zza(float f4) {
        return 4;
    }

    private static int zza(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public static int zza(int i7, double d10) {
        return zzj(i7 << 3) + 8;
    }

    public static int zza(int i7, float f4) {
        return zzj(i7 << 3) + 4;
    }

    public static int zza(int i7, long j) {
        return zzj(i7 << 3) + 8;
    }

    public static int zza(int i7, zzajp zzajpVar) {
        int zzj = zzj(i7 << 3);
        int zzb2 = zzajpVar.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zza(int i7, zzalk zzalkVar) {
        return zzb(3, zzalkVar) + zzg(2, i7) + (zzj(8) << 1);
    }

    public static int zza(int i7, zzamc zzamcVar) {
        return zzb(zzamcVar) + zzj(24) + zzg(2, i7) + (zzj(8) << 1);
    }

    @Deprecated
    public static int zza(int i7, zzamc zzamcVar, zzamv zzamvVar) {
        return ((zzajf) zzamcVar).zza(zzamvVar) + (zzj(i7 << 3) << 1);
    }

    public static int zza(int i7, String str) {
        return zza(str) + zzj(i7 << 3);
    }

    public static int zza(int i7, boolean z8) {
        return zzj(i7 << 3) + 1;
    }

    public static int zza(zzajp zzajpVar) {
        int zzb2 = zzajpVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zza(zzalk zzalkVar) {
        int zza2 = zzalkVar.zza();
        return zzj(zza2) + zza2;
    }

    @Deprecated
    public static int zza(zzamc zzamcVar) {
        return zzamcVar.zzl();
    }

    public static int zza(zzamc zzamcVar, zzamv zzamvVar) {
        int zza2 = ((zzajf) zzamcVar).zza(zzamvVar);
        return zzj(zza2) + zza2;
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzant.zza(str);
        } catch (zzanx unused) {
            length = str.getBytes(zzalb.zza).length;
        }
        return zzj(length) + length;
    }

    public static int zza(boolean z8) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    private static long zza(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static zzakg zza(OutputStream outputStream, int i7) {
        return new zzd(outputStream, i7);
    }

    public static int zzb(int i7, int i10) {
        return zzg(i10) + zzj(i7 << 3);
    }

    public static int zzb(int i7, long j) {
        return zzg(j) + zzj(i7 << 3);
    }

    public static int zzb(int i7, zzajp zzajpVar) {
        return zza(3, zzajpVar) + zzg(2, i7) + (zzj(8) << 1);
    }

    public static int zzb(int i7, zzalk zzalkVar) {
        int zzj = zzj(i7 << 3);
        int zza2 = zzalkVar.zza();
        return zzj(zza2) + zza2 + zzj;
    }

    public static int zzb(int i7, zzamc zzamcVar, zzamv zzamvVar) {
        return zza(zzamcVar, zzamvVar) + zzj(i7 << 3);
    }

    public static int zzb(zzamc zzamcVar) {
        int zzl = zzamcVar.zzl();
        return zzj(zzl) + zzl;
    }

    public static zzakg zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zzc(int i7) {
        return zzg(i7);
    }

    public static int zzc(int i7, int i10) {
        return zzj(i7 << 3) + 4;
    }

    public static int zzc(int i7, long j) {
        return zzj(i7 << 3) + 8;
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zzd(int i7) {
        return 4;
    }

    public static int zzd(int i7, int i10) {
        return zzg(i10) + zzj(i7 << 3);
    }

    public static int zzd(int i7, long j) {
        return zzg(zza(j)) + zzj(i7 << 3);
    }

    public static int zzd(long j) {
        return zzg(j);
    }

    public static int zze(int i7) {
        return zzg(i7);
    }

    public static int zze(int i7, int i10) {
        return zzj(i7 << 3) + 4;
    }

    public static int zze(int i7, long j) {
        return zzg(j) + zzj(i7 << 3);
    }

    public static int zze(long j) {
        return 8;
    }

    public static int zzf(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    public static int zzf(int i7, int i10) {
        return zzj(zza(i10)) + zzj(i7 << 3);
    }

    public static int zzf(long j) {
        return zzg(zza(j));
    }

    public static int zzg(int i7) {
        return 4;
    }

    public static int zzg(int i7, int i10) {
        return zzj(i10) + zzj(i7 << 3);
    }

    public static int zzg(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzh(int i7) {
        return zzj(zza(i7));
    }

    public static int zzi(int i7) {
        return zzj(i7 << 3);
    }

    public static int zzj(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public abstract int zza();

    public final void zza(String str, zzanx zzanxVar) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzanxVar);
        byte[] bytes = str.getBytes(zzalb.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzb(byte b2);

    public final void zzb(double d10) {
        zzh(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(float f4) {
        zzk(Float.floatToRawIntBits(f4));
    }

    public final void zzb(int i7, double d10) {
        zzf(i7, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i7, float f4) {
        zzh(i7, Float.floatToRawIntBits(f4));
    }

    public abstract void zzb(int i7, zzamc zzamcVar);

    public abstract void zzb(int i7, String str);

    public abstract void zzb(int i7, boolean z8);

    public abstract void zzb(zzajp zzajpVar);

    public abstract void zzb(zzamc zzamcVar, zzamv zzamvVar);

    public abstract void zzb(String str);

    public final void zzb(boolean z8) {
        zzb(z8 ? (byte) 1 : (byte) 0);
    }

    public abstract void zzb(byte[] bArr, int i7, int i10);

    public abstract void zzc();

    public abstract void zzc(int i7, zzajp zzajpVar);

    public abstract void zzc(int i7, zzamc zzamcVar, zzamv zzamvVar);

    public abstract void zzc(zzamc zzamcVar);

    public abstract void zzd(int i7, zzajp zzajpVar);

    public abstract void zzf(int i7, long j);

    public final void zzg(int i7, long j) {
        zzh(i7, zza(j));
    }

    public abstract void zzh(int i7, int i10);

    public abstract void zzh(int i7, long j);

    public abstract void zzh(long j);

    public abstract void zzi(int i7, int i10);

    public final void zzi(long j) {
        zzj(zza(j));
    }

    public final void zzj(int i7, int i10) {
        zzl(i7, zza(i10));
    }

    public abstract void zzj(long j);

    public abstract void zzk(int i7);

    public abstract void zzk(int i7, int i10);

    public abstract void zzl(int i7);

    public abstract void zzl(int i7, int i10);

    public final void zzm(int i7) {
        zzn(zza(i7));
    }

    public abstract void zzn(int i7);
}
