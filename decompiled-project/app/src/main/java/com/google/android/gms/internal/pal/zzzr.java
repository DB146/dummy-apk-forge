package com.google.android.gms.internal.pal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzzr extends AbstractMap implements Serializable {
    private static final Comparator zzf = new zzzk();
    final Comparator zza;
    zzzq zzb;
    int zzc;
    int zzd;
    final zzzq zze;
    private zzzm zzg;
    private zzzo zzh;

    public zzzr() {
        Comparator comparator = zzf;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = new zzzq();
        this.zza = comparator;
    }

    private final void zzf(zzzq zzzqVar, boolean z8) {
        while (zzzqVar != null) {
            zzzq zzzqVar2 = zzzqVar.zzb;
            zzzq zzzqVar3 = zzzqVar.zzc;
            int i7 = zzzqVar2 != null ? zzzqVar2.zzh : 0;
            int i10 = zzzqVar3 != null ? zzzqVar3.zzh : 0;
            int i11 = i7 - i10;
            if (i11 == -2) {
                zzzq zzzqVar4 = zzzqVar3.zzb;
                zzzq zzzqVar5 = zzzqVar3.zzc;
                int i12 = (zzzqVar4 != null ? zzzqVar4.zzh : 0) - (zzzqVar5 != null ? zzzqVar5.zzh : 0);
                if (i12 == -1 || (i12 == 0 && !z8)) {
                    zzh(zzzqVar);
                } else {
                    zzi(zzzqVar3);
                    zzh(zzzqVar);
                }
                if (z8) {
                    return;
                }
            } else if (i11 == 2) {
                zzzq zzzqVar6 = zzzqVar2.zzb;
                zzzq zzzqVar7 = zzzqVar2.zzc;
                int i13 = (zzzqVar6 != null ? zzzqVar6.zzh : 0) - (zzzqVar7 != null ? zzzqVar7.zzh : 0);
                if (i13 == 1 || (i13 == 0 && !z8)) {
                    zzi(zzzqVar);
                } else {
                    zzh(zzzqVar2);
                    zzi(zzzqVar);
                }
                if (z8) {
                    return;
                }
            } else if (i11 == 0) {
                zzzqVar.zzh = i7 + 1;
                if (z8) {
                    return;
                }
            } else {
                zzzqVar.zzh = Math.max(i7, i10) + 1;
                if (!z8) {
                    return;
                }
            }
            zzzqVar = zzzqVar.zza;
        }
    }

    private final void zzg(zzzq zzzqVar, zzzq zzzqVar2) {
        zzzq zzzqVar3 = zzzqVar.zza;
        zzzqVar.zza = null;
        if (zzzqVar2 != null) {
            zzzqVar2.zza = zzzqVar3;
        }
        if (zzzqVar3 == null) {
            this.zzb = zzzqVar2;
        } else if (zzzqVar3.zzb == zzzqVar) {
            zzzqVar3.zzb = zzzqVar2;
        } else {
            zzzqVar3.zzc = zzzqVar2;
        }
    }

    private final void zzh(zzzq zzzqVar) {
        zzzq zzzqVar2 = zzzqVar.zzb;
        zzzq zzzqVar3 = zzzqVar.zzc;
        zzzq zzzqVar4 = zzzqVar3.zzb;
        zzzq zzzqVar5 = zzzqVar3.zzc;
        zzzqVar.zzc = zzzqVar4;
        if (zzzqVar4 != null) {
            zzzqVar4.zza = zzzqVar;
        }
        zzg(zzzqVar, zzzqVar3);
        zzzqVar3.zzb = zzzqVar;
        zzzqVar.zza = zzzqVar3;
        int max = Math.max(zzzqVar2 != null ? zzzqVar2.zzh : 0, zzzqVar4 != null ? zzzqVar4.zzh : 0) + 1;
        zzzqVar.zzh = max;
        zzzqVar3.zzh = Math.max(max, zzzqVar5 != null ? zzzqVar5.zzh : 0) + 1;
    }

    private final void zzi(zzzq zzzqVar) {
        zzzq zzzqVar2 = zzzqVar.zzb;
        zzzq zzzqVar3 = zzzqVar.zzc;
        zzzq zzzqVar4 = zzzqVar2.zzb;
        zzzq zzzqVar5 = zzzqVar2.zzc;
        zzzqVar.zzb = zzzqVar5;
        if (zzzqVar5 != null) {
            zzzqVar5.zza = zzzqVar;
        }
        zzg(zzzqVar, zzzqVar2);
        zzzqVar2.zzc = zzzqVar;
        zzzqVar.zza = zzzqVar2;
        int max = Math.max(zzzqVar3 != null ? zzzqVar3.zzh : 0, zzzqVar5 != null ? zzzqVar5.zzh : 0) + 1;
        zzzqVar.zzh = max;
        zzzqVar2.zzh = Math.max(max, zzzqVar4 != null ? zzzqVar4.zzh : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zzb = null;
        this.zzc = 0;
        this.zzd++;
        zzzq zzzqVar = this.zze;
        zzzqVar.zze = zzzqVar;
        zzzqVar.zzd = zzzqVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzc(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzzm zzzmVar = this.zzg;
        if (zzzmVar != null) {
            return zzzmVar;
        }
        zzzm zzzmVar2 = new zzzm(this);
        this.zzg = zzzmVar2;
        return zzzmVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzzq zzc = zzc(obj);
        if (zzc != null) {
            return zzc.zzg;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzzo zzzoVar = this.zzh;
        if (zzzoVar != null) {
            return zzzoVar;
        }
        zzzo zzzoVar2 = new zzzo(this);
        this.zzh = zzzoVar2;
        return zzzoVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        zzzq zza = zza(obj, true);
        Object obj3 = zza.zzg;
        zza.zzg = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzzq zzd = zzd(obj);
        if (zzd != null) {
            return zzd.zzg;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc;
    }

    public final zzzq zza(Object obj, boolean z8) {
        int i7;
        zzzq zzzqVar;
        Comparator comparator = this.zza;
        zzzq zzzqVar2 = this.zzb;
        if (zzzqVar2 != null) {
            Comparable comparable = comparator == zzf ? (Comparable) obj : null;
            while (true) {
                i7 = comparable != null ? comparable.compareTo(zzzqVar2.zzf) : comparator.compare(obj, zzzqVar2.zzf);
                if (i7 == 0) {
                    return zzzqVar2;
                }
                zzzq zzzqVar3 = i7 < 0 ? zzzqVar2.zzb : zzzqVar2.zzc;
                if (zzzqVar3 == null) {
                    break;
                }
                zzzqVar2 = zzzqVar3;
            }
        } else {
            i7 = 0;
        }
        if (!z8) {
            return null;
        }
        zzzq zzzqVar4 = this.zze;
        if (zzzqVar2 != null) {
            zzzqVar = new zzzq(zzzqVar2, obj, zzzqVar4, zzzqVar4.zze);
            if (i7 < 0) {
                zzzqVar2.zzb = zzzqVar;
            } else {
                zzzqVar2.zzc = zzzqVar;
            }
            zzf(zzzqVar2, true);
        } else {
            if (comparator == zzf && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzzqVar = new zzzq(null, obj, zzzqVar4, zzzqVar4.zze);
            this.zzb = zzzqVar;
        }
        this.zzc++;
        this.zzd++;
        return zzzqVar;
    }

    public final zzzq zzb(Map.Entry entry) {
        zzzq zzc = zzc(entry.getKey());
        if (zzc == null) {
            return null;
        }
        Object obj = zzc.zzg;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return zzc;
        }
        return null;
    }

    public final zzzq zzc(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final zzzq zzd(Object obj) {
        zzzq zzc = zzc(obj);
        if (zzc != null) {
            zze(zzc, true);
        }
        return zzc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        zze(r0, false);
        r8 = r7.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r1 = r8.zzh;
        r0.zzb = r8;
        r8.zza = r0;
        r7.zzb = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r8 = r7.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        r2 = r8.zzh;
        r0.zzc = r8;
        r8.zza = r0;
        r7.zzc = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r0.zzh = java.lang.Math.max(r1, r2) + 1;
        zzg(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0026, code lost:
    
        r5 = r0;
        r0 = r0.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r8.zzh > r0.zzh) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r0 = r8;
        r8 = r8.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r8 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzzq zzzqVar, boolean z8) {
        if (z8) {
            zzzq zzzqVar2 = zzzqVar.zze;
            zzzqVar2.zzd = zzzqVar.zzd;
            zzzqVar.zzd.zze = zzzqVar2;
        }
        zzzq zzzqVar3 = zzzqVar.zzb;
        zzzq zzzqVar4 = zzzqVar.zzc;
        zzzq zzzqVar5 = zzzqVar.zza;
        int i7 = 0;
        if (zzzqVar3 == null || zzzqVar4 == null) {
            if (zzzqVar3 != null) {
                zzg(zzzqVar, zzzqVar3);
                zzzqVar.zzb = null;
            } else if (zzzqVar4 != null) {
                zzg(zzzqVar, zzzqVar4);
                zzzqVar.zzc = null;
            } else {
                zzg(zzzqVar, null);
            }
            zzf(zzzqVar5, false);
            this.zzc--;
            this.zzd++;
        }
    }
}
