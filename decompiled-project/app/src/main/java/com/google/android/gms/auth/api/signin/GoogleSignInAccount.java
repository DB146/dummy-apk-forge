package com.google.android.gms.auth.api.signin;

import C5.d;
import G5.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d(0);

    /* renamed from: A, reason: collision with root package name */
    public final HashSet f14849A = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final int f14850a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14851b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14852c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14853d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14854e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f14855f;

    /* renamed from: u, reason: collision with root package name */
    public String f14856u;

    /* renamed from: v, reason: collision with root package name */
    public final long f14857v;

    /* renamed from: w, reason: collision with root package name */
    public final String f14858w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f14859x;

    /* renamed from: y, reason: collision with root package name */
    public final String f14860y;

    /* renamed from: z, reason: collision with root package name */
    public final String f14861z;

    public GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f14850a = i7;
        this.f14851b = str;
        this.f14852c = str2;
        this.f14853d = str3;
        this.f14854e = str4;
        this.f14855f = uri;
        this.f14856u = str5;
        this.f14857v = j;
        this.f14858w = str6;
        this.f14859x = arrayList;
        this.f14860y = str7;
        this.f14861z = str8;
    }

    public static GoogleSignInAccount t(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(1, jSONArray.getString(i7)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        G.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f14856u = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f14858w.equals(this.f14858w)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f14859x);
            hashSet.addAll(googleSignInAccount.f14849A);
            HashSet hashSet2 = new HashSet(this.f14859x);
            hashSet2.addAll(this.f14849A);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14858w.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f14859x);
        hashSet.addAll(this.f14849A);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f14850a);
        com.bumptech.glide.d.H(parcel, 2, this.f14851b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f14852c, false);
        com.bumptech.glide.d.H(parcel, 4, this.f14853d, false);
        com.bumptech.glide.d.H(parcel, 5, this.f14854e, false);
        com.bumptech.glide.d.G(parcel, 6, this.f14855f, i7, false);
        com.bumptech.glide.d.H(parcel, 7, this.f14856u, false);
        com.bumptech.glide.d.O(parcel, 8, 8);
        parcel.writeLong(this.f14857v);
        com.bumptech.glide.d.H(parcel, 9, this.f14858w, false);
        com.bumptech.glide.d.L(parcel, 10, this.f14859x, false);
        com.bumptech.glide.d.H(parcel, 11, this.f14860y, false);
        com.bumptech.glide.d.H(parcel, 12, this.f14861z, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
