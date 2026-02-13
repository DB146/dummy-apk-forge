package com.google.android.gms.internal.fido;

import X.c;
import h3.o;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class zzdu implements Closeable {
    private final InputStream zza;
    private zzdt zzb;
    private final byte[] zzc = new byte[8];
    private final zzdv zzd = zzdv.zza();

    public zzdu(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() {
        if (this.zzb.zza() < 24) {
            long zza = this.zzb.zza();
            this.zzb = null;
            return zza;
        }
        if (this.zzb.zza() == 24) {
            int read = this.zza.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.zzb = null;
            return read & 255;
        }
        if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            byte[] bArr2 = this.zzc;
            long j = bArr2[0];
            long j10 = bArr2[1];
            return (bArr2[3] & 255) | ((j10 & 255) << 16) | ((j & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.zzb.zza() != 27) {
            throw new IOException(c.e(this.zzb.zza(), this.zzb.zzc(), "invalid additional information ", " for major type "));
        }
        zzk(this.zzc, 8);
        byte[] bArr3 = this.zzc;
        long j11 = bArr3[0];
        long j12 = bArr3[1];
        long j13 = bArr3[2];
        return (bArr3[7] & 255) | ((bArr3[6] & 255) << 8) | ((j12 & 255) << 48) | ((j11 & 255) << 56) | ((j13 & 255) << 40) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16);
    }

    private final void zzi() {
        zzd();
        if (this.zzb.zza() == 31) {
            throw new IllegalStateException(o.l(this.zzb.zza(), "expected definite length but found "));
        }
    }

    private final void zzj(byte b2) {
        zzd();
        if (this.zzb.zzb() != b2) {
            throw new IllegalStateException(c.e((b2 >> 5) & 7, this.zzb.zzc(), "expected major type ", " but found "));
        }
    }

    private final void zzk(byte[] bArr, int i7) {
        int i10 = 0;
        while (i10 != i7) {
            int read = this.zza.read(bArr, i10, i7 - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
        this.zzb = null;
    }

    private final byte[] zzl() {
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.zza.available() < zzh) {
            throw new EOFException();
        }
        int i7 = (int) zzh;
        byte[] bArr = new byte[i7];
        zzk(bArr, i7);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        if (zzh < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh);
        }
        return zzh;
    }

    public final long zzb() {
        boolean z8;
        zzd();
        if (this.zzb.zzb() == 0) {
            z8 = true;
        } else {
            if (this.zzb.zzb() != 32) {
                throw new IllegalStateException(o.l(this.zzb.zzc(), "expected major type 0 or 1 but found "));
            }
            z8 = false;
        }
        long zzh = zzh();
        if (zzh >= 0) {
            return z8 ? zzh : ~zzh;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long zzc() {
        zzj((byte) -96);
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh + zzh);
        }
        return zzh;
    }

    public final zzdt zzd() {
        if (this.zzb == null) {
            int read = this.zza.read();
            if (read == -1) {
                this.zzd.zzb();
                return null;
            }
            zzdt zzdtVar = new zzdt(read);
            this.zzb = zzdtVar;
            byte zzb = zzdtVar.zzb();
            if (zzb != Byte.MIN_VALUE && zzb != -96 && zzb != -64) {
                if (zzb != -32) {
                    if (zzb != 0 && zzb != 32) {
                        if (zzb == 64) {
                            this.zzd.zze(-1L);
                        } else {
                            if (zzb != 96) {
                                throw new IllegalStateException(o.l(this.zzb.zzc(), "invalid major type: "));
                            }
                            this.zzd.zze(-2L);
                        }
                        this.zzd.zzf();
                    }
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
            }
            this.zzd.zzd();
            this.zzd.zzf();
        }
        return this.zzb;
    }

    public final String zze() {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int zzh = (int) zzh();
        if (zzh == 20) {
            return false;
        }
        if (zzh == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final byte[] zzg() {
        zzj((byte) 64);
        return zzl();
    }
}
