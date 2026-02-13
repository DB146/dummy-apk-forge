package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzyy extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzyr();
    zzyx zza;
    int zzb;
    int zzc;
    final zzyx zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzyt zzh;
    private zzyv zzi;

    public zzyy() {
        this(zze, true);
    }

    public zzyy(Comparator comparator, boolean z8) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z8;
        this.zzd = new zzyx(z8);
    }

    public zzyy(boolean z8) {
        this(zze, false);
    }

    private final void zzf(zzyx zzyxVar, boolean z8) {
        while (zzyxVar != null) {
            zzyx zzyxVar2 = zzyxVar.zzb;
            zzyx zzyxVar3 = zzyxVar.zzc;
            int i7 = zzyxVar2 != null ? zzyxVar2.zzi : 0;
            int i10 = zzyxVar3 != null ? zzyxVar3.zzi : 0;
            int i11 = i7 - i10;
            if (i11 == -2) {
                zzyx zzyxVar4 = zzyxVar3.zzb;
                zzyx zzyxVar5 = zzyxVar3.zzc;
                int i12 = (zzyxVar4 != null ? zzyxVar4.zzi : 0) - (zzyxVar5 != null ? zzyxVar5.zzi : 0);
                if (i12 == -1 || (i12 == 0 && !z8)) {
                    zzh(zzyxVar);
                } else {
                    zzi(zzyxVar3);
                    zzh(zzyxVar);
                }
                if (z8) {
                    return;
                }
            } else if (i11 == 2) {
                zzyx zzyxVar6 = zzyxVar2.zzb;
                zzyx zzyxVar7 = zzyxVar2.zzc;
                int i13 = (zzyxVar6 != null ? zzyxVar6.zzi : 0) - (zzyxVar7 != null ? zzyxVar7.zzi : 0);
                if (i13 == 1 || (i13 == 0 && !z8)) {
                    zzi(zzyxVar);
                } else {
                    zzh(zzyxVar2);
                    zzi(zzyxVar);
                }
                if (z8) {
                    return;
                }
            } else if (i11 == 0) {
                zzyxVar.zzi = i7 + 1;
                if (z8) {
                    return;
                }
            } else {
                zzyxVar.zzi = Math.max(i7, i10) + 1;
                if (!z8) {
                    return;
                }
            }
            zzyxVar = zzyxVar.zza;
        }
    }

    private final void zzg(zzyx zzyxVar, zzyx zzyxVar2) {
        zzyx zzyxVar3 = zzyxVar.zza;
        zzyxVar.zza = null;
        if (zzyxVar2 != null) {
            zzyxVar2.zza = zzyxVar3;
        }
        if (zzyxVar3 == null) {
            this.zza = zzyxVar2;
        } else if (zzyxVar3.zzb == zzyxVar) {
            zzyxVar3.zzb = zzyxVar2;
        } else {
            zzyxVar3.zzc = zzyxVar2;
        }
    }

    private final void zzh(zzyx zzyxVar) {
        zzyx zzyxVar2 = zzyxVar.zzb;
        zzyx zzyxVar3 = zzyxVar.zzc;
        zzyx zzyxVar4 = zzyxVar3.zzb;
        zzyx zzyxVar5 = zzyxVar3.zzc;
        zzyxVar.zzc = zzyxVar4;
        if (zzyxVar4 != null) {
            zzyxVar4.zza = zzyxVar;
        }
        zzg(zzyxVar, zzyxVar3);
        zzyxVar3.zzb = zzyxVar;
        zzyxVar.zza = zzyxVar3;
        int max = Math.max(zzyxVar2 != null ? zzyxVar2.zzi : 0, zzyxVar4 != null ? zzyxVar4.zzi : 0) + 1;
        zzyxVar.zzi = max;
        zzyxVar3.zzi = Math.max(max, zzyxVar5 != null ? zzyxVar5.zzi : 0) + 1;
    }

    private final void zzi(zzyx zzyxVar) {
        zzyx zzyxVar2 = zzyxVar.zzb;
        zzyx zzyxVar3 = zzyxVar.zzc;
        zzyx zzyxVar4 = zzyxVar2.zzb;
        zzyx zzyxVar5 = zzyxVar2.zzc;
        zzyxVar.zzb = zzyxVar5;
        if (zzyxVar5 != null) {
            zzyxVar5.zza = zzyxVar;
        }
        zzg(zzyxVar, zzyxVar2);
        zzyxVar2.zzc = zzyxVar;
        zzyxVar.zza = zzyxVar2;
        int max = Math.max(zzyxVar3 != null ? zzyxVar3.zzi : 0, zzyxVar5 != null ? zzyxVar5.zzi : 0) + 1;
        zzyxVar.zzi = max;
        zzyxVar2.zzi = Math.max(max, zzyxVar4 != null ? zzyxVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzyx zzyxVar = this.zzd;
        zzyxVar.zze = zzyxVar;
        zzyxVar.zzd = zzyxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzc(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzyt zzytVar = this.zzh;
        if (zzytVar != null) {
            return zzytVar;
        }
        zzyt zzytVar2 = new zzyt(this);
        this.zzh = zzytVar2;
        return zzytVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzyx zzc = zzc(obj);
        if (zzc != null) {
            return zzc.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzyv zzyvVar = this.zzi;
        if (zzyvVar != null) {
            return zzyvVar;
        }
        zzyv zzyvVar2 = new zzyv(this);
        this.zzi = zzyvVar2;
        return zzyvVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzyx zza = zza(obj, true);
        Object obj3 = zza.zzh;
        zza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzyx zzd = zzd(obj);
        if (zzd != null) {
            return zzd.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    public final zzyx zza(Object obj, boolean z8) {
        int i7;
        zzyx zzyxVar;
        Comparator comparator = this.zzf;
        zzyx zzyxVar2 = this.zza;
        if (zzyxVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                i7 = comparable != null ? comparable.compareTo(zzyxVar2.zzf) : comparator.compare(obj, zzyxVar2.zzf);
                if (i7 == 0) {
                    return zzyxVar2;
                }
                zzyx zzyxVar3 = i7 < 0 ? zzyxVar2.zzb : zzyxVar2.zzc;
                if (zzyxVar3 == null) {
                    break;
                }
                zzyxVar2 = zzyxVar3;
            }
        } else {
            i7 = 0;
        }
        if (!z8) {
            return null;
        }
        zzyx zzyxVar4 = this.zzd;
        if (zzyxVar2 != null) {
            zzyxVar = new zzyx(this.zzg, zzyxVar2, obj, zzyxVar4, zzyxVar4.zze);
            if (i7 < 0) {
                zzyxVar2.zzb = zzyxVar;
            } else {
                zzyxVar2.zzc = zzyxVar;
            }
            zzf(zzyxVar2, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzyxVar = new zzyx(this.zzg, null, obj, zzyxVar4, zzyxVar4.zze);
            this.zza = zzyxVar;
        }
        this.zzb++;
        this.zzc++;
        return zzyxVar;
    }

    public final zzyx zzb(Map.Entry entry) {
        zzyx zzc = zzc(entry.getKey());
        if (zzc == null) {
            return null;
        }
        Object obj = zzc.zzh;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return zzc;
        }
        return null;
    }

    public final zzyx zzc(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return zza(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final zzyx zzd(Object obj) {
        zzyx zzc = zzc(obj);
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
    
        r1 = r8.zzi;
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
    
        r2 = r8.zzi;
        r0.zzc = r8;
        r8.zza = r0;
        r7.zzc = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r0.zzi = java.lang.Math.max(r1, r2) + 1;
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
    
        if (r8.zzi > r0.zzi) goto L9;
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
    public final void zze(zzyx zzyxVar, boolean z8) {
        if (z8) {
            zzyx zzyxVar2 = zzyxVar.zze;
            zzyxVar2.zzd = zzyxVar.zzd;
            zzyxVar.zzd.zze = zzyxVar2;
        }
        zzyx zzyxVar3 = zzyxVar.zzb;
        zzyx zzyxVar4 = zzyxVar.zzc;
        zzyx zzyxVar5 = zzyxVar.zza;
        int i7 = 0;
        if (zzyxVar3 == null || zzyxVar4 == null) {
            if (zzyxVar3 != null) {
                zzg(zzyxVar, zzyxVar3);
                zzyxVar.zzb = null;
            } else if (zzyxVar4 != null) {
                zzg(zzyxVar, zzyxVar4);
                zzyxVar.zzc = null;
            } else {
                zzg(zzyxVar, null);
            }
            zzf(zzyxVar5, false);
            this.zzb--;
            this.zzc++;
        }
    }
}
