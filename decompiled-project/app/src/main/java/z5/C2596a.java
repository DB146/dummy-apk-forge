package z5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import java.util.Arrays;
import y5.C2392e;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2596a extends G5.a {
    public static final Parcelable.Creator<C2596a> CREATOR = new C2392e(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f28275a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28276b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28277c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f28278d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f28279e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f28280f;

    public C2596a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f28275a = str;
        this.f28276b = str2;
        this.f28277c = str3;
        G.g(arrayList);
        this.f28278d = arrayList;
        this.f28280f = pendingIntent;
        this.f28279e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2596a)) {
            return false;
        }
        C2596a c2596a = (C2596a) obj;
        return G.k(this.f28275a, c2596a.f28275a) && G.k(this.f28276b, c2596a.f28276b) && G.k(this.f28277c, c2596a.f28277c) && G.k(this.f28278d, c2596a.f28278d) && G.k(this.f28280f, c2596a.f28280f) && G.k(this.f28279e, c2596a.f28279e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28275a, this.f28276b, this.f28277c, this.f28278d, this.f28280f, this.f28279e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.H(parcel, 1, this.f28275a, false);
        com.bumptech.glide.d.H(parcel, 2, this.f28276b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f28277c, false);
        com.bumptech.glide.d.J(parcel, 4, this.f28278d);
        com.bumptech.glide.d.G(parcel, 5, this.f28279e, i7, false);
        com.bumptech.glide.d.G(parcel, 6, this.f28280f, i7, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
