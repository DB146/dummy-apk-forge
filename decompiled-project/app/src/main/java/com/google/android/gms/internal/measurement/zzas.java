package com.google.android.gms.internal.measurement;

import A3.c;
import P1.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        return c.m(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }

    public final /* synthetic */ String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0173. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0329  */
    @Override // com.google.android.gms.internal.measurement.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zzcA(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c10;
        zzas zzasVar;
        zzao zzasVar2;
        zzao zzaoVar;
        int i7;
        String str7;
        int i10;
        int i11;
        int i12;
        int i13;
        zzg zzgVar2;
        int i14;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "hasOwnProperty";
                str4 = "trim";
                if (!str4.equals(str)) {
                    throw new IllegalArgumentException(X.c.h(str, " is not a String function"));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        str5 = "charAt";
                        str6 = str3;
                        if (str.equals(str6)) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1776922004:
                        str5 = "charAt";
                        if (str.equals("toString")) {
                            c10 = 14;
                            str6 = str3;
                            break;
                        }
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1464939364:
                        str5 = "charAt";
                        if (str.equals("toLocaleLowerCase")) {
                            c10 = '\f';
                            str6 = str3;
                            break;
                        }
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1361633751:
                        str5 = "charAt";
                        if (str.equals(str5)) {
                            str6 = str3;
                            c10 = 0;
                            break;
                        }
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str5 = "charAt";
                            str6 = str3;
                            c10 = 1;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c10 = '\r';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -906336856:
                        if (str.equals("search")) {
                            c10 = 7;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c10 = 11;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c10 = 4;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case -399551817:
                        if (str.equals("toUpperCase")) {
                            c10 = 15;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 3568674:
                        if (str.equals(str4)) {
                            c10 = 16;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c10 = 5;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c10 = '\b';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c10 = '\t';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c10 = '\n';
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c10 = 6;
                            str5 = "charAt";
                            str6 = str3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            str5 = "charAt";
                            str6 = str3;
                            c10 = 3;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                    default:
                        str5 = "charAt";
                        str6 = str3;
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        zzh.zzc(str5, 1, list);
                        int zzi = !list.isEmpty() ? (int) zzh.zzi(zzgVar.zza((zzao) list.get(0)).zzd().doubleValue()) : 0;
                        String str8 = this.zza;
                        return (zzi < 0 || zzi >= str8.length()) ? zzao.zzm : new zzas(String.valueOf(str8.charAt(zzi)));
                    case 1:
                        zzasVar = this;
                        if (!list.isEmpty()) {
                            StringBuilder sb2 = new StringBuilder(zzasVar.zza);
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                sb2.append(zzgVar.zza((zzao) list.get(i15)).zzc());
                            }
                            zzasVar2 = new zzas(sb2.toString());
                            return zzasVar2;
                        }
                        return zzasVar;
                    case 2:
                        zzasVar = this;
                        zzh.zza(str6, 1, list);
                        String str9 = zzasVar.zza;
                        zzao zza = zzgVar.zza((zzao) list.get(0));
                        if ("length".equals(zza.zzc())) {
                            zzaoVar = zzao.zzk;
                        } else {
                            double doubleValue = zza.zzd().doubleValue();
                            zzaoVar = (doubleValue != Math.floor(doubleValue) || (i7 = (int) doubleValue) < 0 || i7 >= str9.length()) ? zzao.zzl : zzao.zzk;
                        }
                        return zzaoVar;
                    case 3:
                        zzasVar = this;
                        zzh.zzc("indexOf", 2, list);
                        zzasVar2 = new zzah(Double.valueOf(zzasVar.zza.indexOf(list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined", (int) zzh.zzi(list.size() >= 2 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : 0.0d))));
                        return zzasVar2;
                    case 4:
                        zzasVar = this;
                        zzh.zzc("lastIndexOf", 2, list);
                        String str10 = zzasVar.zza;
                        String zzc = list.size() > 0 ? zzgVar.zza((zzao) list.get(0)).zzc() : "undefined";
                        zzasVar2 = new zzah(Double.valueOf(str10.lastIndexOf(zzc, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zzi(r0)))));
                        return zzasVar2;
                    case 5:
                        zzasVar = this;
                        zzh.zzc("match", 1, list);
                        Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(zzasVar.zza);
                        if (matcher.find()) {
                            zzasVar2 = new zzae(Arrays.asList(new zzas(matcher.group())));
                            return zzasVar2;
                        }
                        zzaoVar = zzao.zzg;
                        return zzaoVar;
                    case 6:
                        zzasVar = this;
                        zzh.zzc("replace", 2, list);
                        zzao zzaoVar2 = zzao.zzf;
                        if (!list.isEmpty()) {
                            str7 = zzgVar.zza((zzao) list.get(0)).zzc();
                            if (list.size() > 1) {
                                zzaoVar2 = zzgVar.zza((zzao) list.get(1));
                            }
                        }
                        String str11 = str7;
                        String str12 = zzasVar.zza;
                        int indexOf = str12.indexOf(str11);
                        if (indexOf >= 0) {
                            if (zzaoVar2 instanceof zzai) {
                                i10 = 0;
                                zzaoVar2 = ((zzai) zzaoVar2).zza(zzgVar, Arrays.asList(new zzas(str11), new zzah(Double.valueOf(indexOf)), zzasVar));
                            } else {
                                i10 = 0;
                            }
                            String substring = str12.substring(i10, indexOf);
                            String zzc2 = zzaoVar2.zzc();
                            String substring2 = str12.substring(str11.length() + indexOf);
                            zzasVar2 = new zzas(c.m(new StringBuilder(String.valueOf(substring).length() + String.valueOf(zzc2).length() + String.valueOf(substring2).length()), substring, zzc2, substring2));
                            return zzasVar2;
                        }
                        return zzasVar;
                    case 7:
                        zzasVar = this;
                        zzh.zzc("search", 1, list);
                        if (Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zza((zzao) list.get(0)).zzc()).matcher(zzasVar.zza).find()) {
                            zzasVar2 = new zzah(Double.valueOf(r0.start()));
                            return zzasVar2;
                        }
                        zzaoVar = new zzah(Double.valueOf(-1.0d));
                        return zzaoVar;
                    case g.BYTES_FIELD_NUMBER /* 8 */:
                        zzasVar = this;
                        zzh.zzc("slice", 2, list);
                        String str13 = zzasVar.zza;
                        double zzi2 = zzh.zzi(!list.isEmpty() ? zzgVar.zza((zzao) list.get(0)).zzd().doubleValue() : 0.0d);
                        double max = zzi2 < 0.0d ? Math.max(str13.length() + zzi2, 0.0d) : Math.min(zzi2, str13.length());
                        double zzi3 = zzh.zzi(list.size() > 1 ? zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() : str13.length());
                        int i16 = (int) max;
                        zzasVar2 = new zzas(str13.substring(i16, Math.max(0, ((int) (zzi3 < 0.0d ? Math.max(str13.length() + zzi3, 0.0d) : Math.min(zzi3, str13.length()))) - i16) + i16));
                        return zzasVar2;
                    case '\t':
                        zzasVar = this;
                        zzh.zzc("split", 2, list);
                        String str14 = zzasVar.zza;
                        if (str14.length() == 0) {
                            zzaoVar = new zzae(Arrays.asList(zzasVar));
                        } else {
                            ArrayList arrayList = new ArrayList();
                            if (list.isEmpty()) {
                                arrayList.add(zzasVar);
                            } else {
                                String zzc3 = zzgVar.zza((zzao) list.get(0)).zzc();
                                long zzh = list.size() > 1 ? zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) : 2147483647L;
                                if (zzh == 0) {
                                    zzaoVar = new zzae();
                                } else {
                                    String[] split = str14.split(Pattern.quote(zzc3), ((int) zzh) + 1);
                                    int length = split.length;
                                    if (!zzc3.isEmpty() || length <= 0) {
                                        i11 = -1;
                                        i12 = length;
                                        i13 = 0;
                                    } else {
                                        boolean isEmpty = split[0].isEmpty();
                                        i11 = -1;
                                        i12 = length - 1;
                                        i13 = isEmpty;
                                        if (!split[i12].isEmpty()) {
                                            i12 = length;
                                            i13 = isEmpty;
                                        }
                                    }
                                    if (length > zzh) {
                                        i12 += i11;
                                    }
                                    while (i13 < i12) {
                                        arrayList.add(new zzas(split[i13]));
                                        i13++;
                                    }
                                }
                            }
                            zzaoVar = new zzae(arrayList);
                        }
                        return zzaoVar;
                    case '\n':
                        zzasVar = this;
                        zzh.zzc("substring", 2, list);
                        String str15 = zzasVar.zza;
                        if (list.isEmpty()) {
                            zzgVar2 = zzgVar;
                            i14 = 0;
                        } else {
                            zzgVar2 = zzgVar;
                            i14 = (int) zzh.zzi(zzgVar2.zza((zzao) list.get(0)).zzd().doubleValue());
                        }
                        int zzi4 = list.size() > 1 ? (int) zzh.zzi(zzgVar2.zza((zzao) list.get(1)).zzd().doubleValue()) : str15.length();
                        int min = Math.min(Math.max(i14, 0), str15.length());
                        int min2 = Math.min(Math.max(zzi4, 0), str15.length());
                        zzasVar2 = new zzas(str15.substring(Math.min(min, min2), Math.max(min, min2)));
                        return zzasVar2;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        zzasVar = this;
                        zzh.zza(str2, 0, list);
                        zzasVar2 = new zzas(zzasVar.zza.toUpperCase());
                        return zzasVar2;
                    case '\f':
                        zzasVar = this;
                        zzh.zza("toLocaleLowerCase", 0, list);
                        zzasVar2 = new zzas(zzasVar.zza.toLowerCase());
                        return zzasVar2;
                    case '\r':
                        zzasVar = this;
                        zzh.zza("toLowerCase", 0, list);
                        zzasVar2 = new zzas(zzasVar.zza.toLowerCase(Locale.ENGLISH));
                        return zzasVar2;
                    case 14:
                        zzasVar = this;
                        zzh.zza("toString", 0, list);
                        return zzasVar;
                    case 15:
                        zzasVar = this;
                        zzh.zza("toUpperCase", 0, list);
                        zzasVar2 = new zzas(zzasVar.zza.toUpperCase(Locale.ENGLISH));
                        return zzasVar2;
                    case 16:
                        zzh.zza("toUpperCase", 0, list);
                        zzasVar = this;
                        zzasVar2 = new zzas(zzasVar.zza.trim());
                        return zzasVar2;
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str3 = "hasOwnProperty";
        str4 = "trim";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        switch (c10) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzas(this.zza);
    }
}
