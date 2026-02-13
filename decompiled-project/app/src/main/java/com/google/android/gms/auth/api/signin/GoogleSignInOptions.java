package com.google.android.gms.auth.api.signin;

import C5.c;
import C5.d;
import G5.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends a implements e, ReflectedParcelable {

    /* renamed from: A, reason: collision with root package name */
    public static final Scope f14862A;

    /* renamed from: B, reason: collision with root package name */
    public static final Scope f14863B;

    /* renamed from: C, reason: collision with root package name */
    public static final c f14864C;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: y, reason: collision with root package name */
    public static final GoogleSignInOptions f14865y;

    /* renamed from: z, reason: collision with root package name */
    public static final Scope f14866z;

    /* renamed from: a, reason: collision with root package name */
    public final int f14867a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14868b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f14869c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14870d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14871e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14872f;

    /* renamed from: u, reason: collision with root package name */
    public final String f14873u;

    /* renamed from: v, reason: collision with root package name */
    public final String f14874v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f14875w;

    /* renamed from: x, reason: collision with root package name */
    public final String f14876x;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f14866z = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f14862A = scope3;
        f14863B = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f14863B)) {
            Scope scope4 = f14862A;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f14865y = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f14863B)) {
            Scope scope5 = f14862A;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new d(1);
        f14864C = new c(1);
    }

    public GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z8, boolean z10, boolean z11, String str, String str2, HashMap hashMap, String str3) {
        this.f14867a = i7;
        this.f14868b = arrayList;
        this.f14869c = account;
        this.f14870d = z8;
        this.f14871e = z10;
        this.f14872f = z11;
        this.f14873u = str;
        this.f14874v = str2;
        this.f14875w = new ArrayList(hashMap.values());
        this.f14876x = str3;
    }

    public static GoogleSignInOptions t(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(1, jSONArray.getString(i7)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap z(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                D5.a aVar = (D5.a) it.next();
                hashMap.put(Integer.valueOf(aVar.f3232b), aVar);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0047, code lost:
    
        if (r1.equals(r5) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        String str = this.f14873u;
        ArrayList arrayList = this.f14868b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f14868b;
            String str2 = googleSignInOptions.f14873u;
            Account account = googleSignInOptions.f14869c;
            if (this.f14875w.isEmpty() && googleSignInOptions.f14875w.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f14869c;
                if (account2 == null) {
                    if (account == null) {
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                    }
                } else if (!str.equals(str2)) {
                }
                if (this.f14872f == googleSignInOptions.f14872f && this.f14870d == googleSignInOptions.f14870d && this.f14871e == googleSignInOptions.f14871e) {
                    if (TextUtils.equals(this.f14876x, googleSignInOptions.f14876x)) {
                        return true;
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f14868b;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((Scope) arrayList2.get(i7)).f14891b);
        }
        Collections.sort(arrayList);
        int hashCode = arrayList.hashCode() + (1 * 31);
        Account account = this.f14869c;
        int hashCode2 = (hashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f14873u;
        int hashCode3 = (((((((hashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f14872f ? 1 : 0)) * 31) + (this.f14870d ? 1 : 0)) * 31) + (this.f14871e ? 1 : 0);
        String str2 = this.f14876x;
        return (hashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f14867a);
        com.bumptech.glide.d.L(parcel, 2, new ArrayList(this.f14868b), false);
        com.bumptech.glide.d.G(parcel, 3, this.f14869c, i7, false);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f14870d ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 5, 4);
        parcel.writeInt(this.f14871e ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 6, 4);
        parcel.writeInt(this.f14872f ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 7, this.f14873u, false);
        com.bumptech.glide.d.H(parcel, 8, this.f14874v, false);
        com.bumptech.glide.d.L(parcel, 9, this.f14875w, false);
        com.bumptech.glide.d.H(parcel, 10, this.f14876x, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
