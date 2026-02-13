package com.google.android.recaptcha.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.l;
import q3.f;

/* loaded from: classes.dex */
public final class zzew {
    private final HttpURLConnection zza;

    public zzew(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e2.getMessage());
        } catch (IOException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e11.getMessage());
        }
    }

    private final OutputStream zzg() {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e2.getMessage());
        } catch (IOException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e11.getMessage());
        }
    }

    public final zzoi zza(zzoi zzoiVar) {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzbd(zzbb.zzc, zzba.zzau, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzbd(zzbb.zzc, zzba.zzK, null);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzi, null);
                }
                throw new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
            InputStream zzf = zzf();
            l.e(zzf, "<this>");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, zzf.available()));
            f.i(zzf, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            l.d(byteArray, "toByteArray(...)");
            if (byteArray.length == 0) {
                throw new zzbd(zzbb.zzc, zzba.zzat, null);
            }
            try {
                Object zzb = zzoiVar.zzD().zzb(byteArray);
                l.c(zzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzoi) zzb;
            } catch (Exception e2) {
                throw new zzbd(zzbb.zzc, zzba.zzG, e2.getMessage());
            }
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e10.getMessage());
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e2.getMessage());
        } catch (IOException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e11.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) {
        try {
            zzg().write(bArr);
        } catch (zzbd e2) {
            throw e2;
        } catch (IOException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e11.getMessage());
        }
    }
}
