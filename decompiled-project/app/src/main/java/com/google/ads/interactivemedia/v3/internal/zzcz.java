package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcz implements zzce {
    private static final zzcz zza = new zzcz();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzcv();
    private static final Runnable zze = new zzcw();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzcs zzk = new zzcs();
    private final zzcg zzj = new zzcg();
    private final zzct zzl = new zzct(new zzdc());

    public static zzcz zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzcz zzczVar) {
        zzczVar.zzg = 0;
        zzczVar.zzi.clear();
        zzczVar.zzh = false;
        for (com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar : zzbx.zza().zzb()) {
        }
        zzczVar.zzm = System.nanoTime();
        zzczVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzcf zza2 = zzczVar.zzj.zza();
        if (zzczVar.zzk.zze().size() > 0) {
            Iterator it = zzczVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzcn.zza(0, 0, 0, 0);
                View zza4 = zzczVar.zzk.zza(str);
                zzcf zzb2 = zzczVar.zzj.zzb();
                String zzc2 = zzczVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzcn.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e2) {
                        zzco.zza("Error with setting not visible reason", e2);
                    }
                    zzcn.zzc(zza3, zza5);
                }
                zzcn.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzczVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzczVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zzcn.zza(0, 0, 0, 0);
            zzczVar.zzk(null, zza2, zza6, 1, false);
            zzcn.zzf(zza6);
            zzczVar.zzl.zzd(zza6, zzczVar.zzk.zzf(), nanoTime);
        } else {
            zzczVar.zzl.zzb();
        }
        zzczVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzczVar.zzm;
        if (zzczVar.zzf.size() > 0) {
            for (zzcy zzcyVar : zzczVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzcyVar.zzb();
                if (zzcyVar instanceof zzcx) {
                    ((zzcx) zzcyVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzcf zzcfVar, JSONObject jSONObject, int i7, boolean z8) {
        zzcfVar.zzb(view, jSONObject, this, i7 == 1, z8);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzce
    public final void zza(View view, zzcf zzcfVar, JSONObject jSONObject, boolean z8) {
        int zzk;
        boolean z10;
        if (zzcq.zzb(view) != null || (zzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzcfVar.zza(view);
        zzcn.zzc(jSONObject, zza2);
        String zzd2 = this.zzk.zzd(view);
        if (zzd2 != null) {
            zzcn.zzb(zza2, zzd2);
            try {
                zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e2) {
                zzco.zza("Error with setting not visible reason", e2);
            }
            this.zzk.zzh();
        } else {
            zzcr zzb2 = this.zzk.zzb(view);
            if (zzb2 != null) {
                zzbz zza3 = zzb2.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList zzb3 = zzb2.zzb();
                int size = zzb3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    jSONArray.put((String) zzb3.get(i7));
                }
                try {
                    zza2.put("isFriendlyObstructionFor", jSONArray);
                    zza2.put("friendlyObstructionClass", zza3.zzd());
                    zza2.put("friendlyObstructionPurpose", zza3.zza());
                    zza2.put("friendlyObstructionReason", zza3.zzc());
                } catch (JSONException e10) {
                    zzco.zza("Error with setting friendly obstruction", e10);
                }
                z10 = true;
            } else {
                z10 = false;
            }
            zzk(view, zzcfVar, zza2, zzk, z8 || z10);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzcu(this));
    }
}
