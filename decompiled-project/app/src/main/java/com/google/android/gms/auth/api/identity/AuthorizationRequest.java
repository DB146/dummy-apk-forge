package com.google.android.gms.auth.api.identity;

import G5.a;
import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public class AuthorizationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new C2392e(4);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14834b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14835c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14836d;

    /* renamed from: e, reason: collision with root package name */
    public final Account f14837e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14838f;

    /* renamed from: u, reason: collision with root package name */
    public final String f14839u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f14840v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f14841w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f14842x;

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z8, boolean z10, Account account, String str2, String str3, boolean z11, Bundle bundle, boolean z12) {
        boolean z13 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z13 = true;
        }
        G.a("requestedScopes cannot be null or empty", z13);
        this.f14833a = arrayList;
        this.f14834b = str;
        this.f14835c = z8;
        this.f14836d = z10;
        this.f14837e = account;
        this.f14838f = str2;
        this.f14839u = str3;
        this.f14840v = z11;
        this.f14841w = bundle;
        this.f14842x = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        ArrayList arrayList = this.f14833a;
        if (arrayList.size() == authorizationRequest.f14833a.size() && arrayList.containsAll(authorizationRequest.f14833a)) {
            Bundle bundle = this.f14841w;
            Bundle bundle2 = authorizationRequest.f14841w;
            if (bundle == null) {
                if (bundle2 == null) {
                    bundle2 = null;
                }
                return false;
            }
            if (bundle == null || bundle2 != null) {
                if (bundle != null) {
                    if (bundle.size() != bundle2.size()) {
                        return false;
                    }
                    for (String str : bundle.keySet()) {
                        if (!G.k(bundle.getString(str), bundle2.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f14835c == authorizationRequest.f14835c && this.f14840v == authorizationRequest.f14840v && this.f14836d == authorizationRequest.f14836d && this.f14842x == authorizationRequest.f14842x && G.k(this.f14834b, authorizationRequest.f14834b) && G.k(this.f14837e, authorizationRequest.f14837e) && G.k(this.f14838f, authorizationRequest.f14838f) && G.k(this.f14839u, authorizationRequest.f14839u)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f14835c);
        Boolean valueOf2 = Boolean.valueOf(this.f14840v);
        Boolean valueOf3 = Boolean.valueOf(this.f14836d);
        Boolean valueOf4 = Boolean.valueOf(this.f14842x);
        return Arrays.hashCode(new Object[]{this.f14833a, this.f14834b, valueOf, valueOf2, valueOf3, this.f14837e, this.f14838f, this.f14839u, this.f14841w, valueOf4});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.L(parcel, 1, this.f14833a, false);
        d.H(parcel, 2, this.f14834b, false);
        d.O(parcel, 3, 4);
        parcel.writeInt(this.f14835c ? 1 : 0);
        d.O(parcel, 4, 4);
        parcel.writeInt(this.f14836d ? 1 : 0);
        d.G(parcel, 5, this.f14837e, i7, false);
        d.H(parcel, 6, this.f14838f, false);
        d.H(parcel, 7, this.f14839u, false);
        d.O(parcel, 8, 4);
        parcel.writeInt(this.f14840v ? 1 : 0);
        d.z(parcel, 9, this.f14841w, false);
        d.O(parcel, 10, 4);
        parcel.writeInt(this.f14842x ? 1 : 0);
        d.N(M3, parcel);
    }
}
