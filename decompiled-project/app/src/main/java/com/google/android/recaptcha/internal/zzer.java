package com.google.android.recaptcha.internal;

import Db.q;
import Eb.o;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import android.content.ContentValues;
import cc.E;
import com.bumptech.glide.c;
import java.util.List;

/* loaded from: classes.dex */
final class zzer extends i implements e {
    final /* synthetic */ zzes zza;
    final /* synthetic */ zztx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzesVar, zztx zztxVar, d dVar) {
        super(2, dVar);
        this.zza = zzesVar;
        this.zzb = zztxVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzer(this.zza, this.zzb, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzer) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzei zzeiVar;
        zzei zzeiVar2;
        zzei zzeiVar3;
        zzei zzeiVar4;
        zzei zzeiVar5;
        zzei zzeiVar6;
        a aVar = a.f5345a;
        c.c0(obj);
        zztx zztxVar = this.zzb;
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzeiVar = zzesVar.zze;
                if (zzeiVar != null) {
                    byte[] zzd = zztxVar.zzd();
                    zzej zzejVar = new zzej(zzkh.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                    zzeiVar2 = zzesVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzejVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzejVar.zzb()));
                    zzeiVar2.getWritableDatabase().insert("ce", null, contentValues);
                    zzeiVar3 = zzesVar.zze;
                    int zzb = zzeiVar3.zzb() - 500;
                    if (zzb > 0) {
                        zzeiVar5 = zzesVar.zze;
                        List o02 = o.o0(zzb, zzeiVar5.zzd());
                        zzeiVar6 = zzesVar.zze;
                        zzeiVar6.zza(o02);
                    }
                    zzeiVar4 = zzesVar.zze;
                    if (zzeiVar4.zzb() >= 20) {
                        zzesVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q.f3365a;
    }
}
