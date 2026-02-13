package z5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import y5.C2392e;

/* renamed from: z5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2597b extends G5.a {
    public static final Parcelable.Creator<C2597b> CREATOR = new C2392e(10);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28282b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28283c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28284d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28285e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f28286f;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f28287u;

    public C2597b(boolean z8, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12 = true;
        if (z10 && z11) {
            z12 = false;
        }
        G.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.f28281a = z8;
        if (z8) {
            G.h(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f28282b = str;
        this.f28283c = str2;
        this.f28284d = z10;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f28286f = arrayList2;
        this.f28285e = str3;
        this.f28287u = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2597b)) {
            return false;
        }
        C2597b c2597b = (C2597b) obj;
        return this.f28281a == c2597b.f28281a && G.k(this.f28282b, c2597b.f28282b) && G.k(this.f28283c, c2597b.f28283c) && this.f28284d == c2597b.f28284d && G.k(this.f28285e, c2597b.f28285e) && G.k(this.f28286f, c2597b.f28286f) && this.f28287u == c2597b.f28287u;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f28281a);
        Boolean valueOf2 = Boolean.valueOf(this.f28284d);
        Boolean valueOf3 = Boolean.valueOf(this.f28287u);
        return Arrays.hashCode(new Object[]{valueOf, this.f28282b, this.f28283c, valueOf2, this.f28285e, this.f28286f, valueOf3});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f28281a ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 2, this.f28282b, false);
        com.bumptech.glide.d.H(parcel, 3, this.f28283c, false);
        com.bumptech.glide.d.O(parcel, 4, 4);
        parcel.writeInt(this.f28284d ? 1 : 0);
        com.bumptech.glide.d.H(parcel, 5, this.f28285e, false);
        com.bumptech.glide.d.J(parcel, 6, this.f28286f);
        com.bumptech.glide.d.O(parcel, 7, 4);
        parcel.writeInt(this.f28287u ? 1 : 0);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
