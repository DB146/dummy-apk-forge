package n7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import ma.C1654e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v extends q {
    public static final Parcelable.Creator<v> CREATOR = new C1654e(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f21301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21302b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21303c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21304d;

    public v(long j, String str, String str2, String str3) {
        com.google.android.gms.common.internal.G.d(str);
        this.f21301a = str;
        this.f21302b = str2;
        this.f21303c = j;
        com.google.android.gms.common.internal.G.d(str3);
        this.f21304d = str3;
    }

    public static v C(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
        }
        return new v(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optString("phoneNumber"));
    }

    @Override // n7.q
    public final String t() {
        return "phone";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21301a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f21302b, false);
        com.bumptech.glide.d.O(parcel, 3, 8);
        parcel.writeLong(this.f21303c);
        com.bumptech.glide.d.H(parcel, 4, this.f21304d, false);
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // n7.q
    public final JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f21301a);
            jSONObject.putOpt("displayName", this.f21302b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f21303c));
            jSONObject.putOpt("phoneNumber", this.f21304d);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e2);
        }
    }
}
