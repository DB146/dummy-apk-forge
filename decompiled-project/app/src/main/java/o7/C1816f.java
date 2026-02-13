package o7;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1816f implements G5.c {
    public static final Parcelable.Creator<C1816f> CREATOR = new C1812b(2);

    /* renamed from: a, reason: collision with root package name */
    public final long f22081a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22082b;

    public C1816f(long j, long j10) {
        this.f22081a = j;
        this.f22082b = j10;
    }

    public static C1816f a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C1816f(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 8);
        parcel.writeLong(this.f22081a);
        com.bumptech.glide.d.O(parcel, 2, 8);
        parcel.writeLong(this.f22082b);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
