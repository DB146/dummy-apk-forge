package com.google.android.gms.fido.u2f.api.common;

import U5.a0;
import V5.c;
import V5.g;
import V5.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

@Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new a0(11);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f15135a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f15136b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f15137c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15138d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15139e;

    /* renamed from: f, reason: collision with root package name */
    public final c f15140f;

    /* renamed from: u, reason: collision with root package name */
    public final String f15141u;

    public RegisterRequestParams(Integer num, Double d10, Uri uri, ArrayList arrayList, ArrayList arrayList2, c cVar, String str) {
        this.f15135a = num;
        this.f15136b = d10;
        this.f15137c = uri;
        G.a("empty list of register requests is provided", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f15138d = arrayList;
        this.f15139e = arrayList2;
        this.f15140f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            G.a("register request has null appId and no request appId is provided", (uri == null && gVar.f10187d == null) ? false : true);
            String str2 = gVar.f10187d;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            h hVar = (h) it2.next();
            G.a("registered key has null appId and no request appId is provided", (uri == null && hVar.f10189b == null) ? false : true);
            String str3 = hVar.f10189b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        G.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f15141u = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (G.k(this.f15135a, registerRequestParams.f15135a) && G.k(this.f15136b, registerRequestParams.f15136b) && G.k(this.f15137c, registerRequestParams.f15137c) && G.k(this.f15138d, registerRequestParams.f15138d)) {
            ArrayList arrayList = this.f15139e;
            ArrayList arrayList2 = registerRequestParams.f15139e;
            if (((arrayList == null && arrayList2 == null) || (arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList))) && G.k(this.f15140f, registerRequestParams.f15140f) && G.k(this.f15141u, registerRequestParams.f15141u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15135a, this.f15137c, this.f15136b, this.f15138d, this.f15139e, this.f15140f, this.f15141u});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.E(parcel, 2, this.f15135a);
        d.B(parcel, 3, this.f15136b);
        d.G(parcel, 4, this.f15137c, i7, false);
        d.L(parcel, 5, this.f15138d, false);
        d.L(parcel, 6, this.f15139e, false);
        d.G(parcel, 7, this.f15140f, i7, false);
        d.H(parcel, 8, this.f15141u, false);
        d.N(M3, parcel);
    }
}
