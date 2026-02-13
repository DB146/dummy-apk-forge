package com.google.ads.interactivemedia.pal;

import X.c;
import android.app.UiModeManager;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.pal.zzagb;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzay;
import com.google.android.gms.internal.pal.zzba;
import com.google.android.gms.internal.pal.zzbc;
import com.google.android.gms.internal.pal.zzbd;
import com.google.android.gms.internal.pal.zzbg;
import com.google.android.gms.internal.pal.zzbh;
import com.google.android.gms.internal.pal.zzfm;
import com.google.android.gms.internal.pal.zzig;
import com.google.android.gms.internal.pal.zzii;
import com.google.android.gms.internal.pal.zzij;
import com.google.android.gms.internal.pal.zzil;
import com.google.android.gms.internal.pal.zzjb;
import com.google.android.gms.internal.pal.zzjc;
import com.google.android.gms.internal.pal.zzjl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import u5.C2110b;

/* loaded from: classes.dex */
public final class NonceLoader {
    public static final /* synthetic */ int zza = 0;
    private static final Random zzb = new Random();
    private final Context zzc;
    private final zzagb zzd;
    private final zzagb zze;
    private final Task zzf;
    private final com.google.android.gms.internal.pal.zzav zzg;
    private final zzbg zzh;
    private final zzbg zzi;
    private final zzbg zzj;
    private final zzbc zzk;
    private final zzx zzl;
    private final long zzm;
    private long zzn;
    private final String zzo;

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NonceLoader(final Context context, ConsentSettings consentSettings) {
        zzbg zzbdVar;
        context.getClass();
        consentSettings.getClass();
        zzaj zzajVar = new zzaj();
        zzai zzaiVar = new zzai();
        String zzf = zzf();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        newSingleThreadExecutor.execute(new Runnable() { // from class: com.google.ads.interactivemedia.pal.zzy
            @Override // java.lang.Runnable
            public final void run() {
                taskCompletionSource.setResult(new zzfm("h.3.2.2/n.android.3.2.2", context, false));
            }
        });
        Task task = taskCompletionSource.getTask();
        String zzh = zzh(context);
        zze zzeVar = new zze();
        zzeVar.zzb(zzat.zza);
        zzeVar.zzc(zzh);
        zzeVar.zza(zzf);
        zzx zzxVar = new zzx(new zzs(zzeVar.zzd()), zzx.zza);
        com.google.android.gms.internal.pal.zzav zzavVar = new com.google.android.gms.internal.pal.zzav(zzaj.zza(), Executors.newSingleThreadExecutor(), context, task, zzxVar);
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        boolean z8 = false;
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            z8 = true;
        }
        if (consentSettings.zza().booleanValue()) {
            Boolean zzc = consentSettings.zzc();
            if (zzc != null ? zzc.booleanValue() : z8) {
                zzbdVar = new zzbh(zzaj.zza(), Executors.newSingleThreadExecutor(), context, zzxVar);
                zzbg zzbdVar2 = (consentSettings.zza().booleanValue() || consentSettings.zzb().booleanValue()) ? new zzbd(zzaj.zza(), Executors.newSingleThreadExecutor()) : new com.google.android.gms.internal.pal.zzax(zzaj.zza(), Executors.newSingleThreadExecutor(), context);
                zzbg zzayVar = !consentSettings.zza().booleanValue() ? new zzay(zzaj.zza(), Executors.newSingleThreadExecutor(), context) : new zzbd(zzaj.zza(), Executors.newSingleThreadExecutor());
                zzbc zzbcVar = new zzbc(zzaj.zza(), Executors.newSingleThreadExecutor());
                this.zzn = -1L;
                this.zzc = context;
                this.zzd = zzajVar;
                this.zze = zzaiVar;
                this.zzf = task;
                this.zzg = zzavVar;
                this.zzh = zzbdVar;
                this.zzi = zzbdVar2;
                this.zzj = zzayVar;
                this.zzk = zzbcVar;
                this.zzl = zzxVar;
                this.zzo = zzf;
                this.zzm = System.currentTimeMillis();
                zzbcVar.zzd();
                zzavVar.zzd();
                zzbdVar2.zzd();
                zzayVar.zzd();
                zzbdVar.zzd();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{zzbdVar2.zzb(), zzayVar.zzb(), zzavVar.zzb(), zzbdVar.zzb(), zzbcVar.zzb()}).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.ads.interactivemedia.pal.zzad
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        NonceLoader.this.zzd(task2);
                    }
                });
            }
        }
        zzbdVar = new zzbd(zzaj.zza(), Executors.newSingleThreadExecutor());
        if (consentSettings.zza().booleanValue()) {
        }
        if (!consentSettings.zza().booleanValue()) {
        }
        zzbc zzbcVar2 = new zzbc(zzaj.zza(), Executors.newSingleThreadExecutor());
        this.zzn = -1L;
        this.zzc = context;
        this.zzd = zzajVar;
        this.zze = zzaiVar;
        this.zzf = task;
        this.zzg = zzavVar;
        this.zzh = zzbdVar;
        this.zzi = zzbdVar2;
        this.zzj = zzayVar;
        this.zzk = zzbcVar2;
        this.zzl = zzxVar;
        this.zzo = zzf;
        this.zzm = System.currentTimeMillis();
        zzbcVar2.zzd();
        zzavVar.zzd();
        zzbdVar2.zzd();
        zzayVar.zzd();
        zzbdVar.zzd();
        Tasks.whenAllComplete((Task<?>[]) new Task[]{zzbdVar2.zzb(), zzayVar.zzb(), zzavVar.zzb(), zzbdVar.zzb(), zzbcVar2.zzb()}).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.ads.interactivemedia.pal.zzad
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                NonceLoader.this.zzd(task2);
            }
        });
    }

    public static /* synthetic */ Map zzb(zzjb zzjbVar, Task task, Task task2, Task task3, Task task4, Task task5) {
        zzjbVar.zzb((Map) zze(task).zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzaf
            @Override // com.google.android.gms.internal.pal.zzii
            public final Object zza(Object obj) {
                com.google.android.gms.internal.pal.zzaw zzawVar = (com.google.android.gms.internal.pal.zzaw) obj;
                int i7 = NonceLoader.zza;
                return zzjc.zzf(zzak.ADVERTISING_ID.zza(), zzawVar.zza(), zzak.ID_TYPE.zza(), zzawVar.zzb(), zzak.LIMIT_AD_TRACKING.zza(), true != zzawVar.zzc() ? "0" : "1");
            }
        }).zzc(zzjc.zzc()));
        zzjbVar.zzb(((Boolean) zze(task).zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzab
            @Override // com.google.android.gms.internal.pal.zzii
            public final Object zza(Object obj) {
                com.google.android.gms.internal.pal.zzaw zzawVar = (com.google.android.gms.internal.pal.zzaw) obj;
                int i7 = NonceLoader.zza;
                boolean z8 = false;
                if (!zzawVar.zzc() && !zzig.zza(zzawVar.zza(), "00000000-0000-0000-0000-000000000000")) {
                    z8 = true;
                }
                return Boolean.valueOf(z8);
            }
        }).zzc(Boolean.FALSE)).booleanValue() ? zzjc.zzc() : (zzjc) zze(task2).zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzac
            @Override // com.google.android.gms.internal.pal.zzii
            public final Object zza(Object obj) {
                C2110b c2110b = (C2110b) obj;
                int i7 = NonceLoader.zza;
                return zzjc.zze(zzak.PER_VENDOR_ID.zza(), c2110b.f24869a, zzak.PER_VENDOR_ID_SCOPE.zza(), String.valueOf(c2110b.f24870b));
            }
        }).zzc(zzjc.zzc()));
        zzjbVar.zzb((Map) zze(task3).zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzag
            @Override // com.google.android.gms.internal.pal.zzii
            public final Object zza(Object obj) {
                int i7 = NonceLoader.zza;
                return zzjc.zzd(zzak.MOBILE_SPAM.zza(), (String) obj);
            }
        }).zzc(zzjc.zzc()));
        zzjbVar.zzb((Map) zze(task4).zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzah
            @Override // com.google.android.gms.internal.pal.zzii
            public final Object zza(Object obj) {
                int i7 = NonceLoader.zza;
                return zzjc.zzd(zzak.ADS_IDENTITY_TOKEN.zza(), (String) obj);
            }
        }).zzc(zzjc.zzc()));
        return zzjbVar.zzc();
    }

    private static zzil zze(Task task) {
        return !task.isSuccessful() ? zzil.zze() : (zzil) task.getResult();
    }

    private static String zzf() {
        return Integer.toString(zzb.nextInt(f.API_PRIORITY_OTHER));
    }

    private static String zzg(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            Log.e("NonceGenerator", "Failed to encode the input string.");
            return "";
        }
    }

    private static String zzh(Context context) {
        return "h.3.2.2/n.android.3.2.2/".concat(String.valueOf(context.getApplicationContext().getPackageName()));
    }

    public Task<NonceManager> loadNonceManager(final NonceRequest nonceRequest) {
        if (nonceRequest == null) {
            this.zzl.zza(103);
            return Tasks.forException(NonceLoaderException.zzb(103));
        }
        final String zzf = zzf();
        final zzjb zzjbVar = new zzjb();
        if (nonceRequest.zzi().length() <= 500) {
            zzjbVar.zza(zzak.DESCRIPTION_URL.zza(), zzg(nonceRequest.zzi()));
        }
        if (nonceRequest.zzo().length() <= 200) {
            zzjbVar.zza(zzak.PPID.zza(), zzg(nonceRequest.zzo()));
        }
        if (nonceRequest.zzl().length() > 0 && nonceRequest.zzl().length() <= 200) {
            zzjbVar.zza(zzak.OMID_VERSION.zza(), zzg(nonceRequest.zzl()));
        }
        if (nonceRequest.zzm().length() <= 200) {
            zzjbVar.zza(zzak.PLAYER_TYPE.zza(), zzg(nonceRequest.zzm()));
        }
        if (nonceRequest.zzn().length() <= 200) {
            zzjbVar.zza(zzak.PLAYER_VERSION.zza(), zzg(nonceRequest.zzn()));
        }
        String i7 = (nonceRequest.zzj().length() == 0 || nonceRequest.zzj().length() > 200 || nonceRequest.zzk().length() == 0 || nonceRequest.zzk().length() > 200) ? "" : c.i(nonceRequest.zzj(), "/", nonceRequest.zzk());
        zzjbVar.zza(zzak.OMID_PARTNER.zza(), zzg(i7));
        TreeSet treeSet = new TreeSet(nonceRequest.zzq());
        if (!i7.isEmpty()) {
            treeSet.add(7);
        }
        String zza2 = zzak.API_FRAMEWORKS.zza();
        Iterator it = treeSet.iterator();
        StringBuilder sb2 = new StringBuilder();
        try {
            zzij.zzb(sb2, it, ",");
            zzjbVar.zza(zza2, sb2.toString());
            Integer zzg = nonceRequest.zzg();
            if (zzg != null) {
                String zza3 = zzak.PLAYER_HEIGHT.zza();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(zzg);
                zzjbVar.zza(zza3, sb3.toString());
            }
            Integer zzh = nonceRequest.zzh();
            if (zzh != null) {
                String zza4 = zzak.PLAYER_WIDTH.zza();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(zzh);
                zzjbVar.zza(zza4, sb4.toString());
            }
            if (zzg != null && zzh != null) {
                zzjbVar.zza(zzak.ORIENTATION.zza(), zzg.intValue() <= zzh.intValue() ? "l" : "p");
            }
            Boolean zzd = nonceRequest.zzd();
            if (zzd != null) {
                zzjbVar.zza(zzak.PLAY_ACTIVATION.zza(), true != zzd.booleanValue() ? "click" : "auto");
            }
            zzjbVar.zza(zzak.WTA_SUPPORTED.zza(), true != nonceRequest.zzc().booleanValue() ? "0" : "1");
            Boolean zze = nonceRequest.zze();
            if (zze != null) {
                zzjbVar.zza(zzak.PLAY_MUTED.zza(), true == zze.booleanValue() ? "1" : "0");
            }
            Boolean zzb2 = nonceRequest.zzb();
            if (zzb2 != null) {
                zzjbVar.zza(zzak.CONTINUOUS_PLAYBACK.zza(), true == zzb2.booleanValue() ? "2" : "1");
            }
            zzjbVar.zza(zzak.SESSION_ID.zza(), nonceRequest.zzp());
            final zzjb zzjbVar2 = new zzjb();
            zzjbVar2.zza(zzak.PAL_VERSION.zza(), zzat.zza);
            zzjbVar2.zza(zzak.SDK_VERSION.zza(), zzh(this.zzc));
            zzjbVar2.zza(zzak.APP_NAME.zza(), this.zzc.getApplicationContext().getPackageName());
            zzjbVar2.zza(zzak.PAGE_CORRELATOR.zza(), this.zzo);
            zzjbVar2.zza(zzak.AD_SPAM_CAPABILITIES.zza(), "3");
            zzjbVar2.zza(zzak.SPAM_CORRELATOR.zza(), zzf);
            final Task zzb3 = this.zzi.zzb();
            final Task zzb4 = this.zzj.zzb();
            final Task zzb5 = this.zzg.zzb();
            final Task zzb6 = this.zzh.zzb();
            final Task<TContinuationResult> continueWith = Tasks.whenAllComplete((Task<?>[]) new Task[]{zzb3, zzb4, zzb5, zzb6}).continueWith(new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzae
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return NonceLoader.zzb(zzjb.this, zzb3, zzb4, zzb5, zzb6, task);
                }
            });
            PlatformSignalCollector zza5 = nonceRequest.zza();
            final Task<Map<String, String>> forResult = zza5 == null ? Tasks.forResult(zzjc.zzc()) : zza5.collectSignals(this.zzc, Executors.newSingleThreadExecutor());
            final Task zzb7 = this.zzk.zzb();
            final long currentTimeMillis = System.currentTimeMillis();
            return Tasks.whenAllComplete((Task<?>[]) new Task[]{continueWith, zzb7, forResult}).continueWith(Executors.newSingleThreadExecutor(), new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return NonceLoader.this.zza(zzjbVar, continueWith, forResult, zzb7, nonceRequest, zzf, currentTimeMillis, task);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.pal.zzaa
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    NonceLoader.this.zzc(exc);
                }
            });
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public void release() {
        this.zzg.zze();
        this.zzh.zze();
        this.zzi.zze();
        this.zzj.zze();
        this.zzk.zze();
    }

    public final NonceManager zza(zzjb zzjbVar, Task task, Task task2, Task task3, NonceRequest nonceRequest, String str, long j, Task task4) {
        zzjbVar.zzb((Map) task.getResult());
        if (task2.isSuccessful()) {
            zzjbVar.zzb((Map) task2.getResult());
        }
        zzba zzbaVar = (zzba) ((zzil) task3.getResult()).zzb();
        zzjc zzc = zzjbVar.zzc();
        StringBuilder sb2 = new StringBuilder();
        zzjl it = zzc.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() != null && ((String) entry.getValue()).length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                sb2.append((String) entry.getKey());
                sb2.append("=");
                sb2.append((String) entry.getValue());
            }
        }
        String zza2 = zzbaVar.zza(sb2.toString());
        Integer zzf = nonceRequest.zzf();
        if (zzf != null && zza2.length() > zzf.intValue()) {
            Log.e("NonceGenerator", "Nonce length limit crossed.");
            throw NonceLoaderException.zzb(104);
        }
        String zzh = zzh(this.zzc);
        String str2 = this.zzo;
        zze zzeVar = new zze();
        zzeVar.zzb(zzat.zza);
        zzeVar.zzc(zzh);
        zzeVar.zza(str2);
        zzax zzaxVar = new zzax(new zzs(zzeVar.zzd()), str);
        int length = zza2.length();
        zzh zzhVar = new zzh();
        zzagc zzagcVar = zzagc.zza;
        zzhVar.zzc(zzagcVar);
        zzhVar.zzd(zzagc.zza(j - this.zzm));
        zzhVar.zzb(zzagc.zza(System.currentTimeMillis() - this.zzm));
        zzhVar.zzf(zzagcVar);
        zzhVar.zze(zzagc.zza(this.zzn - this.zzm));
        zzhVar.zza(length);
        this.zzl.zzb(zzhVar.zzg());
        return new NonceManager(this.zzc, zzaj.zza(), Executors.newSingleThreadExecutor(), this.zzf, zzaxVar, zza2);
    }

    public final /* synthetic */ void zzc(Exception exc) {
        if (exc instanceof NonceLoaderException) {
            this.zzl.zza(((NonceLoaderException) exc).zza());
        } else {
            this.zzl.zza(100);
        }
    }

    public final void zzd(Task task) {
        this.zzn = System.currentTimeMillis();
    }
}
