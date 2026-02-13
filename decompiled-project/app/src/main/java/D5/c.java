package D5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C0980v;
import com.google.android.gms.common.internal.G;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final I5.a f3238c = new I5.a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f3239a;

    /* renamed from: b, reason: collision with root package name */
    public final C0980v f3240b;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.v] */
    public c(String str) {
        G.d(str);
        this.f3239a = str;
        this.f3240b = new BasePendingResult(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5.a aVar = f3238c;
        Status status = Status.f14894u;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f3239a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f14892e;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e2) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        } catch (Exception e10) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        }
        this.f3240b.setResult(status);
    }
}
