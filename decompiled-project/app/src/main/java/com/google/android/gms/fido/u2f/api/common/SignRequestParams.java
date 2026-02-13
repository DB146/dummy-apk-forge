package com.google.android.gms.fido.u2f.api.common;

import U5.a0;
import V5.c;
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
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new a0(13);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f15142a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f15143b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f15144c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f15145d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15146e;

    /* renamed from: f, reason: collision with root package name */
    public final c f15147f;

    /* renamed from: u, reason: collision with root package name */
    public final String f15148u;

    public SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, ArrayList arrayList, c cVar, String str) {
        this.f15142a = num;
        this.f15143b = d10;
        this.f15144c = uri;
        this.f15145d = bArr;
        G.a("registeredKeys must not be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        this.f15146e = arrayList;
        this.f15147f = cVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            G.a("registered key has null appId and no request appId is provided", (hVar.f10189b == null && uri == null) ? false : true);
            String str2 = hVar.f10189b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        G.a("Display Hint cannot be longer than 80 characters", str == null || str.length() <= 80);
        this.f15148u = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (G.k(this.f15142a, signRequestParams.f15142a) && G.k(this.f15143b, signRequestParams.f15143b) && G.k(this.f15144c, signRequestParams.f15144c) && Arrays.equals(this.f15145d, signRequestParams.f15145d)) {
            ArrayList arrayList = this.f15146e;
            ArrayList arrayList2 = signRequestParams.f15146e;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList) && G.k(this.f15147f, signRequestParams.f15147f) && G.k(this.f15148u, signRequestParams.f15148u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(Arrays.hashCode(this.f15145d));
        return Arrays.hashCode(new Object[]{this.f15142a, this.f15144c, this.f15143b, this.f15146e, this.f15147f, this.f15148u, valueOf});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.E(parcel, 2, this.f15142a);
        d.B(parcel, 3, this.f15143b);
        d.G(parcel, 4, this.f15144c, i7, false);
        d.A(parcel, 5, this.f15145d, false);
        d.L(parcel, 6, this.f15146e, false);
        d.G(parcel, 7, this.f15147f, i7, false);
        d.H(parcel, 8, this.f15148u, false);
        d.N(M3, parcel);
    }
}
