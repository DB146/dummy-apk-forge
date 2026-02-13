package m7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.appindex.zzat;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends G5.a {
    public static final Parcelable.Creator<h> CREATOR = new C1636b(1);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20766b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20767c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f20768d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f20769e;

    public h(boolean z8, int i7, String str, Bundle bundle, Bundle bundle2) {
        this.f20765a = z8;
        this.f20766b = i7;
        this.f20767c = str;
        this.f20768d = bundle == null ? new Bundle() : bundle;
        this.f20769e = bundle2;
        ClassLoader classLoader = h.class.getClassLoader();
        zzat.zza(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return G.k(Boolean.valueOf(this.f20765a), Boolean.valueOf(hVar.f20765a)) && G.k(Integer.valueOf(this.f20766b), Integer.valueOf(hVar.f20766b)) && G.k(this.f20767c, hVar.f20767c) && Thing.C(this.f20768d, hVar.f20768d) && Thing.C(this.f20769e, hVar.f20769e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f20765a), Integer.valueOf(this.f20766b), this.f20767c, Integer.valueOf(Thing.t(this.f20768d)), Integer.valueOf(Thing.t(this.f20769e))});
    }

    public final String toString() {
        StringBuilder m10 = X.c.m("worksOffline: ");
        m10.append(this.f20765a);
        m10.append(", score: ");
        m10.append(this.f20766b);
        String str = this.f20767c;
        if (!str.isEmpty()) {
            m10.append(", accountEmail: ");
            m10.append(str);
        }
        Bundle bundle = this.f20768d;
        if (bundle != null && !bundle.isEmpty()) {
            m10.append(", Properties { ");
            Thing.z(bundle, m10);
            m10.append("}");
        }
        Bundle bundle2 = this.f20769e;
        if (!bundle2.isEmpty()) {
            m10.append(", embeddingProperties { ");
            Thing.z(bundle2, m10);
            m10.append("}");
        }
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.O(parcel, 1, 4);
        parcel.writeInt(this.f20765a ? 1 : 0);
        com.bumptech.glide.d.O(parcel, 2, 4);
        parcel.writeInt(this.f20766b);
        com.bumptech.glide.d.H(parcel, 3, this.f20767c, false);
        com.bumptech.glide.d.z(parcel, 4, this.f20768d, false);
        com.bumptech.glide.d.z(parcel, 5, this.f20769e, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
