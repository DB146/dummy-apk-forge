package Y5;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzpq;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: Y5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11628b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f11629c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f11630d;

    /* renamed from: e, reason: collision with root package name */
    public Long f11631e;

    /* renamed from: f, reason: collision with root package name */
    public Long f11632f;
    public final /* synthetic */ int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0603c f11633h;

    /* renamed from: i, reason: collision with root package name */
    public final zzme f11634i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0600b(C0603c c0603c, String str, int i7, zzff zzffVar) {
        this(str, i7);
        this.g = 0;
        Objects.requireNonNull(c0603c);
        this.f11633h = c0603c;
        this.f11634i = zzffVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0600b(C0603c c0603c, String str, int i7, zzfn zzfnVar) {
        this(str, i7);
        this.g = 1;
        Objects.requireNonNull(c0603c);
        this.f11633h = c0603c;
        this.f11634i = zzfnVar;
    }

    public C0600b(String str, int i7) {
        this.f11627a = str;
        this.f11628b = i7;
    }

    public static Boolean c(Boolean bool, boolean z8) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z8);
    }

    public static Boolean d(String str, zzfr zzfrVar, W w10) {
        List zzf;
        com.google.android.gms.common.internal.G.g(zzfrVar);
        if (str == null || !zzfrVar.zza() || zzfrVar.zzj() == 1) {
            return null;
        }
        if (zzfrVar.zzj() == 7) {
            if (zzfrVar.zzg() == 0) {
                return null;
            }
        } else if (!zzfrVar.zzb()) {
            return null;
        }
        int zzj = zzfrVar.zzj();
        boolean zze = zzfrVar.zze();
        String zzc = (zze || zzj == 2 || zzj == 7) ? zzfrVar.zzc() : zzfrVar.zzc().toUpperCase(Locale.ENGLISH);
        if (zzfrVar.zzg() == 0) {
            zzf = null;
        } else {
            zzf = zzfrVar.zzf();
            if (!zze) {
                ArrayList arrayList = new ArrayList(zzf.size());
                Iterator it = zzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                zzf = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = zzj == 2 ? zzc : null;
        if (zzj == 7) {
            if (zzf == null || zzf.isEmpty()) {
                return null;
            }
        } else if (zzc == null) {
            return null;
        }
        if (!zze && zzj != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzj - 1) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, true != zze ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (w10 == null) {
                        return null;
                    }
                    w10.f11580w.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(zzc));
            case 3:
                return Boolean.valueOf(str.endsWith(zzc));
            case 4:
                return Boolean.valueOf(str.contains(zzc));
            case 5:
                return Boolean.valueOf(str.equals(zzc));
            case 6:
                if (zzf == null) {
                    return null;
                }
                return Boolean.valueOf(zzf.contains(str));
            default:
                return null;
        }
    }

    public static Boolean e(long j, zzfl zzflVar) {
        try {
            return f(new BigDecimal(j), zzflVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean f(BigDecimal bigDecimal, zzfl zzflVar, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.G.g(zzflVar);
        if (zzflVar.zza()) {
            if (zzflVar.zzm() != 1) {
                if (zzflVar.zzm() == 5) {
                    if (!zzflVar.zzf() || !zzflVar.zzh()) {
                        return null;
                    }
                } else if (!zzflVar.zzd()) {
                    return null;
                }
                int zzm = zzflVar.zzm();
                if (zzflVar.zzm() == 5) {
                    if (C0598a0.p0(zzflVar.zzg()) && C0598a0.p0(zzflVar.zzi())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(zzflVar.zzg());
                            bigDecimal4 = new BigDecimal(zzflVar.zzi());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C0598a0.p0(zzflVar.zze())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(zzflVar.zze());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (zzm == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i7 = zzm - 1;
                if (i7 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i7 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i7 != 3) {
                    if (i7 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d10 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x039d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0395  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Long l10, Long l11, zzhs zzhsVar, long j, C0645q c0645q, boolean z8) {
        Boolean bool;
        Iterator it;
        u.T t5;
        Boolean f4;
        Boolean bool2;
        zzpq.zza();
        C0603c c0603c = this.f11633h;
        C0646q0 c0646q0 = (C0646q0) c0603c.f3094a;
        C0615g c0615g = c0646q0.f11910d;
        E e2 = F.f11264F0;
        String str = this.f11627a;
        boolean T10 = c0615g.T(str, e2);
        zzff zzffVar = (zzff) this.f11634i;
        long j10 = zzffVar.zzm() ? c0645q.f11885e : j;
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        boolean isLoggable = Log.isLoggable(w10.T(), 2);
        boolean z10 = false;
        U u3 = w10.f11573B;
        int i7 = this.f11628b;
        Q q10 = c0646q0.f11916x;
        if (isLoggable) {
            C0646q0.l(w10);
            u3.d("Evaluating filter. audience, filter, event", Integer.valueOf(i7), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null, q10.a(zzffVar.zzc()));
            C0646q0.l(w10);
            C0598a0 c0598a0 = c0603c.f12021b.f11409u;
            I1.S(c0598a0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nevent_filter {\n");
            if (zzffVar.zza()) {
                C0598a0.b0(sb2, 0, "filter_id", Integer.valueOf(zzffVar.zzb()));
            }
            C0598a0.b0(sb2, 0, "event_name", ((C0646q0) c0598a0.f3094a).f11916x.a(zzffVar.zzc()));
            String X10 = C0598a0.X(zzffVar.zzi(), zzffVar.zzj(), zzffVar.zzm());
            if (!X10.isEmpty()) {
                C0598a0.b0(sb2, 0, "filter_type", X10);
            }
            if (zzffVar.zzg()) {
                C0598a0.c0(sb2, 1, "event_count_filter", zzffVar.zzh());
            }
            if (zzffVar.zze() > 0) {
                sb2.append("  filters {\n");
                Iterator it2 = zzffVar.zzd().iterator();
                while (it2.hasNext()) {
                    c0598a0.U(sb2, 2, (zzfh) it2.next());
                }
            }
            C0598a0.V(1, sb2);
            sb2.append("}\n}\n");
            u3.b(sb2.toString(), "Filter definition");
        }
        boolean zza = zzffVar.zza();
        U u10 = w10.f11580w;
        if (!zza || zzffVar.zzb() > 256) {
            C0646q0.l(w10);
            u10.c("Invalid event filter ID. appId, id", W.R(str), String.valueOf(zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null));
            return false;
        }
        boolean z11 = zzffVar.zzi() || zzffVar.zzj() || zzffVar.zzm();
        if (z8 && !z11) {
            C0646q0.l(w10);
            u3.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i7), zzffVar.zza() ? Integer.valueOf(zzffVar.zzb()) : null);
            return true;
        }
        String zzd = zzhsVar.zzd();
        if (zzffVar.zzg()) {
            Boolean e10 = e(j10, zzffVar.zzh());
            if (e10 != null) {
                if (!e10.booleanValue()) {
                    bool = Boolean.FALSE;
                    C0646q0.l(w10);
                    u3.b(bool == null ? "null" : bool, "Event filter result");
                    if (bool == null) {
                        return false;
                    }
                    Boolean bool3 = Boolean.TRUE;
                    this.f11629c = bool3;
                    if (!bool.booleanValue()) {
                        return true;
                    }
                    this.f11630d = bool3;
                    if (!z11 || !zzhsVar.zze()) {
                        return true;
                    }
                    Long valueOf = Long.valueOf(zzhsVar.zzf());
                    if (zzffVar.zzj()) {
                        if (T10 && zzffVar.zzg()) {
                            valueOf = l10;
                        }
                        this.f11632f = valueOf;
                        return true;
                    }
                    if (T10 && zzffVar.zzg()) {
                        valueOf = l11;
                    }
                    this.f11631e = valueOf;
                    return true;
                }
            }
            bool = null;
            C0646q0.l(w10);
            u3.b(bool == null ? "null" : bool, "Event filter result");
            if (bool == null) {
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = zzffVar.zzd().iterator();
        while (true) {
            if (!it3.hasNext()) {
                u.T t10 = new u.T(0);
                Iterator it4 = zzhsVar.zza().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        Iterator it5 = zzffVar.zzd().iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                bool = Boolean.TRUE;
                                break;
                            }
                            zzfh zzfhVar = (zzfh) it5.next();
                            boolean z12 = (zzfhVar.zze() && zzfhVar.zzf()) ? true : z10;
                            String zzh = zzfhVar.zzh();
                            if (zzh.isEmpty()) {
                                C0646q0.l(w10);
                                u10.b(q10.a(zzd), "Event has empty param name. event");
                                break;
                            }
                            Object obj = t10.get(zzh);
                            if (obj instanceof Long) {
                                if (!zzfhVar.zzc()) {
                                    C0646q0.l(w10);
                                    u10.c("No number filter for long param. event, param", q10.a(zzd), q10.b(zzh));
                                    break;
                                }
                                Boolean e11 = e(((Long) obj).longValue(), zzfhVar.zzd());
                                if (e11 == null) {
                                    break;
                                }
                                if (e11.booleanValue() == z12) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                z10 = false;
                            } else if (obj instanceof Double) {
                                if (!zzfhVar.zzc()) {
                                    C0646q0.l(w10);
                                    u10.c("No number filter for double param. event, param", q10.a(zzd), q10.b(zzh));
                                    break;
                                }
                                double doubleValue = ((Double) obj).doubleValue();
                                try {
                                    bool2 = f(new BigDecimal(doubleValue), zzfhVar.zzd(), Math.ulp(doubleValue));
                                } catch (NumberFormatException unused) {
                                    bool2 = null;
                                }
                                if (bool2 == null) {
                                    break;
                                }
                                if (bool2.booleanValue() == z12) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                z10 = false;
                            } else if (obj instanceof String) {
                                if (!zzfhVar.zza()) {
                                    if (!zzfhVar.zzc()) {
                                        C0646q0.l(w10);
                                        u10.c("No filter for String param. event, param", q10.a(zzd), q10.b(zzh));
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!C0598a0.p0(str2)) {
                                        C0646q0.l(w10);
                                        u10.c("Invalid param value for number filter. event, param", q10.a(zzd), q10.b(zzh));
                                        break;
                                    }
                                    zzfl zzd2 = zzfhVar.zzd();
                                    if (C0598a0.p0(str2)) {
                                        try {
                                            it = it5;
                                            t5 = t10;
                                            try {
                                                f4 = f(new BigDecimal(str2), zzd2, 0.0d);
                                            } catch (NumberFormatException unused2) {
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    it = it5;
                                    t5 = t10;
                                    f4 = null;
                                } else {
                                    zzfr zzb = zzfhVar.zzb();
                                    C0646q0.l(w10);
                                    f4 = d((String) obj, zzb, w10);
                                    it = it5;
                                    t5 = t10;
                                }
                                if (f4 == null) {
                                    break;
                                }
                                if (f4.booleanValue() == z12) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                t10 = t5;
                                it5 = it;
                                z10 = false;
                            } else if (obj == null) {
                                C0646q0.l(w10);
                                u3.c("Missing param for filter. event, param", q10.a(zzd), q10.b(zzh));
                                bool = Boolean.FALSE;
                            } else {
                                C0646q0.l(w10);
                                u10.c("Unknown param type. event, param", q10.a(zzd), q10.b(zzh));
                            }
                        }
                    } else {
                        zzhw zzhwVar = (zzhw) it4.next();
                        if (hashSet.contains(zzhwVar.zzb())) {
                            if (!zzhwVar.zze()) {
                                if (!zzhwVar.zzi()) {
                                    if (!zzhwVar.zzc()) {
                                        C0646q0.l(w10);
                                        u10.c("Unknown value for param. event, param", q10.a(zzd), q10.b(zzhwVar.zzb()));
                                        break;
                                    }
                                    t10.put(zzhwVar.zzb(), zzhwVar.zzd());
                                } else {
                                    t10.put(zzhwVar.zzb(), zzhwVar.zzi() ? Double.valueOf(zzhwVar.zzj()) : null);
                                }
                            } else {
                                t10.put(zzhwVar.zzb(), zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
                            }
                        }
                    }
                }
            } else {
                zzfh zzfhVar2 = (zzfh) it3.next();
                if (zzfhVar2.zzh().isEmpty()) {
                    C0646q0.l(w10);
                    u10.b(q10.a(zzd), "null or empty param name in filter. event");
                    break;
                }
                hashSet.add(zzfhVar2.zzh());
            }
        }
        C0646q0.l(w10);
        u3.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b(Long l10, Long l11, zziu zziuVar, boolean z8) {
        zzpq.zza();
        C0646q0 c0646q0 = (C0646q0) this.f11633h.f3094a;
        boolean T10 = c0646q0.f11910d.T(this.f11627a, F.f11260D0);
        zzfn zzfnVar = (zzfn) this.f11634i;
        boolean zze = zzfnVar.zze();
        boolean zzf = zzfnVar.zzf();
        boolean zzh = zzfnVar.zzh();
        Object[] objArr = zze || zzf || zzh;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        W w10 = c0646q0.f11912f;
        if (z8 && objArr != true) {
            C0646q0.l(w10);
            w10.f11573B.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f11628b), zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null);
            return true;
        }
        zzfh zzd = zzfnVar.zzd();
        boolean zzf2 = zzd.zzf();
        boolean zzf3 = zziuVar.zzf();
        Q q10 = c0646q0.f11916x;
        if (zzf3) {
            if (zzd.zzc()) {
                bool = c(e(zziuVar.zzg(), zzd.zzd()), zzf2);
            } else {
                C0646q0.l(w10);
                w10.f11580w.b(q10.c(zziuVar.zzc()), "No number filter for long property. property");
            }
        } else if (zziuVar.zzj()) {
            if (zzd.zzc()) {
                double zzk = zziuVar.zzk();
                try {
                    bool3 = f(new BigDecimal(zzk), zzd.zzd(), Math.ulp(zzk));
                } catch (NumberFormatException unused) {
                }
                bool = c(bool3, zzf2);
            } else {
                C0646q0.l(w10);
                w10.f11580w.b(q10.c(zziuVar.zzc()), "No number filter for double property. property");
            }
        } else if (!zziuVar.zzd()) {
            C0646q0.l(w10);
            w10.f11580w.b(q10.c(zziuVar.zzc()), "User property has no value, property");
        } else if (zzd.zza()) {
            String zze2 = zziuVar.zze();
            zzfr zzb = zzd.zzb();
            C0646q0.l(w10);
            bool = c(d(zze2, zzb, w10), zzf2);
        } else if (!zzd.zzc()) {
            C0646q0.l(w10);
            w10.f11580w.b(q10.c(zziuVar.zzc()), "No string or number filter defined. property");
        } else if (C0598a0.p0(zziuVar.zze())) {
            String zze3 = zziuVar.zze();
            zzfl zzd2 = zzd.zzd();
            if (C0598a0.p0(zze3)) {
                try {
                    bool2 = f(new BigDecimal(zze3), zzd2, 0.0d);
                } catch (NumberFormatException unused2) {
                }
            }
            bool = c(bool2, zzf2);
        } else {
            C0646q0.l(w10);
            w10.f11580w.c("Invalid user property value for Numeric number filter. property, value", q10.c(zziuVar.zzc()), zziuVar.zze());
        }
        C0646q0.l(w10);
        w10.f11573B.b(bool == null ? "null" : bool, "Property filter result");
        if (bool == null) {
            return false;
        }
        this.f11629c = Boolean.TRUE;
        if (zzh && !bool.booleanValue()) {
            return true;
        }
        if (!z8 || zzfnVar.zze()) {
            this.f11630d = bool;
        }
        if (bool.booleanValue() && objArr != false && zziuVar.zza()) {
            long zzb2 = zziuVar.zzb();
            if (l10 != null) {
                zzb2 = l10.longValue();
            }
            if (T10 && zzfnVar.zze() && !zzfnVar.zzf() && l11 != null) {
                zzb2 = l11.longValue();
            }
            if (zzfnVar.zzf()) {
                this.f11632f = Long.valueOf(zzb2);
            } else {
                this.f11631e = Long.valueOf(zzb2);
            }
        }
        return true;
    }
}
