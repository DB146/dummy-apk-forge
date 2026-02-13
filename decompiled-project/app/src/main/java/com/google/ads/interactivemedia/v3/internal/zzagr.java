package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.f;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzagr extends zzadr {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, f.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzadr zzd;
    private final zzadr zze;
    private final int zzf;
    private final int zzg;

    private zzagr(zzadr zzadrVar, zzadr zzadrVar2) {
        this.zzd = zzadrVar;
        this.zze = zzadrVar2;
        int zzd = zzadrVar.zzd();
        this.zzf = zzd;
        this.zzc = zzadrVar2.zzd() + zzd;
        this.zzg = Math.max(zzadrVar.zzf(), zzadrVar2.zzf()) + 1;
    }

    private static zzadr zzA(zzadr zzadrVar, zzadr zzadrVar2) {
        int zzd = zzadrVar.zzd();
        int zzd2 = zzadrVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzadrVar.zzw(bArr, 0, 0, zzd);
        zzadrVar2.zzw(bArr, 0, zzd, zzd2);
        return new zzado(bArr);
    }

    public static int zzc(int i7) {
        int[] iArr = zza;
        int length = iArr.length;
        return i7 >= 47 ? f.API_PRIORITY_OTHER : iArr[i7];
    }

    public static zzadr zzz(zzadr zzadrVar, zzadr zzadrVar2) {
        if (zzadrVar2.zzd() == 0) {
            return zzadrVar;
        }
        if (zzadrVar.zzd() == 0) {
            return zzadrVar2;
        }
        int zzd = zzadrVar2.zzd() + zzadrVar.zzd();
        if (zzd < 128) {
            return zzA(zzadrVar, zzadrVar2);
        }
        if (zzadrVar instanceof zzagr) {
            zzagr zzagrVar = (zzagr) zzadrVar;
            if (zzadrVar2.zzd() + zzagrVar.zze.zzd() < 128) {
                return new zzagr(zzagrVar.zzd, zzA(zzagrVar.zze, zzadrVar2));
            }
            if (zzagrVar.zzd.zzf() > zzagrVar.zze.zzf() && zzagrVar.zzg > zzadrVar2.zzf()) {
                return new zzagr(zzagrVar.zzd, new zzagr(zzagrVar.zze, zzadrVar2));
            }
        }
        return zzd >= zzc(Math.max(zzadrVar.zzf(), zzadrVar2.zzf()) + 1) ? new zzagr(zzadrVar, zzadrVar2) : zzagn.zza(new zzagn(null), zzadrVar, zzadrVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzadr)) {
            return false;
        }
        zzadr zzadrVar = (zzadr) obj;
        if (this.zzc != zzadrVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzq = zzq();
        int zzq2 = zzadrVar.zzq();
        if (zzq != 0 && zzq2 != 0 && zzq != zzq2) {
            return false;
        }
        zzago zzagoVar = null;
        zzagp zzagpVar = new zzagp(this, zzagoVar);
        zzadn next = zzagpVar.next();
        zzagp zzagpVar2 = new zzagp(zzadrVar, zzagoVar);
        zzadn next2 = zzagpVar2.next();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int zzd = next.zzd() - i7;
            int zzd2 = next2.zzd() - i10;
            int min = Math.min(zzd, zzd2);
            if (!(i7 == 0 ? next.zzg(next2, i10, min) : next2.zzg(next, i7, min))) {
                return false;
            }
            i11 += min;
            int i12 = this.zzc;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzagpVar.next();
                i7 = 0;
            } else {
                i7 += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzagpVar2.next();
                i10 = 0;
            } else {
                i10 += min;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzagl(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final byte zza(int i7) {
        zzadr.zzv(i7, this.zzc);
        return zzb(i7);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final byte zzb(int i7) {
        int i10 = this.zzf;
        return i7 < i10 ? this.zzd.zzb(i7) : this.zze.zzb(i7 - i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final void zze(byte[] bArr, int i7, int i10, int i11) {
        int i12 = i7 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            this.zzd.zze(bArr, i7, i10, i11);
        } else {
            if (i7 >= i13) {
                this.zze.zze(bArr, i7 - i13, i10, i11);
                return;
            }
            int i14 = i13 - i7;
            this.zzd.zze(bArr, i7, i10, i14);
            this.zze.zze(bArr, 0, i10 + i14, i11 - i14);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzi(int i7, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            return this.zzd.zzi(i7, i10, i11);
        }
        if (i10 >= i13) {
            return this.zze.zzi(i7, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.zze.zzi(this.zzd.zzi(i7, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final int zzj(int i7, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.zzf;
        if (i12 <= i13) {
            return this.zzd.zzj(i7, i10, i11);
        }
        if (i10 >= i13) {
            return this.zze.zzj(i7, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.zze.zzj(this.zzd.zzj(i7, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadr zzk(int i7, int i10) {
        int zzp = zzadr.zzp(i7, i10, this.zzc);
        if (zzp == 0) {
            return zzadr.zzb;
        }
        if (zzp == this.zzc) {
            return this;
        }
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzk(i7, i10);
        }
        if (i7 >= i11) {
            return this.zze.zzk(i7 - i11, i10 - i11);
        }
        zzadr zzadrVar = this.zzd;
        return new zzagr(zzadrVar.zzk(i7, zzadrVar.zzd()), this.zze.zzk(0, i10 - this.zzf));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final zzadv zzl() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final String zzm(Charset charset) {
        return new String(zzx(), charset);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final void zzn(zzadh zzadhVar) {
        this.zzd.zzn(zzadhVar);
        this.zze.zzn(zzadhVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    public final boolean zzo() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzadr zzadrVar = this.zze;
        return zzadrVar.zzj(zzj, 0, zzadrVar.zzd()) == 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadr
    /* renamed from: zzr */
    public final zzadm iterator() {
        return new zzagl(this);
    }
}
