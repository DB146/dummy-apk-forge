package com.google.ads.interactivemedia.v3.internal;

import h3.o;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class zzwm {
    static final zzwf zza = zzwe.IDENTITY;
    static final zzxg zzb = zzxf.DOUBLE;
    static final zzxg zzc = zzxf.LAZILY_PARSED_NUMBER;
    public static final /* synthetic */ int zzn = 0;
    final List zzd;
    final zzyn zze;
    final zzwf zzf;
    final Map zzg;
    final boolean zzh;
    final List zzi;
    final List zzj;
    final zzxg zzk;
    final zzxg zzl;
    final List zzm;
    private final ThreadLocal zzo;
    private final ConcurrentMap zzp;
    private final zzyl zzq;
    private final zzzt zzr;

    public zzwm() {
        zzyn zzynVar = zzyn.zza;
        throw null;
    }

    public zzwm(zzyn zzynVar, zzwf zzwfVar, Map map, boolean z8, boolean z10, boolean z11, boolean z12, zzwg zzwgVar, boolean z13, boolean z14, boolean z15, int i7, String str, int i10, int i11, List list, List list2, List list3, zzxg zzxgVar, zzxg zzxgVar2, List list4) {
        this.zzo = new ThreadLocal();
        this.zzp = new ConcurrentHashMap();
        this.zze = zzynVar;
        this.zzf = zzwfVar;
        this.zzg = map;
        zzyl zzylVar = new zzyl(map, true, list4);
        this.zzq = zzylVar;
        this.zzh = true;
        this.zzi = list;
        this.zzj = list2;
        this.zzk = zzxgVar;
        this.zzl = zzxgVar2;
        this.zzm = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzaby.zzW);
        arrayList.add(zzaaa.zza(zzxgVar));
        arrayList.add(zzynVar);
        arrayList.addAll(list3);
        arrayList.add(zzaby.zzC);
        arrayList.add(zzaby.zzm);
        arrayList.add(zzaby.zzg);
        arrayList.add(zzaby.zzi);
        arrayList.add(zzaby.zzk);
        zzxi zzxiVar = zzaby.zzt;
        arrayList.add(zzaby.zzc(Long.TYPE, Long.class, zzxiVar));
        arrayList.add(zzaby.zzc(Double.TYPE, Double.class, new zzwh(this)));
        arrayList.add(zzaby.zzc(Float.TYPE, Float.class, new zzwi(this)));
        arrayList.add(zzzx.zza(zzxgVar2));
        arrayList.add(zzaby.zzo);
        arrayList.add(zzaby.zzq);
        arrayList.add(zzaby.zzb(AtomicLong.class, new zzwj(zzxiVar).nullSafe()));
        arrayList.add(zzaby.zzb(AtomicLongArray.class, new zzwk(zzxiVar).nullSafe()));
        arrayList.add(zzaby.zzs);
        arrayList.add(zzaby.zzx);
        arrayList.add(zzaby.zzE);
        arrayList.add(zzaby.zzG);
        arrayList.add(zzaby.zzb(BigDecimal.class, zzaby.zzz));
        arrayList.add(zzaby.zzb(BigInteger.class, zzaby.zzA));
        arrayList.add(zzaby.zzb(zzyq.class, zzaby.zzB));
        arrayList.add(zzaby.zzI);
        arrayList.add(zzaby.zzK);
        arrayList.add(zzaby.zzO);
        arrayList.add(zzaby.zzQ);
        arrayList.add(zzaby.zzU);
        arrayList.add(zzaby.zzM);
        arrayList.add(zzaby.zzd);
        arrayList.add(zzzq.zza);
        arrayList.add(zzaby.zzS);
        if (zzacs.zza) {
            arrayList.add(zzacs.zze);
            arrayList.add(zzacs.zzd);
            arrayList.add(zzacs.zzf);
        }
        arrayList.add(zzzm.zza);
        arrayList.add(zzaby.zzb);
        arrayList.add(new zzzo(zzylVar));
        arrayList.add(new zzzv(zzylVar, false));
        zzzt zzztVar = new zzzt(zzylVar);
        this.zzr = zzztVar;
        arrayList.add(zzztVar);
        arrayList.add(zzaby.zzX);
        arrayList.add(new zzaag(zzylVar, zzwfVar, zzynVar, zzztVar, list4));
        this.zzd = Collections.unmodifiableList(arrayList);
    }

    public static void zzg(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final String toString() {
        return o.n("{serializeNulls:false,factories:", String.valueOf(this.zzd), ",instanceCreators:", this.zzq.toString(), "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r2.zzb(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzxi zza(zzact zzactVar) {
        boolean z8;
        zzxi zzxiVar = (zzxi) this.zzp.get(zzactVar);
        if (zzxiVar != null) {
            return zzxiVar;
        }
        Map map = (Map) this.zzo.get();
        if (map == null) {
            map = new HashMap();
            this.zzo.set(map);
            z8 = true;
        } else {
            zzxi zzxiVar2 = (zzxi) map.get(zzactVar);
            if (zzxiVar2 != null) {
                return zzxiVar2;
            }
            z8 = false;
        }
        try {
            zzwl zzwlVar = new zzwl();
            map.put(zzactVar, zzwlVar);
            Iterator it = this.zzd.iterator();
            zzxi zzxiVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zzxiVar3 = ((zzxj) it.next()).zza(this, zzactVar);
                if (zzxiVar3 != null) {
                    break;
                }
            }
            if (z8) {
                this.zzo.remove();
            }
            if (zzxiVar3 == null) {
                throw new IllegalArgumentException("GSON (${project.version}) cannot handle ".concat(zzactVar.toString()));
            }
            if (z8) {
                this.zzp.putAll(map);
            }
            return zzxiVar3;
        } catch (Throwable th) {
            if (z8) {
                this.zzo.remove();
            }
            throw th;
        }
    }

    public final zzxi zzb(zzxj zzxjVar, zzact zzactVar) {
        if (!this.zzd.contains(zzxjVar)) {
            zzxjVar = this.zzr;
        }
        boolean z8 = false;
        for (zzxj zzxjVar2 : this.zzd) {
            if (z8) {
                zzxi zza2 = zzxjVar2.zza(this, zzactVar);
                if (zza2 != null) {
                    return zza2;
                }
            } else if (zzxjVar2 == zzxjVar) {
                z8 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(zzactVar)));
    }

    public final zzacx zzc(Writer writer) {
        zzacx zzacxVar = new zzacx(writer);
        zzacxVar.zzm(null);
        zzacxVar.zzn(this.zzh);
        zzacxVar.zzo(false);
        zzacxVar.zzp(false);
        return zzacxVar;
    }

    public final Object zzd(zzacv zzacvVar, zzact zzactVar) {
        boolean zzr = zzacvVar.zzr();
        boolean z8 = true;
        zzacvVar.zzo(true);
        try {
            try {
                try {
                    try {
                        zzacvVar.zzt();
                        try {
                            return zza(zzactVar).read(zzacvVar);
                        } catch (EOFException e2) {
                            e = e2;
                            z8 = false;
                            if (!z8) {
                                throw new zzwz(e);
                            }
                            zzacvVar.zzo(zzr);
                            return null;
                        }
                    } catch (IOException e10) {
                        throw new zzwz(e10);
                    }
                } catch (AssertionError e11) {
                    throw new AssertionError("AssertionError (GSON ${project.version}): " + e11.getMessage(), e11);
                } catch (IllegalStateException e12) {
                    throw new zzwz(e12);
                }
            } finally {
                zzacvVar.zzo(zzr);
            }
        } catch (EOFException e13) {
            e = e13;
        }
    }

    public final Object zze(String str, Class cls) {
        Object obj;
        zzact zza2 = zzact.zza(cls);
        if (str == null) {
            obj = null;
        } else {
            zzacv zzacvVar = new zzacv(new StringReader(str));
            zzacvVar.zzo(false);
            Object zzd = zzd(zzacvVar, zza2);
            if (zzd != null) {
                try {
                    if (zzacvVar.zzt() != 10) {
                        throw new zzwz("JSON document was not fully consumed.");
                    }
                } catch (zzacy e2) {
                    throw new zzwz(e2);
                } catch (IOException e10) {
                    throw new zzws(e10);
                }
            }
            obj = zzd;
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(obj);
    }

    public final String zzf(Object obj) {
        if (obj == null) {
            zzwr zzwrVar = zzwt.zza;
            StringWriter stringWriter = new StringWriter();
            try {
                zzh(zzwrVar, zzc(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new zzws(e2);
            }
        }
        StringWriter stringWriter2 = new StringWriter();
        try {
            zzi(obj, obj.getClass(), zzc(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new zzws(e10);
        }
    }

    public final void zzh(zzwr zzwrVar, zzacx zzacxVar) {
        boolean zzs = zzacxVar.zzs();
        zzacxVar.zzo(true);
        boolean zzr = zzacxVar.zzr();
        zzacxVar.zzn(this.zzh);
        boolean zzq = zzacxVar.zzq();
        zzacxVar.zzp(false);
        try {
            try {
                zzaby.zzV.write(zzacxVar, zzwrVar);
            } catch (IOException e2) {
                throw new zzws(e2);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON ${project.version}): " + e10.getMessage(), e10);
            }
        } finally {
            zzacxVar.zzo(zzs);
            zzacxVar.zzn(zzr);
            zzacxVar.zzp(zzq);
        }
    }

    public final void zzi(Object obj, Type type, zzacx zzacxVar) {
        zzxi zza2 = zza(zzact.zzb(type));
        boolean zzs = zzacxVar.zzs();
        zzacxVar.zzo(true);
        boolean zzr = zzacxVar.zzr();
        zzacxVar.zzn(this.zzh);
        boolean zzq = zzacxVar.zzq();
        zzacxVar.zzp(false);
        try {
            try {
                zza2.write(zzacxVar, obj);
            } catch (IOException e2) {
                throw new zzws(e2);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON ${project.version}): " + e10.getMessage(), e10);
            }
        } finally {
            zzacxVar.zzo(zzs);
            zzacxVar.zzn(zzr);
            zzacxVar.zzp(zzq);
        }
    }
}
