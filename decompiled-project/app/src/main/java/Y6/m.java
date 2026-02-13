package Y6;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.G;
import java.util.Arrays;
import q3.s;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f12054a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12055b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12056c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12057d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12058e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12059f;
    public final String g;

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i7 = M5.e.f6790a;
        G.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f12055b = str;
        this.f12054a = str2;
        this.f12056c = str3;
        this.f12057d = str4;
        this.f12058e = str5;
        this.f12059f = str6;
        this.g = str7;
    }

    public static m a(Context context) {
        q3.c cVar = new q3.c(context);
        String o10 = cVar.o("google_app_id");
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        return new m(o10, cVar.o("google_api_key"), cVar.o("firebase_database_url"), cVar.o("ga_trackingId"), cVar.o("gcm_defaultSenderId"), cVar.o("google_storage_bucket"), cVar.o("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return G.k(this.f12055b, mVar.f12055b) && G.k(this.f12054a, mVar.f12054a) && G.k(this.f12056c, mVar.f12056c) && G.k(this.f12057d, mVar.f12057d) && G.k(this.f12058e, mVar.f12058e) && G.k(this.f12059f, mVar.f12059f) && G.k(this.g, mVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12055b, this.f12054a, this.f12056c, this.f12057d, this.f12058e, this.f12059f, this.g});
    }

    public final String toString() {
        s sVar = new s(this);
        sVar.f(this.f12055b, "applicationId");
        sVar.f(this.f12054a, "apiKey");
        sVar.f(this.f12056c, "databaseUrl");
        sVar.f(this.f12058e, "gcmSenderId");
        sVar.f(this.f12059f, "storageBucket");
        sVar.f(this.g, "projectId");
        return sVar.toString();
    }
}
