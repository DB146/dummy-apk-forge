package androidx.media;

import P1.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import h3.o;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f13562a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f13563b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f13564c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f13565d = -1;

    public final boolean equals(Object obj) {
        int i7;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f13563b == audioAttributesImplBase.f13563b) {
            int i10 = this.f13564c;
            int i11 = audioAttributesImplBase.f13564c;
            int i12 = audioAttributesImplBase.f13565d;
            if (i12 == -1) {
                int i13 = audioAttributesImplBase.f13562a;
                int i14 = AudioAttributesCompat.f13558b;
                if ((i11 & 1) != 1) {
                    if ((i11 & 4) != 4) {
                        switch (i13) {
                            case 2:
                                i7 = 0;
                                break;
                            case 3:
                                i7 = 8;
                                break;
                            case 4:
                                i7 = 4;
                                break;
                            case 5:
                            case 7:
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                            case 9:
                            case 10:
                                i7 = 5;
                                break;
                            case 6:
                                i7 = 2;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                i7 = 10;
                                break;
                            case 12:
                            default:
                                i7 = 3;
                                break;
                            case 13:
                                i7 = 1;
                                break;
                        }
                    } else {
                        i7 = 6;
                    }
                } else {
                    i7 = 7;
                }
            } else {
                i7 = i12;
            }
            if (i7 == 6) {
                i11 |= 4;
            } else if (i7 == 7) {
                i11 |= 1;
            }
            if (i10 == (i11 & 273) && this.f13562a == audioAttributesImplBase.f13562a && this.f13565d == i12) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f13563b), Integer.valueOf(this.f13564c), Integer.valueOf(this.f13562a), Integer.valueOf(this.f13565d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f13565d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f13565d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i7 = this.f13562a;
        int i10 = AudioAttributesCompat.f13558b;
        switch (i7) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = o.l(i7, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.f13563b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f13564c).toUpperCase());
        return sb2.toString();
    }
}
