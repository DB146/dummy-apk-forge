package com.google.android.gms.internal.p002firebaseauthapi;

import P1.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;

/* loaded from: classes.dex */
final class zzanh {
    public static String zza(zzajp zzajpVar) {
        zzang zzangVar = new zzang(zzajpVar);
        StringBuilder sb2 = new StringBuilder(zzangVar.zza());
        for (int i7 = 0; i7 < zzangVar.zza(); i7++) {
            byte zza = zzangVar.zza(i7);
            if (zza == 34) {
                sb2.append("\\\"");
            } else if (zza == 39) {
                sb2.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case g.BYTES_FIELD_NUMBER /* 8 */:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 11 */:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (zza < 32 || zza > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((zza >>> 6) & 3) + 48));
                            sb2.append((char) (((zza >>> 3) & 7) + 48));
                            sb2.append((char) ((zza & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) zza);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
