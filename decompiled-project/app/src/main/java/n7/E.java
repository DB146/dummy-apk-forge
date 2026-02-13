package n7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.internal.p002firebaseauthapi.zzam;
import java.util.ArrayList;
import ma.C1654e;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class E extends G5.a {
    public static final Parcelable.Creator<E> CREATOR = new C1654e(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f21254a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21255b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21256c;

    public E(String str, String str2, String str3) {
        this.f21254a = str;
        this.f21255b = str2;
        this.f21256c = str3;
    }

    public static zzaj t(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaj.zza(new ArrayList());
        }
        zzam zzg = zzaj.zzg();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            zzg.zza(new E(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    public static final E z(JSONObject jSONObject) {
        return new E(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f21254a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f21255b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f21256c, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
