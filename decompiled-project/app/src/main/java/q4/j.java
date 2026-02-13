package q4;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23469a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a5.f fVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f23470b = fVar;
    }

    public j(HashMap hashMap) {
        this.f23470b = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f23469a) {
            case 0:
                a5.f fVar = (a5.f) this.f23470b;
                fVar.getClass();
                do {
                    try {
                    } catch (InterruptedException e2) {
                        throw new IllegalStateException(e2);
                    }
                } while (fVar.d());
                return;
            default:
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                HashMap hashMap = (HashMap) this.f23470b;
                for (String str : hashMap.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    try {
                        zzi.zzb(263);
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                                sb2.append("Received non-success response code ");
                                sb2.append(responseCode);
                                sb2.append(" from pinging URL: ");
                                sb2.append(uri);
                                Log.w("HttpUrlPinger", sb2.toString());
                            }
                        } finally {
                            httpURLConnection.disconnect();
                        }
                    } finally {
                        zzi.zza();
                    }
                } catch (IOException e10) {
                    e = e10;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
                    sb3.append("Error while pinging URL: ");
                    sb3.append(uri);
                    sb3.append(". ");
                    sb3.append(message);
                    Log.w("HttpUrlPinger", sb3.toString(), e);
                } catch (IndexOutOfBoundsException e11) {
                    String message2 = e11.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message2).length());
                    sb4.append("Error while parsing ping URL: ");
                    sb4.append(uri);
                    sb4.append(". ");
                    sb4.append(message2);
                    Log.w("HttpUrlPinger", sb4.toString(), e11);
                } catch (RuntimeException e12) {
                    e = e12;
                    String message3 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message3).length());
                    sb32.append("Error while pinging URL: ");
                    sb32.append(uri);
                    sb32.append(". ");
                    sb32.append(message3);
                    Log.w("HttpUrlPinger", sb32.toString(), e);
                }
                return;
        }
    }
}
