package l8;

import Y6.i;
import Y6.m;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: l8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1514c {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f19606c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f19607a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19608b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1514c(i iVar) {
        iVar.b();
        this.f19607a = iVar.f12041a.getSharedPreferences("com.google.android.gms.appid", 0);
        iVar.b();
        m mVar = iVar.f12043c;
        String str = mVar.f12058e;
        if (str == null) {
            iVar.b();
            str = mVar.f12055b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] split = str.split(":");
                if (split.length == 4) {
                    str = split[1];
                }
                str = null;
            }
        }
        this.f19608b = str;
    }

    public final String a() {
        PublicKey publicKey;
        synchronized (this.f19607a) {
            String str = null;
            String string = this.f19607a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
                Log.w("ContentValues", "Invalid key stored " + e2);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
