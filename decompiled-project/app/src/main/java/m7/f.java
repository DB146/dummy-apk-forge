package m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.appindex.zzk;
import com.google.firebase.appindexing.internal.Thing;

/* loaded from: classes.dex */
public final class f extends G5.a {
    public static final Parcelable.Creator<f> CREATOR = new C1636b(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f20757a;

    /* renamed from: b, reason: collision with root package name */
    public final Thing[] f20758b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f20759c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f20760d;

    /* renamed from: e, reason: collision with root package name */
    public final zzk f20761e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20762f;

    /* renamed from: u, reason: collision with root package name */
    public final String f20763u;

    public f(int i7, Thing[] thingArr, String[] strArr, String[] strArr2, zzk zzkVar, String str, String str2) {
        if (i7 != 0 && i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7) {
            i7 = 0;
        }
        this.f20757a = i7;
        this.f20758b = thingArr;
        this.f20759c = strArr;
        this.f20760d = strArr2;
        this.f20761e = zzkVar;
        this.f20762f = str;
        this.f20763u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f20757a);
        com.bumptech.glide.d.K(parcel, 2, this.f20758b, i7);
        com.bumptech.glide.d.I(parcel, 3, this.f20759c, false);
        com.bumptech.glide.d.I(parcel, 5, this.f20760d, false);
        com.bumptech.glide.d.G(parcel, 6, this.f20761e, i7, false);
        com.bumptech.glide.d.H(parcel, 7, this.f20762f, false);
        com.bumptech.glide.d.H(parcel, 8, this.f20763u, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
