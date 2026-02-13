package com.google.android.gms.auth.api.identity;

import G5.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import y5.C2392e;

/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new C2392e(14);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f14843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14844b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14845c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14846d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14847e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14848f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i7) {
        this.f14843a = pendingIntent;
        this.f14844b = str;
        this.f14845c = str2;
        this.f14846d = arrayList;
        this.f14847e = str3;
        this.f14848f = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        ArrayList arrayList = this.f14846d;
        return arrayList.size() == saveAccountLinkingTokenRequest.f14846d.size() && arrayList.containsAll(saveAccountLinkingTokenRequest.f14846d) && G.k(this.f14843a, saveAccountLinkingTokenRequest.f14843a) && G.k(this.f14844b, saveAccountLinkingTokenRequest.f14844b) && G.k(this.f14845c, saveAccountLinkingTokenRequest.f14845c) && G.k(this.f14847e, saveAccountLinkingTokenRequest.f14847e) && this.f14848f == saveAccountLinkingTokenRequest.f14848f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14843a, this.f14844b, this.f14845c, this.f14846d, this.f14847e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.G(parcel, 1, this.f14843a, i7, false);
        d.H(parcel, 2, this.f14844b, false);
        d.H(parcel, 3, this.f14845c, false);
        d.J(parcel, 4, this.f14846d);
        d.H(parcel, 5, this.f14847e, false);
        d.O(parcel, 6, 4);
        parcel.writeInt(this.f14848f);
        d.N(M3, parcel);
    }
}
