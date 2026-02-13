package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class zzjm implements zzjl {
    protected static volatile zzkt zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzkl zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    public zzjm(Context context) {
        try {
            zzie.zzd();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) zznc.zzc().zzb(zznr.zzcq)).booleanValue()) {
                this.zzr = new zzkl();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
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
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzm(Context context, String str, int i7, View view, Activity activity, byte[] bArr) {
        zzjk zzjkVar;
        String str2;
        int i10;
        int i11;
        Exception exc;
        int i12;
        int i13;
        String zza2;
        zzaf zzc;
        int i14;
        int i15;
        int i16 = i7;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) zznc.zzc().zzb(zznr.zzci)).booleanValue();
        zzaf zzafVar = null;
        if (booleanValue) {
            zzjkVar = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzjkVar = null;
            str2 = null;
        }
        try {
            if (i16 == 3) {
                zzafVar = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i15 = 1002;
                } catch (Exception e2) {
                    exc = e2;
                    i10 = 3;
                    i11 = 1;
                    if (booleanValue) {
                        if (i16 != i10) {
                        }
                        zzjkVar.zzc(i13, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (zzafVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i12 = 2;
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzafVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            } else {
                if (i16 == 2) {
                    zzc = zzd(context, view, activity);
                    i14 = 1008;
                } else {
                    zzc = zzc(context, null);
                    i14 = 1000;
                }
                zzafVar = zzc;
                i15 = i14;
            }
            if (!booleanValue || zzjkVar == null) {
                i10 = 3;
            } else {
                i10 = 3;
                i11 = 1;
                try {
                    zzjkVar.zzc(i15, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e10) {
                    e = e10;
                    exc = e;
                    if (booleanValue && zzjkVar != null) {
                        if (i16 != i10) {
                            i13 = 1003;
                            i12 = 2;
                        } else {
                            i12 = 2;
                            if (i16 == 2) {
                                i13 = 1009;
                            } else {
                                i13 = 1001;
                                i16 = i11;
                            }
                        }
                        zzjkVar.zzc(i13, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        long currentTimeMillis222 = System.currentTimeMillis();
                        if (zzafVar != null) {
                        }
                        zza2 = Integer.toString(5);
                        return zza2;
                    }
                    i12 = 2;
                    long currentTimeMillis2222 = System.currentTimeMillis();
                    if (zzafVar != null) {
                    }
                    zza2 = Integer.toString(5);
                    return zza2;
                }
            }
        } catch (Exception e11) {
            e = e11;
            i10 = 3;
            i11 = 1;
        }
        i12 = 2;
        long currentTimeMillis22222 = System.currentTimeMillis();
        if (zzafVar != null) {
            try {
            } catch (Exception e12) {
                zza2 = Integer.toString(7);
                if (booleanValue && zzjkVar != null) {
                    zzjkVar.zzc(i16 == i10 ? 1007 : i16 == i12 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, e12);
                }
            }
            if (((zzbc) zzafVar.zzak()).zzax() != 0) {
                zzbc zzbcVar = (zzbc) zzafVar.zzak();
                int i17 = zzie.zzc;
                zza2 = zzie.zza(zzbcVar.zzav(), str);
                if (booleanValue && zzjkVar != null) {
                    zzjkVar.zzc(i16 == i10 ? 1006 : i16 == i12 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis22222, str2, null);
                }
                return zza2;
            }
        }
        zza2 = Integer.toString(5);
        return zza2;
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr);

    public abstract zzaf zzb(Context context, View view, Activity activity);

    public abstract zzaf zzc(Context context, zzy zzyVar);

    public abstract zzaf zzd(Context context, View view, Activity activity);

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zze(Context context, String str, View view, Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzf(Context context) {
        if (zzkw.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzm(context, null, 1, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzg(Context context, byte[] bArr) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzh(Context context, View view, Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    public abstract zzkv zzi(MotionEvent motionEvent);

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l10;
        try {
            if (this.zzu) {
                zzj();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.zzs;
                double d11 = rawY - this.zzt;
                this.zzk += Math.sqrt((d11 * d11) + (d10 * d10));
                this.zzs = rawX;
                this.zzt = rawY;
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
                        this.zzh = zza(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += motionEvent.getHistorySize() + 1;
                        zzkv zzi = zzi(motionEvent);
                        Long l11 = zzi.zzd;
                        if (l11 != null && zzi.zzg != null) {
                            this.zzi = l11.longValue() + zzi.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l10 = zzi.zze) != null && zzi.zzh != null) {
                            this.zzj = l10.longValue() + zzi.zzh.longValue() + this.zzj;
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzkj unused) {
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

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final synchronized void zzl(int i7, int i10, int i11) {
        try {
            if (this.zzb != null) {
                if (((Boolean) zznc.zzc().zzb(zznr.zzcg)).booleanValue()) {
                    zzj();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f4 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i11, 1, i7 * f4, i10 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public void zzn(View view) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzq() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzs() {
        return true;
    }
}
