package n7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import ma.C1654e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y extends q {
    public static final Parcelable.Creator<y> CREATOR = new C1654e(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f21306a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21307b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21308c;

    /* renamed from: d, reason: collision with root package name */
    public final zzair f21309d;

    public y(String str, String str2, long j, zzair zzairVar) {
        com.google.android.gms.common.internal.G.d(str);
        this.f21306a = str;
        this.f21307b = str2;
        this.f21308c = j;
        com.google.android.gms.common.internal.G.h(zzairVar, "totpInfo cannot be null.");
        this.f21309d = zzairVar;
    }

    public static y C(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long optLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new y(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzair());
    }

    @Override // n7.q
    public final String t() {
        return "totp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21306a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f21307b, false);
        com.bumptech.glide.d.O(parcel, 3, 8);
        parcel.writeLong(this.f21308c);
        com.bumptech.glide.d.G(parcel, 4, this.f21309d, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }

    @Override // n7.q
    public final JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f21306a);
            jSONObject.putOpt("displayName", this.f21307b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f21308c));
            jSONObject.putOpt("totpInfo", this.f21309d);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzaag(e2);
        }
    }
}
