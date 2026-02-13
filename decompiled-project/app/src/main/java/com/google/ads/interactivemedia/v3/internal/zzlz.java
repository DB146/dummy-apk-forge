package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzlz extends zzmh {
    private final StackTraceElement[] zzi;

    public zzlz(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i7, int i10, StackTraceElement[] stackTraceElementArr) {
        super(zzktVar, "c1kwIqDUt3eWAvCNkbABb9gMelky1LQri6Meuw58pR9sFDLpUMniqwXzwcy1jftP", "HqknIq5XGienhA1/6NdBPO+lKaPIpkMOC/sqE+FKLYc=", zzafVar, i7, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    public final void zza() {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzkk zzkkVar = new zzkk((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                try {
                    this.zze.zzF(zzkkVar.zza.longValue());
                    if (zzkkVar.zzb.booleanValue()) {
                        this.zze.zzac(true != zzkkVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        this.zze.zzac(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
