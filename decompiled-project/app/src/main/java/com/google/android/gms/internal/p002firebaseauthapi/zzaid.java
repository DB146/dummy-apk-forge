package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaid implements zzaes {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzj;
    private boolean zzh = true;
    private zzaio zzg = new zzaio();
    private zzaio zzi = new zzaio();

    public final zzaid zza(String str) {
        G.d(str);
        this.zzi.zzb().add(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza() {
        int i7;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", this.zzh);
        if (!this.zzi.zzb().isEmpty()) {
            List<String> zzb = this.zzi.zzb();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < zzb.size(); i10++) {
                jSONArray.put(zzb.get(i10));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List<String> zzb2 = this.zzg.zzb();
        int size = zzb2.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < zzb2.size(); i11++) {
            String str = zzb2.get(i11);
            str.getClass();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c10 = 0;
                    }
                    switch (c10) {
                        case 0:
                            i7 = 2;
                            break;
                        case 1:
                            i7 = 1;
                            break;
                        case 2:
                            i7 = 4;
                            break;
                        case 3:
                            i7 = 5;
                            break;
                        default:
                            i7 = 0;
                            break;
                    }
                    iArr[i11] = i7;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c10 = 1;
                    }
                    switch (c10) {
                    }
                    iArr[i11] = i7;
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c10 = 2;
                    }
                    switch (c10) {
                    }
                    iArr[i11] = i7;
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        c10 = 3;
                    }
                    switch (c10) {
                    }
                    iArr[i11] = i7;
                    break;
                default:
                    switch (c10) {
                    }
                    iArr[i11] = i7;
                    break;
            }
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i12 = 0; i12 < size; i12++) {
                jSONArray2.put(iArr[i12]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzj;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final zzaid zzb(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzaid zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzaid zzd(String str) {
        G.d(str);
        this.zza = str;
        return this;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final zzaid zze(String str) {
        G.d(str);
        this.zze = str;
        return this;
    }

    public final String zze() {
        return this.zzf;
    }

    public final zzaid zzf(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzaid zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzaid zzh(String str) {
        this.zzj = str;
        return this;
    }

    public final boolean zzi(String str) {
        G.d(str);
        return this.zzg.zzb().contains(str);
    }
}
