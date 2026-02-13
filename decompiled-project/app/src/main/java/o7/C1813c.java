package o7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import n7.InterfaceC1709A;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1813c extends G5.a implements InterfaceC1709A {
    public static final Parcelable.Creator<C1813c> CREATOR = new C1812b(0);

    /* renamed from: a, reason: collision with root package name */
    public String f22060a;

    /* renamed from: b, reason: collision with root package name */
    public String f22061b;

    /* renamed from: c, reason: collision with root package name */
    public String f22062c;

    /* renamed from: d, reason: collision with root package name */
    public String f22063d;

    /* renamed from: e, reason: collision with root package name */
    public String f22064e;

    /* renamed from: f, reason: collision with root package name */
    public String f22065f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22066u;

    /* renamed from: v, reason: collision with root package name */
    public String f22067v;

    public C1813c(String str, String str2, String str3, String str4, String str5, String str6, boolean z8, String str7) {
        this.f22060a = str;
        this.f22061b = str2;
        this.f22064e = str3;
        this.f22065f = str4;
        this.f22062c = str5;
        this.f22063d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.f22066u = z8;
        this.f22067v = str7;
    }

    public static C1813c t(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C1813c(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzaag(e2);
        }
    }

    @Override // n7.InterfaceC1709A
    public final String b() {
        return this.f22061b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f22060a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f22061b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f22062c, false);
        com.bumptech.glide.d.H(parcel, 4, this.f22063d, false);
        com.bumptech.glide.d.H(parcel, 5, this.f22064e, false);
        com.bumptech.glide.d.H(parcel, 6, this.f22065f, false);
        com.bumptech.glide.d.O(parcel, 7, 4);
        parcel.writeInt(this.f22066u ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 8, this.f22067v, false);
        com.bumptech.glide.d.N(M3, parcel);
    }

    public final String z() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f22060a);
            jSONObject.putOpt("providerId", this.f22061b);
            jSONObject.putOpt("displayName", this.f22062c);
            jSONObject.putOpt("photoUrl", this.f22063d);
            jSONObject.putOpt("email", this.f22064e);
            jSONObject.putOpt("phoneNumber", this.f22065f);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f22066u));
            jSONObject.putOpt("rawUserInfo", this.f22067v);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzaag(e2);
        }
    }
}
