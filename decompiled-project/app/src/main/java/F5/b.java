package F5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends G5.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4087a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4088b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f4089c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4090d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f4086e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new B5.c(5);

    public b(int i7) {
        this(1, i7, null, null);
    }

    public b(int i7, int i10, PendingIntent pendingIntent, String str) {
        this.f4087a = i7;
        this.f4088b = i10;
        this.f4089c = pendingIntent;
        this.f4090d = str;
    }

    public b(int i7, PendingIntent pendingIntent) {
        this(1, i7, pendingIntent, null);
    }

    public static String t(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case BlurFactor.DEFAULT_RADIUS /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return A3.c.f(i7, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4088b == bVar.f4088b && G.k(this.f4089c, bVar.f4089c) && G.k(this.f4090d, bVar.f4090d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4088b), this.f4089c, this.f4090d});
    }

    public final String toString() {
        q3.s sVar = new q3.s(this);
        sVar.f(t(this.f4088b), "statusCode");
        sVar.f(this.f4089c, "resolution");
        sVar.f(this.f4090d, "message");
        return sVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f4087a);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f4088b);
        com.bumptech.glide.d.G(parcel, 3, this.f4089c, i7, false);
        com.bumptech.glide.d.H(parcel, 4, this.f4090d, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
