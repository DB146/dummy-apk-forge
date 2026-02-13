package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzafm {
    public static void zza(String str, zzaes zzaesVar, zzafn<?> zzafnVar, Type type, zzaew zzaewVar) {
        try {
            G.g(zzaesVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaesVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaewVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzafnVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            zzafnVar.zza("TIMEOUT");
        } catch (IOException e2) {
            e = e2;
            zzafnVar.zza(e.getMessage());
        } catch (NullPointerException e10) {
            e = e10;
            zzafnVar.zza(e.getMessage());
        } catch (UnknownHostException unused2) {
            zzafnVar.zza("<<Network Error>>");
        } catch (JSONException e11) {
            e = e11;
            zzafnVar.zza(e.getMessage());
        }
    }

    public static void zza(String str, zzafn<?> zzafnVar, Type type, zzaew zzaewVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaewVar.zza(httpURLConnection);
            zza(httpURLConnection, zzafnVar, type);
        } catch (SocketTimeoutException unused) {
            zzafnVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzafnVar.zza("<<Network Error>>");
        } catch (IOException e2) {
            zzafnVar.zza(e2.getMessage());
        }
    }

    private static void zza(HttpURLConnection httpURLConnection, zzafn<?> zzafnVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb2.append(readLine);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (zza(responseCode)) {
                    zzafnVar.zza((zzafn<?>) zzaep.zza(sb3, type));
                } else {
                    zzafnVar.zza((String) zzaep.zza(sb3, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzaci e2) {
                e = e2;
                zzafnVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzafnVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e10) {
                e = e10;
                zzafnVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    private static final boolean zza(int i7) {
        return i7 >= 200 && i7 < 300;
    }
}
