package r8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import ma.C1654e;
import u.C2052e;
import u.T;

/* loaded from: classes.dex */
public final class n extends G5.a {
    public static final Parcelable.Creator<n> CREATOR = new C1654e(23);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f23853a;

    /* renamed from: b, reason: collision with root package name */
    public C2052e f23854b;

    public n(Bundle bundle) {
        this.f23853a = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [u.T, u.e] */
    public final Map t() {
        if (this.f23854b == null) {
            ?? t5 = new T(0);
            Bundle bundle = this.f23853a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        t5.put(str, str2);
                    }
                }
            }
            this.f23854b = t5;
        }
        return this.f23854b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.z(parcel, 2, this.f23853a, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
