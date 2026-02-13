package V5;

import U5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends G5.a {
    public static final Parcelable.Creator<h> CREATOR = new a0(12);

    /* renamed from: a, reason: collision with root package name */
    public final d f10188a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10189b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10190c;

    public h(d dVar, String str, String str2) {
        G.g(dVar);
        this.f10188a = dVar;
        this.f10190c = str;
        this.f10189b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f10190c;
        if (str == null) {
            if (hVar.f10190c != null) {
                return false;
            }
        } else if (!str.equals(hVar.f10190c)) {
            return false;
        }
        if (!this.f10188a.equals(hVar.f10188a)) {
            return false;
        }
        String str2 = hVar.f10189b;
        String str3 = this.f10189b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f10190c;
        int hashCode = this.f10188a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.f10189b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        d dVar = this.f10188a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(dVar.f10178b, 11));
            f fVar = dVar.f10179c;
            if (fVar != f.UNKNOWN) {
                jSONObject.put("version", fVar.f10183a);
            }
            ArrayList arrayList = dVar.f10180d;
            if (arrayList != null) {
                jSONObject.put("transports", arrayList.toString());
            }
            String str = this.f10190c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f10189b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = com.bumptech.glide.d.M(20293, parcel);
        com.bumptech.glide.d.G(parcel, 2, this.f10188a, i7, false);
        com.bumptech.glide.d.H(parcel, 3, this.f10190c, false);
        com.bumptech.glide.d.H(parcel, 4, this.f10189b, false);
        com.bumptech.glide.d.N(M3, parcel);
    }
}
