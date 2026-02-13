package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import android.webkit.WebView;
import cc.E;
import cc.InterfaceC0952s;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziy extends i implements e {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzja zzjaVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zziy(this.zzf, this.zzg, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d0, code lost:
    
        r8.zzg.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d7, code lost:
    
        return Db.q.f3365a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bc, code lost:
    
        if (((cc.C0953t) r9).o(r8) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r9 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r1 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00be, code lost:
    
        r9 = r8.zzf.zzm();
        r1 = com.google.android.recaptcha.internal.zzje.zzc;
        r8.zze = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00cd, code lost:
    
        if (r9.zzc(r1, r8) != r0) goto L29;
     */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzja zzjaVar;
        zzsc zzscVar;
        zzsc zzscVar2;
        zzsc zzscVar3;
        zzcg zzcgVar;
        zzja zzjaVar2;
        zzjh zzjhVar;
        zzjh zzjhVar2;
        zzsc zzscVar4;
        Object zzE;
        a aVar = a.f5345a;
        int i7 = this.zze;
        if (i7 == 0) {
            c.c0(obj);
            zzjaVar = this.zzf;
            zzscVar = zzjaVar.zzf;
            if (zzscVar == null) {
                zzscVar = null;
            }
            zzscVar2 = this.zzf.zzf;
            if (zzscVar2 == null) {
                zzscVar2 = null;
            }
            zzcg zzcgVar2 = new zzcg(zzscVar2.zzf());
            zzja zzjaVar3 = this.zzf;
            this.zza = zzjaVar;
            this.zzb = zzjaVar;
            this.zzc = zzscVar;
            this.zzd = zzcgVar2;
            this.zze = 1;
            Object zzw = zzjaVar3.zzw(this);
            if (zzw != aVar) {
                zzscVar3 = zzscVar;
                obj = zzw;
                zzcgVar = zzcgVar2;
                zzjaVar2 = zzjaVar;
            }
            return aVar;
        }
        if (i7 != 1) {
            c.c0(obj);
            if (i7 != 2) {
            }
            new Integer(this.zzf.zzA().hashCode());
            InterfaceC0952s zzA = this.zzf.zzA();
            this.zze = 3;
        } else {
            zzcgVar = (zzcg) this.zzd;
            zzscVar3 = (zzsc) this.zzc;
            zzjaVar = (zzja) this.zzb;
            zzjaVar2 = (zzja) this.zza;
            c.c0(obj);
        }
        zzjaVar2.zzb = zzjaVar.zzC(zzscVar3, zzcgVar, (WebView) obj);
        new Integer(this.zzf.zzA().hashCode());
        zzjhVar = this.zzf.zzh;
        zzjhVar.zzd();
        zzjhVar2 = this.zzf.zzh;
        zzjhVar2.zze();
        zzja zzjaVar4 = this.zzf;
        zzscVar4 = zzjaVar4.zzf;
        if (zzscVar4 == null) {
            zzscVar4 = null;
        }
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = 2;
        zzE = zzjaVar4.zzE(zzscVar4, this);
    }
}
