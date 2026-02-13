package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzfc extends zzfg {
    public zzfc(zzdu zzduVar, String str, String str2, zzr zzrVar, int i7, int i10) {
        super(zzduVar, "6CWPidOWJZFxRWI8V7yi3OiMbOhIWZX/jTayTGRwqCM0W8dtKHQOPe60TuQicfhG", "gYPijpNio6OwLgbzbH6IuWSNtvp7bCV5UMbKZJCVNdg=", zzrVar, i7, 48);
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() {
        this.zze.zzag(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            try {
                if (booleanValue) {
                    this.zze.zzag(2);
                } else {
                    this.zze.zzag(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
