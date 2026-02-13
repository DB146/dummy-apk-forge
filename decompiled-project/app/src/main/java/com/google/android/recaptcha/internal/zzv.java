package com.google.android.recaptcha.internal;

import Db.d;
import Db.m;
import Eb.B;
import Eb.p;
import Eb.w;
import Ib.a;
import android.content.Context;
import cc.E;
import cc.F;
import com.bumptech.glide.c;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import y7.u0;

/* loaded from: classes.dex */
public final class zzv extends zze {
    private final zzek zza;
    private final List zzb;
    private zzle zzc;
    private final Map zzd;

    public zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i7, f fVar) {
        zzab zzabVar = new zzab(zzekVar.zza());
        zzp zzpVar = new zzp(zzekVar.zza());
        zzm zzmVar = new zzm(zzekVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzekVar.zza());
        zzek zza = zzekVar.zza();
        E zzc = zzbiVar.zzc();
        List y10 = u0.y(zzabVar, zzpVar, zzmVar, zznVar, new zzae(zza, context, zzc, new zzan(context, zzc, zza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(F5.f.f4100b)));
        this.zza = zzekVar;
        this.zzb = y10;
        this.zzd = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsi zzq(String str) {
        Map map;
        List<zzaa> list = (List) this.zzd.remove(str);
        if (list != null) {
            int F10 = B.F(p.S(list, 10));
            if (F10 < 16) {
                F10 = 16;
            }
            map = new LinkedHashMap(F10);
            for (zzaa zzaaVar : list) {
                map.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            map = w.f3892a;
        }
        zzsz zzs = zzs(map, str);
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        zzsf zzf2 = zzsg.zzf();
        byte[] zzd = zzs.zzd();
        zzf2.zze(zzkh.zzh().zzi(zzd, 0, zzd.length));
        zzf.zzf(zzf2);
        return (zzsi) zzf.zzk();
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzle zzleVar;
        zzsv zzf = zzsx.zzf();
        zzf.zzq(3);
        if (zzaaVar instanceof zzx) {
            zzti zza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            zzleVar = zzleVar2 != null ? zzleVar2 : null;
            byte[] zzd = zza.zzd();
            zzf.zzf(zzcf.zza(zzkh.zzh().zzi(zzd, 0, zzd.length), zzleVar));
        } else {
            if (!(zzaaVar instanceof zzw)) {
                throw new d(1);
            }
            zzte zza2 = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            zzleVar = zzleVar3 != null ? zzleVar3 : null;
            byte[] zzd2 = zza2.zzd();
            zzf.zze(zzcf.zza(zzkh.zzh().zzi(zzd2, 0, zzd2.length), zzleVar));
        }
        return (zzsx) zzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzf = zzsz.zzf();
        zzf.zzq(str);
        List list = this.zzb;
        ArrayList<zzy> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        for (zzy zzyVar : arrayList) {
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int zza = zzyVar.zza();
                zztd zzf2 = zzte.zzf();
                zzf2.zzf(zza);
                zzf2.zzr(13);
                zzf2.zzq(27);
                zzf.zzf(zzr(new zzw(zza, (zzte) zzf2.zzk())));
            }
        }
        Collection values = map.values();
        ArrayList arrayList2 = new ArrayList(p.S(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzr((zzaa) it.next()));
        }
        zzf.zze(arrayList2);
        return (zzsz) zzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, Hb.d dVar) {
        return zzq(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(String str, Hb.d dVar) {
        zzq zzqVar;
        int i7;
        if (dVar instanceof zzq) {
            zzqVar = (zzq) dVar;
            int i10 = zzqVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzqVar.zza;
                a aVar = a.f5345a;
                i7 = zzqVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    zzs zzsVar = new zzs(this, str, null);
                    zzqVar.zzc = 1;
                    obj = F.k(zzsVar, zzqVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.c0(obj);
                }
                return ((m) obj).f3357a;
            }
        }
        zzqVar = new zzq(this, dVar);
        Object obj2 = zzqVar.zza;
        a aVar2 = a.f5345a;
        i7 = zzqVar.zzc;
        if (i7 != 0) {
        }
        return ((m) obj2).f3357a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(zzsc zzscVar, Hb.d dVar) {
        zzt zztVar;
        int i7;
        if (dVar instanceof zzt) {
            zztVar = (zzt) dVar;
            int i10 = zztVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zztVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zztVar.zza;
                a aVar = a.f5345a;
                i7 = zztVar.zzc;
                if (i7 != 0) {
                    c.c0(obj);
                    zzu zzuVar = new zzu(zzscVar, this, null);
                    zztVar.zzc = 1;
                    obj = F.k(zzuVar, zztVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.c0(obj);
                }
                return ((m) obj).f3357a;
            }
        }
        zztVar = new zzt(this, dVar);
        Object obj2 = zztVar.zza;
        a aVar2 = a.f5345a;
        i7 = zztVar.zzc;
        if (i7 != 0) {
        }
        return ((m) obj2).f3357a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final void zzk(zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    public final Map zzo() {
        return this.zzd;
    }
}
