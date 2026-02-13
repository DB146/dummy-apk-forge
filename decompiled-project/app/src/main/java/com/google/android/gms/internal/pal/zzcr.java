package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class zzcr implements zzcq {
    protected static volatile zzdu zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    private double zzr;
    private double zzs;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzt = false;
    protected boolean zzp = false;

    public zzcr(Context context) {
        try {
            if (((Boolean) zzfv.zzc().zzb(zzgk.zzcw)).booleanValue()) {
                zzbn.zzd();
            } else {
                zzdv.zza(zza);
            }
            this.zzq = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(13:5|6|7|(4:9|(1:11)(1:85)|12|(1:14)(1:84))(1:86)|15|16|(4:18|19|20|21)(2:(1:79)(1:81)|80)|(1:74)(4:24|25|26|27)|28|(3:47|48|(1:50)(4:51|(3:(1:55)(1:(1:59)(1:60))|56|57)|31|32))|30|31|32)|91|7|(0)(0)|15|16|(0)(0)|(0)|74|28|(0)|30|31|32|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x009c, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: Exception -> 0x009b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x009b, blocks: (B:18:0x0062, B:24:0x0086, B:79:0x0073, B:81:0x007b), top: B:16:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzl(Context context, String str, int i7, View view, Activity activity, byte[] bArr) {
        zzi zziVar;
        boolean booleanValue;
        zzcp zzcpVar;
        String str2;
        int i10;
        Exception exc;
        int i11;
        int i12;
        String zza2;
        zzr zzi;
        int i13;
        int i14 = i7;
        zzr zzrVar = null;
        if (bArr != null && bArr.length > 0) {
            try {
                zziVar = zzi.zzc(bArr, zzacm.zza());
            } catch (zzadi unused) {
            } catch (NullPointerException unused2) {
                return Integer.toString(3);
            }
            long currentTimeMillis = System.currentTimeMillis();
            booleanValue = ((Boolean) zzfv.zzc().zzb(zzgk.zzcd)).booleanValue();
            if (booleanValue) {
                zzcpVar = null;
                str2 = null;
            } else {
                zzcpVar = zza != null ? zza.zzd() : null;
                str2 = true != ((Boolean) zzfv.zzc().zzb(zzgk.zzcw)).booleanValue() ? "te" : "be";
            }
            if (i14 != 3) {
                zzrVar = zzh(context, view, activity);
                try {
                    this.zzt = true;
                    i13 = 1002;
                } catch (Exception e2) {
                    exc = e2;
                    i10 = 2;
                    if (booleanValue && zzcpVar != null) {
                        if (i14 != 3) {
                            i12 = 1003;
                        } else if (i14 == i10) {
                            i12 = 1009;
                        } else {
                            i11 = 1001;
                            i14 = 1;
                            zzcpVar.zzc(i11, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        }
                        i11 = i12;
                        zzcpVar.zzc(i11, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (zzrVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            } else {
                if (i14 == 2) {
                    zzi = zzj(context, view, activity);
                    i13 = 1008;
                } else {
                    zzi = zzi(context, zziVar);
                    i13 = 1000;
                }
                zzrVar = zzi;
            }
            if (booleanValue || zzcpVar == null) {
                i10 = 2;
            } else {
                i10 = 2;
                try {
                    zzcpVar.zzc(i13, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    if (booleanValue) {
                        if (i14 != 3) {
                        }
                        i11 = i12;
                        zzcpVar.zzc(i11, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzrVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            }
            long currentTimeMillis222 = System.currentTimeMillis();
            if (zzrVar != null) {
                try {
                } catch (Exception e11) {
                    zza2 = Integer.toString(7);
                    if (booleanValue && zzcpVar != null) {
                        zzcpVar.zzc(i14 == 3 ? 1007 : i14 == i10 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis222, str2, e11);
                    }
                }
                if (((zzaf) zzrVar.zzan()).zzat() != 0) {
                    zza2 = zzbn.zza((zzaf) zzrVar.zzan(), str);
                    if (booleanValue && zzcpVar != null) {
                        zzcpVar.zzc(i14 == 3 ? 1006 : i14 == i10 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis222, str2, null);
                    }
                    return zza2;
                }
            }
            zza2 = Integer.toString(5);
            return zza2;
        }
        zziVar = null;
        long currentTimeMillis3 = System.currentTimeMillis();
        booleanValue = ((Boolean) zzfv.zzc().zzb(zzgk.zzcd)).booleanValue();
        if (booleanValue) {
        }
        if (i14 != 3) {
        }
        if (booleanValue) {
        }
        i10 = 2;
        long currentTimeMillis2222 = System.currentTimeMillis();
        if (zzrVar != null) {
        }
        zza2 = Integer.toString(5);
        return zza2;
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final String zza(Context context, String str, View view, Activity activity) {
        return zzl(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final String zzb(Context context) {
        if (zzdx.zzf()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzl(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final String zzc(Context context, byte[] bArr) {
        if (zzdx.zzf()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzl(context, null, 1, null, null, bArr);
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final String zzd(Context context, View view, Activity activity) {
        return zzl(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final synchronized void zze(MotionEvent motionEvent) {
        Long l10;
        try {
            if (this.zzt) {
                this.zzh = 0L;
                this.zzd = 0L;
                this.zze = 0L;
                this.zzf = 0L;
                this.zzg = 0L;
                this.zzi = 0L;
                this.zzj = 0L;
                if (this.zzc.size() > 0) {
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((MotionEvent) it.next()).recycle();
                    }
                    this.zzc.clear();
                } else {
                    MotionEvent motionEvent2 = this.zzb;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                }
                this.zzb = null;
                this.zzt = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzr = motionEvent.getRawX();
                this.zzs = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.zzr;
                double d11 = rawY - this.zzs;
                this.zzk += Math.sqrt((d11 * d11) + (d10 * d10));
                this.zzr = rawX;
                this.zzs = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.zzb = obtain;
                        this.zzc.add(obtain);
                        if (this.zzc.size() > 6) {
                            ((MotionEvent) this.zzc.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zzg(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += motionEvent.getHistorySize() + 1;
                        zzdw zzk = zzk(motionEvent);
                        Long l11 = zzk.zzd;
                        if (l11 != null && zzk.zzg != null) {
                            this.zzi = l11.longValue() + zzk.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l10 = zzk.zze) != null && zzk.zzh != null) {
                            this.zzj = l10.longValue() + zzk.zzh.longValue() + this.zzj;
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzdm unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public void zzf(View view) {
    }

    public abstract long zzg(StackTraceElement[] stackTraceElementArr);

    public abstract zzr zzh(Context context, View view, Activity activity);

    public abstract zzr zzi(Context context, zzi zziVar);

    public abstract zzr zzj(Context context, View view, Activity activity);

    public abstract zzdw zzk(MotionEvent motionEvent);
}
