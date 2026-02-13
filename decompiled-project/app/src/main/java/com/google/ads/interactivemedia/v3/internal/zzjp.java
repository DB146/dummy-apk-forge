package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzjp implements Runnable, zzjl {
    private Context zzc;
    private final zzoy zzd;
    private final Executor zze;
    private final zzm zzf;
    private final boolean zzg;
    private final AtomicReference zzb = new AtomicReference();
    final CountDownLatch zza = new CountDownLatch(1);
    private final List zzh = new ArrayList();

    public zzjp(Context context, Executor executor, zzm zzmVar) {
        this.zzf = zzmVar;
        this.zzc = context;
        this.zze = executor;
        zznr.zza(context);
        boolean z8 = ((Boolean) zznc.zzc().zzb(zznr.zzca)).booleanValue() && zzmVar.zzh();
        this.zzg = z8;
        this.zzd = zzoy.zza(context, executor, z8);
        executor.execute(this);
    }

    private final void zzd() {
        if (this.zzh.isEmpty() || this.zzb.get() == null) {
            return;
        }
        for (Object[] objArr : this.zzh) {
            int length = objArr.length;
            if (length == 1) {
                ((zzjl) this.zzb.get()).zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                ((zzjl) this.zzb.get()).zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzh.clear();
    }

    private final boolean zzi() {
        AtomicReference atomicReference = this.zzb;
        String zzc = this.zzf.zzc();
        Context zzj = zzj(this.zzc);
        boolean zzg = this.zzf.zzg();
        zzjq.zzr(zzj, zzg);
        atomicReference.set(new zzjr(zzj, zzc, zzg));
        return true;
    }

    private static final Context zzj(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: all -> 0x0049, NullPointerException -> 0x004b, TryCatch #0 {NullPointerException -> 0x004b, blocks: (B:4:0x0005, B:7:0x004d, B:9:0x0051, B:11:0x005c, B:16:0x0067, B:18:0x008c, B:20:0x0094, B:21:0x0013, B:23:0x003e), top: B:3:0x0005, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[Catch: all -> 0x0049, NullPointerException -> 0x004b, TryCatch #0 {NullPointerException -> 0x004b, blocks: (B:4:0x0005, B:7:0x004d, B:9:0x0051, B:11:0x005c, B:16:0x0067, B:18:0x008c, B:20:0x0094, B:21:0x0013, B:23:0x003e), top: B:3:0x0005, outer: #1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CountDownLatch countDownLatch;
        int i7;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
            } catch (NullPointerException e2) {
                if (this.zzf.zzi()) {
                    zzi();
                }
                this.zzd.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e2);
                this.zzc = null;
                countDownLatch = this.zza;
            }
            if (this.zzf.zzk() - 1 == 2) {
                Context context = this.zzc;
                zzoy zzoyVar = this.zzd;
                if (new zzqi(this.zzc, zzpq.zzb(context, zzoyVar), new zzjo(this), ((Boolean) zznc.zzc().zzb(zznr.zzbX)).booleanValue()).zzd(1) || !this.zzf.zzi()) {
                    i7 = 3;
                    if (i7 - 1 == 2) {
                        zzi();
                        if (this.zzf.zzk() == 3) {
                            this.zze.execute(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzjn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzjp.this.zzc();
                                }
                            });
                        }
                    } else {
                        zzji zzb = zzji.zzb(this.zzf.zzc(), zzj(this.zzc), this.zze, this.zzf.zzg(), this.zzg);
                        this.zzb.set(zzb);
                        if (!zzb.zzr() && this.zzf.zzi()) {
                            zzi();
                        }
                    }
                    this.zzc = null;
                    countDownLatch = this.zza;
                    countDownLatch.countDown();
                }
            }
            i7 = 2;
            if (i7 - 1 == 2) {
            }
            this.zzc = null;
            countDownLatch = this.zza;
            countDownLatch.countDown();
        } catch (Throwable th) {
            this.zzc = null;
            this.zza.countDown();
            throw th;
        }
    }

    public final zzjl zza() {
        return (zzjl) this.zzb.get();
    }

    public final /* synthetic */ void zzc() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzji.zza(this.zzf.zzc(), zzj(this.zzc), this.zzf.zzg(), this.zzg).zzo();
        } catch (NullPointerException e2) {
            this.zzd.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    @Deprecated
    public final String zze(Context context, String str, View view, Activity activity) {
        if (!zzs()) {
            return "";
        }
        zzd();
        return ((zzjl) this.zzb.get()).zze(zzj(context), str, view, activity);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzf(Context context) {
        return zzg(context, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzg(Context context, byte[] bArr) {
        if (!zzs()) {
            return "";
        }
        zzd();
        return ((zzjl) this.zzb.get()).zzf(zzj(context));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzh(Context context, View view, Activity activity) {
        return zzs() ? ((zzjl) this.zzb.get()).zzh(context, view, activity) : "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzk(MotionEvent motionEvent) {
        if (this.zzb.get() == null) {
            this.zzh.add(new Object[]{motionEvent});
        } else {
            zzd();
            ((zzjl) this.zzb.get()).zzk(motionEvent);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzl(int i7, int i10, int i11) {
        if (this.zzb.get() == null) {
            this.zzh.add(new Object[]{Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11)});
        } else {
            zzd();
            ((zzjl) this.zzb.get()).zzl(i7, i10, i11);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzn(View view) {
        if (this.zzb.get() != null) {
            ((zzjl) this.zzb.get()).zzn(view);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzq() {
        return this.zza.getCount() == 0 && this.zzb.get() != null && ((zzjl) this.zzb.get()).zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzs() {
        try {
            this.zza.await();
            if (this.zzb.get() != null) {
                return ((zzjl) this.zzb.get()).zzs();
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
