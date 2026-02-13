package Y5;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzfh;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzha;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzho;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhv;
import com.google.android.gms.internal.measurement.zzhw;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzis;
import com.google.android.gms.internal.measurement.zzit;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzlq;
import com.google.android.gms.internal.measurement.zzma;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* renamed from: Y5.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598a0 extends D1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0598a0(I1 i12, int i7) {
        super(i12);
        this.f11621d = i7;
    }

    public static C0648s N(zzaa zzaaVar) {
        Object obj;
        Bundle O10 = O(zzaaVar.zzf(), true);
        String obj2 = (!O10.containsKey("_o") || (obj = O10.get("_o")) == null) ? "app" : obj.toString();
        String g = D0.g(zzaaVar.zzb(), D0.f11235a, D0.f11237c);
        if (g == null) {
            g = zzaaVar.zzb();
        }
        return new C0648s(g, new r(O10), obj2, zzaaVar.zza());
    }

    public static Bundle O(Map map, boolean z8) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z8) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList2.add(O((Map) arrayList.get(i7), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void P(zzhr zzhrVar, String str, Long l10) {
        List zza = zzhrVar.zza();
        int i7 = 0;
        while (true) {
            if (i7 >= zza.size()) {
                i7 = -1;
                break;
            } else if (str.equals(((zzhw) zza.get(i7)).zzb())) {
                break;
            } else {
                i7++;
            }
        }
        zzhv zzn = zzhw.zzn();
        zzn.zzb(str);
        zzn.zzf(l10.longValue());
        if (i7 >= 0) {
            zzhrVar.zze(i7, zzn);
        } else {
            zzhrVar.zzg(zzn);
        }
    }

    public static final Bundle Q(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            String zzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putDouble(zzb, zzhwVar.zzj());
            } else if (zzhwVar.zzg()) {
                bundle.putFloat(zzb, zzhwVar.zzh());
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putLong(zzb, zzhwVar.zzf());
            }
        }
        return bundle;
    }

    public static final zzhw R(zzhs zzhsVar, String str) {
        for (zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    public static final Serializable S(zzhs zzhsVar, String str) {
        zzhw R10 = R(zzhsVar, str);
        if (R10 == null) {
            return null;
        }
        return Y(R10);
    }

    public static final void V(int i7, StringBuilder sb2) {
        for (int i10 = 0; i10 < i7; i10++) {
            sb2.append("  ");
        }
    }

    public static final void W(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String X(boolean z8, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z8) {
            sb2.append("Dynamic ");
        }
        if (z10) {
            sb2.append("Sequence ");
        }
        if (z11) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable Y(zzhw zzhwVar) {
        if (zzhwVar.zzc()) {
            return zzhwVar.zzd();
        }
        if (zzhwVar.zze()) {
            return Long.valueOf(zzhwVar.zzf());
        }
        if (zzhwVar.zzi()) {
            return Double.valueOf(zzhwVar.zzj());
        }
        if (zzhwVar.zzm() > 0) {
            return y0(zzhwVar.zzk());
        }
        return null;
    }

    public static final void Z(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                W(builder, str3, string, set);
            }
        }
    }

    public static final void a0(StringBuilder sb2, String str, zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        V(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (zziiVar.zzd() != 0) {
            V(4, sb2);
            sb2.append("results: ");
            int i7 = 0;
            for (Long l10 : zziiVar.zzc()) {
                int i10 = i7 + 1;
                if (i7 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i7 = i10;
            }
            sb2.append('\n');
        }
        if (zziiVar.zzb() != 0) {
            V(4, sb2);
            sb2.append("status: ");
            int i11 = 0;
            for (Long l11 : zziiVar.zza()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zziiVar.zzf() != 0) {
            V(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (zzhq zzhqVar : zziiVar.zze()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzhqVar.zza() ? Integer.valueOf(zzhqVar.zzb()) : null);
                sb2.append(":");
                sb2.append(zzhqVar.zzc() ? Long.valueOf(zzhqVar.zzd()) : null);
                i13 = i14;
            }
            sb2.append("}\n");
        }
        if (zziiVar.zzh() != 0) {
            V(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (zzik zzikVar : zziiVar.zzg()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzikVar.zza() ? Integer.valueOf(zzikVar.zzb()) : null);
                sb2.append(": [");
                Iterator it = zzikVar.zzc().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i17 = i18;
                }
                sb2.append("]");
                i15 = i16;
            }
            sb2.append("}\n");
        }
        V(3, sb2);
        sb2.append("}\n");
    }

    public static final void b0(StringBuilder sb2, int i7, String str, Object obj) {
        if (obj == null) {
            return;
        }
        V(i7 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void c0(StringBuilder sb2, int i7, String str, zzfl zzflVar) {
        if (zzflVar == null) {
            return;
        }
        V(i7, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzflVar.zza()) {
            int zzm = zzflVar.zzm();
            b0(sb2, i7, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzflVar.zzb()) {
            b0(sb2, i7, "match_as_float", Boolean.valueOf(zzflVar.zzc()));
        }
        if (zzflVar.zzd()) {
            b0(sb2, i7, "comparison_value", zzflVar.zze());
        }
        if (zzflVar.zzf()) {
            b0(sb2, i7, "min_comparison_value", zzflVar.zzg());
        }
        if (zzflVar.zzh()) {
            b0(sb2, i7, "max_comparison_value", zzflVar.zzi());
        }
        V(i7, sb2);
        sb2.append("}\n");
    }

    private final void e0() {
    }

    private final void f0() {
    }

    private final void g0() {
    }

    public static boolean p0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean q0(int i7, List list) {
        if (i7 < list.size() * 64) {
            return ((1 << (i7 % 64)) & ((Long) list.get(i7 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList r0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            long j = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i7 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static zznk w0(zzma zzmaVar, byte[] bArr) {
        zzlq zza = zzlq.zza();
        return zza != null ? zzmaVar.zzaV(bArr, zza) : zzmaVar.zzaW(bArr);
    }

    public static int x0(zzic zzicVar, String str) {
        for (int i7 = 0; i7 < zzicVar.zzl(); i7++) {
            if (str.equals(zzicVar.zzm(i7).zzc())) {
                return i7;
            }
        }
        return -1;
    }

    public static Bundle[] y0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (zzhw zzhwVar2 : zzhwVar.zzk()) {
                    if (zzhwVar2.zzc()) {
                        bundle.putString(zzhwVar2.zzb(), zzhwVar2.zzd());
                    } else if (zzhwVar2.zze()) {
                        bundle.putLong(zzhwVar2.zzb(), zzhwVar2.zzf());
                    } else if (zzhwVar2.zzi()) {
                        bundle.putDouble(zzhwVar2.zzb(), zzhwVar2.zzj());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(z0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(z0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(z0((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap z0(Bundle bundle, boolean z8) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z10 = obj instanceof Parcelable[];
            if (!z10 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    @Override // Y5.D1
    public final void M() {
        int i7 = this.f11621d;
    }

    public void T(StringBuilder sb2, int i7, List list) {
        if (list == null) {
            return;
        }
        int i10 = i7 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhw zzhwVar = (zzhw) it.next();
            if (zzhwVar != null) {
                V(i10, sb2);
                sb2.append("param {\n");
                b0(sb2, i10, "name", zzhwVar.zza() ? ((C0646q0) this.f3094a).f11916x.b(zzhwVar.zzb()) : null);
                b0(sb2, i10, "string_value", zzhwVar.zzc() ? zzhwVar.zzd() : null);
                b0(sb2, i10, "int_value", zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
                b0(sb2, i10, "double_value", zzhwVar.zzi() ? Double.valueOf(zzhwVar.zzj()) : null);
                if (zzhwVar.zzm() > 0) {
                    T(sb2, i10, zzhwVar.zzk());
                }
                V(i10, sb2);
                sb2.append("}\n");
            }
        }
    }

    public void U(StringBuilder sb2, int i7, zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        V(i7, sb2);
        sb2.append("filter {\n");
        if (zzfhVar.zze()) {
            b0(sb2, i7, "complement", Boolean.valueOf(zzfhVar.zzf()));
        }
        if (zzfhVar.zzg()) {
            b0(sb2, i7, "param_name", ((C0646q0) this.f3094a).f11916x.b(zzfhVar.zzh()));
        }
        if (zzfhVar.zza()) {
            int i10 = i7 + 1;
            zzfr zzb = zzfhVar.zzb();
            if (zzb != null) {
                V(i10, sb2);
                sb2.append("string_filter {\n");
                if (zzb.zza()) {
                    switch (zzb.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    b0(sb2, i10, "match_type", str);
                }
                if (zzb.zzb()) {
                    b0(sb2, i10, "expression", zzb.zzc());
                }
                if (zzb.zzd()) {
                    b0(sb2, i10, "case_sensitive", Boolean.valueOf(zzb.zze()));
                }
                if (zzb.zzg() > 0) {
                    V(i7 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzb.zzf()) {
                        V(i7 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                V(i10, sb2);
                sb2.append("}\n");
            }
        }
        if (zzfhVar.zzc()) {
            c0(sb2, i7 + 1, "number_filter", zzfhVar.zzd());
        }
        V(i7, sb2);
        sb2.append("}\n");
    }

    public boolean d0() {
        K();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C0646q0) this.f3094a).f11907a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public void h0(zzit zzitVar, Object obj) {
        com.google.android.gms.common.internal.G.g(obj);
        zzitVar.zzd();
        zzitVar.zzf();
        zzitVar.zzh();
        if (obj instanceof String) {
            zzitVar.zzc((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzitVar.zze(((Long) obj).longValue());
        } else {
            if (obj instanceof Double) {
                zzitVar.zzg(((Double) obj).doubleValue());
                return;
            }
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void i0(String str, E1 e12, zzib zzibVar, Y y10) {
        String str2 = e12.f11250a;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        J();
        K();
        try {
            URL url = new URI(str2).toURL();
            this.f12021b.i0();
            byte[] zzcc = zzibVar.zzcc();
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            Map map = e12.f11251b;
            if (map == null) {
                map = Collections.emptyMap();
            }
            c0640o0.V(new Z(this, str, url, zzcc, map, y10));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.c("Failed to parse URL. Not uploading MeasurementBatch. appId", W.R(str), str2);
        }
    }

    public void j0(zzhv zzhvVar, Object obj) {
        zzhvVar.zze();
        zzhvVar.zzg();
        zzhvVar.zzi();
        zzhvVar.zzm();
        if (obj instanceof String) {
            zzhvVar.zzd((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.zzf(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzhvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                zzhv zzn = zzhw.zzn();
                for (String str : bundle.keySet()) {
                    zzhv zzn2 = zzhw.zzn();
                    zzn2.zzb(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzn2.zzf(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzn2.zzd((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzn2.zzh(((Double) obj2).doubleValue());
                    }
                    zzn.zzk(zzn2);
                }
                if (zzn.zzj() > 0) {
                    arrayList.add((zzhw) zzn.zzbc());
                }
            }
        }
        zzhvVar.zzl(arrayList);
    }

    public x1 k0(String str, zzic zzicVar, zzhr zzhrVar, String str2) {
        int indexOf;
        zzql.zza();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (!c0646q0.f11910d.T(str, F.f11283P0)) {
            return null;
        }
        c0646q0.f11917y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        E e2 = F.f11352u0;
        C0615g c0615g = c0646q0.f11910d;
        String[] split = c0615g.P(str, e2).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        I1 i12 = this.f12021b;
        F1 f12 = i12.f11412x;
        C0628k0 c0628k0 = f12.f12021b.f11403a;
        I1.S(c0628k0);
        String W10 = c0628k0.W(str);
        Uri.Builder builder = new Uri.Builder();
        C0646q0 c0646q02 = (C0646q0) f12.f3094a;
        builder.scheme(c0646q02.f11910d.P(str, F.f11338n0));
        boolean isEmpty = TextUtils.isEmpty(W10);
        C0615g c0615g2 = c0646q02.f11910d;
        if (isEmpty) {
            builder.authority(c0615g2.P(str, F.f11340o0));
        } else {
            String P10 = c0615g2.P(str, F.f11340o0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(W10).length() + 1 + String.valueOf(P10).length());
            sb2.append(W10);
            sb2.append(".");
            sb2.append(P10);
            builder.authority(sb2.toString());
        }
        builder.path(c0615g2.P(str, F.f11342p0));
        W(builder, "gmp_app_id", zzicVar.zzac(), unmodifiableSet);
        c0615g.O();
        W(builder, "gmp_version", String.valueOf(130000L), unmodifiableSet);
        String zzV = zzicVar.zzV();
        E e10 = F.f11289S0;
        boolean T10 = c0615g.T(str, e10);
        C0628k0 c0628k02 = i12.f11403a;
        if (T10) {
            I1.S(c0628k02);
            if (c0628k02.c0(str)) {
                zzV = "";
            }
        }
        W(builder, "app_instance_id", zzV, unmodifiableSet);
        W(builder, "rdid", zzicVar.zzP(), unmodifiableSet);
        W(builder, "bundle_id", zzicVar.zzK(), unmodifiableSet);
        String zzk = zzhrVar.zzk();
        String g = D0.g(zzk, D0.f11237c, D0.f11235a);
        if (true != TextUtils.isEmpty(g)) {
            zzk = g;
        }
        W(builder, "app_event_name", zzk, unmodifiableSet);
        W(builder, "app_version", String.valueOf(zzicVar.zzai()), unmodifiableSet);
        String zzD = zzicVar.zzD();
        if (c0615g.T(str, e10)) {
            I1.S(c0628k02);
            if (c0628k02.b0(str) && !TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
                zzD = zzD.substring(0, indexOf);
            }
        }
        W(builder, "os_version", zzD, unmodifiableSet);
        W(builder, "timestamp", String.valueOf(zzhrVar.zzn()), unmodifiableSet);
        if (zzicVar.zzS()) {
            W(builder, "lat", "1", unmodifiableSet);
        }
        W(builder, "privacy_sandbox_version", String.valueOf(zzicVar.zzaG()), unmodifiableSet);
        W(builder, "trigger_uri_source", "1", unmodifiableSet);
        W(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
        W(builder, "request_uuid", str2, unmodifiableSet);
        List<zzhw> zza = zzhrVar.zza();
        Bundle bundle = new Bundle();
        for (zzhw zzhwVar : zza) {
            String zzb = zzhwVar.zzb();
            if (zzhwVar.zzi()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzj()));
            } else if (zzhwVar.zzg()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzh()));
            } else if (zzhwVar.zzc()) {
                bundle.putString(zzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putString(zzb, String.valueOf(zzhwVar.zzf()));
            }
        }
        Z(builder, c0615g.P(str, F.f11350t0).split("\\|"), bundle, unmodifiableSet);
        List<zziu> zzk2 = zzicVar.zzk();
        Bundle bundle2 = new Bundle();
        for (zziu zziuVar : zzk2) {
            String zzc = zziuVar.zzc();
            if (zziuVar.zzj()) {
                bundle2.putString(zzc, String.valueOf(zziuVar.zzk()));
            } else if (zziuVar.zzh()) {
                bundle2.putString(zzc, String.valueOf(zziuVar.zzi()));
            } else if (zziuVar.zzd()) {
                bundle2.putString(zzc, zziuVar.zze());
            } else if (zziuVar.zzf()) {
                bundle2.putString(zzc, String.valueOf(zziuVar.zzg()));
            }
        }
        Z(builder, c0615g.P(str, F.f11348s0).split("\\|"), bundle2, unmodifiableSet);
        W(builder, "dma", true != zzicVar.zzaC() ? "0" : "1", unmodifiableSet);
        if (!zzicVar.zzaE().isEmpty()) {
            W(builder, "dma_cps", zzicVar.zzaE(), unmodifiableSet);
        }
        if (zzicVar.zzaK()) {
            zzha zzaL = zzicVar.zzaL();
            if (!zzaL.zzb().isEmpty()) {
                W(builder, "dl_gclid", zzaL.zzb(), unmodifiableSet);
            }
            if (!zzaL.zzd().isEmpty()) {
                W(builder, "dl_gbraid", zzaL.zzd(), unmodifiableSet);
            }
            if (!zzaL.zzf().isEmpty()) {
                W(builder, "dl_gs", zzaL.zzf(), unmodifiableSet);
            }
            if (zzaL.zzh() > 0) {
                W(builder, "dl_ss_ts", String.valueOf(zzaL.zzh()), unmodifiableSet);
            }
            if (!zzaL.zzj().isEmpty()) {
                W(builder, "mr_gclid", zzaL.zzj(), unmodifiableSet);
            }
            if (!zzaL.zzm().isEmpty()) {
                W(builder, "mr_gbraid", zzaL.zzm(), unmodifiableSet);
            }
            if (!zzaL.zzo().isEmpty()) {
                W(builder, "mr_gs", zzaL.zzo(), unmodifiableSet);
            }
            if (zzaL.zzq() > 0) {
                W(builder, "mr_click_ts", String.valueOf(zzaL.zzq()), unmodifiableSet);
            }
        }
        return new x1(builder.build().toString(), currentTimeMillis, 1);
    }

    public zzhs l0(S4.k kVar) {
        zzhr zzk = zzhs.zzk();
        zzk.zzq(kVar.f9131c);
        r rVar = (r) kVar.g;
        Objects.requireNonNull(rVar);
        Bundle bundle = rVar.f11922a;
        for (String str : bundle.keySet()) {
            zzhv zzn = zzhw.zzn();
            zzn.zzb(str);
            Object obj = bundle.get(str);
            com.google.android.gms.common.internal.G.g(obj);
            j0(zzn, obj);
            zzk.zzg(zzn);
        }
        String str2 = (String) kVar.f9134f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            zzhv zzn2 = zzhw.zzn();
            zzn2.zzb("_o");
            zzn2.zzd(str2);
            zzk.zzf((zzhw) zzn2.zzbc());
        }
        return (zzhs) zzk.zzbc();
    }

    public String m0(zzib zzibVar) {
        zzhe zzat;
        if (zzibVar == null) {
            return "";
        }
        StringBuilder m10 = X.c.m("\nbatch {\n");
        if (zzibVar.zzf()) {
            b0(m10, 0, "upload_subdomain", zzibVar.zzg());
        }
        if (zzibVar.zzd()) {
            b0(m10, 0, "sgtm_join_id", zzibVar.zze());
        }
        for (zzid zzidVar : zzibVar.zza()) {
            if (zzidVar != null) {
                V(1, m10);
                m10.append("bundle {\n");
                if (zzidVar.zza()) {
                    b0(m10, 1, "protocol_version", Integer.valueOf(zzidVar.zzb()));
                }
                zzqu.zza();
                C0646q0 c0646q0 = (C0646q0) this.f3094a;
                if (c0646q0.f11910d.T(zzidVar.zzA(), F.f11277M0) && zzidVar.zzag()) {
                    b0(m10, 1, "session_stitching_token", zzidVar.zzah());
                }
                b0(m10, 1, "platform", zzidVar.zzt());
                if (zzidVar.zzC()) {
                    b0(m10, 1, "gmp_version", Long.valueOf(zzidVar.zzD()));
                }
                if (zzidVar.zzE()) {
                    b0(m10, 1, "uploading_gmp_version", Long.valueOf(zzidVar.zzF()));
                }
                if (zzidVar.zzac()) {
                    b0(m10, 1, "dynamite_version", Long.valueOf(zzidVar.zzad()));
                }
                if (zzidVar.zzW()) {
                    b0(m10, 1, "config_version", Long.valueOf(zzidVar.zzX()));
                }
                b0(m10, 1, "gmp_app_id", zzidVar.zzP());
                b0(m10, 1, "app_id", zzidVar.zzA());
                b0(m10, 1, "app_version", zzidVar.zzB());
                if (zzidVar.zzU()) {
                    b0(m10, 1, "app_version_major", Integer.valueOf(zzidVar.zzV()));
                }
                b0(m10, 1, "firebase_instance_id", zzidVar.zzT());
                if (zzidVar.zzK()) {
                    b0(m10, 1, "dev_cert_hash", Long.valueOf(zzidVar.zzL()));
                }
                b0(m10, 1, "app_store", zzidVar.zzz());
                if (zzidVar.zzi()) {
                    b0(m10, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.zzj()));
                }
                if (zzidVar.zzk()) {
                    b0(m10, 1, "start_timestamp_millis", Long.valueOf(zzidVar.zzm()));
                }
                if (zzidVar.zzn()) {
                    b0(m10, 1, "end_timestamp_millis", Long.valueOf(zzidVar.zzo()));
                }
                if (zzidVar.zzp()) {
                    b0(m10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.zzq()));
                }
                if (zzidVar.zzr()) {
                    b0(m10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.zzs()));
                }
                b0(m10, 1, "app_instance_id", zzidVar.zzJ());
                b0(m10, 1, "resettable_device_id", zzidVar.zzG());
                b0(m10, 1, "ds_id", zzidVar.zzZ());
                if (zzidVar.zzH()) {
                    b0(m10, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.zzI()));
                }
                b0(m10, 1, "os_version", zzidVar.zzu());
                b0(m10, 1, "device_model", zzidVar.zzv());
                b0(m10, 1, "user_default_language", zzidVar.zzw());
                if (zzidVar.zzx()) {
                    b0(m10, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.zzy()));
                }
                if (zzidVar.zzM()) {
                    b0(m10, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.zzN()));
                }
                if (zzidVar.zzau()) {
                    b0(m10, 1, "delivery_index", Integer.valueOf(zzidVar.zzav()));
                }
                if (zzidVar.zzQ()) {
                    b0(m10, 1, "service_upload", Boolean.valueOf(zzidVar.zzR()));
                }
                b0(m10, 1, "health_monitor", zzidVar.zzO());
                if (zzidVar.zzaa()) {
                    b0(m10, 1, "retry_counter", Integer.valueOf(zzidVar.zzab()));
                }
                if (zzidVar.zzae()) {
                    b0(m10, 1, "consent_signals", zzidVar.zzaf());
                }
                if (zzidVar.zzan()) {
                    b0(m10, 1, "is_dma_region", Boolean.valueOf(zzidVar.zzao()));
                }
                if (zzidVar.zzap()) {
                    b0(m10, 1, "core_platform_services", zzidVar.zzaq());
                }
                if (zzidVar.zzal()) {
                    b0(m10, 1, "consent_diagnostics", zzidVar.zzam());
                }
                if (zzidVar.zzai()) {
                    b0(m10, 1, "target_os_version", Long.valueOf(zzidVar.zzaj()));
                }
                zzql.zza();
                if (c0646q0.f11910d.T(zzidVar.zzA(), F.f11283P0)) {
                    b0(m10, 1, "ad_services_version", Integer.valueOf(zzidVar.zzar()));
                    if (zzidVar.zzas() && (zzat = zzidVar.zzat()) != null) {
                        V(2, m10);
                        m10.append("attribution_eligibility_status {\n");
                        b0(m10, 2, "eligible", Boolean.valueOf(zzat.zza()));
                        b0(m10, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzat.zzb()));
                        b0(m10, 2, "pre_r", Boolean.valueOf(zzat.zzc()));
                        b0(m10, 2, "r_extensions_too_old", Boolean.valueOf(zzat.zzd()));
                        b0(m10, 2, "adservices_extension_too_old", Boolean.valueOf(zzat.zze()));
                        b0(m10, 2, "ad_storage_not_allowed", Boolean.valueOf(zzat.zzf()));
                        b0(m10, 2, "measurement_manager_disabled", Boolean.valueOf(zzat.zzg()));
                        V(2, m10);
                        m10.append("}\n");
                    }
                }
                if (zzidVar.zzaw()) {
                    zzha zzax = zzidVar.zzax();
                    V(2, m10);
                    m10.append("ad_campaign_info {\n");
                    if (zzax.zza()) {
                        b0(m10, 2, "deep_link_gclid", zzax.zzb());
                    }
                    if (zzax.zzc()) {
                        b0(m10, 2, "deep_link_gbraid", zzax.zzd());
                    }
                    if (zzax.zze()) {
                        b0(m10, 2, "deep_link_gad_source", zzax.zzf());
                    }
                    if (zzax.zzg()) {
                        b0(m10, 2, "deep_link_session_millis", Long.valueOf(zzax.zzh()));
                    }
                    if (zzax.zzi()) {
                        b0(m10, 2, "market_referrer_gclid", zzax.zzj());
                    }
                    if (zzax.zzk()) {
                        b0(m10, 2, "market_referrer_gbraid", zzax.zzm());
                    }
                    if (zzax.zzn()) {
                        b0(m10, 2, "market_referrer_gad_source", zzax.zzo());
                    }
                    if (zzax.zzp()) {
                        b0(m10, 2, "market_referrer_click_millis", Long.valueOf(zzax.zzq()));
                    }
                    V(2, m10);
                    m10.append("}\n");
                }
                if (zzidVar.zzaA()) {
                    b0(m10, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.zzaB()));
                }
                if (zzidVar.zzay()) {
                    zzis zzaz = zzidVar.zzaz();
                    V(2, m10);
                    m10.append("sgtm_diagnostics {\n");
                    int zzf = zzaz.zzf();
                    b0(m10, 2, "upload_type", zzf != 1 ? zzf != 2 ? zzf != 3 ? zzf != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    b0(m10, 2, "client_upload_eligibility", zzaz.zza().name());
                    int zzg = zzaz.zzg();
                    b0(m10, 2, "service_upload_eligibility", zzg != 1 ? zzg != 2 ? zzg != 3 ? zzg != 4 ? zzg != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    V(2, m10);
                    m10.append("}\n");
                }
                if (zzidVar.zzaC()) {
                    zzho zzaD = zzidVar.zzaD();
                    V(2, m10);
                    m10.append("consent_info_extra {\n");
                    for (zzhl zzhlVar : zzaD.zza()) {
                        V(3, m10);
                        m10.append("limited_data_modes {\n");
                        int zzc = zzhlVar.zzc();
                        b0(m10, 3, "type", zzc != 1 ? zzc != 2 ? zzc != 3 ? zzc != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int zzd = zzhlVar.zzd();
                        b0(m10, 3, "mode", zzd != 1 ? zzd != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        V(3, m10);
                        m10.append("}\n");
                    }
                    V(2, m10);
                    m10.append("}\n");
                }
                List<zziu> zzf2 = zzidVar.zzf();
                Q q10 = c0646q0.f11916x;
                if (zzf2 != null) {
                    for (zziu zziuVar : zzf2) {
                        if (zziuVar != null) {
                            V(2, m10);
                            m10.append("user_property {\n");
                            b0(m10, 2, "set_timestamp_millis", zziuVar.zza() ? Long.valueOf(zziuVar.zzb()) : null);
                            b0(m10, 2, "name", q10.c(zziuVar.zzc()));
                            b0(m10, 2, "string_value", zziuVar.zze());
                            b0(m10, 2, "int_value", zziuVar.zzf() ? Long.valueOf(zziuVar.zzg()) : null);
                            b0(m10, 2, "double_value", zziuVar.zzj() ? Double.valueOf(zziuVar.zzk()) : null);
                            V(2, m10);
                            m10.append("}\n");
                        }
                    }
                }
                List<zzhg> zzS = zzidVar.zzS();
                if (zzS != null) {
                    for (zzhg zzhgVar : zzS) {
                        if (zzhgVar != null) {
                            V(2, m10);
                            m10.append("audience_membership {\n");
                            if (zzhgVar.zza()) {
                                b0(m10, 2, "audience_id", Integer.valueOf(zzhgVar.zzb()));
                            }
                            if (zzhgVar.zzf()) {
                                b0(m10, 2, "new_audience", Boolean.valueOf(zzhgVar.zzg()));
                            }
                            a0(m10, "current_data", zzhgVar.zzc());
                            if (zzhgVar.zzd()) {
                                a0(m10, "previous_data", zzhgVar.zze());
                            }
                            V(2, m10);
                            m10.append("}\n");
                        }
                    }
                }
                List<zzhs> zzc2 = zzidVar.zzc();
                if (zzc2 != null) {
                    for (zzhs zzhsVar : zzc2) {
                        if (zzhsVar != null) {
                            V(2, m10);
                            m10.append("event {\n");
                            b0(m10, 2, "name", q10.a(zzhsVar.zzd()));
                            if (zzhsVar.zze()) {
                                b0(m10, 2, "timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                            }
                            if (zzhsVar.zzg()) {
                                b0(m10, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.zzh()));
                            }
                            if (zzhsVar.zzi()) {
                                b0(m10, 2, "count", Integer.valueOf(zzhsVar.zzj()));
                            }
                            if (zzhsVar.zzb() != 0) {
                                T(m10, 2, zzhsVar.zza());
                            }
                            V(2, m10);
                            m10.append("}\n");
                        }
                    }
                }
                V(1, m10);
                m10.append("}\n");
            }
        }
        m10.append("} // End-of-batch\n");
        return m10.toString();
    }

    public String n0(zzfn zzfnVar) {
        StringBuilder m10 = X.c.m("\nproperty_filter {\n");
        if (zzfnVar.zza()) {
            b0(m10, 0, "filter_id", Integer.valueOf(zzfnVar.zzb()));
        }
        b0(m10, 0, "property_name", ((C0646q0) this.f3094a).f11916x.c(zzfnVar.zzc()));
        String X10 = X(zzfnVar.zze(), zzfnVar.zzf(), zzfnVar.zzh());
        if (!X10.isEmpty()) {
            b0(m10, 0, "filter_type", X10);
        }
        U(m10, 1, zzfnVar.zzd());
        m10.append("}\n");
        return m10.toString();
    }

    public Parcelable o0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (G5.b unused) {
                W w10 = ((C0646q0) this.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11577f.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public List s0(List list, List list2) {
        int i7;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            if (intValue < 0) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11580w.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue2 = num.intValue() / 64;
                if (intValue2 >= arrayList.size()) {
                    W w11 = c0646q0.f11912f;
                    C0646q0.l(w11);
                    w11.f11580w.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue2, Long.valueOf(((Long) arrayList.get(intValue2)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i7 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i7);
    }

    public boolean t0(long j, long j10) {
        if (j == 0 || j10 <= 0) {
            return true;
        }
        ((C0646q0) this.f3094a).f11917y.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j10;
    }

    public long u0(byte[] bArr) {
        com.google.android.gms.common.internal.G.g(bArr);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        M1 m12 = c0646q0.f11915w;
        C0646q0.j(m12);
        m12.J();
        MessageDigest a02 = M1.a0();
        if (a02 != null) {
            return M1.b0(a02.digest(bArr));
        }
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        w10.f11577f.a("Failed to get MD5");
        return 0L;
    }

    public byte[] v0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11577f.b(e2, "Failed to gzip content");
            throw e2;
        }
    }
}
