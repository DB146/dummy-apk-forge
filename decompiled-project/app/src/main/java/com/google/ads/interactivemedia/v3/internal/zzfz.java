package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
final class zzfz implements zzga {
    private zzfz() {
    }

    public /* synthetic */ zzfz(zzfy zzfyVar) {
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00a8: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:59:0x00a8 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    @Override // com.google.ads.interactivemedia.v3.internal.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.ads.interactivemedia.v3.impl.data.zzbj zza(NetworkRequestData networkRequestData) {
        HttpURLConnection httpURLConnection;
        IOException e2;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(networkRequestData.url()).openConnection();
                try {
                    httpURLConnection.setRequestProperty("User-Agent", networkRequestData.userAgent());
                    httpURLConnection.setConnectTimeout(networkRequestData.connectionTimeoutMs());
                    httpURLConnection.setReadTimeout(networkRequestData.readTimeoutMs());
                    if (networkRequestData.requestType() == NetworkRequestData.RequestType.POST) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setChunkedStreamingMode(0);
                        String content = networkRequestData.content();
                        if (content != null) {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                outputStream.write(content.getBytes(StandardCharsets.UTF_8));
                                outputStream.close();
                            } catch (Throwable th) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                        StringBuilder sb2 = new StringBuilder();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, StandardCharsets.UTF_8));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                        }
                        String sb3 = sb2.toString();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        String contentType = httpURLConnection.getContentType();
                        httpURLConnection.disconnect();
                        return com.google.ads.interactivemedia.v3.impl.data.zzbj.forResponse(networkRequestData.id(), sb3, contentType);
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            }
                        }
                        throw th3;
                    }
                } catch (IOException e10) {
                    e2 = e10;
                    if (e2 instanceof SocketTimeoutException) {
                        com.google.ads.interactivemedia.v3.impl.data.zzbj forError = com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), 101);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return forError;
                    }
                    com.google.ads.interactivemedia.v3.impl.data.zzbj forError2 = com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), 100);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return forError2;
                }
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection3 = httpURLConnection2;
                if (httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                throw th;
            }
        } catch (IOException e11) {
            httpURLConnection = null;
            e2 = e11;
        } catch (Throwable th6) {
            th = th6;
            if (httpURLConnection3 != null) {
            }
            throw th;
        }
    }
}
