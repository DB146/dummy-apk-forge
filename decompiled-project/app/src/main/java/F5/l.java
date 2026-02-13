package F5;

import com.google.android.gms.common.internal.G;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f4115c;

    public /* synthetic */ l(boolean z8, String str, o oVar) {
        this.f4113a = z8;
        this.f4114b = str;
        this.f4115c = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        o oVar = this.f4115c;
        int i7 = 0;
        boolean z8 = this.f4113a;
        String str = this.f4114b;
        String str2 = (z8 || !q.a(str, oVar, true, false).f4144a) ? "not allowed" : "debug cert rejected";
        while (true) {
            if (i7 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i7++;
        }
        G.g(messageDigest);
        return str2 + ": pkg=" + str + ", sha256=" + M5.c.a(messageDigest.digest(oVar.f4121c)) + ", atk=" + z8 + ", ver=12451000.false";
    }
}
