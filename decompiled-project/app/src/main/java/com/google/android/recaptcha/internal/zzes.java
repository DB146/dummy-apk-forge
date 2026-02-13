package com.google.android.recaptcha.internal;

import Db.d;
import Eb.G;
import Eb.u;
import O5.b;
import android.content.Context;
import cc.E;
import cc.F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final E zzd;
    private final zzei zze;

    /* JADX WARN: Multi-variable type inference failed */
    public zzes(Context context, zzet zzetVar, E e2) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = e2;
        zzei zzeiVar = null;
        Object[] objArr = 0;
        try {
            zzei zzc = zzei.zzc();
            zzc = zzc == null ? new zzei(context, objArr == true ? 1 : 0) : zzc;
            zzei.zze(zzc);
            zzeiVar = zzc;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList<List> arrayList;
        zzei zzeiVar;
        zztx zzk;
        int zzN;
        int i7;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            List zzd = zzeiVar2.zzd();
            l.e(zzd, "<this>");
            if (zzd instanceof RandomAccess) {
                int size = zzd.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i10 = 0; i10 >= 0 && i10 < size; i10 += 20) {
                    int i11 = size - i10;
                    if (20 <= i11) {
                        i11 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(zzd.get(i12 + i10));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator iterator = zzd.iterator();
                l.e(iterator, "iterator");
                Iterator w10 = !iterator.hasNext() ? u.f3890a : b.w(new G(iterator, null));
                while (w10.hasNext()) {
                    arrayList.add((List) w10.next());
                }
            }
            for (List<zzej> list : arrayList) {
                zzrd zzi = zzrf.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        zzN = zzk.zzN();
                        i7 = zzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (zzN == 0) {
                        throw null;
                    }
                    if (i7 == 0) {
                        zzi.zzq(zzk.zzf());
                    } else if (i7 == 1) {
                        zzi.zzr(zzk.zzg());
                    } else if (i7 != 2) {
                        throw new d(1);
                    }
                    arrayList3.add(zzejVar);
                }
                if (zzi.zzf() + zzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        F.B(this.zzd, null, 0, new zzer(this, zztxVar, null), 3);
        zzh();
    }
}
